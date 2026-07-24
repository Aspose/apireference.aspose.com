---
title: "الفئة System::UriBuilder"
linktitle: "UriBuilder"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::UriBuilder. توفر طرقًا لإنشاء وتعديل معرّفات الموارد العالمية (URIs). يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطالًا في التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 6800
url: /ar/cpp/system/uribuilder/
---
## UriBuilder class


توفر طرقًا لإنشاء وتعديل معرّفات الموارد العالمية (URIs). يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطالًا في التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class UriBuilder : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Scheme](./get_scheme/)() const | يعيد مخطط الـ URI الذي أنشأه الكائن الحالي. |
| [get_Uri](./get_uri/)() const | يعيد كائن [Uri](../uri/) الذي أنشأه الكائن الحالي. |
| [set_Port](./set_port/)(int) | يضبط رقم المنفذ للـ URI. |
| [set_Scheme](./set_scheme/)(const String\&) | يضبط مخطط الـ URI الذي تم إنشاؤه بواسطة الكائن الحالي إلى القيمة المحددة. |
| [ToString](./tostring/)() const override | يرجع تمثيل السلسلة النصية للـ URI الذي تم إنشاؤه بواسطة الكائن الحالي. |
| [UriBuilder](./uribuilder/)(const String\&) | ينشئ كائنًا من [UriBuilder](./) يمثل الـ URI المحدد. |
| [UriBuilder](./uribuilder/)(const SharedPtr\<Uri\>\&) | ينشئ كائنًا من [UriBuilder](./) يمثل الـ URI المحدد. |
## انظر أيضًا

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
