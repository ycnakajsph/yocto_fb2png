DESCRIPTION = "Save Linux frambuffer (/dev/fb0) to a PNG image file"
DEPENDS = "libpng"

inherit autotools-brokensep

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=52962875ab02c36df6cde47b1f463024"

SRCREV="85df73c6f73f6dc1d89f4ede0eb0dfefd065db62"
SRC_URI = "git://github.com/AndrewFromMelbourne/fb2png.git;protocol=http \
    file://0001-simplify-makefile.patch"

S = "${WORKDIR}/git"

do_install() {
    install -d ${D}/${bindir}/
    install -m 0755 -D fb2png ${D}/${bindir}/
}
