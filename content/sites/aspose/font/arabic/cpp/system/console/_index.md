---
title: "System::Console class"
linktitle: "Console"
second_title: "Aspose.Font لـ C++"
description: "System::Console class. يوفر طرقًا لإخراج البيانات إلى تدفق الإخراج القياسي. هذا نوع ثابت بدون خدمات مثيل. لا ينبغي لك أبدًا إنشاء مثيلات منه بأي وسيلة في C++."
type: docs
weight: 1400
url: /ar/cpp/system/console/
---
## Console class


يوفر طرقًا لإخراج البيانات إلى تدفق الإخراج القياسي. هذا نوع ثابت لا يقدم خدمات مثيلات. يجب ألا تنشئ أي مثيلات له بأي وسيلة.

```cpp
class Console
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [Beep](./beep/)() | غير مُنفّذ. |
| static [get_Error](./get_error/)() | يرجع مؤشرًا مشتركًا يشير إلى الكائن الذي يمثل تدفق الأخطاء القياسي. |
| static [get_In](./get_in/)() | يرجع مؤشرًا مشتركًا يشير إلى الكائن الذي يمثل تدفق الإدخال القياسي. |
| static [get_Out](./get_out/)() | يرجع مؤشرًا مشتركًا يشير إلى الكائن الذي يمثل تدفق الإخراج القياسي. |
| static [Mute](./mute/)(bool) | يكتم أو يلغي كتم تدفق الإخراج القياسي. |
| static [ReadKey](./readkey/)() | غير مُنفّذ. |
| static [SetError](./seterror/)(const SharedPtr\<System::IO::TextWriter\>\&) | يُعيّن الكائن المحدد إلى خاصية Error في الفئة. |
| static [SetIn](./setin/)(const SharedPtr\<System::IO::TextReader\>\&) | يضبط خاصية In إلى كائن TextReader المحدد. |
| static [SetOut](./setout/)(const SharedPtr\<System::IO::TextWriter\>\&) | يُعيّن الكائن المحدد إلى خاصية Out في الفئة. |
| static [Write](./write/)(const SharedPtr\<T\>\&) | يُخرج تمثيل السلسلة للكائن المحدد إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(bool) | يُخرج تمثيل السلسلة لقيمة bool إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(char_t) | يُخرج قيمة الحرف المحددة إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(const ArrayPtr\<char_t\>\&) | يُخرج التمثيل النصي للمصفوفة الحرفية المحددة إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(const Decimal\&) | يُخرج التمثيل النصي لقيمة [Decimal](../decimal/) إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(double) | يُخرج التمثيل النصي لقيمة عدد عائم مزدوج الدقة إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(float) | يُخرج التمثيل النصي لقيمة عدد عائم أحادي الدقة إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(int32_t) | يُخرج التمثيل النصي لقيمة عدد صحيح 32‑بت إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(int64_t) | يُخرج التمثيل النصي لقيمة عدد صحيح 64‑بت إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(const String\&) | يُخرج كائن السلسلة المحدد إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(const char_t *) | يُخرج السلسلة c المحددة إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(const TypeInfo\&) | يُخرج التمثيل النصي لقيمة [TypeInfo](../typeinfo/) إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(uint32_t) | يُخرج التمثيل النصي لقيمة عدد صحيح غير موقع 32‑بت إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(uint64_t) | يُخرج التمثيل النصي لقيمة عدد صحيح غير موقع 64‑بت إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | يُخرج التمثيل النصي للنطاق المحدد من المصفوفة الحرفية المحددة إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(const String\&, Args\&&...) | يُخرج التمثيل النصي للمعاملات المحددة المُنسقة وفقًا للتنسيق المحدد إلى تدفق الإخراج القياسي. |
| static [Write](./write/)(const char *) |  |
| static [WriteLine](./writeline/)() | يُخرج فاصل السطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(const SharedPtr\<T\>\&) | يُخرج التمثيل النصي للكائن المحدد متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(bool) | يُخرج التمثيل النصي لقيمة منطقية (bool) متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(char_t) | يُخرج قيمة الحرف المحددة متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) | يُخرج التمثيل النصي للمصفوفة الحرفية المحددة متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(const Decimal\&) | يُخرج التمثيل النصي لقيمة [Decimal](../decimal/) متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(double) | يُخرج التمثيل النصي لقيمة عدد عائم مزدوج الدقة متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(float) | يُخرج التمثيل النصي لقيمة عدد عائم أحادي الدقة متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(int32_t) | يُخرج التمثيل النصي لقيمة عدد صحيح 32‑بت متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(int64_t) | يُخرج التمثيل النصي لقيمة عدد صحيح 64‑بت متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(const String\&) | يُخرج كائن السلسلة المحدد متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(const char_t *) | يُخرج الـ c-string المحدد متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(const TypeInfo\&) | يُخرج تمثيل السلسلة لقيمة [TypeInfo](../typeinfo/) متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(uint32_t) | يُخرج تمثيل السلسلة لقيمة عدد صحيح غير موقع 32-بت متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(uint64_t) | يُخرج تمثيل السلسلة لقيمة عدد صحيح غير موقع 64-بت متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int, int) | يُخرج تمثيل السلسلة للنطاق المحدد من مصفوفة الأحرف المحددة متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(const Exception\&) | يُخرج تمثيل السلسلة للكائن [Exception](../exception/) المحدد متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي. |
| static [WriteLine](./writeline/)(const String\&, Args\&&...) | يُخرج تمثيل السلسلة للمعاملات المحددة المُنسقة وفقًا للتنسيق المحدد متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي. |
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

  // أنشئ مثيلًا من الفئة 'std::array'.
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
* Library [Aspose.Font for C++](../../)
