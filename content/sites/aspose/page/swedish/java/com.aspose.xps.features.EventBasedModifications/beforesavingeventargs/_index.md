---
title: "BeforeSavingEventArgs"
second_title: "Aspose.Page för Java API-referens"
description: "Definierar basklassen för argument till olika händelser som sker innan sparning."
type: docs
weight: 11
url: /sv/java/com.aspose.xps.features.eventbasedmodifications/beforesavingeventargs/
---
**Inheritance:**
java.lang.Object
```
public class BeforeSavingEventArgs<T>
```

Definierar basklassen för argument till olika händelser som sker innan sparning.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAbsolutePageNumber()](#getAbsolutePageNumber--) | Returnerar det aktuella absoluta sidnumret över alla dokument i XPS-paketet. |
| [getClass()](#getClass--) |  |
| [getDocumentNumber()](#getDocumentNumber--) | Returnerar det aktuella dokumentnumret i XPS-paketet. |
| [getElementAPI()](#getElementAPI--) | Returnerar modifierings-API:t för elementet som ska sparas. |
| [getOutputPageNumber()](#getOutputPageNumber--) | Returnerar det aktuella utdata-numret. |
| [getRelativePageNumber()](#getRelativePageNumber--) | Returnerar det aktuella sidnumret relativt det aktuella dokumentet i XPS-paketet. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getAbsolutePageNumber() {#getAbsolutePageNumber--}
```
public int getAbsolutePageNumber()
```


Returnerar det aktuella absoluta sidnumret över alla dokument i XPS-paketet.

**Returns:**
int - Det aktuella absoluta sidnumret över alla dokument i XPS-paketet.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDocumentNumber() {#getDocumentNumber--}
```
public int getDocumentNumber()
```


Returnerar det aktuella dokumentnumret i XPS-paketet.

**Returns:**
int - Det aktuella dokumentnumret inom XPS-paketet.
### getElementAPI() {#getElementAPI--}
```
public T getElementAPI()
```


Returnerar modifierings-API:t för elementet som ska sparas.

**Returns:**
T - Modifierings-API:t för elementet som ska sparas.
### getOutputPageNumber() {#getOutputPageNumber--}
```
public int getOutputPageNumber()
```


Returnerar det aktuella utdata-numret. Det skiljer sig från **AbsolutePageNumber** om **PageNumbers**-sparalternativet är specificerat.

**Returns:**
int - Det aktuella utdata-numret.
### getRelativePageNumber() {#getRelativePageNumber--}
```
public int getRelativePageNumber()
```


Returnerar det aktuella sidnumret relativt det aktuella dokumentet i XPS-paketet.

**Returns:**
int - Det aktuella sidnumret relativt det aktuella dokumentet inom XPS-paketet.
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

