---
title: StlLoadOptions
second_title: Aspose.3D for Java API Reference
description: Load options for STL
type: docs
weight: 161
url: /java/com.aspose.threed/stlloadoptions/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.IOConfig](../../com.aspose.threed/ioconfig), [com.aspose.threed.LoadOptions](../../com.aspose.threed/loadoptions)
```
public class StlLoadOptions extends LoadOptions
```

Load options for STL
## Constructors

| Constructor | Description |
| --- | --- |
| [StlLoadOptions()](#StlLoadOptions--) | Initializes of a new com.aspose.threed.StlLoadOptions instance. |
| [StlLoadOptions(FileContentType contentType)](#StlLoadOptions-com.aspose.threed.FileContentType-) | Initializes of a new com.aspose.threed.StlLoadOptions instance. |
## Methods

| Method | Description |
| --- | --- |
| [getFlipCoordinateSystem()](#getFlipCoordinateSystem--) | Gets whether to flip coordinate system of control points/normal during importing. |
| [setFlipCoordinateSystem(boolean value)](#setFlipCoordinateSystem-boolean-) | Sets whether to flip coordinate system of control points/normal during importing. |
| [getRecalculateNormal()](#getRecalculateNormal--) | Ignore the normal data that stored in STL file and recalculate the normal data based on the vertex position. |
| [setRecalculateNormal(boolean value)](#setRecalculateNormal-boolean-) | Ignore the normal data that stored in STL file and recalculate the normal data based on the vertex position. |
### StlLoadOptions() {#StlLoadOptions--}
```
public StlLoadOptions()
```


Initializes of a new com.aspose.threed.StlLoadOptions instance.

### StlLoadOptions(FileContentType contentType) {#StlLoadOptions-com.aspose.threed.FileContentType-}
```
public StlLoadOptions(FileContentType contentType)
```


Initializes of a new com.aspose.threed.StlLoadOptions instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| contentType | [FileContentType](../../com.aspose.threed/filecontenttype) |  |

### getFlipCoordinateSystem() {#getFlipCoordinateSystem--}
```
public boolean getFlipCoordinateSystem()
```


Gets whether to flip coordinate system of control points/normal during importing.

**Returns:**
boolean
### setFlipCoordinateSystem(boolean value) {#setFlipCoordinateSystem-boolean-}
```
public void setFlipCoordinateSystem(boolean value)
```


Sets whether to flip coordinate system of control points/normal during importing.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getRecalculateNormal() {#getRecalculateNormal--}
```
public boolean getRecalculateNormal()
```


Ignore the normal data that stored in STL file and recalculate the normal data based on the vertex position. Default value is false

**Returns:**
boolean
### setRecalculateNormal(boolean value) {#setRecalculateNormal-boolean-}
```
public void setRecalculateNormal(boolean value)
```


Ignore the normal data that stored in STL file and recalculate the normal data based on the vertex position. Default value is false

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

