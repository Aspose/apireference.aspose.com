---
title: "فئة System::IO::TextReader"
linktitle: "TextReader"
second_title: "Aspose.Page لـ C++"
description: "فئة System::IO::TextReader. فئة أساسية للفئات التي تمثل القارئات التي تقرأ سلاسل من الأحرف من مصادر مختلفة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2600
url: /ar/cpp/system.io/textreader/
---
## TextReader class


فئة أساسية للفئات التي تمثل القارئات التي تقرأ سلاسل من الأحرف من مصادر مختلفة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class TextReader : public System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Close](./close/)() | يغلق الدفق ويحرر الموارد المكتسبة. |
| [Dispose](./dispose/)() override | يحرر جميع الموارد المستخدمة بواسطة الكائن الحالي ويغلق الدفق الأساسي. |
| virtual [Peek](./peek/)() | يقرأ حرفًا واحدًا من التدفق دون تغيير مؤشر القراءة في التدفق. |
| virtual [Read](./read/)() | يقرأ حرفًا واحدًا من التدفق. |
| virtual [Read](./read/)(ArrayPtr\<char_t\>, int, int) | يقرأ العدد المحدد من الأحرف من التدفق ويكتبها في مصفوفة الأحرف المحددة بدءًا من الموضع المحدد. |
| virtual [ReadBlock](./readblock/)(ArrayPtr\<char_t\>, int, int) | يقرأ الحد الأقصى المحدد من الأحرف من القارئ النصي الحالي ويكتب البيانات إلى مخزن مؤقت، بدءًا من الفهرس المحدد. |
| virtual [ReadLine](./readline/)() | يقرأ الأحرف من التدفق حتى نهاية السطر الحالي. |
| virtual [ReadToEnd](./readtoend/)() | يقرأ الأحرف من التدفق حتى نهاية التدفق. |
## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
