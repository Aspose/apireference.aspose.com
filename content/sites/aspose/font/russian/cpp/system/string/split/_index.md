---
title: "System::String::Split метод"
linktitle: "Разделить"
second_title: "Aspose.Font для C++"
description: "System::String::Split метод. Разбивает строку по символу в C++."
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
| разделитель | char_t | Символ, по которому разбивается строка. |
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
* Library [Aspose.Font for C++](../../../)
## String::Split(char_t, StringSplitOptions) const method


Разделяет строку по символу.

```cpp
ArrayPtr<String> System::String::Split(char_t separator=u' ', StringSplitOptions opt=StringSplitOptions::None) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| разделитель | char_t | Символ, по которому разбивается строка. |
| opt | StringSplitOptions | Параметры разбиения. |

### ReturnValue

[Array](../../array/) of substrings.

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
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
* Library [Aspose.Font for C++](../../../)
## String::Split(const ArrayPtr\<char_t\>\&, int32_t, StringSplitOptions) const method


Разделяет строку по одному из указанных символов.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<char_t> &separators, int32_t count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| separators | const ArrayPtr\<char_t\>\& | [Array](../../array/) символов‑разделителей. Если пустой, любой пробельный символ считается разделителем. |
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
* Library [Aspose.Font for C++](../../../)
## String::Split(const ArrayPtr\<char_t\>\&, StringSplitOptions) const method


Разделяет строку по одному из указанных символов.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<char_t> &separators, StringSplitOptions opt=StringSplitOptions::None) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| separators | const ArrayPtr\<char_t\>\& | [Array](../../array/) символов‑разделителей. Если пустой, любой пробельный символ считается разделителем. |
| opt | StringSplitOptions | Параметры разбиения. |

### ReturnValue

[Array](../../array/) of substrings.

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Split(const ArrayPtr\<String\>\&, int, StringSplitOptions) const method


Разбивает строку по подстроке. В настоящее время поддерживается массив разделителей из нуля или одного элемента.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<String> &separators, int count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| separators | const ArrayPtr\<String\>\& | [Array](../../array/) строк‑разделителей. Если пустой, разбиение не выполняется. |
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
* Library [Aspose.Font for C++](../../../)
## String::Split(const ArrayPtr\<String\>\&, StringSplitOptions) const method


Разделяет строку по подстроке.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<String> &separators, StringSplitOptions opt=StringSplitOptions::None) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| separators | const ArrayPtr\<String\>\& | [Array](../../array/) строк‑разделителей. Если пустой, разбиение не выполняется. |
| opt | StringSplitOptions | Параметры разбиения. |

### ReturnValue

[Array](../../array/) of substrings.

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Split(const String\&, int, StringSplitOptions) const method


Разделяет строку по подстроке.

```cpp
ArrayPtr<String> System::String::Split(const String &separator, int count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| разделитель | const String\& | Подстрока, выступающая в качестве разделителя. Если пустая, пробельный символ выступает в качестве разделителя. |
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
* Library [Aspose.Font for C++](../../../)
## String::Split(const String\&, StringSplitOptions) const method


Разделяет строку по подстроке.

```cpp
ArrayPtr<String> System::String::Split(const String &separator, StringSplitOptions opt=StringSplitOptions::None) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| разделитель | const String\& | Подстрока, выступающая в качестве разделителя. Если пустая, пробельный символ выступает в качестве разделителя. |
| opt | StringSplitOptions | Параметры разбиения. |

### ReturnValue

[Array](../../array/) of substrings.

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
