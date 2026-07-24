---
title: "Метод System::String::Split"
linktitle: "Разделить"
second_title: "Aspose.Page для C++"
description: "Метод System::String::Split. Делит строку по символу в C++."
type: docs
weight: 4300
url: /ru/cpp/system/string/split/
---
## String::Split(char_t, int32_t, StringSplitOptions) const method


Разделяет строку по символу.

```cpp
ArrayPtr<String> System::String::Split(char_t separator, int32_t count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| разделитель | char_t | Символ, по которому делить строку. |
| count | int32_t | Максимальное количество подстрок для возврата. |
| opt | StringSplitOptions | Параметры разбиения. |

### ReturnValue

[Array](../../array/) of substrings.

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(char_t, StringSplitOptions) const method


Разделяет строку по символу.

```cpp
ArrayPtr<String> System::String::Split(char_t separator=u' ', StringSplitOptions opt=StringSplitOptions::None) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| разделитель | char_t | Символ, по которому делить строку. |
| opt | StringSplitOptions | Параметры разбиения. |

### ReturnValue

[Array](../../array/) of substrings.

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(char_t, char_t, StringSplitOptions) const method


Разделяет строку по одному из двух символов.

```cpp
ArrayPtr<String> System::String::Split(char_t separatorA, char_t separatorB, StringSplitOptions opt=StringSplitOptions::None) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| separatorA | char_t | Первый символ, по которому разбивается строка. |
| separatorB | char_t | Второй символ, по которому разбивается строка. |
| opt | StringSplitOptions | Параметры разбиения. |

### ReturnValue

[Array](../../array/) of substrings.

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<char_t\>\&, int32_t, StringSplitOptions) const method


Разделяет строку по одному из указанных символов.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<char_t> &separators, int32_t count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| separators | const ArrayPtr\<char_t\>\& | [Array](../../array/) символов‑разделителей. Если пусто, любой пробельный символ считается разделителем. |
| count | int32_t | Максимальное количество подстрок для возврата. |
| opt | StringSplitOptions | Параметры разбиения. |

### ReturnValue

[Array](../../array/) of substrings.

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<char_t\>\&, StringSplitOptions) const method


Разделяет строку по одному из указанных символов.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<char_t> &separators, StringSplitOptions opt=StringSplitOptions::None) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| separators | const ArrayPtr\<char_t\>\& | [Array](../../array/) символов‑разделителей. Если пусто, любой пробельный символ считается разделителем. |
| opt | StringSplitOptions | Параметры разбиения. |

### ReturnValue

[Array](../../array/) of substrings.

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<String\>\&, int, StringSplitOptions) const method


Разделяет строку по подстроке. В настоящее время поддерживает массив разделителей из нуля или одного элемента.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<String> &separators, int count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| separators | const ArrayPtr\<String\>\& | [Array](../../array/) строк‑разделителей. Если пусто, разбиение не выполняется. |
| count | int | Максимальное количество элементов в массиве разбиений. |
| opt | StringSplitOptions | Параметры разбиения. |

### ReturnValue

[Array](../../array/) of substrings.

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<String\>\&, StringSplitOptions) const method


Разделяет строку по подстроке.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<String> &separators, StringSplitOptions opt=StringSplitOptions::None) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| separators | const ArrayPtr\<String\>\& | [Array](../../array/) строк‑разделителей. Если пусто, разбиение не выполняется. |
| opt | StringSplitOptions | Параметры разбиения. |

### ReturnValue

[Array](../../array/) of substrings.

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const String\&, int, StringSplitOptions) const method


Разделяет строку по подстроке.

```cpp
ArrayPtr<String> System::String::Split(const String &separator, int count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| разделитель | const String\& | Подстрока, выступающая в роли разделителя. Если пусто, пробельный символ выступает как разделитель. |
| count | int | Максимальное количество элементов в массиве разбиений. |
| opt | StringSplitOptions | Параметры разбиения. |

### ReturnValue

[Array](../../array/) of substrings.

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const String\&, StringSplitOptions) const method


Разделяет строку по подстроке.

```cpp
ArrayPtr<String> System::String::Split(const String &separator, StringSplitOptions opt=StringSplitOptions::None) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| разделитель | const String\& | Подстрока, выступающая в роли разделителя. Если пусто, пробельный символ выступает как разделитель. |
| opt | StringSplitOptions | Параметры разбиения. |

### ReturnValue

[Array](../../array/) of substrings.

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
