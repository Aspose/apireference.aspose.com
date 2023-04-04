---
title: TtfVheaTable
second_title: Aspose.Font for Java API Reference
description: Represents hhea table of the TTF Font file.
type: docs
weight: 90
url: /java/com.aspose.font/ttfvheatable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfVheaTable extends TtfTableBase
```

Represents "hhea" table of the TTF Font file.
## Methods

| Method | Description |
| --- | --- |
| [getTag()](#getTag--) | Gets table tag. |
| [getVersion()](#getVersion--) | Gets Version number of the vertical header table. |
| [getAscent()](#getAscent--) | Gets Ascent. |
| [getDescent()](#getDescent--) | Gets Descent. |
| [getLineGap()](#getLineGap--) | Gets LineGap. |
| [getAdvanceHeightMax()](#getAdvanceHeightMax--) | Gets AdvanceHeightMax. |
| [getMinTopSideBearing()](#getMinTopSideBearing--) | Gets MinTopSideBearing. |
| [getMinBottomSideBearing()](#getMinBottomSideBearing--) | Gets MinBottomSideBearing. |
| [getYMaxExtent()](#getYMaxExtent--) | Gets yMaxExtent. |
| [getCaretSlopeRise()](#getCaretSlopeRise--) | Gets CaretSlopeRise. |
| [getCaretSlopeRun()](#getCaretSlopeRun--) | Gets CaretSlopeRun. |
| [getCaretOffset()](#getCaretOffset--) | Gets CaretOffset. |
| [getMetricDataFormat()](#getMetricDataFormat--) | Gets MetricDataFormat. |
| [getNumOfLongVerMetrics()](#getNumOfLongVerMetrics--) | Gets MetricDataFormat. |
### getTag() {#getTag--}
```
public static String getTag()
```


Gets table tag.

**Returns:**
java.lang.String - The tag.
### getVersion() {#getVersion--}
```
public Version16Dot16 getVersion()
```


Gets Version number of the vertical header table.

**Returns:**
[Version16Dot16](../../com.aspose.font/version16dot16) - The Version number of the vertical header table.
### getAscent() {#getAscent--}
```
public short getAscent()
```


Gets Ascent. Distance in FUnits from the centerline to the previous line\\u0432\\u0402\\u2122s descent.

**Returns:**
short - The Ascent.
### getDescent() {#getDescent--}
```
public short getDescent()
```


Gets Descent. Distance in FUnits from the centerline to the next line\\u0432\\u0402\\u2122s ascent.

**Returns:**
short - The Descent.
### getLineGap() {#getLineGap--}
```
public short getLineGap()
```


Gets LineGap. The vertical typographic gap for this font.

**Returns:**
short - The LineGap.
### getAdvanceHeightMax() {#getAdvanceHeightMax--}
```
public short getAdvanceHeightMax()
```


Gets AdvanceHeightMax. The maximum advance height measurement in FUnits found in the font.

**Returns:**
short - The AdvanceHeightMax.
### getMinTopSideBearing() {#getMinTopSideBearing--}
```
public short getMinTopSideBearing()
```


Gets MinTopSideBearing. The minimum top sidebearing measurement found in the font, in FUnits.

**Returns:**
short - The MinTopSideBearing.
### getMinBottomSideBearing() {#getMinBottomSideBearing--}
```
public short getMinBottomSideBearing()
```


Gets MinBottomSideBearing. The minimum bottom sidebearing measurement found in the font, in FUnits.

**Returns:**
short - The MinBottomSideBearing.
### getYMaxExtent() {#getYMaxExtent--}
```
public short getYMaxExtent()
```


Gets yMaxExtent.

**Returns:**
short - The yMaxExtent.
### getCaretSlopeRise() {#getCaretSlopeRise--}
```
public short getCaretSlopeRise()
```


Gets CaretSlopeRise.

**Returns:**
short - The CaretSlopeRise.
### getCaretSlopeRun() {#getCaretSlopeRun--}
```
public short getCaretSlopeRun()
```


Gets CaretSlopeRun.

**Returns:**
short - The CaretSlopeRun.
### getCaretOffset() {#getCaretOffset--}
```
public short getCaretOffset()
```


Gets CaretOffset.

**Returns:**
short - The CaretOffset.
### getMetricDataFormat() {#getMetricDataFormat--}
```
public short getMetricDataFormat()
```


Gets MetricDataFormat.

**Returns:**
short - The MetricDataFormat.
### getNumOfLongVerMetrics() {#getNumOfLongVerMetrics--}
```
public int getNumOfLongVerMetrics()
```


Gets MetricDataFormat. Number of advance heights in the vertical metrics table.

**Returns:**
int - The MetricDataFormat.
