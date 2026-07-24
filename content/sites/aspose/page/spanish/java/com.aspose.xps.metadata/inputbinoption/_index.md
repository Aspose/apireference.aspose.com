---
title: "InputBin.InputBinOption"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Describe las opciones de características de JobInputBin DocumentInputBin y PageInputBin."
type: docs
weight: 14
url: /es/java/com.aspose.xps.metadata/inputbin.inputbinoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.InputBin.IInputBinItem](../../com.aspose.xps.metadata/iinputbinitem)
```
public static final class InputBin.InputBinOption extends Option implements InputBin.IInputBinItem
```

Describe las opciones de las características JobInputBin, DocumentInputBin y PageInputBin.
## Constructores

| Constructor | Descripción |
| --- | --- |
| [InputBinOption(String optionName, InputBin.IInputBinOptionItem[] items)](#InputBinOption-java.lang.String-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-) | Crea una nueva instancia. |
## Campos

| Campo | Descripción |
| --- | --- |
| [AutoSelect](#AutoSelect) | El dispositivo elegirá automáticamente la mejor opción según la configuración. |
| [AutoSheetFeeder](#AutoSheetFeeder) | Bandeja de entrada del dispositivo para impresoras de inyección de tinta. |
| [Cassette](#Cassette) | Especifica que la bandeja de alimentación es una casete. |
| [Manual](#Manual) | Especifica la bandeja de alimentación manual predeterminada. |
| [Tractor](#Tractor) | Especifica que la bandeja de alimentación es un tractor. |
## Métodos

| Método | Descripción |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Agrega una lista de elementos al final de la lista de ítems de esta opción. |
| [add(InputBin.IInputBinOptionItem[] items)](#add-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-) | Agrega una matriz de instancias de IInputBinOptionItem a la opción. |
| [clone()](#clone--) | Clona esta instancia de opción. |
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
### InputBinOption(String optionName, InputBin.IInputBinOptionItem[] items) {#InputBinOption-java.lang.String-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-}
```
public InputBinOption(String optionName, InputBin.IInputBinOptionItem[] items)
```


Crea una nueva instancia.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| optionName | java.lang.String | Un nombre de opción. |
| items | [IInputBinOptionItem\[\]](../../com.aspose.xps.metadata/iinputbinoptionitem) | Una matriz arbitraria de instancias de IInputBinOptionItem. |

### AutoSelect {#AutoSelect}
```
public static final InputBin.InputBinOption AutoSelect
```


El dispositivo elegirá automáticamente la mejor opción según la configuración.

### AutoSheetFeeder {#AutoSheetFeeder}
```
public static final InputBin.InputBinOption AutoSheetFeeder
```


Bandeja de entrada del dispositivo para impresoras de inyección de tinta.

### Cassette {#Cassette}
```
public static final InputBin.InputBinOption Cassette
```


Especifica que la bandeja de alimentación es una casete.

### Manual {#Manual}
```
public static final InputBin.InputBinOption Manual
```


Especifica la bandeja de alimentación manual predeterminada.

### Tractor {#Tractor}
```
public static final InputBin.InputBinOption Tractor
```


Especifica que la bandeja de alimentación es un tractor.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Agrega una lista de elementos al final de la lista de ítems de esta opción. Cada uno debe ser una instancia de  ScoredProperty  o de  Property .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Lista de elementos a agregar. |

### add(InputBin.IInputBinOptionItem[] items) {#add-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-}
```
public InputBin.InputBinOption add(InputBin.IInputBinOptionItem[] items)
```


Agrega una matriz de instancias de IInputBinOptionItem a la opción.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| items | [IInputBinOptionItem\[\]](../../com.aspose.xps.metadata/iinputbinoptionitem) | Una matriz arbitraria de instancias de IInputBinOptionItem. |

**Returns:**
[InputBinOption](../../com.aspose.xps.metadata/inputbinoption) - This options instance.
### clone() {#clone--}
```
public InputBin.InputBinOption clone()
```


Clona esta instancia de opción.

**Returns:**
[InputBinOption](../../com.aspose.xps.metadata/inputbinoption) - The clone of this option instance.
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

