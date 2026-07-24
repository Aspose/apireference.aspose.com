---
title: "فئة System::Xml::XmlQualifiedName"
linktitle: "XmlQualifiedName"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Xml::XmlQualifiedName. تمثل اسمًا مؤهلاً XML في C++."
type: docs
weight: 3200
url: /ar/cpp/system.xml/xmlqualifiedname/
---
## XmlQualifiedName class


يمثل اسمًا مؤهلاً في XML.

```cpp
class XmlQualifiedName : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | يحدد ما إذا كان الكائن [XmlQualifiedName](./) المحدد يساوي كائن [XmlQualifiedName](./) الحالي. |
| [get_IsEmpty](./get_isempty/)() const | يعيد قيمة تشير إلى ما إذا كان [XmlQualifiedName](./) فارغًا. |
| [get_Name](./get_name/)() const | يعيد تمثيلًا نصيًا للاسم المؤهل لـ [XmlQualifiedName](./). |
| [get_Namespace](./get_namespace/)() const | يعيد تمثيلًا نصيًا لمساحة الاسم الخاصة بـ [XmlQualifiedName](./). |
| [GetHashCode](./gethashcode/)() const override | يعيد رمز التجزئة لـ [XmlQualifiedName](./). |
| static [ToString](./tostring/)(const String\&, const String\&) | يعيد القيمة النصية لـ [XmlQualifiedName](./). |
| [ToString](./tostring/)() const override | يعيد القيمة النصية لـ [XmlQualifiedName](./). |
| [XmlQualifiedName](./xmlqualifiedname/)() | ينشئ نسخة جديدة من فئة [XmlQualifiedName](./). |
| [XmlQualifiedName](./xmlqualifiedname/)(const String\&) | ينشئ نسخة جديدة من فئة [XmlQualifiedName](./) بالاسم المحدد. |
| [XmlQualifiedName](./xmlqualifiedname/)(const String\&, const String\&) | ينشئ نسخة جديدة من فئة [XmlQualifiedName](./) بالاسم والمساحة الاسمية المحددين. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Empty](./empty/) | يوفر [XmlQualifiedName](./) فارغًا. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
