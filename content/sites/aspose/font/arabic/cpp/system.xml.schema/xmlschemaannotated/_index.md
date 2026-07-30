---
title: "فئة System::Xml::Schema::XmlSchemaAnnotated"
linktitle: "XmlSchemaAnnotated"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Xml::Schema::XmlSchemaAnnotated. الفئة الأساسية لأي عنصر يمكنه احتواء عناصر التعليق التوضيحي في C++."
type: docs
weight: 600
url: /ar/cpp/system.xml.schema/xmlschemaannotated/
---
## XmlSchemaAnnotated class


الفئة الأساسية لأي عنصر يمكنه احتواء عناصر التعليق التوضيحي.

```cpp
class XmlSchemaAnnotated : public System::Xml::Schema::XmlSchemaObject
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Annotation](./get_annotation/)() | يرجع الخاصية **annotation**. |
| [get_Id](./get_id/)() | إرجاع معرف السلسلة. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | يرجع السمات المؤهلة التي لا تنتمي إلى مساحة الاسم الهدف للمخطط الحالي. |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | يضبط الخاصية **annotation**. |
| [set_Id](./set_id/)(const String\&) | يضبط معرف السلسلة. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | يضبط السمات المؤهلة التي لا تنتمي إلى مساحة الاسم الهدف للمخطط الحالي. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
