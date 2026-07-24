---
title: "XpsTransformableBrush"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Clase que encapsula características comunes de los elementos de pinceles transformables, todos excepto SolidColorBrush."
type: docs
weight: 52
url: /es/java/com.aspose.xps/xpstransformablebrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush)

**All Implemented Interfaces:**
com.aspose.xps.ITransformableProperty
```
public abstract class XpsTransformableBrush extends XpsBrush implements ITransformableProperty
```

Clase que encapsula características comunes de los elementos de pinceles transformables (todos excepto SolidColorBrush).
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getOpacity()](#getOpacity--) | Devuelve el valor que define la transparencia uniforme del relleno del pincel. |
| [getTransform()](#getTransform--) | Devuelve la transformación matricial aplicada al espacio de coordenadas del pincel. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOpacity(float value)](#setOpacity-float-) | Establece el valor que define la transparencia uniforme del relleno del pincel. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Establece la transformación matricial aplicada al espacio de coordenadas del pincel. |
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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Devuelve el valor que define la transparencia uniforme del relleno del pincel.

**Returns:**
float - Valor que define la transparencia uniforme del relleno del pincel.
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




### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Establece el valor que define la transparencia uniforme del relleno del pincel.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | float | Valor que define la transparencia uniforme del relleno del pincel. |

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

