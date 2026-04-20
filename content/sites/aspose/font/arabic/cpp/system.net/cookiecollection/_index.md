---
title: "System::Net::CookieCollection فئة"
linktitle: "CookieCollection"
second_title: "Aspose.Font لـ C++"
description: "System::Net::CookieCollection فئة. يمثل قائمة من ملفات تعريف الارتباط المرتبة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 200
url: /ar/cpp/system.net/cookiecollection/
---
## CookieCollection class


يمثل قائمة من ملفات تعريف الارتباط المرتبة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class CookieCollection : public System::Collections::Generic::ICollection<System::SharedPtr<System::Net::Cookie>>
```

## Enums

| تعداد | الوصف |
| --- | --- |
| [Stamp](./stamp/) | معلومات RTTI. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(const System::SharedPtr\<Cookie\>\&) override | يضيف ملف تعريف ارتباط إلى المجموعة. |
| [Add](./add/)(System::SharedPtr\<CookieCollection\>) | يضيف ملفات تعريف الارتباط من المجموعة المحددة إلى الحالية. |
| [Clear](./clear/)() override | يزيل جميع ملفات تعريف الارتباط من المجموعة. |
| [Contains](./contains/)(const System::SharedPtr\<Cookie\>\&) const override | يتحقق مما إذا كانت المجموعة تحتوي على ملف تعريف الارتباط المحدد. |
| [CookieCollection](./cookiecollection/)() | ينشئ نسخة جديدة. |
| [get_Count](./get_count/)() const override | يحصل على عدد العناصر في المجموعة. |
| [get_IsOtherVersionSeen](./get_isotherversionseen/)() | يرجع قيمة تشير إلى ما إذا كانت المجموعة تحتوي على ملف تعريف الارتباط بإصدار لا يساوي [Cookie::MaxSupportedVersion](../cookie/maxsupportedversion/). |
| [GetEnumerator](./getenumerator/)() override | يحصل على المُعدِّد. |
| [idx_get](./idx_get/)(int32_t) | يرجع ملف تعريف الارتباط من مجموعة ملفات تعريف الارتباط عند الفهرس المحدد. |
| [idx_get](./idx_get/)(String) | يرجع ملف تعريف الارتباط من مجموعة ملفات تعريف الارتباط بالاسم المحدد. |
| [IndexOf](./indexof/)(System::SharedPtr\<Cookie\>) | يرجع فهرس ملف تعريف الارتباط المحدد. |
| [InternalAdd](./internaladd/)(System::SharedPtr\<Cookie\>, bool) | يضيف ملف تعريف الارتباط المحدد إلى المجموعة. |
| [Remove](./remove/)(const System::SharedPtr\<Cookie\>\&) override | يزيل ملف تعريف الارتباط المحدد من المجموعة. |
| [RemoveAt](./removeat/)(int32_t) | يزيل ملف تعريف الارتباط عند الفهرس المحدد. |
| [TimeStamp](./timestamp/)(CookieCollection::Stamp) | يحدّث الطابع الزمني وفقًا للسيناريو المحدد ويعيد قيمة جديدة. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | يحصل على تنفيذ begin const iterator للحاوية الحالية. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | يحصل على تنفيذ begin iterator للحاوية الحالية. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | يحصل على تنفيذ end const iterator للحاوية الحالية. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | يحصل على تنفيذ end iterator للحاوية الحالية. |
## انظر أيضًا

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
