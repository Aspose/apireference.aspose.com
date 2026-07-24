---
title: "FileResult"
second_title: "Aspose.Page för Java API-referens"
description: "Representerar operationsresultat i form av en strängväg till filen."
type: docs
weight: 14
url: /sv/java/com.aspose.page.plugins/fileresult/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IOperationResult](../../com.aspose.page.plugins/ioperationresult)
```
public final class FileResult implements IOperationResult
```

Representerar operationsresultat i form av en strängväg till filen.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [FileResult(String path)](#FileResult-java.lang.String-) | Initierar en ny instans med den angivna sökvägen till en utdatafil. |
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
### FileResult(String path) {#FileResult-java.lang.String-}
```
public FileResult(String path)
```


Initierar en ny instans med den angivna sökvägen till en utdatafil.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| sökväg | java.lang.String | Sökväg till en fil. |

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

