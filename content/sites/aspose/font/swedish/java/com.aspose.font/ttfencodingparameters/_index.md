---
title: "TtfEncodingParameters"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar TTF-kodningsparametrar."
type: docs
weight: 93
url: /sv/java/com.aspose.font/ttfencodingparameters/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IEncodingParameters](../../com.aspose.font/iencodingparameters)
```
public class TtfEncodingParameters implements IEncodingParameters
```

Representerar TTF-kodningsparametrar. Ska användas för att begära specifik kodning från TTF-typsnitt.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [TtfEncodingParameters(int platformId, int platformSpecificId)](#TtfEncodingParameters-int-int-) | Initierar en ny instans av klassen TtfEncodingParameters. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getPlatformId()](#getPlatformId--) | Hämta PlatformId-värdet. |
| [getPlatformSpecificId()](#getPlatformSpecificId--) | Hämtar PlatformSpecificId-värdet. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setPlatformId(int value)](#setPlatformId-int-) | Ställer in PlatformId-värdet. |
| [setPlatformSpecificId(int value)](#setPlatformSpecificId-int-) | Ställer in PlatformSpecificId-värdet. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TtfEncodingParameters(int platformId, int platformSpecificId) {#TtfEncodingParameters-int-int-}
```
public TtfEncodingParameters(int platformId, int platformSpecificId)
```


Initierar en ny instans av klassen TtfEncodingParameters. Tar Platform Id och Platform-specific encoding id som parametrar. Dessa parametrar används för att begära en speciell CMap-undertabell från huvudtypsnittets CMap-tabell, se tabellen 'CMap', 'name' i OpenType Font File-specifikationen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| platformId | int | Platform-id. |
| platformSpecificId | int | Platform-specifik kodnings-id. |

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
### getPlatformId() {#getPlatformId--}
```
public int getPlatformId()
```


Hämta PlatformId-värdet.

**Returns:**
int - PlatformId-värdet.
### getPlatformSpecificId() {#getPlatformSpecificId--}
```
public int getPlatformSpecificId()
```


Hämtar PlatformSpecificId-värdet.

**Returns:**
int - PlatformSpecificId-värdet.
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


Ställer in PlatformId-värdet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| värde | int | PlatformId-värdet. |

### setPlatformSpecificId(int value) {#setPlatformSpecificId-int-}
```
public void setPlatformSpecificId(int value)
```


Ställer in PlatformSpecificId-värdet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| värde | int | PlatformSpecificId-värdet. |

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

