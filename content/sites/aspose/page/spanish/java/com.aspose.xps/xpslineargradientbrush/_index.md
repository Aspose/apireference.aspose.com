---
title: "XpsLinearGradientBrush"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Clase que encapsula características del elemento de propiedad LinearGradientBrush."
type: docs
weight: 34
url: /es/java/com.aspose.xps/xpslineargradientbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsGradientBrush](../../com.aspose.xps/xpsgradientbrush)
```
public final class XpsLinearGradientBrush extends XpsGradientBrush
```

Clase que encapsula características del elemento de propiedad LinearGradientBrush. Este elemento se utiliza para especificar un pincel de degradado lineal a lo largo de un vector.
## Métodos

| Método | Descripción |
| --- | --- |
| [deepClone()](#deepClone--) | Clona este pincel de degradado lineal. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getColorInterpolationMode()](#getColorInterpolationMode--) | Devuelve el valor que especifica la función gamma para la interpolación de color. |
| [getEndPoint()](#getEndPoint--) | Devuelve el punto final del degradado lineal. |
| [getGradientStops()](#getGradientStops--) | Devuelve la lista de paradas de degradado que componen el degradado. |
| [getOpacity()](#getOpacity--) | Devuelve el valor que define la transparencia uniforme del relleno del pincel. |
| [getSpreadMethod()](#getSpreadMethod--) | Devuelve el valor que describe cómo debe rellenar el pincel el área de contenido fuera del área de degradado primaria e inicial. |
| [getStartPoint()](#getStartPoint--) | Devuelve el punto inicial del degradado lineal. |
| [getTransform()](#getTransform--) | Devuelve la transformación matricial aplicada al espacio de coordenadas del pincel. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setColorInterpolationMode(XpsColorInterpolationMode value)](#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-) | Establece el valor que especifica la función gamma para la interpolación de color. |
| [setEndPoint(Point2D value)](#setEndPoint-java.awt.geom.Point2D-) | Devuelve/establece el punto final del degradado lineal. |
| [setGradientStops(List<XpsGradientStop> value)](#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--) | Establece la lista de paradas de degradado que componen el degradado. |
| [setOpacity(float value)](#setOpacity-float-) | Establece el valor que define la transparencia uniforme del relleno del pincel. |
| [setSpreadMethod(XpsSpreadMethod value)](#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-) | Establece el valor que describe cómo debe rellenar el pincel el área de contenido fuera del área de degradado primaria e inicial. |
| [setStartPoint(Point2D value)](#setStartPoint-java.awt.geom.Point2D-) | Establece el punto inicial del degradado lineal. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Establece la transformación matricial aplicada al espacio de coordenadas del pincel. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsLinearGradientBrush deepClone()
```


Clona este pincel de degradado lineal.

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - Clone of this linear gradient brush.
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
### getColorInterpolationMode() {#getColorInterpolationMode--}
```
public XpsColorInterpolationMode getColorInterpolationMode()
```


Devuelve el valor que especifica la función gamma para la interpolación de color. El ajuste gamma no debe aplicarse al componente alfa, si se especifica.

**Returns:**
[XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) - Value specifying the gamma function for color interpolation.
### getEndPoint() {#getEndPoint--}
```
public Point2D getEndPoint()
```


Devuelve el punto final del degradado lineal.

**Returns:**
java.awt.geom.Point2D - El punto final del degradado lineal.
### getGradientStops() {#getGradientStops--}
```
public List<XpsGradientStop> getGradientStops()
```


Devuelve la lista de paradas de degradado que componen el degradado.

**Returns:**
java.util.List<com.aspose.xps.XpsGradientStop> - Lista de paradas de degradado que componen el degradado.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Devuelve el valor que define la transparencia uniforme del relleno del pincel.

**Returns:**
float - Valor que define la transparencia uniforme del relleno del pincel.
### getSpreadMethod() {#getSpreadMethod--}
```
public XpsSpreadMethod getSpreadMethod()
```


Devuelve el valor que describe cómo debe rellenar el pincel el área de contenido fuera del área de degradado primaria e inicial.

**Returns:**
[XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) - Value describing how the brush should fill the content area outside of the primary, initial gradient area.
### getStartPoint() {#getStartPoint--}
```
public Point2D getStartPoint()
```


Devuelve el punto inicial del degradado lineal.

**Returns:**
java.awt.geom.Point2D - El punto inicial del degradado lineal.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Devuelve la transformación matricial aplicada al espacio de coordenadas del pincel. La propiedad Transform se concatena con la transformación de renderizado efectiva actual para obtener una transformación de renderizado efectiva local al pincel. El viewport del pincel se transforma usando la transformación de renderizado efectiva local.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
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




### setColorInterpolationMode(XpsColorInterpolationMode value) {#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-}
```
public void setColorInterpolationMode(XpsColorInterpolationMode value)
```


Establece el valor que especifica la función gamma para la interpolación de color. El ajuste gamma no debe aplicarse al componente alfa, si se especifica.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) | Valor que especifica la función gamma para la interpolación de color. |

### setEndPoint(Point2D value) {#setEndPoint-java.awt.geom.Point2D-}
```
public void setEndPoint(Point2D value)
```


Devuelve/establece el punto final del degradado lineal.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | java.awt.geom.Point2D | El punto final del degradado lineal. |

### setGradientStops(List<XpsGradientStop> value) {#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--}
```
public void setGradientStops(List<XpsGradientStop> value)
```


Establece la lista de paradas de degradado que componen el degradado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | java.util.List<com.aspose.xps.XpsGradientStop> | Lista de paradas de degradado que componen el degradado. |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Establece el valor que define la transparencia uniforme del relleno del pincel.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | float | Valor que define la transparencia uniforme del relleno del pincel. |

### setSpreadMethod(XpsSpreadMethod value) {#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-}
```
public void setSpreadMethod(XpsSpreadMethod value)
```


Establece el valor que describe cómo debe rellenar el pincel el área de contenido fuera del área de degradado primaria e inicial.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) | Valor que describe cómo debe el pincel rellenar el área de contenido fuera del área de degradado primaria e inicial. |

### setStartPoint(Point2D value) {#setStartPoint-java.awt.geom.Point2D-}
```
public void setStartPoint(Point2D value)
```


Establece el punto inicial del degradado lineal.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | java.awt.geom.Point2D | El punto de inicio del degradado lineal. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Establece la transformación matricial aplicada al espacio de coordenadas del pincel. La propiedad Transform se concatena con la transformación de renderizado efectiva actual para obtener una transformación de renderizado efectiva local al pincel. El viewport del pincel se transforma usando la transformación de renderizado efectiva local.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La transformación matricial aplicada al espacio de coordenadas del pincel. |

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

