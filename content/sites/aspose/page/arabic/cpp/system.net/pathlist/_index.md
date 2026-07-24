---
title: "System::Net::PathList فئة"
linktitle: "PathList"
second_title: "Aspose.Page لـ C++"
description: "System::Net::PathList فئة. تمثل قائمة كائنات فئة CookieCollection. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3000
url: /ar/cpp/system.net/pathlist/
---
## PathList class


تمثل قائمة كائنات فئة [CookieCollection](../cookiecollection/). يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class PathList : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [Create](./create/)() | ينشئ مثيلًا جديدًا. |
| [get_Count](./get_count/)() const | يعيد عدد العناصر. |
| [get_SyncRoot](./get_syncroot/)() const | يعيد الكائن الذي يتم من خلاله مزامنة المجموعة. |
| [GetCookiesCount](./getcookiescount/)() | يعيد عدد ملفات تعريف الارتباط لجميع عناصر المجموعة. |
| [GetEnumerator](./getenumerator/)() | يعيد المُعدِّد للمجموعة الحالية. |
| [idx_get](./idx_get/)(String) | يحصل على مجموعة ملفات تعريف الارتباط حسب المسار المحدد. |
| [idx_set](./idx_set/)(String, System::SharedPtr\<CookieCollection\>) | يضبط مجموعة ملفات تعريف الارتباط حسب المسار المحدد. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
