---
title: "XpsGlyphs"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Clase que encapsula características del elemento Glyphs."
type: docs
weight: 25
url: /es/java/com.aspose.xps/xpsglyphs/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsGlyphs extends XpsContentElement
```

Clase que encapsula características del elemento Glyphs. Este elemento representa una secuencia de texto uniformemente formateado de una sola fuente. Proporciona la información necesaria para una renderización precisa y admite funciones de búsqueda y selección en los consumidores de visualización.
## Métodos

| Método | Descripción |
| --- | --- |
| [deepClone()](#deepClone--) | Clonar estos glifos. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Proporciona acceso a los hijos del elemento por índice i. |
| [getBidiLevel()](#getBidiLevel--) | Devuelve el valor que especifica el nivel de anidamiento bidireccional del algoritmo Unicode. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Devuelve la geometría de ruta que limita la región renderizada del elemento. |
| [getFill()](#getFill--) | Devuelve el pincel usado para rellenar la forma de los glifos renderizados. |
| [getFont()](#getFont--) | Devuelve el recurso de fuente para la fuente TrueType utilizada para componer el texto de los elementos. |
| [getFontRenderingEmSize()](#getFontRenderingEmSize--) | Devuelve el tamaño de la fuente en unidades de la superficie de dibujo, expresado como un número de punto flotante en unidades del espacio de coordenadas efectivo. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Devuelve el objeto de destino del hipervínculo. |
| [getOpacity()](#getOpacity--) | Devuelve el valor que define la transparencia uniforme del elemento. |
| [getOpacityMask()](#getOpacityMask--) | Devuelve el pincel que especifica una máscara de valores alfa que se aplica al elemento de la misma manera que el atributo Opacity, pero permite diferentes valores alfa para distintas áreas del elemento. |
| [getOriginX()](#getOriginX--) | Devuelve la coordenada x del primer glifo en la secuencia, en unidades del espacio de coordenadas efectivo. |
| [getOriginY()](#getOriginY--) | Devuelve la coordenada y del primer glifo en la secuencia, en unidades del espacio de coordenadas efectivo. |
| [getRenderTransform()](#getRenderTransform--) | Devuelve la matriz de transformación afín que establece un nuevo marco de coordenadas para todos los atributos del elemento y para todos los elementos hijos (si los hay). |
| [getStyleSimulations()](#getStyleSimulations--) | Devuelve el valor que especifica una simulación de estilo. |
| [getUnicodeString()](#getUnicodeString--) | Devuelve la cadena de texto renderizada por el elemento Glyphs. |
| [hashCode()](#hashCode--) |  |
| [isSideways()](#isSideways--) | Devuelve el valor que indica que un glifo está girado de lado, con el origen definido como la parte superior central del glifo sin girar. |
| [iterator()](#iterator--) | Implementación de la interfaz Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setBidiLevel(int value)](#setBidiLevel-int-) | Establece el valor que especifica el nivel de anidamiento bidireccional del algoritmo Unicode. |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Establece la geometría de ruta que limita la región renderizada del elemento. |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | Establece el pincel utilizado para rellenar la forma de los glifos renderizados. |
| [setFontRenderingEmSize(float value)](#setFontRenderingEmSize-float-) | Establece el tamaño de fuente en unidades de la superficie de dibujo, expresado como un número de punto flotante en unidades del espacio de coordenadas efectivo. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Establece el objeto de destino del hipervínculo. |
| [setOpacity(float value)](#setOpacity-float-) | Establece el valor que define la transparencia uniforme del elemento. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Establece el pincel que especifica una máscara de valores alfa que se aplica al elemento de la misma manera que el atributo Opacity, pero permite diferentes valores alfa para distintas áreas del elemento. |
| [setOriginX(float value)](#setOriginX-float-) | Establece la coordenada x del primer glifo en la secuencia, en unidades del espacio de coordenadas efectivo. |
| [setOriginY(float value)](#setOriginY-float-) | Establece la coordenada y del primer glifo en la secuencia, en unidades del espacio de coordenadas efectivo. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Establece la matriz de transformación afín que crea un nuevo marco de coordenadas para todos los atributos del elemento y para todos los elementos hijos (si los hay). |
| [setSideways(boolean value)](#setSideways-boolean-) | Establece el valor que indica que un glifo está girado de lado, con el origen definido como la parte superior central del glifo sin girar. |
| [setStyleSimulations(XpsStyleSimulations value)](#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-) | Establece el valor que especifica una simulación de estilo. |
| [setUnicodeString(String value)](#setUnicodeString-java.lang.String-) | Establece la cadena de texto renderizada por el elemento Glyphs. |
| [size()](#size--) | Devuelve el número de elementos hijos. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsGlyphs deepClone()
```


Clonar estos glifos.

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Clone of this glyphs.
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
### getBidiLevel() {#getBidiLevel--}
```
public int getBidiLevel()
```


Devuelve el valor que especifica el nivel de anidamiento bidireccional del algoritmo Unicode. Los valores pares implican un diseño de izquierda a derecha, los valores impares implican un diseño de derecha a izquierda. El diseño de derecha a izquierda coloca el origen de la secuencia en el lado derecho del primer glifo, y los anchos de avance positivos (que representan avances hacia la izquierda) colocan los glifos posteriores a la izquierda del glifo anterior.

**Returns:**
int - El valor que especifica el nivel de anidamiento bidireccional del algoritmo Unicode.
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
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


Devuelve el pincel usado para rellenar la forma de los glifos renderizados.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to fill the shape of the rendered glyphs.
### getFont() {#getFont--}
```
public XpsFont getFont()
```


Devuelve el recurso de fuente para la fuente TrueType utilizada para componer el texto de los elementos.

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - The font resource for the TrueType font used to typeset elements text.
### getFontRenderingEmSize() {#getFontRenderingEmSize--}
```
public float getFontRenderingEmSize()
```


Devuelve el tamaño de la fuente en unidades de la superficie de dibujo, expresado como un número de punto flotante en unidades del espacio de coordenadas efectivo.

**Returns:**
float - El tamaño de fuente.
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
### getOriginX() {#getOriginX--}
```
public float getOriginX()
```


Devuelve la coordenada x del primer glifo en la secuencia, en unidades del espacio de coordenadas efectivo.

**Returns:**
float - La coordenada x del primer glifo en la secuencia, en unidades del espacio de coordenadas efectivo.
### getOriginY() {#getOriginY--}
```
public float getOriginY()
```


Devuelve la coordenada y del primer glifo en la secuencia, en unidades del espacio de coordenadas efectivo.

**Returns:**
float - La coordenada y del primer glifo en la secuencia, en unidades del espacio de coordenadas efectivo.
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


Devuelve la matriz de transformación afín que establece un nuevo marco de coordenadas para todos los atributos del elemento y para todos los elementos hijos (si los hay).

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### getStyleSimulations() {#getStyleSimulations--}
```
public XpsStyleSimulations getStyleSimulations()
```


Devuelve el valor que especifica una simulación de estilo.

**Returns:**
[XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) - The value specifying a style simulation.
### getUnicodeString() {#getUnicodeString--}
```
public String getUnicodeString()
```


Devuelve la cadena de texto renderizada por el elemento Glyphs. El texto se especifica como puntos de código Unicode.

**Returns:**
java.lang.String - La cadena de texto renderizada por el elemento Glyphs.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isSideways() {#isSideways--}
```
public boolean isSideways()
```


Devuelve el valor que indica que un glifo está girado de lado, con el origen definido como la parte superior central del glifo sin girar.

**Returns:**
boolean - El valor que indica que un glifo está girado de lado.
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




### setBidiLevel(int value) {#setBidiLevel-int-}
```
public void setBidiLevel(int value)
```


Establece el valor que especifica el nivel de anidamiento bidireccional del algoritmo Unicode. Los valores pares implican un diseño de izquierda a derecha, los valores impares implican un diseño de derecha a izquierda. El diseño de derecha a izquierda coloca el origen de la secuencia en el lado derecho del primer glifo, y los anchos de avance positivos (que representan avances hacia la izquierda) colocan los glifos posteriores a la izquierda del glifo anterior.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | int | El valor que especifica el nivel de anidamiento bidireccional del algoritmo Unicode. |

### setClip(XpsPathGeometry value) {#setClip-com.aspose.xps.XpsPathGeometry-}
```
public void setClip(XpsPathGeometry value)
```


Establece la geometría de ruta que limita la región renderizada del elemento.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La geometría de ruta que limita la región renderizada del elemento. |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


Establece el pincel utilizado para rellenar la forma de los glifos renderizados.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | El pincel utilizado para rellenar la forma de los glifos renderizados. |

### setFontRenderingEmSize(float value) {#setFontRenderingEmSize-float-}
```
public void setFontRenderingEmSize(float value)
```


Establece el tamaño de fuente en unidades de la superficie de dibujo, expresado como un número de punto flotante en unidades del espacio de coordenadas efectivo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | float | El tamaño de fuente. |

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

### setOriginX(float value) {#setOriginX-float-}
```
public void setOriginX(float value)
```


Establece la coordenada x del primer glifo en la secuencia, en unidades del espacio de coordenadas efectivo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | float | La coordenada x del primer glifo en la secuencia, en unidades del espacio de coordenadas efectivo. |

### setOriginY(float value) {#setOriginY-float-}
```
public void setOriginY(float value)
```


Establece la coordenada y del primer glifo en la secuencia, en unidades del espacio de coordenadas efectivo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | float | La coordenada y del primer glifo en la secuencia, en unidades del espacio de coordenadas efectivo. |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


Establece la matriz de transformación afín que crea un nuevo marco de coordenadas para todos los atributos del elemento y para todos los elementos hijos (si los hay).

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La matriz de transformación afín. |

### setSideways(boolean value) {#setSideways-boolean-}
```
public void setSideways(boolean value)
```


Establece el valor que indica que un glifo está girado de lado, con el origen definido como la parte superior central del glifo sin girar.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | boolean | El valor que indica que un glifo está girado de lado. |

### setStyleSimulations(XpsStyleSimulations value) {#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-}
```
public void setStyleSimulations(XpsStyleSimulations value)
```


Establece el valor que especifica una simulación de estilo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) | El valor que especifica una simulación de estilo. |

### setUnicodeString(String value) {#setUnicodeString-java.lang.String-}
```
public void setUnicodeString(String value)
```


Establece la cadena de texto renderizada por el elemento Glyphs. El texto se especifica como puntos de código Unicode.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | java.lang.String | La cadena de texto renderizada por el elemento Glyphs. |

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

