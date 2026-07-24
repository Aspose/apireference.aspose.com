---
title: "XpsCanvas"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Clase que encapsula características del elemento Canvas."
type: docs
weight: 16
url: /es/java/com.aspose.xps/xpscanvas/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsCanvas extends XpsContentElement
```

Clase que encapsula características del elemento Canvas. Este elemento agrupa elementos juntos. Por ejemplo, los elementos Glyphs y Path pueden agruparse en un canvas para ser identificados como una unidad (como destino de hipervínculo) o para aplicar un valor de propiedad compuesto a cada elemento hijo y ancestro.
## Métodos

| Método | Descripción |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | Agrega un elemento a la lista de hijos de este lienzo. |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Inserta un elemento en la lista de hijos de este lienzo en la posición de índice. |
| [addCanvas()](#addCanvas--) | Agrega un nuevo lienzo a la lista de hijos de este lienzo. |
| [addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Agrega nuevos glifos a la lista de hijos de este lienzo. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Agrega una nueva ruta a la lista de hijos de este lienzo. |
| [deepClone()](#deepClone--) | Clona este lienzo. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Proporciona acceso a los hijos del elemento por índice i. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Devuelve la geometría de ruta que limita la región renderizada del elemento. |
| [getEdgeMode()](#getEdgeMode--) | Devuelve el valor que controla cómo se renderizan los bordes de las rutas dentro del lienzo. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Devuelve el objeto de destino del hipervínculo. |
| [getOpacity()](#getOpacity--) | Devuelve el valor que define la transparencia uniforme del elemento. |
| [getOpacityMask()](#getOpacityMask--) | Devuelve el pincel que especifica una máscara de valores alfa que se aplica al elemento de la misma manera que el atributo Opacity, pero permite diferentes valores alfa para distintas áreas del elemento. |
| [getRenderTransform()](#getRenderTransform--) | Devuelve la matriz de transformación afín que establece un nuevo marco de coordenadas para todos los atributos del elemento y para todos los elementos hijos (si los hay). |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | Inserta un nuevo lienzo en la lista de hijos de este lienzo en la posición de índice. |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Inserta nuevos glifos en la lista de hijos de este lienzo en la posición de índice. |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Inserta una nueva ruta en la lista de hijos de este lienzo en la posición de índice. |
| [iterator()](#iterator--) | Implementación de la interfaz Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Establece la geometría de ruta que limita la región renderizada del elemento. |
| [setEdgeMode(XpsEdgeMode value)](#setEdgeMode-com.aspose.xps.XpsEdgeMode-) | Establece el valor que controla cómo se renderizan los bordes de las rutas dentro del lienzo. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Establece el objeto de destino del hipervínculo. |
| [setOpacity(float value)](#setOpacity-float-) | Establece el valor que define la transparencia uniforme del elemento. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Establece el pincel que especifica una máscara de valores alfa que se aplica al elemento de la misma manera que el atributo Opacity, pero permite diferentes valores alfa para distintas áreas del elemento. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Establece la matriz de transformación afín que crea un nuevo marco de coordenadas para todos los atributos del elemento y para todos los elementos hijos (si los hay). |
| [size()](#size--) | Devuelve el número de elementos hijos. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


Agrega un elemento a la lista de hijos de este lienzo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| elemento | T | El elemento a agregar. |

**Returns:**
T - Elemento agregado.
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


Inserta un elemento en la lista de hijos de este lienzo en la posición de índice.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Posición en la que se debe insertar un elemento. |
| elemento | T | El elemento a insertar. |

**Returns:**
T - Elemento insertado.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


Agrega un nuevo lienzo a la lista de hijos de este lienzo.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Agrega nuevos glifos a la lista de hijos de este lienzo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontFamily | java.lang.String | Familia de fuente. |
| fontSize | float | Tamaño de fuente. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Estilo de fuente. |
| originX | float | Coordenada X de origen de los glifos. |
| originY | float | Coordenada T de origen de los glifos. |
| unicodeString | java.lang.String | Cadena a imprimir. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Agrega una nueva ruta a la lista de hijos de este lienzo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La geometría de la ruta. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### deepClone() {#deepClone--}
```
public XpsCanvas deepClone()
```


Clona este lienzo.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Clone of this canvas.
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
### get(int i) {#get-int-}
```
public XpsContentElement get(int i)
```


Proporciona acceso a los hijos del elemento por índice i.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| i | int | Índice del elemento hijo. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Child element at  i  position.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getClip() {#getClip--}
```
public XpsPathGeometry getClip()
```


Devuelve la geometría de ruta que limita la región renderizada del elemento.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The path geometry limiting the rendered region of the element.
### getEdgeMode() {#getEdgeMode--}
```
public XpsEdgeMode getEdgeMode()
```


Devuelve el valor que controla cómo se renderizan los bordes de las rutas dentro del lienzo.

**Returns:**
[XpsEdgeMode](../../com.aspose.xps/xpsedgemode) - The edge rendering mode.
### getHyperlinkTarget() {#getHyperlinkTarget--}
```
public XpsHyperlinkTarget getHyperlinkTarget()
```


Devuelve el objeto de destino del hipervínculo.

**Returns:**
[XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) - Hyperlink target object.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Devuelve el valor que define la transparencia uniforme del elemento.

**Returns:**
float - El valor que define la transparencia uniforme del elemento.
### getOpacityMask() {#getOpacityMask--}
```
public XpsBrush getOpacityMask()
```


Devuelve el pincel que especifica una máscara de valores alfa que se aplica al elemento de la misma manera que el atributo Opacity, pero permite diferentes valores alfa para distintas áreas del elemento.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush specifying a mask.
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


Devuelve la matriz de transformación afín que establece un nuevo marco de coordenadas para todos los atributos del elemento y para todos los elementos hijos (si los hay).

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### insertCanvas(int index) {#insertCanvas-int-}
```
public XpsCanvas insertCanvas(int index)
```


Inserta un nuevo lienzo en la lista de hijos de este lienzo en la posición de índice.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Posición en la que se debe insertar un nuevo lienzo. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Inserta nuevos glifos en la lista de hijos de este lienzo en la posición de índice.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Posición en la que se deben insertar los nuevos glifos. |
| fontFamily | java.lang.String | Familia de fuente. |
| fontSize | float | Tamaño de fuente. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Estilo de fuente. |
| originX | float | Coordenada X de origen de los glifos. |
| originY | float | Coordenada T de origen de los glifos. |
| unicodeString | java.lang.String | Cadena a imprimir. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Inserta una nueva ruta en la lista de hijos de este lienzo en la posición de índice.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Posición en la que se debe insertar una nueva ruta. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La geometría de la ruta. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
### iterator() {#iterator--}
```
public Iterator<XpsContentElement> iterator()
```


Implementación de la interfaz Iterable.

**Returns:**
java.util.Iterator<com.aspose.xps.XpsContentElement> - Devuelve el enumerador de la lista.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setClip(XpsPathGeometry value) {#setClip-com.aspose.xps.XpsPathGeometry-}
```
public void setClip(XpsPathGeometry value)
```


Establece la geometría de ruta que limita la región renderizada del elemento.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La geometría de ruta que limita la región renderizada del elemento. |

### setEdgeMode(XpsEdgeMode value) {#setEdgeMode-com.aspose.xps.XpsEdgeMode-}
```
public void setEdgeMode(XpsEdgeMode value)
```


Establece el valor que controla cómo se renderizan los bordes de las rutas dentro del lienzo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [XpsEdgeMode](../../com.aspose.xps/xpsedgemode) | El modo de renderizado de bordes. |

### setHyperlinkTarget(XpsHyperlinkTarget value) {#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-}
```
public void setHyperlinkTarget(XpsHyperlinkTarget value)
```


Establece el objeto de destino del hipervínculo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | Objeto de destino del hipervínculo. |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Establece el valor que define la transparencia uniforme del elemento.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | float | El valor que define la transparencia uniforme del elemento. |

### setOpacityMask(XpsBrush value) {#setOpacityMask-com.aspose.xps.XpsBrush-}
```
public void setOpacityMask(XpsBrush value)
```


Establece el pincel que especifica una máscara de valores alfa que se aplica al elemento de la misma manera que el atributo Opacity, pero permite diferentes valores alfa para distintas áreas del elemento.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | El pincel que especifica una máscara. |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


Establece la matriz de transformación afín que crea un nuevo marco de coordenadas para todos los atributos del elemento y para todos los elementos hijos (si los hay).

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La matriz de transformación afín. |

### size() {#size--}
```
public int size()
```


Devuelve el número de elementos hijos.

**Returns:**
int - El número de elementos secundarios.
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

