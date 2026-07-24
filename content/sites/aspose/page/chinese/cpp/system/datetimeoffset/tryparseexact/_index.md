---
title: "System::DateTimeOffset::TryParseExact 方法"
linktitle: "TryParseExact"
second_title: "Aspose.Page 适用于 C++"
description: "System::DateTimeOffset::TryParseExact 方法。尝试在 C++ 中使用指定的格式、格式提供程序和格式化样式将指定的字符串转换为 DateTimeOffset 对象。"
type: docs
weight: 5800
url: /zh/cpp/system/datetimeoffset/tryparseexact/
---
## DateTimeOffset::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


尝试使用指定的格式、格式提供程序和格式化样式将指定的字符串转换为 [DateTimeOffset](../) 对象。

```cpp
static bool System::DateTimeOffset::TryParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| input | const String\& | [String](../../string/) 用于转换。 |
| 格式 | const ArrayPtr\<String\>\& | 格式字符串数组。 |
| 提供程序 | const SharedPtr\<IFormatProvider\>\& | 格式提供程序。 |
| 样式 | Globalization::DateTimeStyles | 日期和时间格式化样式。 |
| result | DateTimeOffset\& | [DateTimeOffset](../) 等价于 **input** 的对象。 |

### ReturnValue

如果 **input** 转换成功则为 true，否则为 false。

## 另见

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::TryParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


尝试使用指定的格式、格式提供程序和格式化样式将指定的字符串转换为 [DateTimeOffset](../) 对象。

```cpp
static bool System::DateTimeOffset::TryParseExact(const String &input, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| input | const String\& | [String](../../string/) 用于转换。 |
| 格式 | const String\& | 格式字符串。 |
| 提供程序 | const SharedPtr\<IFormatProvider\>\& | 格式提供程序。 |
| 样式 | Globalization::DateTimeStyles | 日期和时间格式化样式。 |
| result | DateTimeOffset\& | [DateTimeOffset](../) 等价于 **input** 的对象。 |

### ReturnValue

如果 **input** 转换成功则为 true，否则为 false。

## 另见

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
