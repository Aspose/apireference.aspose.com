---
title: "System::IO::StringReader class"
linktitle: "StringReader"
second_title: "Aspose.Font لـ C++"
description: "System::IO::StringReader class. يمثل قارئًا يقرأ الأحرف من سلسلة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على لف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2400
url: /ar/cpp/system.io/stringreader/
---
## StringReader class


يمثل قارئًا يقرأ الأحرف من سلسلة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class StringReader : public System::IO::TextReader
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Close](./close/)() override | يغلق التدفق. |
| [Dispose](./dispose/)() override | لا يفعل شيئًا. |
| [Dispose](./dispose/)(bool) override | لا يفعل شيئًا. |
| [Peek](./peek/)() override | يقرأ حرفًا واحدًا من الدفق دون تغيير موضع الدفق. |
| [Read](./read/)() override | يقرأ حرفًا واحدًا من الدفق. |
| [Read](./read/)(ArrayPtr\<char_t\>, int, int) override | يقرأ العدد المحدد من الأحرف من الدفق إلى مصفوفة الأحرف المحددة بدءًا من الموضع المحدد. |
| [ReadLine](./readline/)() override | يقرأ الأحرف من الدفق حتى نهاية السطر الحالي. |
| [ReadToEnd](./readtoend/)() override | يقرأ الأحرف من الدفق حتى نهاية الدفق. |
| [StringReader](./stringreader/)(const String\&) | ينشئ مثيلًا جديدًا من فئة [StringReader](./) التي تقرأ الأحرف من السلسلة المحددة. |
## انظر أيضًا

* Class [TextReader](../textreader/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
