---
title: "System::Decimal::TryParse 方法"
linktitle: "TryParse"
second_title: "Aspose.Font 适用于 C++"
description: "System::Decimal::TryParse 方法。将包含数字字符串表示的指定字符串转换为等价的 Decimal 值（C++）。"
type: docs
weight: 5800
url: /zh/cpp/system/decimal/tryparse/
---
## Decimal::TryParse(const String\&, Decimal\&) method


将包含数字字符串表示的指定字符串转换为等价的 [Decimal](../) 值。

```cpp
static bool System::Decimal::TryParse(const String &value, Decimal &result)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | const String\& | 要转换的字符串 |
| result | Decimal\& | 对 [Decimal](../) 变量的引用，用于存放转换结果 |

### ReturnValue

如果转换成功则为 true，否则为 false

## 另见

* Class [String](../../string/)
* Class [Decimal](../)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Decimal::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, Decimal\&) method


使用提供的格式信息和数字样式，将包含数字字符串表示的指定字符串转换为等价的 [Decimal](../) 值。

```cpp
static bool System::Decimal::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, Decimal &result)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | const String\& | 要转换的字符串 |
| styles | Globalization::NumberStyles | NumberStyles 枚举值的按位组合，指定数字字符串表示允许的样式 |
| 提供程序 | const SharedPtr\<IFormatProvider\>\& | 指向包含字符串格式信息的对象的指针 |
| result | Decimal\& | 输出参数；包含转换结果 |

### ReturnValue

如果转换成功则为 true，否则为 false

## 另见

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Decimal](../)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
