---
title: "FileSystemStreamSource"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar en strömkälla baserad på filsystemet."
type: docs
weight: 31
url: /sv/java/com.aspose.font/filesystemstreamsource/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.StreamSource](../../com.aspose.font/streamsource)
```
public class FileSystemStreamSource extends StreamSource
```

Representerar en strömkälla baserad på filsystemet.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [FileSystemStreamSource(String fileName)](#FileSystemStreamSource-java.lang.String-) | Initierar ett nytt FileSystemStreamSource‑objekt. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [deepClone()](#deepClone--) | Klonar FileSystemStreamSource‑objektet. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFileName()](#getFileName--) | Hämtar filnamn. |
| [getFontStream()](#getFontStream--) | Returnerar Font-filström. |
| [getOffset()](#getOffset--) | Hämtar förskjutning i källan. |
| [hashCode()](#hashCode--) |  |
| [mustCloseAfterUse()](#mustCloseAfterUse--) | Avärvade klasser kan förhindra att strömmen stängs. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setFileName(String value)](#setFileName-java.lang.String-) | Ställer in filnamn. |
| [setOffset(long value)](#setOffset-long-) | Ställer in förskjutning i källan. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FileSystemStreamSource(String fileName) {#FileSystemStreamSource-java.lang.String-}
```
public FileSystemStreamSource(String fileName)
```


Initierar ett nytt FileSystemStreamSource‑objekt.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fileName | java.lang.String | Filnamn. |

### deepClone() {#deepClone--}
```
public Object deepClone()
```


Klonar FileSystemStreamSource‑objektet.

**Returns:**
java.lang.Object - Kopia av FileSystemStreamSource‑objekt.
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
### getFileName() {#getFileName--}
```
public String getFileName()
```


Hämtar filnamn.

**Returns:**
java.lang.String - Filnamn.
### getFontStream() {#getFontStream--}
```
public InputStream getFontStream()
```


Returnerar Font-filström. Glöm inte att stänga strömmen efter användning.

**Returns:**
java.io.InputStream - Font-filström.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Hämtar förskjutning i källan.

**Returns:**
long - Förskjutning i källan.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### mustCloseAfterUse() {#mustCloseAfterUse--}
```
public boolean mustCloseAfterUse()
```


Avärvade klasser kan förhindra att strömmen stängs. Returnerar true om strömkälla vill att strömmen stängs efter användning. Annars returneras false.

**Returns:**
boolean - True om strömkälla vill att strömmen stängs efter användning, annars false.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setFileName(String value) {#setFileName-java.lang.String-}
```
public void setFileName(String value)
```


Ställer in filnamn.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| värde | java.lang.String | Filnamn. |

### setOffset(long value) {#setOffset-long-}
```
public void setOffset(long value)
```


Ställer in förskjutning i källan.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| värde | long | Förskjutning i källan. |

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

