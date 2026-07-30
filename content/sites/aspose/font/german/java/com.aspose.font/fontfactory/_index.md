---
title: "FontFactory"
second_title: "Aspose.Font für Java API-Referenz"
description: "Enthält Funktionen zum Öffnen von Schriftarten verschiedener Typen und weitere Methoden zum Erstellen verschiedener Objekte."
type: docs
weight: 41
url: /de/java/com.aspose.font/fontfactory/
---
**Inheritance:**
java.lang.Object
```
public class FontFactory
```

Enthält Funktionalität zum Öffnen von Schriftarten verschiedener Typen und weitere Methoden zur Erstellung verschiedener Objekte.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [FontFactory()](#FontFactory--) | Konstruktor |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [open(FontDefinition fontDefinition)](#open-com.aspose.font.FontDefinition-) | Öffnet einen Font mithilfe eines FontDefinition-Objekts. |
| [open(FontType fontType, byte[] fontData)](#open-com.aspose.font.FontType-byte---) | Öffnet einen Font mithilfe des Font-Typs und eines Byte-Arrays mit Font-Daten. |
| [open(FontType fontType, StreamSource fontStreamSource)](#open-com.aspose.font.FontType-com.aspose.font.StreamSource-) | Öffnet einen Font mithilfe des Font-Typs und einer Stream-Quelle. |
| [open(FontType fontType, String fileName)](#open-com.aspose.font.FontType-java.lang.String-) | Öffnet einen Font mithilfe des Font-Typs und des Font-Dateinamens. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FontFactory() {#FontFactory--}
```
public FontFactory()
```


Konstruktor

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




### open(FontDefinition fontDefinition) {#open-com.aspose.font.FontDefinition-}
```
public Font open(FontDefinition fontDefinition)
```


Öffnet einen Font mithilfe eines FontDefinition-Objekts.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontDefinition | [FontDefinition](../../com.aspose.font/fontdefinition) | Schriftdefinitions-Objekt. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, byte[] fontData) {#open-com.aspose.font.FontType-byte---}
```
public Font open(FontType fontType, byte[] fontData)
```


Öffnet einen Font mithilfe des Font-Typs und eines Byte-Arrays mit Font-Daten.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Schrifttyp. |
| fontData | byte[] | Byte-Array, aus dem die Schrift geladen wird. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, StreamSource fontStreamSource) {#open-com.aspose.font.FontType-com.aspose.font.StreamSource-}
```
public Font open(FontType fontType, StreamSource fontStreamSource)
```


Öffnet einen Font mithilfe des Font-Typs und einer Stream-Quelle.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Schrifttyp. |
| fontStreamSource | [StreamSource](../../com.aspose.font/streamsource) | Stream-Quelle für die Schrift. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, String fileName) {#open-com.aspose.font.FontType-java.lang.String-}
```
public Font open(FontType fontType, String fileName)
```


Öffnet einen Font mithilfe des Font-Typs und des Font-Dateinamens.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Schrifttyp. |
| fileName | java.lang.String | Schriftdateiname. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
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

