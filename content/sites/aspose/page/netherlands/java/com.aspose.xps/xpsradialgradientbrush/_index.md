---
title: "XpsRadialGradientBrush"
second_title: "Aspose.Page voor Java API-referentie"
description: "Klasse die de kenmerken van het RadialGradientBrush-eigenschapselement omvat."
type: docs
weight: 48
url: /nl/java/com.aspose.xps/xpsradialgradientbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsGradientBrush](../../com.aspose.xps/xpsgradientbrush)
```
public final class XpsRadialGradientBrush extends XpsGradientBrush
```

Klasse die de eigenschappen van het RadialGradientBrush-element incapsuleert. Dit element wordt gebruikt om een radiale gradientkwast te specificeren.
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [deepClone()](#deepClone--) | Kloont deze radiale gradientkwast. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCenter()](#getCenter--) | Retourneert het middelpunt van de radiale gradient (dat is het midden van de ellips). |
| [getClass()](#getClass--) |  |
| [getColorInterpolationMode()](#getColorInterpolationMode--) | Retourneert een waarde die de gamma-functie voor kleurinterpolatie specificeert. |
| [getGradientOrigin()](#getGradientOrigin--) | Retourneert het oorsprongspunt van de radiale gradient. |
| [getGradientStops()](#getGradientStops--) | Retourneert een lijst met gradientstops die de gradient vormen. |
| [getOpacity()](#getOpacity--) | Retourneert de waarde die de uniforme transparantie van de kwastvulling definieert. |
| [getRadiusX()](#getRadiusX--) | Retourneert de radius in de x-dimensie van de ellips die de radiale gradient definieert. |
| [getRadiusY()](#getRadiusY--) | Retourneert de radius in de y-dimensie van de ellips die de radiale gradient definieert. |
| [getSpreadMethod()](#getSpreadMethod--) | Retourneert een waarde die beschrijft hoe de kwast het inhoudsgebied buiten het primaire, initiële gradientgebied moet vullen. |
| [getTransform()](#getTransform--) | Retourneert de matrixtransformatie die op de coördinatenruimte van de kwast wordt toegepast. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setCenter(Point2D value)](#setCenter-java.awt.geom.Point2D-) | Stelt het middelpunt van de radiale gradient in (dat is het midden van de ellips). |
| [setColorInterpolationMode(XpsColorInterpolationMode value)](#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-) | Stelt een waarde in die de gamma-functie voor kleurinterpolatie specificeert. |
| [setGradientOrigin(Point2D value)](#setGradientOrigin-java.awt.geom.Point2D-) | Stelt het oorsprongspunt van de radiale gradient in. |
| [setGradientStops(List<XpsGradientStop> value)](#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--) | Stelt een lijst met gradientstops in die de gradient vormen. |
| [setOpacity(float value)](#setOpacity-float-) | Stelt de waarde in die de uniforme transparantie van de kwastvulling definieert. |
| [setRadiusX(float value)](#setRadiusX-float-) | Stelt de radius in de x-dimensie van de ellips in die de radiale gradient definieert. |
| [setRadiusY(float value)](#setRadiusY-float-) | Stelt de radius in de y-dimensie van de ellips in die de radiale gradient definieert. |
| [setSpreadMethod(XpsSpreadMethod value)](#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-) | Stelt een waarde in die beschrijft hoe de kwast het inhoudsgebied buiten het primaire, initiële gradientgebied moet vullen. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Stelt de matrixtransformatie in die op de coördinatenruimte van de kwast wordt toegepast. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsRadialGradientBrush deepClone()
```


Kloont deze radiale gradientkwast.

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - Clone of this radial gradient brush.
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
### getCenter() {#getCenter--}
```
public Point2D getCenter()
```


Retourneert het middelpunt van de radiale gradient (dat is het midden van de ellips).

**Returns:**
java.awt.geom.Point2D - Het middelpunt van de radiale gradient.
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
### getGradientOrigin() {#getGradientOrigin--}
```
public Point2D getGradientOrigin()
```


Retourneert het oorsprongspunt van de radiale gradient.

**Returns:**
java.awt.geom.Point2D - Het oorsprongspunt van de radiale gradient.
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
### getRadiusX() {#getRadiusX--}
```
public float getRadiusX()
```


Retourneert de radius in de x-dimensie van de ellips die de radiale gradient definieert.

**Returns:**
float - De radius in de x-dimensie van de ellips die de radiale gradient definieert.
### getRadiusY() {#getRadiusY--}
```
public float getRadiusY()
```


Retourneert de radius in de y-dimensie van de ellips die de radiale gradient definieert.

**Returns:**
float - De radius in de y-dimensie van de ellips die de radiale gradient definieert.
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




### setCenter(Point2D value) {#setCenter-java.awt.geom.Point2D-}
```
public void setCenter(Point2D value)
```


Stelt het middelpunt van de radiale gradient in (dat is het midden van de ellips).

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | java.awt.geom.Point2D | Het middelpunt van de radiale gradient. |

### setColorInterpolationMode(XpsColorInterpolationMode value) {#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-}
```
public void setColorInterpolationMode(XpsColorInterpolationMode value)
```


Stelt de waarde in die de gamma-functie voor kleurinterpolatie specificeert. De gamma-aanpassing mag niet worden toegepast op de alphacomponent, indien gespecificeerd.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) | Waarde die de gamma-functie voor kleurinterpolatie specificeert. |

### setGradientOrigin(Point2D value) {#setGradientOrigin-java.awt.geom.Point2D-}
```
public void setGradientOrigin(Point2D value)
```


Stelt het oorsprongspunt van de radiale gradient in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | java.awt.geom.Point2D | Het oorsprongspunt van de radiale gradiënt. |

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

### setRadiusX(float value) {#setRadiusX-float-}
```
public void setRadiusX(float value)
```


Stelt de radius in de x-dimensie van de ellips in die de radiale gradient definieert.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | float | De straal in de x-dimensie van de ellips die de radiale gradiënt definieert. |

### setRadiusY(float value) {#setRadiusY-float-}
```
public void setRadiusY(float value)
```


Stelt de radius in de y-dimensie van de ellips in die de radiale gradient definieert.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | float | De straal in de y-dimensie van de ellips die de radiale gradiënt definieert. |

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

