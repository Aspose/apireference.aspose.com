---
title: "فئة System::IO::BinaryWriter"
linktitle: "BinaryWriter"
second_title: "Aspose.Font لـ C++"
description: "فئة System::IO::BinaryWriter. تمثل كاتبًا يكتب قيم الأنواع الأولية إلى تدفق بايتات. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 900
url: /ar/cpp/system.io/binarywriter/
---
## BinaryWriter class


يمثل كاتبًا يكتب قيم الأنواع الأولية إلى تدفق بايتات. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class BinaryWriter : public System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [BinaryWriter](./binarywriter/)(const StreamPtr\&, const EncodingPtr\&, bool) | ينشئ مثيلًا من فئة [BinaryWriter](./) التي تكتب البيانات إلى الدفق المحدد باستخدام الترميز المحدد. |
| [Close](./close/)() | يغلق كائن [BinaryWriter](./) الحالي وتدفق الإخراج الأساسي. |
| [Dispose](./dispose/)() override | يحرر جميع الموارد المستخدمة بواسطة الكائن الحالي ويغلق الدفق الأساسي. |
| [Flush](./flush/)() | يفرغ تدفق الإخراج. |
| [get_BaseStream](./get_basestream/)() | يرجع تدفق الإخراج. |
| [Seek](./seek/)(int, System::IO::SeekOrigin) | يضبط موضع التدفق الممثل بالكائن الحالي. |
| virtual [Write](./write/)(uint8_t) | يكتب القيمة الصحيحة غير الموقعة ذات 8 بت المحددة إلى تدفق الإخراج. |
| virtual [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int, int) | يكتب النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى تدفق الإخراج. |
| virtual [Write](./write/)(const ArrayPtr\<char_t\>\&, int, int) | يكتب النطاق الفرعي المحدد من أحرف UTF-16 من مصفوفة الأحرف المحددة إلى تدفق الإخراج. |
| virtual [Write](./write/)(bool) | يكتب بايتًا واحدًا بقيمة 0 إذا كان **value** 'true' و1 إذا كان **value** 'false' إلى تدفق الإخراج. |
| virtual [Write](./write/)(char16_t) | يكتب قيمة الحرف بعرض 16 بت المحددة إلى تدفق الإخراج. |
| virtual [Write](./write/)(int16_t) | يكتب قيمة العدد الصحيح 16‑بت المحددة إلى تدفق الإخراج. |
| virtual [Write](./write/)(int) | يكتب قيمة العدد الصحيح 32‑بت المحددة إلى تدفق الإخراج. |
| virtual [Write](./write/)(int64_t) | يكتب قيمة العدد الصحيح 64‑بت المحددة إلى تدفق الإخراج. |
| virtual [Write](./write/)(uint16_t) | يكتب قيمة العدد الصحيح غير الموقّع 16‑بت المحددة إلى تدفق الإخراج. |
| virtual [Write](./write/)(uint32_t) | يكتب قيمة العدد الصحيح غير الموقّع 32‑بت المحددة إلى تدفق الإخراج. |
| virtual [Write](./write/)(uint64_t) | يكتب قيمة العدد الصحيح غير الموقّع 64‑بت المحددة إلى تدفق الإخراج. |
| virtual [Write](./write/)(float) | يكتب قيمة النقطة العائمة ذات الدقة المفردة المحددة إلى تدفق الإخراج. |
| virtual [Write](./write/)(double) | يكتب قيمة النقطة العائمة ذات الدقة المزدوجة المحددة إلى تدفق الإخراج. |
| virtual [Write](./write/)(const Decimal\&) | يكتب تمثيل البايت للقيمة [Decimal](../../system/decimal/) المحددة إلى تدفق الإخراج. |
| virtual [Write](./write/)(const String\&) | يكتب سلسلة مسبوقة بطول في الترميز الحالي إلى تدفق الإخراج. |
| virtual [Write](./write/)(const char_t *) | يكتب سلسلة مسبوقة بطول في الترميز الحالي إلى تدفق الإخراج. |
| [~BinaryWriter](./~binarywriter/)() | المدمر. |
## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
