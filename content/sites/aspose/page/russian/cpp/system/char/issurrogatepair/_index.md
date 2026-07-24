---
title: "Метод System::Char::IsSurrogatePair"
linktitle: "IsSurrogatePair"
second_title: "Aspose.Page для C++"
description: "Метод System::Char::IsSurrogatePair. Определяет, являются ли два указанных символа парой суррогатов UTF-16 в C++."
type: docs
weight: 1700
url: /ru/cpp/system/char/issurrogatepair/
---
## Char::IsSurrogatePair(char_t, char_t) method


Определяет, являются ли два указанных символа парой суррогатных символов UTF-16.

```cpp
static bool System::Char::IsSurrogatePair(char_t highSurrogate, char_t lowSurrogate)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| highSurrogate | char_t | Символ, проверяемый на то, является ли он высоким суррогатом |
| lowSurrogate | char_t | Символ, проверяемый на то, является ли он низким суррогатом |

### ReturnValue

Истина, если указанные символы образуют пару суррогатов, иначе - ложь

## См. также

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Char::IsSurrogatePair(const String\&, int) method


Определяет, образуют ли два последовательных символа в указанном буфере символов суррогатную пару.

```cpp
static bool System::Char::IsSurrogatePair(const String &str, int index)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| str | const String\& | Строка |
| индекс | int | Нулевой индекс в указанном буфере, с которого начинается последовательность символов для проверки |

### ReturnValue

True, если указанные символы образуют суррогатную пару, иначе — false

## См. также

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
