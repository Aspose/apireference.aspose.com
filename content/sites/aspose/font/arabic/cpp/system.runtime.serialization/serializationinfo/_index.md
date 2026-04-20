---
title: "System::Runtime::Serialization::SerializationInfo فئة"
linktitle: "SerializationInfo"
second_title: "Aspose.Font لـ C++"
description: "System::Runtime::Serialization::SerializationInfo فئة. يحتوي على مجموعة من الحقول المسماة التي تمثل الكائن المتسلسل. غير مُنفّذ. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء تأكيد. دائمًا قم بلف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 400
url: /ar/cpp/system.runtime.serialization/serializationinfo/
---
## SerializationInfo class


يحتوي على مجموعة من الحقول المسماة التي تمثل الكائن المتسلسل. غير مُنفّذ. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء تأكيد. دائمًا قم بلف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class SerializationInfo : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AddValue](./addvalue/)(const System::String\&, float) | يضع قيمة float. غير مُنفّذ. |
| [AddValue](./addvalue/)(const System::String\&, short) | يضع قيمة short. غير مُنفّذ. |
| [AddValue](./addvalue/)(const System::String\&, bool) | يضع قيمة boolean. غير مُنفّذ. |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | يضع قيمة كائن. غير مُنفّذ. |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | يضع قيمة كائن مع النوع المحدد. غير مُنفّذ. |
| [GetValue](./getvalue/)(const System::String\&, const System::TypeInfo\&) | يسترجع قيمة من مخزن [SerializationInfo](./). غير مُنفّذ. |
| [SerializationInfo](./serializationinfo/)(const System::TypeInfo\&, const System::SharedPtr\<IFormatterConverter\>\&) | معلومات RTTI. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Font for C++](../../)
