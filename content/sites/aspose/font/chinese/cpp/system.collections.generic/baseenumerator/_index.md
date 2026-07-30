---
title: "System::Collections::Generic::BaseEnumerator 类"
linktitle: "BaseEnumerator"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::BaseEnumerator 类。枚举器定义，用于将 STL 风格的类型包装为 C# 风格的使用。除顺序迭代器的存在外，不对容器结构做任何断言。使用 begin() 和 end() 函数。此类的对象只能使用 System::MakeObject() 函数进行分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 600
url: /zh/cpp/system.collections.generic/baseenumerator/
---
## BaseEnumerator class


[Enumerator](../baseset/) definition to wrap STL-styled types for C#-styled usage. Makes no assertions on container structure except for existance of sequental iterator. Uses begin() and end() functions. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename Container,typename Element>class BaseEnumerator : public System::Collections::Generic::IEnumerator<Element>
```


| 参数 | 描述 |
| --- | --- |
| 容器 | STL 风格的容器类型。 |
| Element | 元素类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [BaseEnumerator](./baseenumerator/)(const Object::ptr\&, Container\&) | 初始化迭代器。 |
| [IsValid](./isvalid/)() const | 检查是否已调用 [MoveNext()](./movenext/) 且未到达末尾。 |
| [MoveNext](./movenext/)() override | 枚举器式递增。 |
| [Reset](./reset/)() override | 重置枚举器以允许重新枚举元素。 |

## 另见

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
