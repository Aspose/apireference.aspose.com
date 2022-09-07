---
title: PdfLightingScheme
second_title: Aspose.3D for Java API Reference
description: LightingScheme specifies the lighting to apply to 3D artwork.
type: docs
weight: 259
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
| [NONE](#NONE) | No lights are used. |
| [WHITE](#WHITE) | Three blue-grey infinite lights, no ambient term |
| [DAY](#DAY) | Three light-grey infinite lights, no ambient term |
| [NIGHT](#NIGHT) | One yellow, one aqua, and one blue infinite light, no ambient term |
| [HARD](#HARD) | Three grey infinite lights, moderate ambient term |
| [PRIMARY](#PRIMARY) | One red, one green, and one blue infinite light, no ambient term |
| [BLUE](#BLUE) | Three blue infinite lights, no ambient term |
| [RED](#RED) | Three red infinite lights, no ambient term |
| [CUBE](#CUBE) | Six grey infinite lights aligned with the major axes, no ambient term |
| [CAD](#CAD) | Three grey infinite lights and one light attached to the camera, no ambient term |
| [HEADLAMP](#HEADLAMP) | Single infinite light attached to the camera, low ambient term |
## Methods

| Method | Description |
| --- | --- |
| [values()](#values--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
### ARTWORK {#ARTWORK}
```
public static final PdfLightingScheme ARTWORK
```


Uses the lights defined in the scene

### NONE {#NONE}
```
public static final PdfLightingScheme NONE
```


No lights are used.

### WHITE {#WHITE}
```
public static final PdfLightingScheme WHITE
```


Three blue-grey infinite lights, no ambient term

### DAY {#DAY}
```
public static final PdfLightingScheme DAY
```


Three light-grey infinite lights, no ambient term

### NIGHT {#NIGHT}
```
public static final PdfLightingScheme NIGHT
```


One yellow, one aqua, and one blue infinite light, no ambient term

### HARD {#HARD}
```
public static final PdfLightingScheme HARD
```


Three grey infinite lights, moderate ambient term

### PRIMARY {#PRIMARY}
```
public static final PdfLightingScheme PRIMARY
```


One red, one green, and one blue infinite light, no ambient term

### BLUE {#BLUE}
```
public static final PdfLightingScheme BLUE
```


Three blue infinite lights, no ambient term

### RED {#RED}
```
public static final PdfLightingScheme RED
```


Three red infinite lights, no ambient term

### CUBE {#CUBE}
```
public static final PdfLightingScheme CUBE
```


Six grey infinite lights aligned with the major axes, no ambient term

### CAD {#CAD}
```
public static final PdfLightingScheme CAD
```


Three grey infinite lights and one light attached to the camera, no ambient term

### HEADLAMP {#HEADLAMP}
```
public static final PdfLightingScheme HEADLAMP
```


Single infinite light attached to the camera, low ambient term

### values() {#values--}
```
public static PdfLightingScheme[] values()
```




**Returns:**
com.aspose.threed.PdfLightingScheme[]
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
