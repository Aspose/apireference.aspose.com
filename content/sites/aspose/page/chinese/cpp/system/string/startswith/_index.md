---
title: "System::String::StartsWith 方法"
linktitle: "StartsWith"
second_title: "Aspose.Page 适用于 C++"
description: "System::String::StartsWith 方法。检查字符串是否以指定子串开头（C++）。"
type: docs
weight: 4400
url: /zh/cpp/system/string/startswith/
---
## String::StartsWith(const String\&) const method


检查字符串是否以指定的子字符串开头。

```cpp
bool System::String::StartsWith(const String &value) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const String\& | 查找字符串。 |

### ReturnValue

如果字符串以指定子串开头则为 true，否则为 false。

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::StartsWith(const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) const method


检查字符串是否以指定的子字符串开头。

```cpp
bool System::String::StartsWith(const String &value, bool ignoreCase, const SharedPtr<System::Globalization::CultureInfo> &culture=nullptr) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const String\& | 查找字符串。 |
| ignoreCase | bool | 指定比较是否不区分大小写。 |
| 区域性 | const SharedPtr\<System::Globalization::CultureInfo\>\& | 执行字符串比较时使用的区域性。 |

### ReturnValue

如果字符串以指定子串开头则为 true，否则为 false。

## 另见

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::StartsWith(const String\&, System::StringComparison) const method


检查字符串是否以指定的子字符串开头。

```cpp
bool System::String::StartsWith(const String &value, System::StringComparison comparisonType) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const String\& | 查找字符串。 |
| comparisonType | System::StringComparison | [Comparison](../../comparison/) 模式，详情请参阅 [System::StringComparison](../../stringcomparison/)。 |

### ReturnValue

如果字符串以指定子串开头则为 true，否则为 false。

## 另见

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
