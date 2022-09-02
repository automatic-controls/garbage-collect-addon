# GarbageCollector

WebCTRL is a trademark of Automated Logic Corporation. Any other trademarks mentioned herein are the property of their respective owners.

## About

This WebCTRL add-on invokes `System.gc()` every 5 minutes. Essentially, this hints that the JVM should run its garbage collector, freeing any excess memory. In some cases, this should improve performance of a WebCTRL server.