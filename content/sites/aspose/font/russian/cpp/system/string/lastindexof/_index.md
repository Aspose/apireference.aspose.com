---
title: "System::String::LastIndexOf метод"
linktitle: "LastIndexOf"
second_title: "Aspose.Font для C++"
description: "System::String::LastIndexOf метод. Обратный поиск символа в C++."
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
| значение | char_t | Символ для поиска. |

### ReturnValue

Индекс последнего положения символа или -1, если не найден.

## См. также

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::LastIndexOf(char_t, int32_t) const method


Обратный поиск символа.

```cpp
int System::String::LastIndexOf(char_t value, int32_t startIndex) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | char_t | Символ для поиска. |
| startIndex | int32_t | Индекс, с которого начинать поиск. |

### ReturnValue

Индекс последнего положения символа, начиная с startIndex, или -1, если не найден.

## См. также

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::LastIndexOf(char_t, int32_t, int32_t) const method


Обратный поиск символа.

```cpp
int System::String::LastIndexOf(char_t value, int32_t startIndex, int32_t count) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | char_t | Символ для поиска. |
| startIndex | int32_t | Индекс, с которого начинать поиск. |
| count | int32_t | Количество символов для просмотра |

### ReturnValue

Индекс последнего положения символа, начиная с startIndex, или -1, если не найден.

## См. также

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
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

Индекс последней найденной подстроки или -1, если не найден. Для пустой строки поиска всегда возвращает длину строки.

## См. также

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
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

Индекс последней найденной подстроки или -1, если не найден. Для пустой строки поиска всегда возвращает длину строки.

## См. также

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
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

Индекс последней найденной подстроки или -1, если не найден. Для пустой строки поиска всегда возвращает длину строки.

## См. также

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::LastIndexOf(const String\&, int, int, StringComparison) const method


Обратный поиск подстроки.

```cpp
int System::String::LastIndexOf(const String &value, int startIndex, int count, StringComparison comparisonType) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | const String\& | Подстрока для поиска. |
| startIndex | int | Позиция в исходной строке, с которой начинать поиск. |
| count | int | Количество символов для просмотра. |
| comparisonType | StringComparison | [Comparison](../../comparison/) режим. |

### ReturnValue

Индекс последней найденной подстроки или -1, если не найден. Для пустой строки поиска всегда возвращает startIndex+count.

## См. также

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
