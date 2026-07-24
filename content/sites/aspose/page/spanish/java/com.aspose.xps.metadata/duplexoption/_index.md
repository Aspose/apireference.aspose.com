---
title: "Duplex.DuplexOption"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Describe las opciones de las características JobDuplexAllDocumentsContiguously y DocumentDuplex."
type: docs
weight: 11
url: /es/java/com.aspose.xps.metadata/duplex.duplexoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class Duplex.DuplexOption extends Option
```

Describe las opciones de las características **JobDuplexAllDocumentsContiguously** y **DocumentDuplex**.
## Campos

| Campo | Descripción |
| --- | --- |
| [OneSided](#OneSided) | Especifica la impresión a una cara. |
## Métodos

| Método | Descripción |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Agrega una lista de elementos al final de la lista de ítems de esta opción. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Obtiene el nombre del elemento. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [twoSidedLongEdge(Duplex.DuplexMode duplexMode)](#twoSidedLongEdge-com.aspose.xps.metadata.Duplex.DuplexMode-) | Especifica la impresión a doble cara de modo que la página se voltee paralelamente a la dirección MediaSizeHeight. |
| [twoSidedShortEdge(Duplex.DuplexMode duplexMode)](#twoSidedShortEdge-com.aspose.xps.metadata.Duplex.DuplexMode-) | Especifica la impresión a doble cara de modo que la página se voltee paralelamente a la dirección MediaSizeWidth. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### OneSided {#OneSided}
```
public static final Duplex.DuplexOption OneSided
```


Especifica la impresión a una cara.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Agrega una lista de elementos al final de la lista de ítems de esta opción. Cada uno debe ser una instancia de  ScoredProperty  o de  Property .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Lista de elementos a agregar. |

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
### twoSidedLongEdge(Duplex.DuplexMode duplexMode) {#twoSidedLongEdge-com.aspose.xps.metadata.Duplex.DuplexMode-}
```
public static final Duplex.DuplexOption twoSidedLongEdge(Duplex.DuplexMode duplexMode)
```


Especifica la impresión a doble cara de modo que la página se voltee paralelamente a la dirección MediaSizeHeight.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| duplexMode | [DuplexMode](../../com.aspose.xps.metadata/duplexmode) | El  DuplexMode |

**Returns:**
[DuplexOption](../../com.aspose.xps.metadata/duplexoption) - The  Duplex  option.
### twoSidedShortEdge(Duplex.DuplexMode duplexMode) {#twoSidedShortEdge-com.aspose.xps.metadata.Duplex.DuplexMode-}
```
public static final Duplex.DuplexOption twoSidedShortEdge(Duplex.DuplexMode duplexMode)
```


Especifica la impresión a doble cara de modo que la página se voltee paralelamente a la dirección MediaSizeWidth.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| duplexMode | [DuplexMode](../../com.aspose.xps.metadata/duplexmode) | El  DuplexMode |

**Returns:**
[DuplexOption](../../com.aspose.xps.metadata/duplexoption) - The

```
Duplex
```

opción.
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

