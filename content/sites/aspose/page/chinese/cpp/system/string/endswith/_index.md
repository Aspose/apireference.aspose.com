---
title: "System::String::EndsWith 方法"
linktitle: "EndsWith"
second_title: "Aspose.Page 适用于 C++"
description: "System::String::EndsWith 方法。 在 C++ 中检查字符串是否以指定子字符串结尾。"
type: docs
weight: 1000
url: /zh/cpp/system/string/endswith/
---
## String::EndsWith(const String\&) const method


检查字符串是否以指定子串结尾。

```cpp
bool System::String::EndsWith(const String &value) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const String\& | 查找字符串。 |

### ReturnValue

如果字符串以指定子字符串结尾则为 true，否则为 false。

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::EndsWith(const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) const method


检查字符串是否以指定子串结尾。

```cpp
bool System::String::EndsWith(const String &value, bool ignoreCase, const SharedPtr<System::Globalization::CultureInfo> &culture=nullptr) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const String\& | 查找字符串。 |
| ignoreCase | bool | 指定比较是否不区分大小写。 |
| 区域性 | const SharedPtr\<System::Globalization::CultureInfo\>\& | 执行字符串比较时使用的区域性。 |

### ReturnValue

如果字符串以指定子字符串结尾则为 true，否则为 false。

## 另见

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::EndsWith(const String\&, System::StringComparison) const method


检查字符串是否以指定子串结尾。

```cpp
bool System::String::EndsWith(const String &value, System::StringComparison comparisonType) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const String\& | 查找字符串。 |
| comparisonType | System::StringComparison | [Comparison](../../comparison/) 模式，详情请参阅 [System::StringComparison](../../stringcomparison/)。 |

### ReturnValue

如果字符串以指定子字符串结尾则为 true，否则为 false。

## 另见

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
