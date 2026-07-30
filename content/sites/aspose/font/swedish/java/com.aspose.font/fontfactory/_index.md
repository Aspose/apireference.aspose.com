---
title: "FontFactory"
second_title: "Aspose.Font för Java API-referens"
description: "Innehåller funktionalitet för att öppna typsnitt av olika typer och andra metoder för att skapa olika objekt."
type: docs
weight: 41
url: /sv/java/com.aspose.font/fontfactory/
---
**Inheritance:**
java.lang.Object
```
public class FontFactory
```

Innehåller funktionalitet för att öppna teckensnitt av olika typer samt andra metoder för att skapa olika objekt.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [FontFactory()](#FontFactory--) | Konstruktor |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [open(FontDefinition fontDefinition)](#open-com.aspose.font.FontDefinition-) | Öppnar en font med FontDefinition-objekt. |
| [open(FontType fontType, byte[] fontData)](#open-com.aspose.font.FontType-byte---) | Öppnar en font med fonttyp och bytearray för fontdata. |
| [open(FontType fontType, StreamSource fontStreamSource)](#open-com.aspose.font.FontType-com.aspose.font.StreamSource-) | Öppnar en font med fonttyp och strömkälla. |
| [open(FontType fontType, String fileName)](#open-com.aspose.font.FontType-java.lang.String-) | Öppnar en font med fonttyp och fontfilnamn. |
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


Öppnar en font med FontDefinition-objekt.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontDefinition | [FontDefinition](../../com.aspose.font/fontdefinition) | Typsnittsdefinitionsobjekt. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, byte[] fontData) {#open-com.aspose.font.FontType-byte---}
```
public Font open(FontType fontType, byte[] fontData)
```


Öppnar en font med fonttyp och bytearray för fontdata.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Typsnittstyp. |
| fontData | byte[] | Byte‑array för att läsa in typsnitt från. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, StreamSource fontStreamSource) {#open-com.aspose.font.FontType-com.aspose.font.StreamSource-}
```
public Font open(FontType fontType, StreamSource fontStreamSource)
```


Öppnar en font med fonttyp och strömkälla.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Typsnittstyp. |
| fontStreamSource | [StreamSource](../../com.aspose.font/streamsource) | Strömkälla för typsnitt. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, String fileName) {#open-com.aspose.font.FontType-java.lang.String-}
```
public Font open(FontType fontType, String fileName)
```


Öppnar en font med fonttyp och fontfilnamn.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Typsnittstyp. |
| fileName | java.lang.String | Fontfilnamn. |

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

