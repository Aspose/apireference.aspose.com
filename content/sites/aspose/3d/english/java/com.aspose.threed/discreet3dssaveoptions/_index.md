---
title: Discreet3dsSaveOptions
second_title: Aspose.3D for Java API Reference
description: Save options for 3DS file.
type: docs
weight: 40
url: /java/com.aspose.threed/discreet3dssaveoptions/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.IOConfig](../../com.aspose.threed/ioconfig), [com.aspose.threed.SaveOptions](../../com.aspose.threed/saveoptions)
```
public class Discreet3dsSaveOptions extends SaveOptions
```

Save options for 3DS file.
## Constructors

| Constructor | Description |
| --- | --- |
| [Discreet3dsSaveOptions()](#Discreet3dsSaveOptions--) | Constructor of com.aspose.threed.Discreet3dsSaveOptions |
## Methods

| Method | Description |
| --- | --- |
| [getExportLight()](#getExportLight--) | Gets whether export all lights in the scene. |
| [setExportLight(boolean value)](#setExportLight-boolean-) | Sets whether export all lights in the scene. |
| [getExportCamera()](#getExportCamera--) | Gets whether export all cameras in the scene. |
| [setExportCamera(boolean value)](#setExportCamera-boolean-) | Sets whether export all cameras in the scene. |
| [getDuplicatedNameSeparator()](#getDuplicatedNameSeparator--) | The separator between object's name and the duplicated counter, default value is "\_". |
| [setDuplicatedNameSeparator(String value)](#setDuplicatedNameSeparator-java.lang.String-) | The separator between object's name and the duplicated counter, default value is "\_". |
| [getDuplicatedNameCounterBase()](#getDuplicatedNameCounterBase--) | The counter used by generating new name for duplicated names, default value is 2. |
| [setDuplicatedNameCounterBase(int value)](#setDuplicatedNameCounterBase-int-) | The counter used by generating new name for duplicated names, default value is 2. |
| [getDuplicatedNameCounterFormat()](#getDuplicatedNameCounterFormat--) | The format of the duplicated counter, default value is empty string. |
| [setDuplicatedNameCounterFormat(String value)](#setDuplicatedNameCounterFormat-java.lang.String-) | The format of the duplicated counter, default value is empty string. |
| [getMasterScale()](#getMasterScale--) | Gets the master scale used in exporting. |
| [setMasterScale(double value)](#setMasterScale-double-) | Sets the master scale used in exporting. |
| [getGammaCorrectedColor()](#getGammaCorrectedColor--) | A 3ds file may contains original color and gamma corrected color for same attribute, Setting this to true will use the gamma corrected color if possible, otherwise the Aspose.3D will try to use the original color. |
| [setGammaCorrectedColor(boolean value)](#setGammaCorrectedColor-boolean-) | A 3ds file may contains original color and gamma corrected color for same attribute, Setting this to true will use the gamma corrected color if possible, otherwise the Aspose.3D will try to use the original color. |
| [getFlipCoordinateSystem()](#getFlipCoordinateSystem--) | Gets flip coordinate system of control points/normal during importing/exporting. |
| [setFlipCoordinateSystem(boolean value)](#setFlipCoordinateSystem-boolean-) | Sets flip coordinate system of control points/normal during importing/exporting. |
| [getHighPreciseColor()](#getHighPreciseColor--) | If this is true, the generated 3ds file will use high precise color, means each channel of red/green/blue are in 32bit float. |
| [setHighPreciseColor(boolean value)](#setHighPreciseColor-boolean-) | If this is true, the generated 3ds file will use high precise color, means each channel of red/green/blue are in 32bit float. |
### Discreet3dsSaveOptions() {#Discreet3dsSaveOptions--}
```
public Discreet3dsSaveOptions()
```


Constructor of com.aspose.threed.Discreet3dsSaveOptions

### getExportLight() {#getExportLight--}
```
public boolean getExportLight()
```


Gets whether export all lights in the scene.

**Returns:**
boolean
### setExportLight(boolean value) {#setExportLight-boolean-}
```
public void setExportLight(boolean value)
```


Sets whether export all lights in the scene.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getExportCamera() {#getExportCamera--}
```
public boolean getExportCamera()
```


Gets whether export all cameras in the scene.

**Returns:**
boolean
### setExportCamera(boolean value) {#setExportCamera-boolean-}
```
public void setExportCamera(boolean value)
```


Sets whether export all cameras in the scene.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getDuplicatedNameSeparator() {#getDuplicatedNameSeparator--}
```
public String getDuplicatedNameSeparator()
```


The separator between object's name and the duplicated counter, default value is "\_". When scene contains objects that use the same name, Aspose.3D 3DS exporter will generate a different name for the object. For example there's two nodes named "Box", the first node will have a name "Box", and the second node will get a new name "Box\_2" using the default configuration.

**Returns:**
java.lang.String
### setDuplicatedNameSeparator(String value) {#setDuplicatedNameSeparator-java.lang.String-}
```
public void setDuplicatedNameSeparator(String value)
```


The separator between object's name and the duplicated counter, default value is "\_". When scene contains objects that use the same name, Aspose.3D 3DS exporter will generate a different name for the object. For example there's two nodes named "Box", the first node will have a name "Box", and the second node will get a new name "Box\_2" using the default configuration.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getDuplicatedNameCounterBase() {#getDuplicatedNameCounterBase--}
```
public int getDuplicatedNameCounterBase()
```


The counter used by generating new name for duplicated names, default value is 2.

**Returns:**
int
### setDuplicatedNameCounterBase(int value) {#setDuplicatedNameCounterBase-int-}
```
public void setDuplicatedNameCounterBase(int value)
```


The counter used by generating new name for duplicated names, default value is 2.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### getDuplicatedNameCounterFormat() {#getDuplicatedNameCounterFormat--}
```
public String getDuplicatedNameCounterFormat()
```


The format of the duplicated counter, default value is empty string.

**Returns:**
java.lang.String
### setDuplicatedNameCounterFormat(String value) {#setDuplicatedNameCounterFormat-java.lang.String-}
```
public void setDuplicatedNameCounterFormat(String value)
```


The format of the duplicated counter, default value is empty string.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getMasterScale() {#getMasterScale--}
```
public double getMasterScale()
```


Gets the master scale used in exporting.

**Returns:**
double
### setMasterScale(double value) {#setMasterScale-double-}
```
public void setMasterScale(double value)
```


Sets the master scale used in exporting.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

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

### getHighPreciseColor() {#getHighPreciseColor--}
```
public boolean getHighPreciseColor()
```


If this is true, the generated 3ds file will use high precise color, means each channel of red/green/blue are in 32bit float. Otherwise the generated file will use 24bit color, each channel use 8bit byte. The default value is false, because not all applications supports the high-precise color.

**Returns:**
boolean
### setHighPreciseColor(boolean value) {#setHighPreciseColor-boolean-}
```
public void setHighPreciseColor(boolean value)
```


If this is true, the generated 3ds file will use high precise color, means each channel of red/green/blue are in 32bit float. Otherwise the generated file will use 24bit color, each channel use 8bit byte. The default value is false, because not all applications supports the high-precise color.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

