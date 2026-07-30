---
title: "Метод System::String::Compare"
linktitle: "Compare"
second_title: "Aspose.Font для C++"
description: "Метод System::String::Compare. Сравнение «меньше‑равно‑больше» двух строк в C++."
type: docs
weight: 6200
url: /ru/cpp/system/string/compare/
---
## String::Compare(const String\&, const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) method


Less-equal-greater сравнивает две строки.

```cpp
static int System::String::Compare(const String &strA, const String &strB, bool ignoreCase, const SharedPtr<System::Globalization::CultureInfo> &ci)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| strA | const String\& | Первая строка для сравнения. |
| strB | const String\& | Вторая строка для сравнения. |
| ignoreCase | bool | Указывает, является ли сравнение нечувствительным к регистру. |
| ci | const SharedPtr\<System::Globalization::CultureInfo\>\& | Культура, используемая для сравнения. |

### ReturnValue

Отрицательное значение, если первая подстрока меньше второй, ноль, если они совпадают, положительное значение в остальных случаях.

## См. также

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Compare(const String\&, const String\&, bool) method


Less-equal-greater сравнивает две строки.

```cpp
static int System::String::Compare(const String &strA, const String &strB, bool ignoreCase=false)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| strA | const String\& | Первая строка для сравнения. |
| strB | const String\& | Вторая строка для сравнения. |
| ignoreCase | bool | Указывает, является ли сравнение нечувствительным к регистру. |

### ReturnValue

Отрицательное значение, если первая подстрока меньше второй, ноль, если они совпадают, положительное значение в остальных случаях.

## См. также

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Compare(const String\&, const String\&, System::StringComparison) method


Less-equal-greater сравнивает две строки.

```cpp
static int System::String::Compare(const String &strA, const String &strB, System::StringComparison comparison_type)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| strA | const String\& | Первая строка для сравнения. |
| strB | const String\& | Вторая строка для сравнения. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) режим. |

### ReturnValue

Отрицательное значение, если первая подстрока меньше второй, ноль, если они совпадают, положительное значение в остальных случаях.

## См. также

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Compare(const String\&, int, const String\&, int, int, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) method


Less-equal-greater сравнивает две подстроки.

```cpp
static int System::String::Compare(const String &strA, int indexA, const String &strB, int indexB, int length, bool ignoreCase, const SharedPtr<System::Globalization::CultureInfo> &ci)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| strA | const String\& | Первая строка для сравнения. |
| indexA | int | Начало первой подстроки строки. |
| strB | const String\& | Вторая строка для сравнения. |
| indexB | int | Начало второй подстроки строки. |
| длина | int | Количество символов для сравнения. |
| ignoreCase | bool | Указывает, является ли сравнение нечувствительным к регистру. |
| ci | const SharedPtr\<System::Globalization::CultureInfo\>\& | Культура, используемая для сравнения. |

### ReturnValue

Отрицательное значение, если первая подстрока меньше второй, ноль, если они совпадают, положительное значение в остальных случаях.

## См. также

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Compare(const String\&, int, const String\&, int, int, bool) method


Less-equal-greater сравнивает две подстроки.

```cpp
static int System::String::Compare(const String &strA, int indexA, const String &strB, int indexB, int length, bool ignoreCase=false)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| strA | const String\& | Первая строка для сравнения. |
| indexA | int | Начало первой подстроки строки. |
| strB | const String\& | Вторая строка для сравнения. |
| indexB | int | Начало второй подстроки строки. |
| длина | int | Количество символов для сравнения. |
| ignoreCase | bool | Указывает, является ли сравнение нечувствительным к регистру. |

### ReturnValue

Отрицательное значение, если первая подстрока меньше второй, ноль, если они совпадают, положительное значение в остальных случаях.

## См. также

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Compare(const String\&, int, const String\&, int, int, System::StringComparison) method


Less-equal-greater сравнивает две строки.

```cpp
static int System::String::Compare(const String &strA, int indexA, const String &strB, int indexB, int length, System::StringComparison comparison_type)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| strA | const String\& | Первая строка для сравнения. |
| indexA | int | Начало первой подстроки строки. |
| strB | const String\& | Вторая строка для сравнения. |
| indexB | int | Начало второй подстроки строки. |
| длина | int | Количество символов для сравнения. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) режим. |

### ReturnValue

Отрицательное значение, если первая подстрока меньше второй, ноль, если они совпадают, положительное значение в остальных случаях.

## См. также

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
