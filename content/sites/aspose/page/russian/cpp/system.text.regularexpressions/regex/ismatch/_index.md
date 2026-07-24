---
title: "Метод System::Text::RegularExpressions::Regex::IsMatch"
linktitle: "IsMatch"
second_title: "Aspose.Page для C++"
description: "Метод System::Text::RegularExpressions::Regex::IsMatch. Сравнивает регулярное выражение со строкой в C++."
type: docs
weight: 500
url: /ru/cpp/system.text.regularexpressions/regex/ismatch/
---
## Regex::IsMatch(const String\&, int) method


Сопоставляет регулярное выражение со строкой.

```cpp
bool System::Text::RegularExpressions::Regex::IsMatch(const String &input, int startat=0)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| input | const String\& | Целевая строка. |
| startat | int | Начальный индекс. |

### ReturnValue

Истина, если строка соответствует регулярному выражению, иначе ложь.

## См. также

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::IsMatch(const String\&, const String\&, RegexOptions, TimeSpan, int) method


Проверяет, соответствует ли строка шаблону.

```cpp
static bool System::Text::RegularExpressions::Regex::IsMatch(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| input | const String\& | Входная строка. |
| шаблон | const String\& | Шаблон регулярного выражения. |
| параметры | RegexOptions | Параметры сопоставления. |
| matchTimeout | TimeSpan | Тайм-аут. |
| startat | int | [Match](../../match/) начальная позиция. |

### ReturnValue

Истина, если найдено совпадение, иначе ложь.

## См. также

* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
