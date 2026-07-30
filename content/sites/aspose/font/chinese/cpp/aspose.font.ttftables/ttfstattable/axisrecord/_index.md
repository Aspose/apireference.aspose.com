---
title: "Aspose::Font::TtfTables::TtfStatTable::AxisRecord 类"
linktitle: "AxisRecord"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::TtfTables::TtfStatTable::AxisRecord 类。表示 Axis Record 结构。规范：该轴记录提供关于单个设计轴的信息（C++）。"
type: docs
weight: 1300
url: /zh/cpp/aspose.font.ttftables/ttfstattable/axisrecord/
---
## AxisRecord class


表示 Axis Record 结构。规范：该轴记录提供关于单个设计轴的信息。

```cpp
class AxisRecord : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AxisRecord](./axisrecord/)(System::String, uint16_t, uint16_t) | 构造函数。 |
| [get_AxisNameId](./get_axisnameid/)() const | 返回 axisNameID 字段。规范：axisNameID 字段提供一个名称 ID，可用于从 'name' 表获取字符串，以在应用程序用户界面中引用该轴。 |
| [get_AxisOrdering](./get_axisordering/)() const | 返回 axisOrdering 字段。规范：该值可供应用程序用于确定字形名称的主要排序，或在组合族或字形名称时对标签进行排序。 |
| [get_Tag](./get_tag/)() const | 返回标识设计变体轴的标签。规范：每个轴记录都有一个指定该轴的标签。标签值必须遵循 OpenType 设计变体轴标签注册表中描述的轴标签规则。 |
## 另见

* Class [Object](../../../system/object/)
* Class [TtfStatTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
