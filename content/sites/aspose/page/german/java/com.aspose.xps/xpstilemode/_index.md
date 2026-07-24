---
title: "XpsTileMode"
second_title: "Aspose.Page for Java API-Referenz"
description: "Gültige Werte der TileMode-Eigenschaft von Kachelpinseln."
type: docs
weight: 66
url: /de/java/com.aspose.xps/xpstilemode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum XpsTileMode extends Enum<XpsTileMode>
```

Gültige Werte der Eigenschaft TileMode von Kachel‑Pinseln.
## Felder

| Feld | Beschreibung |
| --- | --- |
| [FlipX](#FlipX) | Die Anordnung der Kacheln ist ähnlich dem Tile tile mode, aber alternierende Spalten von Kacheln werden horizontal gespiegelt. |
| [FlipXY](#FlipXY) | Die Anordnung der Kacheln ist ähnlich dem Tile tile mode, aber alternierende Spalten von Kacheln werden horizontal und alternierende Reihen von Kacheln vertikal gespiegelt. |
| [FlipY](#FlipY) | Die Anordnung der Kacheln ist ähnlich dem Tile tile mode, aber alternierende Reihen von Kacheln werden vertikal gespiegelt. |
| [None](#None) | In diesem Modus wird nur die einzelne Basis‑Kachel gezeichnet. |
| [Tile](#Tile) | In diesem Modus wird die Basis‑Kachel gezeichnet und der verbleibende Bereich wird gefüllt, indem die Basis‑Kachel wiederholt wird, sodass die rechte Kante jeder Kachel an die linke Kante der nächsten anstößt und die untere Kante jeder Kachel an die obere Kante der nächsten anstößt. |
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
### FlipX {#FlipX}
```
public static final XpsTileMode FlipX
```


Die Anordnung der Kacheln ist ähnlich dem Tile tile mode, aber alternierende Spalten von Kacheln werden horizontal gespiegelt. Die Basis‑Kachel wird wie vom Ansichtsfenster angegeben positioniert. Kacheln in den Spalten links und rechts von dieser Kachel werden horizontal gespiegelt.

### FlipXY {#FlipXY}
```
public static final XpsTileMode FlipXY
```


Die Anordnung der Kacheln ist ähnlich dem Tile tile mode, aber alternierende Spalten von Kacheln werden horizontal und alternierende Reihen von Kacheln vertikal gespiegelt. Die Basis‑Kachel wird wie vom Ansichtsfenster angegeben positioniert.

### FlipY {#FlipY}
```
public static final XpsTileMode FlipY
```


Die Anordnung der Kacheln ist ähnlich dem Tile tile mode, aber alternierende Reihen von Kacheln werden vertikal gespiegelt. Die Basis‑Kachel wird wie vom Ansichtsfenster angegeben positioniert. Reihen ober- und unterhalb werden vertikal gespiegelt.

### None {#None}
```
public static final XpsTileMode None
```


In diesem Modus wird nur die einzelne Basis‑Kachel gezeichnet. Der verbleibende Bereich bleibt transparent.

### Tile {#Tile}
```
public static final XpsTileMode Tile
```


In diesem Modus wird die Basis‑Kachel gezeichnet und der verbleibende Bereich wird gefüllt, indem die Basis‑Kachel wiederholt wird, sodass die rechte Kante jeder Kachel an die linke Kante der nächsten anstößt und die untere Kante jeder Kachel an die obere Kante der nächsten anstößt.

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
public static XpsTileMode valueOf(String name)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String |  |

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

