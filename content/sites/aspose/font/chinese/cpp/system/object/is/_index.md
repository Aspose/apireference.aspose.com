---
title: "System::Object::Is method"
linktitle: "是"
second_title: "Aspose.Font 适用于 C++"
description: "System::Object::Is method. 检查对象是否表示 targetType 描述的类型实例。相当于 C++ 中的 C# ''is'' 运算符。"
type: docs
weight: 800
url: /zh/cpp/system/object/is/
---
## Object::Is method


检查对象是否表示 targetType 描述的类型实例。相当于 C# 的 'is' 运算符。

```cpp
virtual bool System::Object::Is(const TypeInfo &targetType) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| targetType | const TypeInfo\& | [TypeInfo](../../typeinfo/) 结构，描述用于测试当前对象的类型。 |

### ReturnValue

如果对象是标记类型或其子类，则为 True；否则为 false。

## 另见

* Class [TypeInfo](../../typeinfo/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
