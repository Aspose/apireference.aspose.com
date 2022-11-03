---
title: TtfHmtxTable
second_title: Aspose.Font for Java API Reference
description: Represents hmtx table of the TTF Font file.
type: docs
weight: 80
url: /java/com.aspose.font/ttfhmtxtable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfHmtxTable extends TtfTableBase
```

Represents "hmtx" table of the TTF Font file.
## Methods

| Method | Description |
| --- | --- |
| [getTag()](#getTag--) | Gets table tag. |
| [getHMetrics()](#getHMetrics--) | Gets horizontal metrics. |
| [getLeftSidebearings()](#getLeftSidebearings--) | Gets left side bearings. |
| [getAdditionalAdvanceWidth()](#getAdditionalAdvanceWidth--) | In hmtx table could be the cases when total number of glyphs is not equal to hhea.numberOfHMetrics. |
### getTag() {#getTag--}
```
public static String getTag()
```


Gets table tag.

**Returns:**
java.lang.String - Table tag.
### getHMetrics() {#getHMetrics--}
```
public TtfHmtxTable.MetricList getHMetrics()
```


Gets horizontal metrics.

**Returns:**
[MetricList](../../com.aspose.font/metriclist) - Horizontal metrics.
### getLeftSidebearings() {#getLeftSidebearings--}
```
public short[] getLeftSidebearings()
```


Gets left side bearings.

**Returns:**
short[] - Left side bearings.
### getAdditionalAdvanceWidth() {#getAdditionalAdvanceWidth--}
```
public int getAdditionalAdvanceWidth()
```


In hmtx table could be the cases when total number of glyphs is not equal to hhea.numberOfHMetrics. For these cases hmtx table contains additional array 'leftSideBearing' which is correspondent to property  LeftSidebearings . But glyphs with indexes from hhea.numOfLongHorMetrics to maxp.numGlyphs also have widths. And these widths in accordance to specification for hmtx table have such values: "Here the advanceWidth is assumed to be the same as the advanceWidth for the last entry above".

**Returns:**
int - Additional advance width.
