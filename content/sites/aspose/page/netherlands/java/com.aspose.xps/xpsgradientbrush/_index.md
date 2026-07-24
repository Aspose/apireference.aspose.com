---
title: "XpsGradientBrush"
second_title: "Aspose.Page voor Java API-referentie"
description: "Klasse die de algemene kenmerken van LinerGradientBrush- en RadialGradientBrush-elementen omvat."
type: docs
weight: 26
url: /nl/java/com.aspose.xps/xpsgradientbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush)
```
public abstract class XpsGradientBrush extends XpsTransformableBrush
```

Klasse die de algemene kenmerken van LinerGradientBrush- en RadialGradientBrush-elementen omvat.
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getColorInterpolationMode()](#getColorInterpolationMode--) | Retourneert een waarde die de gamma-functie voor kleurinterpolatie specificeert. |
| [getGradientStops()](#getGradientStops--) | Retourneert een lijst met gradientstops die de gradient vormen. |
| [getOpacity()](#getOpacity--) | Retourneert de waarde die de uniforme transparantie van de kwastvulling definieert. |
| [getSpreadMethod()](#getSpreadMethod--) | Retourneert een waarde die beschrijft hoe de kwast het inhoudsgebied buiten het primaire, initiële gradientgebied moet vullen. |
| [getTransform()](#getTransform--) | Retourneert de matrixtransformatie die op de coördinatenruimte van de kwast wordt toegepast. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setColorInterpolationMode(XpsColorInterpolationMode value)](#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-) | Stelt een waarde in die de gamma-functie voor kleurinterpolatie specificeert. |
| [setGradientStops(List<XpsGradientStop> value)](#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--) | Stelt een lijst met gradientstops in die de gradient vormen. |
| [setOpacity(float value)](#setOpacity-float-) | Stelt de waarde in die de uniforme transparantie van de kwastvulling definieert. |
| [setSpreadMethod(XpsSpreadMethod value)](#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-) | Stelt een waarde in die beschrijft hoe de kwast het inhoudsgebied buiten het primaire, initiële gradientgebied moet vullen. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Stelt de matrixtransformatie in die op de coördinatenruimte van de kwast wordt toegepast. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
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


Retourneert een waarde die de gamma-functie voor kleurinterpolatie specificeert. De gamma-aanpassing mag niet op het alfabestanddeel worden toegepast, indien gespecificeerd.

**Returns:**
[XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) - Value specifying the gamma function for color interpolation.
### getGradientStops() {#getGradientStops--}
```
public List<XpsGradientStop> getGradientStops()
```


Retourneert een lijst met gradientstops die de gradient vormen.

**Returns:**
java.util.List<com.aspose.xps.XpsGradientStop> - Lijst met gradientstops die de gradient vormen.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Retourneert de waarde die de uniforme transparantie van de kwastvulling definieert.

**Returns:**
float - Waarde die de uniforme transparantie van de kwastvulling definieert.
### getSpreadMethod() {#getSpreadMethod--}
```
public XpsSpreadMethod getSpreadMethod()
```


Retourneert een waarde die beschrijft hoe de kwast het inhoudsgebied buiten het primaire, initiële gradientgebied moet vullen.

**Returns:**
[XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) - Value describing how the brush should fill the content area outside of the primary, initial gradient area.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Retourneert de matrixtransformatie die op de coördinatenruimte van de kwast wordt toegepast. De Transform-eigenschap wordt samengevoegd met de huidige effectieve rendertransformatie om een effectieve rendertransformatie lokaal voor de kwast te verkrijgen. Het viewport voor de kwast wordt getransformeerd met behulp van de lokale effectieve rendertransformatie.

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


Stelt de waarde in die de gamma-functie voor kleurinterpolatie specificeert. De gamma-aanpassing mag niet worden toegepast op de alphacomponent, indien gespecificeerd.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) | Waarde die de gamma-functie voor kleurinterpolatie specificeert. |

### setGradientStops(List<XpsGradientStop> value) {#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--}
```
public void setGradientStops(List<XpsGradientStop> value)
```


Stelt een lijst met gradientstops in die de gradient vormen.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | java.util.List<com.aspose.xps.XpsGradientStop> | Lijst van kleurverloopstops die de verloop vormen. |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Stelt de waarde in die de uniforme transparantie van de kwastvulling definieert.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | float | Waarde die de uniforme transparantie van de kwastvulling definieert. |

### setSpreadMethod(XpsSpreadMethod value) {#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-}
```
public void setSpreadMethod(XpsSpreadMethod value)
```


Stelt een waarde in die beschrijft hoe de kwast het inhoudsgebied buiten het primaire, initiële gradientgebied moet vullen.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) | Waarde die beschrijft hoe de penseel de inhoudsgebied buiten het primaire, initiële kleurverloopgebied moet vullen. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Stelt de matrixtransformatie in die op de coördinatenruimte van de kwast wordt toegepast. De Transform-eigenschap wordt samengevoegd met de huidige effectieve rendertransformatie om een effectieve rendertransformatie lokaal voor de kwast te verkrijgen. Het viewport voor de kwast wordt getransformeerd met behulp van de lokale effectieve rendertransformatie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | De matrixtransformatie die op de coördinatenruimte van de kwast wordt toegepast. |

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
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

