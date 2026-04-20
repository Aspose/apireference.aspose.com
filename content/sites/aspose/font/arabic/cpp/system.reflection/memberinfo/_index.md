---
title: "فئة System::Reflection::MemberInfo"
linktitle: "MemberInfo"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Reflection::MemberInfo. توفر معلومات انعكاس عن الأعضاء. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء مثيل لهذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أعطال تأكيدية. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 700
url: /ar/cpp/system.reflection/memberinfo/
---
## MemberInfo class


توفر معلومات انعكاس عن الأعضاء. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيل لهذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أعطال تأكيدية. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class MemberInfo : public System::Object
```

## Nested classes

* Class [TypeInternal](./typeinternal/)
## الطرق

| طريقة | الوصف |
| --- | --- |
| [AddAttribute](./addattribute/)(const ObjectPtr\&) | يضيف سمة إلى المجموعة. |
| [get_DeclaringType](./get_declaringtype/)() const | يحصل على النوع المُعلن. |
| [get_FullName](./get_fullname/)() const | يحصل على الاسم الكامل للعضو. قد يكون مختلفًا في الأجزاء المنفذة يدويًا. |
| virtual [get_MemberType](./get_membertype/)() const | يحصل على قيمة [System::Reflection::MemberTypes](../membertypes/) التي تشير إلى نوع العضو - طريقة، مُنشئ، حدث، وما إلى ذلك. |
| [get_Name](./get_name/)() const | يحصل على اسم العضو. |
| [get_ReflectedType](./get_reflectedtype/)() const | يحصل على نوع النوع المنعكس. |
| [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&, bool) const | يرجع مصفوفة تحتوي على كائنات تمثل جميع السمات المخصصة المطبقة على النوع الذي يمثله الكائن الحالي. |
| [GetCustomAttributes](./getcustomattributes/)(bool) const | يرجع مصفوفة تحتوي على كائنات تمثل جميع السمات المخصصة المطبقة على النوع الذي يمثله الكائن الحالي. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [ObjectPtr](./objectptr/) | اسم مستعار لمؤشر مشترك إلى [Object](../../system/object/). |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)
