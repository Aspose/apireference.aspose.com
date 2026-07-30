---
title: "System::DateTime::ToString 方法"
linktitle: "ToString"
second_title: "Aspose.Font 适用于 C++"
description: "System::DateTime::ToString 方法。返回当前对象所表示的日期和时间值的字符串表示形式，使用当前文化定义的格式约定（C++）。"
type: docs
weight: 5200
url: /zh/cpp/system/datetime/tostring/
---
## DateTime::ToString() const method


返回当前对象所表示的日期时间值的字符串表示，使用当前文化定义的格式约定。

```cpp
String System::DateTime::ToString() const
```


### ReturnValue

当前对象所表示的值的字符串表示形式

## 另见

* Class [String](../../string/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::ToString(const SharedPtr\<Globalization::CultureInfo\>\&) const method




```cpp
String System::DateTime::ToString(const SharedPtr<Globalization::CultureInfo> &culture) const
```

## 另见

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::ToString(const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const method




```cpp
String System::DateTime::ToString(const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi) const
```

## 另见

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::ToString(const SharedPtr\<IFormatProvider\>\&) const method


返回当前对象所表示的日期时间值的字符串表示，使用指定的格式信息。

```cpp
String System::DateTime::ToString(const SharedPtr<IFormatProvider> &provider) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 提供程序 | const SharedPtr\<IFormatProvider\>\& | 表示格式信息的对象 |

### ReturnValue

当前对象所表示的值的字符串表示形式，按照 **formatProvider** 提供的格式信息进行格式化。

## 另见

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::ToString(const String\&) const method


返回当前对象所表示的日期时间值的字符串表示，使用指定的格式以及当前文化定义的格式约定。

```cpp
String System::DateTime::ToString(const String &format) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 格式 | const String\& | 格式字符串 |

### ReturnValue

当前对象所表示的值的字符串表示形式，按照 **format** 定义的格式和当前文化进行格式化。

## 另见

* Class [String](../../string/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::ToString(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const method




```cpp
String System::DateTime::ToString(const String &format, const SharedPtr<Globalization::CultureInfo> &culture) const
```

## 另见

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::ToString(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const method




```cpp
String System::DateTime::ToString(const String &format, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi) const
```

## 另见

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::ToString(const String\&, const SharedPtr\<IFormatProvider\>\&) const method


返回当前对象所表示的日期时间值的字符串表示，使用指定的格式信息。

```cpp
String System::DateTime::ToString(const String &format, const SharedPtr<IFormatProvider> &provider) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 格式 | const String\& | 格式字符串 |
| 提供程序 | const SharedPtr\<IFormatProvider\>\& | 表示格式信息的对象 |

### ReturnValue

当前对象所表示的值的字符串表示形式，按照 **provider** 提供的格式信息和格式字符串 **format** 进行格式化。

## 另见

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::ToString(const String\&, std::nullptr_t) const method




```cpp
String System::DateTime::ToString(const String &format, std::nullptr_t) const
```

## 另见

* Class [String](../../string/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::ToString(std::nullptr_t) const method




```cpp
String System::DateTime::ToString(std::nullptr_t) const
```

## 另见

* Class [String](../../string/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
