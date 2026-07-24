---
title: "System::IConvertible::ToType 方法"
linktitle: "ToType"
second_title: "Aspose.Page 适用于 C++"
description: "System::IConvertible::ToType 方法。将此实例的值转换为指定 System::Type 的 System::Object，具有等效值，使用在 C++ 中指定的特定文化格式信息。"
type: docs
weight: 1400
url: /zh/cpp/system/iconvertible/totype/
---
## IConvertible::ToType method


将此实例的值转换为指定 System::Type 的 [System::Object](../../object/)，具有等效值，使用指定的特定文化格式信息。

```cpp
virtual System::SharedPtr<System::Object> System::IConvertible::ToType(const TypeInfo &conversionType, System::SharedPtr<System::IFormatProvider> provider)=0
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| conversionType | const TypeInfo\& | 此实例的值将被转换到的 System::Type。 |
| provider | System::SharedPtr\<System::IFormatProvider\> | 提供特定文化格式信息的 [System::IFormatProvider](../../iformatprovider/) 接口实现。 |

### ReturnValue

类型为 conversionType、其值等同于此实例值的 [System::Object](../../object/) 实例。

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [IConvertible](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
