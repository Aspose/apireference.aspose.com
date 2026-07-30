---
title: "System::Reflection::MemberInfo::GetCustomAttributes 方法"
linktitle: "GetCustomAttributes"
second_title: "Aspose.Font 适用于 C++"
description: "System::Reflection::MemberInfo::GetCustomAttributes 方法。返回一个数组，其中包含表示当前对象在 C++ 中所代表的类型所应用的所有自定义属性的对象。"
type: docs
weight: 700
url: /zh/cpp/system.reflection/memberinfo/getcustomattributes/
---
## MemberInfo::GetCustomAttributes(bool) const method


返回一个数组，包含表示当前对象所代表类型上应用的所有自定义属性的对象。

```cpp
ArrayPtr<SharedPtr<Object>> System::Reflection::MemberInfo::GetCustomAttributes(bool inherit=false) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| inherit | bool | 是否也检查继承的属性。 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [MemberInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## MemberInfo::GetCustomAttributes(const TypeInfo\&, bool) const method


返回一个数组，包含表示当前对象所代表类型上应用的所有自定义属性的对象。

```cpp
ArrayPtr<SharedPtr<Object>> System::Reflection::MemberInfo::GetCustomAttributes(const TypeInfo &attributeType, bool inherit=false) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| attributeType | const TypeInfo\& | 要查找的属性类型。 |
| inherit | bool | 是否也检查继承的属性。 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [MemberInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
