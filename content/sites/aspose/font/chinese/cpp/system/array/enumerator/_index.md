---
title: "System::Array::Enumerator 类"
linktitle: "枚举器"
second_title: "Aspose.Font 适用于 C++"
description: "System::Array::Enumerator 类。实现 IEnumerator 接口，支持枚举 Array 对象的元素。该类的对象只能使用 System::MakeObject() 函数进行分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 6800
url: /zh/cpp/system/array/enumerator/
---
## Enumerator class


实现 IEnumerator 接口，支持枚举 [Array](../) 对象的元素。该类的对象只能使用 [System::MakeObject()](../../makeobject/) 函数进行分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class Enumerator : public virtual System::Object,
                   public System::Collections::Generic::IEnumerator<T>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Enumerator](./enumerator/)(const SharedPtr\<Array\<T\>\>\&) | 构造一个新的 [Enumerator](./) 对象，表示指定的数组。 |
| [get_Current](./get_current/)() const override | 返回当前元素的副本。 |
| [MoveNext](./movenext/)() override | 检查当前元素的索引是否未指向数组中的最后一个元素，并在未指向时将其前进。 |
| [Reset](./reset/)() override | 重置当前元素的索引。 |
| virtual [~Enumerator](./~enumerator/)() | 析构函数。 |
## 另见

* Class [Object](../../object/)
* Class [IEnumerator](../../../system.collections.generic/ienumerator/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
