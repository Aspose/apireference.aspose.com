---
title: "CadGeoData"
linktitle: "CadGeoData"
second_title: "Aspose.CAD for Java"
description: "Class describing GeoData object."
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.cad.cadobjects/cadgeodata/
---

**Inheritance:** java.lang.Object, CadBaseObject

Class describing GeoData object.

## Constructors

| Constructor | Description |
| --- | --- |
| [CadGeoData()](#CadGeoData) | Initializes a new instance of the CadGeoData class. |

## Methods

| Method | Description |
| --- | --- |
| [getObjectVersion()](#getObjectVersion) | Gets or sets the object version. |
| [setObjectVersion(int value)](#setObjectVersion-int) | Gets or sets the object version. |
| [getDesignCoordinatesType()](#getDesignCoordinatesType) | Gets or sets the type of the design coordinates. |
| [setDesignCoordinatesType(short value)](#setDesignCoordinatesType-short) | Gets or sets the type of the design coordinates. |
| [getHostBlockTableRecord()](#getHostBlockTableRecord) | Gets or sets the host block table record. |
| [setHostBlockTableRecord(String value)](#setHostBlockTableRecord-java.lang.String) | Gets or sets the host block table record. |
| [getDesignPoint()](#getDesignPoint) | Gets or sets the design point. |
| [setDesignPoint(Cad3DPoint value)](#setDesignPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Gets or sets the design point. |
| [getCoordinateSystemCoordinatesReferencePoint()](#getCoordinateSystemCoordinatesReferencePoint) | Gets or sets the coordinate system coordinates reference point. |
| [setCoordinateSystemCoordinatesReferencePoint(Cad3DPoint value)](#setCoordinateSystemCoordinatesReferencePoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Gets or sets the coordinate system coordinates reference point. |
| [getNorthDirectionVector()](#getNorthDirectionVector) | Gets or sets the north direction vector. |
| [setNorthDirectionVector(Cad2DPoint value)](#setNorthDirectionVector-com.aspose.cad.fileformats.cad.cadobjects.Cad2DPoint) | Gets or sets the north direction vector. |
| [getHorizontalUnitScale()](#getHorizontalUnitScale) | Gets or sets the horizontal unit scale. |
| [setHorizontalUnitScale(double value)](#setHorizontalUnitScale-double) | Gets or sets the horizontal unit scale. |
| [getVerticalUnitScale()](#getVerticalUnitScale) | Gets or sets the vertical unit scale. |
| [setVerticalUnitScale(double value)](#setVerticalUnitScale-double) | Gets or sets the vertical unit scale. |
| [getHorizontalUnitsPerUnitsValueEnumeration()](#getHorizontalUnitsPerUnitsValueEnumeration) | Gets or sets the horizontal units per units value enumeration. |
| [setHorizontalUnitsPerUnitsValueEnumeration(int value)](#setHorizontalUnitsPerUnitsValueEnumeration-int) | Gets or sets the horizontal units per units value enumeration. |
| [getVerticalUnitsPerUnitsValueEnumeration()](#getVerticalUnitsPerUnitsValueEnumeration) | Gets or sets the vertical units per units value enumeration. |
| [setVerticalUnitsPerUnitsValueEnumeration(int value)](#setVerticalUnitsPerUnitsValueEnumeration-int) | Gets or sets the vertical units per units value enumeration. |
| [getUpDirection()](#getUpDirection) | Gets or sets up direction. |
| [setUpDirection(Cad3DPoint value)](#setUpDirection-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Gets or sets up direction. |
| [getScaleEstimationMethod()](#getScaleEstimationMethod) | Gets or sets the scale estimation method. |
| [setScaleEstimationMethod(int value)](#setScaleEstimationMethod-int) | Gets or sets the scale estimation method. |
| [getBoolFlagSpecifying()](#getBoolFlagSpecifying) | Gets or sets the bool flag specifying. |
| [setBoolFlagSpecifying(boolean value)](#setBoolFlagSpecifying-boolean) | Gets or sets the bool flag specifying. |
| [getUserSpecifiedScaleFactor()](#getUserSpecifiedScaleFactor) | Gets or sets the user specified scale factor. |
| [setUserSpecifiedScaleFactor(double value)](#setUserSpecifiedScaleFactor-double) | Gets or sets the user specified scale factor. |
| [getSeaLevelElevation()](#getSeaLevelElevation) | Gets or sets the sea level elevation. |
| [setSeaLevelElevation(double value)](#setSeaLevelElevation-double) | Gets or sets the sea level elevation. |
| [getCoordinateProjectionRadius()](#getCoordinateProjectionRadius) | Gets or sets the coordinate projection radius. |
| [setCoordinateProjectionRadius(double value)](#setCoordinateProjectionRadius-double) | Gets or sets the coordinate projection radius. |
| [getCoordinateSystemDefinitionString()](#getCoordinateSystemDefinitionString) | Gets or sets the coordinate system definition string. |
| [setCoordinateSystemDefinitionString(String value)](#setCoordinateSystemDefinitionString-java.lang.String) | Gets or sets the coordinate system definition string. |
| [getGeoRSSTag()](#getGeoRSSTag) | Gets or sets the geo RSS tag. |
| [setGeoRSSTag(String value)](#setGeoRSSTag-java.lang.String) | Gets or sets the geo RSS tag. |
| [getObservationFromTag()](#getObservationFromTag) | Gets or sets the observation from tag. |
| [setObservationFromTag(String value)](#setObservationFromTag-java.lang.String) | Gets or sets the observation from tag. |
| [getObservationToTag()](#getObservationToTag) | Gets or sets the observation to tag. |
| [setObservationToTag(String value)](#setObservationToTag-java.lang.String) | Gets or sets the observation to tag. |
| [getObservationCoverageTag()](#getObservationCoverageTag) | Gets or sets the observation coverage tag. |
| [setObservationCoverageTag(String value)](#setObservationCoverageTag-java.lang.String) | Gets or sets the observation coverage tag. |
| [getGeoMeshPointsNumber()](#getGeoMeshPointsNumber) | Gets or sets the geo mesh points number. |
| [setGeoMeshPointsNumber(int value)](#setGeoMeshPointsNumber-int) | Gets or sets the geo mesh points number. |
| [getSourceMeshPoints()](#getSourceMeshPoints) | Gets or sets the source mesh points. |
| [setSourceMeshPoints(List<Cad2DPoint> value)](#setSourceMeshPoints-java.util.List) | Gets or sets the source mesh points. |
| [getDestinationMeshPoints()](#getDestinationMeshPoints) | Gets or sets the destination mesh points. |
| [setDestinationMeshPoints(List<Cad2DPoint> value)](#setDestinationMeshPoints-java.util.List) | Gets or sets the destination mesh points. |
| [getFacesNumber()](#getFacesNumber) | Gets or sets the faces number. |
| [setFacesNumber(int value)](#setFacesNumber-int) | Gets or sets the faces number. |
| [getFacePointIndexes1()](#getFacePointIndexes1) | Gets or sets the face point indexes1. |
| [setFacePointIndexes1(List<Integer> value)](#setFacePointIndexes1-java.util.List) | Gets or sets the face point indexes1. |
| [getFacePointIndexes2()](#getFacePointIndexes2) | Gets or sets the face point indexes2. |
| [setFacePointIndexes2(List<Integer> value)](#setFacePointIndexes2-java.util.List) | Gets or sets the face point indexes2. |
| [getFacePointIndexes3()](#getFacePointIndexes3) | Gets or sets the face point indexes3. |
| [setFacePointIndexes3(List<Integer> value)](#setFacePointIndexes3-java.util.List) | Gets or sets the face point indexes3. |

### CadGeoData() {#CadGeoData}
```java
public CadGeoData()
```

Initializes a new instance of the CadGeoData class.

### getObjectVersion() {#getObjectVersion}
```java
public final int getObjectVersion()
```

Gets or sets the object version.

**Returns:** int - The object version.

### setObjectVersion(int value) {#setObjectVersion-int}
```java
public final void setObjectVersion(int value)
```

Gets or sets the object version.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The object version. |

### getDesignCoordinatesType() {#getDesignCoordinatesType}
```java
public final short getDesignCoordinatesType()
```

Gets or sets the type of the design coordinates.

**Returns:** short - The type of the design coordinates.

### setDesignCoordinatesType(short value) {#setDesignCoordinatesType-short}
```java
public final void setDesignCoordinatesType(short value)
```

Gets or sets the type of the design coordinates.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The type of the design coordinates. |

### getHostBlockTableRecord() {#getHostBlockTableRecord}
```java
public final String getHostBlockTableRecord()
```

Gets or sets the host block table record.

**Returns:** String - The host block table record.

### setHostBlockTableRecord(String value) {#setHostBlockTableRecord-java.lang.String}
```java
public final void setHostBlockTableRecord(String value)
```

Gets or sets the host block table record.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The host block table record. |

### getDesignPoint() {#getDesignPoint}
```java
public final Cad3DPoint getDesignPoint()
```

Gets or sets the design point.

**Returns:** Cad3DPoint - The design point.

### setDesignPoint(Cad3DPoint value) {#setDesignPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public final void setDesignPoint(Cad3DPoint value)
```

Gets or sets the design point.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Cad3DPoint | The design point. |

### getCoordinateSystemCoordinatesReferencePoint() {#getCoordinateSystemCoordinatesReferencePoint}
```java
public final Cad3DPoint getCoordinateSystemCoordinatesReferencePoint()
```

Gets or sets the coordinate system coordinates reference point.

**Returns:** Cad3DPoint - The coordinate system coordinates reference point.

### setCoordinateSystemCoordinatesReferencePoint(Cad3DPoint value) {#setCoordinateSystemCoordinatesReferencePoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public final void setCoordinateSystemCoordinatesReferencePoint(Cad3DPoint value)
```

Gets or sets the coordinate system coordinates reference point.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Cad3DPoint | The coordinate system coordinates reference point. |

### getNorthDirectionVector() {#getNorthDirectionVector}
```java
public final Cad2DPoint getNorthDirectionVector()
```

Gets or sets the north direction vector.

**Returns:** Cad2DPoint - The north direction vector.

### setNorthDirectionVector(Cad2DPoint value) {#setNorthDirectionVector-com.aspose.cad.fileformats.cad.cadobjects.Cad2DPoint}
```java
public final void setNorthDirectionVector(Cad2DPoint value)
```

Gets or sets the north direction vector.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Cad2DPoint | The north direction vector. |

### getHorizontalUnitScale() {#getHorizontalUnitScale}
```java
public final double getHorizontalUnitScale()
```

Gets or sets the horizontal unit scale.

**Returns:** double - The horizontal unit scale.

### setHorizontalUnitScale(double value) {#setHorizontalUnitScale-double}
```java
public final void setHorizontalUnitScale(double value)
```

Gets or sets the horizontal unit scale.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The horizontal unit scale. |

### getVerticalUnitScale() {#getVerticalUnitScale}
```java
public final double getVerticalUnitScale()
```

Gets or sets the vertical unit scale.

**Returns:** double - The vertical unit scale.

### setVerticalUnitScale(double value) {#setVerticalUnitScale-double}
```java
public final void setVerticalUnitScale(double value)
```

Gets or sets the vertical unit scale.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The vertical unit scale. |

### getHorizontalUnitsPerUnitsValueEnumeration() {#getHorizontalUnitsPerUnitsValueEnumeration}
```java
public final int getHorizontalUnitsPerUnitsValueEnumeration()
```

Gets or sets the horizontal units per units value enumeration.

**Returns:** int - The horizontal units per units value enumeration.

### setHorizontalUnitsPerUnitsValueEnumeration(int value) {#setHorizontalUnitsPerUnitsValueEnumeration-int}
```java
public final void setHorizontalUnitsPerUnitsValueEnumeration(int value)
```

Gets or sets the horizontal units per units value enumeration.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The horizontal units per units value enumeration. |

### getVerticalUnitsPerUnitsValueEnumeration() {#getVerticalUnitsPerUnitsValueEnumeration}
```java
public final int getVerticalUnitsPerUnitsValueEnumeration()
```

Gets or sets the vertical units per units value enumeration.

**Returns:** int - The vertical units per units value enumeration.

### setVerticalUnitsPerUnitsValueEnumeration(int value) {#setVerticalUnitsPerUnitsValueEnumeration-int}
```java
public final void setVerticalUnitsPerUnitsValueEnumeration(int value)
```

Gets or sets the vertical units per units value enumeration.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The vertical units per units value enumeration. |

### getUpDirection() {#getUpDirection}
```java
public final Cad3DPoint getUpDirection()
```

Gets or sets up direction.

**Returns:** Cad3DPoint - Up direction.

### setUpDirection(Cad3DPoint value) {#setUpDirection-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public final void setUpDirection(Cad3DPoint value)
```

Gets or sets up direction.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Cad3DPoint | Up direction. |

### getScaleEstimationMethod() {#getScaleEstimationMethod}
```java
public final int getScaleEstimationMethod()
```

Gets or sets the scale estimation method.

**Returns:** int - The scale estimation method.

### setScaleEstimationMethod(int value) {#setScaleEstimationMethod-int}
```java
public final void setScaleEstimationMethod(int value)
```

Gets or sets the scale estimation method.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The scale estimation method. |

### getBoolFlagSpecifying() {#getBoolFlagSpecifying}
```java
public final boolean getBoolFlagSpecifying()
```

Gets or sets the bool flag specifying.

**Returns:** boolean - The bool flag specifying.

### setBoolFlagSpecifying(boolean value) {#setBoolFlagSpecifying-boolean}
```java
public final void setBoolFlagSpecifying(boolean value)
```

Gets or sets the bool flag specifying.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The bool flag specifying. |

### getUserSpecifiedScaleFactor() {#getUserSpecifiedScaleFactor}
```java
public final double getUserSpecifiedScaleFactor()
```

Gets or sets the user specified scale factor.

**Returns:** double - The user specified scale factor.

### setUserSpecifiedScaleFactor(double value) {#setUserSpecifiedScaleFactor-double}
```java
public final void setUserSpecifiedScaleFactor(double value)
```

Gets or sets the user specified scale factor.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The user specified scale factor. |

### getSeaLevelElevation() {#getSeaLevelElevation}
```java
public final double getSeaLevelElevation()
```

Gets or sets the sea level elevation.

**Returns:** double - The sea level elevation.

### setSeaLevelElevation(double value) {#setSeaLevelElevation-double}
```java
public final void setSeaLevelElevation(double value)
```

Gets or sets the sea level elevation.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The sea level elevation. |

### getCoordinateProjectionRadius() {#getCoordinateProjectionRadius}
```java
public final double getCoordinateProjectionRadius()
```

Gets or sets the coordinate projection radius.

**Returns:** double - The coordinate projection radius.

### setCoordinateProjectionRadius(double value) {#setCoordinateProjectionRadius-double}
```java
public final void setCoordinateProjectionRadius(double value)
```

Gets or sets the coordinate projection radius.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The coordinate projection radius. |

### getCoordinateSystemDefinitionString() {#getCoordinateSystemDefinitionString}
```java
public final String getCoordinateSystemDefinitionString()
```

Gets or sets the coordinate system definition string.

**Returns:** String - The coordinate system definition string.

### setCoordinateSystemDefinitionString(String value) {#setCoordinateSystemDefinitionString-java.lang.String}
```java
public final void setCoordinateSystemDefinitionString(String value)
```

Gets or sets the coordinate system definition string.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The coordinate system definition string. |

### getGeoRSSTag() {#getGeoRSSTag}
```java
public final String getGeoRSSTag()
```

Gets or sets the geo RSS tag.

**Returns:** String - The geo RSS tag.

### setGeoRSSTag(String value) {#setGeoRSSTag-java.lang.String}
```java
public final void setGeoRSSTag(String value)
```

Gets or sets the geo RSS tag.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The geo RSS tag. |

### getObservationFromTag() {#getObservationFromTag}
```java
public final String getObservationFromTag()
```

Gets or sets the observation from tag.

**Returns:** String - The observation from tag.

### setObservationFromTag(String value) {#setObservationFromTag-java.lang.String}
```java
public final void setObservationFromTag(String value)
```

Gets or sets the observation from tag.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The observation from tag. |

### getObservationToTag() {#getObservationToTag}
```java
public final String getObservationToTag()
```

Gets or sets the observation to tag.

**Returns:** String - The observation to tag.

### setObservationToTag(String value) {#setObservationToTag-java.lang.String}
```java
public final void setObservationToTag(String value)
```

Gets or sets the observation to tag.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The observation to tag. |

### getObservationCoverageTag() {#getObservationCoverageTag}
```java
public final String getObservationCoverageTag()
```

Gets or sets the observation coverage tag.

**Returns:** String - The observation coverage tag.

### setObservationCoverageTag(String value) {#setObservationCoverageTag-java.lang.String}
```java
public final void setObservationCoverageTag(String value)
```

Gets or sets the observation coverage tag.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The observation coverage tag. |

### getGeoMeshPointsNumber() {#getGeoMeshPointsNumber}
```java
public final int getGeoMeshPointsNumber()
```

Gets or sets the geo mesh points number.

**Returns:** int - The geo mesh points number.

### setGeoMeshPointsNumber(int value) {#setGeoMeshPointsNumber-int}
```java
public final void setGeoMeshPointsNumber(int value)
```

Gets or sets the geo mesh points number.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The geo mesh points number. |

### getSourceMeshPoints() {#getSourceMeshPoints}
```java
public final List<Cad2DPoint> getSourceMeshPoints()
```

Gets or sets the source mesh points.

**Returns:** List<Cad2DPoint> - The source mesh points.

### setSourceMeshPoints(List<Cad2DPoint> value) {#setSourceMeshPoints-java.util.List}
```java
public final void setSourceMeshPoints(List<Cad2DPoint> value)
```

Gets or sets the source mesh points.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | List<Cad2DPoint> | The source mesh points. |

### getDestinationMeshPoints() {#getDestinationMeshPoints}
```java
public final List<Cad2DPoint> getDestinationMeshPoints()
```

Gets or sets the destination mesh points.

**Returns:** List<Cad2DPoint> - The destination mesh points.

### setDestinationMeshPoints(List<Cad2DPoint> value) {#setDestinationMeshPoints-java.util.List}
```java
public final void setDestinationMeshPoints(List<Cad2DPoint> value)
```

Gets or sets the destination mesh points.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | List<Cad2DPoint> | The destination mesh points. |

### getFacesNumber() {#getFacesNumber}
```java
public final int getFacesNumber()
```

Gets or sets the faces number.

**Returns:** int - The faces number.

### setFacesNumber(int value) {#setFacesNumber-int}
```java
public final void setFacesNumber(int value)
```

Gets or sets the faces number.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The faces number. |

### getFacePointIndexes1() {#getFacePointIndexes1}
```java
public final List<Integer> getFacePointIndexes1()
```

Gets or sets the face point indexes1.

**Returns:** List<Integer> - The face point indexes1.

### setFacePointIndexes1(List<Integer> value) {#setFacePointIndexes1-java.util.List}
```java
public final void setFacePointIndexes1(List<Integer> value)
```

Gets or sets the face point indexes1.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | List<Integer> | The face point indexes1. |

### getFacePointIndexes2() {#getFacePointIndexes2}
```java
public final List<Integer> getFacePointIndexes2()
```

Gets or sets the face point indexes2.

**Returns:** List<Integer> - The face point indexes2.

### setFacePointIndexes2(List<Integer> value) {#setFacePointIndexes2-java.util.List}
```java
public final void setFacePointIndexes2(List<Integer> value)
```

Gets or sets the face point indexes2.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | List<Integer> | The face point indexes2. |

### getFacePointIndexes3() {#getFacePointIndexes3}
```java
public final List<Integer> getFacePointIndexes3()
```

Gets or sets the face point indexes3.

**Returns:** List<Integer> - The face point indexes3.

### setFacePointIndexes3(List<Integer> value) {#setFacePointIndexes3-java.util.List}
```java
public final void setFacePointIndexes3(List<Integer> value)
```

Gets or sets the face point indexes3.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | List<Integer> | The face point indexes3. |

