---
title: "System::IConvertible::ToDateTime 方法"
linktitle: "ToDateTime"
second_title: "Aspose.Font 适用于 C++"
description: "System::IConvertible::ToDateTime 方法。将此实例的值转换为等效的 System::DateTime，使用 C++ 中指定的特定区域性格式信息。"
type: docs
weight: 500
url: /zh/cpp/system/iconvertible/todatetime/
---
## IConvertible::ToDateTime method


使用指定的特定区域性格式信息，将此实例的值转换为等效的 [System::DateTime](../../datetime/)。

```cpp
virtual System::DateTime System::IConvertible::ToDateTime(System::SharedPtr<System::IFormatProvider> provider)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| provider | System::SharedPtr\<System::IFormatProvider\> | 提供区域特定格式化信息的 [System::IFormatProvider](../../iformatprovider/) 接口实现。 |

### ReturnValue

一个等同于此实例值的 [System::DateTime](../../datetime/) 实例。

## 另见

* Class [DateTime](../../datetime/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [IConvertible](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
