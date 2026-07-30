---
title: "AxisRecord"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar Axis Record-strukturen."
type: docs
weight: 10
url: /sv/java/com.aspose.font/axisrecord/
---
**Inheritance:**
java.lang.Object
```
public class AxisRecord
```

Representerar Axis Record-strukturen. Spec: axis-posten ger information om en enskild designaxel.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [AxisRecord(String tag, int axisNameId, int axisOrdering)](#AxisRecord-java.lang.String-int-int-) | Konstruktor |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAxisNameId()](#getAxisNameId--) | Returnerar fältet axisNameID. |
| [getAxisOrdering()](#getAxisOrdering--) | Returnerar fältet axisOrdering. |
| [getClass()](#getClass--) |  |
| [getTag()](#getTag--) | Returnerar en tagg som identifierar designvariationsaxeln. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### AxisRecord(String tag, int axisNameId, int axisOrdering) {#AxisRecord-java.lang.String-int-int-}
```
public AxisRecord(String tag, int axisNameId, int axisOrdering)
```


Konstruktor

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| tag | java.lang.String | Tagg, spec: En tagg som identifierar designvariationsaxeln |
| axisNameId | int | Namnet ID för poster i 'name'-tabellen som tillhandahåller en visningssträng för denna axel |
| axisOrdering | int | Värdet som applikationer kan använda för att bestämma primär sortering av ansiktsnamn, eller för att ordna etiketter när familje- eller ansiktsnamn komponeras. |

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
### getAxisNameId() {#getAxisNameId--}
```
public int getAxisNameId()
```


Returnerar fältet axisNameID. Spec: axisNameID-fältet tillhandahåller ett namn-ID som kan användas för att hämta strängar från 'name'-tabellen som kan användas för att referera till axeln i applikationens användargränssnitt.

**Returns:**
int - axisNameID-fältet.
### getAxisOrdering() {#getAxisOrdering--}
```
public int getAxisOrdering()
```


Returnerar fältet axisOrdering. Spec: Ett värde som applikationer kan använda för att bestämma primär sortering av ansiktsnamn, eller för att ordna etiketter när familje- eller ansiktsnamn komponeras.

**Returns:**
int - axisOrdering-fältet.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getTag() {#getTag--}
```
public String getTag()
```


Returnerar en tagg som identifierar designvariationsaxeln. Spec: Varje axis-poster har en tagg som betecknar axeln. Taggvärden måste följa reglerna för axel-taggar som beskrivs i OpenType Design-Variation Axis Tag Registry.

**Returns:**
java.lang.String - En tagg som identifierar designvariationsaxeln.
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

