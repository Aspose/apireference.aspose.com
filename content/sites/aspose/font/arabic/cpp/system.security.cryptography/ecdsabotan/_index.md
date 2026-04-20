---
title: "فئة System::Security::Cryptography::ECDsaBotan"
linktitle: "ECDsaBotan"
second_title: "Aspose.Font لـ C++"
description: "System::Security::Cryptography::ECDsaBotan class. خوارزمية ECDsa في شكل Botan. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1400
url: /ar/cpp/system.security.cryptography/ecdsabotan/
---
## ECDsaBotan class


[ECDsa](../ecdsa/) algorithm in Botan form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ECDsaBotan : public System::Security::Cryptography::ECDsa
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [ECDsaBotan](./ecdsabotan/)() | منشئ. يستخدم المعلمات الافتراضية. |
| [ECDsaBotan](./ecdsabotan/)(const ECParameters\&) | المُنشئ. |
| [ECDsaBotan](./ecdsabotan/)(const ECCurve\&) | المُنشئ. |
| [ECDsaBotan](./ecdsabotan/)(int32_t) | المُنشئ. |
| [ECDsaBotan](./ecdsabotan/)(const Botan::ECDSA_PublicKey\&) | المُنشئ. |
| [ECDsaBotan](./ecdsabotan/)(const Botan::ECDSA_PrivateKey\&) | المُنشئ. |
| [ExportExplicitParameters](./exportexplicitparameters/)(bool) override | يصدّر المعلمات الصريحة. |
| [ExportParameters](./exportparameters/)(bool) override | يصدّر المعلمات المسماة أو الصريحة. |
| [FromXmlString](./fromxmlstring/)(String) override | يُهيئ الكائن باستخدام معلمات مُشفّرة بصيغة XML. غير مُنفّذ. |
| [FromXmlString](./fromxmlstring/)(const String\&, ECKeyXmlFormat) | يُهيئ الكائن باستخدام معلمات مُشفّرة بصيغة XML. غير مُنفّذ. |
| [GenerateKey](./generatekey/)(const ECCurve\&) override | ينشئ زوجًا جديدًا من المفاتيح العامة/الخاصة للمنحنى المحدد. |
| [get_HashAlgorithm](./get_hashalgorithm/)() const | يحصل على خوارزمية التجزئة. |
| [HashData](./hashdata/)(ByteArrayPtr, int32_t, int32_t, HashAlgorithmName) override | يحسب قيمة التجزئة للمصفوفة البيانات المحددة باستخدام خوارزمية التجزئة المحددة. |
| [HashData](./hashdata/)(StreamPtr, HashAlgorithmName) override | يحسب قيمة التجزئة لتدفق البيانات الثنائي المحدد باستخدام خوارزمية التجزئة المحددة. |
| [ImportParameters](./importparameters/)(const ECParameters\&) override | يستورد جميع المعلمات من بنية البيانات. |
| [set_HashAlgorithm](./set_hashalgorithm/)(const HashAlgorithmName\&) | يضبط خوارزمية التجزئة. |
| [set_KeySize](./set_keysize/)(int32_t) override | يضبط حجم المفتاح. |
| [SignData](./signdata/)(const ByteArrayPtr\&) | يحسب قيمة التجزئة للمصفوفة البيانات المحددة، ويوقع النتيجة. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t) | يحسب قيمة التجزئة للمصفوفة البيانات المحددة، ويوقع النتيجة. |
| [SignData](./signdata/)(const StreamPtr\&) | يحسب قيمة التجزئة لتدفق البيانات الثنائي المحدد، ويوقع النتيجة. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | معلومات RTTI. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | معلومات RTTI. |
| virtual [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | معلومات RTTI. |
| [SignHash](./signhash/)(const ByteArrayPtr\&) override | يحسب التوقيع للقيمة المدخلة المحددة. |
| [ToXmlString](./toxmlstring/)(bool) override | يصدّر جميع المعلمات بصيغة XML. غير مُنفّذ. |
| [ToXmlString](./toxmlstring/)(ECKeyXmlFormat) | يصدّر جميع المعلمات بتنسيق XML. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&) | يتحقق من أن توقيع البيانات المحددة صالح. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&) | يتحقق من أن توقيع البيانات المحددة صالح. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&) | يتحقق من أن توقيع تدفق البيانات الثنائية المحدد صالح. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | يتحقق من أن توقيع البيانات المحددة صالح. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | يتحقق من أن توقيع البيانات المحددة صالح. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | يتحقق من أن توقيع تدفق البيانات الثنائية المحدد صالح. |
| [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr) override | يفحص توقيع البيانات. |
## انظر أيضًا

* Class [ECDsa](../ecdsa/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
