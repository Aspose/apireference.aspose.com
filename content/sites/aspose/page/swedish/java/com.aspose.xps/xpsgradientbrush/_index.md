---
title: "XpsGradientBrush"
second_title: "Aspose.Page för Java API-referens"
description: "Klass som inkapslar gemensamma funktioner för LinerGradientBrush- och RadialGradientBrush-element."
type: docs
weight: 26
url: /sv/java/com.aspose.xps/xpsgradientbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush)
```
public abstract class XpsGradientBrush extends XpsTransformableBrush
```

Klass som inkapslar gemensamma funktioner för LinerGradientBrush- och RadialGradientBrush-element.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getColorInterpolationMode()](#getColorInterpolationMode--) | Returnerar värdet som specificerar gammafunktionen för färginterpolering. |
| [getGradientStops()](#getGradientStops--) | Returnerar en lista med gradientstopp som utgör gradienten. |
| [getOpacity()](#getOpacity--) | Returnerar värdet som definierar den enhetliga transparensen för penselfyllningen. |
| [getSpreadMethod()](#getSpreadMethod--) | Returnerar värdet som beskriver hur borsten ska fylla innehållsområdet utanför det primära, initiala gradientområdet. |
| [getTransform()](#getTransform--) | Returnerar matrisomvandlingen som tillämpas på penselns koordinatrymd. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setColorInterpolationMode(XpsColorInterpolationMode value)](#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-) | Ställer in värdet som specificerar gammafunktionen för färginterpolering. |
| [setGradientStops(List<XpsGradientStop> value)](#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--) | Ställer in en lista med gradientstopp som utgör gradienten. |
| [setOpacity(float value)](#setOpacity-float-) | Sätter värdet som definierar den enhetliga transparensen för penselfyllningen. |
| [setSpreadMethod(XpsSpreadMethod value)](#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-) | Ställer in värdet som beskriver hur borsten ska fylla innehållsområdet utanför det primära, initiala gradientområdet. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Ställer in matrisomvandlingen som tillämpas på penselns koordinatrymd. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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




### setColorInterpolationMode(XpsColorInterpolationMode value) {#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-}
```
public void setColorInterpolationMode(XpsColorInterpolationMode value)
```


Ställer in värde som specificerar gammafunktionen för färginterpolering. Gammajusteringen bör inte tillämpas på alfakomponenten, om den är specificerad.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) | Värde som specificerar gammafunktionen för färginterpolering. |

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

