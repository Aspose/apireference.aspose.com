---
title: "System::Globalization::CompareInfo::Compare method"
linktitle: "Compare"
second_title: "Aspose.Font 适用于 C++"
description: "System::Globalization::CompareInfo::Compare 方法。比较字符串。仅在 C++ 中支持 Ordinal 和 OrdinalIgnoreCase 模式。"
type: docs
weight: 200
url: /zh/cpp/system.globalization/compareinfo/compare/
---
## CompareInfo::Compare(const String\&, const String\&, CompareOptions) const method


比较字符串。仅支持 Ordinal 和 OrdinalIgnoreCase 模式。

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &a, const String &b, CompareOptions options) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| a | const String\& | 左侧字符串。 |
| b | const String\& | 右侧字符串。 |
| options | CompareOptions | [String](../../../system/string/) 比较类型。 |

### ReturnValue

如果左侧字符串在右侧字符串之前则为负值，匹配时为零，否则为正值。

## 另见

* Class [String](../../../system/string/)
* Enum [CompareOptions](../../compareoptions/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Font for C++](../../../)
## CompareInfo::Compare(const String\&, const String\&) const method


比较字符串。未实现。

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, const String &string2) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| string1 | const String\& | 左侧字符串。 |
| string2 | const String\& | 右侧字符串。 |

### ReturnValue

如果左侧字符串在右侧字符串之前则为负值，匹配时为零，否则为正值。

## 另见

* Class [String](../../../system/string/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Font for C++](../../../)
## CompareInfo::Compare(const String\&, int, const String\&, int) const method


比较一个字符串的结尾段与第二个字符串的结尾段。未实现。

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, const String &string2, int offset2) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| string1 | const String\& | 第一个字符串。 |
| offset1 | int | **string1** 中字符的起始索引。 |
| string2 | const String\& | 第二个字符串。 |
| offset2 | int | 在 **string2** 中字符的起始索引。 |

### ReturnValue

如果第一个字符串段在第二个字符串段之前则为负值，匹配时为零，否则为正值。

## 另见

* Class [String](../../../system/string/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Font for C++](../../../)
## CompareInfo::Compare(const String\&, int, const String\&, int, CompareOptions) const method


使用字符串比较方法比较一个字符串的结尾段与第二个字符串的结尾段。未实现。

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, const String &string2, int offset2, CompareOptions options) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| string1 | const String\& | 第一个字符串。 |
| offset1 | int | **string1** 中字符的起始索引。 |
| string2 | const String\& | 第二个字符串。 |
| offset2 | int | 在 **string2** 中字符的起始索引。 |
| options | CompareOptions | [String](../../../system/string/) 比较选项。 |

### ReturnValue

如果第一个字符串段在第二个字符串段之前则为负值，匹配时为零，否则为正值。

## 另见

* Class [String](../../../system/string/)
* Enum [CompareOptions](../../compareoptions/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Font for C++](../../../)
## CompareInfo::Compare(const String\&, int, int, const String\&, int, int) const method


比较一个字符串的一段与第二个字符串的一段。未实现。

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, int length1, const String &string2, int offset2, int length2) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| string1 | const String\& | 第一个字符串。 |
| offset1 | int | **string1** 中字符的起始索引。 |
| length1 | int | 要比较的 **string1** 中的字符数。 |
| string2 | const String\& | 第二个字符串。 |
| offset2 | int | 在 **string2** 中字符的起始索引。 |
| length2 | int | 要比较的 **string2** 中的字符数。 |

### ReturnValue

如果第一个字符串段在第二个字符串段之前则为负值，匹配时为零，否则为正值。

## 另见

* Class [String](../../../system/string/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Font for C++](../../../)
## CompareInfo::Compare(const String\&, int, int, const String\&, int, int, CompareOptions) const method


使用字符串比较方法比较一个字符串的一段与第二个字符串的一段。未实现。

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, int length1, const String &string2, int offset2, int length2, CompareOptions options) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| string1 | const String\& | 第一个字符串。 |
| offset1 | int | **string1** 中字符的起始索引。 |
| length1 | int | 要比较的 **string1** 中的字符数。 |
| string2 | const String\& | 第二个字符串。 |
| offset2 | int | 在 **string2** 中字符的起始索引。 |
| length2 | int | 要比较的 **string2** 中的字符数。 |
| options | CompareOptions | [String](../../../system/string/) 比较选项。 |

### ReturnValue

如果第一个字符串段在第二个字符串段之前则为负值，匹配时为零，否则为正值。

## 另见

* Class [String](../../../system/string/)
* Enum [CompareOptions](../../compareoptions/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Font for C++](../../../)
