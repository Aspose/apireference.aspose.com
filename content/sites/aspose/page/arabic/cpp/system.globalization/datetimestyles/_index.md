---
title: "System::Globalization::DateTimeStyles enum"
linktitle: "DateTimeStyles"
second_title: "Aspose.Page لـ C++"
description: "System::Globalization::DateTimeStyles enum. يحدد خيارات تنسيق التاريخ والوقت. أعلام بتية في C++."
type: docs
weight: 3500
url: /ar/cpp/system.globalization/datetimestyles/
---
## DateTimeStyles enum


يحدد خيارات تنسيق التاريخ والوقت. أعلام بت.

```cpp
enum class DateTimeStyles : int32_t
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| لا شيء | 0 | افتراضي. |
| AllowLeadingWhite | 1 | تجاهل المسافات البيضاء الأولية. |
| AllowTrailingWhite | 2 | تجاهل المسافات البيضاء النهائية. |
| AllowInnerWhite | 4 | تجاهل المسافات البيضاء الداخلية. |
| AllowWhiteSpaces | n/a | تجاهل جميع المسافات البيضاء. |
| NoCurrentDateDefault | 8 | عند تحليل سلسلة تاريخ/وقت، إذا كانت جميع قيم السنة/الشهر/اليوم مفقودة، قم بتعيين التاريخ الافتراضي إلى 0001/1/1 بدلاً من السنة/الشهر/اليوم الحالي. |
| AdjustToUniversal | 16 | عند تحليل سلسلة تاريخ/وقت، إذا كان محدد المنطقة الزمنية ("GMT","Z","+xxxx", "-xxxx") موجودًا، سنقوم بضبط الوقت المُحلل بناءً على توقيت غرينتش. |
| AssumeLocal | 32 | إذا لم يتم تحديد منطقة زمنية، استخدم المنطقة الزمنية المحلية. |
| AssumeUniversal | 64 | إذا لم يتم تحديد منطقة زمنية، استخدم توقيت UTC. |
| RoundtripKind | 128 | حاول الحفاظ على ما إذا كان الإدخال غير محدد أو محلي أو UTC. |

## انظر أيضًا

* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
