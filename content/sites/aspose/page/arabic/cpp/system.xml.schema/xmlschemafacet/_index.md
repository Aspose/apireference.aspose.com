---
title: "System::Xml::Schema::XmlSchemaFacet الفئة"
linktitle: "XmlSchemaFacet"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Schema::XmlSchemaFacet الفئة. فئة أساسية لجميع الفواصل التي تُستخدم عندما يتم اشتقاق الأنواع البسيطة عن طريق التقييد في C++."
type: docs
weight: 2900
url: /ar/cpp/system.xml.schema/xmlschemafacet/
---
## XmlSchemaFacet class


فئة أساسية لجميع السمات التي تُستخدم عندما يتم اشتقاق الأنواع البسيطة عن طريق التقييد.

```cpp
class XmlSchemaFacet : public System::Xml::Schema::XmlSchemaAnnotated
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [get_IsFixed](./get_isfixed/)() | يرجع معلومات تشير إلى أن هذه الفاصلة ثابتة. |
| [get_Value](./get_value/)() | يرجع السمة **value** للفاصلة. |
| virtual [set_IsFixed](./set_isfixed/)(bool) | يضبط معلومات تشير إلى أن هذه الفاصلة ثابتة. |
| [set_Value](./set_value/)(const String\&) | يضبط السمة **value** للفاصلة. |
| [XmlSchemaFacet](./xmlschemafacet/)() | يُنشئ مثيلاً جديدًا للفئة [XmlSchemaFacet](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
