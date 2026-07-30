---
title: "System::DateTimeOffset::TryParse 方法"
linktitle: "TryParse"
second_title: "Aspose.Font 适用于 C++"
description: "System::DateTimeOffset::TryParse 方法。尝试使用指定的格式提供程序和格式样式在 C++ 中将指定的字符串转换为 DateTimeOffset 对象。"
type: docs
weight: 5700
url: /zh/cpp/system/datetimeoffset/tryparse/
---
## DateTimeOffset::TryParse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


尝试使用指定的格式提供程序和格式样式将指定的字符串转换为 [DateTimeOffset](../) 对象。

```cpp
static bool System::DateTimeOffset::TryParse(const String &input, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input | const String\& | [String](../../string/) 用于转换。 |
| 提供程序 | const SharedPtr\<IFormatProvider\>\& | 格式提供程序。 |
| styles | Globalization::DateTimeStyles | 日期和时间格式化样式。 |
| result | DateTimeOffset\& | [DateTimeOffset](../) 与 **input** 等价。 |

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
* Library [Aspose.Font for C++](../../../)
## DateTimeOffset::TryParse(const String\&, DateTimeOffset\&) method


尝试将指定的字符串转换为 [DateTimeOffset](../) 对象。

```cpp
static bool System::DateTimeOffset::TryParse(const String &input, DateTimeOffset &result)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input | const String\& | [String](../../string/) 用于转换。 |
| result | DateTimeOffset\& | [DateTimeOffset](../) 与 **input** 等价。 |

### ReturnValue

如果 **input** 转换成功则为 true，否则为 false。

## 另见

* Class [String](../../string/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
