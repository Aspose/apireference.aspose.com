---
title: "System::Runtime::Serialization::IFormatterConverter::Convert 方法"
linktitle: "Convert"
second_title: "Aspose.Page 适用于 C++"
description: "System::Runtime::Serialization::IFormatterConverter::Convert 方法。C++ 中的 RTTI 信息。"
type: docs
weight: 100
url: /zh/cpp/system.runtime.serialization/iformatterconverter/convert/
---
## IFormatterConverter::Convert(System::SharedPtr\<Object\>, const TypeInfo\&) method


RTTI 信息。

```cpp
virtual System::SharedPtr<Object> System::Runtime::Serialization::IFormatterConverter::Convert(System::SharedPtr<Object> value, const TypeInfo &type)=0
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | System::SharedPtr\<Object\> | 要转换的对象。 |
| type | const TypeInfo\& | 要将值转换成的 [System::TypeInfo](../../../system/typeinfo/)。 |

### ReturnValue

转换后的值。
## 备注


将值转换为给定的 [System::TypeInfo](../../../system/typeinfo/)。
## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IFormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Page for C++](../../../)
## IFormatterConverter::Convert(System::SharedPtr\<Object\>, TypeCode) method


将值转换为给定的 [System::TypeCode](../../../system/typecode/)。

```cpp
virtual System::SharedPtr<Object> System::Runtime::Serialization::IFormatterConverter::Convert(System::SharedPtr<Object> value, TypeCode typeCode)=0
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | System::SharedPtr\<Object\> | 要转换的对象。 |
| typeCode | TypeCode | 要将值转换成的 [System::TypeCode](../../../system/typecode/)。 |

### ReturnValue

转换后的值。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [TypeCode](../../../system/typecode/)
* Class [IFormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Page for C++](../../../)
