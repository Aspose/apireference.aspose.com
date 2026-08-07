---
title: "CadRasterImage"
linktitle: "CadRasterImage"
second_title: "Aspose.CAD for Java"
description: "Class describing Cad raster image"
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.cad.cadobjects/cadrasterimage/
---

**Inheritance:** java.lang.Object, CadBaseExtrudedEntity

Class describing Cad raster image

## Constructors

| Constructor | Description |
| --- | --- |
| [CadRasterImage(CadRasterImageDef imageDef, Cad3DPoint insertionPoint, Cad3DPoint uVector, Cad3DPoint vVector)](#CadRasterImage-com.aspose.cad.fileformats.cad.cadobjects.CadRasterImageDef-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Initializes a new instance of the CadRasterImage class. |

## Methods

| Method | Description |
| --- | --- |
| [getTypeName()](#getTypeName) | Gets the name of the type. |
| [getClipMode()](#getClipMode) | Gets or sets a value indicating whether [clip mode]. |
| [setClipMode(boolean value)](#setClipMode-boolean) | Gets or sets a value indicating whether [clip mode]. |
| [getClipBoundaryVertexList()](#getClipBoundaryVertexList) | Gets or sets the clip boundary vertex. |
| [setClipBoundaryVertexList(List<Cad2DPoint> value)](#setClipBoundaryVertexList-java.util.List) | Gets or sets the clip boundary vertex. |
| [getNumberOfClipBoundaryVertices()](#getNumberOfClipBoundaryVertices) | Gets or sets the number of clip boundary vertices. |
| [setNumberOfClipBoundaryVertices(int value)](#setNumberOfClipBoundaryVertices-int) | Gets or sets the number of clip boundary vertices. |
| [getClippingBoundaryType()](#getClippingBoundaryType) | Gets or sets the type of the clipping boundary. |
| [setClippingBoundaryType(short value)](#setClippingBoundaryType-short) | Gets or sets the type of the clipping boundary. |
| [getClassVersion()](#getClassVersion) | Gets or sets the class version. |
| [setClassVersion(Integer value)](#setClassVersion-java.lang.Integer) | Gets or sets the class version. |
| [getImageBrightness()](#getImageBrightness) | Gets or sets brigthness value. |
| [setImageBrightness(short value)](#setImageBrightness-short) | Gets or sets brigthness value. |
| [getImageContrast()](#getImageContrast) | Gets or sets contrast value. |
| [setImageContrast(short value)](#setImageContrast-short) | Gets or sets contrast value. |
| [getFade()](#getFade) | Gets or sets fade value. |
| [setFade(short value)](#setFade-short) | Gets or sets fade value. |
| [getDisplayFlags()](#getDisplayFlags) | Gets or sets display flags value. |
| [setDisplayFlags(short value)](#setDisplayFlags-short) | Gets or sets display flags value. |
| [getClippingState()](#getClippingState) | Gets or sets clipping state value. |
| [setClippingState(short value)](#setClippingState-short) | Gets or sets clipping state value. |
| [getImageDefReactorReference()](#getImageDefReactorReference) | Gets or sets the image definition reactor reference. |
| [setImageDefReactorReference(String value)](#setImageDefReactorReference-java.lang.String) | Gets or sets the image definition reactor reference. |
| [getImageDefReference()](#getImageDefReference) | Gets or sets ImageDefReference value. |
| [setImageDefReference(String value)](#setImageDefReference-java.lang.String) | Gets or sets ImageDefReference value. |
| [getInsertionPoint()](#getInsertionPoint) | Gets or sets insertion point value. |
| [setInsertionPoint(Cad3DPoint value)](#setInsertionPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Gets or sets insertion point value. |
| [getImageSizeU()](#getImageSizeU) | Gets or sets image size U value. |
| [setImageSizeU(double value)](#setImageSizeU-double) | Gets or sets image size U value. |
| [getImageSizeV()](#getImageSizeV) | Gets or sets image size V value. |
| [setImageSizeV(double value)](#setImageSizeV-double) | Gets or sets image size V value. |
| [getUVector()](#getUVector) | Gets or sets U vector. |
| [setUVector(Cad3DPoint value)](#setUVector-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Gets or sets U vector. |
| [getVVector()](#getVVector) | Gets or sets V vector. |
| [setVVector(Cad3DPoint value)](#setVVector-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Gets or sets V vector. |

### CadRasterImage(CadRasterImageDef imageDef, Cad3DPoint insertionPoint, Cad3DPoint uVector, Cad3DPoint vVector) {#CadRasterImage-com.aspose.cad.fileformats.cad.cadobjects.CadRasterImageDef-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public CadRasterImage(CadRasterImageDef imageDef, Cad3DPoint insertionPoint, Cad3DPoint uVector, Cad3DPoint vVector)
```

Initializes a new instance of the CadRasterImage class.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| imageDef | CadRasterImageDef | Image def. |
| insertionPoint | Cad3DPoint | Insertion point. |
| uVector | Cad3DPoint | U-vector. |
| vVector | Cad3DPoint | V-vector. |

**Throws:**

- `com.aspose.ms.System.ArgumentNullException` - Thrown when one of arguments is null
- `com.aspose.ms.System.ArgumentException` - Thrown when CadRasterImageDef.ObjectHandle is null or empty

### getTypeName() {#getTypeName}
```java
public int getTypeName()
```

Gets the name of the type.

**Returns:** int - The name of the type.

### getClipMode() {#getClipMode}
```java
public final boolean getClipMode()
```

Gets or sets a value indicating whether [clip mode].

**Returns:** boolean - true if [clip mode]; otherwise, false .

### setClipMode(boolean value) {#setClipMode-boolean}
```java
public final void setClipMode(boolean value)
```

Gets or sets a value indicating whether [clip mode].

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | true if [clip mode]; otherwise, false . |

### getClipBoundaryVertexList() {#getClipBoundaryVertexList}
```java
public final List<Cad2DPoint> getClipBoundaryVertexList()
```

Gets or sets the clip boundary vertex.

**Returns:** List<Cad2DPoint> - The clip boundary vertex.

### setClipBoundaryVertexList(List<Cad2DPoint> value) {#setClipBoundaryVertexList-java.util.List}
```java
public final void setClipBoundaryVertexList(List<Cad2DPoint> value)
```

Gets or sets the clip boundary vertex.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | List<Cad2DPoint> | The clip boundary vertex. |

### getNumberOfClipBoundaryVertices() {#getNumberOfClipBoundaryVertices}
```java
public final int getNumberOfClipBoundaryVertices()
```

Gets or sets the number of clip boundary vertices.

**Returns:** int - The number of clip boundary vertices.

### setNumberOfClipBoundaryVertices(int value) {#setNumberOfClipBoundaryVertices-int}
```java
public final void setNumberOfClipBoundaryVertices(int value)
```

Gets or sets the number of clip boundary vertices.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The number of clip boundary vertices. |

### getClippingBoundaryType() {#getClippingBoundaryType}
```java
public final short getClippingBoundaryType()
```

Gets or sets the type of the clipping boundary.

**Returns:** short - The type of the clipping boundary.

### setClippingBoundaryType(short value) {#setClippingBoundaryType-short}
```java
public final void setClippingBoundaryType(short value)
```

Gets or sets the type of the clipping boundary.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The type of the clipping boundary. |

### getClassVersion() {#getClassVersion}
```java
public final Integer getClassVersion()
```

Gets or sets the class version.

**Returns:** Integer - The class version.

### setClassVersion(Integer value) {#setClassVersion-java.lang.Integer}
```java
public final void setClassVersion(Integer value)
```

Gets or sets the class version.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Integer | The class version. |

### getImageBrightness() {#getImageBrightness}
```java
public final short getImageBrightness()
```

Gets or sets brigthness value.

**Returns:** short

### setImageBrightness(short value) {#setImageBrightness-short}
```java
public final void setImageBrightness(short value)
```

Gets or sets brigthness value.

### getImageContrast() {#getImageContrast}
```java
public final short getImageContrast()
```

Gets or sets contrast value.

**Returns:** short

### setImageContrast(short value) {#setImageContrast-short}
```java
public final void setImageContrast(short value)
```

Gets or sets contrast value.

### getFade() {#getFade}
```java
public final short getFade()
```

Gets or sets fade value.

**Returns:** short

### setFade(short value) {#setFade-short}
```java
public final void setFade(short value)
```

Gets or sets fade value.

### getDisplayFlags() {#getDisplayFlags}
```java
public final short getDisplayFlags()
```

Gets or sets display flags value.

**Returns:** short

### setDisplayFlags(short value) {#setDisplayFlags-short}
```java
public final void setDisplayFlags(short value)
```

Gets or sets display flags value.

### getClippingState() {#getClippingState}
```java
public final short getClippingState()
```

Gets or sets clipping state value.

**Returns:** short

### setClippingState(short value) {#setClippingState-short}
```java
public final void setClippingState(short value)
```

Gets or sets clipping state value.

### getImageDefReactorReference() {#getImageDefReactorReference}
```java
public final String getImageDefReactorReference()
```

Gets or sets the image definition reactor reference.

**Returns:** String - The image definition reactor reference.

### setImageDefReactorReference(String value) {#setImageDefReactorReference-java.lang.String}
```java
public final void setImageDefReactorReference(String value)
```

Gets or sets the image definition reactor reference.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The image definition reactor reference. |

### getImageDefReference() {#getImageDefReference}
```java
public final String getImageDefReference()
```

Gets or sets ImageDefReference value.

**Returns:** String

### setImageDefReference(String value) {#setImageDefReference-java.lang.String}
```java
public final void setImageDefReference(String value)
```

Gets or sets ImageDefReference value.

### getInsertionPoint() {#getInsertionPoint}
```java
public final Cad3DPoint getInsertionPoint()
```

Gets or sets insertion point value.

**Returns:** Cad3DPoint

### setInsertionPoint(Cad3DPoint value) {#setInsertionPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public final void setInsertionPoint(Cad3DPoint value)
```

Gets or sets insertion point value.

### getImageSizeU() {#getImageSizeU}
```java
public final double getImageSizeU()
```

Gets or sets image size U value.

**Returns:** double

### setImageSizeU(double value) {#setImageSizeU-double}
```java
public final void setImageSizeU(double value)
```

Gets or sets image size U value.

### getImageSizeV() {#getImageSizeV}
```java
public final double getImageSizeV()
```

Gets or sets image size V value.

**Returns:** double

### setImageSizeV(double value) {#setImageSizeV-double}
```java
public final void setImageSizeV(double value)
```

Gets or sets image size V value.

### getUVector() {#getUVector}
```java
public final Cad3DPoint getUVector()
```

Gets or sets U vector.

**Returns:** Cad3DPoint

### setUVector(Cad3DPoint value) {#setUVector-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public final void setUVector(Cad3DPoint value)
```

Gets or sets U vector.

### getVVector() {#getVVector}
```java
public final Cad3DPoint getVVector()
```

Gets or sets V vector.

**Returns:** Cad3DPoint

### setVVector(Cad3DPoint value) {#setVVector-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public final void setVVector(Cad3DPoint value)
```

Gets or sets V vector.

