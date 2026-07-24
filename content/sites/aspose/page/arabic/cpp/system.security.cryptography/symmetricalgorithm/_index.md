---
title: "فئة System::Security::Cryptography::SymmetricAlgorithm"
linktitle: "SymmetricAlgorithm"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Security::Cryptography::SymmetricAlgorithm. خوارزمية متماثلة تستخدم نفس المفتاح للتشفير وفك التشفير كفئة أساسية. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيسبب أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 4900
url: /ar/cpp/system.security.cryptography/symmetricalgorithm/
---
## SymmetricAlgorithm class


خوارزمية متماثلة تستخدم نفس المفتاح للتشفير وفك التشفير كفئة أساسية. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيسبب أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class SymmetricAlgorithm : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [Create](./create/)(const String\&) | ينشئ نسخة من الخوارزمية. |
| virtual [CreateDecryptor](./createdecryptor/)() | ينشئ مُفكّ تشفير مع المعلمات المرتبطة بكائن الخوارزمية. |
| virtual [CreateDecryptor](./createdecryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | ينشئ مُفكّ تشفير مع معلمات صريحة. |
| virtual [CreateEncryptor](./createencryptor/)() | ينشئ مُشفّر مع المعلمات المرتبطة بكائن الخوارزمية. |
| virtual [CreateEncryptor](./createencryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | ينشئ مُشفّر مع معلمات صريحة. |
| virtual [GenerateIV](./generateiv/)() | يولد قيمة أولية عشوائية للخوارزمية. يستبدل القيمة الحالية (إن وجدت). |
| virtual [GenerateKey](./generatekey/)() | يولد مفتاحًا عشوائيًا للخوارزمية. يستبدل المفتاح الحالي (إن وجدت). |
| virtual [get_BlockSize](./get_blocksize/)() | يحصل على حجم الكتلة لعملية التشفير. |
| virtual [get_FeedbackSize](./get_feedbacksize/)() | يحصل على حجم التغذية الراجعة لعملية التشفير. |
| virtual [get_IV](./get_iv/)() | يحصل على القيمة الأولية لعملية التشفير. ينشئ قيمة جديدة إذا لم تُنشأ بعد. |
| virtual [get_Key](./get_key/)() | يحصل على مفتاح عملية التشفير. ينشئ مفتاحًا جديدًا إذا لم يُنشأ بعد. |
| virtual [get_KeySize](./get_keysize/)() | يحصل على حجم المفتاح لعملية التشفير. |
| virtual [get_Mode](./get_mode/)() | يحصل على وضع عملية التشفير. |
| virtual [get_Padding](./get_padding/)() | يحصل على حشو عملية التشفير. |
| virtual [set_BlockSize](./set_blocksize/)(int) | يضبط حجم الكتلة لعملية التشفير. |
| virtual [set_FeedbackSize](./set_feedbacksize/)(int) | يضبط حجم التغذية الراجعة لعملية التشفير. |
| virtual [set_IV](./set_iv/)(System::ArrayPtr\<uint8_t\>) | يضبط القيمة الأولية لعملية التشفير. |
| virtual [set_Key](./set_key/)(System::ArrayPtr\<uint8_t\>) | يضبط مفتاح عملية التشفير. |
| virtual [set_KeySize](./set_keysize/)(int) | يضبط حجم المفتاح لعملية التشفير. |
| virtual [set_Mode](./set_mode/)(CipherMode) | يضبط وضع عملية التشفير. |
| virtual [set_Padding](./set_padding/)(PaddingMode) | يضبط حشو العملية التشفيرية. |
| [ValidKeySize](./validkeysize/)(int) | يتحقق مما إذا كان حجم المفتاح صالحًا. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
