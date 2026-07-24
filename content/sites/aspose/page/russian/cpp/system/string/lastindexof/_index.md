---
title: "Метод System::String::LastIndexOf"
linktitle: "LastIndexOf"
second_title: "Aspose.Page для C++"
description: "Метод System::String::LastIndexOf. Обратный поиск символа в C++."
type: docs
weight: 2400
url: /ru/cpp/system/string/lastindexof/
---
## String::LastIndexOf(char_t) const method


Обратный поиск символа.

```cpp
int System::String::LastIndexOf(char_t value) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| value | char_t | Символ для поиска. |

### ReturnValue

Индекс последней позиции символа или -1, если не найдено.

## См. также

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(char_t, int32_t) const method


Обратный поиск символа.

```cpp
int System::String::LastIndexOf(char_t value, int32_t startIndex) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| value | char_t | Символ для поиска. |
| startIndex | int32_t | Индекс, с которого начинать поиск. |

### ReturnValue

Индекс последней позиции символа, начиная с startIndex, или -1, если не найдено.

## См. также

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(char_t, int32_t, int32_t) const method


Обратный поиск символа.

```cpp
int System::String::LastIndexOf(char_t value, int32_t startIndex, int32_t count) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| value | char_t | Символ для поиска. |
| startIndex | int32_t | Индекс, с которого начинать поиск. |
| count | int32_t | Количество символов для просмотра |

### ReturnValue

Индекс последней позиции символа, начиная с startIndex, или -1, если не найдено.

## См. также

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int, System::StringComparison) const method


Обратный поиск подстроки.

```cpp
int System::String::LastIndexOf(const String &str, int startIndex, System::StringComparison comparison_type) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| str | const String\& | Подстрока для поиска. |
| startIndex | int | Позиция в исходной строке, с которой начинать поиск. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) режим. |

### ReturnValue

Индекс последней найденной подстроки или -1, если не найдено. Для пустой строки поиска всегда возвращается длина строки.

## См. также

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int) const method


Обратный поиск подстроки.

```cpp
int System::String::LastIndexOf(const String &str, int startIndex=INT32_MAX) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| str | const String\& | Подстрока для поиска. |
| startIndex | int | Позиция в исходной строке, с которой начинать поиск. |

### ReturnValue

Индекс последней найденной подстроки или -1, если не найдено. Для пустой строки поиска всегда возвращается длина строки.

## См. также

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, System::StringComparison) const method


Обратный поиск подстроки.

```cpp
int System::String::LastIndexOf(const String &str, System::StringComparison comparison_type) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| str | const String\& | Подстрока для поиска. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) режим. |

### ReturnValue

Индекс последней найденной подстроки или -1, если не найдено. Для пустой строки поиска всегда возвращается длина строки.

## См. также

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int, int, StringComparison) const method


Обратный поиск подстроки.

```cpp
int System::String::LastIndexOf(const String &value, int startIndex, int count, StringComparison comparisonType) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| value | const String\& | Подстрока для поиска. |
| startIndex | int | Позиция в исходной строке, с которой начинать поиск. |
| count | int | Количество символов для просмотра. |
| comparisonType | StringComparison | [Comparison](../../comparison/) режим. |

### ReturnValue

Индекс последней найденной подстроки или -1, если не найдено. Для пустой строки поиска всегда возвращается startIndex+count.

## См. также

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
