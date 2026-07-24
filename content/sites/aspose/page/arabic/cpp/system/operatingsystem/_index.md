---
title: "فئة System::OperatingSystem"
linktitle: "OperatingSystem"
second_title: "Aspose.Page لـ C++"
description: "فئة System::OperatingSystem. تمثّل نظام تشغيل معين وتوفر معلومات عنه. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثيل لهذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء تشغيلية و/أو أعطال تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 5100
url: /ar/cpp/system/operatingsystem/
---
## OperatingSystem class


تمثّل نظام تشغيل معين وتوفر معلومات عنه. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../makeobject/). لا تقم أبدًا بإنشاء مثيل لهذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء تشغيلية و/أو أعطال تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class OperatingSystem
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Platform](./get_platform/)() const | يعيد معرف المنصة لنظام التشغيل الممثّل بواسطة الكائن الحالي. |
| [get_ServicePack](./get_servicepack/)() const | يعيد اسم حزمة الخدمة لنظام التشغيل الممثّل بواسطة الكائن الحالي. |
| [get_Version](./get_version/)() const | يعيد إشارة ثابتة إلى كائن [Version](../version/) يمثل إصدار نظام التشغيل الممثّل بواسطة الكائن الحالي. |
| [get_VersionString](./get_versionstring/)() const | يعيد تمثيل السلسلة النصية لإصدار نظام التشغيل الممثّل بواسطة الكائن الحالي. |
| [OperatingSystem](./operatingsystem/)(PlatformID, const Version\&) | يقوم بإنشاء كائن يمثل نظام تشغيل محدد بمعرف منصة وإصدار معين. |
| [OperatingSystem](./operatingsystem/)(PlatformID, const Version\&, const String\&) | يقوم بإنشاء كائن يمثل نظام تشغيل محدد بمعرف منصة وإصدار وحزمة خدمات معينة. |
| [ToString](./tostring/)() const | يعيد تمثيل السلسلة النصية لإصدار نظام التشغيل الممثّل بواسطة الكائن الحالي. |
## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
