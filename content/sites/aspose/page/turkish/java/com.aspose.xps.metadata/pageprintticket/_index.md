---
title: "PagePrintTicket"
second_title: "Java için Aspose.Page API Referansı"
description: "Sayfa düzeyinde bir yazdırma bileti kapsülleyen sınıf."
type: docs
weight: 119
url: /tr/java/com.aspose.xps.metadata/pageprintticket/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicket](../../com.aspose.xps.metadata/printticket)
```
public final class PagePrintTicket extends PrintTicket
```

Sayfa düzeyinde bir yazdırma bileti kapsülleyen sınıf.
## Yapıcılar

| Yapıcı | Açıklama |
| --- | --- |
| [PagePrintTicket(IPagePrintTicketItem[] items)](#PagePrintTicket-com.aspose.xps.metadata.IPagePrintTicketItem...-) | Sayfa düzeyinde bir yazdırma bileti örneği oluşturur. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [add(IPagePrintTicketItem[] items)](#add-com.aspose.xps.metadata.IPagePrintTicketItem...-) | Bu PrintTicket öğe listesine öğeler dizisini sona ekler. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Yazdırma bileti öğe adları yineleyicisini döndürür. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(String[] names)](#remove-java.lang.String...-) | Bu PrintTicket öğe listesinden bir öğeyi kaldırır. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PagePrintTicket(IPagePrintTicketItem[] items) {#PagePrintTicket-com.aspose.xps.metadata.IPagePrintTicketItem...-}
```
public PagePrintTicket(IPagePrintTicketItem[] items)
```


Sayfa düzeyinde bir yazdırma bileti örneği oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| items | [IPagePrintTicketItem\[\]](../../com.aspose.xps.metadata/ipageprintticketitem) | İsteğe bağlı bir dizi  IPagePrintTicketItem  örneği. Her biri bir  Feature , bir  ParameterInit  veya bir  Property  örneği olmalıdır. |

### add(IPagePrintTicketItem[] items) {#add-com.aspose.xps.metadata.IPagePrintTicketItem...-}
```
public void add(IPagePrintTicketItem[] items)
```


Bu PrintTicket öğe listesine bir dizi öğe ekler. Her biri bir  Feature , bir  ParameterInit  veya bir  Property  örneği olabilir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| items | [IPagePrintTicketItem\[\]](../../com.aspose.xps.metadata/ipageprintticketitem) | Eklenecek öğeler dizisi. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parametre | Tür | Açıklama |
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


Yazdırma bileti öğe adları yineleyicisini döndürür.

**Returns:**
java.util.Iterator<java.lang.String> - Liste için yineleyiciyi döndürür.
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


Bu PrintTicket öğe listesinden bir öğeyi kaldırır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| adlar | java.lang.String[] | Öğe adlarının bir dizisi. |

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
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

