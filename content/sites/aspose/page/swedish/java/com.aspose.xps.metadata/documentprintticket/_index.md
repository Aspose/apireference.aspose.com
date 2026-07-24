---
title: "DocumentPrintTicket"
second_title: "Aspose.Page för Java API-referens"
description: "Klassen som kapslar in ett dokumentnivå‑utskriftsticket."
type: docs
weight: 32
url: /sv/java/com.aspose.xps.metadata/documentprintticket/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicket](../../com.aspose.xps.metadata/printticket)
```
public final class DocumentPrintTicket extends PrintTicket
```

Klassen som kapslar in ett dokumentnivå‑utskriftsticket.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [DocumentPrintTicket(IDocumentPrintTicketItem[] items)](#DocumentPrintTicket-com.aspose.xps.metadata.IDocumentPrintTicketItem...-) | Skapar en dokumentnivå‑utskriftbiljettinstans. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [add(IDocumentPrintTicketItem[] items)](#add-com.aspose.xps.metadata.IDocumentPrintTicketItem...-) | Lägger till en array av objekt i slutet av denna PrintTicket‑objektlista. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Returnerar iteratorn för utskriftsbiljett‑objektnamnen. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(String[] names)](#remove-java.lang.String...-) | Tar bort ett objekt från denna PrintTicket‑objektlista. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### DocumentPrintTicket(IDocumentPrintTicketItem[] items) {#DocumentPrintTicket-com.aspose.xps.metadata.IDocumentPrintTicketItem...-}
```
public DocumentPrintTicket(IDocumentPrintTicketItem[] items)
```


Skapar en dokumentnivå‑utskriftbiljettinstans.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| items | [IDocumentPrintTicketItem\[\]](../../com.aspose.xps.metadata/idocumentprintticketitem) | En godtycklig array av  IDocumentPrintTicketItem ‑instanser. Varje måste vara en  Feature , en  ParameterInit  eller en  Property ‑instans. |

### add(IDocumentPrintTicketItem[] items) {#add-com.aspose.xps.metadata.IDocumentPrintTicketItem...-}
```
public void add(IDocumentPrintTicketItem[] items)
```


Lägger till en array av objekt i slutet av denna PrintTicket‑objektlista. Varje kan vara en  Feature , ett  Option  eller ett  Property ‑instans.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| items | [IDocumentPrintTicketItem\[\]](../../com.aspose.xps.metadata/idocumentprintticketitem) | En array av objekt att lägga till. |

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


Returnerar iteratorn för utskriftsbiljett‑objektnamnen.

**Returns:**
java.util.Iterator<java.lang.String> - Returnerar iterator för listan.
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


Tar bort ett objekt från denna PrintTicket‑objektlista.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| namn | java.lang.String[] | En array av objektnamn. |

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

