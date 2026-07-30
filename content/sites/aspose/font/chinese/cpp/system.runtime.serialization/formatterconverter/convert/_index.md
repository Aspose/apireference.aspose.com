---
title: "System::Runtime::Serialization::FormatterConverter::Convert 方法"
linktitle: "Convert"
second_title: "Aspose.Font 适用于 C++"
description: "System::Runtime::Serialization::FormatterConverter::Convert 方法。C++ 中的 RTTI 信息。"
type: docs
weight: 100
url: /zh/cpp/system.runtime.serialization/formatterconverter/convert/
---
## FormatterConverter::Convert(System::SharedPtr\<Object\>, const TypeInfo\&) method


RTTI 信息。

```cpp
System::SharedPtr<Object> System::Runtime::Serialization::FormatterConverter::Convert(System::SharedPtr<Object> value, const TypeInfo &type) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | System::SharedPtr\<Object\> | 待转换的对象。 |
| type | const TypeInfo\& | 要将值转换为的 [System::TypeInfo](../../../system/typeinfo/)。 |

### ReturnValue

已转换的值。
## 备注


将值转换为给定的 [System::TypeInfo](../../../system/typeinfo/)。
## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [FormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Font for C++](../../../)
## FormatterConverter::Convert(System::SharedPtr\<Object\>, TypeCode) method


将值转换为给定的 [System::TypeCode](../../../system/typecode/)。

```cpp
System::SharedPtr<Object> System::Runtime::Serialization::FormatterConverter::Convert(System::SharedPtr<Object> value, TypeCode typeCode) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | System::SharedPtr\<Object\> | 待转换的对象。 |
| typeCode | TypeCode | 要将值转换为的 [System::TypeCode](../../../system/typecode/)。 |

### ReturnValue

已转换的值。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [TypeCode](../../../system/typecode/)
* Class [FormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Font for C++](../../../)
