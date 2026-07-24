---
title: "System::EnumValuesBase::ToObject 方法"
linktitle: "ToObject"
second_title: "Aspose.Page 适用于 C++"
description: "System::EnumValuesBase::ToObject 方法。将具有整数值的指定对象转换为 C++ 中的枚举成员。"
type: docs
weight: 500
url: /zh/cpp/system/enumvaluesbase/toobject/
---
## EnumValuesBase::ToObject(const TypeInfo\&, const SharedPtr\<Object\>\&) method


将具有整数值的指定对象转换为枚举成员。

```cpp
static SharedPtr<Object> System::EnumValuesBase::ToObject(const TypeInfo &type, const SharedPtr<Object> &value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 类型 | const TypeInfo\& | 要返回的枚举类型。 |
| value | const SharedPtr\<Object\>\& | 要转换为枚举成员的值。 |

### ReturnValue

一个枚举对象，其值为 value。

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [EnumValuesBase](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## EnumValuesBase::ToObject(const TypeInfo\&, uint64_t) method


将指定的 64 位无符号整数值转换为枚举成员。

```cpp
static SharedPtr<Object> System::EnumValuesBase::ToObject(const TypeInfo &type, uint64_t value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 类型 | const TypeInfo\& | 要返回的枚举类型。 |
| value | uint64_t | 要转换为枚举成员的值。 |

### ReturnValue

一个枚举实例，设置为 value。

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [EnumValuesBase](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
