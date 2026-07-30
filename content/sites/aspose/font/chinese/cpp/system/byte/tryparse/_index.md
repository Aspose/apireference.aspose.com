---
title: "System::Byte::TryParse 方法"
linktitle: "TryParse"
second_title: "Aspose.Font 适用于 C++"
description: "如何在 C++ 中使用 System::Byte 类的 TryParse 方法。"
type: docs
weight: 200
url: /zh/cpp/system/byte/tryparse/
---
## Byte::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, uint8_t\&) method




```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, uint8_t &result)
```

## 另见

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Byte::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, uint8_t\&) method




```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, uint8_t &result)
```

## 另见

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Byte::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, uint8_t\&) method


使用提供的格式信息和数字样式，将包含数字字符串表示的指定字符串转换为等价的 8 位无符号整数。

```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, uint8_t &result)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | const String\& | 待转换的字符串。 |
| styles | Globalization::NumberStyles | NumberStyles 枚举值的按位组合，指定数字字符串表示的允许样式。 |
| 提供程序 | const SharedPtr\<IFormatProvider\>\& | 指向包含字符串格式信息的对象的指针。 |
| result | uint8_t\& | 对存放转换结果的 8 位无符号整数变量的引用。 |

### ReturnValue

如果转换成功则为 True，否则为 False。

## 另见

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Byte::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, uint8_t\&) method




```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, uint8_t &result)
```

## 另见

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Byte::TryParse(const String\&, uint8_t\&) method


将包含数字字符串表示的指定字符串转换为等价的 8 位无符号整数。

```cpp
static bool System::Byte::TryParse(const String &value, uint8_t &result)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | const String\& | 待转换的字符串。 |
| result | uint8_t\& | 对存放转换结果的 8 位无符号整数变量的引用。 |

### ReturnValue

如果转换成功则为 True，否则为 False。

## 另见

* Class [String](../../string/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
