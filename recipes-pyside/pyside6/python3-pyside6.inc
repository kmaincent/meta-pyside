DESCRIPTION = "blabla"
HOMEPAGE = "https://wiki.qt.io/Qt_for_Python"

SRC_URI = "git://github.com/qtproject/pyside-pyside-setup.git;branch=dev;protocol=https;"

SRCREV = "606f2280e3e8531619c9c2d79539b6e50a5a37dd"
# SRC_URI[md5sum] = "75746086e312f91231f984bdffef98d2"
# SRC_URI[sha256sum] = "70a74c7c7c9e5af46cae5b1943bc39a1399c4332b342d2c48103a1cfe99891a8"

DEPENDS += "${PYTHON_PN}-native ${PYTHON_PN}-packaging-native qtbase qtbase-native"

inherit setuptools3 cmake qt6-cmake
