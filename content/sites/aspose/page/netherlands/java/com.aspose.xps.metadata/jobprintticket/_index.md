---
title: "JobPrintTicket"
second_title: "Aspose.Page voor Java API-referentie"
description: "De klasse die een printticket op taakniveau omvat."
type: docs
weight: 70
url: /nl/java/com.aspose.xps.metadata/jobprintticket/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicket](../../com.aspose.xps.metadata/printticket)
```
public final class JobPrintTicket extends PrintTicket
```

De klasse die een printticket op taakniveau omvat.
## Constructors

| Constructor | Beschrijving |
| --- | --- |
| [JobPrintTicket(IJobPrintTicketItem[] items)](#JobPrintTicket-com.aspose.xps.metadata.IJobPrintTicketItem...-) | Maakt een printticketinstantie op taakniveau aan. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [add(IJobPrintTicketItem[] items)](#add-com.aspose.xps.metadata.IJobPrintTicketItem...-) | Voegt een array van items toe aan het einde van deze PrintTicket‑itemlijst. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Retourneert de iterator voor de namen van printticket‑items. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(String[] names)](#remove-java.lang.String...-) | Verwijdert een item uit deze PrintTicket‑itemlijst. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### JobPrintTicket(IJobPrintTicketItem[] items) {#JobPrintTicket-com.aspose.xps.metadata.IJobPrintTicketItem...-}
```
public JobPrintTicket(IJobPrintTicketItem[] items)
```


Maakt een printticketinstantie op taakniveau aan.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| items | [IJobPrintTicketItem\[\]](../../com.aspose.xps.metadata/ijobprintticketitem) | Een willekeurige array van  IJobPrintTicketItem  instanties. Elke kan een  Feature , een  ParameterInit  of een  Property  instantie zijn. |

### add(IJobPrintTicketItem[] items) {#add-com.aspose.xps.metadata.IJobPrintTicketItem...-}
```
public void add(IJobPrintTicketItem[] items)
```


Voegt een array van items toe aan het einde van deze PrintTicket‑itemlijst. Elk item mag een Feature, een ParameterInit of een Property‑instantie zijn.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| items | [IJobPrintTicketItem\[\]](../../com.aspose.xps.metadata/ijobprintticketitem) | Een array van toe te voegen items. |

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


Retourneert de iterator voor de namen van printticket‑items.

**Returns:**
java.util.Iterator<java.lang.String> - Retourneert iterator voor de lijst.
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


Verwijdert een item uit deze PrintTicket‑itemlijst.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| namen | java.lang.String[] | Een array van itemnamen. |

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

