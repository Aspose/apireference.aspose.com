---
title: "XpsTileMode"
second_title: "Aspose.Page voor Java API-referentie"
description: "Geldige waarden van de TileMode‑eigenschap van tegelborstels."
type: docs
weight: 66
url: /nl/java/com.aspose.xps/xpstilemode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum XpsTileMode extends Enum<XpsTileMode>
```

Geldige waarden van de TileMode‑eigenschap van tegel‑penselen.
## Velden

| Veld | Beschrijving |
| --- | --- |
| [FlipX](#FlipX) | De tegelindeling is vergelijkbaar met de Tile‑tegelmodus, maar afwisselende kolommen van tegels worden horizontaal gespiegeld. |
| [FlipXY](#FlipXY) | De tegelindeling is vergelijkbaar met de Tile‑tegelmodus, maar afwisselende kolommen van tegels worden horizontaal gespiegeld en afwisselende rijen van tegels worden verticaal gespiegeld. |
| [FlipY](#FlipY) | De tegelindeling is vergelijkbaar met de Tile‑tegelmodus, maar afwisselende rijen van tegels worden verticaal gespiegeld. |
| [None](#None) | In deze modus wordt alleen de enkele basistegel getekend. |
| [Tile](#Tile) | In deze modus wordt de basistegel getekend en wordt het resterende gebied opgevuld door de basistegel te herhalen zodat de rechterrand van elke tegel tegen de linkerrand van de volgende aanligt, en de onderrand van elke tegel tegen de bovenzijde van de volgende. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [<T>valueOf(Class<T> arg0, String arg1)](#-T-valueOf-java.lang.Class-T--java.lang.String-) |  |
| [compareTo(E arg0)](#compareTo-E-) |  |
| [describeConstable()](#describeConstable--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDeclaringClass()](#getDeclaringClass--) |  |
| [hashCode()](#hashCode--) |  |
| [name()](#name--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [ordinal()](#ordinal--) |  |
| [toString()](#toString--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
| [values()](#values--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FlipX {#FlipX}
```
public static final XpsTileMode FlipX
```


De tegelindeling is vergelijkbaar met de Tile‑tegelmodus, maar afwisselende kolommen van tegels worden horizontaal gespiegeld. De basistegel wordt gepositioneerd zoals gespecificeerd door het viewport. Tegels in de kolommen links en rechts van deze tegel worden horizontaal gespiegeld.

### FlipXY {#FlipXY}
```
public static final XpsTileMode FlipXY
```


De tegelindeling is vergelijkbaar met de Tile‑tegelmodus, maar afwisselende kolommen van tegels worden horizontaal gespiegeld en afwisselende rijen van tegels worden verticaal gespiegeld. De basistegel wordt gepositioneerd zoals gespecificeerd door het viewport.

### FlipY {#FlipY}
```
public static final XpsTileMode FlipY
```


De tegelindeling is vergelijkbaar met de Tile‑tegelmodus, maar afwisselende rijen van tegels worden verticaal gespiegeld. De basistegel wordt gepositioneerd zoals gespecificeerd door het viewport. Rijen boven en onder worden verticaal gespiegeld.

### None {#None}
```
public static final XpsTileMode None
```


In deze modus wordt alleen de enkele basistegel getekend. Het resterende gebied blijft transparant.

### Tile {#Tile}
```
public static final XpsTileMode Tile
```


In deze modus wordt de basistegel getekend en wordt het resterende gebied opgevuld door de basistegel te herhalen zodat de rechterrand van elke tegel tegen de linkerrand van de volgende aanligt, en de onderrand van elke tegel tegen de bovenzijde van de volgende.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | java.lang.Class<T> |  |
| arg1 | java.lang.String |  |

**Returns:**
T
### compareTo(E arg0) {#compareTo-E-}
```
public final int compareTo(E arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | E |  |

**Returns:**
int
### describeConstable() {#describeConstable--}
```
public final Optional<Enum.EnumDesc<E>> describeConstable()
```




**Returns:**
java.util.Optional<java.lang.Enum.EnumDesc<E>>
### equals(Object arg0) {#equals-java.lang.Object-}
```
public final boolean equals(Object arg0)
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
### getDeclaringClass() {#getDeclaringClass--}
```
public final Class<E> getDeclaringClass()
```




**Returns:**
java.lang.Class<E>
### hashCode() {#hashCode--}
```
public final int hashCode()
```




**Returns:**
int
### name() {#name--}
```
public final String name()
```




**Returns:**
java.lang.String
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### ordinal() {#ordinal--}
```
public final int ordinal()
```




**Returns:**
int
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static XpsTileMode valueOf(String name)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| naam | java.lang.String |  |

**Returns:**
[XpsTileMode](../../com.aspose.xps/xpstilemode)
### values() {#values--}
```
public static XpsTileMode[] values()
```




**Returns:**
com.aspose.xps.XpsTileMode[]
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

