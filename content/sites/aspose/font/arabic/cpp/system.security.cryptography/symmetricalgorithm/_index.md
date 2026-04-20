---
title: "فئة System::Security::Cryptography::SymmetricAlgorithm"
linktitle: "SymmetricAlgorithm"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Security::Cryptography::SymmetricAlgorithm. خوارزمية متماثلة تستخدم نفس المفتاح للتشفير وفك التشفير كفئة أساسية. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 4900
url: /ar/cpp/system.security.cryptography/symmetricalgorithm/
---
## SymmetricAlgorithm class


خوارزمية متماثلة تستخدم نفس المفتاح للتشفير وفك التشفير كفئة أساسية. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class SymmetricAlgorithm : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [Create](./create/)(const String\&) | ينشئ مثيل الخوارزمية. |
| virtual [CreateDecryptor](./createdecryptor/)() | ينشئ مُفك تشفير مع المعلمات المرتبطة بكائن الخوارزمية. |
| virtual [CreateDecryptor](./createdecryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | ينشئ مُفك تشفير مع معلمات صريحة. |
| virtual [CreateEncryptor](./createencryptor/)() | ينشئ مُشفّر مع المعلمات المرتبطة بكائن الخوارزمية. |
| virtual [CreateEncryptor](./createencryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | ينشئ مشفرًا باستخدام معلمات صريحة. |
| virtual [GenerateIV](./generateiv/)() | ينشئ قيمة أولية عشوائية للخوارزمية. يستبدل القيمة الموجودة (إن وجدت). |
| virtual [GenerateKey](./generatekey/)() | ينشئ مفتاحًا عشوائيًا للخوارزمية. يستبدل المفتاح الموجود (إن وجدت). |
| virtual [get_BlockSize](./get_blocksize/)() | يحصل على حجم الكتلة للعملية التشفيرية. |
| virtual [get_FeedbackSize](./get_feedbacksize/)() | يحصل على حجم التغذية الراجعة للعملية التشفيرية. |
| virtual [get_IV](./get_iv/)() | يحصل على القيمة الأولية للعملية التشفيرية. ينشئ قيمة جديدة إذا لم تُنشأ بعد. |
| virtual [get_Key](./get_key/)() | يحصل على مفتاح العملية التشفيرية. ينشئ مفتاحًا جديدًا إذا لم يُنشأ بعد. |
| virtual [get_KeySize](./get_keysize/)() | يحصل على حجم المفتاح للعملية التشفيرية. |
| virtual [get_Mode](./get_mode/)() | يحصل على وضع العملية التشفيرية. |
| virtual [get_Padding](./get_padding/)() | يحصل على حشوة العملية التشفيرية. |
| virtual [set_BlockSize](./set_blocksize/)(int) | يضبط حجم الكتلة للعملية التشفيرية. |
| virtual [set_FeedbackSize](./set_feedbacksize/)(int) | يضبط حجم التغذية الراجعة للعملية التشفيرية. |
| virtual [set_IV](./set_iv/)(System::ArrayPtr\<uint8_t\>) | يضبط القيمة الأولية للعملية التشفيرية. |
| virtual [set_Key](./set_key/)(System::ArrayPtr\<uint8_t\>) | يضبط مفتاح العملية التشفيرية. |
| virtual [set_KeySize](./set_keysize/)(int) | يضبط حجم المفتاح للعملية التشفيرية. |
| virtual [set_Mode](./set_mode/)(CipherMode) | يضبط وضع العملية التشفيرية. |
| virtual [set_Padding](./set_padding/)(PaddingMode) | يضبط حشوة العملية التشفيرية. |
| [ValidKeySize](./validkeysize/)(int) | يتحقق مما إذا كان حجم المفتاح صالحًا. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
