---
title: "FontFileDefinition"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar definition av Font-fil."
type: docs
weight: 42
url: /sv/java/com.aspose.font/fontfiledefinition/
---
**Inheritance:**
java.lang.Object
```
public class FontFileDefinition
```

Representerar definition av Font-fil.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [FontFileDefinition(StreamSource streamSource)](#FontFileDefinition-com.aspose.font.StreamSource-) | Skapar en fildefinition som endast använder filinnehåll. |
| [FontFileDefinition(String fileExtension, StreamSource streamSource)](#FontFileDefinition-java.lang.String-com.aspose.font.StreamSource-) | Skapar en fildefinition som endast använder filinnehåll. |
| [FontFileDefinition(String fileExtension, StreamSource streamSource, long offset)](#FontFileDefinition-java.lang.String-com.aspose.font.StreamSource-long-) | Skapar en fildefinition som endast använder filinnehåll. |
| [FontFileDefinition(File fontFile)](#FontFileDefinition-java.io.File-) | Skapar en fildefinition med teckensnittfil (representerad av File) och filinnehåll. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFileExtension()](#getFileExtension--) | Hämtar filändelse. |
| [getFileName()](#getFileName--) | Hämtar filnamn. |
| [getOffset()](#getOffset--) | Hämtar förskjutning i strömmen. |
| [getStreamSource()](#getStreamSource--) | Hämtar strömkällan. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FontFileDefinition(StreamSource streamSource) {#FontFileDefinition-com.aspose.font.StreamSource-}
```
public FontFileDefinition(StreamSource streamSource)
```


Skapar en fildefinition som endast använder filinnehåll.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Teckensnittets strömkälla. |

### FontFileDefinition(String fileExtension, StreamSource streamSource) {#FontFileDefinition-java.lang.String-com.aspose.font.StreamSource-}
```
public FontFileDefinition(String fileExtension, StreamSource streamSource)
```


Skapar en fildefinition som endast använder filinnehåll.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fileExtension | java.lang.String | Teckensnittfilens filändelse. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Teckensnittets strömkälla. |

### FontFileDefinition(String fileExtension, StreamSource streamSource, long offset) {#FontFileDefinition-java.lang.String-com.aspose.font.StreamSource-long-}
```
public FontFileDefinition(String fileExtension, StreamSource streamSource, long offset)
```


Skapar en fildefinition som endast använder filinnehåll.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fileExtension | java.lang.String | Teckensnittfilens filändelse. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Teckensnittets strömkälla. |
| förskjutning | long | Förskjutning till teckensnittsdata i strömkällan. |

### FontFileDefinition(File fontFile) {#FontFileDefinition-java.io.File-}
```
public FontFileDefinition(File fontFile)
```


Skapar en fildefinition med teckensnittfil (representerad av File) och filinnehåll.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontFile | java.io.File | Filobjekt. |

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
### getFileExtension() {#getFileExtension--}
```
public String getFileExtension()
```


Hämtar filändelse.

**Returns:**
java.lang.String - Filändelse.
### getFileName() {#getFileName--}
```
public String getFileName()
```


Hämtar filnamn.

**Returns:**
java.lang.String - Filnamn.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Hämtar förskjutning i strömmen.

**Returns:**
long - Förskjutning i strömmen.
### getStreamSource() {#getStreamSource--}
```
public StreamSource getStreamSource()
```


Hämtar strömkällan.

**Returns:**
[StreamSource](../../com.aspose.font/streamsource) - The stream source.
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

