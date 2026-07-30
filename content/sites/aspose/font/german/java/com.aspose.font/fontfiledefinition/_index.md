---
title: "FontFileDefinition"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt die Definition einer Font-Datei dar."
type: docs
weight: 42
url: /de/java/com.aspose.font/fontfiledefinition/
---
**Inheritance:**
java.lang.Object
```
public class FontFileDefinition
```

Stellt die Definition einer Font-Datei dar.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [FontFileDefinition(StreamSource streamSource)](#FontFileDefinition-com.aspose.font.StreamSource-) | Erstellt eine Dateidefinition, die ausschließlich den Dateiinhalt verwendet. |
| [FontFileDefinition(String fileExtension, StreamSource streamSource)](#FontFileDefinition-java.lang.String-com.aspose.font.StreamSource-) | Erstellt eine Dateidefinition, die ausschließlich den Dateiinhalt verwendet. |
| [FontFileDefinition(String fileExtension, StreamSource streamSource, long offset)](#FontFileDefinition-java.lang.String-com.aspose.font.StreamSource-long-) | Erstellt eine Dateidefinition, die ausschließlich den Dateiinhalt verwendet. |
| [FontFileDefinition(File fontFile)](#FontFileDefinition-java.io.File-) | Erstellt eine Dateidefinition unter Verwendung der Schriftdatei (repräsentiert durch File) und des Dateiinhalts. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFileExtension()](#getFileExtension--) | Liefert Dateierweiterung. |
| [getFileName()](#getFileName--) | Liefert Dateinamen. |
| [getOffset()](#getOffset--) | Liefert Offset innerhalb des Streams. |
| [getStreamSource()](#getStreamSource--) | Liefert die Stream-Quelle. |
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


Erstellt eine Dateidefinition, die ausschließlich den Dateiinhalt verwendet.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Font-Stream-Quelle. |

### FontFileDefinition(String fileExtension, StreamSource streamSource) {#FontFileDefinition-java.lang.String-com.aspose.font.StreamSource-}
```
public FontFileDefinition(String fileExtension, StreamSource streamSource)
```


Erstellt eine Dateidefinition, die ausschließlich den Dateiinhalt verwendet.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fileExtension | java.lang.String | Font-Dateierweiterung. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Font-Stream-Quelle. |

### FontFileDefinition(String fileExtension, StreamSource streamSource, long offset) {#FontFileDefinition-java.lang.String-com.aspose.font.StreamSource-long-}
```
public FontFileDefinition(String fileExtension, StreamSource streamSource, long offset)
```


Erstellt eine Dateidefinition, die ausschließlich den Dateiinhalt verwendet.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fileExtension | java.lang.String | Font-Dateierweiterung. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Font-Stream-Quelle. |
| Versatz | long | Versatz zu den Schriftartdaten in der Stream-Quelle. |

### FontFileDefinition(File fontFile) {#FontFileDefinition-java.io.File-}
```
public FontFileDefinition(File fontFile)
```


Erstellt eine Dateidefinition unter Verwendung der Schriftdatei (repräsentiert durch File) und des Dateiinhalts.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontFile | java.io.File | Dateiobjekt. |

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

