---
title: "System::Text::RegularExpressions::Regex::Matches method"
linktitle: "Совпадения"
second_title: "Aspose.Page для C++"
description: "System::Text::RegularExpressions::Regex::Matches method. Получает все совпадения регулярного выражения в заданной строке, выполняя сопоставление многократно в C++."
type: docs
weight: 700
url: /ru/cpp/system.text.regularexpressions/regex/matches/
---
## Regex::Matches(const String\&, int) method


Получает все совпадения регулярного выражения в заданной строке путем повторного сопоставления.

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
* Library [Aspose.Page for C++](../../../)
## Regex::Matches(const String\&, const String\&, RegexOptions, TimeSpan, int, int) method


Получает все совпадения между строкой и шаблоном.

```cpp
static MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0, int length=0)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| input | const String\& | Входная строка. |
| шаблон | const String\& | Шаблон регулярного выражения. |
| параметры | RegexOptions | Параметры сопоставления. |
| matchTimeout | TimeSpan | Тайм-аут. |
| startat | int | [Match](../../match/) начальная позиция. |
| length | int | Количество символов для просмотра (0 отключает ограничение). |

### ReturnValue

Все найденные совпадения при многократном сопоставлении.

## См. также

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
