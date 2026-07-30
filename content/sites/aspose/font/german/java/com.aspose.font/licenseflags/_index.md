---
title: "LicenseFlags"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt einen Hilfs-Wrapper für Einbettungs-Flags aus dem OS/2-Tabellenfeld fsType dar."
type: docs
weight: 59
url: /de/java/com.aspose.font/licenseflags/
---
**Inheritance:**
java.lang.Object
```
public class LicenseFlags
```

Stellt einen Hilfs-Wrapper für Einbettungsflags aus der 'OS/2'-Tabelle (Feld fsType) dar.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFSType()](#getFSType--) | Liefert den rohen fsType-Wert aus der OS/2-Tabelle oder 0, falls dieses Feld in der Tabelle nicht existiert. |
| [hashCode()](#hashCode--) |  |
| [isBitmapOnlyEmbedding()](#isBitmapOnlyEmbedding--) | Ermittelt, ob fsType das BitmapOnly-Einbetten zulässt. |
| [isEditableEmbedding()](#isEditableEmbedding--) | Ermittelt, ob fsType das Editable-Einbetten zulässt. |
| [isFSTypeAbsent()](#isFSTypeAbsent--) | Gibt true zurück, wenn das fsType-Flag in der 'OS/2'-Tabelle fehlt. |
| [isInstallableEmbedding()](#isInstallableEmbedding--) | Ermittelt, ob fsType Installable-Einbetten zulässt. |
| [isNoSubsettingEmbedding()](#isNoSubsettingEmbedding--) | Ermittelt, ob fsType NoSubsetting-Einbetten zulässt. |
| [isPreviewAndPrintEmbedding()](#isPreviewAndPrintEmbedding--) | Ermittelt, ob fsType Preview- und Print-Einbetten zulässt. |
| [isReservedType()](#isReservedType--) | Ermittelt, ob das reservierte Bit (Bit 0) für fsType gesetzt ist. |
| [isRestrictedLicenseEmbedding()](#isRestrictedLicenseEmbedding--) | Ermittelt, ob fsType Restricted License-Einbetten ist. |
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
| Parameter | Typ | Beschreibung |
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


Liefert den rohen fsType-Wert aus der OS/2-Tabelle oder 0, falls dieses Feld in der Tabelle nicht existiert.

**Returns:**
int - Rohwert von fsType aus der OS/2-Tabelle oder 0, falls dieses Feld in der Tabelle nicht existiert.
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


Ermittelt, ob fsType das BitmapOnly-Einbetten zulässt.

**Returns:**
boolean - Ermittelt, ob fsType BitmapOnly-Einbetten zulässt.
### isEditableEmbedding() {#isEditableEmbedding--}
```
public boolean isEditableEmbedding()
```


Ermittelt, ob fsType das Editable-Einbetten zulässt.

**Returns:**
boolean - Erkennt, ob fsType Editable-Einbettung erlaubt.
### isFSTypeAbsent() {#isFSTypeAbsent--}
```
public boolean isFSTypeAbsent()
```


Gibt true zurück, wenn das fsType-Flag in der 'OS/2'-Tabelle fehlt.

**Returns:**
boolean - Wahr, wenn das fsType-Flag in der 'OS/2'-Tabelle fehlt.
### isInstallableEmbedding() {#isInstallableEmbedding--}
```
public boolean isInstallableEmbedding()
```


Ermittelt, ob fsType Installable-Einbetten zulässt.

**Returns:**
boolean - Erkennt, ob fsType Installable-Einbettung ist.
### isNoSubsettingEmbedding() {#isNoSubsettingEmbedding--}
```
public boolean isNoSubsettingEmbedding()
```


Ermittelt, ob fsType NoSubsetting-Einbetten zulässt.

**Returns:**
boolean - Erkennt, ob fsType NoSubsetting-Einbettung erlaubt.
### isPreviewAndPrintEmbedding() {#isPreviewAndPrintEmbedding--}
```
public boolean isPreviewAndPrintEmbedding()
```


Ermittelt, ob fsType Preview- und Print-Einbetten zulässt.

**Returns:**
boolean - Erkennt, ob fsType Preview- und Print-Einbettung erlaubt.
### isReservedType() {#isReservedType--}
```
public boolean isReservedType()
```


Ermittelt, ob das reservierte Bit (Bit 0) für fsType gesetzt ist.

**Returns:**
boolean - Erkennt, ob das reservierte Bit (Bit 0) für fsType gesetzt ist.
### isRestrictedLicenseEmbedding() {#isRestrictedLicenseEmbedding--}
```
public boolean isRestrictedLicenseEmbedding()
```


Ermittelt, ob fsType Restricted License-Einbetten ist.

**Returns:**
boolean - Erkennt, ob fsType Restricted License-Einbettung ist.
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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

