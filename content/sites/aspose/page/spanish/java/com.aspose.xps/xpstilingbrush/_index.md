---
title: "XpsTilingBrush"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Clase que encapsula características comunes de los elementos de pinceles de mosaico VisualBrush e ImageBrush."
type: docs
weight: 51
url: /es/java/com.aspose.xps/xpstilingbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush)
```
public abstract class XpsTilingBrush extends XpsTransformableBrush
```

Clase que encapsula características comunes de los elementos de pinceles de mosaico (VisualBrush y ImageBrush).
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getOpacity()](#getOpacity--) | Devuelve el valor que define la transparencia uniforme del relleno del pincel. |
| [getTileMode()](#getTileMode--) | Devuelve el valor que especifica cómo se realiza el mosaico en la geometría rellenada. |
| [getTransform()](#getTransform--) | Devuelve la transformación matricial aplicada al espacio de coordenadas del pincel. |
| [getViewbox()](#getViewbox--) | Devuelve la región del contenido fuente del pincel que se mapeará al viewport. |
| [getViewport()](#getViewport--) | Devuelve la posición y dimensiones del primer mosaico del pincel. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOpacity(float value)](#setOpacity-float-) | Establece el valor que define la transparencia uniforme del relleno del pincel. |
| [setTileMode(XpsTileMode value)](#setTileMode-com.aspose.xps.XpsTileMode-) | Establece el valor que especifica cómo se realiza el mosaico en la geometría rellenada. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Establece la transformación matricial aplicada al espacio de coordenadas del pincel. |
| [setViewbox(Rectangle2D value)](#setViewbox-java.awt.geom.Rectangle2D-) | Establece la región del contenido fuente del pincel que se mapeará al viewport. |
| [setViewport(Rectangle2D value)](#setViewport-java.awt.geom.Rectangle2D-) | Establece la posición y dimensiones del primer azulejo del pincel. |
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
### getTileMode() {#getTileMode--}
```
public XpsTileMode getTileMode()
```


Devuelve el valor que especifica cómo se realiza el mosaico en la geometría rellenada.

**Returns:**
[XpsTileMode](../../com.aspose.xps/xpstilemode) - Value specifying how tiling is performed in the filled geometry.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Devuelve la transformación matricial aplicada al espacio de coordenadas del pincel. La propiedad Transform se concatena con la transformación de renderizado efectiva actual para obtener una transformación de renderizado efectiva local al pincel. El viewport del pincel se transforma usando la transformación de renderizado efectiva local.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
### getViewbox() {#getViewbox--}
```
public Rectangle2D getViewbox()
```


Devuelve la región del contenido fuente del pincel que se mapeará al viewport.

**Returns:**
java.awt.geom.Rectangle2D - La región del contenido fuente del pincel que se mapeará al viewport.
### getViewport() {#getViewport--}
```
public Rectangle2D getViewport()
```


Devuelve la posición y dimensiones del primer azulejo del pincel. Los azulejos subsiguientes se posicionan en relación con este azulejo, según lo especificado por el modo de azulejo.

**Returns:**
java.awt.geom.Rectangle2D - La posición y dimensiones del primer azulejo del pincel.
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

### setTileMode(XpsTileMode value) {#setTileMode-com.aspose.xps.XpsTileMode-}
```
public void setTileMode(XpsTileMode value)
```


Establece el valor que especifica cómo se realiza el mosaico en la geometría rellenada.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [XpsTileMode](../../com.aspose.xps/xpstilemode) | Valor que especifica cómo se realiza el mosaico en la geometría rellenada. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Establece la transformación matricial aplicada al espacio de coordenadas del pincel. La propiedad Transform se concatena con la transformación de renderizado efectiva actual para obtener una transformación de renderizado efectiva local al pincel. El viewport del pincel se transforma usando la transformación de renderizado efectiva local.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La transformación matricial aplicada al espacio de coordenadas del pincel. |

### setViewbox(Rectangle2D value) {#setViewbox-java.awt.geom.Rectangle2D-}
```
public void setViewbox(Rectangle2D value)
```


Establece la región del contenido fuente del pincel que se mapeará al viewport.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | java.awt.geom.Rectangle2D | La región del contenido fuente del pincel que se mapeará al viewport. |

### setViewport(Rectangle2D value) {#setViewport-java.awt.geom.Rectangle2D-}
```
public void setViewport(Rectangle2D value)
```


Establece la posición y dimensiones del primer azulejo del pincel. Los azulejos subsiguientes se posicionan en relación con este azulejo, según lo especificado por el modo de azulejo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | java.awt.geom.Rectangle2D | La posición y dimensiones del primer azulejo del pincel. |

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

