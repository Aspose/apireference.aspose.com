---
title: "CadMLeader"
linktitle: "CadMLeader"
second_title: "Aspose.CAD for Java"
description: "Class describing Cad multileader"
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.cad.cadobjects/cadmleader/
---

**Inheritance:** java.lang.Object, CadBaseEntity

Class describing Cad multileader

## Constructors

| Constructor | Description |
| --- | --- |
| [CadMLeader()](#CadMLeader) | Initializes a new instance of the CadMLeader class. |

## Methods

| Method | Description |
| --- | --- |
| [getTypeName()](#getTypeName) | Gets the name of the type. |
| [getBlocks()](#getBlocks) | Gets or sets the blocks. |
| [setBlocks(List<CadMLeaderBlock> value)](#setBlocks-java.util.List) | Gets or sets the blocks. |
| [getBlockContentScale()](#getBlockContentScale) | Gets or sets the block content scale. |
| [setBlockContentScale(Cad3DPoint value)](#setBlockContentScale-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Gets or sets the block content scale. |
| [getTextDirectionNegative()](#getTextDirectionNegative) | Gets or sets a value indicating whether [text direction negative]. |
| [setTextDirectionNegative(boolean value)](#setTextDirectionNegative-boolean) | Gets or sets a value indicating whether [text direction negative]. |
| [getTextAlignInIpe()](#getTextAlignInIpe) | Gets or sets the text align in ipe. |
| [setTextAlignInIpe(short value)](#setTextAlignInIpe-short) | Gets or sets the text align in ipe. |
| [getTextAttachmentPoint()](#getTextAttachmentPoint) | Gets or sets the text attachment point. |
| [setTextAttachmentPoint(short value)](#setTextAttachmentPoint-short) | Gets or sets the text attachment point. |
| [getTextAttachmentDirection()](#getTextAttachmentDirection) | Gets or sets the text attachment direction. |
| [setTextAttachmentDirection(short value)](#setTextAttachmentDirection-short) | Gets or sets the text attachment direction. |
| [getBottomTextAttachmentDirection()](#getBottomTextAttachmentDirection) | Gets or sets the bottom text attachment direction. |
| [setBottomTextAttachmentDirection(short value)](#setBottomTextAttachmentDirection-short) | Gets or sets the bottom text attachment direction. |
| [getTopTextAttachmentDirection()](#getTopTextAttachmentDirection) | Gets or sets the top text attachment direction. |
| [setTopTextAttachmentDirection(short value)](#setTopTextAttachmentDirection-short) | Gets or sets the top text attachment direction. |
| [getBlockContentRotation()](#getBlockContentRotation) | Gets or sets the block content rotation. |
| [setBlockContentRotation(double value)](#setBlockContentRotation-double) | Gets or sets the block content rotation. |
| [getBlockContentConnectionType()](#getBlockContentConnectionType) | Gets or sets the type of the block content connection. |
| [setBlockContentConnectionType(short value)](#setBlockContentConnectionType-short) | Gets or sets the type of the block content connection. |
| [getEnableAnnotationScale()](#getEnableAnnotationScale) | Gets or sets a value indicating whether [enable annotation scale]. |
| [setEnableAnnotationScale(boolean value)](#setEnableAnnotationScale-boolean) | Gets or sets a value indicating whether [enable annotation scale]. |
| [getArrowheadIndex()](#getArrowheadIndex) | Gets or sets the index of the arrowhead. |
| [setArrowheadIndex(int value)](#setArrowheadIndex-int) | Gets or sets the index of the arrowhead. |
| [getArrowHeadId2()](#getArrowHeadId2) | Gets or sets the arrow head id2. |
| [setArrowHeadId2(String value)](#setArrowHeadId2-java.lang.String) | Gets or sets the arrow head id2. |
| [getContentType()](#getContentType) | Gets or sets the type of the content. |
| [setContentType(short value)](#setContentType-short) | Gets or sets the type of the content. |
| [getTextStyleId()](#getTextStyleId) | Gets or sets the text style identifier. |
| [setTextStyleId(String value)](#setTextStyleId-java.lang.String) | Gets or sets the text style identifier. |
| [getTextLeftAttachmentType()](#getTextLeftAttachmentType) | Gets or sets the type of the text left attachment. |
| [setTextLeftAttachmentType(short value)](#setTextLeftAttachmentType-short) | Gets or sets the type of the text left attachment. |
| [getTextRightAttachmentType()](#getTextRightAttachmentType) | Gets or sets the type of the text right attachment. |
| [setTextRightAttachmentType(int value)](#setTextRightAttachmentType-int) | Gets or sets the type of the text right attachment. |
| [getTextAngleType()](#getTextAngleType) | Gets or sets the type of the text angle. |
| [setTextAngleType(short value)](#setTextAngleType-short) | Gets or sets the type of the text angle. |
| [getTextAlignmentType()](#getTextAlignmentType) | Gets or sets the type of the text alignment. |
| [setTextAlignmentType(short value)](#setTextAlignmentType-short) | Gets or sets the type of the text alignment. |
| [getTextColor()](#getTextColor) | Gets or sets the color of the text. |
| [setTextColor(int value)](#setTextColor-int) | Gets or sets the color of the text. |
| [getEnableFrameText()](#getEnableFrameText) | Gets or sets a value indicating whether [enable frame text]. |
| [setEnableFrameText(boolean value)](#setEnableFrameText-boolean) | Gets or sets a value indicating whether [enable frame text]. |
| [getBlockContentId()](#getBlockContentId) | Gets or sets the block content identifier. |
| [setBlockContentId(String value)](#setBlockContentId-java.lang.String) | Gets or sets the block content identifier. |
| [getPropertyOverrideFlag()](#getPropertyOverrideFlag) | Gets or sets the property override flag. |
| [setPropertyOverrideFlag(int value)](#setPropertyOverrideFlag-int) | Gets or sets the property override flag. |
| [getLeaderLineTypeID()](#getLeaderLineTypeID) | Gets or sets the leader line type identifier. |
| [setLeaderLineTypeID(String value)](#setLeaderLineTypeID-java.lang.String) | Gets or sets the leader line type identifier. |
| [getLeaderLineWeight()](#getLeaderLineWeight) | Gets or sets the leader line weight. |
| [setLeaderLineWeight(short value)](#setLeaderLineWeight-short) | Gets or sets the leader line weight. |
| [getEnableLanding()](#getEnableLanding) | Gets or sets a value indicating whether [enable landing]. |
| [setEnableLanding(boolean value)](#setEnableLanding-boolean) | Gets or sets a value indicating whether [enable landing]. |
| [getEnableDogleg()](#getEnableDogleg) | Gets or sets a value indicating whether [enable dogleg]. |
| [setEnableDogleg(boolean value)](#setEnableDogleg-boolean) | Gets or sets a value indicating whether [enable dogleg]. |
| [getDoglegLength()](#getDoglegLength) | Gets or sets the length of the dogleg. |
| [setDoglegLength(double value)](#setDoglegLength-double) | Gets or sets the length of the dogleg. |
| [getArrowheadSize()](#getArrowheadSize) | Gets or sets the size of the arrowhead. |
| [setArrowheadSize(double value)](#setArrowheadSize-double) | Gets or sets the size of the arrowhead. |
| [getStyleDescription()](#getStyleDescription) | Gets or sets the style type. |
| [setStyleDescription(String value)](#setStyleDescription-java.lang.String) | Gets or sets the style type. |
| [getLeaderStyleId()](#getLeaderStyleId) | Gets or sets leader style Id |
| [setLeaderStyleId(String value)](#setLeaderStyleId-java.lang.String) | Gets or sets leader style Id |
| [getContextData()](#getContextData) | Gets or sets the context data |
| [setContextData(CadMLeaderContextData value)](#setContextData-com.aspose.cad.fileformats.cad.cadobjects.CadMLeaderContextData) | Gets or sets the context data |
| [getArrowHeadId1()](#getArrowHeadId1) | Gets or sets arrow head ID. |
| [setArrowHeadId1(String value)](#setArrowHeadId1-java.lang.String) | Gets or sets arrow head ID. |
| [getLeaderType()](#getLeaderType) | Gets or sets the type. |
| [setLeaderType(short value)](#setLeaderType-short) | Gets or sets the type. |
| [getBlockContentColor()](#getBlockContentColor) | Gets or sets the color of text. |
| [setBlockContentColor(int value)](#setBlockContentColor-int) | Gets or sets the color of text. |
| [getLeaderLineColor()](#getLeaderLineColor) | Gets or sets the color of text. |
| [setLeaderLineColor(int value)](#setLeaderLineColor-int) | Gets or sets the color of text. |
| [getTextHeight()](#getTextHeight) | Gets or sets height of text. |
| [setTextHeight(double value)](#setTextHeight-double) | Gets or sets height of text. |

### CadMLeader() {#CadMLeader}
```java
public CadMLeader()
```

Initializes a new instance of the CadMLeader class.

### getTypeName() {#getTypeName}
```java
public int getTypeName()
```

Gets the name of the type.

**Returns:** int - The name of the type.

### getBlocks() {#getBlocks}
```java
public final List<CadMLeaderBlock> getBlocks()
```

Gets or sets the blocks.

**Returns:** List<CadMLeaderBlock> - The blocks.

### setBlocks(List<CadMLeaderBlock> value) {#setBlocks-java.util.List}
```java
public final void setBlocks(List<CadMLeaderBlock> value)
```

Gets or sets the blocks.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | List<CadMLeaderBlock> | The blocks. |

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

### getTextDirectionNegative() {#getTextDirectionNegative}
```java
public final boolean getTextDirectionNegative()
```

Gets or sets a value indicating whether [text direction negative].

**Returns:** boolean - true if [text direction negative]; otherwise, false .

### setTextDirectionNegative(boolean value) {#setTextDirectionNegative-boolean}
```java
public final void setTextDirectionNegative(boolean value)
```

Gets or sets a value indicating whether [text direction negative].

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | true if [text direction negative]; otherwise, false . |

### getTextAlignInIpe() {#getTextAlignInIpe}
```java
public final short getTextAlignInIpe()
```

Gets or sets the text align in ipe.

**Returns:** short - The text align in ipe.

### setTextAlignInIpe(short value) {#setTextAlignInIpe-short}
```java
public final void setTextAlignInIpe(short value)
```

Gets or sets the text align in ipe.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The text align in ipe. |

### getTextAttachmentPoint() {#getTextAttachmentPoint}
```java
public final short getTextAttachmentPoint()
```

Gets or sets the text attachment point.

**Returns:** short - The text attachment point.

### setTextAttachmentPoint(short value) {#setTextAttachmentPoint-short}
```java
public final void setTextAttachmentPoint(short value)
```

Gets or sets the text attachment point.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The text attachment point. |

### getTextAttachmentDirection() {#getTextAttachmentDirection}
```java
public final short getTextAttachmentDirection()
```

Gets or sets the text attachment direction.

**Returns:** short - The text attachment direction.

### setTextAttachmentDirection(short value) {#setTextAttachmentDirection-short}
```java
public final void setTextAttachmentDirection(short value)
```

Gets or sets the text attachment direction.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The text attachment direction. |

### getBottomTextAttachmentDirection() {#getBottomTextAttachmentDirection}
```java
public final short getBottomTextAttachmentDirection()
```

Gets or sets the bottom text attachment direction.

**Returns:** short - The bottom text attachment direction.

### setBottomTextAttachmentDirection(short value) {#setBottomTextAttachmentDirection-short}
```java
public final void setBottomTextAttachmentDirection(short value)
```

Gets or sets the bottom text attachment direction.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The bottom text attachment direction. |

### getTopTextAttachmentDirection() {#getTopTextAttachmentDirection}
```java
public final short getTopTextAttachmentDirection()
```

Gets or sets the top text attachment direction.

**Returns:** short - The top text attachment direction.

### setTopTextAttachmentDirection(short value) {#setTopTextAttachmentDirection-short}
```java
public final void setTopTextAttachmentDirection(short value)
```

Gets or sets the top text attachment direction.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The top text attachment direction. |

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

### getBlockContentConnectionType() {#getBlockContentConnectionType}
```java
public final short getBlockContentConnectionType()
```

Gets or sets the type of the block content connection.

**Returns:** short - The type of the block content connection.

### setBlockContentConnectionType(short value) {#setBlockContentConnectionType-short}
```java
public final void setBlockContentConnectionType(short value)
```

Gets or sets the type of the block content connection.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The type of the block content connection. |

### getEnableAnnotationScale() {#getEnableAnnotationScale}
```java
public final boolean getEnableAnnotationScale()
```

Gets or sets a value indicating whether [enable annotation scale].

**Returns:** boolean - true if [enable annotation scale]; otherwise, false .

### setEnableAnnotationScale(boolean value) {#setEnableAnnotationScale-boolean}
```java
public final void setEnableAnnotationScale(boolean value)
```

Gets or sets a value indicating whether [enable annotation scale].

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | true if [enable annotation scale]; otherwise, false . |

### getArrowheadIndex() {#getArrowheadIndex}
```java
public final int getArrowheadIndex()
```

Gets or sets the index of the arrowhead.

**Returns:** int - The index of the arrowhead.

### setArrowheadIndex(int value) {#setArrowheadIndex-int}
```java
public final void setArrowheadIndex(int value)
```

Gets or sets the index of the arrowhead.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The index of the arrowhead. |

### getArrowHeadId2() {#getArrowHeadId2}
```java
public final String getArrowHeadId2()
```

Gets or sets the arrow head id2.

**Returns:** String - The arrow head id2.

### setArrowHeadId2(String value) {#setArrowHeadId2-java.lang.String}
```java
public final void setArrowHeadId2(String value)
```

Gets or sets the arrow head id2.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The arrow head id2. |

### getContentType() {#getContentType}
```java
public final short getContentType()
```

Gets or sets the type of the content.

**Returns:** short - The type of the content.

### setContentType(short value) {#setContentType-short}
```java
public final void setContentType(short value)
```

Gets or sets the type of the content.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The type of the content. |

### getTextStyleId() {#getTextStyleId}
```java
public final String getTextStyleId()
```

Gets or sets the text style identifier.

**Returns:** String - The text style identifier.

### setTextStyleId(String value) {#setTextStyleId-java.lang.String}
```java
public final void setTextStyleId(String value)
```

Gets or sets the text style identifier.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The text style identifier. |

### getTextLeftAttachmentType() {#getTextLeftAttachmentType}
```java
public final short getTextLeftAttachmentType()
```

Gets or sets the type of the text left attachment.

**Returns:** short - The type of the text left attachment.

### setTextLeftAttachmentType(short value) {#setTextLeftAttachmentType-short}
```java
public final void setTextLeftAttachmentType(short value)
```

Gets or sets the type of the text left attachment.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The type of the text left attachment. |

### getTextRightAttachmentType() {#getTextRightAttachmentType}
```java
public final int getTextRightAttachmentType()
```

Gets or sets the type of the text right attachment.

**Returns:** int - The type of the text right attachment.

### setTextRightAttachmentType(int value) {#setTextRightAttachmentType-int}
```java
public final void setTextRightAttachmentType(int value)
```

Gets or sets the type of the text right attachment.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The type of the text right attachment. |

### getTextAngleType() {#getTextAngleType}
```java
public final short getTextAngleType()
```

Gets or sets the type of the text angle.

**Returns:** short - The type of the text angle.

### setTextAngleType(short value) {#setTextAngleType-short}
```java
public final void setTextAngleType(short value)
```

Gets or sets the type of the text angle.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The type of the text angle. |

### getTextAlignmentType() {#getTextAlignmentType}
```java
public final short getTextAlignmentType()
```

Gets or sets the type of the text alignment.

**Returns:** short - The type of the text alignment.

### setTextAlignmentType(short value) {#setTextAlignmentType-short}
```java
public final void setTextAlignmentType(short value)
```

Gets or sets the type of the text alignment.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The type of the text alignment. |

### getTextColor() {#getTextColor}
```java
public final int getTextColor()
```

Gets or sets the color of the text.

**Returns:** int - The color of the text.

### setTextColor(int value) {#setTextColor-int}
```java
public final void setTextColor(int value)
```

Gets or sets the color of the text.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The color of the text. |

### getEnableFrameText() {#getEnableFrameText}
```java
public final boolean getEnableFrameText()
```

Gets or sets a value indicating whether [enable frame text].

**Returns:** boolean - true if [enable frame text]; otherwise, false .

### setEnableFrameText(boolean value) {#setEnableFrameText-boolean}
```java
public final void setEnableFrameText(boolean value)
```

Gets or sets a value indicating whether [enable frame text].

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | true if [enable frame text]; otherwise, false . |

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

### getPropertyOverrideFlag() {#getPropertyOverrideFlag}
```java
public final int getPropertyOverrideFlag()
```

Gets or sets the property override flag.

**Returns:** int - The property override flag.

### setPropertyOverrideFlag(int value) {#setPropertyOverrideFlag-int}
```java
public final void setPropertyOverrideFlag(int value)
```

Gets or sets the property override flag.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The property override flag. |

### getLeaderLineTypeID() {#getLeaderLineTypeID}
```java
public final String getLeaderLineTypeID()
```

Gets or sets the leader line type identifier.

**Returns:** String - The leader line type identifier.

### setLeaderLineTypeID(String value) {#setLeaderLineTypeID-java.lang.String}
```java
public final void setLeaderLineTypeID(String value)
```

Gets or sets the leader line type identifier.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The leader line type identifier. |

### getLeaderLineWeight() {#getLeaderLineWeight}
```java
public final short getLeaderLineWeight()
```

Gets or sets the leader line weight.

**Returns:** short - The leader line weight.

### setLeaderLineWeight(short value) {#setLeaderLineWeight-short}
```java
public final void setLeaderLineWeight(short value)
```

Gets or sets the leader line weight.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The leader line weight. |

### getEnableLanding() {#getEnableLanding}
```java
public final boolean getEnableLanding()
```

Gets or sets a value indicating whether [enable landing].

**Returns:** boolean - true if [enable landing]; otherwise, false .

### setEnableLanding(boolean value) {#setEnableLanding-boolean}
```java
public final void setEnableLanding(boolean value)
```

Gets or sets a value indicating whether [enable landing].

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | true if [enable landing]; otherwise, false . |

### getEnableDogleg() {#getEnableDogleg}
```java
public final boolean getEnableDogleg()
```

Gets or sets a value indicating whether [enable dogleg].

**Returns:** boolean - true if [enable dogleg]; otherwise, false .

### setEnableDogleg(boolean value) {#setEnableDogleg-boolean}
```java
public final void setEnableDogleg(boolean value)
```

Gets or sets a value indicating whether [enable dogleg].

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | true if [enable dogleg]; otherwise, false . |

### getDoglegLength() {#getDoglegLength}
```java
public final double getDoglegLength()
```

Gets or sets the length of the dogleg.

**Returns:** double - The length of the dogleg.

### setDoglegLength(double value) {#setDoglegLength-double}
```java
public final void setDoglegLength(double value)
```

Gets or sets the length of the dogleg.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The length of the dogleg. |

### getArrowheadSize() {#getArrowheadSize}
```java
public final double getArrowheadSize()
```

Gets or sets the size of the arrowhead.

**Returns:** double - The size of the arrowhead.

### setArrowheadSize(double value) {#setArrowheadSize-double}
```java
public final void setArrowheadSize(double value)
```

Gets or sets the size of the arrowhead.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The size of the arrowhead. |

### getStyleDescription() {#getStyleDescription}
```java
public final String getStyleDescription()
```

Gets or sets the style type.

**Returns:** String

### setStyleDescription(String value) {#setStyleDescription-java.lang.String}
```java
public final void setStyleDescription(String value)
```

Gets or sets the style type.

### getLeaderStyleId() {#getLeaderStyleId}
```java
public final String getLeaderStyleId()
```

Gets or sets leader style Id

**Returns:** String

### setLeaderStyleId(String value) {#setLeaderStyleId-java.lang.String}
```java
public final void setLeaderStyleId(String value)
```

Gets or sets leader style Id

### getContextData() {#getContextData}
```java
public final CadMLeaderContextData getContextData()
```

Gets or sets the context data

**Returns:** CadMLeaderContextData

### setContextData(CadMLeaderContextData value) {#setContextData-com.aspose.cad.fileformats.cad.cadobjects.CadMLeaderContextData}
```java
public final void setContextData(CadMLeaderContextData value)
```

Gets or sets the context data

### getArrowHeadId1() {#getArrowHeadId1}
```java
public final String getArrowHeadId1()
```

Gets or sets arrow head ID.

**Returns:** String

### setArrowHeadId1(String value) {#setArrowHeadId1-java.lang.String}
```java
public final void setArrowHeadId1(String value)
```

Gets or sets arrow head ID.

### getLeaderType() {#getLeaderType}
```java
public final short getLeaderType()
```

Gets or sets the type.

**Returns:** short

### setLeaderType(short value) {#setLeaderType-short}
```java
public final void setLeaderType(short value)
```

Gets or sets the type.

### getBlockContentColor() {#getBlockContentColor}
```java
public final int getBlockContentColor()
```

Gets or sets the color of text.

**Returns:** int

### setBlockContentColor(int value) {#setBlockContentColor-int}
```java
public final void setBlockContentColor(int value)
```

Gets or sets the color of text.

### getLeaderLineColor() {#getLeaderLineColor}
```java
public final int getLeaderLineColor()
```

Gets or sets the color of text.

**Returns:** int

### setLeaderLineColor(int value) {#setLeaderLineColor-int}
```java
public final void setLeaderLineColor(int value)
```

Gets or sets the color of text.

### getTextHeight() {#getTextHeight}
```java
public final double getTextHeight()
```

Gets or sets height of text.

**Returns:** double

### setTextHeight(double value) {#setTextHeight-double}
```java
public final void setTextHeight(double value)
```

Gets or sets height of text.

