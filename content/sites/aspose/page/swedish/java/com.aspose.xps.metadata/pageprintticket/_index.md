---
title: "PagePrintTicket"
second_title: "Aspose.Page för Java API-referens"
description: "Klassen som kapslar in ett sidnivå‑utskriftsbiljett."
type: docs
weight: 119
url: /sv/java/com.aspose.xps.metadata/pageprintticket/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicket](../../com.aspose.xps.metadata/printticket)
```
public final class PagePrintTicket extends PrintTicket
```

Klassen som kapslar in ett sidnivå‑utskriftsbiljett.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [PagePrintTicket(IPagePrintTicketItem[] items)](#PagePrintTicket-com.aspose.xps.metadata.IPagePrintTicketItem...-) | Skapar en utskriftsbiljett på sidnivå. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [add(IPagePrintTicketItem[] items)](#add-com.aspose.xps.metadata.IPagePrintTicketItem...-) | Lägger till en array av objekt i slutet av denna PrintTicket‑objektlista. |
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
### PagePrintTicket(IPagePrintTicketItem[] items) {#PagePrintTicket-com.aspose.xps.metadata.IPagePrintTicketItem...-}
```
public PagePrintTicket(IPagePrintTicketItem[] items)
```


Skapar en utskriftsbiljett på sidnivå.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| items | [IPagePrintTicketItem\[\]](../../com.aspose.xps.metadata/ipageprintticketitem) | En godtycklig matris av  IPagePrintTicketItem ‑instanser. Varje måste vara en  Feature , en  ParameterInit  eller en  Property ‑instans. |

### add(IPagePrintTicketItem[] items) {#add-com.aspose.xps.metadata.IPagePrintTicketItem...-}
```
public void add(IPagePrintTicketItem[] items)
```


Lägger till en matris av objekt i slutet av denna PrintTicket‑objektlista. Varje kan vara en  Feature , en  ParameterInit  eller en  Property ‑instans.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| items | [IPagePrintTicketItem\[\]](../../com.aspose.xps.metadata/ipageprintticketitem) | En array av objekt att lägga till. |

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

