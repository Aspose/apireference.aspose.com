---
title: "فئة System::Security::Cryptography::HashAlgorithm"
linktitle: "HashAlgorithm"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Security::Cryptography::HashAlgorithm. الفئة الأساسية لخوارزميات التجزئة. يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة System::MakeObject(). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1600
url: /ar/cpp/system.security.cryptography/hashalgorithm/
---
## HashAlgorithm class


الفئة الأساسية لخوارزميات التجزئة. يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class HashAlgorithm : public System::Security::Cryptography::ICryptoTransform
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [ComputeHash](./computehash/)(const ArrayPtr\<uint8_t\>\&) | يحسب تجزئة للذاكرة المؤقتة. |
| [ComputeHash](./computehash/)(const ArrayPtr\<uint8_t\>\&, int, int) | يحسب تجزئة لشريحة من الذاكرة المؤقتة. |
| [ComputeHash](./computehash/)(SharedPtr\<IO::Stream\> const\&) | يقرأ الدفق حتى النهاية ويحسب تجزئة للبيانات المقروءة. |
| static [Create](./create/)(const String\&) | ينشئ خوارزمية تجزئة بناءً على الاسم. |
| virtual [get_Hash](./get_hash/)() | يحصل على قيمة رمز التجزئة المحسوب. |
| virtual [get_HashSize](./get_hashsize/)() | يحصل على حجم قيمة التجزئة المحسوبة بالبايت. |
| [get_InputBlockSize](./get_inputblocksize/)() override | حجم كتلة الإدخال. |
| [get_OutputBlockSize](./get_outputblocksize/)() override | حجم كتلة الإخراج. |
| virtual [Initialize](./initialize/)() | يعيد ضبط أداة التجزئة إلى الحالة الأولية. |
| [TransformBlock](./transformblock/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<uint8_t\>, int) override | يعالج كتلة من البيانات وينسخ البيانات إلى مصفوفة الإخراج. |
| [TransformFinalBlock](./transformfinalblock/)(ArrayPtr\<uint8_t\>, int, int) override | يعالج الكتلة الأخيرة من البيانات ويحسب التجزئة. |
| virtual [~HashAlgorithm](./~hashalgorithm/)() | المدمر. |
## انظر أيضًا

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
