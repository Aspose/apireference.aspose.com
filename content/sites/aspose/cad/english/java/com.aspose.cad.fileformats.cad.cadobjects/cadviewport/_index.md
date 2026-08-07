---
title: "CadViewport"
linktitle: "CadViewport"
second_title: "Aspose.CAD for Java"
description: "The Cad view port."
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.cad.cadobjects/cadviewport/
---

**Inheritance:** java.lang.Object, CadBaseEntity

The Cad view port.

## Constructors

| Constructor | Description |
| --- | --- |
| [CadViewport()](#CadViewport) | Initializes a new instance of the CadViewport class. |

## Methods

| Method | Description |
| --- | --- |
| [getTypeName()](#getTypeName) | Gets the name of the type. |
| [getAmbientElement1()](#getAmbientElement1) | Gets or sets the ambient element 1. |
| [setAmbientElement1(Short value)](#setAmbientElement1-java.lang.Short) | Gets or sets the ambient element 1. |
| [getAmbientElement2()](#getAmbientElement2) | Gets or sets the ambient element 2. |
| [setAmbientElement2(Integer value)](#setAmbientElement2-java.lang.Integer) | Gets or sets the ambient element 2. |
| [getAmbientElement3()](#getAmbientElement3) | Gets or sets the ambient element 3. |
| [setAmbientElement3(String value)](#setAmbientElement3-java.lang.String) | Gets or sets the ambient element 3. |
| [getAxisXOfUcs()](#getAxisXOfUcs) | Gets or sets the axis x of UCS. |
| [setAxisXOfUcs(Cad3DPoint value)](#setAxisXOfUcs-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Gets or sets the axis x of UCS. |
| [getAxisYOfUcs()](#getAxisYOfUcs) | Gets or sets the axis y of UCS. |
| [setAxisYOfUcs(Cad3DPoint value)](#setAxisYOfUcs-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Gets or sets the axis y of UCS. |
| [getBackClipZValue()](#getBackClipZValue) | Gets or sets the back clip z value. |
| [setBackClipZValue(double value)](#setBackClipZValue-double) | Gets or sets the back clip z value. |
| [getBackgroundHandle()](#getBackgroundHandle) | Gets or sets the background handle. |
| [setBackgroundHandle(String value)](#setBackgroundHandle-java.lang.String) | Gets or sets the background handle. |
| [getCenterPoint()](#getCenterPoint) | Gets or sets the center point. |
| [setCenterPoint(Cad3DPoint value)](#setCenterPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Gets or sets the center point. |
| [getCircleZoomPresent()](#getCircleZoomPresent) | Gets or sets the circle zoom present. |
| [setCircleZoomPresent(short value)](#setCircleZoomPresent-short) | Gets or sets the circle zoom present. |
| [getDefaultLigtingFlag()](#getDefaultLigtingFlag) | Gets or sets a value indicating whether default ligting flag. |
| [setDefaultLigtingFlag(Boolean value)](#setDefaultLigtingFlag-java.lang.Boolean) | Gets or sets a value indicating whether default ligting flag. |
| [getDefaultLigtingType()](#getDefaultLigtingType) | Gets or sets the default ligting type. |
| [setDefaultLigtingType(Short value)](#setDefaultLigtingType-java.lang.Short) | Gets or sets the default ligting type. |
| [getDisplayUcs()](#getDisplayUcs) | Gets or sets the display UCS. |
| [setDisplayUcs(short value)](#setDisplayUcs-short) | Gets or sets the display UCS. |
| [getElevation()](#getElevation) | Gets or sets the elevation. |
| [setElevation(double value)](#setElevation-double) | Gets or sets the elevation. |
| [getFrontClipZValue()](#getFrontClipZValue) | Gets or sets the front clip z value. |
| [setFrontClipZValue(double value)](#setFrontClipZValue-double) | Gets or sets the front clip z value. |
| [getFrozenLayerObjectIdList()](#getFrozenLayerObjectIdList) | Gets or sets the frozen layer object identifier list. |
| [setFrozenLayerObjectIdList(List<String> value)](#setFrozenLayerObjectIdList-java.util.List) | Gets or sets the frozen layer object identifier list. |
| [getGridFrequency()](#getGridFrequency) | Gets or sets the grid frequency. |
| [setGridFrequency(Short value)](#setGridFrequency-java.lang.Short) | Gets or sets the grid frequency. |
| [getGridSpacing()](#getGridSpacing) | Gets or sets the grid spacing. |
| [setGridSpacing(Cad2DPoint value)](#setGridSpacing-com.aspose.cad.fileformats.cad.cadobjects.Cad2DPoint) | Gets or sets the grid spacing. |
| [getHeight()](#getHeight) | Gets or sets the height. |
| [setHeight(double value)](#setHeight-double) | Gets or sets the height. |
| [getOriginUcs()](#getOriginUcs) | Gets or sets the origin UCS. |
| [setOriginUcs(Cad3DPoint value)](#setOriginUcs-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Gets or sets the origin UCS. |
| [getOrthographic()](#getOrthographic) | Gets or sets the orthographic. |
| [setOrthographic(short value)](#setOrthographic-short) | Gets or sets the orthographic. |
| [getPerspectiveLensLength()](#getPerspectiveLensLength) | Gets or sets the perspective lens length. |
| [setPerspectiveLensLength(double value)](#setPerspectiveLensLength-double) | Gets or sets the perspective lens length. |
| [getPlotStyleSheetName()](#getPlotStyleSheetName) | Gets or sets the plot style sheet name. |
| [setPlotStyleSheetName(String value)](#setPlotStyleSheetName-java.lang.String) | Gets or sets the plot style sheet name. |
| [getReferenceToTableRecord()](#getReferenceToTableRecord) | Gets or sets the reference to table record. |
| [setReferenceToTableRecord(String value)](#setReferenceToTableRecord-java.lang.String) | Gets or sets the reference to table record. |
| [getReferenceToTableRecordOrthoGraphic()](#getReferenceToTableRecordOrthoGraphic) | Gets or sets the reference to table record ortho graphic. |
| [setReferenceToTableRecordOrthoGraphic(String value)](#setReferenceToTableRecordOrthoGraphic-java.lang.String) | Gets or sets the reference to table record ortho graphic. |
| [getRenderMode()](#getRenderMode) | Gets or sets the render mode. |
| [setRenderMode(short value)](#setRenderMode-short) | Gets or sets the render mode. |
| [getShadeHandle()](#getShadeHandle) | Gets or sets the shade handle. |
| [setShadeHandle(String value)](#setShadeHandle-java.lang.String) | Gets or sets the shade handle. |
| [getShadePlotMode()](#getShadePlotMode) | Gets or sets the shade plot mode. |
| [setShadePlotMode(short value)](#setShadePlotMode-short) | Gets or sets the shade plot mode. |
| [getSnapAngle()](#getSnapAngle) | Gets or sets the snap angle. |
| [setSnapAngle(double value)](#setSnapAngle-double) | Gets or sets the snap angle. |
| [getSnapBasePoint()](#getSnapBasePoint) | Gets or sets the snap base point. |
| [setSnapBasePoint(Cad2DPoint value)](#setSnapBasePoint-com.aspose.cad.fileformats.cad.cadobjects.Cad2DPoint) | Gets or sets the snap base point. |
| [getSnapSpacing()](#getSnapSpacing) | Gets or sets the snap spacing. |
| [setSnapSpacing(Cad2DPoint value)](#setSnapSpacing-com.aspose.cad.fileformats.cad.cadobjects.Cad2DPoint) | Gets or sets the snap spacing. |
| [getStatus()](#getStatus) | Gets or sets the status. (DXF 68 status) |
| [setStatus(short value)](#setStatus-short) | Gets or sets the status. (DXF 68 status) |
| [getSunHandle()](#getSunHandle) | Gets or sets the sun handle. |
| [setSunHandle(String value)](#setSunHandle-java.lang.String) | Gets or sets the sun handle. |
| [getTwistAngle()](#getTwistAngle) | Gets or sets the twist angle. |
| [setTwistAngle(double value)](#setTwistAngle-double) | Gets or sets the twist angle. |
| [getUcsPerViewPort()](#getUcsPerViewPort) | Gets or sets the UCS per view port. |
| [setUcsPerViewPort(short value)](#setUcsPerViewPort-short) | Gets or sets the UCS per view port. |
| [getViewHeight()](#getViewHeight) | Gets or sets the view height. |
| [setViewHeight(double value)](#setViewHeight-double) | Gets or sets the view height. |
| [getViewBrigtness()](#getViewBrigtness) | Gets or sets the view brigtness. |
| [setViewBrigtness(Double value)](#setViewBrigtness-java.lang.Double) | Gets or sets the view brigtness. |
| [getViewCenterPoint()](#getViewCenterPoint) | Gets or sets the view center point. |
| [setViewCenterPoint(Cad2DPoint value)](#setViewCenterPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad2DPoint) | Gets or sets the view center point. |
| [getViewContrast()](#getViewContrast) | Gets or sets the view contrast. |
| [setViewContrast(Double value)](#setViewContrast-java.lang.Double) | Gets or sets the view contrast. |
| [getViewDirectionVector()](#getViewDirectionVector) | Gets or sets the view direction vector. |
| [setViewDirectionVector(Cad3DPoint value)](#setViewDirectionVector-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Gets or sets the view direction vector. |
| [getViewPointRef1()](#getViewPointRef1) | Gets or sets the view point ref 1. |
| [setViewPointRef1(String value)](#setViewPointRef1-java.lang.String) | Gets or sets the view point ref 1. |
| [getViewPointRef2()](#getViewPointRef2) | Gets or sets the view point ref 2. |
| [setViewPointRef2(String value)](#setViewPointRef2-java.lang.String) | Gets or sets the view point ref 2. |
| [getViewPointRef3()](#getViewPointRef3) | Gets or sets the view point ref 3. |
| [setViewPointRef3(String value)](#setViewPointRef3-java.lang.String) | Gets or sets the view point ref 3. |
| [getViewPointRef4()](#getViewPointRef4) | Gets or sets the view point ref 4. |
| [setViewPointRef4(Integer value)](#setViewPointRef4-java.lang.Integer) | Gets or sets the view point ref 4. |
| [getViewPortId()](#getViewPortId) | Gets or sets the view port id. |
| [setViewPortId(short value)](#setViewPortId-short) | Gets or sets the view port id. |
| [getViewPortStatus()](#getViewPortStatus) | Gets or sets the view port status. (DXF 90) |
| [setViewPortStatus(int value)](#setViewPortStatus-int) | Gets or sets the view port status. (DXF 90) |
| [hasNewStatus()](#hasNewStatus) | Wether entity has new viewport status field (DXF 90) |
| [setNewStatus(boolean value)](#setNewStatus-boolean) | Wether entity has new viewport status field (DXF 90) |
| [getViewTargetVector()](#getViewTargetVector) | Gets or sets the view target vector. |
| [setViewTargetVector(Cad3DPoint value)](#setViewTargetVector-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Gets or sets the view target vector. |
| [getViewportClippingObjectId()](#getViewportClippingObjectId) | Gets or sets the viewport clipping object id. |
| [setViewportClippingObjectId(String value)](#setViewportClippingObjectId-java.lang.String) | Gets or sets the viewport clipping object id. |
| [getVisualStyleHandle()](#getVisualStyleHandle) | Gets or sets the visual style handle. |
| [setVisualStyleHandle(String value)](#setVisualStyleHandle-java.lang.String) | Gets or sets the visual style handle. |
| [getWidth()](#getWidth) | Gets or sets the width. |
| [setWidth(double value)](#setWidth-double) | Gets or sets the width. |

### CadViewport() {#CadViewport}
```java
public CadViewport()
```

Initializes a new instance of the CadViewport class.

### getTypeName() {#getTypeName}
```java
public int getTypeName()
```

Gets the name of the type.

**Returns:** int - The name of the type.

### getAmbientElement1() {#getAmbientElement1}
```java
public final Short getAmbientElement1()
```

Gets or sets the ambient element 1.

**Returns:** Short

### setAmbientElement1(Short value) {#setAmbientElement1-java.lang.Short}
```java
public final void setAmbientElement1(Short value)
```

Gets or sets the ambient element 1.

### getAmbientElement2() {#getAmbientElement2}
```java
public final Integer getAmbientElement2()
```

Gets or sets the ambient element 2.

**Returns:** Integer

### setAmbientElement2(Integer value) {#setAmbientElement2-java.lang.Integer}
```java
public final void setAmbientElement2(Integer value)
```

Gets or sets the ambient element 2.

### getAmbientElement3() {#getAmbientElement3}
```java
public final String getAmbientElement3()
```

Gets or sets the ambient element 3.

**Returns:** String

### setAmbientElement3(String value) {#setAmbientElement3-java.lang.String}
```java
public final void setAmbientElement3(String value)
```

Gets or sets the ambient element 3.

### getAxisXOfUcs() {#getAxisXOfUcs}
```java
public final Cad3DPoint getAxisXOfUcs()
```

Gets or sets the axis x of UCS.

**Returns:** Cad3DPoint

### setAxisXOfUcs(Cad3DPoint value) {#setAxisXOfUcs-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public final void setAxisXOfUcs(Cad3DPoint value)
```

Gets or sets the axis x of UCS.

### getAxisYOfUcs() {#getAxisYOfUcs}
```java
public final Cad3DPoint getAxisYOfUcs()
```

Gets or sets the axis y of UCS.

**Returns:** Cad3DPoint

### setAxisYOfUcs(Cad3DPoint value) {#setAxisYOfUcs-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public final void setAxisYOfUcs(Cad3DPoint value)
```

Gets or sets the axis y of UCS.

### getBackClipZValue() {#getBackClipZValue}
```java
public final double getBackClipZValue()
```

Gets or sets the back clip z value.

**Returns:** double

### setBackClipZValue(double value) {#setBackClipZValue-double}
```java
public final void setBackClipZValue(double value)
```

Gets or sets the back clip z value.

### getBackgroundHandle() {#getBackgroundHandle}
```java
public final String getBackgroundHandle()
```

Gets or sets the background handle.

**Returns:** String

### setBackgroundHandle(String value) {#setBackgroundHandle-java.lang.String}
```java
public final void setBackgroundHandle(String value)
```

Gets or sets the background handle.

### getCenterPoint() {#getCenterPoint}
```java
public final Cad3DPoint getCenterPoint()
```

Gets or sets the center point.

**Returns:** Cad3DPoint

### setCenterPoint(Cad3DPoint value) {#setCenterPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public final void setCenterPoint(Cad3DPoint value)
```

Gets or sets the center point.

### getCircleZoomPresent() {#getCircleZoomPresent}
```java
public final short getCircleZoomPresent()
```

Gets or sets the circle zoom present.

**Returns:** short

### setCircleZoomPresent(short value) {#setCircleZoomPresent-short}
```java
public final void setCircleZoomPresent(short value)
```

Gets or sets the circle zoom present.

### getDefaultLigtingFlag() {#getDefaultLigtingFlag}
```java
public final Boolean getDefaultLigtingFlag()
```

Gets or sets a value indicating whether default ligting flag.

**Returns:** Boolean

### setDefaultLigtingFlag(Boolean value) {#setDefaultLigtingFlag-java.lang.Boolean}
```java
public final void setDefaultLigtingFlag(Boolean value)
```

Gets or sets a value indicating whether default ligting flag.

### getDefaultLigtingType() {#getDefaultLigtingType}
```java
public final Short getDefaultLigtingType()
```

Gets or sets the default ligting type.

**Returns:** Short

### setDefaultLigtingType(Short value) {#setDefaultLigtingType-java.lang.Short}
```java
public final void setDefaultLigtingType(Short value)
```

Gets or sets the default ligting type.

### getDisplayUcs() {#getDisplayUcs}
```java
public final short getDisplayUcs()
```

Gets or sets the display UCS.

**Returns:** short

### setDisplayUcs(short value) {#setDisplayUcs-short}
```java
public final void setDisplayUcs(short value)
```

Gets or sets the display UCS.

### getElevation() {#getElevation}
```java
public final double getElevation()
```

Gets or sets the elevation.

**Returns:** double

### setElevation(double value) {#setElevation-double}
```java
public final void setElevation(double value)
```

Gets or sets the elevation.

### getFrontClipZValue() {#getFrontClipZValue}
```java
public final double getFrontClipZValue()
```

Gets or sets the front clip z value.

**Returns:** double

### setFrontClipZValue(double value) {#setFrontClipZValue-double}
```java
public final void setFrontClipZValue(double value)
```

Gets or sets the front clip z value.

### getFrozenLayerObjectIdList() {#getFrozenLayerObjectIdList}
```java
public final List<String> getFrozenLayerObjectIdList()
```

Gets or sets the frozen layer object identifier list.

**Returns:** List<String> - The frozen layer object identifier list.

### setFrozenLayerObjectIdList(List<String> value) {#setFrozenLayerObjectIdList-java.util.List}
```java
public final void setFrozenLayerObjectIdList(List<String> value)
```

Gets or sets the frozen layer object identifier list.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | List<String> | The frozen layer object identifier list. |

### getGridFrequency() {#getGridFrequency}
```java
public final Short getGridFrequency()
```

Gets or sets the grid frequency.

**Returns:** Short

### setGridFrequency(Short value) {#setGridFrequency-java.lang.Short}
```java
public final void setGridFrequency(Short value)
```

Gets or sets the grid frequency.

### getGridSpacing() {#getGridSpacing}
```java
public final Cad2DPoint getGridSpacing()
```

Gets or sets the grid spacing.

**Returns:** Cad2DPoint

### setGridSpacing(Cad2DPoint value) {#setGridSpacing-com.aspose.cad.fileformats.cad.cadobjects.Cad2DPoint}
```java
public final void setGridSpacing(Cad2DPoint value)
```

Gets or sets the grid spacing.

### getHeight() {#getHeight}
```java
public final double getHeight()
```

Gets or sets the height.

**Returns:** double

### setHeight(double value) {#setHeight-double}
```java
public final void setHeight(double value)
```

Gets or sets the height.

### getOriginUcs() {#getOriginUcs}
```java
public final Cad3DPoint getOriginUcs()
```

Gets or sets the origin UCS.

**Returns:** Cad3DPoint

### setOriginUcs(Cad3DPoint value) {#setOriginUcs-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public final void setOriginUcs(Cad3DPoint value)
```

Gets or sets the origin UCS.

### getOrthographic() {#getOrthographic}
```java
public final short getOrthographic()
```

Gets or sets the orthographic.

**Returns:** short

### setOrthographic(short value) {#setOrthographic-short}
```java
public final void setOrthographic(short value)
```

Gets or sets the orthographic.

### getPerspectiveLensLength() {#getPerspectiveLensLength}
```java
public final double getPerspectiveLensLength()
```

Gets or sets the perspective lens length.

**Returns:** double

### setPerspectiveLensLength(double value) {#setPerspectiveLensLength-double}
```java
public final void setPerspectiveLensLength(double value)
```

Gets or sets the perspective lens length.

### getPlotStyleSheetName() {#getPlotStyleSheetName}
```java
public final String getPlotStyleSheetName()
```

Gets or sets the plot style sheet name.

**Returns:** String

### setPlotStyleSheetName(String value) {#setPlotStyleSheetName-java.lang.String}
```java
public final void setPlotStyleSheetName(String value)
```

Gets or sets the plot style sheet name.

### getReferenceToTableRecord() {#getReferenceToTableRecord}
```java
public final String getReferenceToTableRecord()
```

Gets or sets the reference to table record.

**Returns:** String

### setReferenceToTableRecord(String value) {#setReferenceToTableRecord-java.lang.String}
```java
public final void setReferenceToTableRecord(String value)
```

Gets or sets the reference to table record.

### getReferenceToTableRecordOrthoGraphic() {#getReferenceToTableRecordOrthoGraphic}
```java
public final String getReferenceToTableRecordOrthoGraphic()
```

Gets or sets the reference to table record ortho graphic.

**Returns:** String

### setReferenceToTableRecordOrthoGraphic(String value) {#setReferenceToTableRecordOrthoGraphic-java.lang.String}
```java
public final void setReferenceToTableRecordOrthoGraphic(String value)
```

Gets or sets the reference to table record ortho graphic.

### getRenderMode() {#getRenderMode}
```java
public final short getRenderMode()
```

Gets or sets the render mode.

**Returns:** short

### setRenderMode(short value) {#setRenderMode-short}
```java
public final void setRenderMode(short value)
```

Gets or sets the render mode.

### getShadeHandle() {#getShadeHandle}
```java
public final String getShadeHandle()
```

Gets or sets the shade handle.

**Returns:** String

### setShadeHandle(String value) {#setShadeHandle-java.lang.String}
```java
public final void setShadeHandle(String value)
```

Gets or sets the shade handle.

### getShadePlotMode() {#getShadePlotMode}
```java
public final short getShadePlotMode()
```

Gets or sets the shade plot mode.

**Returns:** short

### setShadePlotMode(short value) {#setShadePlotMode-short}
```java
public final void setShadePlotMode(short value)
```

Gets or sets the shade plot mode.

### getSnapAngle() {#getSnapAngle}
```java
public final double getSnapAngle()
```

Gets or sets the snap angle.

**Returns:** double

### setSnapAngle(double value) {#setSnapAngle-double}
```java
public final void setSnapAngle(double value)
```

Gets or sets the snap angle.

### getSnapBasePoint() {#getSnapBasePoint}
```java
public final Cad2DPoint getSnapBasePoint()
```

Gets or sets the snap base point.

**Returns:** Cad2DPoint

### setSnapBasePoint(Cad2DPoint value) {#setSnapBasePoint-com.aspose.cad.fileformats.cad.cadobjects.Cad2DPoint}
```java
public final void setSnapBasePoint(Cad2DPoint value)
```

Gets or sets the snap base point.

### getSnapSpacing() {#getSnapSpacing}
```java
public final Cad2DPoint getSnapSpacing()
```

Gets or sets the snap spacing.

**Returns:** Cad2DPoint

### setSnapSpacing(Cad2DPoint value) {#setSnapSpacing-com.aspose.cad.fileformats.cad.cadobjects.Cad2DPoint}
```java
public final void setSnapSpacing(Cad2DPoint value)
```

Gets or sets the snap spacing.

### getStatus() {#getStatus}
```java
public final short getStatus()
```

Gets or sets the status. (DXF 68 status)

**Returns:** short

### setStatus(short value) {#setStatus-short}
```java
public final void setStatus(short value)
```

Gets or sets the status. (DXF 68 status)

### getSunHandle() {#getSunHandle}
```java
public final String getSunHandle()
```

Gets or sets the sun handle.

**Returns:** String

### setSunHandle(String value) {#setSunHandle-java.lang.String}
```java
public final void setSunHandle(String value)
```

Gets or sets the sun handle.

### getTwistAngle() {#getTwistAngle}
```java
public final double getTwistAngle()
```

Gets or sets the twist angle.

**Returns:** double

### setTwistAngle(double value) {#setTwistAngle-double}
```java
public final void setTwistAngle(double value)
```

Gets or sets the twist angle.

### getUcsPerViewPort() {#getUcsPerViewPort}
```java
public final short getUcsPerViewPort()
```

Gets or sets the UCS per view port.

**Returns:** short

### setUcsPerViewPort(short value) {#setUcsPerViewPort-short}
```java
public final void setUcsPerViewPort(short value)
```

Gets or sets the UCS per view port.

### getViewHeight() {#getViewHeight}
```java
public final double getViewHeight()
```

Gets or sets the view height.

**Returns:** double

### setViewHeight(double value) {#setViewHeight-double}
```java
public final void setViewHeight(double value)
```

Gets or sets the view height.

### getViewBrigtness() {#getViewBrigtness}
```java
public final Double getViewBrigtness()
```

Gets or sets the view brigtness.

**Returns:** Double

### setViewBrigtness(Double value) {#setViewBrigtness-java.lang.Double}
```java
public final void setViewBrigtness(Double value)
```

Gets or sets the view brigtness.

### getViewCenterPoint() {#getViewCenterPoint}
```java
public final Cad2DPoint getViewCenterPoint()
```

Gets or sets the view center point.

**Returns:** Cad2DPoint

### setViewCenterPoint(Cad2DPoint value) {#setViewCenterPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad2DPoint}
```java
public final void setViewCenterPoint(Cad2DPoint value)
```

Gets or sets the view center point.

### getViewContrast() {#getViewContrast}
```java
public final Double getViewContrast()
```

Gets or sets the view contrast.

**Returns:** Double

### setViewContrast(Double value) {#setViewContrast-java.lang.Double}
```java
public final void setViewContrast(Double value)
```

Gets or sets the view contrast.

### getViewDirectionVector() {#getViewDirectionVector}
```java
public final Cad3DPoint getViewDirectionVector()
```

Gets or sets the view direction vector.

**Returns:** Cad3DPoint

### setViewDirectionVector(Cad3DPoint value) {#setViewDirectionVector-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public final void setViewDirectionVector(Cad3DPoint value)
```

Gets or sets the view direction vector.

### getViewPointRef1() {#getViewPointRef1}
```java
public final String getViewPointRef1()
```

Gets or sets the view point ref 1.

**Returns:** String

### setViewPointRef1(String value) {#setViewPointRef1-java.lang.String}
```java
public final void setViewPointRef1(String value)
```

Gets or sets the view point ref 1.

### getViewPointRef2() {#getViewPointRef2}
```java
public final String getViewPointRef2()
```

Gets or sets the view point ref 2.

**Returns:** String

### setViewPointRef2(String value) {#setViewPointRef2-java.lang.String}
```java
public final void setViewPointRef2(String value)
```

Gets or sets the view point ref 2.

### getViewPointRef3() {#getViewPointRef3}
```java
public final String getViewPointRef3()
```

Gets or sets the view point ref 3.

**Returns:** String

### setViewPointRef3(String value) {#setViewPointRef3-java.lang.String}
```java
public final void setViewPointRef3(String value)
```

Gets or sets the view point ref 3.

### getViewPointRef4() {#getViewPointRef4}
```java
public final Integer getViewPointRef4()
```

Gets or sets the view point ref 4.

**Returns:** Integer

### setViewPointRef4(Integer value) {#setViewPointRef4-java.lang.Integer}
```java
public final void setViewPointRef4(Integer value)
```

Gets or sets the view point ref 4.

### getViewPortId() {#getViewPortId}
```java
public final short getViewPortId()
```

Gets or sets the view port id.

**Returns:** short

### setViewPortId(short value) {#setViewPortId-short}
```java
public final void setViewPortId(short value)
```

Gets or sets the view port id.

### getViewPortStatus() {#getViewPortStatus}
```java
public final int getViewPortStatus()
```

Gets or sets the view port status. (DXF 90)

**Returns:** int

### setViewPortStatus(int value) {#setViewPortStatus-int}
```java
public final void setViewPortStatus(int value)
```

Gets or sets the view port status. (DXF 90)

### hasNewStatus() {#hasNewStatus}
```java
public final boolean hasNewStatus()
```

Wether entity has new viewport status field (DXF 90)

**Returns:** boolean

### setNewStatus(boolean value) {#setNewStatus-boolean}
```java
public final void setNewStatus(boolean value)
```

Wether entity has new viewport status field (DXF 90)

### getViewTargetVector() {#getViewTargetVector}
```java
public final Cad3DPoint getViewTargetVector()
```

Gets or sets the view target vector.

**Returns:** Cad3DPoint

### setViewTargetVector(Cad3DPoint value) {#setViewTargetVector-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public final void setViewTargetVector(Cad3DPoint value)
```

Gets or sets the view target vector.

### getViewportClippingObjectId() {#getViewportClippingObjectId}
```java
public final String getViewportClippingObjectId()
```

Gets or sets the viewport clipping object id.

**Returns:** String

### setViewportClippingObjectId(String value) {#setViewportClippingObjectId-java.lang.String}
```java
public final void setViewportClippingObjectId(String value)
```

Gets or sets the viewport clipping object id.

### getVisualStyleHandle() {#getVisualStyleHandle}
```java
public final String getVisualStyleHandle()
```

Gets or sets the visual style handle.

**Returns:** String

### setVisualStyleHandle(String value) {#setVisualStyleHandle-java.lang.String}
```java
public final void setVisualStyleHandle(String value)
```

Gets or sets the visual style handle.

### getWidth() {#getWidth}
```java
public final double getWidth()
```

Gets or sets the width.

**Returns:** double

### setWidth(double value) {#setWidth-double}
```java
public final void setWidth(double value)
```

Gets or sets the width.

