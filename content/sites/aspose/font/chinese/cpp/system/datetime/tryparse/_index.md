---
title: "System::DateTime::TryParse 方法"
linktitle: "TryParse"
second_title: "Aspose.Font 适用于 C++"
description: "如何在 C++ 中使用 System::DateTime 类的 TryParse 方法。"
type: docs
weight: 6900
url: /zh/cpp/system/datetime/tryparse/
---
## DateTime::TryParse(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles, DateTime &result)
```

## 另见

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParse(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles, DateTime &result)
```

## 另见

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) method


使用指定的特定文化格式信息和样式，将指定的日期时间值的字符串表示转换为等效的 [DateTime](../) 对象。

```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTime &result)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| s | const String\& | 要转换的日期时间值的字符串表示。 |
| provider | const SharedPtr\<IFormatProvider\>\& | 提供特定于区域的格式信息的 [IFormatProvider](../../iformatprovider/) 对象。 |
| styles | Globalization::DateTimeStyles | 一个枚举值的按位组合，提供关于 **s** 的附加信息、关于 **s** 中可能出现的样式元素的信息，或关于从 **s** 转换到 [DateTime](../) 对象的信息。 |
| result | DateTime\& | 输出参数，如果转换成功，则包含转换结果。 |

### ReturnValue

如果转换成功则为 true，否则为 false。

## 另见

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParse(const String\&, DateTime\&) method


将指定的日期时间值的字符串表示转换为等效的 [DateTime](../) 对象。

```cpp
static bool System::DateTime::TryParse(const String &s, DateTime &result)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| s | const String\& | 要转换的日期时间值的字符串表示。 |
| result | DateTime\& | 输出参数，如果转换成功，则包含转换结果。 |

### ReturnValue

如果转换成功则为 true，否则为 false。

## 另见

* Class [String](../../string/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParse(const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, std::nullptr_t, Globalization::DateTimeStyles styles, DateTime &result)
```

## 另见

* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
