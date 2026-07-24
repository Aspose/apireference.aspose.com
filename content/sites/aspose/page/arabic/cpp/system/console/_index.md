---
title: "الفئة System::Console"
linktitle: "Console"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Console. توفر طرقًا لإخراج البيانات إلى تدفق الإخراج القياسي. هذا نوع ثابت بدون خدمات مثيل. لا يجب عليك أبدًا إنشاء مثيلات له بأي طريقة في C++."
type: docs
weight: 1400
url: /ar/cpp/system/console/
---
## Console class


يقدم طرقًا لإخراج البيانات إلى تدفق الإخراج القياسي. هذا نوع ثابت لا يقدم خدمات مثيل. يجب ألا تنشئ أي نسخ منه بأي وسيلة.

```cpp
class Console
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [Beep](./beep/)() | غير مُنفَّذ. |
| static [get_Error](./get_error/)() | يرجع مؤشرًا مشتركًا يشير إلى الكائن الذي يمثل تدفق الأخطاء القياسي. |
| static [get_In](./get_in/)() | يرجع مؤشرًا مشتركًا يشير إلى الكائن الذي يمثل تدفق الإدخال القياسي. |
| static [get_Out](./get_out/)() | يعيد مؤشرًا مشتركًا يشير إلى الكائن الذي يمثل تدفق الإخراج القياسي. |
| static [Mute](./mute/)(bool) | يكتم أو يلغي كتم تدفق الإخراج القياسي. |
| static [ReadKey](./readkey/)() | غير مُنفَّذ. |
| static [SetError](./seterror/)(const SharedPtr\<System::IO::TextWriter\>\&) | يعين الكائن المحدد إلى خاصية Error في الفئة. |
| static [SetIn](./setin/)(const SharedPtr\<System::IO::TextReader\>\&) | يضبط خاصية In إلى كائن TextReader المحدد. |
| static [SetOut](./setout/)(const SharedPtr\<System::IO::TextWriter\>\&) | يعين الكائن المحدد إلى خاصية Out في الفئة. |
| static [Write](./write/)(const SharedPtr\<T\>\&) | يخرج تمثيل النص للكائن المحدد إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(bool) | يخرج تمثيل النص لقيمة bool إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(char_t) | يخرج قيمة الحرف المحددة إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(const ArrayPtr\<char_t\>\&) | يخرج تمثيل النص لمصفوفة الأحرف المحددة إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(const Decimal\&) | يخرج تمثيل النص لقيمة [Decimal](../decimal/) إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(double) | يخرج تمثيل النص لقيمة عدد عائم بدقة مزدوجة إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(float) | يخرج تمثيل النص لقيمة عدد عائم بدقة مفردة إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(int32_t) | يخرج تمثيل النص لقيمة عدد صحيح 32-بت إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(int64_t) | يخرج تمثيل النص لقيمة عدد صحيح 64-بت إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(const String\&) | يخرج كائن السلسلة المحدد إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(const char_t *) | يخرج السلسلة C المحددة إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(const TypeInfo\&) | يخرج تمثيل النص لقيمة [TypeInfo](../typeinfo/) إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(uint32_t) | يخرج تمثيل النص لقيمة عدد صحيح غير موقع 32-بت إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(uint64_t) | يخرج تمثيل النص لقيمة عدد صحيح غير موقع 64-بت إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | يخرج تمثيل النص للنطاق المحدد من مصفوفة الأحرف المحددة إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(const String\&, Args\&&...) | يخرج تمثيل النص للمعاملات المحددة المُنسقة وفقًا للتنسيق المحدد إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(const char *) |  |
| static [WriteLine](./writeline/)() | يخرج محدد سطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(const SharedPtr\<T\>\&) | يخرج تمثيل النص للكائن المحدد متبوعًا بمحدد سطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(bool) | يخرج تمثيل النص لقيمة bool متبوعًا بمحدد سطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(char_t) | يخرج قيمة الحرف المحددة متبوعة بمحدد سطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) | يخرج تمثيل السلسلة للمصفوفة الحرفية المحددة متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(const Decimal\&) | يخرج تمثيل السلسلة لقيمة [Decimal](../decimal/) متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(double) | يخرج تمثيل السلسلة لقيمة عدد عائم مزدوج الدقة متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(float) | يخرج تمثيل السلسلة لقيمة عدد عائم أحادي الدقة متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(int32_t) | يخرج تمثيل السلسلة لقيمة عدد صحيح 32-بت متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(int64_t) | يخرج تمثيل السلسلة لقيمة عدد صحيح 64-بت متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(const String\&) | يخرج كائن السلسلة المحدد متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(const char_t *) | يخرج السلسلة c-string المحددة متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(const TypeInfo\&) | يخرج تمثيل السلسلة لقيمة [TypeInfo](../typeinfo/) متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(uint32_t) | يخرج تمثيل السلسلة لقيمة عدد صحيح غير موقع 32-بت متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(uint64_t) | يخرج تمثيل السلسلة لقيمة عدد صحيح غير موقع 64-بت متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int, int) | يخرج تمثيل السلسلة للنطاق المحدد من المصفوفة الحرفية المحددة متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(const Exception\&) | يخرج تمثيل السلسلة لكائن [Exception](../exception/) المحدد متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(const String\&, Args\&&...) | يخرج تمثيل السلسلة للمعاملات المحددة المُنسقة وفقًا للتنسيق المحدد متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(const char *) |  |
## ملاحظات



```cpp
#include "system/console.h"
#include <array>

int main()
{
  using namespace System;

  // اطبع رسالة الترحيب.
  Console::WriteLine(u"Hello, world!");

  // أنشئ نسخة من الفئة 'std::array'.
  std::array<int, 5> arr = {1, 2, 3, 4, 5};

  // اطبع عناصر المصفوفة.
  for (auto el: arr)
  {
    Console::Write(u"{0} ", el);
  }
  Console::WriteLine();

  return 0;
}
/*
This code example produces the following output:
Hello, world!
1 2 3 4 5
*/
```

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
