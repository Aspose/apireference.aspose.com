---
title: "فئة System::IO::StringReader"
linktitle: "StringReader"
second_title: "Aspose.Page لـ C++"
description: "فئة System::IO::StringReader. تمثل قارئًا يقرأ الأحرف من سلسلة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أعطال تأكيدية. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2400
url: /ar/cpp/system.io/stringreader/
---
## StringReader class


تمثل قارئًا يقرأ الأحرف من سلسلة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أعطال تأكيدية. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class StringReader : public System::IO::TextReader
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Close](./close/)() override | يغلق الدفق. |
| [Dispose](./dispose/)() override | لا يفعل شيئًا. |
| [Dispose](./dispose/)(bool) override | لا يفعل شيئًا. |
| [Peek](./peek/)() override | يقرأ حرفًا واحدًا من الدفق دون تغيير موضع الدفق. |
| [Read](./read/)() override | يقرأ حرفًا واحدًا من التدفق. |
| [Read](./read/)(ArrayPtr\<char_t\>, int, int) override | يقرأ العدد المحدد من الأحرف من الدفق إلى مصفوفة الأحرف المحددة بدءًا من الموضع المحدد. |
| [ReadLine](./readline/)() override | يقرأ الأحرف من التدفق حتى نهاية السطر الحالي. |
| [ReadToEnd](./readtoend/)() override | يقرأ الأحرف من التدفق حتى نهاية التدفق. |
| [StringReader](./stringreader/)(const String\&) | ينشئ نسخة جديدة من فئة [StringReader](./) التي تقرأ الأحرف من السلسلة المحددة. |
## انظر أيضًا

* Class [TextReader](../textreader/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
