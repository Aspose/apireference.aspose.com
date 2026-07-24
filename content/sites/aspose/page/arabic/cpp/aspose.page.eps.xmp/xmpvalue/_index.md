---
title: "Aspose::Page::EPS::XMP::XmpValue class"
linktitle: "XmpValue"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::EPS::XMP::XmpValue class. يمثل قيمة XMP في C++."
type: docs
weight: 300
url: /ar/cpp/aspose.page.eps.xmp/xmpvalue/
---
## XmpValue class


يمثل قيمة [XMP](../).

```cpp
class XmpValue : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_IsArray](./get_isarray/)() | يرجع true إذا كان [XmpValue](./) مصفوفة. |
| [get_IsDateTime](./get_isdatetime/)() const | يرجع true إذا كانت القيمة DateTime. |
| [get_IsDouble](./get_isdouble/)() const | يرجع true إذا كانت القيمة قيمة نقطية عائمة. |
| [get_IsField](./get_isfield/)() | يرجع true إذا كان [XmpValue](./) حقلًا. |
| [get_IsInteger](./get_isinteger/)() const | يرجع true إذا كانت القيمة عددًا صحيحًا. |
| [get_IsNamedValue](./get_isnamedvalue/)() const | يرجع true إذا كان [XmpValue](./) قيمة مسماة. |
| [get_IsNamedValues](./get_isnamedvalues/)() | يرجع true إذا كان [XmpValue](./) يمثل قيمًا مسماة. |
| [get_IsRaw](./get_israw/)() | القيمة غير مدعومة/غير معروفة ويتم توفير شفرة XML الخام. |
| [get_IsString](./get_isstring/)() | يرجع true إذا كانت القيمة سلسلة. |
| [get_IsStructure](./get_isstructure/)() | يرجع true إذا كان [XmpValue](./) يمثل هيكلًا. |
| static [to_KeyValuePair](./to_keyvaluepair/)(System::SharedPtr\<XmpValue\>) | يحوّل [XmpValue](./) إلى قيمة مسماة. |
| static [to_KeyValuePairArray](./to_keyvaluepairarray/)(System::SharedPtr\<XmpValue\>) | يحوّل XmlValue إلى قيمة مجموعة مسماة. |
| static [to_String](./to_string/)(System::SharedPtr\<XmpValue\>) | يحوّل [XmpValue](./) إلى سلسلة. |
| static [to_XmpValue](./to_xmpvalue/)(System::String) | يحوِّل السلسلة إلى [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(int32_t) | يحوِّل العدد الصحيح إلى [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(double) | يحوِّل العدد العشري إلى [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(System::DateTime) | يحوِّل DateTime إلى [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | يحوِّل المصفوفة إلى [XmpValue](./). |
| static [to_XmpValueArray](./to_xmpvaluearray/)(System::SharedPtr\<XmpValue\>) | يحوِّل [XmpValue](./) إلى مصفوفة. |
| [ToArray](./toarray/)() | يرجع مصفوفة. |
| [ToDateTime](./todatetime/)() | يحوِّل إلى تاريخ ووقت. |
| [ToDictionary](./todictionary/)() | يرجع القاموس الذي يحتوي على قيم مسماة. |
| [ToDouble](./todouble/)() | يحوِّل إلى عدد عشري. |
| [ToField](./tofield/)() | يرجع قيمة [XMP](../) كحقل [XMP](../). |
| [ToInteger](./tointeger/)() | يحوِّل إلى عدد صحيح. |
| [ToNamedValue](./tonamedvalue/)() | يرجع قيمة [XMP](../) كقيمة مسماة. |
| [ToNamedValues](./tonamedvalues/)() | يرجع قيمة [XMP](../) كمجموعة قيم مسماة. |
| [ToRaw](./toraw/)() | كود XML الخام للقيم غير المعروفة/غير المدعومة. |
| [ToString](./tostring/)(System::SharedPtr\<System::IFormatProvider\>) | يرجع تمثيل النص. |
| [ToString](./tostring/)() const override | يرجع تمثيل النص لـ [XmpValue](./). |
| [ToStringValue](./tostringvalue/)() | يحوِّل إلى نص. |
| [ToStructure](./tostructure/)() | يرجع قيمة [XMP](../) كهيكل (مجموعة من الحقول). |
| [XmpValue](./xmpvalue/)(System::String) | منشئ لقيمة نصية. |
| [XmpValue](./xmpvalue/)(int32_t) | منشئ لقيمة عدد صحيح. |
| [XmpValue](./xmpvalue/)(double) | منشئ لقيمة نقطة عائمة. |
| [XmpValue](./xmpvalue/)(System::DateTime) | منشئ لقيمة تاريخ/وقت. |
| [XmpValue](./xmpvalue/)(System::ArrayPtr\<System::SharedPtr\<XmpValue\>\>) | منشئ لقيمة مصفوفة. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::EPS::XMP](../)
* Library [Aspose.Page for C++](../../)
