---
title: Discreet3dsLoadOptions
second_title: Aspose.3D for Java API Reference
description: Load options for 3DS file.
type: docs
weight: 39
url: /java/com.aspose.threed/discreet3dsloadoptions/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.IOConfig](../../com.aspose.threed/ioconfig), [com.aspose.threed.LoadOptions](../../com.aspose.threed/loadoptions)
```
public class Discreet3dsLoadOptions extends LoadOptions
```

Load options for 3DS file.
## Constructors

| Constructor | Description |
| --- | --- |
| [Discreet3dsLoadOptions()](#Discreet3dsLoadOptions--) | Constructor of com.aspose.threed.Discreet3dsLoadOptions |
## Methods

| Method | Description |
| --- | --- |
| [getGammaCorrectedColor()](#getGammaCorrectedColor--) | A 3ds file may contains original color and gamma corrected color for same attribute, Setting this to true will use the gamma corrected color if possible, otherwise the Aspose.3D will try to use the original color. |
| [setGammaCorrectedColor(boolean value)](#setGammaCorrectedColor-boolean-) | A 3ds file may contains original color and gamma corrected color for same attribute, Setting this to true will use the gamma corrected color if possible, otherwise the Aspose.3D will try to use the original color. |
| [getFlipCoordinateSystem()](#getFlipCoordinateSystem--) | Gets flip coordinate system of control points/normal during importing/exporting. |
| [setFlipCoordinateSystem(boolean value)](#setFlipCoordinateSystem-boolean-) | Sets flip coordinate system of control points/normal during importing/exporting. |
| [getApplyAnimationTransform()](#getApplyAnimationTransform--) | Gets whether to use the transformation defined in the first frame of animation track. |
| [setApplyAnimationTransform(boolean value)](#setApplyAnimationTransform-boolean-) | Sets whether to use the transformation defined in the first frame of animation track. |
### Discreet3dsLoadOptions() {#Discreet3dsLoadOptions--}
```
public Discreet3dsLoadOptions()
```


Constructor of com.aspose.threed.Discreet3dsLoadOptions

### getGammaCorrectedColor() {#getGammaCorrectedColor--}
```
public boolean getGammaCorrectedColor()
```


A 3ds file may contains original color and gamma corrected color for same attribute, Setting this to true will use the gamma corrected color if possible, otherwise the Aspose.3D will try to use the original color.

**Returns:**
boolean
### setGammaCorrectedColor(boolean value) {#setGammaCorrectedColor-boolean-}
```
public void setGammaCorrectedColor(boolean value)
```


A 3ds file may contains original color and gamma corrected color for same attribute, Setting this to true will use the gamma corrected color if possible, otherwise the Aspose.3D will try to use the original color.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getFlipCoordinateSystem() {#getFlipCoordinateSystem--}
```
public boolean getFlipCoordinateSystem()
```


Gets flip coordinate system of control points/normal during importing/exporting.

**Returns:**
boolean
### setFlipCoordinateSystem(boolean value) {#setFlipCoordinateSystem-boolean-}
```
public void setFlipCoordinateSystem(boolean value)
```


Sets flip coordinate system of control points/normal during importing/exporting.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getApplyAnimationTransform() {#getApplyAnimationTransform--}
```
public boolean getApplyAnimationTransform()
```


Gets whether to use the transformation defined in the first frame of animation track.

**Returns:**
boolean
### setApplyAnimationTransform(boolean value) {#setApplyAnimationTransform-boolean-}
```
public void setApplyAnimationTransform(boolean value)
```


Sets whether to use the transformation defined in the first frame of animation track.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

