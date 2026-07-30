---
title: "System::String::Equals 方法"
linktitle: "等于"
second_title: "Aspose.Font 适用于 C++"
description: "System::String::Equals 方法。 字符串相等性比较。 在 C++ 中使用 System::StringComparison::Ordinal 比较模式。"
type: docs
weight: 1100
url: /zh/cpp/system/string/equals/
---
## String::Equals(const String\&) const method


[String](../) equality comparison. Uses [System::StringComparison::Ordinal](../../stringcomparison/) comparison mode.

```cpp
bool System::String::Equals(const String &str) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| str | const String\& | [String](../) 与当前字符串进行比较。 |

### ReturnValue

如果字符串匹配则为 true，否则为 false。

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Equals(const String\&, System::StringComparison) const method


[String](../) equality comparison. Several modes provided by [StringComparison](../../stringcomparison/) enumeration are supported.

```cpp
bool System::String::Equals(const String &str, System::StringComparison comparison_type) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| str | const String\& | [String](../) 与当前字符串进行比较。 |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) 模式（详情请参阅 [System::StringComparison](../../stringcomparison/)）。 |

### ReturnValue

如果字符串使用所选比较类型匹配则为 true，否则为 false。

## 另见

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Equals(const String\&, const String\&) method


Equal-compares 两个字符串，使用 Ordial 比较模式。

```cpp
static bool System::String::Equals(const String &strA, const String &strB)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| strA | const String\& | 要比较的第一个字符串。 |
| strB | const String\& | 要比较的第二个字符串。 |

### ReturnValue

如果字符串匹配则为 true，否则为 false。

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Equals(const String\&, const String\&, System::StringComparison) method


Equal-compares 两个字符串。

```cpp
static bool System::String::Equals(const String &strA, const String &strB, System::StringComparison comparison_type)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| strA | const String\& | 要比较的第一个字符串。 |
| strB | const String\& | 要比较的第二个字符串。 |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) 模式。 |

### ReturnValue

如果字符串匹配则为 true，否则为 false。

## 另见

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
