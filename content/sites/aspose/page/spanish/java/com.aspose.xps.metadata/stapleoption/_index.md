---
title: "Staple.StapleOption"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Describe las opciones de las características JobStapleAllDocuments y DocumentStaple."
type: docs
weight: 10
url: /es/java/com.aspose.xps.metadata/staple.stapleoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class Staple.StapleOption extends Option
```

Describe las opciones de las características JobStapleAllDocuments y DocumentStaple.
## Constructores

| Constructor | Descripción |
| --- | --- |
| [StapleOption(String optionName, Staple.IStapleOptionItem[] items)](#StapleOption-java.lang.String-com.aspose.xps.metadata.Staple.IStapleOptionItem...-) | Crea una nueva instancia. |
## Campos

| Campo | Descripción |
| --- | --- |
| [None](#None) | Especifica que no hay engrampado. |
| [SaddleStitch](#SaddleStitch) | Especifica engrampado de costura de silla. |
| [StapleBottomLeft](#StapleBottomLeft) | Especifica un solo engrampado en la esquina inferior izquierda. |
| [StapleBottomRight](#StapleBottomRight) | Especifica un solo engrampado en la esquina inferior derecha. |
| [StapleDualBottom](#StapleDualBottom) | Especifica dos engrampados a lo largo del borde inferior. |
| [StapleDualLeft](#StapleDualLeft) | Especifica dos engrampados a lo largo del borde izquierdo. |
| [StapleDualRight](#StapleDualRight) | Especifica dos engrampados a lo largo del borde derecho. |
| [StapleDualTop](#StapleDualTop) | Especifica dos engrampados a lo largo del borde superior. |
| [StapleTopLeft](#StapleTopLeft) | Especifica un solo engrampado en la esquina superior izquierda. |
| [StapleTopRight](#StapleTopRight) | Especifica un solo engrampado en la esquina superior derecha. |
## Métodos

| Método | Descripción |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Agrega una lista de elementos al final de la lista de ítems de esta opción. |
| [add(Staple.IStapleOptionItem[] items)](#add-com.aspose.xps.metadata.Staple.IStapleOptionItem...-) | Agrega una matriz de instancias IStapleOptionItem a la característica. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Obtiene el nombre del elemento. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAngle(int angle)](#setAngle-int-) | Establece un valor de propiedad puntuado Angle. |
| [setSheetCapacity(int sheetCapacity)](#setSheetCapacity-int-) | Establece un valor de propiedad puntuado SheetCapacity. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StapleOption(String optionName, Staple.IStapleOptionItem[] items) {#StapleOption-java.lang.String-com.aspose.xps.metadata.Staple.IStapleOptionItem...-}
```
public StapleOption(String optionName, Staple.IStapleOptionItem[] items)
```


Crea una nueva instancia.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| optionName | java.lang.String | Un nombre de opción. |
| items | [IStapleOptionItem\[\]](../../com.aspose.xps.metadata/istapleoptionitem) | Una matriz arbitraria de instancias de IStapleOptionItem. |

### None {#None}
```
public static final Staple.StapleOption None
```


Especifica que no hay engrampado.

### SaddleStitch {#SaddleStitch}
```
public static final Staple.StapleOption SaddleStitch
```


Especifica engrampado de costura de silla.

### StapleBottomLeft {#StapleBottomLeft}
```
public static final Staple.StapleOption StapleBottomLeft
```


Especifica un solo engrampado en la esquina inferior izquierda.

### StapleBottomRight {#StapleBottomRight}
```
public static final Staple.StapleOption StapleBottomRight
```


Especifica un solo engrampado en la esquina inferior derecha.

### StapleDualBottom {#StapleDualBottom}
```
public static final Staple.StapleOption StapleDualBottom
```


Especifica dos engrampados a lo largo del borde inferior.

### StapleDualLeft {#StapleDualLeft}
```
public static final Staple.StapleOption StapleDualLeft
```


Especifica dos engrampados a lo largo del borde izquierdo.

### StapleDualRight {#StapleDualRight}
```
public static final Staple.StapleOption StapleDualRight
```


Especifica dos engrampados a lo largo del borde derecho.

### StapleDualTop {#StapleDualTop}
```
public static final Staple.StapleOption StapleDualTop
```


Especifica dos engrampados a lo largo del borde superior.

### StapleTopLeft {#StapleTopLeft}
```
public static final Staple.StapleOption StapleTopLeft
```


Especifica un solo engrampado en la esquina superior izquierda.

### StapleTopRight {#StapleTopRight}
```
public static final Staple.StapleOption StapleTopRight
```


Especifica un solo engrampado en la esquina superior derecha.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Agrega una lista de elementos al final de la lista de ítems de esta opción. Cada uno debe ser una instancia de  ScoredProperty  o de  Property .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Lista de elementos a agregar. |

### add(Staple.IStapleOptionItem[] items) {#add-com.aspose.xps.metadata.Staple.IStapleOptionItem...-}
```
public Staple.StapleOption add(Staple.IStapleOptionItem[] items)
```


Agrega una matriz de instancias IStapleOptionItem a la característica.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| items | [IStapleOptionItem\[\]](../../com.aspose.xps.metadata/istapleoptionitem) | Una matriz arbitraria de instancias de IStapleOptionItem. |

**Returns:**
[StapleOption](../../com.aspose.xps.metadata/stapleoption) - This options instance.
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




### setAngle(int angle) {#setAngle-int-}
```
public final Staple.StapleOption setAngle(int angle)
```


Establece un valor de propiedad puntuado Angle.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ángulo | int | Un valor de propiedad puntuado Angle. |

**Returns:**
[StapleOption](../../com.aspose.xps.metadata/stapleoption) - This option instance.
### setSheetCapacity(int sheetCapacity) {#setSheetCapacity-int-}
```
public final Staple.StapleOption setSheetCapacity(int sheetCapacity)
```


Establece un valor de propiedad puntuado SheetCapacity.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| sheetCapacity | int | Un valor de propiedad puntuado SheetCapacity. |

**Returns:**
[StapleOption](../../com.aspose.xps.metadata/stapleoption) - This option instance.
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

