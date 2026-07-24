---
title: "DocumentOutputBin"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Describe la lista completa de bandejas compatibles para el dispositivo."
type: docs
weight: 30
url: /es/java/com.aspose.xps.metadata/documentoutputbin/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.OutputBin](../../com.aspose.xps.metadata/outputbin)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem)
```
public final class DocumentOutputBin extends OutputBin implements IJobPrintTicketItem, IDocumentPrintTicketItem
```

Describe la lista completa de bandejas compatibles para el dispositivo. Permite la especificación de la bandeja de salida por documento. Las palabras clave  JobOutputBin ,  DocumentOutputBin  y  PageOutputBin  son mutuamente excluyentes; solo una debe especificarse en un documento PrintTicket o de Capacidades de impresión. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin
## Constructores

| Constructor | Descripción |
| --- | --- |
| [DocumentOutputBin(OutputBin.IOutputBinItem[] items)](#DocumentOutputBin-com.aspose.xps.metadata.OutputBin.IOutputBinItem...-) | Crea una nueva instancia. |
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
### DocumentOutputBin(OutputBin.IOutputBinItem[] items) {#DocumentOutputBin-com.aspose.xps.metadata.OutputBin.IOutputBinItem...-}
```
public DocumentOutputBin(OutputBin.IOutputBinItem[] items)
```


Crea una nueva instancia.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| items | [IOutputBinItem\[\]](../../com.aspose.xps.metadata/ioutputbinitem) | Una matriz de elementos específicos para la característica. |

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

