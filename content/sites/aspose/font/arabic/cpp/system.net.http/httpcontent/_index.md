---
title: "System::Net::Http::HttpContent فئة"
linktitle: "HttpContent"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Http::HttpContent class. تمثل محتوى كيان HTTP. يجب تخصيص كائن من هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 400
url: /ar/cpp/system.net.http/httpcontent/
---
## HttpContent class


تمثل محتوى كيان HTTP. يجب تخصيص [Object](../../system/object/) من هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class HttpContent : public System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Dispose](./dispose/)() override | يقوم بتحرير المثيل الحالي. كما تقوم هذه الطريقة بتحرير الدفق الذي تُعيده الدالة 'ReadAsStream' ومخزن الذاكرة إذا تم إنشاؤه. |
| [get_Headers](./get_headers/)() | يعيد رؤوس محتوى HTTP. |
| [LoadIntoBuffer](./loadintobuffer/)() | يسلسل المحتوى إلى مخزن ذاكرة. |
| [LoadIntoBuffer](./loadintobuffer/)(int64_t) | يسلسل المحتوى إلى مخزن ذاكرة. |
| [ReadAsByteArray](./readasbytearray/)() | يسلسل المحتوى ويعيد مصفوفة بايت. |
| [ReadAsStream](./readasstream/)() | يسلسل المحتوى ويعيد دفقًا. |
| [ReadAsString](./readasstring/)() | يسلسل المحتوى ويعيد سلسلة نصية. |
| virtual [TryComputeLength](./trycomputelength/)(int64_t\&) | يحاول حساب حجم المحتوى. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [DefaultStringEncoding](./defaultstringencoding/) | الترميز الافتراضي. |
| static [MaxBufferSize](./maxbuffersize/) | الحد الأقصى لعدد البايتات. |
## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
