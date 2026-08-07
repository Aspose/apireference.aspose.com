---
title: "CadVportTableObject"
linktitle: "CadVportTableObject"
second_title: "Aspose.CAD for Java"
description: "viewPorts table class"
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.cad.cadtables/cadvporttableobject/
---

**Inheritance:** java.lang.Object, CadBaseOwned

viewPorts table class

## Constructors

| Constructor | Description |
| --- | --- |
| [CadVportTableObject()](#CadVportTableObject) | Initializes a new instance of the CadVportTableObject class. |

## Methods

| Method | Description |
| --- | --- |
| [getSoftFrozenLayerObject()](#getSoftFrozenLayerObject) | Gets or sets the soft frozen layer object. |
| [setSoftFrozenLayerObject(List<String> value)](#setSoftFrozenLayerObject-java.util.List) | Gets or sets the soft frozen layer object. |
| [getHardFrozenLayerObject()](#getHardFrozenLayerObject) | Gets or sets the hard frozen layer object. |
| [setHardFrozenLayerObject(List<String> value)](#setHardFrozenLayerObject-java.util.List) | Gets or sets the hard frozen layer object. |
| [getName()](#getName) | Gets or sets the name. |
| [setName(String value)](#setName-java.lang.String) | Gets or sets the name. |
| [getFlags()](#getFlags) | Gets or sets the flags. |
| [setFlags(short value)](#setFlags-short) | Gets or sets the flags. |
| [getLowerLeft()](#getLowerLeft) | Gets or sets the lower left. |
| [setLowerLeft(Cad2DPoint value)](#setLowerLeft-com.aspose.cad.fileformats.cad.cadobjects.Cad2DPoint) | Gets or sets the lower left. |
| [getUpperRight()](#getUpperRight) | Gets or sets the upper right. |
| [setUpperRight(Cad2DPoint value)](#setUpperRight-com.aspose.cad.fileformats.cad.cadobjects.Cad2DPoint) | Gets or sets the upper right. |
| [getCenterPoint()](#getCenterPoint) | Gets or sets the center point. |
| [setCenterPoint(Cad2DPoint value)](#setCenterPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad2DPoint) | Gets or sets the center point. |
| [getSnapPoint()](#getSnapPoint) | Gets or sets the snap point. |
| [setSnapPoint(Cad2DPoint value)](#setSnapPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad2DPoint) | Gets or sets the snap point. |
| [getSnapSpacing()](#getSnapSpacing) | Gets or sets the snap spacing. |
| [setSnapSpacing(Cad2DPoint value)](#setSnapSpacing-com.aspose.cad.fileformats.cad.cadobjects.Cad2DPoint) | Gets or sets the snap spacing. |
| [getGridSpacing()](#getGridSpacing) | Gets or sets the grid spacing. |
| [setGridSpacing(Cad2DPoint value)](#setGridSpacing-com.aspose.cad.fileformats.cad.cadobjects.Cad2DPoint) | Gets or sets the grid spacing. |
| [getViewDirection()](#getViewDirection) | Gets or sets the view direction. |
| [setViewDirection(Cad3DPoint value)](#setViewDirection-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Gets or sets the view direction. |
| [getViewTargetPoint()](#getViewTargetPoint) | Gets or sets the view target point. |
| [setViewTargetPoint(Cad3DPoint value)](#setViewTargetPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Gets or sets the view target point. |
| [getLensLength()](#getLensLength) | Gets or sets the length of the lens. |
| [setLensLength(double value)](#setLensLength-double) | Gets or sets the length of the lens. |
| [getViewAspectRatio()](#getViewAspectRatio) | Gets or sets view aspect ratio. |
| [setViewAspectRatio(double value)](#setViewAspectRatio-double) | Gets or sets view aspect ratio. |
| [getUseAspectRatio()](#getUseAspectRatio) | Gets or sets a value indicating whether [use aspect ratio]. |
| [setUseAspectRatio(boolean value)](#setUseAspectRatio-boolean) | Gets or sets a value indicating whether [use aspect ratio]. |
| [getFrontClipping()](#getFrontClipping) | Gets or sets the front clipping. |
| [setFrontClipping(double value)](#setFrontClipping-double) | Gets or sets the front clipping. |
| [getBackClipping()](#getBackClipping) | Gets or sets the back clipping. |
| [setBackClipping(double value)](#setBackClipping-double) | Gets or sets the back clipping. |
| [getViewHeight()](#getViewHeight) | Gets or sets the height of the view. |
| [setViewHeight(double value)](#setViewHeight-double) | Gets or sets the height of the view. |
| [getSnapRotationAngle()](#getSnapRotationAngle) | Gets or sets the snap rotation angle. |
| [setSnapRotationAngle(double value)](#setSnapRotationAngle-double) | Gets or sets the snap rotation angle. |
| [getViewTwistAngle()](#getViewTwistAngle) | Gets or sets the view twist angle. |
| [setViewTwistAngle(double value)](#setViewTwistAngle-double) | Gets or sets the view twist angle. |
| [getCircleSides()](#getCircleSides) | Gets or sets the circle sides. |
| [setCircleSides(short value)](#setCircleSides-short) | Gets or sets the circle sides. |
| [getFastZoom()](#getFastZoom) | Gets or sets the fast zoom. |
| [setFastZoom(short value)](#setFastZoom-short) | Gets or sets the fast zoom. |
| [getGridOnOff()](#getGridOnOff) | Gets or sets the grid on/off. |
| [setGridOnOff(short value)](#setGridOnOff-short) | Gets or sets the grid on/off. |
| [getStyleSheet()](#getStyleSheet) | Gets or sets the style sheet. |
| [setStyleSheet(String value)](#setStyleSheet-java.lang.String) | Gets or sets the style sheet. |
| [getRenderMode()](#getRenderMode) | Gets or sets the render mode. |
| [setRenderMode(short value)](#setRenderMode-short) | Gets or sets the render mode. |
| [getViewMode()](#getViewMode) | Gets or sets the view mode. |
| [setViewMode(short value)](#setViewMode-short) | Gets or sets the view mode. |
| [getUcsIcon()](#getUcsIcon) | Gets or sets the ucs icon. |
| [setUcsIcon(short value)](#setUcsIcon-short) | Gets or sets the ucs icon. |
| [getSnapOnOff()](#getSnapOnOff) | Gets or sets the snap on off. |
| [setSnapOnOff(short value)](#setSnapOnOff-short) | Gets or sets the snap on off. |
| [getSnapStyle()](#getSnapStyle) | Gets or sets the snap style. |
| [setSnapStyle(short value)](#setSnapStyle-short) | Gets or sets the snap style. |
| [getSnapIsopair()](#getSnapIsopair) | Gets or sets the snap isopair. |
| [setSnapIsopair(short value)](#setSnapIsopair-short) | Gets or sets the snap isopair. |
| [getUcsOrigin()](#getUcsOrigin) | Gets or sets the ucs origin. |
| [setUcsOrigin(Cad3DPoint value)](#setUcsOrigin-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Gets or sets the ucs origin. |
| [getUcsXaxis()](#getUcsXaxis) | Gets or sets the ucs xaxis. |
| [setUcsXaxis(Cad3DPoint value)](#setUcsXaxis-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Gets or sets the ucs xaxis. |
| [getUcsYaxis()](#getUcsYaxis) | Gets or sets the ucs yaxis. |
| [setUcsYaxis(Cad3DPoint value)](#setUcsYaxis-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Gets or sets the ucs yaxis. |
| [getUcsHandle()](#getUcsHandle) | Gets or sets the ucs handle. |
| [setUcsHandle(String value)](#setUcsHandle-java.lang.String) | Gets or sets the ucs handle. |
| [getUcsBaseHandle()](#getUcsBaseHandle) | Gets or sets the ucs base handle. |
| [setUcsBaseHandle(String value)](#setUcsBaseHandle-java.lang.String) | Gets or sets the ucs base handle. |
| [getUcsType()](#getUcsType) | Gets or sets the type of the ucs. |
| [setUcsType(short value)](#setUcsType-short) | Gets or sets the type of the ucs. |
| [getElevation()](#getElevation) | Gets or sets the elevation. |
| [setElevation(double value)](#setElevation-double) | Gets or sets the elevation. |
| [getShadePlotSetting()](#getShadePlotSetting) | Gets or sets the shade plot setting. |
| [setShadePlotSetting(Short value)](#setShadePlotSetting-java.lang.Short) | Gets or sets the shade plot setting. |
| [getMajorGridLines()](#getMajorGridLines) | Gets or sets the major grid lines. |
| [setMajorGridLines(short value)](#setMajorGridLines-short) | Gets or sets the major grid lines. |
| [getBackgroundHandle()](#getBackgroundHandle) | Gets or sets the background handle. |
| [setBackgroundHandle(String value)](#setBackgroundHandle-java.lang.String) | Gets or sets the background handle. |
| [getShadeHandle()](#getShadeHandle) | Gets or sets the shade handle. |
| [setShadeHandle(String value)](#setShadeHandle-java.lang.String) | Gets or sets the shade handle. |
| [getVisualStyleHandle()](#getVisualStyleHandle) | Gets or sets the visual style handle. |
| [setVisualStyleHandle(String value)](#setVisualStyleHandle-java.lang.String) | Gets or sets the visual style handle. |
| [getDefaultLights()](#getDefaultLights) | Gets or sets the default lights. |
| [setDefaultLights(boolean value)](#setDefaultLights-boolean) | Gets or sets the default lights. |
| [getDefaultLightType()](#getDefaultLightType) | Gets or sets the default type of the light. |
| [setDefaultLightType(short value)](#setDefaultLightType-short) | Gets or sets the default type of the light. |
| [getTableContrast()](#getTableContrast) | Gets or sets the contrast. |
| [setTableContrast(double value)](#setTableContrast-double) | Gets or sets the contrast. |
| [getTableBrightness()](#getTableBrightness) | Gets or sets the brightness. |
| [setTableBrightness(double value)](#setTableBrightness-double) | Gets or sets the brightness. |
| [getAmbientColor1()](#getAmbientColor1) | Gets or sets the ambient color1. |
| [setAmbientColor1(short value)](#setAmbientColor1-short) | Gets or sets the ambient color1. |
| [getAmbientColor2()](#getAmbientColor2) | Gets or sets the ambient color2. |
| [setAmbientColor2(int value)](#setAmbientColor2-int) | Gets or sets the ambient color2. |
| [getAmbientColor3()](#getAmbientColor3) | Gets or sets the ambient color3. |
| [setAmbientColor3(String value)](#setAmbientColor3-java.lang.String) | Gets or sets the ambient color3. |

### CadVportTableObject() {#CadVportTableObject}
```java
public CadVportTableObject()
```

Initializes a new instance of the CadVportTableObject class.

### getSoftFrozenLayerObject() {#getSoftFrozenLayerObject}
```java
public final List<String> getSoftFrozenLayerObject()
```

Gets or sets the soft frozen layer object.

**Returns:** List<String> - The soft frozen layer object.

### setSoftFrozenLayerObject(List<String> value) {#setSoftFrozenLayerObject-java.util.List}
```java
public final void setSoftFrozenLayerObject(List<String> value)
```

Gets or sets the soft frozen layer object.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | List<String> | The soft frozen layer object. |

### getHardFrozenLayerObject() {#getHardFrozenLayerObject}
```java
public final List<String> getHardFrozenLayerObject()
```

Gets or sets the hard frozen layer object.

**Returns:** List<String> - The hard frozen layer object.

### setHardFrozenLayerObject(List<String> value) {#setHardFrozenLayerObject-java.util.List}
```java
public final void setHardFrozenLayerObject(List<String> value)
```

Gets or sets the hard frozen layer object.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | List<String> | The hard frozen layer object. |

### getName() {#getName}
```java
public final String getName()
```

Gets or sets the name.

**Returns:** String - The name.

### setName(String value) {#setName-java.lang.String}
```java
public final void setName(String value)
```

Gets or sets the name.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The name. |

### getFlags() {#getFlags}
```java
public final short getFlags()
```

Gets or sets the flags.

**Returns:** short - The flags.

### setFlags(short value) {#setFlags-short}
```java
public final void setFlags(short value)
```

Gets or sets the flags.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The flags. |

### getLowerLeft() {#getLowerLeft}
```java
public final Cad2DPoint getLowerLeft()
```

Gets or sets the lower left.

**Returns:** Cad2DPoint - The lower left.

### setLowerLeft(Cad2DPoint value) {#setLowerLeft-com.aspose.cad.fileformats.cad.cadobjects.Cad2DPoint}
```java
public final void setLowerLeft(Cad2DPoint value)
```

Gets or sets the lower left.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Cad2DPoint | The lower left. |

### getUpperRight() {#getUpperRight}
```java
public final Cad2DPoint getUpperRight()
```

Gets or sets the upper right.

**Returns:** Cad2DPoint - The upper right.

### setUpperRight(Cad2DPoint value) {#setUpperRight-com.aspose.cad.fileformats.cad.cadobjects.Cad2DPoint}
```java
public final void setUpperRight(Cad2DPoint value)
```

Gets or sets the upper right.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Cad2DPoint | The upper right. |

### getCenterPoint() {#getCenterPoint}
```java
public final Cad2DPoint getCenterPoint()
```

Gets or sets the center point.

**Returns:** Cad2DPoint - The center point.

### setCenterPoint(Cad2DPoint value) {#setCenterPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad2DPoint}
```java
public final void setCenterPoint(Cad2DPoint value)
```

Gets or sets the center point.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Cad2DPoint | The center point. |

### getSnapPoint() {#getSnapPoint}
```java
public final Cad2DPoint getSnapPoint()
```

Gets or sets the snap point.

**Returns:** Cad2DPoint - The snap point.

### setSnapPoint(Cad2DPoint value) {#setSnapPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad2DPoint}
```java
public final void setSnapPoint(Cad2DPoint value)
```

Gets or sets the snap point.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Cad2DPoint | The snap point. |

### getSnapSpacing() {#getSnapSpacing}
```java
public final Cad2DPoint getSnapSpacing()
```

Gets or sets the snap spacing.

**Returns:** Cad2DPoint - The snap spacing.

### setSnapSpacing(Cad2DPoint value) {#setSnapSpacing-com.aspose.cad.fileformats.cad.cadobjects.Cad2DPoint}
```java
public final void setSnapSpacing(Cad2DPoint value)
```

Gets or sets the snap spacing.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Cad2DPoint | The snap spacing. |

### getGridSpacing() {#getGridSpacing}
```java
public final Cad2DPoint getGridSpacing()
```

Gets or sets the grid spacing.

**Returns:** Cad2DPoint - The grid spacing.

### setGridSpacing(Cad2DPoint value) {#setGridSpacing-com.aspose.cad.fileformats.cad.cadobjects.Cad2DPoint}
```java
public final void setGridSpacing(Cad2DPoint value)
```

Gets or sets the grid spacing.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Cad2DPoint | The grid spacing. |

### getViewDirection() {#getViewDirection}
```java
public final Cad3DPoint getViewDirection()
```

Gets or sets the view direction.

**Returns:** Cad3DPoint - The view direction.

### setViewDirection(Cad3DPoint value) {#setViewDirection-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public final void setViewDirection(Cad3DPoint value)
```

Gets or sets the view direction.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Cad3DPoint | The view direction. |

### getViewTargetPoint() {#getViewTargetPoint}
```java
public final Cad3DPoint getViewTargetPoint()
```

Gets or sets the view target point.

**Returns:** Cad3DPoint - The view target point.

### setViewTargetPoint(Cad3DPoint value) {#setViewTargetPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public final void setViewTargetPoint(Cad3DPoint value)
```

Gets or sets the view target point.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Cad3DPoint | The view target point. |

### getLensLength() {#getLensLength}
```java
public final double getLensLength()
```

Gets or sets the length of the lens.

**Returns:** double - The length of the lens.

### setLensLength(double value) {#setLensLength-double}
```java
public final void setLensLength(double value)
```

Gets or sets the length of the lens.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The length of the lens. |

### getViewAspectRatio() {#getViewAspectRatio}
```java
public final double getViewAspectRatio()
```

Gets or sets view aspect ratio.

**Returns:** double

### setViewAspectRatio(double value) {#setViewAspectRatio-double}
```java
public final void setViewAspectRatio(double value)
```

Gets or sets view aspect ratio.

### getUseAspectRatio() {#getUseAspectRatio}
```java
public final boolean getUseAspectRatio()
```

Gets or sets a value indicating whether [use aspect ratio].

**Returns:** boolean - true if [use aspect ratio]; otherwise, false .

### setUseAspectRatio(boolean value) {#setUseAspectRatio-boolean}
```java
public final void setUseAspectRatio(boolean value)
```

Gets or sets a value indicating whether [use aspect ratio].

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | true if [use aspect ratio]; otherwise, false . |

### getFrontClipping() {#getFrontClipping}
```java
public final double getFrontClipping()
```

Gets or sets the front clipping.

**Returns:** double - The front clipping.

### setFrontClipping(double value) {#setFrontClipping-double}
```java
public final void setFrontClipping(double value)
```

Gets or sets the front clipping.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The front clipping. |

### getBackClipping() {#getBackClipping}
```java
public final double getBackClipping()
```

Gets or sets the back clipping.

**Returns:** double - The back clipping.

### setBackClipping(double value) {#setBackClipping-double}
```java
public final void setBackClipping(double value)
```

Gets or sets the back clipping.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The back clipping. |

### getViewHeight() {#getViewHeight}
```java
public final double getViewHeight()
```

Gets or sets the height of the view.

**Returns:** double - The height of the view.

### setViewHeight(double value) {#setViewHeight-double}
```java
public final void setViewHeight(double value)
```

Gets or sets the height of the view.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The height of the view. |

### getSnapRotationAngle() {#getSnapRotationAngle}
```java
public final double getSnapRotationAngle()
```

Gets or sets the snap rotation angle.

**Returns:** double - The snap rotation angle.

### setSnapRotationAngle(double value) {#setSnapRotationAngle-double}
```java
public final void setSnapRotationAngle(double value)
```

Gets or sets the snap rotation angle.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The snap rotation angle. |

### getViewTwistAngle() {#getViewTwistAngle}
```java
public final double getViewTwistAngle()
```

Gets or sets the view twist angle.

**Returns:** double - The view twist angle.

### setViewTwistAngle(double value) {#setViewTwistAngle-double}
```java
public final void setViewTwistAngle(double value)
```

Gets or sets the view twist angle.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The view twist angle. |

### getCircleSides() {#getCircleSides}
```java
public final short getCircleSides()
```

Gets or sets the circle sides.

**Returns:** short - The circle sides.

### setCircleSides(short value) {#setCircleSides-short}
```java
public final void setCircleSides(short value)
```

Gets or sets the circle sides.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The circle sides. |

### getFastZoom() {#getFastZoom}
```java
public final short getFastZoom()
```

Gets or sets the fast zoom.

**Returns:** short - The fast zoom.

### setFastZoom(short value) {#setFastZoom-short}
```java
public final void setFastZoom(short value)
```

Gets or sets the fast zoom.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The fast zoom. |

### getGridOnOff() {#getGridOnOff}
```java
public final short getGridOnOff()
```

Gets or sets the grid on/off.

**Returns:** short - The grid on/off.

### setGridOnOff(short value) {#setGridOnOff-short}
```java
public final void setGridOnOff(short value)
```

Gets or sets the grid on/off.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The grid on/off. |

### getStyleSheet() {#getStyleSheet}
```java
public final String getStyleSheet()
```

Gets or sets the style sheet.

**Returns:** String - The style sheet.

### setStyleSheet(String value) {#setStyleSheet-java.lang.String}
```java
public final void setStyleSheet(String value)
```

Gets or sets the style sheet.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The style sheet. |

### getRenderMode() {#getRenderMode}
```java
public final short getRenderMode()
```

Gets or sets the render mode.

**Returns:** short - The render mode.

### setRenderMode(short value) {#setRenderMode-short}
```java
public final void setRenderMode(short value)
```

Gets or sets the render mode.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The render mode. |

### getViewMode() {#getViewMode}
```java
public final short getViewMode()
```

Gets or sets the view mode.

**Returns:** short - The view mode.

### setViewMode(short value) {#setViewMode-short}
```java
public final void setViewMode(short value)
```

Gets or sets the view mode.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The view mode. |

### getUcsIcon() {#getUcsIcon}
```java
public final short getUcsIcon()
```

Gets or sets the ucs icon.

**Returns:** short - The ucs icon.

### setUcsIcon(short value) {#setUcsIcon-short}
```java
public final void setUcsIcon(short value)
```

Gets or sets the ucs icon.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The ucs icon. |

### getSnapOnOff() {#getSnapOnOff}
```java
public final short getSnapOnOff()
```

Gets or sets the snap on off.

**Returns:** short - The snap on off.

### setSnapOnOff(short value) {#setSnapOnOff-short}
```java
public final void setSnapOnOff(short value)
```

Gets or sets the snap on off.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The snap on off. |

### getSnapStyle() {#getSnapStyle}
```java
public final short getSnapStyle()
```

Gets or sets the snap style.

**Returns:** short - The snap style.

### setSnapStyle(short value) {#setSnapStyle-short}
```java
public final void setSnapStyle(short value)
```

Gets or sets the snap style.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The snap style. |

### getSnapIsopair() {#getSnapIsopair}
```java
public final short getSnapIsopair()
```

Gets or sets the snap isopair.

**Returns:** short - The snap isopair.

### setSnapIsopair(short value) {#setSnapIsopair-short}
```java
public final void setSnapIsopair(short value)
```

Gets or sets the snap isopair.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The snap isopair. |

### getUcsOrigin() {#getUcsOrigin}
```java
public final Cad3DPoint getUcsOrigin()
```

Gets or sets the ucs origin.

**Returns:** Cad3DPoint - The ucs origin.

### setUcsOrigin(Cad3DPoint value) {#setUcsOrigin-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public final void setUcsOrigin(Cad3DPoint value)
```

Gets or sets the ucs origin.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Cad3DPoint | The ucs origin. |

### getUcsXaxis() {#getUcsXaxis}
```java
public final Cad3DPoint getUcsXaxis()
```

Gets or sets the ucs xaxis.

**Returns:** Cad3DPoint - The ucs xaxis.

### setUcsXaxis(Cad3DPoint value) {#setUcsXaxis-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public final void setUcsXaxis(Cad3DPoint value)
```

Gets or sets the ucs xaxis.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Cad3DPoint | The ucs xaxis. |

### getUcsYaxis() {#getUcsYaxis}
```java
public final Cad3DPoint getUcsYaxis()
```

Gets or sets the ucs yaxis.

**Returns:** Cad3DPoint - The ucs yaxis.

### setUcsYaxis(Cad3DPoint value) {#setUcsYaxis-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public final void setUcsYaxis(Cad3DPoint value)
```

Gets or sets the ucs yaxis.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Cad3DPoint | The ucs yaxis. |

### getUcsHandle() {#getUcsHandle}
```java
public final String getUcsHandle()
```

Gets or sets the ucs handle.

**Returns:** String - The ucs handle.

### setUcsHandle(String value) {#setUcsHandle-java.lang.String}
```java
public final void setUcsHandle(String value)
```

Gets or sets the ucs handle.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The ucs handle. |

### getUcsBaseHandle() {#getUcsBaseHandle}
```java
public final String getUcsBaseHandle()
```

Gets or sets the ucs base handle.

**Returns:** String - The ucs base handle.

### setUcsBaseHandle(String value) {#setUcsBaseHandle-java.lang.String}
```java
public final void setUcsBaseHandle(String value)
```

Gets or sets the ucs base handle.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The ucs base handle. |

### getUcsType() {#getUcsType}
```java
public final short getUcsType()
```

Gets or sets the type of the ucs.

**Returns:** short - The type of the ucs.

### setUcsType(short value) {#setUcsType-short}
```java
public final void setUcsType(short value)
```

Gets or sets the type of the ucs.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The type of the ucs. |

### getElevation() {#getElevation}
```java
public final double getElevation()
```

Gets or sets the elevation.

**Returns:** double - The elevation.

### setElevation(double value) {#setElevation-double}
```java
public final void setElevation(double value)
```

Gets or sets the elevation.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The elevation. |

### getShadePlotSetting() {#getShadePlotSetting}
```java
public final Short getShadePlotSetting()
```

Gets or sets the shade plot setting.

**Returns:** Short - The shade plot setting.

### setShadePlotSetting(Short value) {#setShadePlotSetting-java.lang.Short}
```java
public final void setShadePlotSetting(Short value)
```

Gets or sets the shade plot setting.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The shade plot setting. |

### getMajorGridLines() {#getMajorGridLines}
```java
public final short getMajorGridLines()
```

Gets or sets the major grid lines.

**Returns:** short - The major grid lines.

### setMajorGridLines(short value) {#setMajorGridLines-short}
```java
public final void setMajorGridLines(short value)
```

Gets or sets the major grid lines.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The major grid lines. |

### getBackgroundHandle() {#getBackgroundHandle}
```java
public final String getBackgroundHandle()
```

Gets or sets the background handle.

**Returns:** String - The background handle.

### setBackgroundHandle(String value) {#setBackgroundHandle-java.lang.String}
```java
public final void setBackgroundHandle(String value)
```

Gets or sets the background handle.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The background handle. |

### getShadeHandle() {#getShadeHandle}
```java
public final String getShadeHandle()
```

Gets or sets the shade handle.

**Returns:** String - The shade handle.

### setShadeHandle(String value) {#setShadeHandle-java.lang.String}
```java
public final void setShadeHandle(String value)
```

Gets or sets the shade handle.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The shade handle. |

### getVisualStyleHandle() {#getVisualStyleHandle}
```java
public final String getVisualStyleHandle()
```

Gets or sets the visual style handle.

**Returns:** String - The visual style handle.

### setVisualStyleHandle(String value) {#setVisualStyleHandle-java.lang.String}
```java
public final void setVisualStyleHandle(String value)
```

Gets or sets the visual style handle.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The visual style handle. |

### getDefaultLights() {#getDefaultLights}
```java
public final boolean getDefaultLights()
```

Gets or sets the default lights.

**Returns:** boolean - The default lights.

### setDefaultLights(boolean value) {#setDefaultLights-boolean}
```java
public final void setDefaultLights(boolean value)
```

Gets or sets the default lights.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The default lights. |

### getDefaultLightType() {#getDefaultLightType}
```java
public final short getDefaultLightType()
```

Gets or sets the default type of the light.

**Returns:** short - The default type of the light.

### setDefaultLightType(short value) {#setDefaultLightType-short}
```java
public final void setDefaultLightType(short value)
```

Gets or sets the default type of the light.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The default type of the light. |

### getTableContrast() {#getTableContrast}
```java
public final double getTableContrast()
```

Gets or sets the contrast.

**Returns:** double - The contrast.

### setTableContrast(double value) {#setTableContrast-double}
```java
public final void setTableContrast(double value)
```

Gets or sets the contrast.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The contrast. |

### getTableBrightness() {#getTableBrightness}
```java
public final double getTableBrightness()
```

Gets or sets the brightness.

**Returns:** double - The brightness.

### setTableBrightness(double value) {#setTableBrightness-double}
```java
public final void setTableBrightness(double value)
```

Gets or sets the brightness.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The brightness. |

### getAmbientColor1() {#getAmbientColor1}
```java
public final short getAmbientColor1()
```

Gets or sets the ambient color1.

**Returns:** short - The ambient color1.

### setAmbientColor1(short value) {#setAmbientColor1-short}
```java
public final void setAmbientColor1(short value)
```

Gets or sets the ambient color1.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The ambient color1. |

### getAmbientColor2() {#getAmbientColor2}
```java
public final int getAmbientColor2()
```

Gets or sets the ambient color2.

**Returns:** int - The ambient color2.

### setAmbientColor2(int value) {#setAmbientColor2-int}
```java
public final void setAmbientColor2(int value)
```

Gets or sets the ambient color2.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The ambient color2. |

### getAmbientColor3() {#getAmbientColor3}
```java
public final String getAmbientColor3()
```

Gets or sets the ambient color3.

**Returns:** String - The ambient color3.

### setAmbientColor3(String value) {#setAmbientColor3-java.lang.String}
```java
public final void setAmbientColor3(String value)
```

Gets or sets the ambient color3.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The ambient color3. |

