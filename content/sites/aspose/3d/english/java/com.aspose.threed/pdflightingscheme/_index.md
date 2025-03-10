---
title: PdfLightingScheme
second_title: Aspose.3D for Java API Reference
description: LightingScheme specifies the lighting to apply to 3D artwork.
type: docs
weight: 283
url: /java/com.aspose.threed/pdflightingscheme/
---

**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum PdfLightingScheme extends Enum<PdfLightingScheme>
```

LightingScheme specifies the lighting to apply to 3D artwork.
## Fields

| Field | Description |
| --- | --- |
| [ARTWORK](#ARTWORK) | Uses the lights defined in the scene |
| [BLUE](#BLUE) | Three blue infinite lights, no ambient term |
| [CAD](#CAD) | Three grey infinite lights and one light attached to the camera, no ambient term |
| [CUBE](#CUBE) | Six grey infinite lights aligned with the major axes, no ambient term |
| [DAY](#DAY) | Three light-grey infinite lights, no ambient term |
| [HARD](#HARD) | Three grey infinite lights, moderate ambient term |
| [HEADLAMP](#HEADLAMP) | Single infinite light attached to the camera, low ambient term |
| [NIGHT](#NIGHT) | One yellow, one aqua, and one blue infinite light, no ambient term |
| [NONE](#NONE) | No lights are used. |
| [PRIMARY](#PRIMARY) | One red, one green, and one blue infinite light, no ambient term |
| [RED](#RED) | Three red infinite lights, no ambient term |
| [WHITE](#WHITE) | Three blue-grey infinite lights, no ambient term |
## Methods

| Method | Description |
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
### ARTWORK {#ARTWORK}
```
public static final PdfLightingScheme ARTWORK
```


Uses the lights defined in the scene

### BLUE {#BLUE}
```
public static final PdfLightingScheme BLUE
```


Three blue infinite lights, no ambient term

### CAD {#CAD}
```
public static final PdfLightingScheme CAD
```


Three grey infinite lights and one light attached to the camera, no ambient term

### CUBE {#CUBE}
```
public static final PdfLightingScheme CUBE
```


Six grey infinite lights aligned with the major axes, no ambient term

### DAY {#DAY}
```
public static final PdfLightingScheme DAY
```


Three light-grey infinite lights, no ambient term

### HARD {#HARD}
```
public static final PdfLightingScheme HARD
```


Three grey infinite lights, moderate ambient term

### HEADLAMP {#HEADLAMP}
```
public static final PdfLightingScheme HEADLAMP
```


Single infinite light attached to the camera, low ambient term

### NIGHT {#NIGHT}
```
public static final PdfLightingScheme NIGHT
```


One yellow, one aqua, and one blue infinite light, no ambient term

### NONE {#NONE}
```
public static final PdfLightingScheme NONE
```


No lights are used.

### PRIMARY {#PRIMARY}
```
public static final PdfLightingScheme PRIMARY
```


One red, one green, and one blue infinite light, no ambient term

### RED {#RED}
```
public static final PdfLightingScheme RED
```


Three red infinite lights, no ambient term

### WHITE {#WHITE}
```
public static final PdfLightingScheme WHITE
```


Three blue-grey infinite lights, no ambient term

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parameter | Type | Description |
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
| Parameter | Type | Description |
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
| Parameter | Type | Description |
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
public static PdfLightingScheme valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[PdfLightingScheme](../../com.aspose.threed/pdflightingscheme)
### values() {#values--}
```
public static PdfLightingScheme[] values()
```




**Returns:**
com.aspose.threed.PdfLightingScheme[]
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

