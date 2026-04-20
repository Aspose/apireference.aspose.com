---
title: "فئة System::Net::Http::ByteArrayContent"
linktitle: "ByteArrayContent"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Net::Http::ByteArrayContent. تمثل محتوى HTTP كمصفوفة بايت. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. يجب دائمًا تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.net.http/bytearraycontent/
---
## ByteArrayContent class


تمثل محتوى HTTP كمصفوفة بايت. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. يجب دائمًا تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class ByteArrayContent : public System::Net::Http::HttpContent
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [ByteArrayContent](./bytearraycontent/)(System::ArrayPtr\<uint8_t\>) | معلومات RTTI. |
| [ByteArrayContent](./bytearraycontent/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) | ينشئ نسخة جديدة. |
| [TryComputeLength](./trycomputelength/)(int64_t\&) override | يحاول حساب طول مصفوفة البايت. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [DefaultStringEncoding](../httpcontent/defaultstringencoding/) | الترميز الافتراضي. |
| static [MaxBufferSize](../httpcontent/maxbuffersize/) | الحد الأقصى لعدد البايتات. |
## انظر أيضًا

* Class [HttpContent](../httpcontent/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
