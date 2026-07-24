---
title: "PageForceFrontSide"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Forza que la salida aparezca en la parte frontal de una hoja de medio."
type: docs
weight: 97
url: /es/java/com.aspose.xps.metadata/pageforcefrontside/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem), [com.aspose.xps.metadata.IPagePrintTicketItem](../../com.aspose.xps.metadata/ipageprintticketitem)
```
public final class PageForceFrontSide extends Feature implements IJobPrintTicketItem, IDocumentPrintTicketItem, IPagePrintTicketItem
```

Forza que la salida aparezca en el frente de una hoja de medio. Relevante para hojas de medio con superficies diferentes en cada lado. En casos donde esta característica interfiere con opciones de procesamiento (como DocumentDuplex), PageForceFrontSide tiene precedencia para la página específica a la que se aplica la característica.
## Constructores

| Constructor | Descripción |
| --- | --- |
| [PageForceFrontSide(PageForceFrontSide.PageForceFrontSideOption[] options)](#PageForceFrontSide-com.aspose.xps.metadata.PageForceFrontSide.PageForceFrontSideOption...-) | Crea una nueva instancia. |
## Métodos

| Método | Descripción |
| --- | --- |
| [add(IFeatureItem[] items)](#add-com.aspose.xps.metadata.IFeatureItem...-) | Agrega una lista de elementos al final de la lista de ítems de esta característica. |
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
### PageForceFrontSide(PageForceFrontSide.PageForceFrontSideOption[] options) {#PageForceFrontSide-com.aspose.xps.metadata.PageForceFrontSide.PageForceFrontSideOption...-}
```
public PageForceFrontSide(PageForceFrontSide.PageForceFrontSideOption[] options)
```


Crea una nueva instancia.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| options | [PageForceFrontSideOption\[\]](../../com.aspose.xps.metadata/pageforcefrontsideoption) | Una matriz de opciones específicas para la característica. |

### add(IFeatureItem[] items) {#add-com.aspose.xps.metadata.IFeatureItem...-}
```
public void add(IFeatureItem[] items)
```


Agrega una lista de elementos al final de la lista de ítems de esta característica. Cada uno debe ser una instancia de  Feature , una  Option , o una  Property .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | Lista de elementos a agregar. |

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

