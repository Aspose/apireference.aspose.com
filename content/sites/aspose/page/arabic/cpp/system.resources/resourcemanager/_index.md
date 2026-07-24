---
title: "System::Resources::ResourceManager فئة"
linktitle: "ResourceManager"
second_title: "Aspose.Page لـ C++"
description: "System::Resources::ResourceManager فئة. يوفر API لإدارة الموارد. غير مُنفّذ. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.resources/resourcemanager/
---
## ResourceManager class


يوفر API لإدارة الموارد. غير مُنفّذ. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class ResourceManager : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [GetObject__](./getobject__/)(String) | يحصل على الكائن من المورد. الاسم ليس GetObject() للتعامل مع مشكلة تعريف GetObjectA. |
| virtual [GetObject__](./getobject__/)(String, SharedPtr\<System::Globalization::CultureInfo\>) | يحصل على الكائن من المورد. الاسم ليس GetObject() للتعامل مع مشكلة تعريف GetObjectA. |
| virtual [GetString](./getstring/)(String) | يحصل على مورد السلسلة. |
| virtual [GetString](./getstring/)(String, SharedPtr\<System::Globalization::CultureInfo\>) | يحصل على مورد السلسلة. |
| [ResourceManager](./resourcemanager/)(const String\&, const SharedPtr\<Reflection::Assembly\>\&) | معلومات RTTI. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Resources](../)
* Library [Aspose.Page for C++](../../)
