---
title: "PrintTicket"
second_title: "Aspose.Page for Java API-Referenz"
description: "Die Klasse, die ein gemeinsames PrintTicket beliebigen Umfangs implementiert."
type: docs
weight: 141
url: /de/java/com.aspose.xps.metadata/printticket/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.Iterable
```
public abstract class PrintTicket implements Iterable<String>
```

Die Klasse, die ein allgemeines PrintTicket für beliebigen Geltungsbereich implementiert. Die Basisklasse für Job-, Dokument- und Seiten‑PrintTickets. Ein PrintTicket-Element ist das Wurzelelement des PrintTicket-Dokuments. Ein PrintTicket-Element enthält alle für die Ausgabe eines Jobs erforderlichen Formatierungsinformationen. https://docs.microsoft.com/en-us/windows/win32/printdocs/printticket
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [PrintTicket(IPrintTicketItem[] items)](#PrintTicket-com.aspose.xps.metadata.IPrintTicketItem...-) | Erstellt eine neue Instanz. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Gibt den Iterator für die Namen der PrintTicket-Elemente zurück. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(String[] names)](#remove-java.lang.String...-) | Entfernt ein Element aus dieser PrintTicket-Elementliste. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PrintTicket(IPrintTicketItem[] items) {#PrintTicket-com.aspose.xps.metadata.IPrintTicketItem...-}
```
public PrintTicket(IPrintTicketItem[] items)
```


Erstellt eine neue Instanz.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| items | [IPrintTicketItem\[\]](../../com.aspose.xps.metadata/iprintticketitem) | Ein beliebiges Array von IPrintTicketItem-Instanzen. Jede muss eine Feature-, eine ParameterInit- oder eine Property-Instanz sein. |

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
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### iterator() {#iterator--}
```
public Iterator<String> iterator()
```


Gibt den Iterator für die Namen der PrintTicket-Elemente zurück.

**Returns:**
java.util.Iterator<java.lang.String> - Gibt den Iterator für die Liste zurück.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### remove(String[] names) {#remove-java.lang.String...-}
```
public void remove(String[] names)
```


Entfernt ein Element aus dieser PrintTicket-Elementliste.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Namen | java.lang.String[] | Ein Array von Elementnamen. |

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

