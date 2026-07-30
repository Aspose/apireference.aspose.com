---
title: "Метод System::String::Equals"
linktitle: "Equals"
second_title: "Aspose.Font для C++"
description: "Метод System::String::Equals. Сравнение строк на равенство. Использует режим сравнения System::StringComparison::Ordinal в C++."
type: docs
weight: 1100
url: /ru/cpp/system/string/equals/
---
## String::Equals(const String\&) const method


[String](../) equality comparison. Uses [System::StringComparison::Ordinal](../../stringcomparison/) comparison mode.

```cpp
bool System::String::Equals(const String &str) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| str | const String\& | [String](../) для сравнения с текущей. |

### ReturnValue

true, если строки совпадают, иначе false.

## См. также

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Equals(const String\&, System::StringComparison) const method


[String](../) equality comparison. Several modes provided by [StringComparison](../../stringcomparison/) enumeration are supported.

```cpp
bool System::String::Equals(const String &str, System::StringComparison comparison_type) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| str | const String\& | [String](../) для сравнения с текущей. |
| comparison_type | System::StringComparison | Режим [Comparison](../../comparison/) (см. [System::StringComparison](../../stringcomparison/) для деталей). |

### ReturnValue

true, если строки совпадают при выбранном типе сравнения, иначе false.

## См. также

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Equals(const String\&, const String\&) method


Equal сравнивает две строки, используя режим сравнения Ordial.

```cpp
static bool System::String::Equals(const String &strA, const String &strB)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| strA | const String\& | Первая строка для сравнения. |
| strB | const String\& | Вторая строка для сравнения. |

### ReturnValue

true, если строки совпадают, иначе false.

## См. также

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Equals(const String\&, const String\&, System::StringComparison) method


Equal сравнивает две строки.

```cpp
static bool System::String::Equals(const String &strA, const String &strB, System::StringComparison comparison_type)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| strA | const String\& | Первая строка для сравнения. |
| strB | const String\& | Вторая строка для сравнения. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) режим. |

### ReturnValue

true, если строки совпадают, иначе false.

## См. также

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
