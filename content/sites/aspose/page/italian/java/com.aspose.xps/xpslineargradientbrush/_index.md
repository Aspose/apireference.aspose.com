---
title: "XpsLinearGradientBrush"
second_title: "Aspose.Page per Java API Reference"
description: "Classe che incapsula le funzionalità dell'elemento proprietà LinearGradientBrush."
type: docs
weight: 34
url: /it/java/com.aspose.xps/xpslineargradientbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsGradientBrush](../../com.aspose.xps/xpsgradientbrush)
```
public final class XpsLinearGradientBrush extends XpsGradientBrush
```

Classe che incapsula le funzionalità dell'elemento proprietà LinearGradientBrush. Questo elemento è usato per specificare un pennello a gradiente lineare lungo un vettore.
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [deepClone()](#deepClone--) | Clona questo pennello a gradiente lineare. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getColorInterpolationMode()](#getColorInterpolationMode--) | Restituisce il valore che specifica la funzione gamma per l'interpolazione dei colori. |
| [getEndPoint()](#getEndPoint--) | Restituisce il punto finale del gradiente lineare. |
| [getGradientStops()](#getGradientStops--) | Restituisce l'elenco dei gradient stop che compongono il gradiente. |
| [getOpacity()](#getOpacity--) | Restituisce il valore che definisce la trasparenza uniforme del riempimento del pennello. |
| [getSpreadMethod()](#getSpreadMethod--) | Restituisce il valore che descrive come il pennello deve riempire l'area di contenuto al di fuori dell'area gradiente primaria e iniziale. |
| [getStartPoint()](#getStartPoint--) | Restituisce il punto iniziale del gradiente lineare. |
| [getTransform()](#getTransform--) | Restituisce la trasformazione matrice applicata allo spazio coordinate del pennello. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setColorInterpolationMode(XpsColorInterpolationMode value)](#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-) | Imposta il valore che specifica la funzione gamma per l'interpolazione dei colori. |
| [setEndPoint(Point2D value)](#setEndPoint-java.awt.geom.Point2D-) | Restituisce/imposta il punto finale del gradiente lineare. |
| [setGradientStops(List<XpsGradientStop> value)](#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--) | Imposta l'elenco dei gradient stop che compongono il gradiente. |
| [setOpacity(float value)](#setOpacity-float-) | Imposta il valore che definisce la trasparenza uniforme del riempimento del pennello. |
| [setSpreadMethod(XpsSpreadMethod value)](#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-) | Imposta il valore che descrive come il pennello deve riempire l'area di contenuto al di fuori dell'area gradiente primaria e iniziale. |
| [setStartPoint(Point2D value)](#setStartPoint-java.awt.geom.Point2D-) | Imposta il punto iniziale del gradiente lineare. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Imposta la trasformazione matrice applicata allo spazio coordinate del pennello. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsLinearGradientBrush deepClone()
```


Clona questo pennello a gradiente lineare.

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - Clone of this linear gradient brush.
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
### getEndPoint() {#getEndPoint--}
```
public Point2D getEndPoint()
```


Restituisce il punto finale del gradiente lineare.

**Returns:**
java.awt.geom.Point2D - Il punto finale del gradiente lineare.
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
### getSpreadMethod() {#getSpreadMethod--}
```
public XpsSpreadMethod getSpreadMethod()
```


Restituisce il valore che descrive come il pennello deve riempire l'area di contenuto al di fuori dell'area gradiente primaria e iniziale.

**Returns:**
[XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) - Value describing how the brush should fill the content area outside of the primary, initial gradient area.
### getStartPoint() {#getStartPoint--}
```
public Point2D getStartPoint()
```


Restituisce il punto iniziale del gradiente lineare.

**Returns:**
java.awt.geom.Point2D - Il punto iniziale del gradiente lineare.
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




### setColorInterpolationMode(XpsColorInterpolationMode value) {#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-}
```
public void setColorInterpolationMode(XpsColorInterpolationMode value)
```


Imposta il valore che specifica la funzione gamma per l'interpolazione dei colori. La regolazione gamma non dovrebbe essere applicata al componente alfa, se specificato.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) | Valore che specifica la funzione gamma per l'interpolazione dei colori. |

### setEndPoint(Point2D value) {#setEndPoint-java.awt.geom.Point2D-}
```
public void setEndPoint(Point2D value)
```


Restituisce/imposta il punto finale del gradiente lineare.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | java.awt.geom.Point2D | Il punto finale del gradiente lineare. |

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

### setSpreadMethod(XpsSpreadMethod value) {#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-}
```
public void setSpreadMethod(XpsSpreadMethod value)
```


Imposta il valore che descrive come il pennello deve riempire l'area di contenuto al di fuori dell'area gradiente primaria e iniziale.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) | Valore che descrive come il pennello dovrebbe riempire l'area di contenuto al di fuori dell'area gradiente primaria e iniziale. |

### setStartPoint(Point2D value) {#setStartPoint-java.awt.geom.Point2D-}
```
public void setStartPoint(Point2D value)
```


Imposta il punto iniziale del gradiente lineare.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | java.awt.geom.Point2D | Il punto di partenza del gradiente lineare. |

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

