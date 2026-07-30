---
title: "System::Collections::Generic::ReverseEnumerator 类"
linktitle: "ReverseEnumerator"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::ReverseEnumerator 类。用于在容器中反向迭代的枚举器。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并在 C++ 中使用该指针将其作为参数传递给函数。"
type: docs
weight: 3800
url: /zh/cpp/system.collections.generic/reverseenumerator/
---
## ReverseEnumerator class


[Enumerator](../baseset/) that reverse-iterates through container. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename Container,typename Element>class ReverseEnumerator : public System::Collections::Generic::IEnumerator<typename Container::value_type>
```


| 参数 | 描述 |
| --- | --- |
| 容器 | 用于迭代的容器。 |
| Element | 元素类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Current](./get_current/)() const override | 获取 “current” 元素。 |
| [IsValid](./isvalid/)() const | 检查是否已调用 [MoveNext()](./movenext/) 且未到达末尾。 |
| [MoveNext](./movenext/)() override | 枚举器式递增。 |
| [Reset](./reset/)() override | 重置枚举器以允许重新枚举元素。 |
| [ReverseEnumerator](./reverseenumerator/)(const Object::ptr\&, Container\&) | 初始化迭代器。 |
| virtual [~ReverseEnumerator](./~reverseenumerator/)() | 析构函数。 |

## 另见

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
