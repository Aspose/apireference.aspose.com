---
title: ApertureMode
second_title: Aspose.3D for Java API Reference
description: Camera aperture modes.
type: docs
weight: 237
url: /java/com.aspose.threed/aperturemode/
---

**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum ApertureMode extends Enum<ApertureMode>
```

Camera aperture modes. The aperture mode determines which values drive the camera aperture. If the aperture mode is HorizAndVert, Horizontal, or Vertical, then the field of view is used. If the aperture mode is FocalLength, then the focal length is used.
## Fields

| Field | Description |
| --- | --- |
| [HORIZ_AND_VERT](#HORIZ-AND-VERT) | Set the angle values for both the horizontal and vertical settings. |
| [HORIZONTAL](#HORIZONTAL) | Set only the horizontal angle. |
| [VERTICAL](#VERTICAL) | Set only the vertical angle. |
| [FOCAL_LENGTH](#FOCAL-LENGTH) | Use focal length directly. |
## Methods

| Method | Description |
| --- | --- |
| [values()](#values--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
### HORIZ_AND_VERT {#HORIZ-AND-VERT}
```
public static final ApertureMode HORIZ_AND_VERT
```


Set the angle values for both the horizontal and vertical settings.

### HORIZONTAL {#HORIZONTAL}
```
public static final ApertureMode HORIZONTAL
```


Set only the horizontal angle.

### VERTICAL {#VERTICAL}
```
public static final ApertureMode VERTICAL
```


Set only the vertical angle.

### FOCAL_LENGTH {#FOCAL-LENGTH}
```
public static final ApertureMode FOCAL_LENGTH
```


Use focal length directly.

### values() {#values--}
```
public static ApertureMode[] values()
```




**Returns:**
com.aspose.threed.ApertureMode[]
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static ApertureMode valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[ApertureMode](../../com.aspose.threed/aperturemode)
