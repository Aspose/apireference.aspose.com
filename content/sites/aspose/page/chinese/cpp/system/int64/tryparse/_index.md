---
title: "System::Int64::TryParse method"
linktitle: "TryParse"
second_title: "Aspose.Page 适用于 C++"
description: "如何在 C++ 中使用 System::Int64 类的 TryParse 方法。"
type: docs
weight: 200
url: /zh/cpp/system/int64/tryparse/
---
## Int64::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, int64_t\&) method




```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, int64_t &result)
```

## 另见

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, int64_t\&) method




```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, int64_t &result)
```

## 另见

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, int64_t\&) method


使用提供的格式信息和数字样式，将包含数字字符串表示的指定字符串转换为等效的 64 位有符号整数。

```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, int64_t &result)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const String\& | 要转换的字符串。 |
| 样式 | Globalization::NumberStyles | NumberStyles 枚举值的按位组合，指定数字字符串表示的允许样式。 |
| 提供程序 | const SharedPtr\<IFormatProvider\>\& | 指向包含字符串格式信息的对象的指针。 |
| 结果 | int64_t\& | 引用一个 64 位有符号整数变量，用于存放转换结果。 |

### ReturnValue

如果转换成功则为 true，否则为 false。

## 另见

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, int64_t\&) method




```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, int64_t &result)
```

## 另见

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::TryParse(const String\&, int64_t\&) method


将包含数字字符串表示的指定字符串转换为等效的 64 位有符号整数。

```cpp
static bool System::Int64::TryParse(const String &value, int64_t &result)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const String\& | 要转换的字符串。 |
| 结果 | int64_t\& | 引用一个 64 位有符号整数变量，用于存放转换结果。 |

### ReturnValue

如果转换成功则为 true，否则为 false。

## 另见

* Class [String](../../string/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
