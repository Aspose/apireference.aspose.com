---
title: "System::Char::ConvertToUtf32 метод"
linktitle: "ConvertToUtf32"
second_title: "Aspose.Page для C++"
description: "System::Char::ConvertToUtf32 метод. Преобразует указанную UTF-16 суррогатную пару в кодовую единицу UTF-32 в C++."
type: docs
weight: 200
url: /ru/cpp/system/char/converttoutf32/
---
## Char::ConvertToUtf32(char_t, char_t) method


Преобразует указанную пару суррогатных кодовых единиц UTF-16 в кодовую единицу UTF-32.

```cpp
static int System::Char::ConvertToUtf32(char_t highSurrogate, char_t lowSurrogate)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| highSurrogate | char_t | Высокий суррогат UTF-16‑пары для преобразования |
| lowSurrogate | char_t | Низкий суррогат UTF-16‑пары для преобразования |

### ReturnValue

Кодовая единица UTF-32, полученная в результате преобразования

## См. также

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Char::ConvertToUtf32(const String\&, int) method


Преобразует значение символа, закодированного в UTF-16, или суррогатной пары в указанной позиции строки в кодовую единицу UTF-32.

```cpp
static int System::Char::ConvertToUtf32(const String &s, int index)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| s | const String\& | Строка, содержащая символ или суррогатную пару |
| индекс | int | Индекс позиции символа или суррогатной пары в указанной строке |

### ReturnValue

Кодовая единица UTF-32, полученная в результате преобразования

## См. также

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
