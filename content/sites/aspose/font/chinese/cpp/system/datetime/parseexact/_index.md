---
title: "System::DateTime::ParseExact 方法"
linktitle: "ParseExact"
second_title: "Aspose.Font 适用于 C++"
description: "如何在 C++ 中使用 System::DateTime 类的 ParseExact 方法。"
type: docs
weight: 6700
url: /zh/cpp/system/datetime/parseexact/
---
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles)
```

## 另见

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles)
```

## 另见

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


使用指定的格式、特定于区域的格式信息和样式，将指定的日期时间值的字符串表示转换为等效的 [DateTime](../) 对象。字符串表示的格式必须完全匹配一个或多个指定的格式。如果转换失败，将抛出异常。

```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| s | const String\& | 要转换的日期时间值的字符串表示。 |
| 格式 | const ArrayPtr\<String\>\& | 字符串格式数组。 |
| provider | const SharedPtr\<IFormatProvider\>\& | 提供特定于区域的格式信息的 [IFormatProvider](../../iformatprovider/) 对象。 |
| styles | Globalization::DateTimeStyles | 一个枚举值的按位组合，提供关于 **s** 的附加信息、关于 **s** 中可能出现的样式元素的信息，或关于从 **s** 转换到 [DateTime](../) 对象的信息。 |

### ReturnValue

一个新的 [DateTime](../) 类实例，表示与指定字符串所表示的日期时间值等价的日期时间值。

## 另见

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, std::nullptr_t, Globalization::DateTimeStyles styles)
```

## 另见

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::ParseExact(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
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
## DateTime::ParseExact(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
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
## DateTime::ParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


使用指定的格式和特定于区域的格式信息，将指定的日期时间值的字符串表示转换为等效的 [DateTime](../) 对象。字符串表示的格式必须完全匹配指定的格式。如果转换失败，将抛出异常。

```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| s | const String\& | 要转换的日期时间值的字符串表示。 |
| 格式 | const String\& | 字符串格式。 |
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
## DateTime::ParseExact(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, std::nullptr_t, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## 另见

* Class [DateTime](../)
* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
