---
title: "XpsVisualBrush"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Clase que encapsula características del elemento de propiedad VisualBrush."
type: docs
weight: 54
url: /es/java/com.aspose.xps/xpsvisualbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsTilingBrush](../../com.aspose.xps/xpstilingbrush)
```
public final class XpsVisualBrush extends XpsTilingBrush
```

Clase que encapsula características del elemento de propiedad VisualBrush. Este elemento se usa para rellenar una región con un dibujo.
## Métodos

| Método | Descripción |
| --- | --- |
| [deepClone()](#deepClone--) | Clona este pincel visual. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getOpacity()](#getOpacity--) | Devuelve el valor que define la transparencia uniforme del relleno del pincel. |
| [getTileMode()](#getTileMode--) | Devuelve el valor que especifica cómo se realiza el mosaico en la geometría rellenada. |
| [getTransform()](#getTransform--) | Devuelve la transformación matricial aplicada al espacio de coordenadas del pincel. |
| [getViewbox()](#getViewbox--) | Devuelve la región del contenido fuente del pincel que se mapeará al viewport. |
| [getViewport()](#getViewport--) | Devuelve la posición y dimensiones del primer mosaico del pincel. |
| [getVisual()](#getVisual--) | Devuelve un elemento Path, Glyphs o Canvas utilizado para dibujar el contenido de origen del pincel\u2019s. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOpacity(float value)](#setOpacity-float-) | Establece el valor que define la transparencia uniforme del relleno del pincel. |
| [setTileMode(XpsTileMode value)](#setTileMode-com.aspose.xps.XpsTileMode-) | Establece el valor que especifica cómo se realiza el mosaico en la geometría rellenada. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Establece la transformación matricial aplicada al espacio de coordenadas del pincel. |
| [setViewbox(Rectangle2D value)](#setViewbox-java.awt.geom.Rectangle2D-) | Establece la región del contenido fuente del pincel que se mapeará al viewport. |
| [setViewport(Rectangle2D value)](#setViewport-java.awt.geom.Rectangle2D-) | Establece la posición y dimensiones del primer azulejo del pincel. |
| [setVisual(XpsContentElement visual)](#setVisual-com.aspose.xps.XpsContentElement-) | Establece visual como elemento Visual del pincel visual. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsVisualBrush deepClone()
```


Clona este pincel visual.

**Returns:**
[XpsVisualBrush](../../com.aspose.xps/xpsvisualbrush) - Clone of this visual brush.
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
### getVisual() {#getVisual--}
```
public XpsContentElement getVisual()
```


Devuelve un elemento Path, Glyphs o Canvas utilizado para dibujar el contenido de origen del pincel\u2019s.

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - A Path, Glyphs, or Canvas element used to draw the brush\\u2019s source content.
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

### setVisual(XpsContentElement visual) {#setVisual-com.aspose.xps.XpsContentElement-}
```
public void setVisual(XpsContentElement visual)
```


Establece visual como elemento Visual del pincel visual.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| visual | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | El elemento. |

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

