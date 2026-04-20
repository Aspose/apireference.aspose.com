---
title: "System::Xml::Schema::XmlSchemaFacet class"
linktitle: "XmlSchemaFacet"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSchemaFacet class. فئة أساسية لجميع الوجوه التي تُستخدم عندما يتم اشتقاق الأنواع البسيطة عبر القيد في C++."
type: docs
weight: 2900
url: /ar/cpp/system.xml.schema/xmlschemafacet/
---
## XmlSchemaFacet class


فئة أساسية لجميع الجوانب التي تُستخدم عندما يتم اشتقاق الأنواع البسيطة بالقيود.

```cpp
class XmlSchemaFacet : public System::Xml::Schema::XmlSchemaAnnotated
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [get_IsFixed](./get_isfixed/)() | يرجع معلومات تشير إلى أن هذا الوجه ثابت. |
| [get_Value](./get_value/)() | يرجع السمة **value** للوجه. |
| virtual [set_IsFixed](./set_isfixed/)(bool) | يضبط معلومات تشير إلى أن هذا الوجه ثابت. |
| [set_Value](./set_value/)(const String\&) | يضبط السمة **value** للوجه. |
| [XmlSchemaFacet](./xmlschemafacet/)() | يُنشئ مثيلاً جديدًا من الفئة [XmlSchemaFacet](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
