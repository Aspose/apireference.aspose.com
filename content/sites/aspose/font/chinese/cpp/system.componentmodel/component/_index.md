---
title: "System::ComponentModel::Component class"
linktitle: "Component"
second_title: "Aspose.Font 适用于 C++"
description: "System::ComponentModel::Component class。用于使使用 Component 类的翻译代码可编译的虚拟类。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 400
url: /zh/cpp/system.componentmodel/component/
---
## Component class


用于使使用 [Component](./) 类的翻译代码可编译的虚拟类。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class Component : public System::MarshalByRefObject,
                  public System::ComponentModel::IComponent
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Component](./component/)() | RTTI 信息。 |
| [Dispose](./dispose/)(bool) | Disposable 模式支持；不执行任何操作。 |
| [get_DesignMode](./get_designmode/)() | 检查组件是否处于设计模式。 |
## 另见

* Class [MarshalByRefObject](../../system/marshalbyrefobject/)
* Class [IComponent](../icomponent/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
