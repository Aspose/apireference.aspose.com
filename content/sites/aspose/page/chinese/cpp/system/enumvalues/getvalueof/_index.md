---
title: "System::EnumValues::GetValueOf 方法"
linktitle: "GetValueOf"
second_title: "Aspose.Page 适用于 C++"
description: "System::EnumValues::GetValueOf 方法。返回在 C++ 中具有指定名称的枚举常量的装箱值。"
type: docs
weight: 500
url: /zh/cpp/system/enumvalues/getvalueof/
---
## EnumValues::GetValueOf(const String\&, bool) const method


返回具有指定名称的枚举常量的装箱值。

```cpp
virtual SharedPtr<Object> System::EnumValues<E, Guard>::GetValueOf(const String &str, bool ignoreCase) const override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| str | const String\& | 枚举常量的名称 |
| ignoreCase | bool | 指定在解释枚举常量名称时是否应忽略大小写 |

### ReturnValue

一个装箱的枚举常量值，其名称在 **str** 中指定。

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [String](../../string/)
* Class [EnumValues](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## EnumValues::GetValueOf(long) const method


返回具有指定值的枚举常量的装箱值。

```cpp
virtual SharedPtr<Object> System::EnumValues<E, Guard>::GetValueOf(long val) const override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| val | long | 枚举常量的值 |

### ReturnValue

一个装箱的枚举常量值，其值在 **str** 中指定。

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [EnumValues](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
