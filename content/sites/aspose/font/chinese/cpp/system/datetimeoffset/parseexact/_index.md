---
title: "System::DateTimeOffset::ParseExact 方法"
linktitle: "ParseExact"
second_title: "Aspose.Font 适用于 C++"
description: "System::DateTimeOffset::ParseExact 方法。使用指定的格式、格式提供程序和格式化样式在 C++ 中将指定的字符串转换为 DateTimeOffset 对象。"
type: docs
weight: 5600
url: /zh/cpp/system/datetimeoffset/parseexact/
---
## DateTimeOffset::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


使用指定的格式、格式提供程序和格式化样式将指定的字符串转换为 [DateTimeOffset](../) 对象。

```cpp
static DateTimeOffset System::DateTimeOffset::ParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input | const String\& | [String](../../string/) 用于转换。 |
| formats | const ArrayPtr\<String\>\& | [Array](../../array/) 格式字符串数组。 |
| 提供程序 | const SharedPtr\<IFormatProvider\>\& | 格式提供程序。 |
| styles | Globalization::DateTimeStyles | 日期和时间格式化样式。 |

### ReturnValue

[DateTimeOffset](../) that is equivalent to the **input**.

## 另见

* Class [DateTimeOffset](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTimeOffset::ParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


使用指定的格式、格式提供程序和格式化样式将指定的字符串转换为 [DateTimeOffset](../) 对象。

```cpp
static DateTimeOffset System::DateTimeOffset::ParseExact(const String &input, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input | const String\& | [String](../../string/) 用于转换。 |
| 格式 | const String\& | 格式字符串。 |
| 提供程序 | const SharedPtr\<IFormatProvider\>\& | 格式提供程序。 |
| styles | Globalization::DateTimeStyles | 日期和时间格式化样式。 |

### ReturnValue

[DateTimeOffset](../) that is equivalent to the **input**.

## 另见

* Class [DateTimeOffset](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
