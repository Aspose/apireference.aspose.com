---
title: "System::String::IndexOfAny метод"
linktitle: "IndexOfAny"
second_title: "Aspose.Page для C++"
description: "System::String::IndexOfAny метод. Поиск символа вперёд в C++."
type: docs
weight: 1600
url: /ru/cpp/system/string/indexofany/
---
## String::IndexOfAny(char_t, int) const method


Прямой поиск символа.

```cpp
int System::String::IndexOfAny(char_t c, int startIndex=0) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| c | char_t | Символ для поиска. |
| startIndex | int | Индекс, с которого начинать поиск. |

### ReturnValue

Индекс первой позиции символа, начиная с startIndex, или -1, если не найден.

## См. также

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&) const method


Ищет любой из переданных символов во всей строке. Сравнивает первый символ строки со всеми символами в anyOf, затем сравнивает второй и так далее. Возвращает индекс первого, совпадающего с любым из целевых символов.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) символов для поиска. Порядок не имеет значения. |

### ReturnValue

Индекс первого совпадающего символа или -1, если не найден.

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t) const method


Ищет любой из переданных символов в подстроке. Сравнивает первый символ строки со всеми символами в anyOf, затем сравнивает второй и так далее. Возвращает индекс первого, совпадающего с любым из целевых символов.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) символов для поиска. Порядок не имеет значения. |
| startindex | int32_t | Индекс, с которого начинается поиск. |

### ReturnValue

Индекс первого совпадающего символа или -1, если не найден.

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const method


Ищет любой из переданных символов в подстроке. Сравнивает первый символ строки со всеми символами в anyOf, затем сравнивает второй и так далее. Возвращает индекс первого, совпадающего с любым из целевых символов.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex, int32_t count) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) символов для поиска. Порядок не имеет значения. |
| startindex | int32_t | Индекс, с которого начинается поиск. |
| count | int32_t | Количество символов для просмотра. |

### ReturnValue

Индекс первого совпадающего символа или -1, если не найден.

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const String\&, int) const method


Соответственно ищет все символы строки str в этом. Если найден первый символ, возвращается его позиция, иначе ищется второй и так далее.

```cpp
int System::String::IndexOfAny(const String &str, int startIndex=0) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| str | const String\& | [String](../) символов для поиска. Порядок символов имеет значение. |
| startIndex | int | Позиция, с которой начинать поиск. |

### ReturnValue

Индекс первого найденного символа или -1, если ничего не найдено.

## См. также

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
