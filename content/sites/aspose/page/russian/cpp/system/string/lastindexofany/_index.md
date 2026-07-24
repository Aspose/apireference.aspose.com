---
title: "System::String::LastIndexOfAny method"
linktitle: "LastIndexOfAny"
second_title: "Aspose.Page для C++"
description: "System::String::LastIndexOfAny method. Ищет любой из переданных символов по всей строке в обратном порядке. Сравнивает последний символ строки со всеми символами в anyOf, затем предыдущий и так далее. Возвращает индекс первого найденного совпадения в C++."
type: docs
weight: 2500
url: /ru/cpp/system/string/lastindexofany/
---
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&) const method


Ищет любой из переданных символов во всей строке в обратном порядке. Сравнивает последний символ строки со всеми символами в anyOf, затем сравнивает предыдущий и так далее. Возвращает индекс первого найденного совпадения.

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) символов для поиска. Порядок не имеет значения. |

### ReturnValue

Индекс последнего совпадающего символа или -1, если не найден.

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&, int32_t) const method


Ищет любой из переданных символов в подстроке в обратном порядке. Сравнивает последний символ строки со всеми символами в anyOf, затем сравнивает предыдущий и так далее. Возвращает индекс первого найденного совпадения.

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) символов для поиска. Порядок не имеет значения. |
| startindex | int32_t | Индекс, с которого начинается поиск. |

### ReturnValue

Индекс последнего совпадающего символа или -1, если не найден.

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const method


Ищет любой из переданных символов в подстроке в обратном порядке. Сравнивает последний символ строки со всеми символами в anyOf, затем сравнивает предыдущий и так далее. Возвращает индекс первого найденного совпадения.

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex, int32_t count) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) символов для поиска. Порядок не имеет значения. |
| startindex | int32_t | Индекс, с которого начинается поиск. |
| count | int32_t | Количество символов для просмотра. |

### ReturnValue

Индекс последнего совпадающего символа или -1, если не найден.

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
