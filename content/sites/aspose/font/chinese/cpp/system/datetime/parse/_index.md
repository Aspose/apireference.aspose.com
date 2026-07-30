---
title: "System::DateTime::Parse 方法"
linktitle: "解析"
second_title: "Aspose.Font 适用于 C++"
description: "System::DateTime::Parse 方法。将指定的日期时间值的字符串表示转换为等效的 DateTime 对象（C++）。"
type: docs
weight: 6600
url: /zh/cpp/system/datetime/parse/
---
## DateTime::Parse(const String\&) method


将指定的日期时间值的字符串表示转换为等效的 [DateTime](../) 对象。

```cpp
static DateTime System::DateTime::Parse(const String &s)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| s | const String\& | 要转换的日期时间值的字符串表示。 |

### ReturnValue

一个新的 [DateTime](../) 类实例，表示与指定字符串所表示的日期时间值等价的日期时间值。

## 另见

* Class [DateTime](../)
* Class [String](../../string/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::Parse(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::Parse(const String &s, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## 另见

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::Parse(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::Parse(const String &s, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## 另见

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::Parse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


使用特定文化的格式信息，将指定的日期时间值的字符串表示转换为等效的 [DateTime](../) 对象。

```cpp
static DateTime System::DateTime::Parse(const String &s, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| s | const String\& | 要转换的日期时间值的字符串表示。 |
| provider | const SharedPtr\<IFormatProvider\>\& | 提供特定于区域的格式信息的 [IFormatProvider](../../iformatprovider/) 对象。 |
| styles | Globalization::DateTimeStyles | 一个枚举值的按位组合，提供关于 **s** 的附加信息、关于 **s** 中可能出现的样式元素的信息，或关于从 **s** 转换到 [DateTime](../) 对象的信息。 |

### ReturnValue

一个新的 [DateTime](../) 类实例，表示与指定字符串所表示的日期时间值等价的日期时间值。

## 另见

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::Parse(const String\&, std::nullptr_t, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::Parse(const String &s, std::nullptr_t, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## 另见

* Class [DateTime](../)
* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
