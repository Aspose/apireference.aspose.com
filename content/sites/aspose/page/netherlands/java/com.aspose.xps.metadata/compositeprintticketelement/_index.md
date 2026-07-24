---
title: "CompositePrintTicketElement"
second_title: "Aspose.Page voor Java API-referentie"
description: "De basisklasse voor klassen die samengestelde Print Schema-elementen kunnen zijn, d.w.z. elementen die andere elementen bevatten."
type: docs
weight: 11
url: /nl/java/com.aspose.xps.metadata/compositeprintticketelement/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement)
```
public abstract class CompositePrintTicketElement extends PrintTicketElement
```

De basisklasse voor klassen die samengestelde Print Schema-elementen kunnen zijn (d.w.z. elementen die andere elementen bevatten).
## Constructors

| Constructor | Beschrijving |
| --- | --- |
| [CompositePrintTicketElement(String name, IPrintTicketElementChild[] items)](#CompositePrintTicketElement-java.lang.String-com.aspose.xps.metadata.IPrintTicketElementChild...-) | Maakt een nieuw exemplaar aan. |
| [CompositePrintTicketElement(CompositePrintTicketElement element)](#CompositePrintTicketElement-com.aspose.xps.metadata.CompositePrintTicketElement-) | Kloont deze elementinstantie. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Haalt de elementnaam op. |
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


Maakt een nieuw exemplaar aan.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| naam | java.lang.String | De naam van het element volgens een XML-schema (Microsoft Print Schema Framework of ander). |
| items | [IPrintTicketElementChild\[\]](../../com.aspose.xps.metadata/iprintticketelementchild) | Een willekeurige array van onderliggende items. |

### CompositePrintTicketElement(CompositePrintTicketElement element) {#CompositePrintTicketElement-com.aspose.xps.metadata.CompositePrintTicketElement-}
```
public CompositePrintTicketElement(CompositePrintTicketElement element)
```


Kloont deze elementinstantie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| element | [CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement) | Een elementinstantie om te klonen. |

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
### getName() {#getName--}
```
public String getName()
```


Haalt de elementnaam op.

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

