---
title: "JobPrimaryCoverBack.CoverBackOption"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Describe las opciones de la característica JobPrimaryCoverBack."
type: docs
weight: 10
url: /es/java/com.aspose.xps.metadata/jobprimarycoverback.coverbackoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class JobPrimaryCoverBack.CoverBackOption extends Option
```

Describe las opciones de la función JobPrimaryCoverBack.
## Campos

| Campo | Descripción |
| --- | --- |
| [BlankCover](#BlankCover) | Especifica que se debe imprimir una hoja de cubierta en blanco. |
| [NoCover](#NoCover) | Especifica que no se generará ninguna cubierta. |
| [PrintBack](#PrintBack) | Especifica que la cubierta indicada por \"CoverBackSource\" debe imprimirse en el lado posterior de la hoja de cubierta. |
| [PrintBoth](#PrintBoth) | Especifica que la cubierta indicada por \"CoverBackSource\" puede imprimirse en cualquiera de los dos lados de la hoja de cubierta. |
| [PrintFront](#PrintFront) | Especifica que la cubierta indicada por \"CoverBackSource\" debe imprimirse en el lado frontal de la hoja de cubierta. |
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
### BlankCover {#BlankCover}
```
public static final JobPrimaryCoverBack.CoverBackOption BlankCover
```


Especifica que se debe imprimir una hoja de cubierta en blanco.

### NoCover {#NoCover}
```
public static final JobPrimaryCoverBack.CoverBackOption NoCover
```


Especifica que no se generará ninguna cubierta.

### PrintBack {#PrintBack}
```
public static final JobPrimaryCoverBack.CoverBackOption PrintBack
```


Especifica que la cubierta indicada por \"CoverBackSource\" debe imprimirse en el lado posterior de la hoja de cubierta. Si no se especifica un elemento JobPrimaryCoverBackSource ParameterInit, esta Opción debe ignorarse.

### PrintBoth {#PrintBoth}
```
public static final JobPrimaryCoverBack.CoverBackOption PrintBoth
```


Especifica que la cubierta indicada por \"CoverBackSource\" puede imprimirse en cualquiera de los dos lados de la hoja de cubierta. Si no se especifica un elemento JobPrimaryCoverBackSource ParameterInit, esta Opción debe ignorarse.

### PrintFront {#PrintFront}
```
public static final JobPrimaryCoverBack.CoverBackOption PrintFront
```


Especifica que la cubierta indicada por \"CoverBackSource\" debe imprimirse en el lado frontal de la hoja de cubierta. Si no se especifica un elemento JobPrimaryCoverBackSource ParameterInit, esta Opción debe ignorarse.

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

