---
title: "XpsRadialGradientBrush"
second_title: "Aspose.Page per Java API Reference"
description: "Classe che incapsula le funzionalità dell'elemento proprietà RadialGradientBrush."
type: docs
weight: 48
url: /it/java/com.aspose.xps/xpsradialgradientbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsGradientBrush](../../com.aspose.xps/xpsgradientbrush)
```
public final class XpsRadialGradientBrush extends XpsGradientBrush
```

Classe che incapsula le funzionalità dell'elemento proprietà RadialGradientBrush. Questo elemento è usato per specificare un pennello a gradiente radiale.
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [deepClone()](#deepClone--) | Clona questo pennello a gradiente radiale. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCenter()](#getCenter--) | Restituisce il punto centrale del gradiente radiale (cioè il centro dell'ellisse). |
| [getClass()](#getClass--) |  |
| [getColorInterpolationMode()](#getColorInterpolationMode--) | Restituisce il valore che specifica la funzione gamma per l'interpolazione dei colori. |
| [getGradientOrigin()](#getGradientOrigin--) | Restituisce il punto di origine del gradiente radiale. |
| [getGradientStops()](#getGradientStops--) | Restituisce l'elenco dei gradient stop che compongono il gradiente. |
| [getOpacity()](#getOpacity--) | Restituisce il valore che definisce la trasparenza uniforme del riempimento del pennello. |
| [getRadiusX()](#getRadiusX--) | Restituisce il raggio nella dimensione x dell'ellisse che definisce il gradiente radiale. |
| [getRadiusY()](#getRadiusY--) | Restituisce il raggio nella dimensione y dell'ellisse che definisce il gradiente radiale. |
| [getSpreadMethod()](#getSpreadMethod--) | Restituisce il valore che descrive come il pennello deve riempire l'area di contenuto al di fuori dell'area gradiente primaria e iniziale. |
| [getTransform()](#getTransform--) | Restituisce la trasformazione matrice applicata allo spazio coordinate del pennello. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setCenter(Point2D value)](#setCenter-java.awt.geom.Point2D-) | Imposta il punto centrale del gradiente radiale (cioè il centro dell'ellisse). |
| [setColorInterpolationMode(XpsColorInterpolationMode value)](#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-) | Imposta il valore che specifica la funzione gamma per l'interpolazione dei colori. |
| [setGradientOrigin(Point2D value)](#setGradientOrigin-java.awt.geom.Point2D-) | Imposta il punto di origine del gradiente radiale. |
| [setGradientStops(List<XpsGradientStop> value)](#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--) | Imposta l'elenco dei gradient stop che compongono il gradiente. |
| [setOpacity(float value)](#setOpacity-float-) | Imposta il valore che definisce la trasparenza uniforme del riempimento del pennello. |
| [setRadiusX(float value)](#setRadiusX-float-) | Imposta il raggio nella dimensione x dell'ellisse che definisce il gradiente radiale. |
| [setRadiusY(float value)](#setRadiusY-float-) | Imposta il raggio nella dimensione y dell'ellisse che definisce il gradiente radiale. |
| [setSpreadMethod(XpsSpreadMethod value)](#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-) | Imposta il valore che descrive come il pennello deve riempire l'area di contenuto al di fuori dell'area gradiente primaria e iniziale. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Imposta la trasformazione matrice applicata allo spazio coordinate del pennello. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsRadialGradientBrush deepClone()
```


Clona questo pennello a gradiente radiale.

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - Clone of this radial gradient brush.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getCenter() {#getCenter--}
```
public Point2D getCenter()
```


Restituisce il punto centrale del gradiente radiale (cioè il centro dell'ellisse).

**Returns:**
java.awt.geom.Point2D - Il punto centrale del gradiente radiale.
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


Restituisce il valore che specifica la funzione gamma per l'interpolazione dei colori. La regolazione gamma non dovrebbe essere applicata al componente alfa, se specificato.

**Returns:**
[XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) - Value specifying the gamma function for color interpolation.
### getGradientOrigin() {#getGradientOrigin--}
```
public Point2D getGradientOrigin()
```


Restituisce il punto di origine del gradiente radiale.

**Returns:**
java.awt.geom.Point2D - Il punto di origine del gradiente radiale.
### getGradientStops() {#getGradientStops--}
```
public List<XpsGradientStop> getGradientStops()
```


Restituisce l'elenco dei gradient stop che compongono il gradiente.

**Returns:**
java.util.List<com.aspose.xps.XpsGradientStop> - Elenco dei gradient stop che compongono il gradiente.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Restituisce il valore che definisce la trasparenza uniforme del riempimento del pennello.

**Returns:**
float - Valore che definisce la trasparenza uniforme del riempimento del pennello.
### getRadiusX() {#getRadiusX--}
```
public float getRadiusX()
```


Restituisce il raggio nella dimensione x dell'ellisse che definisce il gradiente radiale.

**Returns:**
float - Il raggio nella dimensione x dell'ellisse che definisce il gradiente radiale.
### getRadiusY() {#getRadiusY--}
```
public float getRadiusY()
```


Restituisce il raggio nella dimensione y dell'ellisse che definisce il gradiente radiale.

**Returns:**
float - Il raggio nella dimensione y dell'ellisse che definisce il gradiente radiale.
### getSpreadMethod() {#getSpreadMethod--}
```
public XpsSpreadMethod getSpreadMethod()
```


Restituisce il valore che descrive come il pennello deve riempire l'area di contenuto al di fuori dell'area gradiente primaria e iniziale.

**Returns:**
[XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) - Value describing how the brush should fill the content area outside of the primary, initial gradient area.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Restituisce la trasformazione matrice applicata allo spazio coordinate del pennello. La proprietà Transform viene concatenata con la trasformazione di rendering efficace corrente per ottenere una trasformazione di rendering efficace locale al pennello. La viewport del pennello viene trasformata utilizzando la trasformazione di rendering efficace locale.

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




### setCenter(Point2D value) {#setCenter-java.awt.geom.Point2D-}
```
public void setCenter(Point2D value)
```


Imposta il punto centrale del gradiente radiale (cioè il centro dell'ellisse).

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | java.awt.geom.Point2D | Il punto centrale del gradiente radiale. |

### setColorInterpolationMode(XpsColorInterpolationMode value) {#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-}
```
public void setColorInterpolationMode(XpsColorInterpolationMode value)
```


Imposta il valore che specifica la funzione gamma per l'interpolazione dei colori. La regolazione gamma non dovrebbe essere applicata al componente alfa, se specificato.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) | Valore che specifica la funzione gamma per l'interpolazione dei colori. |

### setGradientOrigin(Point2D value) {#setGradientOrigin-java.awt.geom.Point2D-}
```
public void setGradientOrigin(Point2D value)
```


Imposta il punto di origine del gradiente radiale.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | java.awt.geom.Point2D | Il punto di origine del gradiente radiale. |

### setGradientStops(List<XpsGradientStop> value) {#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--}
```
public void setGradientStops(List<XpsGradientStop> value)
```


Imposta l'elenco dei gradient stop che compongono il gradiente.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | java.util.List<com.aspose.xps.XpsGradientStop> | Elenco di fermate del gradiente che compongono il gradiente. |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Imposta il valore che definisce la trasparenza uniforme del riempimento del pennello.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | float | Valore che definisce la trasparenza uniforme del riempimento del pennello. |

### setRadiusX(float value) {#setRadiusX-float-}
```
public void setRadiusX(float value)
```


Imposta il raggio nella dimensione x dell'ellisse che definisce il gradiente radiale.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | float | Il raggio nella dimensione x dell'ellisse che definisce il gradiente radiale. |

### setRadiusY(float value) {#setRadiusY-float-}
```
public void setRadiusY(float value)
```


Imposta il raggio nella dimensione y dell'ellisse che definisce il gradiente radiale.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | float | Il raggio nella dimensione y dell'ellisse che definisce il gradiente radiale. |

### setSpreadMethod(XpsSpreadMethod value) {#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-}
```
public void setSpreadMethod(XpsSpreadMethod value)
```


Imposta il valore che descrive come il pennello deve riempire l'area di contenuto al di fuori dell'area gradiente primaria e iniziale.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) | Valore che descrive come il pennello dovrebbe riempire l'area di contenuto al di fuori dell'area gradiente primaria e iniziale. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Imposta la trasformazione matrice applicata allo spazio coordinate del pennello. La proprietà Transform viene concatenata con la trasformazione di rendering efficace corrente per ottenere una trasformazione di rendering efficace locale al pennello. La viewport del pennello viene trasformata utilizzando la trasformazione di rendering efficace locale.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La trasformazione matrice applicata allo spazio coordinate del pennello. |

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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

