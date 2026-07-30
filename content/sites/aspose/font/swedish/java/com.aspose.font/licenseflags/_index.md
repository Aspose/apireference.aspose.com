---
title: "Licensflaggor"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar ett hjälparomslag för inbäddningsflaggor från OS/2-tabellfältet fsType."
type: docs
weight: 59
url: /sv/java/com.aspose.font/licenseflags/
---
**Inheritance:**
java.lang.Object
```
public class LicenseFlags
```

Representerar en hjälparwrapper för inbäddningsflaggor från 'OS/2'-tabellen (fältet fsType).
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFSType()](#getFSType--) | Hämtar rått fsType-värde från OS/2-tabellen eller 0 om detta fält inte finns i tabellen. |
| [hashCode()](#hashCode--) |  |
| [isBitmapOnlyEmbedding()](#isBitmapOnlyEmbedding--) | Detekterar om fsType tillåter BitmapOnly-inbäddning. |
| [isEditableEmbedding()](#isEditableEmbedding--) | Detekterar om fsType tillåter Editable-inbäddning. |
| [isFSTypeAbsent()](#isFSTypeAbsent--) | Returnerar true om fsType-flaggan saknas i 'OS/2'-tabellen. |
| [isInstallableEmbedding()](#isInstallableEmbedding--) | Detekterar om fsType är Installable-inbäddning. |
| [isNoSubsettingEmbedding()](#isNoSubsettingEmbedding--) | Detekterar om fsType tillåter NoSubsetting-inbäddning. |
| [isPreviewAndPrintEmbedding()](#isPreviewAndPrintEmbedding--) | Detekterar om fsType tillåter Preview and Print-inbäddning. |
| [isReservedType()](#isReservedType--) | Detekterar om reserverad bit (bit 0) är satt för fsType. |
| [isRestrictedLicenseEmbedding()](#isRestrictedLicenseEmbedding--) | Detekterar om fsType är Restricted License-inbäddning. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getFSType() {#getFSType--}
```
public int getFSType()
```


Hämtar rått fsType-värde från OS/2-tabellen eller 0 om detta fält inte finns i tabellen.

**Returns:**
int - Rått fsType-värde från OS/2-tabellen eller 0 om detta fält inte finns i tabellen.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isBitmapOnlyEmbedding() {#isBitmapOnlyEmbedding--}
```
public boolean isBitmapOnlyEmbedding()
```


Detekterar om fsType tillåter BitmapOnly-inbäddning.

**Returns:**
boolean - Detekterar om fsType tillåter BitmapOnly-inbäddning.
### isEditableEmbedding() {#isEditableEmbedding--}
```
public boolean isEditableEmbedding()
```


Detekterar om fsType tillåter Editable-inbäddning.

**Returns:**
boolean - Detekterar om fsType tillåter redigerbar inbäddning.
### isFSTypeAbsent() {#isFSTypeAbsent--}
```
public boolean isFSTypeAbsent()
```


Returnerar true om fsType-flaggan saknas i 'OS/2'-tabellen.

**Returns:**
boolean - Sant om fsType-flaggan saknas i 'OS/2'-tabellen.
### isInstallableEmbedding() {#isInstallableEmbedding--}
```
public boolean isInstallableEmbedding()
```


Detekterar om fsType är Installable-inbäddning.

**Returns:**
boolean - Detekterar om fsType är installerbar inbäddning.
### isNoSubsettingEmbedding() {#isNoSubsettingEmbedding--}
```
public boolean isNoSubsettingEmbedding()
```


Detekterar om fsType tillåter NoSubsetting-inbäddning.

**Returns:**
boolean - Detekterar om fsType tillåter inbäddning utan delmängdsindelning.
### isPreviewAndPrintEmbedding() {#isPreviewAndPrintEmbedding--}
```
public boolean isPreviewAndPrintEmbedding()
```


Detekterar om fsType tillåter Preview and Print-inbäddning.

**Returns:**
boolean - Detekterar om fsType tillåter förhandsgranskning och utskriftsinbäddning.
### isReservedType() {#isReservedType--}
```
public boolean isReservedType()
```


Detekterar om reserverad bit (bit 0) är satt för fsType.

**Returns:**
boolean - Detekterar om reserverad bit (bit 0) är satt för fsType.
### isRestrictedLicenseEmbedding() {#isRestrictedLicenseEmbedding--}
```
public boolean isRestrictedLicenseEmbedding()
```


Detekterar om fsType är Restricted License-inbäddning.

**Returns:**
boolean - Detekterar om fsType är inbäddning med begränsad licens.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

