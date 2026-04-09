---
title: Interpolation
second_title: Aspose.3D für Java API-Referenz
description: Der Interpolationstyp der Schlüsselbilder.
type: docs
weight: 283
url: /de/java/com.aspose.threed/interpolation/
---

**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum Interpolation extends Enum<Interpolation>
```

Der Interpolationstyp des Schlüsselbilds.
## Felder

| Feld | Beschreibung |
| --- | --- |
| [BEZIER](#BEZIER) | Ein Bézier- oder Hermite-Spline. |
| [B_SPLINE](#B-SPLINE) | Basis-Splines werden durch eine Reihe von Kontrollpunkten definiert, wobei die Kurve garantiert nur durch den ersten und den letzten Punkt verläuft. |
| [CARDINAL_SPLINE](#CARDINAL-SPLINE) | Ein Kardinalspline ist ein kubischer Hermite‑Spline, dessen Tangenten durch die Endpunkte und einen Spannungsparameter definiert sind. |
| [CONSTANT](#CONSTANT) | Der Wert bleibt bis zum nächsten Segment konstant auf dem Wert des ersten Punktes. |
| [LINEAR](#LINEAR) | Lineare Interpolation ist eine gerade Linie zwischen zwei Punkten. |
| [TCB_SPLINE](#TCB-SPLINE) | Auch als Kochanek‑Bartels‑Spline bezeichnet, wird das Tangentenverhalten durch Spannung/Bias/Kontinuität definiert. |
## Methoden

| Methode | Beschreibung |
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
### BEZIER {#BEZIER}
```
public static final Interpolation BEZIER
```


Ein Bézier- oder Hermite-Spline.

### B_SPLINE {#B-SPLINE}
```
public static final Interpolation B_SPLINE
```


Basis-Splines werden durch eine Reihe von Kontrollpunkten definiert, wobei die Kurve garantiert nur durch den ersten und den letzten Punkt verläuft.

### CARDINAL_SPLINE {#CARDINAL-SPLINE}
```
public static final Interpolation CARDINAL_SPLINE
```


Ein Kardinalspline ist ein kubischer Hermite‑Spline, dessen Tangenten durch die Endpunkte und einen Spannungsparameter definiert sind.

### CONSTANT {#CONSTANT}
```
public static final Interpolation CONSTANT
```


Der Wert bleibt bis zum nächsten Segment konstant auf dem Wert des ersten Punktes.

### LINEAR {#LINEAR}
```
public static final Interpolation LINEAR
```


Lineare Interpolation ist eine gerade Linie zwischen zwei Punkten.

### TCB_SPLINE {#TCB-SPLINE}
```
public static final Interpolation TCB_SPLINE
```


Auch als Kochanek‑Bartels‑Spline bezeichnet, wird das Tangentenverhalten durch Spannung/Bias/Kontinuität definiert.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
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
| Parameter | Typ | Beschreibung |
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
| Parameter | Typ | Beschreibung |
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
public static Interpolation valueOf(String name)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String |  |

**Returns:**
[Interpolation](../../com.aspose.threed/interpolation)
### values() {#values--}
```
public static Interpolation[] values()
```




**Returns:**
com.aspose.threed.Interpolation[]
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final void wait(long arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

