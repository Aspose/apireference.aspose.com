---
title: "XpsPath"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Clase que encapsula características del elemento Path."
type: docs
weight: 40
url: /es/java/com.aspose.xps/xpspath/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsPath extends XpsContentElement
```

Clase que encapsula características del elemento Path. Este elemento es el único medio para añadir gráficos vectoriales e imágenes a una página fija. Define un único gráfico vectorial que se renderizará en una página.
## Métodos

| Método | Descripción |
| --- | --- |
| [deepClone()](#deepClone--) | Clona esta ruta. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Proporciona acceso a los hijos del elemento por índice i. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Devuelve la geometría de ruta que limita la región renderizada del elemento. |
| [getData()](#getData--) | Devuelve la geometría de la ruta. |
| [getFill()](#getFill--) | Devuelve el pincel utilizado para pintar la geometría especificada por la propiedad Data de la ruta. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Devuelve el objeto de destino del hipervínculo. |
| [getOpacity()](#getOpacity--) | Devuelve el valor que define la transparencia uniforme del elemento. |
| [getOpacityMask()](#getOpacityMask--) | Devuelve el pincel que especifica una máscara de valores alfa que se aplica al elemento de la misma manera que el atributo Opacity, pero permite diferentes valores alfa para distintas áreas del elemento. |
| [getRenderTransform()](#getRenderTransform--) | Devuelve la matriz de transformación afín que establece un nuevo marco de coordenadas para todos los atributos del elemento y para todos los elementos hijos (si los hay). |
| [getStroke()](#getStroke--) | Devuelve el pincel utilizado para dibujar el trazo. |
| [getStrokeDashArray()](#getStrokeDashArray--) | Devuelve la matriz que especifica la longitud de los guiones y los espacios del trazo del contorno. |
| [getStrokeDashCap()](#getStrokeDashCap--) | Devuelve el valor que especifica cómo se dibujan los extremos de cada guión. |
| [getStrokeDashOffset()](#getStrokeDashOffset--) | Devuelve el punto de inicio para repetir el patrón de la matriz de guiones. |
| [getStrokeEndLineCap()](#getStrokeEndLineCap--) | Devuelve el valor que define la forma del extremo del último guión en un trazo. |
| [getStrokeLineJoin()](#getStrokeLineJoin--) | Devuelve el valor que define la forma del inicio del primer guión en un trazo. |
| [getStrokeMiterLimit()](#getStrokeMiterLimit--) | Devuelve la proporción entre la longitud máxima del inglete y la mitad del grosor del trazo. |
| [getStrokeStartLineCap()](#getStrokeStartLineCap--) | Devuelve el valor que define la forma del inicio del primer guión en un trazo. |
| [getStrokeThickness()](#getStrokeThickness--) | Devuelve el grosor de un trazo, en unidades del espacio de coordenadas efectivo (incluye la transformación de renderizado de la ruta). |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Implementación de la interfaz Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Establece la geometría de ruta que limita la región renderizada del elemento. |
| [setData(XpsPathGeometry value)](#setData-com.aspose.xps.XpsPathGeometry-) | Establece la geometría de la ruta. |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | Establece el pincel utilizado para pintar la geometría especificada por la propiedad Data de la ruta. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Establece el objeto de destino del hipervínculo. |
| [setOpacity(float value)](#setOpacity-float-) | Establece el valor que define la transparencia uniforme del elemento. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Establece el pincel que especifica una máscara de valores alfa que se aplica al elemento de la misma manera que el atributo Opacity, pero permite diferentes valores alfa para distintas áreas del elemento. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Establece la matriz de transformación afín que crea un nuevo marco de coordenadas para todos los atributos del elemento y para todos los elementos hijos (si los hay). |
| [setStroke(XpsBrush value)](#setStroke-com.aspose.xps.XpsBrush-) | Establece el pincel utilizado para dibujar el trazo. |
| [setStrokeDashArray(float[] value)](#setStrokeDashArray-float---) | Establece la matriz que especifica la longitud de los guiones y los espacios del trazo del contorno. |
| [setStrokeDashCap(XpsDashCap value)](#setStrokeDashCap-com.aspose.xps.XpsDashCap-) | Establece el valor que especifica cómo se dibujan los extremos de cada guión. |
| [setStrokeDashOffset(float value)](#setStrokeDashOffset-float-) | Establece el punto de inicio para repetir el patrón de la matriz de guiones. |
| [setStrokeEndLineCap(XpsLineCap value)](#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-) | Establece el valor que define la forma del extremo del último guión en un trazo. |
| [setStrokeLineJoin(XpsLineJoin value)](#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-) | Establece el valor que define la forma del inicio del primer guión en un trazo. |
| [setStrokeMiterLimit(float value)](#setStrokeMiterLimit-float-) | Establece la proporción entre la longitud máxima del inglete y la mitad del grosor del trazo. |
| [setStrokeStartLineCap(XpsLineCap value)](#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-) | Establece el valor que define la forma del inicio del primer guión en un trazo. |
| [setStrokeThickness(float value)](#setStrokeThickness-float-) | Establece el grosor de un trazo, en unidades del espacio de coordenadas efectivo (incluye la transformación de renderizado de la ruta). |
| [size()](#size--) | Devuelve el número de elementos hijos. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsPath deepClone()
```


Clona esta ruta.

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Clone this path.
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
### getData() {#getData--}
```
public XpsPathGeometry getData()
```


Devuelve la geometría de la ruta.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The geometry of the path.
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


Devuelve el pincel utilizado para pintar la geometría especificada por la propiedad Data de la ruta.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to paint the geometry specified
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
### getStroke() {#getStroke--}
```
public XpsBrush getStroke()
```


Devuelve el pincel utilizado para dibujar el trazo.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to draw the stroke.
### getStrokeDashArray() {#getStrokeDashArray--}
```
public float[] getStrokeDashArray()
```


Devuelve la matriz que especifica la longitud de los guiones y los espacios del trazo del contorno.

**Returns:**
float[] - La matriz que especifica la longitud de los guiones y los espacios del trazo del contorno.
### getStrokeDashCap() {#getStrokeDashCap--}
```
public XpsDashCap getStrokeDashCap()
```


Devuelve el valor que especifica cómo se dibujan los extremos de cada guión.

**Returns:**
[XpsDashCap](../../com.aspose.xps/xpsdashcap) - The value specifying how the ends of each dash are drawn.
### getStrokeDashOffset() {#getStrokeDashOffset--}
```
public float getStrokeDashOffset()
```


Devuelve el punto de inicio para repetir el patrón de la matriz de guiones. Si se omite este valor, la matriz de guiones se alinea con el origen del trazo.

**Returns:**
float - El punto de inicio para repetir el patrón de la matriz de guiones.
### getStrokeEndLineCap() {#getStrokeEndLineCap--}
```
public XpsLineCap getStrokeEndLineCap()
```


Devuelve el valor que define la forma del extremo del último guión en un trazo.

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the end of the last dash in a stroke.
### getStrokeLineJoin() {#getStrokeLineJoin--}
```
public XpsLineJoin getStrokeLineJoin()
```


Devuelve el valor que define la forma del inicio del primer guión en un trazo.

**Returns:**
[XpsLineJoin](../../com.aspose.xps/xpslinejoin) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeMiterLimit() {#getStrokeMiterLimit--}
```
public float getStrokeMiterLimit()
```


Devuelve la proporción entre la longitud máxima del inglete y la mitad del grosor del trazo. Este valor es significativo solo si el  StrokeLineJoin  atributo especifica  Miter .

**Returns:**
float - La proporción entre la longitud máxima del inglete y la mitad del grosor del trazo.
### getStrokeStartLineCap() {#getStrokeStartLineCap--}
```
public XpsLineCap getStrokeStartLineCap()
```


Devuelve el valor que define la forma del inicio del primer guión en un trazo.

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeThickness() {#getStrokeThickness--}
```
public float getStrokeThickness()
```


Devuelve el grosor de un trazo, en unidades del espacio de coordenadas efectivo (incluye la transformación de renderizado de la ruta). El trazo se dibuja sobre el límite de la geometría especificada por la propiedad Data del elemento Path\\u2019s Data property. La mitad del StrokeThickness se extiende fuera de la geometría especificada por la propiedad Data y la otra mitad se extiende dentro de la geometría.

**Returns:**
float - El grosor de un trazo.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
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

### setData(XpsPathGeometry value) {#setData-com.aspose.xps.XpsPathGeometry-}
```
public void setData(XpsPathGeometry value)
```


Establece la geometría de la ruta.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La geometría de la ruta. |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


Establece el pincel utilizado para pintar la geometría especificada por la propiedad Data de la ruta.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | El pincel usado para pintar la geometría especificada |

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

### setStroke(XpsBrush value) {#setStroke-com.aspose.xps.XpsBrush-}
```
public void setStroke(XpsBrush value)
```


Establece el pincel utilizado para dibujar el trazo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | El pincel usado para dibujar el trazo. |

### setStrokeDashArray(float[] value) {#setStrokeDashArray-float---}
```
public void setStrokeDashArray(float[] value)
```


Establece la matriz que especifica la longitud de los guiones y los espacios del trazo del contorno.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | float[] | La matriz que especifica la longitud de los guiones y los espacios del trazo del contorno. |

### setStrokeDashCap(XpsDashCap value) {#setStrokeDashCap-com.aspose.xps.XpsDashCap-}
```
public void setStrokeDashCap(XpsDashCap value)
```


Establece el valor que especifica cómo se dibujan los extremos de cada guión.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [XpsDashCap](../../com.aspose.xps/xpsdashcap) | El valor que especifica cómo se dibujan los extremos de cada guión. |

### setStrokeDashOffset(float value) {#setStrokeDashOffset-float-}
```
public void setStrokeDashOffset(float value)
```


Establece el punto de inicio para repetir el patrón de la matriz de guiones. Si se omite este valor, la matriz de guiones se alinea con el origen del trazo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | float | El punto de inicio para repetir el patrón de la matriz de guiones. |

### setStrokeEndLineCap(XpsLineCap value) {#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeEndLineCap(XpsLineCap value)
```


Establece el valor que define la forma del extremo del último guión en un trazo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | El valor que define la forma del extremo del último guión en un trazo. |

### setStrokeLineJoin(XpsLineJoin value) {#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-}
```
public void setStrokeLineJoin(XpsLineJoin value)
```


Establece el valor que define la forma del inicio del primer guión en un trazo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [XpsLineJoin](../../com.aspose.xps/xpslinejoin) | El valor que define la forma del inicio del primer guión en un trazo. |

### setStrokeMiterLimit(float value) {#setStrokeMiterLimit-float-}
```
public void setStrokeMiterLimit(float value)
```


Establece la proporción entre la longitud máxima del inglete y la mitad del grosor del trazo. Este valor es significativo solo si el atributo  StrokeLineJoin  especifica  Miter .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | float | La proporción entre la longitud máxima del inglete y la mitad del grosor del trazo. |

### setStrokeStartLineCap(XpsLineCap value) {#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeStartLineCap(XpsLineCap value)
```


Establece el valor que define la forma del inicio del primer guión en un trazo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | El valor que define la forma del inicio del primer guión en un trazo. |

### setStrokeThickness(float value) {#setStrokeThickness-float-}
```
public void setStrokeThickness(float value)
```


Establece el grosor de un trazo, en unidades del espacio de coordenadas efectivo (incluye la transformación de renderizado de la ruta). El trazo se dibuja sobre el límite de la geometría especificada por la propiedad Data del elemento Path\\u2019s Data property. La mitad del StrokeThickness se extiende fuera de la geometría especificada por la propiedad Data y la otra mitad se extiende dentro de la geometría.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | float | El grosor de un trazo. |

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

