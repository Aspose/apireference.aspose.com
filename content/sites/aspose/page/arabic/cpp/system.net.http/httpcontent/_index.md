---
title: "System::Net::Http::HttpContent class"
linktitle: "HttpContent"
second_title: "Aspose.Page لـ C++"
description: "System::Net::Http::HttpContent class. يمثل محتوى كيان HTTP. يجب تخصيص كائن من هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 400
url: /ar/cpp/system.net.http/httpcontent/
---
## HttpContent class


يمثل محتوى كيان HTTP. [Object](../../system/object/) من هذه الفئة يجب تخصيصه فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class HttpContent : public System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Dispose](./dispose/)() override | يقوم بتحرير النسخة الحالية. كما يقوم هذا الأسلوب بتحرير الدفق الذي تُعيده الدالة 'ReadAsStream' وذاكرة التخزين المؤقت إذا تم إنشاؤها. |
| [get_Headers](./get_headers/)() | يرجع رؤوس محتوى HTTP. |
| [LoadIntoBuffer](./loadintobuffer/)() | يسلسِل المحتوى إلى مخزن الذاكرة. |
| [LoadIntoBuffer](./loadintobuffer/)(int64_t) | يسلسِل المحتوى إلى مخزن الذاكرة. |
| [ReadAsByteArray](./readasbytearray/)() | يسلسِل المحتوى ويعيد مصفوفة بايت. |
| [ReadAsStream](./readasstream/)() | يسلسِل المحتوى ويعيد دفقًا. |
| [ReadAsString](./readasstring/)() | يسلسِل المحتوى ويعيد سلسلة. |
| virtual [TryComputeLength](./trycomputelength/)(int64_t\&) | يحاول حساب حجم المحتوى. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [DefaultStringEncoding](./defaultstringencoding/) | الترميز الافتراضي. |
| static [MaxBufferSize](./maxbuffersize/) | الحد الأقصى لعدد البايتات. |
## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
