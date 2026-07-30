---
title: "System::Collections 命名空间"
linktitle: "System::Collections"
second_title: "Aspose.Font 适用于 C++"
description: "如何在 C++ 中使用 System::Collections 命名空间。"
type: docs
weight: 2600
url: /zh/cpp/system.collections/
---



## 类

| 类 | 描述 |
| --- | --- |
| [BitArray](./bitarray/) | [Array](../system/array/) 是可以通过索引访问的位数组。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 new 操作符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [BitArrayPtr](./bitarrayptr/) | 指向 [BitArray](./bitarray/) 的指针。此类型是用于管理其他对象删除的指针。它应在栈上分配，并以值或 const 引用的方式传递给函数。 |
| [CollectionBase](./collectionbase/) | 提供用于强类型集合的抽象基类。 |
| [ICollection](./icollection/) | 定义非泛型集合接口。 |
| [IEnumerable](./ienumerable/) | [IEnumerable](./ienumerable/) 是所有可枚举的非泛型集合的基础接口。 |
| [IEnumerator](./ienumerator/) | 可用于遍历某些元素的枚举器接口。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 new 操作符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [IEnumeratorImplRefType](./ienumeratorimplreftype/) | 包装器，创建基于通用迭代器 [IEnumeratorImplRefType](./ienumeratorimplreftype/) 的非泛型 [IEnumerator](./ienumerator/) 实现——用于引用类型的包装器。 |
| [IEnumeratorImplValueType](./ienumeratorimplvaluetype/) | 包装器，创建基于通用迭代器 [IEnumeratorImplRefType](./ienumeratorimplreftype/) 的非泛型 [IEnumerator](./ienumerator/) 实现——用于值类型的包装器。 |
| [IEqualityComparer](./iequalitycomparer/) |  |
| [IList](./ilist/) | [IList](./ilist/) 表示可以通过索引单独访问的非泛型对象集合。 |
| [IListImplRefType](./ilistimplreftype/) | 存根，在 [System::Collections::Generic::List](../system.collections.generic/list/) 对象上实现 [System::Collections::IList](./ilist/) 接口，适用于引用类型的实现。 |
| [IListImplValueType](./ilistimplvaluetype/) | 存根，在 [System::Collections::Generic::List](../system.collections.generic/list/) 对象上实现 [System::Collections::IList](./ilist/) 接口，适用于值类型的实现。 |
| [IListWrapper](./ilistwrapper/) | 用于支持从泛型集合到非泛型集合的强制转换的接口。 |
| [Invalidatable](./invalidatable/) | 类，使能够通过 [InvalidatableTracker](./invalidatabletracker/) 对象跟踪其后代的状态。 |
| [InvalidatableTracker](./invalidatabletracker/) | 实现 [Invalidatable](./invalidatable/) 对象跟踪器的类。 |
