---
title: "Метод System::Char::IsHighSurrogate"
linktitle: "IsHighSurrogate"
second_title: "Aspose.Font для C++"
description: "Метод System::Char::IsHighSurrogate. Определяет, является ли указанный символ старшим суррогатом в C++."
type: docs
weight: 800
url: /ru/cpp/system/char/ishighsurrogate/
---
## Char::IsHighSurrogate(char_t) method


Определяет, является ли указанный символ высоким суррогатом.

```cpp
static bool System::Char::IsHighSurrogate(char_t c)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| c | char_t | Символ для проверки |

### ReturnValue

True, если указанный символ является старшим суррогатом, иначе — false

## См. также

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Char::IsHighSurrogate(const char_t *, int) method


Определяет, является ли символ в указанном индексе в указанном буфере символов высоким суррогатом.

```cpp
static bool System::Char::IsHighSurrogate(const char_t *str, int idx)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| str | const char_t * | Указатель на начало буфера символов |
| idx | int | Нулевой индекс в указанном буфере символа для проверки |

### ReturnValue

True, если символ по указанному индексу является старшим суррогатом, иначе — false

## См. также

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Char::IsHighSurrogate(const String\&, int) method


Определяет, является ли символ в указанном индексе в указанной строке кодовой единицей UTF-16 высокого суррогата.

```cpp
static bool System::Char::IsHighSurrogate(const String &s, int index)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| s | const String\& | Строка |
| индекс | int | Индекс в указанной строке символа для проверки |

### ReturnValue

Истина, если символ по указанному индексу является кодовой единицей UTF-16 high surrogate, иначе - ложь

## См. также

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
