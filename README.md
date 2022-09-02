# GarbageCollector

WebCTRL is a trademark of Automated Logic Corporation. Any other trademarks mentioned herein are the property of their respective owners.

## About

This WebCTRL add-on [(download link)](https://github.com/automatic-controls/garbage-collect-addon/releases/latest/download/GarbageCollector.addon) invokes `System.gc()` every 5 minutes. Essentially, this hints that the JVM should run its garbage collector, freeing any excess memory. In some cases, this may improve performance of a WebCTRL server. If your WebCTRL server requires signed add-ons, download [*ACES.cer*](https://github.com/automatic-controls/addon-dev-script/blob/main/ACES.cer?raw=true) for authentication.