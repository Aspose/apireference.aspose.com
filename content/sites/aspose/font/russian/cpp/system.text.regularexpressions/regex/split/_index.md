---
title: "Метод System::Text::RegularExpressions::Regex::Split"
linktitle: "Разделить"
second_title: "Aspose.Font для C++"
description: "Метод System::Text::RegularExpressions::Regex::Split. Делит строку по совпадениям регулярного выражения в C++."
type: docs
weight: 900
url: /ru/cpp/system.text.regularexpressions/regex/split/
---
## Regex::Split(const String\&) method


Разбивает строку по совпадениям регулярного выражения.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| input | const String\& | [String](../../../system/string/) для разделения строки. |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
## Regex::Split(const String\&, int) method


Разбивает строку по совпадениям регулярного выражения.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| input | const String\& | [String](../../../system/string/) для разделения строки. |
| count | int | Ограничение количества подстрок. |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
## Regex::Split(const String\&, int, int) method


Разбивает входную строку заданное максимальное количество раз на массив подстрок в позициях, определённых регулярным выражением, указанным в конструкторе [Regex](../). Поиск шаблона регулярного выражения начинается с указанной позиции символа во входной строке.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count, int startat)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| input | const String\& | Строка, которую нужно разбить. |
| count | int | Максимальное количество раз, которое может произойти разделение. |
| startat | int | Позиция символа во входной строке, с которой начнётся поиск. |

### ReturnValue

Массив строк.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
## Regex::Split(const String\&, const String\&, int, RegexOptions, TimeSpan) method


Разбивает строку по регулярному выражению.

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, int count, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| input | const String\& | Входная строка. |
| шаблон | const String\& | Шаблон регулярного выражения. |
| count | int | Ограничение количества [Match](../../match/) |
| опции | RegexOptions | Параметры сопоставления. |
| matchTimeout | TimeSpan | Тайм‑аут. |

### ReturnValue

[Array](../../../system/array/) of strings between matchse.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
## Regex::Split(const String\&, const String\&, RegexOptions, TimeSpan) method


Разбивает строку по регулярному выражению.

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| input | const String\& | Входная строка. |
| шаблон | const String\& | Шаблон регулярного выражения. |
| опции | RegexOptions | Параметры сопоставления. |
| matchTimeout | TimeSpan | Тайм‑аут. |

### ReturnValue

[Array](../../../system/array/) of strings between matchse.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
