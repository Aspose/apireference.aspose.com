---
title: "System::DateTime::Parse 方法"
linktitle: "解析"
second_title: "Aspose.Page 适用于 C++"
description: "System::DateTime::Parse 方法。将指定的日期时间值的字符串表示转换为等效的 DateTime 对象（在 C++ 中）。"
type: docs
weight: 6600
url: /zh/cpp/system/datetime/parse/
---
## DateTime::Parse(const String\&) method


将指定的日期时间值的字符串表示转换为等效的 [DateTime](../) 对象。

```cpp
static DateTime System::DateTime::Parse(const String &s)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| s | const String\& | 要转换的日期时间值的字符串表示。 |

### ReturnValue

表示与指定字符串等价的日期时间值的 [DateTime](../) 类的新实例。

## 另见

* Class [DateTime](../)
* Class [String](../../string/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
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
* Library [Aspose.Page for C++](../../../)
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
* Library [Aspose.Page for C++](../../../)
## DateTime::Parse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


使用特定于区域的格式信息，将指定的日期时间值的字符串表示转换为等效的 [DateTime](../) 对象。

```cpp
static DateTime System::DateTime::Parse(const String &s, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| s | const String\& | 要转换的日期时间值的字符串表示。 |
| provider | const SharedPtr\<IFormatProvider\>\& | 提供特定文化格式信息的 [IFormatProvider](../../iformatprovider/) 对象。 |
| styles | Globalization::DateTimeStyles | 枚举值的按位组合，提供关于 **s** 的附加信息、关于 **s** 中可能出现的样式元素的信息，或关于 **s** 转换为 [DateTime](../) 对象的信息。 |

### ReturnValue

表示与指定字符串等价的日期时间值的 [DateTime](../) 类的新实例。

## 另见

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
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
* Library [Aspose.Page for C++](../../../)
