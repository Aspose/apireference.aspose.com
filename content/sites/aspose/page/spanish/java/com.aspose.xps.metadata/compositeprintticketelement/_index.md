---
title: "CompositePrintTicketElement"
second_title: "Referencia de API de Aspose.Page para Java"
description: "La clase base para clases que pueden ser elementos compuestos del Print Schema, es decir, que contienen otros elementos."
type: docs
weight: 11
url: /es/java/com.aspose.xps.metadata/compositeprintticketelement/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement)
```
public abstract class CompositePrintTicketElement extends PrintTicketElement
```

La clase base para clases que pueden ser elementos compuestos del esquema de impresión (es decir, que contienen otros elementos).
## Constructores

| Constructor | Descripción |
| --- | --- |
| [CompositePrintTicketElement(String name, IPrintTicketElementChild[] items)](#CompositePrintTicketElement-java.lang.String-com.aspose.xps.metadata.IPrintTicketElementChild...-) | Crea una nueva instancia. |
| [CompositePrintTicketElement(CompositePrintTicketElement element)](#CompositePrintTicketElement-com.aspose.xps.metadata.CompositePrintTicketElement-) | Clona esta instancia del elemento. |
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Obtiene el nombre del elemento. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### CompositePrintTicketElement(String name, IPrintTicketElementChild[] items) {#CompositePrintTicketElement-java.lang.String-com.aspose.xps.metadata.IPrintTicketElementChild...-}
```
public CompositePrintTicketElement(String name, IPrintTicketElementChild[] items)
```


Crea una nueva instancia.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| name | java.lang.String | El nombre del elemento según algún esquema XML (Microsoft Print Schema Framework u otro). |
| items | [IPrintTicketElementChild\[\]](../../com.aspose.xps.metadata/iprintticketelementchild) | Una matriz arbitraria de elementos secundarios. |

### CompositePrintTicketElement(CompositePrintTicketElement element) {#CompositePrintTicketElement-com.aspose.xps.metadata.CompositePrintTicketElement-}
```
public CompositePrintTicketElement(CompositePrintTicketElement element)
```


Clona esta instancia del elemento.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| element | [CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement) | Una instancia de elemento para clonar. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
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
### getName() {#getName--}
```
public String getName()
```


Obtiene el nombre del elemento.

**Returns:**
java.lang.String
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
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

