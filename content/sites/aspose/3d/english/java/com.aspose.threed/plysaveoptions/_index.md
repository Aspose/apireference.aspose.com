---
title: PlySaveOptions
second_title: Aspose.3D for Java API Reference
description: Save options for exporting scene as PLY file.
type: docs
weight: 117
url: /java/com.aspose.threed/plysaveoptions/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.IOConfig](../../com.aspose.threed/ioconfig), [com.aspose.threed.SaveOptions](../../com.aspose.threed/saveoptions)
```
public class PlySaveOptions extends SaveOptions
```

Save options for exporting scene as PLY file.
## Constructors

| Constructor | Description |
| --- | --- |
| [PlySaveOptions()](#PlySaveOptions--) | Constructor of com.aspose.threed.PlySaveOptions |
| [PlySaveOptions(FileContentType contentType)](#PlySaveOptions-com.aspose.threed.FileContentType-) | Constructor of com.aspose.threed.PlySaveOptions |
## Methods

| Method | Description |
| --- | --- |
| [getPointCloud()](#getPointCloud--) | Export the scene as point cloud, the default value is false. |
| [setPointCloud(boolean value)](#setPointCloud-boolean-) | Export the scene as point cloud, the default value is false. |
| [getFlipCoordinate()](#getFlipCoordinate--) | Flip the coordinate while saving the scene, default value is true |
| [setFlipCoordinate(boolean value)](#setFlipCoordinate-boolean-) | Flip the coordinate while saving the scene, default value is true |
| [getVertexElement()](#getVertexElement--) | The element name for the vertex data, default value is "vertex" |
| [setVertexElement(String value)](#setVertexElement-java.lang.String-) | The element name for the vertex data, default value is "vertex" |
| [getPositionComponents()](#getPositionComponents--) | The component names for position data, default value is ("x", "y", "z") |
| [setPositionComponents(Tuple_3<String,String,String> value)](#setPositionComponents-com.aspose.threed.Tuple-3-java.lang.String-java.lang.String-java.lang.String--) | The component names for position data, default value is ("x", "y", "z") |
| [getNormalComponents()](#getNormalComponents--) | The component names for normal data, default value is ("nx", "ny", "nz") |
| [setNormalComponents(Tuple_3<String,String,String> value)](#setNormalComponents-com.aspose.threed.Tuple-3-java.lang.String-java.lang.String-java.lang.String--) | The component names for normal data, default value is ("nx", "ny", "nz") |
| [getTextureCoordinateComponents()](#getTextureCoordinateComponents--) | The component names for texture coordinate data, default value is ("u", "v") |
| [setTextureCoordinateComponents(Tuple_2<String,String> value)](#setTextureCoordinateComponents-com.aspose.threed.Tuple-2-java.lang.String-java.lang.String--) | The component names for texture coordinate data, default value is ("u", "v") |
| [getColorComponents()](#getColorComponents--) | The component names for vertex color, default value is ("red", "green", "blue") |
| [setColorComponents(Tuple_3<String,String,String> value)](#setColorComponents-com.aspose.threed.Tuple-3-java.lang.String-java.lang.String-java.lang.String--) | The component names for vertex color, default value is ("red", "green", "blue") |
| [getFaceElement()](#getFaceElement--) | The element name for the face data, default value is "face" |
| [setFaceElement(String value)](#setFaceElement-java.lang.String-) | The element name for the face data, default value is "face" |
| [getFaceProperty()](#getFaceProperty--) | The property name for the face data, default value is "vertex\_index" |
| [setFaceProperty(String value)](#setFaceProperty-java.lang.String-) | The property name for the face data, default value is "vertex\_index" |
### PlySaveOptions() {#PlySaveOptions--}
```
public PlySaveOptions()
```


Constructor of com.aspose.threed.PlySaveOptions

### PlySaveOptions(FileContentType contentType) {#PlySaveOptions-com.aspose.threed.FileContentType-}
```
public PlySaveOptions(FileContentType contentType)
```


Constructor of com.aspose.threed.PlySaveOptions

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| contentType | [FileContentType](../../com.aspose.threed/filecontenttype) |  |

### getPointCloud() {#getPointCloud--}
```
public boolean getPointCloud()
```


Export the scene as point cloud, the default value is false.

**Returns:**
boolean
### setPointCloud(boolean value) {#setPointCloud-boolean-}
```
public void setPointCloud(boolean value)
```


Export the scene as point cloud, the default value is false.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getFlipCoordinate() {#getFlipCoordinate--}
```
public boolean getFlipCoordinate()
```


Flip the coordinate while saving the scene, default value is true

**Returns:**
boolean
### setFlipCoordinate(boolean value) {#setFlipCoordinate-boolean-}
```
public void setFlipCoordinate(boolean value)
```


Flip the coordinate while saving the scene, default value is true

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getVertexElement() {#getVertexElement--}
```
public String getVertexElement()
```


The element name for the vertex data, default value is "vertex"

**Returns:**
java.lang.String
### setVertexElement(String value) {#setVertexElement-java.lang.String-}
```
public void setVertexElement(String value)
```


The element name for the vertex data, default value is "vertex"

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getPositionComponents() {#getPositionComponents--}
```
public Tuple_3<String,String,String> getPositionComponents()
```


The component names for position data, default value is ("x", "y", "z")

**Returns:**
com.aspose.threed.Tuple_3<java.lang.String,java.lang.String,java.lang.String>
### setPositionComponents(Tuple_3<String,String,String> value) {#setPositionComponents-com.aspose.threed.Tuple-3-java.lang.String-java.lang.String-java.lang.String--}
```
public void setPositionComponents(Tuple_3<String,String,String> value)
```


The component names for position data, default value is ("x", "y", "z")

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.threed.Tuple_3<java.lang.String,java.lang.String,java.lang.String> | New value |

### getNormalComponents() {#getNormalComponents--}
```
public Tuple_3<String,String,String> getNormalComponents()
```


The component names for normal data, default value is ("nx", "ny", "nz")

**Returns:**
com.aspose.threed.Tuple_3<java.lang.String,java.lang.String,java.lang.String>
### setNormalComponents(Tuple_3<String,String,String> value) {#setNormalComponents-com.aspose.threed.Tuple-3-java.lang.String-java.lang.String-java.lang.String--}
```
public void setNormalComponents(Tuple_3<String,String,String> value)
```


The component names for normal data, default value is ("nx", "ny", "nz")

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.threed.Tuple_3<java.lang.String,java.lang.String,java.lang.String> | New value |

### getTextureCoordinateComponents() {#getTextureCoordinateComponents--}
```
public Tuple_2<String,String> getTextureCoordinateComponents()
```


The component names for texture coordinate data, default value is ("u", "v")

**Returns:**
com.aspose.threed.Tuple_2<java.lang.String,java.lang.String>
### setTextureCoordinateComponents(Tuple_2<String,String> value) {#setTextureCoordinateComponents-com.aspose.threed.Tuple-2-java.lang.String-java.lang.String--}
```
public void setTextureCoordinateComponents(Tuple_2<String,String> value)
```


The component names for texture coordinate data, default value is ("u", "v")

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.threed.Tuple_2<java.lang.String,java.lang.String> | New value |

### getColorComponents() {#getColorComponents--}
```
public Tuple_3<String,String,String> getColorComponents()
```


The component names for vertex color, default value is ("red", "green", "blue")

**Returns:**
com.aspose.threed.Tuple_3<java.lang.String,java.lang.String,java.lang.String>
### setColorComponents(Tuple_3<String,String,String> value) {#setColorComponents-com.aspose.threed.Tuple-3-java.lang.String-java.lang.String-java.lang.String--}
```
public void setColorComponents(Tuple_3<String,String,String> value)
```


The component names for vertex color, default value is ("red", "green", "blue")

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.threed.Tuple_3<java.lang.String,java.lang.String,java.lang.String> | New value |

### getFaceElement() {#getFaceElement--}
```
public String getFaceElement()
```


The element name for the face data, default value is "face"

**Returns:**
java.lang.String
### setFaceElement(String value) {#setFaceElement-java.lang.String-}
```
public void setFaceElement(String value)
```


The element name for the face data, default value is "face"

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getFaceProperty() {#getFaceProperty--}
```
public String getFaceProperty()
```


The property name for the face data, default value is "vertex\_index"

**Returns:**
java.lang.String
### setFaceProperty(String value) {#setFaceProperty-java.lang.String-}
```
public void setFaceProperty(String value)
```


The property name for the face data, default value is "vertex\_index"

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

