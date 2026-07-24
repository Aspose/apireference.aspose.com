---
title: "StringResult"
second_title: "Aspose.Page voor Java API-referentie"
description: "Stelt het resultaat van een bewerking voor in de vorm van een tekenreeks."
type: docs
weight: 19
url: /nl/java/com.aspose.page.plugins/stringresult/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IOperationResult](../../com.aspose.page.plugins/ioperationresult)
```
public final class StringResult implements IOperationResult
```

Stelt het resultaat van een bewerking voor in de vorm van een tekenreeks.
## Constructors

| Constructor | Beschrijving |
| --- | --- |
| [StringResult(String result)](#StringResult-java.lang.String-) | Initialiseert een nieuw StringResult-exemplaar met een string. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getData()](#getData--) | Haalt ruwe gegevens op. |
| [getText()](#getText--) | Retourneert de stringrepresentatie van het resultaat. |
| [hashCode()](#hashCode--) |  |
| [isByteArray()](#isByteArray--) | Geeft aan of het resultaat een byte-array is. |
| [isFile()](#isFile--) | Geeft aan of het resultaat een pad naar een uitvoerbestand is. |
| [isStream()](#isStream--) | Geeft aan of het resultaat een pad naar een uitvoerbestand is. |
| [isString()](#isString--) | Geeft aan of het resultaat een tekenreeks is. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toFile()](#toFile--) | Probeert het resultaat om te zetten naar een bestand. |
| [toStream()](#toStream--) | Probeert het resultaat om te zetten naar een streamobject. |
| [toString()](#toString--) | Probeert het resultaat naar een string te converteren. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StringResult(String result) {#StringResult-java.lang.String-}
```
public StringResult(String result)
```


Initialiseert een nieuw StringResult-exemplaar met een string.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| resultaat | java.lang.String | String die het resultaat weergeeft |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
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


Haalt ruwe gegevens op.

**Returns:**
java.lang.Object - Een object dat uitvoergegevens vertegenwoordigt.
### getText() {#getText--}
```
public final String getText()
```


Retourneert de stringrepresentatie van het resultaat.

**Returns:**
java.lang.String
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


Geeft aan of het resultaat een byte-array is.

**Returns:**
boolean - true als het resultaat een byte-array is; anders false.
### isFile() {#isFile--}
```
public final boolean isFile()
```


Geeft aan of het resultaat een pad naar een uitvoerbestand is.

**Returns:**
boolean - true als het resultaat een bestand is; anders false.
### isStream() {#isStream--}
```
public final boolean isStream()
```


Geeft aan of het resultaat een pad naar een uitvoerbestand is.

**Returns:**
boolean - true als het resultaat een streamobject is; anders false.
### isString() {#isString--}
```
public final boolean isString()
```


Geeft aan of het resultaat een tekenreeks is.

**Returns:**
boolean - true als het resultaat een tekenreeks is; anders false.
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


Probeert het resultaat om te zetten naar een bestand.

**Returns:**
java.lang.String - Een tekenreeks die het pad naar het uitvoerbestand vertegenwoordigt als het resultaat een bestand is; anders null.
### toStream() {#toStream--}
```
public final OutputStream toStream()
```


Probeert het resultaat om te zetten naar een streamobject.

**Returns:**
java.io.OutputStream - Een streamobject dat de uitvoergegevens vertegenwoordigt als het resultaat een stream is; anders null.
### toString() {#toString--}
```
public String toString()
```


Probeert het resultaat naar een string te converteren.

**Returns:**
java.lang.String - Een string die de tekstinhoud vertegenwoordigt als het resultaat een string is; anders wordt base.ToString() geretourneerd.
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

