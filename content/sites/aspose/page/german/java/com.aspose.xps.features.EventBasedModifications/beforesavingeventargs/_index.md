---
title: "BeforeSavingEventArgs"
second_title: "Aspose.Page for Java API-Referenz"
description: "Definiert die Basisklasse für Argumente verschiedener before-saving-Ereignisse."
type: docs
weight: 11
url: /de/java/com.aspose.xps.features.eventbasedmodifications/beforesavingeventargs/
---
**Inheritance:**
java.lang.Object
```
public class BeforeSavingEventArgs<T>
```

Definiert die Basisklasse für Argumente verschiedener before-saving-Ereignisse.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAbsolutePageNumber()](#getAbsolutePageNumber--) | Gibt die aktuelle absolute Seitenzahl über alle Dokumente im XPS-Paket zurück. |
| [getClass()](#getClass--) |  |
| [getDocumentNumber()](#getDocumentNumber--) | Gibt die aktuelle Dokumentnummer im XPS-Paket zurück. |
| [getElementAPI()](#getElementAPI--) | Gibt die Änderungs-API des Elements zurück, das gespeichert werden soll. |
| [getOutputPageNumber()](#getOutputPageNumber--) | Gibt die aktuelle Ausgabennummer zurück. |
| [getRelativePageNumber()](#getRelativePageNumber--) | Gibt die aktuelle Seitenzahl relativ zum aktuellen Dokument im XPS-Paket zurück. |
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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAbsolutePageNumber() {#getAbsolutePageNumber--}
```
public int getAbsolutePageNumber()
```


Gibt die aktuelle absolute Seitenzahl über alle Dokumente im XPS-Paket zurück.

**Returns:**
int - Die aktuelle absolute Seitenzahl über alle Dokumente im XPS-Paket.
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


Gibt die aktuelle Dokumentnummer im XPS-Paket zurück.

**Returns:**
int - Die aktuelle Dokumentnummer im XPS-Paket.
### getElementAPI() {#getElementAPI--}
```
public T getElementAPI()
```


Gibt die Änderungs-API des Elements zurück, das gespeichert werden soll.

**Returns:**
T - Die Änderungs-API des Elements, das gespeichert werden soll.
### getOutputPageNumber() {#getOutputPageNumber--}
```
public int getOutputPageNumber()
```


Gibt die aktuelle Ausgabennummer zurück. Sie unterscheidet sich von **AbsolutePageNumber**, wenn die Speicheroption **PageNumbers** angegeben ist.

**Returns:**
int - Die aktuelle Ausgabennummer.
### getRelativePageNumber() {#getRelativePageNumber--}
```
public int getRelativePageNumber()
```


Gibt die aktuelle Seitenzahl relativ zum aktuellen Dokument im XPS-Paket zurück.

**Returns:**
int - Die aktuelle Seitenzahl relativ zum aktuellen Dokument im XPS-Paket.
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

