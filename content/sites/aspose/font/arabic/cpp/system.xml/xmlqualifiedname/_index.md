---
title: "System::Xml::XmlQualifiedName class"
linktitle: "XmlQualifiedName"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlQualifiedName class. يمثل اسمًا مؤهلًا في XML في C++."
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
| [get_IsEmpty](./get_isempty/)() const | يرجع قيمة تشير إلى ما إذا كان [XmlQualifiedName](./) فارغًا. |
| [get_Name](./get_name/)() const | يرجع تمثيلًا نصيًا للاسم المؤهل لـ [XmlQualifiedName](./). |
| [get_Namespace](./get_namespace/)() const | يرجع تمثيلًا نصيًا للنطاق الخاص بـ [XmlQualifiedName](./). |
| [GetHashCode](./gethashcode/)() const override | يرجع قيمة التجزئة لـ [XmlQualifiedName](./). |
| static [ToString](./tostring/)(const String\&, const String\&) | يعيد قيمة السلسلة لـ [XmlQualifiedName](./). |
| [ToString](./tostring/)() const override | يعيد قيمة السلسلة لـ [XmlQualifiedName](./). |
| [XmlQualifiedName](./xmlqualifiedname/)() | ينشئ مثيلاً جديداً لفئة [XmlQualifiedName](./). |
| [XmlQualifiedName](./xmlqualifiedname/)(const String\&) | ينشئ مثيلاً جديداً لفئة [XmlQualifiedName](./) بالاسم المحدد. |
| [XmlQualifiedName](./xmlqualifiedname/)(const String\&, const String\&) | ينشئ مثيلاً جديداً لفئة [XmlQualifiedName](./) بالاسم والمساحة الاسمية المحددين. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Empty](./empty/) | يوفر [XmlQualifiedName](./) فارغاً. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
