---
title: "System::TypeInfo::GetCustomAttribute 方法"
linktitle: "GetCustomAttribute"
second_title: "Aspose.Page 适用于 C++"
description: "System::TypeInfo::GetCustomAttribute 方法。搜索在 C++ 中应用于当前对象所表示类型且具有指定类型的自定义属性。"
type: docs
weight: 3000
url: /zh/cpp/system/typeinfo/getcustomattribute/
---
## TypeInfo::GetCustomAttribute method


搜索具有指定类型并应用于当前对象表示的类型的自定义属性。

```cpp
ObjectPtr System::TypeInfo::GetCustomAttribute(const TypeInfo &attributeType) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| attributeType | const TypeInfo\& | 对表示要搜索属性类型的 [TypeInfo](../) 对象的常量引用 |

### ReturnValue

指向表示已找到属性的对象的指针；如果没有匹配搜索条件的属性，则为空指针

## 另见

* Class [SmartPtr](../../smartptr/)
* Class [TypeInfo](../)
* Class [TypeInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
