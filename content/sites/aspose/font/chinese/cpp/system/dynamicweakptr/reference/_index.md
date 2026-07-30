---
title: "System::DynamicWeakPtr::Reference 类"
linktitle: "Reference"
second_title: "Aspose.Font 适用于 C++"
description: "System::DynamicWeakPtr::Reference 类。该引用类确保调用 DynamicWeakPtr::Apply。如果 DynamicWeakPtr 作为 SmartPtr 引用参数传递给可能在 C++ 中对其进行赋值的函数，则使用此类。"
type: docs
weight: 700
url: /zh/cpp/system/dynamicweakptr/reference/
---
## Reference class


[Reference](./) class which ensures that DynamicWeakPtr::Apply is called. Used if [DynamicWeakPtr](../) is passed as [SmartPtr](../../smartptr/) reference parameter to function which may assign to it.

```cpp
class Reference
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [operator DynamicWeakPtr_ &](./operatordynamicweakptr_&/)() const | 转换运算符。允许在需要 [DynamicWeakPtr_](../dynamicweakptr_/) 的上下文中使用 [Reference](./)。 |
| [Reference](./reference/)(DynamicWeakPtr_\&) | 创建智能指针引用。 |
| [Reference](./reference/)(Reference\&&) | 移动构造智能指针引用。 |
| [~Reference](./~reference/)() | 销毁引用。确保对被引用的智能指针调用 Apply()。 |
## 另见

* Class [DynamicWeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
