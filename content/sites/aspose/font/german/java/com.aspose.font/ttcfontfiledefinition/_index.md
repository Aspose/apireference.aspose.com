---
title: "TtcFontFileDefinition"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt die Dateidefinition für die TTC Schriftart dar."
type: docs
weight: 79
url: /de/java/com.aspose.font/ttcfontfiledefinition/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.FontFileDefinition](../../com.aspose.font/fontfiledefinition)
```
public class TtcFontFileDefinition extends FontFileDefinition
```

Stellt die Dateidefinition für die TTC Schriftart dar.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [TtcFontFileDefinition(int fontIndex, String fileExtension, StreamSource streamSource, long offset)](#TtcFontFileDefinition-int-java.lang.String-com.aspose.font.StreamSource-long-) | Erstellt eine Dateidefinition, die ausschließlich den Dateiinhalt verwendet. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFileExtension()](#getFileExtension--) | Liefert Dateierweiterung. |
| [getFileName()](#getFileName--) | Liefert Dateinamen. |
| [getFontIndex()](#getFontIndex--) | Liefert Schriftindex innerhalb der TTC-Schrift. |
| [getOffset()](#getOffset--) | Liefert Offset innerhalb des Streams. |
| [getStreamSource()](#getStreamSource--) | Liefert die Stream-Quelle. |
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


Erstellt eine Dateidefinition, die ausschließlich den Dateiinhalt verwendet.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontIndex | int | Index der Schrift innerhalb der TTC-Schriftensammlung. |
| fileExtension | java.lang.String | Erweiterung der Schriftdateisammlung. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Quelle der Schriftdateisammlung. |
| Versatz | long | Versatz zu den Schriftartdaten in der Schriftdateisammlung, siehe TTC-Header, Offset-Tabelle in der OpenType-Schriftdateispezifikation. |

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
### getFileExtension() {#getFileExtension--}
```
public String getFileExtension()
```


Liefert Dateierweiterung.

**Returns:**
java.lang.String - Dateierweiterung.
### getFileName() {#getFileName--}
```
public String getFileName()
```


Liefert Dateinamen.

**Returns:**
java.lang.String - Dateiname.
### getFontIndex() {#getFontIndex--}
```
public long getFontIndex()
```


Liefert Schriftindex innerhalb der TTC-Schrift.

**Returns:**
long - Schriftartindex innerhalb der TTC-Schrift.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Liefert Offset innerhalb des Streams.

**Returns:**
long - Versatz innerhalb des Streams.
### getStreamSource() {#getStreamSource--}
```
public StreamSource getStreamSource()
```


Liefert die Stream-Quelle.

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

