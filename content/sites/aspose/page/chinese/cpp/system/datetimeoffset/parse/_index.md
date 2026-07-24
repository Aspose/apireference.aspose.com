---
title: "System::DateTimeOffset::Parse 方法"
linktitle: "解析"
second_title: "Aspose.Page 适用于 C++"
description: "System::DateTimeOffset::Parse 方法。将指定的字符串转换为等效的 DateTimeOffset，使用 C++。"
type: docs
weight: 5500
url: /zh/cpp/system/datetimeoffset/parse/
---
## DateTimeOffset::Parse(const String\&) method


将指定的字符串转换为 [DateTimeOffset](../) 等价形式。

```cpp
static DateTimeOffset System::DateTimeOffset::Parse(const String &input)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| input | const String\& | [String](../../string/) 用于转换。 |

### ReturnValue

[DateTimeOffset](../) that is equivalent to the **input**.

## 另见

* Class [DateTimeOffset](../)
* Class [String](../../string/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::Parse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


使用指定的格式提供程序和格式样式将指定的字符串转换为 [DateTimeOffset](../) 对象。

```cpp
static DateTimeOffset System::DateTimeOffset::Parse(const String &input, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| input | const String\& | [String](../../string/) 用于转换。 |
| 提供程序 | const SharedPtr\<IFormatProvider\>\& | 格式提供程序。 |
| 样式 | Globalization::DateTimeStyles | 日期和时间格式化样式。 |

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
* Library [Aspose.Page for C++](../../../)
