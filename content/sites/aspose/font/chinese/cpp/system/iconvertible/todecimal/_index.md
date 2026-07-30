---
title: "System::IConvertible::ToDecimal 方法"
linktitle: "ToDecimal"
second_title: "Aspose.Font 适用于 C++"
description: "System::IConvertible::ToDecimal 方法。将此实例的值转换为等效的 System::Decimal 数字，使用 C++ 中指定的特定区域性格式信息。"
type: docs
weight: 600
url: /zh/cpp/system/iconvertible/todecimal/
---
## IConvertible::ToDecimal method


使用指定的特定区域性格式信息，将此实例的值转换为等效的 [System::Decimal](../../decimal/) 数字。

```cpp
virtual System::Decimal System::IConvertible::ToDecimal(System::SharedPtr<System::IFormatProvider> provider)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| provider | System::SharedPtr\<System::IFormatProvider\> | 提供区域特定格式化信息的 [System::IFormatProvider](../../iformatprovider/) 接口实现。 |

### ReturnValue

一个等同于此实例值的 [System::Decimal](../../decimal/) 数字。

## 另见

* Class [Decimal](../../decimal/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [IConvertible](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
