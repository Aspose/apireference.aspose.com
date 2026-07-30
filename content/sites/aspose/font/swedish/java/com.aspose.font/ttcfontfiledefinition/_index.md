---
title: "TtcFontFileDefinition"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar fildefinition för TTC-typsnitt."
type: docs
weight: 79
url: /sv/java/com.aspose.font/ttcfontfiledefinition/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.FontFileDefinition](../../com.aspose.font/fontfiledefinition)
```
public class TtcFontFileDefinition extends FontFileDefinition
```

Representerar fildefinition för TTC-typsnitt.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [TtcFontFileDefinition(int fontIndex, String fileExtension, StreamSource streamSource, long offset)](#TtcFontFileDefinition-int-java.lang.String-com.aspose.font.StreamSource-long-) | Skapar en fildefinition som endast använder filinnehåll. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFileExtension()](#getFileExtension--) | Hämtar filändelse. |
| [getFileName()](#getFileName--) | Hämtar filnamn. |
| [getFontIndex()](#getFontIndex--) | Hämtar teckensnittets index i TTC-teckensnittet. |
| [getOffset()](#getOffset--) | Hämtar förskjutning i strömmen. |
| [getStreamSource()](#getStreamSource--) | Hämtar strömkällan. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TtcFontFileDefinition(int fontIndex, String fileExtension, StreamSource streamSource, long offset) {#TtcFontFileDefinition-int-java.lang.String-com.aspose.font.StreamSource-long-}
```
public TtcFontFileDefinition(int fontIndex, String fileExtension, StreamSource streamSource, long offset)
```


Skapar en fildefinition som endast använder filinnehåll.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontIndex | int | Index för teckensnitt i TTC-teckensnittssamling. |
| fileExtension | java.lang.String | Filändelse för teckensnittssamling. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Källa för teckensnittssamling. |
| förskjutning | long | Förskjutning till teckensnittsdata i teckensnittssamlingen, se TTC‑huvud, Offset‑tabell i OpenType-teckensnittsfilspecifikationen |

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
### getFontIndex() {#getFontIndex--}
```
public long getFontIndex()
```


Hämtar teckensnittets index i TTC-teckensnittet.

**Returns:**
long - Teckensnittindex i TTC‑teckensnitt.
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

