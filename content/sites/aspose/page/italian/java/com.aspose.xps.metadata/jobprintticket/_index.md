---
title: "JobPrintTicket"
second_title: "Aspose.Page per Java API Reference"
description: "La classe che incapsula un ticket di stampa a livello di lavoro."
type: docs
weight: 70
url: /it/java/com.aspose.xps.metadata/jobprintticket/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicket](../../com.aspose.xps.metadata/printticket)
```
public final class JobPrintTicket extends PrintTicket
```

La classe che incapsula un ticket di stampa a livello di lavoro.
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [JobPrintTicket(IJobPrintTicketItem[] items)](#JobPrintTicket-com.aspose.xps.metadata.IJobPrintTicketItem...-) | Crea un'istanza di ticket di stampa a livello di lavoro. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [add(IJobPrintTicketItem[] items)](#add-com.aspose.xps.metadata.IJobPrintTicketItem...-) | Aggiunge un array di elementi alla fine di questo elenco di elementi PrintTicket. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Restituisce l'iteratore dei nomi degli elementi del ticket di stampa. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(String[] names)](#remove-java.lang.String...-) | Rimuove un elemento da questo elenco di elementi PrintTicket. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### JobPrintTicket(IJobPrintTicketItem[] items) {#JobPrintTicket-com.aspose.xps.metadata.IJobPrintTicketItem...-}
```
public JobPrintTicket(IJobPrintTicketItem[] items)
```


Crea un'istanza di ticket di stampa a livello di lavoro.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| items | [IJobPrintTicketItem\[\]](../../com.aspose.xps.metadata/ijobprintticketitem) | Un array arbitrario di istanze IJobPrintTicketItem. Ognuna può essere un Feature, un ParameterInit o un Property. |

### add(IJobPrintTicketItem[] items) {#add-com.aspose.xps.metadata.IJobPrintTicketItem...-}
```
public void add(IJobPrintTicketItem[] items)
```


Aggiunge un array di elementi alla fine di questo elenco di elementi PrintTicket. Ogni elemento può essere un'istanza di  Feature , di  ParameterInit  o di  Property .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| items | [IJobPrintTicketItem\[\]](../../com.aspose.xps.metadata/ijobprintticketitem) | Un array di elementi da aggiungere. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
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


Restituisce l'iteratore dei nomi degli elementi del ticket di stampa.

**Returns:**
java.util.Iterator<java.lang.String> - Restituisce l'iteratore per l'elenco.
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


Rimuove un elemento da questo elenco di elementi PrintTicket.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nomi | java.lang.String[] | Un array di nomi di elementi. |

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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

