---
title: "DimensionF"
second_title: "Aspose.Page för Java API-referens"
description: "Dimension-klassen kapslar in bredden och höjden på en komponent i enkelprecision i ett enda objekt."
type: docs
weight: 11
url: /sv/java/com.aspose.page/dimensionf/
---
**Inheritance:**
java.lang.Object, java.awt.geom.Dimension2D

**All Implemented Interfaces:**
java.io.Serializable
```
public class DimensionF extends Dimension2D implements Serializable
```

Klassen `Dimension` kapslar in bredden och höjden på en komponent (i enkelprecision) i ett enda objekt.

Normalt är värdena för `width` och `height` icke-negativa heltal. Konstruktorerna som låter dig skapa en dimension hindrar dig inte från att ange ett negativt värde för dessa egenskaper. Om värdet för `width` eller `height` är negativt är beteendet för vissa metoder som definieras av andra objekt odefinierat.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [DimensionF()](#DimensionF--) | Skapar en instans av `Dimension` med en bredd på noll och en höjd på noll. |
| [DimensionF(DimensionF d)](#DimensionF-com.aspose.page.DimensionF-) | Skapar en instans av `Dimension` vars bredd och höjd är samma som för den angivna dimensionen. |
| [DimensionF(float width, float height)](#DimensionF-float-float-) | Konstruerar en `Dimension` och initierar den till den angivna bredden och den angivna höjden. |
## Fält

| Fält | Beskrivning |
| --- | --- |
| [height](#height) | Höjddimensionen; negativa värden kan användas. |
| [width](#width) | Bredddimensionen; negativa värden kan användas. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [clone()](#clone--) |  |
| [equals(Object obj)](#equals-java.lang.Object-) | Kontrollerar om två dimensionsobjekt har lika värden. |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | \{@inheritDoc\} |
| [getSize()](#getSize--) | Hämtar storleken på detta `Dimension`-objekt. |
| [getWidth()](#getWidth--) | \{@inheritDoc\} |
| [hashCode()](#hashCode--) | Returnerar hashkoden för detta `Dimension`. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setSize(DimensionF d)](#setSize-com.aspose.page.DimensionF-) | Ställer in storleken på detta `Dimension`-objekt till den angivna storleken. |
| [setSize(double width, double height)](#setSize-double-double-) | Ställer in storleken på detta `Dimension`-objekt till den angivna bredden och höjden i dubbel precision. |
| [setSize(float width, float height)](#setSize-float-float-) | Ställer in storleken på detta `Dimension`-objekt till den angivna bredden och höjden. |
| [setSize(Dimension2D arg0)](#setSize-java.awt.geom.Dimension2D-) |  |
| [toString()](#toString--) | Returnerar en strängrepresentation av värdena för detta `Dimension`-objekts `height`- och `width`-fält. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### DimensionF() {#DimensionF--}
```
public DimensionF()
```


Skapar en instans av `Dimension` med en bredd på noll och en höjd på noll.

### DimensionF(DimensionF d) {#DimensionF-com.aspose.page.DimensionF-}
```
public DimensionF(DimensionF d)
```


Skapar en instans av `Dimension` vars bredd och höjd är samma som för den angivna dimensionen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | den angivna dimensionen för `width`- och `height`-värdena |

### DimensionF(float width, float height) {#DimensionF-float-float-}
```
public DimensionF(float width, float height)
```


Konstruerar en `Dimension` och initierar den till den angivna bredden och den angivna höjden.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| width | float | den angivna bredden |
| height | float | den angivna höjden |

### height {#height}
```
public float height
```


Höjddimensionen; negativa värden kan användas.

### width {#width}
```
public float width
```


Bredddimensionen; negativa värden kan användas.

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


Kontrollerar om två dimensionsobjekt har lika värden.

**Parameters:**
| Parameter | Typ | Beskrivning |
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


Hämtar storleken på detta `Dimension`-objekt. Denna metod inkluderas för fullständighet, för att motsvara `getSize`-metoden som definieras av `Component`.

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


Returnerar hashkoden för detta `Dimension`.

**Returns:**
int - en hashkod för detta `Dimension`
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


Ställer in storleken på detta `Dimension`-objekt till den angivna storleken. Denna metod inkluderas för fullständighet, för att motsvara `setSize`-metoden som definieras av `Component`.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | den nya storleken för detta `Dimension`-objekt |

### setSize(double width, double height) {#setSize-double-double-}
```
public void setSize(double width, double height)
```


Ställer in storleken på detta `Dimension`-objekt till den angivna bredden och höjden i dubbel precision. Observera att om `width` eller `height` är större än `Integer.MAX_VALUE` kommer de att återställas till `Integer.MAX_VALUE`.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| width | double | den nya bredden för `Dimension`-objektet |
| height | double | den nya höjden för `Dimension`-objektet |

### setSize(float width, float height) {#setSize-float-float-}
```
public void setSize(float width, float height)
```


Ställer in storleken på detta `Dimension`-objekt till den angivna bredden och höjden. Denna metod inkluderas för fullständighet, för att motsvara `setSize`-metoden som definieras av `Component`.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| width | float | den nya bredden för detta `Dimension`-objekt |
| height | float | den nya höjden för detta `Dimension`-objekt |

### setSize(Dimension2D arg0) {#setSize-java.awt.geom.Dimension2D-}
```
public void setSize(Dimension2D arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | java.awt.geom.Dimension2D |  |

### toString() {#toString--}
```
public String toString()
```


Returnerar en strängrepresentation av värdena för detta `Dimension`-objekts `height`- och `width`-fält. Denna metod är avsedd att endast användas för felsökningsändamål, och innehållet och formatet på den returnerade strängen kan variera mellan implementationer. Den returnerade strängen kan vara tom men får inte vara `null`.

**Returns:**
java.lang.String - en strängrepresentation av detta `Dimension`-objekt
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

