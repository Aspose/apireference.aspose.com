---
title: "BeforeSavingEventArgs"
second_title: "Aspose.Page voor Java API-referentie"
description: "Definieert de basisklasse voor argumenten van verschillende before-saving gebeurtenissen."
type: docs
weight: 11
url: /nl/java/com.aspose.xps.features.eventbasedmodifications/beforesavingeventargs/
---
**Inheritance:**
java.lang.Object
```
public class BeforeSavingEventArgs<T>
```

Definieert de basisklasse voor argumenten van verschillende before-saving gebeurtenissen.
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAbsolutePageNumber()](#getAbsolutePageNumber--) | Retourneert het huidige absolute paginanummer over alle documenten binnen het XPS-pakket. |
| [getClass()](#getClass--) |  |
| [getDocumentNumber()](#getDocumentNumber--) | Retourneert het huidige documentnummer binnen het XPS-pakket. |
| [getElementAPI()](#getElementAPI--) | Retourneert de wijzigings-API van het element dat op het punt staat te worden opgeslagen. |
| [getOutputPageNumber()](#getOutputPageNumber--) | Retourneert het huidige uitvoernummer. |
| [getRelativePageNumber()](#getRelativePageNumber--) | Retourneert het huidige paginanummer relatief ten opzichte van het huidige document binnen het XPS-pakket. |
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
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAbsolutePageNumber() {#getAbsolutePageNumber--}
```
public int getAbsolutePageNumber()
```


Retourneert het huidige absolute paginanummer over alle documenten binnen het XPS-pakket.

**Returns:**
int - Het huidige absolute paginanummer over alle documenten binnen het XPS-pakket.
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


Retourneert het huidige documentnummer binnen het XPS-pakket.

**Returns:**
int - Het huidige documentnummer binnen het XPS-pakket.
### getElementAPI() {#getElementAPI--}
```
public T getElementAPI()
```


Retourneert de wijzigings-API van het element dat op het punt staat te worden opgeslagen.

**Returns:**
T - De wijzigings-API van het element dat op het punt staat te worden opgeslagen.
### getOutputPageNumber() {#getOutputPageNumber--}
```
public int getOutputPageNumber()
```


Retourneert het huidige uitvoernummer. Het verschilt van **AbsolutePageNumber** als de **PageNumbers**-opslaanoptie is gespecificeerd.

**Returns:**
int - Het huidige uitvoernummer.
### getRelativePageNumber() {#getRelativePageNumber--}
```
public int getRelativePageNumber()
```


Retourneert het huidige paginanummer relatief ten opzichte van het huidige document binnen het XPS-pakket.

**Returns:**
int - Het huidige paginanummer relatief ten opzichte van het huidige document binnen het XPS-pakket.
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

