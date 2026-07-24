---
title: "System::String::Compare 方法"
linktitle: "Compare"
second_title: "Aspose.Page 适用于 C++"
description: "System::String::Compare 方法。小于、等于、大于比较两个字符串（C++）。"
type: docs
weight: 6200
url: /zh/cpp/system/string/compare/
---
## String::Compare(const String\&, const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) method


使用小于-等于-大于比较两个字符串。

```cpp
static int System::String::Compare(const String &strA, const String &strB, bool ignoreCase, const SharedPtr<System::Globalization::CultureInfo> &ci)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| strA | const String\& | 要比较的第一个字符串。 |
| strB | const String\& | 要比较的第二个字符串。 |
| ignoreCase | bool | 指定比较是否不区分大小写。 |
| ci | const SharedPtr\<System::Globalization::CultureInfo\>\& | 用于比较的区域性。 |

### ReturnValue

如果第一个子字符串小于第二个，则返回负值；如果相等则返回零；否则返回正值。

## 另见

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, const String\&, bool) method


使用小于-等于-大于比较两个字符串。

```cpp
static int System::String::Compare(const String &strA, const String &strB, bool ignoreCase=false)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| strA | const String\& | 要比较的第一个字符串。 |
| strB | const String\& | 要比较的第二个字符串。 |
| ignoreCase | bool | 指定比较是否不区分大小写。 |

### ReturnValue

如果第一个子字符串小于第二个，则返回负值；如果相等则返回零；否则返回正值。

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, const String\&, System::StringComparison) method


使用小于-等于-大于比较两个字符串。

```cpp
static int System::String::Compare(const String &strA, const String &strB, System::StringComparison comparison_type)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| strA | const String\& | 要比较的第一个字符串。 |
| strB | const String\& | 要比较的第二个字符串。 |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) 模式。 |

### ReturnValue

如果第一个子字符串小于第二个，则返回负值；如果相等则返回零；否则返回正值。

## 另见

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, int, const String\&, int, int, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) method


使用小于-等于-大于比较两个子字符串。

```cpp
static int System::String::Compare(const String &strA, int indexA, const String &strB, int indexB, int length, bool ignoreCase, const SharedPtr<System::Globalization::CultureInfo> &ci)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| strA | const String\& | 要比较的第一个字符串。 |
| indexA | int | 第一个字符串子串的起始位置。 |
| strB | const String\& | 要比较的第二个字符串。 |
| indexB | int | 第二个字符串子串的起始位置。 |
| length | int | 要比较的字符数。 |
| ignoreCase | bool | 指定比较是否不区分大小写。 |
| ci | const SharedPtr\<System::Globalization::CultureInfo\>\& | 用于比较的区域性。 |

### ReturnValue

如果第一个子字符串小于第二个，则返回负值；如果相等则返回零；否则返回正值。

## 另见

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, int, const String\&, int, int, bool) method


使用小于-等于-大于比较两个子字符串。

```cpp
static int System::String::Compare(const String &strA, int indexA, const String &strB, int indexB, int length, bool ignoreCase=false)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| strA | const String\& | 要比较的第一个字符串。 |
| indexA | int | 第一个字符串子串的起始位置。 |
| strB | const String\& | 要比较的第二个字符串。 |
| indexB | int | 第二个字符串子串的起始位置。 |
| length | int | 要比较的字符数。 |
| ignoreCase | bool | 指定比较是否不区分大小写。 |

### ReturnValue

如果第一个子字符串小于第二个，则返回负值；如果相等则返回零；否则返回正值。

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, int, const String\&, int, int, System::StringComparison) method


使用小于-等于-大于比较两个字符串。

```cpp
static int System::String::Compare(const String &strA, int indexA, const String &strB, int indexB, int length, System::StringComparison comparison_type)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| strA | const String\& | 要比较的第一个字符串。 |
| indexA | int | 第一个字符串子串的起始位置。 |
| strB | const String\& | 要比较的第二个字符串。 |
| indexB | int | 第二个字符串子串的起始位置。 |
| length | int | 要比较的字符数。 |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) 模式。 |

### ReturnValue

如果第一个子字符串小于第二个，则返回负值；如果相等则返回零；否则返回正值。

## 另见

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
