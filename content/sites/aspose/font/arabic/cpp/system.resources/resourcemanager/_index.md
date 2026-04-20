---
title: "فئة System::Resources::ResourceManager"
linktitle: "ResourceManager"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Resources::ResourceManager. توفر API لإدارة الموارد. غير مُنفّذة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أخطاءً في التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.resources/resourcemanager/
---
## ResourceManager class


توفر API لإدارة الموارد. غير مُنفّذة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أخطاءً في التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class ResourceManager : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [GetObject__](./getobject__/)(String) | يحصل على كائن من المورد. الاسم ليس GetObject() للتعامل مع مشكلة تعريف GetObjectA. |
| virtual [GetObject__](./getobject__/)(String, SharedPtr\<System::Globalization::CultureInfo\>) | يحصل على كائن من المورد. الاسم ليس GetObject() للتعامل مع مشكلة تعريف GetObjectA. |
| virtual [GetString](./getstring/)(String) | يحصل على مورد نصي. |
| virtual [GetString](./getstring/)(String, SharedPtr\<System::Globalization::CultureInfo\>) | يحصل على مورد نصي. |
| [ResourceManager](./resourcemanager/)(const String\&, const SharedPtr\<Reflection::Assembly\>\&) | معلومات RTTI. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Resources](../)
* Library [Aspose.Font for C++](../../)
