---
title: "XpsContentElement"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Encapsula características de los elementos de contenido XPS Canvas Path y Glyphs."
type: docs
weight: 18
url: /es/java/com.aspose.xps/xpscontentelement/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement)
```
public abstract class XpsContentElement extends XpsHyperlinkElement
```

Encapsula características de los elementos de contenido XPS: Canvas, Path y Glyphs.
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Proporciona acceso a los hijos del elemento por índice i. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Devuelve la geometría de ruta que limita la región renderizada del elemento. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Devuelve el objeto de destino del hipervínculo. |
| [getOpacity()](#getOpacity--) | Devuelve el valor que define la transparencia uniforme del elemento. |
| [getOpacityMask()](#getOpacityMask--) | Devuelve el pincel que especifica una máscara de valores alfa que se aplica al elemento de la misma manera que el atributo Opacity, pero permite diferentes valores alfa para distintas áreas del elemento. |
| [getRenderTransform()](#getRenderTransform--) | Devuelve la matriz de transformación afín que establece un nuevo marco de coordenadas para todos los atributos del elemento y para todos los elementos hijos (si los hay). |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Implementación de la interfaz Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Establece la geometría de ruta que limita la región renderizada del elemento. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Establece el objeto de destino del hipervínculo. |
| [setOpacity(float value)](#setOpacity-float-) | Establece el valor que define la transparencia uniforme del elemento. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Establece el pincel que especifica una máscara de valores alfa que se aplica al elemento de la misma manera que el atributo Opacity, pero permite diferentes valores alfa para distintas áreas del elemento. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Establece la matriz de transformación afín que crea un nuevo marco de coordenadas para todos los atributos del elemento y para todos los elementos hijos (si los hay). |
| [size()](#size--) | Devuelve el número de elementos hijos. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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

