---
title: "Метод System::Text::RegularExpressions::Regex::Matches"
linktitle: "Совпадения"
second_title: "Aspose.Font для C++"
description: "Метод System::Text::RegularExpressions::Regex::Matches. Получает все совпадения регулярного выражения в заданной строке, выполняя повторяющееся сопоставление в C++."
type: docs
weight: 700
url: /ru/cpp/system.text.regularexpressions/regex/matches/
---
## Regex::Matches(const String\&, int) method


Возвращает все совпадения regex в заданной строке путем повторного сопоставления.

```cpp
MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, int startat=0)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| input | const String\& | Входная строка. |
| startat | int | Индекс, с которого начинать сопоставление. |

### ReturnValue

Коллекция всех найденных совпадений.

## См. также

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
## Regex::Matches(const String\&, const String\&, RegexOptions, TimeSpan, int, int) method


Возвращает все совпадения между строкой и шаблоном.

```cpp
static MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0, int length=0)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| input | const String\& | Входная строка. |
| шаблон | const String\& | Шаблон регулярного выражения. |
| опции | RegexOptions | Параметры сопоставления. |
| matchTimeout | TimeSpan | Тайм‑аут. |
| startat | int | [Match](../../match/) начальная позиция. |
| длина | int | Количество символов для просмотра (0 отключает ограничение). |

### ReturnValue

Все найденные совпадения при повторяющемся сопоставлении.

## См. также

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
