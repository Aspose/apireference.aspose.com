---
title: "System::TypeInfo::IsDefined 方法"
linktitle: "IsDefined"
second_title: "Aspose.Font 适用于 C++"
description: "System::TypeInfo::IsDefined 方法。未实现。指示是否已将指定类型或其派生类型的一个或多个属性应用于此成员（在 C++ 中）。"
type: docs
weight: 4400
url: /zh/cpp/system/typeinfo/isdefined/
---
## TypeInfo::IsDefined method


未实现。指示是否已将指定类型或其派生类型的一个或多个属性应用于此成员。

```cpp
bool System::TypeInfo::IsDefined(const TypeInfo &attributeType, bool inherit) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| attributeType | const TypeInfo\& | 要搜索的自定义属性的类型。搜索包括派生类型。 |
| inherit | bool | true 表示搜索此成员的继承链以查找属性；否则为 false。此参数在属性和事件中被忽略。 |

### ReturnValue

如果已将 attributeType 或其任何派生类型的一个或多个实例应用于此成员，则为 true；否则为 false。

## 另见

* Class [TypeInfo](../)
* Class [TypeInfo](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
