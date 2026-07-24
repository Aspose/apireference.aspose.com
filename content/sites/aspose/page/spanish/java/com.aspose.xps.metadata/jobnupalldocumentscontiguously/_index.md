---
title: "JobNUpAllDocumentsContiguously"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Describe la salida de múltiples páginas lógicas a una sola hoja física."
type: docs
weight: 58
url: /es/java/com.aspose.xps.metadata/jobnupalldocumentscontiguously/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.NUp](../../com.aspose.xps.metadata/nup)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobNUpAllDocumentsContiguously extends NUp implements IJobPrintTicketItem
```

Describe la salida de múltiples páginas lógicas a una sola hoja física. Todos los documentos en el trabajo se compilan juntos de forma contigua. JobNUpAllDocumentsContiguously y DocumentNUp son mutuamente excluyentes. Depende del controlador determinar el manejo de restricciones entre estas palabras clave. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobnupalldocumentscontiguously
## Constructores

| Constructor | Descripción |
| --- | --- |
| [JobNUpAllDocumentsContiguously(NUp.INUpItem[] items)](#JobNUpAllDocumentsContiguously-com.aspose.xps.metadata.NUp.INUpItem...-) | Crea una nueva instancia. |
## Métodos

| Método | Descripción |
| --- | --- |
| [add(IFeatureItem[] items)](#add-com.aspose.xps.metadata.IFeatureItem...-) | Agrega una lista de elementos al final de la lista de ítems de esta característica. |
| [addPagesPerSheetOption(int value)](#addPagesPerSheetOption-int-) | Agrega una opción con un valor de propiedad puntuado PagesPerSheet. |
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
### JobNUpAllDocumentsContiguously(NUp.INUpItem[] items) {#JobNUpAllDocumentsContiguously-com.aspose.xps.metadata.NUp.INUpItem...-}
```
public JobNUpAllDocumentsContiguously(NUp.INUpItem[] items)
```


Crea una nueva instancia.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| items | [INUpItem\[\]](../../com.aspose.xps.metadata/inupitem) | Una matriz de elementos específicos para la característica. |

### add(IFeatureItem[] items) {#add-com.aspose.xps.metadata.IFeatureItem...-}
```
public void add(IFeatureItem[] items)
```


Agrega una lista de elementos al final de la lista de ítems de esta característica. Cada uno debe ser una instancia de  Feature , una  Option , o una  Property .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | Lista de elementos a agregar. |

### addPagesPerSheetOption(int value) {#addPagesPerSheetOption-int-}
```
public JobNUpAllDocumentsContiguously addPagesPerSheetOption(int value)
```


Agrega una opción con un valor de propiedad puntuado PagesPerSheet. Especifica el número de páginas lógicas por hoja física.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | int | Un valor de propiedad puntuado PagesPerSheet. El conjunto admitido puede ser cualquier conjunto de enteros, por ejemplo \{1,2,4,6,8,9,16\}. |

**Returns:**
[JobNUpAllDocumentsContiguously](../../com.aspose.xps.metadata/jobnupalldocumentscontiguously) - This feature instance.
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

