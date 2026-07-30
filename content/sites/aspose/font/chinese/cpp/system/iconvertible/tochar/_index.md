---
title: "System::IConvertible::ToChar 方法"
linktitle: "ToChar"
second_title: "Aspose.Font 适用于 C++"
description: "System::IConvertible::ToChar 方法。使用 C++ 中指定的区域特定格式信息，将此实例的值转换为等效的 Unicode 字符。"
type: docs
weight: 400
url: /zh/cpp/system/iconvertible/tochar/
---
## IConvertible::ToChar method


使用指定的特定文化格式信息，将此实例的值转换为等效的 Unicode 字符。

```cpp
virtual char_t System::IConvertible::ToChar(System::SharedPtr<System::IFormatProvider> provider)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| provider | System::SharedPtr\<System::IFormatProvider\> | 提供区域特定格式化信息的 [System::IFormatProvider](../../iformatprovider/) 接口实现。 |

### ReturnValue

一个等同于此实例值的 Unicode 字符。

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [IConvertible](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
