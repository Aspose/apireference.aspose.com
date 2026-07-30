---
title: "TtfEncodingParameters"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt die TTF Kodierungsparameter dar."
type: docs
weight: 93
url: /de/java/com.aspose.font/ttfencodingparameters/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IEncodingParameters](../../com.aspose.font/iencodingparameters)
```
public class TtfEncodingParameters implements IEncodingParameters
```

Stellt TTF-Codierungsparameter dar. Sollte verwendet werden, um eine bestimmte Codierung von einer TTF-Schrift anzufordern.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [TtfEncodingParameters(int platformId, int platformSpecificId)](#TtfEncodingParameters-int-int-) | Initialisiert eine neue Instanz der Klasse TtfEncodingParameters. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getPlatformId()](#getPlatformId--) | Ruft den PlatformId-Wert ab. |
| [getPlatformSpecificId()](#getPlatformSpecificId--) | Ruft den PlatformSpecificId-Wert ab. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setPlatformId(int value)](#setPlatformId-int-) | Setzt den PlatformId-Wert. |
| [setPlatformSpecificId(int value)](#setPlatformSpecificId-int-) | Setzt den PlatformSpecificId-Wert. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TtfEncodingParameters(int platformId, int platformSpecificId) {#TtfEncodingParameters-int-int-}
```
public TtfEncodingParameters(int platformId, int platformSpecificId)
```


Initialisiert eine neue Instanz der Klasse TtfEncodingParameters. Nimmt Platform Id und Platform-spezifische Codierungs-ID als Parameter. Diese Parameter werden verwendet, um eine spezielle CMap-Untertabelle aus der Haupt‑CMap‑Tabelle der Schrift anzufordern, siehe Tabelle 'CMap', 'name' in der OpenType-Schriftdateispezifikation.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| platformId | int | Platform‑Id. |
| platformSpecificId | int | Platform‑spezifische Codierungs‑ID. |

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
### getPlatformId() {#getPlatformId--}
```
public int getPlatformId()
```


Ruft den PlatformId-Wert ab.

**Returns:**
int – PlatformId-Wert.
### getPlatformSpecificId() {#getPlatformSpecificId--}
```
public int getPlatformSpecificId()
```


Ruft den PlatformSpecificId-Wert ab.

**Returns:**
int – PlatformSpecificId-Wert.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setPlatformId(int value) {#setPlatformId-int-}
```
public void setPlatformId(int value)
```


Setzt den PlatformId-Wert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | PlatformId-Wert. |

### setPlatformSpecificId(int value) {#setPlatformSpecificId-int-}
```
public void setPlatformSpecificId(int value)
```


Setzt den PlatformSpecificId-Wert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | PlatformSpecificId-Wert. |

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

