---
title: "فئة System::OperatingSystem"
linktitle: "OperatingSystem"
second_title: "Aspose.Font لـ C++"
description: "فئة System::OperatingSystem. تمثّل نظام تشغيل معين وتوفر معلومات عنه. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثيل لهذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت تشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 5100
url: /ar/cpp/system/operatingsystem/
---
## OperatingSystem class


تمثّل نظام تشغيل معين وتوفر معلومات عنه. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../makeobject/). لا تقم أبدًا بإنشاء مثيل لهذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت تشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class OperatingSystem
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Platform](./get_platform/)() const | يعيد معرف المنصة لنظام التشغيل الممثّل بواسطة الكائن الحالي. |
| [get_ServicePack](./get_servicepack/)() const | يعيد اسم حزمة الخدمات لنظام التشغيل الممثّل بواسطة الكائن الحالي. |
| [get_Version](./get_version/)() const | يعيد مرجعًا ثابتًا إلى كائن [Version](../version/) يمثل إصدار نظام التشغيل الممثّل بواسطة الكائن الحالي. |
| [get_VersionString](./get_versionstring/)() const | يعيد تمثيل السلسلة لإصدار نظام التشغيل الذي يمثله الكائن الحالي. |
| [OperatingSystem](./operatingsystem/)(PlatformID, const Version\&) | ينشئ مثيلاً يمثل نظام تشغيل محدد بمعرف منصة وإصدار معينين. |
| [OperatingSystem](./operatingsystem/)(PlatformID, const Version\&, const String\&) | ينشئ مثيلاً يمثل نظام تشغيل محدد بمعرف منصة وإصدار وحزمة خدمات معينة. |
| [ToString](./tostring/)() const | يعيد تمثيل السلسلة لإصدار نظام التشغيل الذي يمثله الكائن الحالي. |
## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
