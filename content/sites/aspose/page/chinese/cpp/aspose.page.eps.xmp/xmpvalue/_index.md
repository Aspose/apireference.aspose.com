---
title: "Aspose::Page::EPS::XMP::XmpValue class"
linktitle: "XmpValue"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::EPS::XMP::XmpValue class. 表示 C++ 中的 XMP 值。"
type: docs
weight: 300
url: /zh/cpp/aspose.page.eps.xmp/xmpvalue/
---
## XmpValue class


表示 [XMP](../) 值。

```cpp
class XmpValue : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_IsArray](./get_isarray/)() | 如果 [XmpValue](./) 是数组，则返回 true。 |
| [get_IsDateTime](./get_isdatetime/)() const | 如果值是 DateTime，则返回 true。 |
| [get_IsDouble](./get_isdouble/)() const | 如果值是浮点数，则返回 true。 |
| [get_IsField](./get_isfield/)() | 如果 [XmpValue](./) 是字段，则返回 true。 |
| [get_IsInteger](./get_isinteger/)() const | 如果值是整数，则返回 true。 |
| [get_IsNamedValue](./get_isnamedvalue/)() const | 如果 [XmpValue](./) 是命名值，则返回 true。 |
| [get_IsNamedValues](./get_isnamedvalues/)() | 如果 [XmpValue](./) 表示命名值，则返回 true。 |
| [get_IsRaw](./get_israw/)() | 值不受支持/未知，并提供原始 XML 代码。 |
| [get_IsString](./get_isstring/)() | 如果值是字符串，则返回 true。 |
| [get_IsStructure](./get_isstructure/)() | 如果 [XmpValue](./) 表示结构，则返回 true。 |
| static [to_KeyValuePair](./to_keyvaluepair/)(System::SharedPtr\<XmpValue\>) | 将 [XmpValue](./) 转换为命名值。 |
| static [to_KeyValuePairArray](./to_keyvaluepairarray/)(System::SharedPtr\<XmpValue\>) | 将 XmlValue 转换为命名集合值。 |
| static [to_String](./to_string/)(System::SharedPtr\<XmpValue\>) | 将 [XmpValue](./) 转换为字符串。 |
| static [to_XmpValue](./to_xmpvalue/)(System::String) | 将字符串转换为 [XmpValue](./)。 |
| static [to_XmpValue](./to_xmpvalue/)(int32_t) | 将整数转换为 [XmpValue](./)。 |
| static [to_XmpValue](./to_xmpvalue/)(double) | 将 double 转换为 [XmpValue](./)。 |
| static [to_XmpValue](./to_xmpvalue/)(System::DateTime) | 将 DateTime 转换为 [XmpValue](./)。 |
| static [to_XmpValue](./to_xmpvalue/)(System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | 将数组转换为 [XmpValue](./)。 |
| static [to_XmpValueArray](./to_xmpvaluearray/)(System::SharedPtr\<XmpValue\>) | 将 [XmpValue](./) 转换为数组。 |
| [ToArray](./toarray/)() | 返回数组。 |
| [ToDateTime](./todatetime/)() | 转换为日期时间。 |
| [ToDictionary](./todictionary/)() | 返回包含命名值的字典。 |
| [ToDouble](./todouble/)() | 转换为 double。 |
| [ToField](./tofield/)() | 返回 [XMP](../) 值作为 [XMP](../) 字段。 |
| [ToInteger](./tointeger/)() | 转换为整数。 |
| [ToNamedValue](./tonamedvalue/)() | 返回 [XMP](../) 值作为命名值。 |
| [ToNamedValues](./tonamedvalues/)() | 返回 [XMP](../) 值作为命名值集合。 |
| [ToRaw](./toraw/)() | 未知/不受支持值的原始 XML 代码。 |
| [ToString](./tostring/)(System::SharedPtr\<System::IFormatProvider\>) | 返回字符串表示。 |
| [ToString](./tostring/)() const override | 返回 [XmpValue](./) 的字符串表示。 |
| [ToStringValue](./tostringvalue/)() | 转换为字符串。 |
| [ToStructure](./tostructure/)() | 返回 [XMP](../) 值作为结构（字段集合）。 |
| [XmpValue](./xmpvalue/)(System::String) | 字符串值的构造函数。 |
| [XmpValue](./xmpvalue/)(int32_t) | 整数值的构造函数。 |
| [XmpValue](./xmpvalue/)(double) | 浮点值的构造函数。 |
| [XmpValue](./xmpvalue/)(System::DateTime) | 日期时间值的构造函数。 |
| [XmpValue](./xmpvalue/)(System::ArrayPtr\<System::SharedPtr\<XmpValue\>\>) | 数组值的构造函数。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::EPS::XMP](../)
* Library [Aspose.Page for C++](../../)
