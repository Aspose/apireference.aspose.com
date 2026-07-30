---
title: "StreamSource"
second_title: "Aspose.Font för Java API-referens"
description: "Definierar ett sätt att hämta en filström när den behövs."
type: docs
weight: 74
url: /sv/java/com.aspose.font/streamsource/
---
**Inheritance:**
java.lang.Object
```
public abstract class StreamSource
```

Definierar ett sätt att hämta en filström när den behövs.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [StreamSource()](#StreamSource--) | Initierar instans av strömkälla. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [deepClone()](#deepClone--) | Klonar strömkälla-objektet. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFontStream()](#getFontStream--) | Returnerar teckensnittström. |
| [getOffset()](#getOffset--) | Hämtar förskjutning i källan. |
| [hashCode()](#hashCode--) |  |
| [mustCloseAfterUse()](#mustCloseAfterUse--) | Avärvade klasser kan förhindra att strömmen stängs. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOffset(long value)](#setOffset-long-) | Ställer in förskjutning i källan. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StreamSource() {#StreamSource--}
```
public StreamSource()
```


Initierar instans av strömkälla.

### deepClone() {#deepClone--}
```
public abstract Object deepClone()
```


Klonar strömkälla-objektet.

**Returns:**
java.lang.Object - Kopia av strömkälla-objektet.
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
### getFontStream() {#getFontStream--}
```
public abstract InputStream getFontStream()
```


Returnerar teckensnittström.

**Returns:**
java.io.InputStream - Teckensnittström.
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

