SUMMARY = "PECI PCIe"
DESCRIPTION = "Gathers PCIe information using PECI \
and provides it on D-Bus"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7becf906c8f8d03c237bad13bc3dac53"
DEPENDS = "boost sdbusplus libpeci"
SRCREV = "8b18f526772c96c785a62e3a811eacf24d3b637f"
PV = "0.1+git${SRCPV}"

SRC_URI = "git://github.com/openbmc/peci-pcie;branch=master;protocol=https"

S = "${WORKDIR}/git"
SYSTEMD_SERVICE:${PN} += "xyz.openbmc_project.PCIe.service"

inherit cmake pkgconfig systemd

EXTRA_OECMAKE = "-DYOCTO=1"
