---
title: "PageOutputColor.PageOutputColorOption"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Describe las opciones de la característica PageOutputColor."
type: docs
weight: 10
url: /es/java/com.aspose.xps.metadata/pageoutputcolor.pageoutputcoloroption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageOutputColor.IPageOutputColorItem](../../com.aspose.xps.metadata/ipageoutputcoloritem)
```
public static final class PageOutputColor.PageOutputColorOption extends Option implements PageOutputColor.IPageOutputColorItem
```

Describe opciones de la característica PageOutputColor.
## Constructores

| Constructor | Descripción |
| --- | --- |
| [PageOutputColorOption(String optionName, PageOutputColor.IPageOutputColorOptionItem[] items)](#PageOutputColorOption-java.lang.String-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-) | Crea una nueva instancia. |
## Métodos

| Método | Descripción |
| --- | --- |
| [Color(int deviceBitsPerPixel, int driverBitsPerPixel)](#Color-int-int-) | Especifica que la salida debe ser en color. |
| [Grayscale(int deviceBitsPerPixel, int driverBitsPerPixel)](#Grayscale-int-int-) | Especifica que la salida debe ser en escala de grises. |
| [Monochrome(int deviceBitsPerPixel, int driverBitsPerPixel)](#Monochrome-int-int-) | Especifica que la salida debe ser en monocromo (Negro). |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Agrega una lista de elementos al final de la lista de ítems de esta opción. |
| [add(PageOutputColor.IPageOutputColorOptionItem[] items)](#add-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-) | Agrega una matriz de  IPageOutputColorOptionItem  instancias a la opción. |
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
### PageOutputColorOption(String optionName, PageOutputColor.IPageOutputColorOptionItem[] items) {#PageOutputColorOption-java.lang.String-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-}
```
public PageOutputColorOption(String optionName, PageOutputColor.IPageOutputColorOptionItem[] items)
```


Crea una nueva instancia.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| optionName | java.lang.String | Un nombre de opción. |
| items | [IPageOutputColorOptionItem\[\]](../../com.aspose.xps.metadata/ipageoutputcoloroptionitem) | Una matriz arbitraria de  IPageOutputColorOptionItem  instancias. |

### Color(int deviceBitsPerPixel, int driverBitsPerPixel) {#Color-int-int-}
```
public static final PageOutputColor.PageOutputColorOption Color(int deviceBitsPerPixel, int driverBitsPerPixel)
```


Especifica que la salida debe ser en color.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| deviceBitsPerPixel | int | Un valor de propiedad puntuado  DeviceBitsPerPixel  que indica el número de bits por píxel de datos de color admitidos por la impresora. |
| driverBitsPerPixel | int | Un valor de propiedad puntuado DriverBitsPerPixel que indica la cantidad de bits por píxel que el controlador principal debe usar para su búfer de renderizado de mapas de bits. |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - The  PageOutputColor  options.
### Grayscale(int deviceBitsPerPixel, int driverBitsPerPixel) {#Grayscale-int-int-}
```
public static final PageOutputColor.PageOutputColorOption Grayscale(int deviceBitsPerPixel, int driverBitsPerPixel)
```


Especifica que la salida debe ser en escala de grises.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| deviceBitsPerPixel | int | Un valor de propiedad puntuado  DeviceBitsPerPixel  que indica el número de bits por píxel de datos de color admitidos por la impresora. |
| driverBitsPerPixel | int | Un valor de propiedad puntuado DriverBitsPerPixel que indica la cantidad de bits por píxel que el controlador principal debe usar para su búfer de renderizado de mapas de bits. |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - The  PageOutputColor  options.
### Monochrome(int deviceBitsPerPixel, int driverBitsPerPixel) {#Monochrome-int-int-}
```
public static final PageOutputColor.PageOutputColorOption Monochrome(int deviceBitsPerPixel, int driverBitsPerPixel)
```


Especifica que la salida debe ser en monocromo (Negro).

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| deviceBitsPerPixel | int | Un valor de propiedad puntuado  DeviceBitsPerPixel  que indica el número de bits por píxel de datos de color admitidos por la impresora. |
| driverBitsPerPixel | int | Un valor de propiedad puntuado DriverBitsPerPixel que indica la cantidad de bits por píxel que el controlador principal debe usar para su búfer de renderizado de mapas de bits. |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - The  PageOutputColor  options.
### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Agrega una lista de elementos al final de la lista de ítems de esta opción. Cada uno debe ser una instancia de  ScoredProperty  o de  Property .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Lista de elementos a agregar. |

### add(PageOutputColor.IPageOutputColorOptionItem[] items) {#add-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-}
```
public PageOutputColor.PageOutputColorOption add(PageOutputColor.IPageOutputColorOptionItem[] items)
```


Agrega una matriz de  IPageOutputColorOptionItem  instancias a la opción.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| items | [IPageOutputColorOptionItem\[\]](../../com.aspose.xps.metadata/ipageoutputcoloroptionitem) | Una matriz arbitraria de  IPageOutputColorOptionItem  instancias. |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - This options instance.
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

