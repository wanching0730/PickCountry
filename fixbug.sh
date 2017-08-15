#!/bin/bash
# fail if any commands fails
set -e
# debug log
set -x

rsync -avhP ./android-license/ "$ANDROID_HOME/licenses/"
