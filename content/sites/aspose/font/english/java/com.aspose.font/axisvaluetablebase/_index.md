---
title: TtfStatTable.AxisValueTableBase
second_title: Aspose.Font for Java API Reference
description: Base class for Axis Value Table structure.
type: docs
weight: 12
url: /java/com.aspose.font/ttfstattable.axisvaluetablebase/
---
**Inheritance:**
java.lang.Object
```
public abstract static class TtfStatTable.AxisValueTableBase
```

Base class for Axis Value Table structure. Spec: Axis Value Tables provide details regarding a specific style-attribute value on some specific axis of design variation, or a combination of design-variation axis values, and the relationship of those values to labels used as elements in subfamily names.
## Methods

| Method | Description |
| --- | --- |
| [getFormat()](#getFormat--) | Gets format identifier (version number). |
| [getFlags()](#getFlags--) | Gets axis value table flags field. |
| [getValueNameId()](#getValueNameId--) | Gets the name ID for entries in the 'name' table that provide a display string for this attribute value. |
| [getValueName()](#getValueName--) | Gets the name from the 'name' table that provide a display string for this attribute value. |
### getFormat() {#getFormat--}
```
public int getFormat()
```


Gets format identifier (version number).

**Returns:**
int - The format identifier (version number).
### getFlags() {#getFlags--}
```
public int getFlags()
```


Gets axis value table flags field.

**Returns:**
int - The axis value table flags field.
### getValueNameId() {#getValueNameId--}
```
public int getValueNameId()
```


Gets the name ID for entries in the 'name' table that provide a display string for this attribute value.

**Returns:**
int - The name ID for entries in the 'name' table that provide a display string for this attribute value.
### getValueName() {#getValueName--}
```
public String getValueName()
```


Gets the name from the 'name' table that provide a display string for this attribute value.

**Returns:**
java.lang.String - The name from the 'name' table that provide a display string for this attribute value.
