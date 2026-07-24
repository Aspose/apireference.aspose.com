---
title: "فئة System::Runtime::Serialization::SerializationInfo"
linktitle: "SerializationInfo"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Runtime::Serialization::SerializationInfo. تحتفظ بمجموعة من الحقول المسماة التي تمثل الكائن المتسلسل. غير مُنفذة. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 400
url: /ar/cpp/system.runtime.serialization/serializationinfo/
---
## SerializationInfo class


يحتوي على مجموعة من الحقول المسماة التي تمثل كائنًا مُسلسلًا. غير مُنفّذ. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطالًا في التأكيد. دائمًا قم بلف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class SerializationInfo : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AddValue](./addvalue/)(const System::String\&, float) | يضع قيمة عائمة. غير مُنفّذ. |
| [AddValue](./addvalue/)(const System::String\&, short) | يضع قيمة قصيرة. غير مُنفّذ. |
| [AddValue](./addvalue/)(const System::String\&, bool) | يضع قيمة منطقية. غير مُنفّذ. |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | يضع قيمة كائن. غير مُنفّذ. |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | يضع قيمة كائن بالنوع المحدد. غير مُنفّذ. |
| [GetValue](./getvalue/)(const System::String\&, const System::TypeInfo\&) | يسترجع قيمة من مخزن [SerializationInfo](./). غير مُنفّذ. |
| [SerializationInfo](./serializationinfo/)(const System::TypeInfo\&, const System::SharedPtr\<IFormatterConverter\>\&) | معلومات RTTI. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Page for C++](../../)
