---
title: "XpsRadialGradientBrush"
second_title: "Aspose.Page för Java API-referens"
description: "Klass som kapslar in funktioner för RadialGradientBrush-egenskapselement."
type: docs
weight: 48
url: /sv/java/com.aspose.xps/xpsradialgradientbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsGradientBrush](../../com.aspose.xps/xpsgradientbrush)
```
public final class XpsRadialGradientBrush extends XpsGradientBrush
```

Klass som kapslar in egenskaper för RadialGradientBrush‑egenskapselementet. Detta element används för att specificera en radialgradientpensel.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [deepClone()](#deepClone--) | Klonar denna radiella gradientborste. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCenter()](#getCenter--) | Returnerar mittpunkten för den radiella gradienten (det vill säga ellipsens mittpunkt). |
| [getClass()](#getClass--) |  |
| [getColorInterpolationMode()](#getColorInterpolationMode--) | Returnerar värdet som specificerar gammafunktionen för färginterpolering. |
| [getGradientOrigin()](#getGradientOrigin--) | Returnerar ursprungspunkten för den radiella gradienten. |
| [getGradientStops()](#getGradientStops--) | Returnerar en lista med gradientstopp som utgör gradienten. |
| [getOpacity()](#getOpacity--) | Returnerar värdet som definierar den enhetliga transparensen för penselfyllningen. |
| [getRadiusX()](#getRadiusX--) | Returnerar radien i x-dimensionen av ellipsen som definierar den radiella gradienten. |
| [getRadiusY()](#getRadiusY--) | Returnerar radien i y-dimensionen av ellipsen som definierar den radiella gradienten. |
| [getSpreadMethod()](#getSpreadMethod--) | Returnerar värdet som beskriver hur borsten ska fylla innehållsområdet utanför det primära, initiala gradientområdet. |
| [getTransform()](#getTransform--) | Returnerar matrisomvandlingen som tillämpas på penselns koordinatrymd. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setCenter(Point2D value)](#setCenter-java.awt.geom.Point2D-) | Ställer in mittpunkten för den radiella gradienten (det vill säga ellipsens mittpunkt). |
| [setColorInterpolationMode(XpsColorInterpolationMode value)](#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-) | Ställer in värdet som specificerar gammafunktionen för färginterpolering. |
| [setGradientOrigin(Point2D value)](#setGradientOrigin-java.awt.geom.Point2D-) | Ställer in ursprungspunkten för den radiella gradienten. |
| [setGradientStops(List<XpsGradientStop> value)](#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--) | Ställer in en lista med gradientstopp som utgör gradienten. |
| [setOpacity(float value)](#setOpacity-float-) | Sätter värdet som definierar den enhetliga transparensen för penselfyllningen. |
| [setRadiusX(float value)](#setRadiusX-float-) | Ställer in radien i x-dimensionen av ellipsen som definierar den radiella gradienten. |
| [setRadiusY(float value)](#setRadiusY-float-) | Ställer in radien i y-dimensionen av ellipsen som definierar den radiella gradienten. |
| [setSpreadMethod(XpsSpreadMethod value)](#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-) | Ställer in värdet som beskriver hur borsten ska fylla innehållsområdet utanför det primära, initiala gradientområdet. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Ställer in matrisomvandlingen som tillämpas på penselns koordinatrymd. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsRadialGradientBrush deepClone()
```


Klonar denna radiella gradientborste.

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - Clone of this radial gradient brush.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getCenter() {#getCenter--}
```
public Point2D getCenter()
```


Returnerar mittpunkten för den radiella gradienten (det vill säga ellipsens mittpunkt).

**Returns:**
java.awt.geom.Point2D - Mittpunkten för den radiella gradienten.
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


Returnerar värde som specificerar gammafunktionen för färginterpolering. Gammajusteringen bör inte tillämpas på alfakomponenten, om den är specificerad.

**Returns:**
[XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) - Value specifying the gamma function for color interpolation.
### getGradientOrigin() {#getGradientOrigin--}
```
public Point2D getGradientOrigin()
```


Returnerar ursprungspunkten för den radiella gradienten.

**Returns:**
java.awt.geom.Point2D - Ursprungspunkten för den radiella gradienten.
### getGradientStops() {#getGradientStops--}
```
public List<XpsGradientStop> getGradientStops()
```


Returnerar en lista med gradientstopp som utgör gradienten.

**Returns:**
java.util.List<com.aspose.xps.XpsGradientStop> - Lista över gradientstopp som utgör gradienten.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Returnerar värdet som definierar den enhetliga transparensen för penselfyllningen.

**Returns:**
float - Värde som definierar den enhetliga transparensen för penselfyllningen.
### getRadiusX() {#getRadiusX--}
```
public float getRadiusX()
```


Returnerar radien i x-dimensionen av ellipsen som definierar den radiella gradienten.

**Returns:**
float - Radien i x-dimensionen av ellipsen som definierar den radiella gradienten.
### getRadiusY() {#getRadiusY--}
```
public float getRadiusY()
```


Returnerar radien i y-dimensionen av ellipsen som definierar den radiella gradienten.

**Returns:**
float - Radien i y-dimensionen av ellipsen som definierar den radiella gradienten.
### getSpreadMethod() {#getSpreadMethod--}
```
public XpsSpreadMethod getSpreadMethod()
```


Returnerar värdet som beskriver hur borsten ska fylla innehållsområdet utanför det primära, initiala gradientområdet.

**Returns:**
[XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) - Value describing how the brush should fill the content area outside of the primary, initial gradient area.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Returnerar matrisomvandlingen som tillämpas på penselns koordinatrymd. Transform‑egenskapen konkateneras med den aktuella effektiva renderingsomvandlingen för att ge en effektiv renderingsomvandling lokal för penseln. Visningsytan för penseln transformeras med den lokala effektiva renderingsomvandlingen.

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


Ställer in mittpunkten för den radiella gradienten (det vill säga ellipsens mittpunkt).

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | java.awt.geom.Point2D | Mittpunkten för den radiella gradienten. |

### setColorInterpolationMode(XpsColorInterpolationMode value) {#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-}
```
public void setColorInterpolationMode(XpsColorInterpolationMode value)
```


Ställer in värde som specificerar gammafunktionen för färginterpolering. Gammajusteringen bör inte tillämpas på alfakomponenten, om den är specificerad.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) | Värde som specificerar gammafunktionen för färginterpolering. |

### setGradientOrigin(Point2D value) {#setGradientOrigin-java.awt.geom.Point2D-}
```
public void setGradientOrigin(Point2D value)
```


Ställer in ursprungspunkten för den radiella gradienten.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | java.awt.geom.Point2D | Ursprungspunkten för den radiala gradienten. |

### setGradientStops(List<XpsGradientStop> value) {#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--}
```
public void setGradientStops(List<XpsGradientStop> value)
```


Ställer in en lista med gradientstopp som utgör gradienten.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | java.util.List<com.aspose.xps.XpsGradientStop> | Lista över gradientstopp som utgör gradienten. |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Sätter värdet som definierar den enhetliga transparensen för penselfyllningen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | float | Värde som definierar den enhetliga transparensen för penselfyllningen. |

### setRadiusX(float value) {#setRadiusX-float-}
```
public void setRadiusX(float value)
```


Ställer in radien i x-dimensionen av ellipsen som definierar den radiella gradienten.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | float | Radien i x-dimensionen av ellipsen som definierar den radiala gradienten. |

### setRadiusY(float value) {#setRadiusY-float-}
```
public void setRadiusY(float value)
```


Ställer in radien i y-dimensionen av ellipsen som definierar den radiella gradienten.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | float | Radien i y-dimensionen av ellipsen som definierar den radiella gradienten. |

### setSpreadMethod(XpsSpreadMethod value) {#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-}
```
public void setSpreadMethod(XpsSpreadMethod value)
```


Ställer in värdet som beskriver hur borsten ska fylla innehållsområdet utanför det primära, initiala gradientområdet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) | Värde som beskriver hur penseln ska fylla innehållsområdet utanför det primära, initiala gradientområdet. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Ställer in matrisomvandlingen som tillämpas på penselns koordinatrymd. Transform‑egenskapen konkateneras med den aktuella effektiva renderingsomvandlingen för att ge en effektiv renderingsomvandling lokal för penseln. Visningsytan för penseln transformeras med den lokala effektiva renderingsomvandlingen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Matrisomvandlingen som tillämpas på penselns koordinatrymd. |

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
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

