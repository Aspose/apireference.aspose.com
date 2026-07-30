---
title: "System::Globalization::DateTimeStyles تعداد"
linktitle: "DateTimeStyles"
second_title: "Aspose.Font لـ C++"
description: "System::Globalization::DateTimeStyles تعداد. يعرّف خيارات تنسيق التاريخ والوقت. أعلام بتية في C++."
type: docs
weight: 3500
url: /ar/cpp/system.globalization/datetimestyles/
---
## DateTimeStyles enum


يحدد خيارات تنسيق التاريخ والوقت. أعلام البت.

```cpp
enum class DateTimeStyles : int32_t
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| None | 0 | الافتراضي. |
| AllowLeadingWhite | 1 | تجاهل المسافات البيضاء الأولية. |
| AllowTrailingWhite | 2 | تجاهل المسافات البيضاء النهائية. |
| AllowInnerWhite | 4 | تجاهل المسافات البيضاء الداخلية. |
| AllowWhiteSpaces | غير متوفر | تجاهل جميع المسافات البيضاء. |
| NoCurrentDateDefault | 8 | عند تحليل سلسلة تاريخ/وقت، إذا كانت جميع قيم السنة/الشهر/اليوم مفقودة، اضبط التاريخ الافتراضي إلى 0001/1/1 بدلاً من السنة/الشهر/اليوم الحالي. |
| AdjustToUniversal | 16 | عند تحليل سلسلة تاريخ/وقت، إذا كان هناك محدد منطقة زمنية (\"GMT\",\"Z\",\"+xxxx\", \"-xxxx\"), سنقوم بضبط الوقت المُحلل بناءً على GMT. |
| AssumeLocal | 32 | إذا لم يتم تحديد منطقة زمنية، استخدم المنطقة الزمنية المحلية. |
| AssumeUniversal | 64 | إذا لم يتم تحديد منطقة زمنية، استخدم UTC. |
| RoundtripKind | 128 | حاول الحفاظ على ما إذا كان الإدخال غير محدد أو محلي أو UTC. |

## انظر أيضًا

* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
