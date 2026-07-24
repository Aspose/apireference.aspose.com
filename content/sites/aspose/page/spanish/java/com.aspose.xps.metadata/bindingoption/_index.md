---
title: "JobBindAllDocuments.BindingOption"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Describe las opciones de la característica JobBindAllDocuments."
type: docs
weight: 11
url: /es/java/com.aspose.xps.metadata/jobbindalldocuments.bindingoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class JobBindAllDocuments.BindingOption extends Option
```

Describe las opciones de la característica JobBindAllDocuments.
## Constructores

| Constructor | Descripción |
| --- | --- |
| [BindingOption(String name, JobBindAllDocuments.IBindingOptionItem[] items)](#BindingOption-java.lang.String-com.aspose.xps.metadata.JobBindAllDocuments.IBindingOptionItem...-) | Crea una nueva instancia. |
## Campos

| Campo | Descripción |
| --- | --- |
| [Bale](#Bale) | Especifica el encuadernado de fardos. |
| [BindBottom](#BindBottom) | Especifica el encuadernado a lo largo del borde inferior. |
| [BindLeft](#BindLeft) | Especifica el encuadernado a lo largo del borde izquierdo. |
| [BindRight](#BindRight) | Especifica el encuadernado a lo largo del borde derecho. |
| [BindTop](#BindTop) | Especifica el encuadernado a lo largo del borde superior. |
| [Booklet](#Booklet) | Especifica la encuadernación de folleto. |
| [EdgeStitchBottom](#EdgeStitchBottom) | Especifica la costura del borde a lo largo del borde inferior. |
| [EdgeStitchLeft](#EdgeStitchLeft) | Especifica la costura del borde a lo largo del borde izquierdo. |
| [EdgeStitchRight](#EdgeStitchRight) | Especifica la costura del borde a lo largo del borde derecho. |
| [EdgeStitchTop](#EdgeStitchTop) | Especifica la costura del borde a lo largo del borde superior. |
| [Fold](#Fold) | Especifica una encuadernación plegada. |
| [JogOffset](#JogOffset) | Especifica la encuadernación con desplazamiento jog. |
| [None](#None) | Especifica sin encuadernación. |
| [Trim](#Trim) | Especifica la encuadernación de recorte. |
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
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### BindingOption(String name, JobBindAllDocuments.IBindingOptionItem[] items) {#BindingOption-java.lang.String-com.aspose.xps.metadata.JobBindAllDocuments.IBindingOptionItem...-}
```
public BindingOption(String name, JobBindAllDocuments.IBindingOptionItem[] items)
```


Crea una nueva instancia.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| name | java.lang.String | Un nombre de opción. |
| items | [IBindingOptionItem\[\]](../../com.aspose.xps.metadata/ibindingoptionitem) | Una matriz de elementos secundarios válidos. |

### Bale {#Bale}
```
public static final JobBindAllDocuments.BindingOption Bale
```


Especifica el encuadernado de fardos.

### BindBottom {#BindBottom}
```
public static final JobBindAllDocuments.BindingOption BindBottom
```


Especifica el encuadernado a lo largo del borde inferior.

### BindLeft {#BindLeft}
```
public static final JobBindAllDocuments.BindingOption BindLeft
```


Especifica el encuadernado a lo largo del borde izquierdo.

### BindRight {#BindRight}
```
public static final JobBindAllDocuments.BindingOption BindRight
```


Especifica el encuadernado a lo largo del borde derecho.

### BindTop {#BindTop}
```
public static final JobBindAllDocuments.BindingOption BindTop
```


Especifica el encuadernado a lo largo del borde superior.

### Booklet {#Booklet}
```
public static final JobBindAllDocuments.BindingOption Booklet
```


Especifica la encuadernación de folleto.

### EdgeStitchBottom {#EdgeStitchBottom}
```
public static final JobBindAllDocuments.BindingOption EdgeStitchBottom
```


Especifica la costura del borde a lo largo del borde inferior.

### EdgeStitchLeft {#EdgeStitchLeft}
```
public static final JobBindAllDocuments.BindingOption EdgeStitchLeft
```


Especifica la costura del borde a lo largo del borde izquierdo.

### EdgeStitchRight {#EdgeStitchRight}
```
public static final JobBindAllDocuments.BindingOption EdgeStitchRight
```


Especifica la costura del borde a lo largo del borde derecho.

### EdgeStitchTop {#EdgeStitchTop}
```
public static final JobBindAllDocuments.BindingOption EdgeStitchTop
```


Especifica la costura del borde a lo largo del borde superior.

### Fold {#Fold}
```
public static final JobBindAllDocuments.BindingOption Fold
```


Especifica una encuadernación plegada.

### JogOffset {#JogOffset}
```
public static final JobBindAllDocuments.BindingOption JogOffset
```


Especifica la encuadernación con desplazamiento jog.

### None {#None}
```
public static final JobBindAllDocuments.BindingOption None
```


Especifica sin encuadernación.

### Trim {#Trim}
```
public static final JobBindAllDocuments.BindingOption Trim
```


Especifica la encuadernación de recorte.

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

