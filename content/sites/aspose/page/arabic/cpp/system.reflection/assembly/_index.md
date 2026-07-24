---
title: "System::Reflection::Assembly فئة"
linktitle: "Assembly"
second_title: "Aspose.Page لـ C++"
description: "System::Reflection::Assembly فئة. فئة انعكاس تصف التجميع. الدعم محدود لأن القواعد تختلف كثيرًا بين C# و C++. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.reflection/assembly/
---
## Assembly class


[Reflection](../) class describing assembly. Support is limited as the rules are quite different between C# and C++. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Assembly : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Assembly](./assembly/)() | منشئ. |
| virtual [get_CodeBase](./get_codebase/)() const | يحصل على دليل التجميع الحالي. الدعم محدود. |
| virtual [get_FullName](./get_fullname/)() const | يحصل على الاسم الكامل للتجميع. |
| virtual [get_Location](./get_location/)() const | يحصل على موقع التجميع. غير مُنفذ. |
| static [GetAssembly](./getassembly/)(const TypeInfo\&) | يحصل على التجميع الذي يعرّف النوع المحدد. |
| static [GetCallingAssembly](./getcallingassembly/)() | يحصل على التجميع المستدعي. |
| static [GetEntryAssembly](./getentryassembly/)() | يحصل على تجميع الدخول. |
| static [GetExecutingAssembly](./getexecutingassembly/)() | يحصل على التجميع التنفيذي. |
| virtual [GetManifestResourceNames](./getmanifestresourcenames/)() const | يحصل على أسماء موارد البيان. |
| virtual [GetManifestResourceStream](./getmanifestresourcestream/)(String) const | يحصل على الدفق المتصل بموارد البيان. |
| virtual [GetName](./getname/)() const | يحصل على اسم التجميع. |
| virtual [GetTypes](./gettypes/)() const | يحصل على الأنواع المعلنة من قبل التجميع. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
