---
title: "System::Int16::TryParse 方法"
linktitle: "TryParse"
second_title: "Aspose.Font 适用于 C++"
description: "如何在 C++ 中使用 System::Int16 类的 TryParse 方法。"
type: docs
weight: 200
url: /zh/cpp/system/int16/tryparse/
---
## Int16::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, int16_t\&) method




```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, int16_t &result)
```

## 另见

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int16::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, int16_t\&) method




```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, int16_t &result)
```

## 另见

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int16::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, int16_t\&) method


使用提供的格式信息和数字样式，将包含数字字符串表示的指定字符串转换为等效的 16 位有符号整数。

```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, int16_t &result)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | const String\& | 待转换的字符串。 |
| styles | Globalization::NumberStyles | NumberStyles 枚举值的按位组合，指定数字字符串表示的允许样式。 |
| 提供程序 | const SharedPtr\<IFormatProvider\>\& | 指向包含字符串格式信息的对象的指针。 |
| result | int16_t\& | 指向存放转换结果的 16 位有符号整数变量的引用。 |

### ReturnValue

如果转换成功则为 True，否则为 False。

## 另见

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int16::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, int16_t\&) method




```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, int16_t &result)
```

## 另见

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int16::TryParse(const String\&, int16_t\&) method


将包含数字字符串表示的指定字符串转换为等效的 16 位有符号整数。

```cpp
static bool System::Int16::TryParse(const String &value, int16_t &result)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | const String\& | 待转换的字符串。 |
| result | int16_t\& | 指向存放转换结果的 16 位有符号整数变量的引用。 |

### ReturnValue

如果转换成功则为 True，否则为 False。

## 另见

* Class [String](../../string/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
