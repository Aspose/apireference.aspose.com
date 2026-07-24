---
title: "الفئة System::Xml::Schema::XmlSchemaAnnotated"
linktitle: "XmlSchemaAnnotated"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Xml::Schema::XmlSchemaAnnotated. الفئة الأساسية لأي عنصر يمكنه احتواء عناصر annotation في C++."
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
| [get_Annotation](./get_annotation/)() | يعيد الخاصية **annotation**. |
| [get_Id](./get_id/)() | يعيد معرف السلسلة. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | يعيد السمات المؤهلة التي لا تنتمي إلى مساحة الاسم الهدف للمخطط الحالي. |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | يضبط الخاصية **annotation**. |
| [set_Id](./set_id/)(const String\&) | يضبط معرف السلسلة. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | يضبط السمات المؤهلة التي لا تنتمي إلى مساحة الاسم الهدف للمخطط الحالي. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
