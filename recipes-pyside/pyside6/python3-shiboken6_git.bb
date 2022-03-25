SUMMARY = "Shiboken6"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE.GPLv3;md5=88e2b9117e6be406b5ed6ee4ca99a705"

require python3-pyside6.inc

DEPENDS += "clang python3-shiboken6-native"

S = "${WORKDIR}/git"
OECMAKE_SOURCEPATH = "${S}/sources/shiboken6"

EXTRA_OECMAKE += "-DBUILD_TESTS=FALSE -DQ_CC_CLANG=TRUE -DCMAKE_CXX_COMPILER=arm-core-linux-gnueabi-g++ "
EXTRA_OECMAKE:append:class-target = "-DQFP_SHIBOKEN_HOST_PATH=${STAGING_BINDIR_NATIVE}/shiboken6 -DQFP_PYTHON_HOST_PATH=${PYTHON}"

BBCLASSEXTEND = "native"
