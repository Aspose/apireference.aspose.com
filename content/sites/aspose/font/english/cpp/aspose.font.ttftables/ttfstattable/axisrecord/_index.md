---
title: Aspose::Font::TtfTables::TtfStatTable::AxisRecord class
linktitle: AxisRecord
second_title: Aspose.Font for C++
description: 'Aspose::Font::TtfTables::TtfStatTable::AxisRecord class. Represents Axis Record structure. Spec: the axis record provides information about a single design axis in C++.'
type: docs
weight: 1300
url: /cpp/aspose.font.ttftables/ttfstattable/axisrecord/
---
## AxisRecord class


Represents Axis Record structure. Spec: the axis record provides information about a single design axis.

```cpp
class AxisRecord : public System::Object
```

## Methods

| Method | Description |
| --- | --- |
| [AxisRecord](./axisrecord/)(System::String, uint16_t, uint16_t) | Constructor. |
| [get_AxisNameId](./get_axisnameid/)() const | Returns axisNameID field. Spec: The axisNameID field provides a name ID that can be used to obtain strings from the 'name' table that can be used to refer to the axis in application user interfaces. |
| [get_AxisOrdering](./get_axisordering/)() const | Returns axisOrdering field. Spec:A value that applications can use to determine primary sorting of face names, or for ordering of labels when composing family or face names. |
| [get_Tag](./get_tag/)() const | Returns a tag identifying the axis of design variation. Spec: Each axis record has a tag designating the axis. Tag values must follow the rules for axis tags described in the OpenType Design-Variation Axis Tag Registry. |
## See Also

* Class [Object](../../../system/object/)
* Class [TtfStatTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
