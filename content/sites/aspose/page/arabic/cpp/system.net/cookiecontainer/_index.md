---
title: "System::Net::CookieContainer class"
linktitle: "CookieContainer"
second_title: "Aspose.Page لـ C++"
description: "System::Net::CookieContainer class. يوفر حاوية لكائنات فئة CookieCollection. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 400
url: /ar/cpp/system.net/cookiecontainer/
---
## CookieContainer class


يوفر حاوية لكائنات فئة CookieCollection. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class CookieContainer : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(System::SharedPtr\<Cookie\>) | يضيف ملف تعريف ارتباط إلى المجموعة. |
| [Add](./add/)(System::SharedPtr\<Cookie\>, bool) | يضيف ملف تعريف ارتباط إلى المجموعة. |
| [Add](./add/)(System::SharedPtr\<CookieCollection\>) | ينسخ ملفات تعريف الارتباط من المجموعة المحددة إلى الحالية. |
| [Add](./add/)(System::SharedPtr\<Uri\>, System::SharedPtr\<Cookie\>) | يضيف ملف تعريف ارتباط للعنوان (URI) المحدد. |
| [Add](./add/)(System::SharedPtr\<Uri\>, System::SharedPtr\<CookieCollection\>) | ينسخ ملفات تعريف الارتباط من المجموعة المحددة للعنوان المحدد إلى المجموعة الحالية. |
| [CookieContainer](./cookiecontainer/)() | ينشئ نسخة جديدة. |
| [CookieContainer](./cookiecontainer/)(int32_t) | ينشئ نسخة جديدة. |
| [CookieContainer](./cookiecontainer/)(int32_t, int32_t, int32_t) | ينشئ نسخة جديدة. |
| [CookieCutter](./cookiecutter/)(System::SharedPtr\<Uri\>, String, String, bool) | ينسخ ملفات تعريف الارتباط من رأس HTTP المحدد للعنوان المحدد. |
| [get_Capacity](./get_capacity/)() | يحصل على سعة المجموعة. |
| [get_Count](./get_count/)() | يعيد عدد عناصر المجموعة. |
| [get_MaxCookieSize](./get_maxcookiesize/)() | يحصل على الحد الأقصى لحجم ملف تعريف الارتباط. |
| [get_PerDomainCapacity](./get_perdomaincapacity/)() | يحصل على سعة المجموعة لكل نطاق. |
| [GetCookieHeader](./getcookieheader/)(System::SharedPtr\<Uri\>) | إرجاع رأس HTTP يحتوي على ملفات تعريف الارتباط المرتبطة بالعنوان المحدد. |
| [GetCookieHeader](./getcookieheader/)(System::SharedPtr\<Uri\>, String\&) | إرجاع رأس HTTP يحتوي على ملفات تعريف الارتباط المرتبطة بالعنوان المحدد. |
| [GetCookies](./getcookies/)(System::SharedPtr\<Uri\>) | يعيد مجموعة من ملفات تعريف الارتباط المرتبطة بالعنوان المحدد. |
| [InternalGetCookies](./internalgetcookies/)(System::SharedPtr\<Uri\>) | يعيد مجموعة من ملفات تعريف الارتباط المرتبطة بالعنوان المحدد. |
| [IsLocalDomain](./islocaldomain/)(String) | يتحقق مما إذا كان النطاق المحدد هو localhost. |
| [set_Capacity](./set_capacity/)(int32_t) | يضبط سعة المجموعة. |
| [set_MaxCookieSize](./set_maxcookiesize/)(int32_t) | يضبط الحد الأقصى لحجم ملف تعريف الارتباط. |
| [set_PerDomainCapacity](./set_perdomaincapacity/)(int32_t) | يضبط سعة المجموعة لكل نطاق. |
| [SetCookies](./setcookies/)(System::SharedPtr\<Uri\>, String) | ينسخ ملفات تعريف الارتباط من الرأس المحدد إلى المجموعة ويربطها بالعنوان المحدد. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [DefaultCookieLengthLimit](./defaultcookielengthlimit/) | الحد الأقصى لحجم ملف تعريف الارتباط. |
| static [DefaultCookieLimit](./defaultcookielimit/) | معلومات RTTI. |
| static [DefaultPerDomainCookieLimit](./defaultperdomaincookielimit/) | الحد الأقصى لعدد عناصر المجموعة لكل نطاق. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
