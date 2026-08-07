---
title: "CadMLeaderContextData"
linktitle: "CadMLeaderContextData"
second_title: "Aspose.CAD for Java"
description: "Class describing context data for multileader"
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.cad.cadobjects/cadmleadercontextdata/
---

**Inheritance:** java.lang.Object, CadBaseEntity

Class describing context data for multileader

## Constructors

| Constructor | Description |
| --- | --- |
| [CadMLeaderContextData()](#CadMLeaderContextData) | Initializes a new instance of the CadMLeaderContextData class. |

## Methods

| Method | Description |
| --- | --- |
| [getBlockContentId()](#getBlockContentId) | Gets or sets the block content identifier. |
| [setBlockContentId(String value)](#setBlockContentId-java.lang.String) | Gets or sets the block content identifier. |
| [getBlockContentNormalDirection()](#getBlockContentNormalDirection) | Gets or sets the block content normal direction. |
| [setBlockContentNormalDirection(Cad3DPoint value)](#setBlockContentNormalDirection-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Gets or sets the block content normal direction. |
| [getBlockContentPosition()](#getBlockContentPosition) | Gets or sets the block content position. |
| [setBlockContentPosition(Cad3DPoint value)](#setBlockContentPosition-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Gets or sets the block content position. |
| [getBlockContentScale()](#getBlockContentScale) | Gets or sets the block content scale. |
| [setBlockContentScale(Cad3DPoint value)](#setBlockContentScale-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Gets or sets the block content scale. |
| [getBlockContentRotation()](#getBlockContentRotation) | Gets or sets the block content rotation. |
| [setBlockContentRotation(double value)](#setBlockContentRotation-double) | Gets or sets the block content rotation. |
| [getBlockContentColor()](#getBlockContentColor) | Gets or sets the color of the block content. |
| [setBlockContentColor(int value)](#setBlockContentColor-int) | Gets or sets the color of the block content. |
| [getBlockTransformationMatrixList()](#getBlockTransformationMatrixList) | Gets or sets the block transformation matrix list. |
| [setBlockTransformationMatrixList(List<Double> value)](#setBlockTransformationMatrixList-java.util.List) | Gets or sets the block transformation matrix list. |
| [getPlaneNormalReversed()](#getPlaneNormalReversed) | Gets or sets a value indicating whether [plane normal reversed]. |
| [setPlaneNormalReversed(boolean value)](#setPlaneNormalReversed-boolean) | Gets or sets a value indicating whether [plane normal reversed]. |
| [getPlaneYAxisDirection()](#getPlaneYAxisDirection) | Gets or sets the plane y axis direction. |
| [setPlaneYAxisDirection(Cad3DPoint value)](#setPlaneYAxisDirection-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Gets or sets the plane y axis direction. |
| [getPlaneXAxisDirection()](#getPlaneXAxisDirection) | Gets or sets the plane x axis direction. |
| [setPlaneXAxisDirection(Cad3DPoint value)](#setPlaneXAxisDirection-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Gets or sets the plane x axis direction. |
| [getPlaneOriginPoint()](#getPlaneOriginPoint) | Gets or sets a value indicating whether [plane origin point]. |
| [setPlaneOriginPoint(Cad3DPoint value)](#setPlaneOriginPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Gets or sets a value indicating whether [plane origin point]. |
| [getTextColumnFlowReversed()](#getTextColumnFlowReversed) | Gets or sets a value indicating whether [text column flow reversed]. |
| [setTextColumnFlowReversed(boolean value)](#setTextColumnFlowReversed-boolean) | Gets or sets a value indicating whether [text column flow reversed]. |
| [getTextUseWordBreak()](#getTextUseWordBreak) | Gets or sets a value indicating whether [text use word break]. |
| [setTextUseWordBreak(boolean value)](#setTextUseWordBreak-boolean) | Gets or sets a value indicating whether [text use word break]. |
| [hasBlock()](#hasBlock) | Gets or sets a value indicating whether this instance has block. |
| [setBlock(boolean value)](#setBlock-boolean) | Gets or sets a value indicating whether this instance has block. |
| [hasMText()](#hasMText) | Gets or sets whether context data has MText. |
| [setMText(boolean value)](#setMText-boolean) | Gets or sets whether context data has MText. |
| [getTextFlowDirection()](#getTextFlowDirection) | Gets or sets text flow direction |
| [setTextFlowDirection(short value)](#setTextFlowDirection-short) | Gets or sets text flow direction |
| [getTextColumnType()](#getTextColumnType) | Gets or sets text column type |
| [setTextColumnType(short value)](#setTextColumnType-short) | Gets or sets text column type |
| [getTextBackgroundColorOn()](#getTextBackgroundColorOn) | Gets or sets text background color on |
| [setTextBackgroundColorOn(boolean value)](#setTextBackgroundColorOn-boolean) | Gets or sets text background color on |
| [getTextBackgroundFillOn()](#getTextBackgroundFillOn) | Gets or sets text background fill on |
| [setTextBackgroundFillOn(boolean value)](#setTextBackgroundFillOn-boolean) | Gets or sets text background fill on |
| [getDefaultText()](#getDefaultText) | Gets or sets default text. |
| [setDefaultText(String value)](#setDefaultText-java.lang.String) | Gets or sets default text. |
| [getTextLineSpacingStyle()](#getTextLineSpacingStyle) | Gets or sets text line spacing style. |
| [setTextLineSpacingStyle(short value)](#setTextLineSpacingStyle-short) | Gets or sets text line spacing style. |
| [getTextStyleID()](#getTextStyleID) | Gets or sets text style. |
| [setTextStyleID(String value)](#setTextStyleID-java.lang.String) | Gets or sets text style. |
| [getTextWidth()](#getTextWidth) | Gets or sets width of text. |
| [setTextWidth(double value)](#setTextWidth-double) | Gets or sets width of text. |
| [getTextColumnGutterWidth()](#getTextColumnGutterWidth) | Gets or sets width of text column gutter. |
| [setTextColumnGutterWidth(double value)](#setTextColumnGutterWidth-double) | Gets or sets width of text column gutter. |
| [getTextColumnHeight()](#getTextColumnHeight) | Gets or sets text column height. |
| [setTextColumnHeight(double value)](#setTextColumnHeight-double) | Gets or sets text column height. |
| [getTextBackgroundScaleFactor()](#getTextBackgroundScaleFactor) | Gets or sets text background scale factor. |
| [setTextBackgroundScaleFactor(double value)](#setTextBackgroundScaleFactor-double) | Gets or sets text background scale factor. |
| [getTextBackgroundTransparency()](#getTextBackgroundTransparency) | Gets or sets text background transparency. |
| [setTextBackgroundTransparency(int value)](#setTextBackgroundTransparency-int) | Gets or sets text background transparency. |
| [getTextLandingGap()](#getTextLandingGap) | Gets or sets text landing gap. |
| [setTextLandingGap(double value)](#setTextLandingGap-double) | Gets or sets text landing gap. |
| [getUseTextAutoheight()](#getUseTextAutoheight) | Gets or sets using of text auto height. |
| [setUseTextAutoheight(boolean value)](#setUseTextAutoheight-boolean) | Gets or sets using of text auto height. |
| [getColumnWidth()](#getColumnWidth) | Gets or sets width of column. |
| [setColumnWidth(double value)](#setColumnWidth-double) | Gets or sets width of column. |
| [getTextLineSpacingFactor()](#getTextLineSpacingFactor) | Gets or sets line spacing factor. |
| [setTextLineSpacingFactor(double value)](#setTextLineSpacingFactor-double) | Gets or sets line spacing factor. |
| [getContentScale()](#getContentScale) | Gets or sets the content scale. |
| [setContentScale(double value)](#setContentScale-double) | Gets or sets the content scale. |
| [getTextRotation()](#getTextRotation) | Gets or sets the rotation of the text. |
| [setTextRotation(double value)](#setTextRotation-double) | Gets or sets the rotation of the text. |
| [getTextHeight()](#getTextHeight) | Gets or sets the height of text. |
| [setTextHeight(double value)](#setTextHeight-double) | Gets or sets the height of text. |
| [getArrowHeadSize()](#getArrowHeadSize) | Gets or sets size of an arrow. |
| [setArrowHeadSize(double value)](#setArrowHeadSize-double) | Gets or sets size of an arrow. |
| [getBasePoint()](#getBasePoint) | Gets or sets basepoint. |
| [setBasePoint(Cad3DPoint value)](#setBasePoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Gets or sets basepoint. |
| [getTextNormalDirection()](#getTextNormalDirection) | Gets or sets text normal direction. |
| [setTextNormalDirection(Cad3DPoint value)](#setTextNormalDirection-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Gets or sets text normal direction. |
| [getTextLocationPoint()](#getTextLocationPoint) | Gets or sets text location point. |
| [setTextLocationPoint(Cad3DPoint value)](#setTextLocationPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Gets or sets text location point. |
| [getTextDirectionPoint()](#getTextDirectionPoint) | Gets or sets text direction point. |
| [setTextDirectionPoint(Cad3DPoint value)](#setTextDirectionPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Gets or sets text direction point. |
| [getLeaderNode()](#getLeaderNode) | Gets or sets text location point. |
| [setLeaderNode(CadMLeaderNode value)](#setLeaderNode-com.aspose.cad.fileformats.cad.cadobjects.CadMLeaderNode) | Gets or sets text location point. |
| [getTextColor()](#getTextColor) | Gets or sets text color. |
| [setTextColor(int value)](#setTextColor-int) | Gets or sets text color. |
| [getTextBackgroundColor()](#getTextBackgroundColor) | Gets or sets text background color. |
| [setTextBackgroundColor(int value)](#setTextBackgroundColor-int) | Gets or sets text background color. |
| [getTextAttachmentType()](#getTextAttachmentType) | Gets or sets text attachment style. |
| [setTextAttachmentType(short value)](#setTextAttachmentType-short) | Gets or sets text attachment style. |
| [getTextLeftAttachmentType()](#getTextLeftAttachmentType) | Gets or sets text left attachment style. |
| [setTextLeftAttachmentType(short value)](#setTextLeftAttachmentType-short) | Gets or sets text left attachment style. |
| [getTextRightAttachmentType()](#getTextRightAttachmentType) | Gets or sets right attachment type. |
| [setTextRightAttachmentType(short value)](#setTextRightAttachmentType-short) | Gets or sets right attachment type. |

### CadMLeaderContextData() {#CadMLeaderContextData}
```java
public CadMLeaderContextData()
```

Initializes a new instance of the CadMLeaderContextData class.

### getBlockContentId() {#getBlockContentId}
```java
public final String getBlockContentId()
```

Gets or sets the block content identifier.

**Returns:** String - The block content identifier.

### setBlockContentId(String value) {#setBlockContentId-java.lang.String}
```java
public final void setBlockContentId(String value)
```

Gets or sets the block content identifier.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The block content identifier. |

### getBlockContentNormalDirection() {#getBlockContentNormalDirection}
```java
public final Cad3DPoint getBlockContentNormalDirection()
```

Gets or sets the block content normal direction.

**Returns:** Cad3DPoint - The block content normal direction.

### setBlockContentNormalDirection(Cad3DPoint value) {#setBlockContentNormalDirection-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public final void setBlockContentNormalDirection(Cad3DPoint value)
```

Gets or sets the block content normal direction.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Cad3DPoint | The block content normal direction. |

### getBlockContentPosition() {#getBlockContentPosition}
```java
public final Cad3DPoint getBlockContentPosition()
```

Gets or sets the block content position.

**Returns:** Cad3DPoint - The block content position.

### setBlockContentPosition(Cad3DPoint value) {#setBlockContentPosition-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public final void setBlockContentPosition(Cad3DPoint value)
```

Gets or sets the block content position.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Cad3DPoint | The block content position. |

### getBlockContentScale() {#getBlockContentScale}
```java
public final Cad3DPoint getBlockContentScale()
```

Gets or sets the block content scale.

**Returns:** Cad3DPoint - The block content scale.

### setBlockContentScale(Cad3DPoint value) {#setBlockContentScale-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public final void setBlockContentScale(Cad3DPoint value)
```

Gets or sets the block content scale.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Cad3DPoint | The block content scale. |

### getBlockContentRotation() {#getBlockContentRotation}
```java
public final double getBlockContentRotation()
```

Gets or sets the block content rotation.

**Returns:** double - The block content rotation.

### setBlockContentRotation(double value) {#setBlockContentRotation-double}
```java
public final void setBlockContentRotation(double value)
```

Gets or sets the block content rotation.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The block content rotation. |

### getBlockContentColor() {#getBlockContentColor}
```java
public final int getBlockContentColor()
```

Gets or sets the color of the block content.

**Returns:** int - The color of the block content.

### setBlockContentColor(int value) {#setBlockContentColor-int}
```java
public final void setBlockContentColor(int value)
```

Gets or sets the color of the block content.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The color of the block content. |

### getBlockTransformationMatrixList() {#getBlockTransformationMatrixList}
```java
public final List<Double> getBlockTransformationMatrixList()
```

Gets or sets the block transformation matrix list.

**Returns:** List<Double> - The block transformation matrix list.

### setBlockTransformationMatrixList(List<Double> value) {#setBlockTransformationMatrixList-java.util.List}
```java
public final void setBlockTransformationMatrixList(List<Double> value)
```

Gets or sets the block transformation matrix list.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | List<Double> | The block transformation matrix list. |

### getPlaneNormalReversed() {#getPlaneNormalReversed}
```java
public final boolean getPlaneNormalReversed()
```

Gets or sets a value indicating whether [plane normal reversed].

**Returns:** boolean - true if [plane normal reversed]; otherwise, false .

### setPlaneNormalReversed(boolean value) {#setPlaneNormalReversed-boolean}
```java
public final void setPlaneNormalReversed(boolean value)
```

Gets or sets a value indicating whether [plane normal reversed].

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | true if [plane normal reversed]; otherwise, false . |

### getPlaneYAxisDirection() {#getPlaneYAxisDirection}
```java
public final Cad3DPoint getPlaneYAxisDirection()
```

Gets or sets the plane y axis direction.

**Returns:** Cad3DPoint - The plane y axis direction.

### setPlaneYAxisDirection(Cad3DPoint value) {#setPlaneYAxisDirection-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public final void setPlaneYAxisDirection(Cad3DPoint value)
```

Gets or sets the plane y axis direction.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Cad3DPoint | The plane y axis direction. |

### getPlaneXAxisDirection() {#getPlaneXAxisDirection}
```java
public final Cad3DPoint getPlaneXAxisDirection()
```

Gets or sets the plane x axis direction.

**Returns:** Cad3DPoint - The plane x axis direction.

### setPlaneXAxisDirection(Cad3DPoint value) {#setPlaneXAxisDirection-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public final void setPlaneXAxisDirection(Cad3DPoint value)
```

Gets or sets the plane x axis direction.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Cad3DPoint | The plane x axis direction. |

### getPlaneOriginPoint() {#getPlaneOriginPoint}
```java
public final Cad3DPoint getPlaneOriginPoint()
```

Gets or sets a value indicating whether [plane origin point].

**Returns:** Cad3DPoint - true if [plane origin point]; otherwise, false .

### setPlaneOriginPoint(Cad3DPoint value) {#setPlaneOriginPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public final void setPlaneOriginPoint(Cad3DPoint value)
```

Gets or sets a value indicating whether [plane origin point].

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Cad3DPoint | true if [plane origin point]; otherwise, false . |

### getTextColumnFlowReversed() {#getTextColumnFlowReversed}
```java
public final boolean getTextColumnFlowReversed()
```

Gets or sets a value indicating whether [text column flow reversed].

**Returns:** boolean - true if [text column flow reversed]; otherwise, false .

### setTextColumnFlowReversed(boolean value) {#setTextColumnFlowReversed-boolean}
```java
public final void setTextColumnFlowReversed(boolean value)
```

Gets or sets a value indicating whether [text column flow reversed].

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | true if [text column flow reversed]; otherwise, false . |

### getTextUseWordBreak() {#getTextUseWordBreak}
```java
public final boolean getTextUseWordBreak()
```

Gets or sets a value indicating whether [text use word break].

**Returns:** boolean - true if [text use word break]; otherwise, false .

### setTextUseWordBreak(boolean value) {#setTextUseWordBreak-boolean}
```java
public final void setTextUseWordBreak(boolean value)
```

Gets or sets a value indicating whether [text use word break].

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | true if [text use word break]; otherwise, false . |

### hasBlock() {#hasBlock}
```java
public final boolean hasBlock()
```

Gets or sets a value indicating whether this instance has block.

**Returns:** boolean - true if this instance has block; otherwise, false .

### setBlock(boolean value) {#setBlock-boolean}
```java
public final void setBlock(boolean value)
```

Gets or sets a value indicating whether this instance has block.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | true if this instance has block; otherwise, false . |

### hasMText() {#hasMText}
```java
public final boolean hasMText()
```

Gets or sets whether context data has MText.

**Returns:** boolean - If context data has MText

### setMText(boolean value) {#setMText-boolean}
```java
public final void setMText(boolean value)
```

Gets or sets whether context data has MText.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | If context data has MText |

### getTextFlowDirection() {#getTextFlowDirection}
```java
public final short getTextFlowDirection()
```

Gets or sets text flow direction

**Returns:** short - Text flow direction

### setTextFlowDirection(short value) {#setTextFlowDirection-short}
```java
public final void setTextFlowDirection(short value)
```

Gets or sets text flow direction

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | Text flow direction |

### getTextColumnType() {#getTextColumnType}
```java
public final short getTextColumnType()
```

Gets or sets text column type

**Returns:** short - Text column type

### setTextColumnType(short value) {#setTextColumnType-short}
```java
public final void setTextColumnType(short value)
```

Gets or sets text column type

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | Text column type |

### getTextBackgroundColorOn() {#getTextBackgroundColorOn}
```java
public final boolean getTextBackgroundColorOn()
```

Gets or sets text background color on

**Returns:** boolean - Text background color on

### setTextBackgroundColorOn(boolean value) {#setTextBackgroundColorOn-boolean}
```java
public final void setTextBackgroundColorOn(boolean value)
```

Gets or sets text background color on

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | Text background color on |

### getTextBackgroundFillOn() {#getTextBackgroundFillOn}
```java
public final boolean getTextBackgroundFillOn()
```

Gets or sets text background fill on

**Returns:** boolean - Text background color on

### setTextBackgroundFillOn(boolean value) {#setTextBackgroundFillOn-boolean}
```java
public final void setTextBackgroundFillOn(boolean value)
```

Gets or sets text background fill on

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | Text background color on |

### getDefaultText() {#getDefaultText}
```java
public final String getDefaultText()
```

Gets or sets default text.

**Returns:** String - Default text.

### setDefaultText(String value) {#setDefaultText-java.lang.String}
```java
public final void setDefaultText(String value)
```

Gets or sets default text.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | Default text. |

### getTextLineSpacingStyle() {#getTextLineSpacingStyle}
```java
public final short getTextLineSpacingStyle()
```

Gets or sets text line spacing style.

**Returns:** short - Text line spacing style

### setTextLineSpacingStyle(short value) {#setTextLineSpacingStyle-short}
```java
public final void setTextLineSpacingStyle(short value)
```

Gets or sets text line spacing style.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | Text line spacing style |

### getTextStyleID() {#getTextStyleID}
```java
public final String getTextStyleID()
```

Gets or sets text style.

**Returns:** String - Text style.

### setTextStyleID(String value) {#setTextStyleID-java.lang.String}
```java
public final void setTextStyleID(String value)
```

Gets or sets text style.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | Text style. |

### getTextWidth() {#getTextWidth}
```java
public final double getTextWidth()
```

Gets or sets width of text.

**Returns:** double - The width of text.

### setTextWidth(double value) {#setTextWidth-double}
```java
public final void setTextWidth(double value)
```

Gets or sets width of text.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The width of text. |

### getTextColumnGutterWidth() {#getTextColumnGutterWidth}
```java
public final double getTextColumnGutterWidth()
```

Gets or sets width of text column gutter.

**Returns:** double - The width of text column gutter.

### setTextColumnGutterWidth(double value) {#setTextColumnGutterWidth-double}
```java
public final void setTextColumnGutterWidth(double value)
```

Gets or sets width of text column gutter.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The width of text column gutter. |

### getTextColumnHeight() {#getTextColumnHeight}
```java
public final double getTextColumnHeight()
```

Gets or sets text column height.

**Returns:** double - The height of text column

### setTextColumnHeight(double value) {#setTextColumnHeight-double}
```java
public final void setTextColumnHeight(double value)
```

Gets or sets text column height.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The height of text column |

### getTextBackgroundScaleFactor() {#getTextBackgroundScaleFactor}
```java
public final double getTextBackgroundScaleFactor()
```

Gets or sets text background scale factor.

**Returns:** double - Text background scale factor.

### setTextBackgroundScaleFactor(double value) {#setTextBackgroundScaleFactor-double}
```java
public final void setTextBackgroundScaleFactor(double value)
```

Gets or sets text background scale factor.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | Text background scale factor. |

### getTextBackgroundTransparency() {#getTextBackgroundTransparency}
```java
public final int getTextBackgroundTransparency()
```

Gets or sets text background transparency.

**Returns:** int - Text background transparency.

### setTextBackgroundTransparency(int value) {#setTextBackgroundTransparency-int}
```java
public final void setTextBackgroundTransparency(int value)
```

Gets or sets text background transparency.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | Text background transparency. |

### getTextLandingGap() {#getTextLandingGap}
```java
public final double getTextLandingGap()
```

Gets or sets text landing gap.

**Returns:** double

### setTextLandingGap(double value) {#setTextLandingGap-double}
```java
public final void setTextLandingGap(double value)
```

Gets or sets text landing gap.

### getUseTextAutoheight() {#getUseTextAutoheight}
```java
public final boolean getUseTextAutoheight()
```

Gets or sets using of text auto height.

**Returns:** boolean

### setUseTextAutoheight(boolean value) {#setUseTextAutoheight-boolean}
```java
public final void setUseTextAutoheight(boolean value)
```

Gets or sets using of text auto height.

### getColumnWidth() {#getColumnWidth}
```java
public final double getColumnWidth()
```

Gets or sets width of column.

**Returns:** double - The width of column.

### setColumnWidth(double value) {#setColumnWidth-double}
```java
public final void setColumnWidth(double value)
```

Gets or sets width of column.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The width of column. |

### getTextLineSpacingFactor() {#getTextLineSpacingFactor}
```java
public final double getTextLineSpacingFactor()
```

Gets or sets line spacing factor.

**Returns:** double - Line spacing factor.

### setTextLineSpacingFactor(double value) {#setTextLineSpacingFactor-double}
```java
public final void setTextLineSpacingFactor(double value)
```

Gets or sets line spacing factor.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | Line spacing factor. |

### getContentScale() {#getContentScale}
```java
public final double getContentScale()
```

Gets or sets the content scale.

**Returns:** double - The scale of content.

### setContentScale(double value) {#setContentScale-double}
```java
public final void setContentScale(double value)
```

Gets or sets the content scale.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The scale of content. |

### getTextRotation() {#getTextRotation}
```java
public final double getTextRotation()
```

Gets or sets the rotation of the text.

**Returns:** double - The rotation of the text.

### setTextRotation(double value) {#setTextRotation-double}
```java
public final void setTextRotation(double value)
```

Gets or sets the rotation of the text.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The rotation of the text. |

### getTextHeight() {#getTextHeight}
```java
public final double getTextHeight()
```

Gets or sets the height of text.

**Returns:** double - The height of text.

### setTextHeight(double value) {#setTextHeight-double}
```java
public final void setTextHeight(double value)
```

Gets or sets the height of text.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The height of text. |

### getArrowHeadSize() {#getArrowHeadSize}
```java
public final double getArrowHeadSize()
```

Gets or sets size of an arrow.

**Returns:** double - The arrow size.

### setArrowHeadSize(double value) {#setArrowHeadSize-double}
```java
public final void setArrowHeadSize(double value)
```

Gets or sets size of an arrow.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The arrow size. |

### getBasePoint() {#getBasePoint}
```java
public final Cad3DPoint getBasePoint()
```

Gets or sets basepoint.

**Returns:** Cad3DPoint - The base point of context data.

### setBasePoint(Cad3DPoint value) {#setBasePoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public final void setBasePoint(Cad3DPoint value)
```

Gets or sets basepoint.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Cad3DPoint | The base point of context data. |

### getTextNormalDirection() {#getTextNormalDirection}
```java
public final Cad3DPoint getTextNormalDirection()
```

Gets or sets text normal direction.

**Returns:** Cad3DPoint - The text normal direction point of context data.

### setTextNormalDirection(Cad3DPoint value) {#setTextNormalDirection-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public final void setTextNormalDirection(Cad3DPoint value)
```

Gets or sets text normal direction.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Cad3DPoint | The text normal direction point of context data. |

### getTextLocationPoint() {#getTextLocationPoint}
```java
public final Cad3DPoint getTextLocationPoint()
```

Gets or sets text location point.

**Returns:** Cad3DPoint - The text location point of context data.

### setTextLocationPoint(Cad3DPoint value) {#setTextLocationPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public final void setTextLocationPoint(Cad3DPoint value)
```

Gets or sets text location point.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Cad3DPoint | The text location point of context data. |

### getTextDirectionPoint() {#getTextDirectionPoint}
```java
public final Cad3DPoint getTextDirectionPoint()
```

Gets or sets text direction point.

**Returns:** Cad3DPoint - The text direction point of context data.

### setTextDirectionPoint(Cad3DPoint value) {#setTextDirectionPoint-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public final void setTextDirectionPoint(Cad3DPoint value)
```

Gets or sets text direction point.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Cad3DPoint | The text direction point of context data. |

### getLeaderNode() {#getLeaderNode}
```java
public final CadMLeaderNode getLeaderNode()
```

Gets or sets text location point.

**Returns:** CadMLeaderNode - The text location point of context data.

### setLeaderNode(CadMLeaderNode value) {#setLeaderNode-com.aspose.cad.fileformats.cad.cadobjects.CadMLeaderNode}
```java
public final void setLeaderNode(CadMLeaderNode value)
```

Gets or sets text location point.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | CadMLeaderNode | The text location point of context data. |

### getTextColor() {#getTextColor}
```java
public final int getTextColor()
```

Gets or sets text color.

**Returns:** int - Color of text.

### setTextColor(int value) {#setTextColor-int}
```java
public final void setTextColor(int value)
```

Gets or sets text color.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | Color of text. |

### getTextBackgroundColor() {#getTextBackgroundColor}
```java
public final int getTextBackgroundColor()
```

Gets or sets text background color.

**Returns:** int - Background color of text.

### setTextBackgroundColor(int value) {#setTextBackgroundColor-int}
```java
public final void setTextBackgroundColor(int value)
```

Gets or sets text background color.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | Background color of text. |

### getTextAttachmentType() {#getTextAttachmentType}
```java
public final short getTextAttachmentType()
```

Gets or sets text attachment style.

**Returns:** short

### setTextAttachmentType(short value) {#setTextAttachmentType-short}
```java
public final void setTextAttachmentType(short value)
```

Gets or sets text attachment style.

### getTextLeftAttachmentType() {#getTextLeftAttachmentType}
```java
public final short getTextLeftAttachmentType()
```

Gets or sets text left attachment style.

**Returns:** short

### setTextLeftAttachmentType(short value) {#setTextLeftAttachmentType-short}
```java
public final void setTextLeftAttachmentType(short value)
```

Gets or sets text left attachment style.

### getTextRightAttachmentType() {#getTextRightAttachmentType}
```java
public final short getTextRightAttachmentType()
```

Gets or sets right attachment type.

**Returns:** short

### setTextRightAttachmentType(short value) {#setTextRightAttachmentType-short}
```java
public final void setTextRightAttachmentType(short value)
```

Gets or sets right attachment type.

