---
title: "ByteArrayResult"
second_title: "Aspose.Page för Java API-referens"
description: "Representerar resultatet av en operation i form av byte‑arrayen."
type: docs
weight: 11
url: /sv/java/com.aspose.page.plugins/bytearrayresult/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IOperationResult](../../com.aspose.page.plugins/ioperationresult)
```
public class ByteArrayResult implements IOperationResult
```

Representerar resultatet av en operation i form av byte‑arrayen.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [ByteArrayResult(byte[][] data)](#ByteArrayResult-byte-----) | Initierar en ny instans med en array av bytearrayer. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getData()](#getData--) | Hämtar rådata. |
| [hashCode()](#hashCode--) |  |
| [isByteArray()](#isByteArray--) | Indikerar om resultatet är en bytearray. |
| [isFile()](#isFile--) | Indikerar om resultatet är en sökväg till en utdatafil. |
| [isStream()](#isStream--) | Indikerar om resultatet är en utgångsström. |
| [isString()](#isString--) | Indikerar om resultatet är en textsträng. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toFile()](#toFile--) | Försöker konvertera resultatet till en fil. |
| [toStream()](#toStream--) | Försöker konvertera resultatet till ett strömobjekt. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ByteArrayResult(byte[][] data) {#ByteArrayResult-byte-----}
```
public ByteArrayResult(byte[][] data)
```


Initierar en ny instans med en array av bytearrayer.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| data | byte[][] | Array av bytearrayer. Den används för konvertering av dokument till bild. En bytearray innehåller byte för en sidbild. |

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
### getData() {#getData--}
```
public final Object getData()
```


Hämtar rådata.

**Returns:**
java.lang.Object - Ett objekt som representerar utdata.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isByteArray() {#isByteArray--}
```
public final boolean isByteArray()
```


Indikerar om resultatet är en bytearray.

**Returns:**
boolean - true om resultatet är en bytearray; annars false.
### isFile() {#isFile--}
```
public final boolean isFile()
```


Indikerar om resultatet är en sökväg till en utdatafil.

**Returns:**
boolean - true om resultatet är en fil; annars false.
### isStream() {#isStream--}
```
public final boolean isStream()
```


Indikerar om resultatet är en utgångsström.

**Returns:**
boolean - true om resultatet är ett strömobjekt; annars false.
### isString() {#isString--}
```
public final boolean isString()
```


Indikerar om resultatet är en textsträng.

**Returns:**
boolean - true om resultatet är en sträng; annars false.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toFile() {#toFile--}
```
public final String toFile()
```


Försöker konvertera resultatet till en fil.

**Returns:**
java.lang.String - En sträng som representerar sökvägen till utdatafilen om resultatet är en fil; annars null.
### toStream() {#toStream--}
```
public final OutputStream toStream()
```


Försöker konvertera resultatet till ett strömobjekt.

**Returns:**
java.io.OutputStream - Ett strömobjekt som representerar utdata om resultatet är en ström; annars null.
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

