---
title: TtfStatTable.AxisValueTableFlags
second_title: Aspose.Font for Java API Reference
description: Specifies axis value table flags
type: docs
weight: 17
url: /java/com.aspose.font/ttfstattable.axisvaluetableflags/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum TtfStatTable.AxisValueTableFlags extends Enum<TtfStatTable.AxisValueTableFlags>
```

Specifies axis value table flags
## Fields

| Field | Description |
| --- | --- |
| [OlderSiblingFontAttribute](#OlderSiblingFontAttribute) | If set, this axis value table provides axis value information that is applicable to other fonts within the same font family. |
| [ElidableAxisValueName](#ElidableAxisValueName) | If set, it indicates that the axis value represents the "normal" value for the axis and may be omitted when composing name strings. |
| [Reserved](#Reserved) | Reserved for future use |
## Methods

| Method | Description |
| --- | --- |
| [values()](#values--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
### OlderSiblingFontAttribute {#OlderSiblingFontAttribute}
```
public static final TtfStatTable.AxisValueTableFlags OlderSiblingFontAttribute
```


If set, this axis value table provides axis value information that is applicable to other fonts within the same font family. This is used if the other fonts were released earlier and did not include information about values for some axis. If newer versions of the other fonts include the information themselves and are present, then this table is ignored.

### ElidableAxisValueName {#ElidableAxisValueName}
```
public static final TtfStatTable.AxisValueTableFlags ElidableAxisValueName
```


If set, it indicates that the axis value represents the "normal" value for the axis and may be omitted when composing name strings.

### Reserved {#Reserved}
```
public static final TtfStatTable.AxisValueTableFlags Reserved
```


Reserved for future use

### values() {#values--}
```
public static TtfStatTable.AxisValueTableFlags[] values()
```




**Returns:**
com.aspose.font.TtfStatTable.AxisValueTableFlags[]
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static TtfStatTable.AxisValueTableFlags valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[AxisValueTableFlags](../../com.aspose.font/axisvaluetableflags)
