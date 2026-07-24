---
title: "PrintTicket"
second_title: "Aspose.Page per Java API Reference"
description: "La classe che implementa un PrintTicket comune di qualsiasi ambito."
type: docs
weight: 141
url: /it/java/com.aspose.xps.metadata/printticket/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.Iterable
```
public abstract class PrintTicket implements Iterable<String>
```

La classe che implementa un PrintTicket comune di qualsiasi ambito. La classe base per i ticket di stampa a livello di lavoro, documento e pagina. Un elemento PrintTicket è l'elemento radice del documento PrintTicket. Un elemento PrintTicket contiene tutte le informazioni di formattazione del lavoro necessarie per produrre un lavoro. https://docs.microsoft.com/en-us/windows/win32/printdocs/printticket
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [PrintTicket(IPrintTicketItem[] items)](#PrintTicket-com.aspose.xps.metadata.IPrintTicketItem...-) | Crea una nuova istanza. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
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
### PrintTicket(IPrintTicketItem[] items) {#PrintTicket-com.aspose.xps.metadata.IPrintTicketItem...-}
```
public PrintTicket(IPrintTicketItem[] items)
```


Crea una nuova istanza.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| items | [IPrintTicketItem\[\]](../../com.aspose.xps.metadata/iprintticketitem) | Un array arbitrario di istanze IPrintTicketItem. Ognuna deve essere un'istanza di Feature, ParameterInit o Property. |

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

