---
title: "System::IConvertible::ToType 方法"
linktitle: "ToType"
second_title: "Aspose.Font 适用于 C++"
description: "System::IConvertible::ToType 方法。将此实例的值转换为指定 System::Type 的 System::Object，且具有等效值，使用指定的区域特定格式化信息（C++）。"
type: docs
weight: 1400
url: /zh/cpp/system/iconvertible/totype/
---
## IConvertible::ToType method


将此实例的值转换为指定 System::Type 的 [System::Object](../../object/)，且具有等效值，使用指定的区域特定格式化信息。

```cpp
virtual System::SharedPtr<System::Object> System::IConvertible::ToType(const TypeInfo &conversionType, System::SharedPtr<System::IFormatProvider> provider)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| conversionType | const TypeInfo\& | 此实例的值转换为的 System::Type。 |
| provider | System::SharedPtr\<System::IFormatProvider\> | 提供区域特定格式化信息的 [System::IFormatProvider](../../iformatprovider/) 接口实现。 |

### ReturnValue

类型为 conversionType 的 [System::Object](../../object/) 实例，其值等同于此实例的值。

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [IConvertible](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
