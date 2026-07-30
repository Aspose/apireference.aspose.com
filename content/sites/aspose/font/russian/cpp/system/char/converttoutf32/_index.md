---
title: "Метод System::Char::ConvertToUtf32"
linktitle: "ConvertToUtf32"
second_title: "Aspose.Font для C++"
description: "Метод System::Char::ConvertToUtf32. Преобразует указанную UTF-16 суррогатную пару в кодовую единицу UTF-32 в C++."
type: docs
weight: 200
url: /ru/cpp/system/char/converttoutf32/
---
## Char::ConvertToUtf32(char_t, char_t) method


Преобразует указанную пару суррогатов UTF-16 в кодовую единицу UTF-32.

```cpp
static int System::Char::ConvertToUtf32(char_t highSurrogate, char_t lowSurrogate)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| highSurrogate | char_t | Высокий суррогат UTF-16 суррогатной пары для преобразования |
| lowSurrogate | char_t | Низкий суррогат UTF-16 суррогатной пары для преобразования |

### ReturnValue

Кодовая единица UTF-32, полученная в результате преобразования

## См. также

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Char::ConvertToUtf32(const String\&, int) method


Преобразует значение символа UTF-16 или пары суррогатов, находящихся в указанной позиции строки, в кодовую единицу UTF-32.

```cpp
static int System::Char::ConvertToUtf32(const String &s, int index)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| s | const String\& | Строка, содержащая символ или суррогатную пару |
| индекс | int | Индекс символа или суррогатной пары в указанной строке |

### ReturnValue

Кодовая единица UTF-32, полученная в результате преобразования

## См. также

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
