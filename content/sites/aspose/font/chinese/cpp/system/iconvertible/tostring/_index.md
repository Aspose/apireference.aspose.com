---
title: "System::IConvertible::ToString 方法"
linktitle: "ToString"
second_title: "Aspose.Font 适用于 C++"
description: "System::IConvertible::ToString 方法。相当于 C# 的 Object.ToString() 方法。支持在 C++ 中将自定义对象转换为字符串。"
type: docs
weight: 1300
url: /zh/cpp/system/iconvertible/tostring/
---
## IConvertible::ToString() const method


相当于 C# [Object.ToString()](../../object/tostring/) 方法。支持将自定义对象转换为字符串。

```cpp
virtual String System::Object::ToString() const
```


### ReturnValue

[String](../../string/) representation as provided by final class.

## 另见

* Class [String](../../string/)
* Class [IConvertible](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## IConvertible::ToString(System::SharedPtr\<System::IFormatProvider\>) method


使用指定的特定区域性格式信息，将此实例的值转换为等效的 [System::String](../../string/)。

```cpp
virtual System::String System::IConvertible::ToString(System::SharedPtr<System::IFormatProvider> provider)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| provider | System::SharedPtr\<System::IFormatProvider\> | 提供区域特定格式化信息的 [System::IFormatProvider](../../iformatprovider/) 接口实现。 |

### ReturnValue

一个等同于此实例值的 [System::String](../../string/) 实例。

## 另见

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [IConvertible](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
