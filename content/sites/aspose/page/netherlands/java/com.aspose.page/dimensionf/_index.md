---
title: "DimensionF"
second_title: "Aspose.Page voor Java API-referentie"
description: "De Dimension-klasse omvat de breedte en hoogte van een component in enkelprecisie in één object."
type: docs
weight: 11
url: /nl/java/com.aspose.page/dimensionf/
---
**Inheritance:**
java.lang.Object, java.awt.geom.Dimension2D

**All Implemented Interfaces:**
java.io.Serializable
```
public class DimensionF extends Dimension2D implements Serializable
```

De `Dimension`-klasse kapselt de breedte en hoogte van een component (in enkelprecisie) in één object.

Normaal gesproken zijn de waarden van `width` en `height` niet‑negatieve gehele getallen. De constructors die het mogelijk maken een dimension te maken, voorkomen niet dat u een negatieve waarde voor deze eigenschappen instelt. Als de waarde van `width` of `height` negatief is, is het gedrag van sommige methoden die door andere objecten zijn gedefinieerd ongedefinieerd.
## Constructors

| Constructor | Beschrijving |
| --- | --- |
| [DimensionF()](#DimensionF--) | Maakt een instantie van `Dimension` met een breedte van nul en een hoogte van nul. |
| [DimensionF(DimensionF d)](#DimensionF-com.aspose.page.DimensionF-) | Maakt een instantie van `Dimension` waarvan de breedte en hoogte gelijk zijn aan die van de opgegeven dimension. |
| [DimensionF(float width, float height)](#DimensionF-float-float-) | Construeert een `Dimension` en initialiseert deze met de opgegeven breedte en opgegeven hoogte. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| [height](#height) | De hoogte-dimensie; negatieve waarden kunnen worden gebruikt. |
| [width](#width) | De breedte-dimensie; negatieve waarden kunnen worden gebruikt. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [clone()](#clone--) |  |
| [equals(Object obj)](#equals-java.lang.Object-) | Controleert of twee dimension-objecten gelijke waarden hebben. |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | \{@inheritDoc\} |
| [getSize()](#getSize--) | Haalt de grootte op van dit `Dimension`-object. |
| [getWidth()](#getWidth--) | \{@inheritDoc\} |
| [hashCode()](#hashCode--) | Retourneert de hashcode voor dit `Dimension`. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setSize(DimensionF d)](#setSize-com.aspose.page.DimensionF-) | Stelt de grootte van dit `Dimension`-object in op de opgegeven grootte. |
| [setSize(double width, double height)](#setSize-double-double-) | Stelt de grootte van dit `Dimension`-object in op de opgegeven breedte en hoogte in double‑precisie. |
| [setSize(float width, float height)](#setSize-float-float-) | Stelt de grootte van dit `Dimension`-object in op de opgegeven breedte en hoogte. |
| [setSize(Dimension2D arg0)](#setSize-java.awt.geom.Dimension2D-) |  |
| [toString()](#toString--) | Retourneert een tekenreeksrepresentatie van de waarden van de `height`- en `width`-velden van dit `Dimension`-object. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### DimensionF() {#DimensionF--}
```
public DimensionF()
```


Maakt een instantie van `Dimension` met een breedte van nul en een hoogte van nul.

### DimensionF(DimensionF d) {#DimensionF-com.aspose.page.DimensionF-}
```
public DimensionF(DimensionF d)
```


Maakt een instantie van `Dimension` waarvan de breedte en hoogte gelijk zijn aan die van de opgegeven dimension.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | de opgegeven dimension voor de `width`- en `height`-waarden |

### DimensionF(float width, float height) {#DimensionF-float-float-}
```
public DimensionF(float width, float height)
```


Construeert een `Dimension` en initialiseert deze met de opgegeven breedte en opgegeven hoogte.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| breedte | float | de opgegeven breedte |
| hoogte | float | de opgegeven hoogte |

### height {#height}
```
public float height
```


De hoogte-dimensie; negatieve waarden kunnen worden gebruikt.

### width {#width}
```
public float width
```


De breedte-dimensie; negatieve waarden kunnen worden gebruikt.

### clone() {#clone--}
```
public Object clone()
```




**Returns:**
java.lang.Object
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Controleert of twee dimension-objecten gelijke waarden hebben.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getHeight() {#getHeight--}
```
public double getHeight()
```




**Returns:**
double
### getSize() {#getSize--}
```
public DimensionF getSize()
```


Haalt de grootte van dit `Dimension`-object op. Deze methode is opgenomen voor volledigheid, om overeen te komen met de `getSize`-methode die door `Component` is gedefinieerd.

**Returns:**
[DimensionF](../../com.aspose.page/dimensionf) - the size of this dimension, a new instance of `Dimension` with the same width and height
### getWidth() {#getWidth--}
```
public double getWidth()
```




**Returns:**
double
### hashCode() {#hashCode--}
```
public int hashCode()
```


Retourneert de hashcode voor dit `Dimension`.

**Returns:**
int - een hashcode voor dit `Dimension`
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setSize(DimensionF d) {#setSize-com.aspose.page.DimensionF-}
```
public void setSize(DimensionF d)
```


Stelt de grootte van dit `Dimension`-object in op de opgegeven grootte. Deze methode is opgenomen voor volledigheid, om overeen te komen met de `setSize`-methode die door `Component` is gedefinieerd.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | de nieuwe grootte voor dit `Dimension`-object |

### setSize(double width, double height) {#setSize-double-double-}
```
public void setSize(double width, double height)
```


Stelt de grootte van dit `Dimension`-object in op de opgegeven breedte en hoogte met dubbele precisie. Merk op dat als `width` of `height` groter zijn dan `Integer.MAX_VALUE`, ze worden teruggezet naar `Integer.MAX_VALUE`.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| breedte | double | de nieuwe breedte voor het `Dimension`-object |
| hoogte | double | de nieuwe hoogte voor het `Dimension`-object |

### setSize(float width, float height) {#setSize-float-float-}
```
public void setSize(float width, float height)
```


Stelt de grootte van dit `Dimension`-object in op de opgegeven breedte en hoogte. Deze methode is opgenomen voor volledigheid, om overeen te komen met de `setSize`-methode die door `Component` is gedefinieerd.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| breedte | float | de nieuwe breedte voor dit `Dimension`-object |
| hoogte | float | de nieuwe hoogte voor dit `Dimension`-object |

### setSize(Dimension2D arg0) {#setSize-java.awt.geom.Dimension2D-}
```
public void setSize(Dimension2D arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | java.awt.geom.Dimension2D |  |

### toString() {#toString--}
```
public String toString()
```


Retourneert een tekenreeksrepresentatie van de waarden van de `height`- en `width`-velden van dit `Dimension`-object. Deze methode is alleen bedoeld voor debugdoeleinden, en de inhoud en het formaat van de geretourneerde tekenreeks kunnen per implementatie verschillen. De geretourneerde tekenreeks kan leeg zijn, maar mag niet `null` zijn.

**Returns:**
java.lang.String - een tekenreeksrepresentatie van dit `Dimension`-object
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

