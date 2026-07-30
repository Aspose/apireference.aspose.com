---
title: "الفئة System::Security::Cryptography::DSA"
linktitle: "DSA"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Security::Cryptography::DSA. الفئة الأساسية لتطبيقات خوارزمية DSA. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 900
url: /ar/cpp/system.security.cryptography/dsa/
---
## DSA class


الفئة الأساسية لتطبيقات خوارزمية [DSA](./). يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class DSA : public System::Security::Cryptography::AsymmetricAlgorithm
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [Create](./create/)() | ينشئ تنفيذًا افتراضيًا لخوارزمية [DSA](./). |
| static [Create](./create/)(const String\&) | ينشئ تنفيذًا افتراضيًا لخوارزمية [DSA](./). |
| static [Create](./create/)(int32_t) | ينشئ تنفيذًا افتراضيًا لخوارزمية [DSA](./) مع حجم مفتاح محدد. |
| static [Create](./create/)(const DSAParameters\&) | ينشئ تنفيذًا افتراضيًا لخوارزمية [DSA](./) مع معلمات محددة. |
| static [CreateFromXmlString](./createfromxmlstring/)(const String\&) | ينشئ تنفيذًا افتراضيًا لخوارزمية [DSA](./) مع معلمات مشفرة بصيغة XML محددة. |
| virtual [CreateSignature](./createsignature/)(ByteArrayPtr) | معلومات RTTI. |
| virtual [ExportParameters](./exportparameters/)(bool) | يصدّر جميع المعلمات. |
| [FromXmlString](./fromxmlstring/)(String) override | يُهيئ الكائن باستخدام معلمات مشفرة بصيغة XML. |
| virtual [ImportParameters](./importparameters/)(DSAParameters) | يستورد جميع المعلمات من بنية البيانات. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | يحسب قيمة التجزئة للمصفوفة البيانات المحددة باستخدام خوارزمية التجزئة المحددة، ويوقع النتيجة. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | يحسب قيمة التجزئة للمصفوفة البيانات المحددة باستخدام خوارزمية التجزئة المحددة، ويوقع النتيجة. |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | يحسب قيمة التجزئة لتدفق البيانات الثنائية المحدد باستخدام خوارزمية التجزئة المحددة، ويوقع النتيجة. |
| [ToXmlString](./toxmlstring/)(bool) override | يصدّر جميع المعلمات بتنسيق XML. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | يتحقق من أن توقيع البيانات المحددة صالح. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | يتحقق من أن توقيع البيانات المحددة صالح. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | يتحقق من أن توقيع تدفق البيانات الثنائية المحدد صالح. |
| virtual [VerifySignature](./verifysignature/)(ByteArrayPtr, ByteArrayPtr) | تحقق من توقيع [DSA](./) للبيانات المحددة. |
## انظر أيضًا

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
