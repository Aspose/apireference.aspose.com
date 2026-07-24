---
title: "System::Security::Cryptography::ECDsa فئة"
linktitle: "ECDsa"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Security::Cryptography::ECDsa. الفئة الأساسية لتطبيقات خوارزمية ECDsa. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1300
url: /ar/cpp/system.security.cryptography/ecdsa/
---
## ECDsa class


الفئة الأساسية لتطبيقات خوارزمية [ECDsa](./). يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class ECDsa : public System::Security::Cryptography::AsymmetricAlgorithm
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [Create](./create/)() | ينشئ تنفيذًا افتراضيًا لخوارزمية ECDSA. |
| static [Create](./create/)(const ECCurve\&) | ينشئ تنفيذًا افتراضيًا لخوارزمية ECDSA مع مفتاح تم إنشاؤه حديثًا على المنحنى المحدد. |
| static [Create](./create/)(const ECParameters\&) | ينشئ تنفيذًا افتراضيًا لخوارزمية ECDSA باستخدام المعلمات المحددة. |
| static [Create](./create/)(const String\&) | ينشئ تنفيذًا محددًا لخوارزمية ECDSA. |
| virtual [ExportExplicitParameters](./exportexplicitparameters/)(bool) | يصدّر المعلمات الصريحة. |
| virtual [ExportParameters](./exportparameters/)(bool) | يصدّر المعلمات المسماة أو الصريحة. |
| virtual [GenerateKey](./generatekey/)(const ECCurve\&) | ينشئ زوج مفاتيح عام/خاص جديد للمنحنى المحدد. |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | معلومات RTTI. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | يحصل على خوارزمية التوقيع المستخدمة. |
| virtual [ImportParameters](./importparameters/)(const ECParameters\&) | يستورد جميع المعلمات من بنية البيانات. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | يحسب قيمة التجزئة للمصفوفة البيانات المحددة باستخدام خوارزمية التجزئة المحددة، ويوقع النتيجة. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | يحسب قيمة التجزئة للمصفوفة البيانات المحددة باستخدام خوارزمية التجزئة المحددة، ويوقع النتيجة. |
| virtual [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | يحسب قيمة التجزئة لتدفق البيانات الثنائي المحدد باستخدام خوارزمية التجزئة المحددة، ويوقع النتيجة. |
| virtual [SignHash](./signhash/)(const ByteArrayPtr\&) | يحسب التوقيع للقيمة المدخلة المحددة. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | يتحقق من صحة توقيع البيانات المحددة. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | يتحقق من صحة توقيع البيانات المحددة. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | يتحقق من صحة توقيع تدفق البيانات الثنائي المحدد. |
| virtual [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr) | يفحص توقيع البيانات. |
## انظر أيضًا

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
