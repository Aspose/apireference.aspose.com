---
title: "PageColorManagement.PageColorManagementOption"
second_title: "Aspose.Page per Java API Reference"
description: "Descrive le opzioni della funzionalità PageColorManagement."
type: docs
weight: 10
url: /it/java/com.aspose.xps.metadata/pagecolormanagement.pagecolormanagementoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageColorManagement.PageColorManagementOption extends Option
```

Descrive le opzioni della funzionalità  PageColorManagement  .
## Campi

| Campo | Descrizione |
| --- | --- |
| [Device](#Device) | L'applicazione non ha eseguito la gestione del colore e il dispositivo determina la gestione del colore. |
| [Driver](#Driver) | L'applicazione non ha eseguito la gestione del colore e il driver determina la gestione del colore. |
| [None](#None) | L'applicazione ha eseguito la gestione del colore verso il profilo di destinazione. |
| [System](#System) | La gestione del colore è eseguita dal sistema. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Aggiunge un elenco di elementi alla fine dell'elenco degli elementi di questa opzione. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Ottiene il nome dell'elemento. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Device {#Device}
```
public static PageColorManagement.PageColorManagementOption Device
```


L'applicazione non ha eseguito la gestione del colore e il dispositivo determina la gestione del colore.

### Driver {#Driver}
```
public static PageColorManagement.PageColorManagementOption Driver
```


L'applicazione non ha eseguito la gestione del colore e il driver determina la gestione del colore.

### None {#None}
```
public static PageColorManagement.PageColorManagementOption None
```


L'applicazione ha eseguito la gestione del colore verso il profilo di destinazione.

### System {#System}
```
public static PageColorManagement.PageColorManagementOption System
```


La gestione del colore è eseguita dal sistema. Non da utilizzare quando si stampa con driver di stampa XPSDrv.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Aggiunge un elenco di elementi alla fine dell'elenco degli elementi di questa opzione. Ognuno deve essere un'istanza di  ScoredProperty  o di  Property .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Elenco di elementi da aggiungere. |

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
### getName() {#getName--}
```
public String getName()
```


Ottiene il nome dell'elemento.

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

