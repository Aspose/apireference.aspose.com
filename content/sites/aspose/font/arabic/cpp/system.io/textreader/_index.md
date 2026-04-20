---
title: "System::IO::TextReader فئة"
linktitle: "TextReader"
second_title: "Aspose.Font لـ C++"
description: "System::IO::TextReader فئة. فئة أساسية للفئات التي تمثل القارئات التي تقرأ تسلسلات من الأحرف من مصادر مختلفة. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2600
url: /ar/cpp/system.io/textreader/
---
## TextReader class


فئة أساسية للفئات التي تمثل القارئات التي تقرأ تسلسلات من الأحرف من مصادر مختلفة. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class TextReader : public System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Close](./close/)() | يغلق الدفق ويحرر الموارد المكتسبة. |
| [Dispose](./dispose/)() override | يحرر جميع الموارد المستخدمة بواسطة الكائن الحالي ويغلق الدفق الأساسي. |
| virtual [Peek](./peek/)() | يقرأ حرفًا واحدًا من الدفق دون تغيير مؤشر القراءة الخاص بالدفق. |
| virtual [Read](./read/)() | يقرأ حرفًا واحدًا من الدفق. |
| virtual [Read](./read/)(ArrayPtr\<char_t\>, int, int) | يقرأ عدد الأحرف المحدد من الدفق ويكتبها إلى مصفوفة الأحرف المحددة بدءًا من الموضع المحدد. |
| virtual [ReadBlock](./readblock/)(ArrayPtr\<char_t\>, int, int) | يقرأ الحد الأقصى المحدد لعدد الأحرف من القارئ النصي الحالي ويكتب البيانات إلى مخزن مؤقت، بدءًا من الفهرس المحدد. |
| virtual [ReadLine](./readline/)() | يقرأ الأحرف من الدفق حتى نهاية السطر الحالي. |
| virtual [ReadToEnd](./readtoend/)() | يقرأ الأحرف من الدفق حتى نهاية الدفق. |
## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
