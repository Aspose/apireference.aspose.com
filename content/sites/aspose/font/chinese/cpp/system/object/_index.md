---
title: "System::Object 类"
linktitle: "Object"
second_title: "Aspose.Font 适用于 C++"
description: "System::Object 类。基类，使得能够使用 C# 中 System.Object 类可用的方法。所有在翻译环境中使用的非平凡类都应在 C++ 中继承它。"
type: docs
weight: 4800
url: /zh/cpp/system/object/
---
## Object class


基类，使得能够使用 C# 中 [System.Object](./) 类可用的方法。所有在翻译环境中使用的非平凡类都应继承它。

```cpp
class Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Equals](./equals/)(ptr) | 使用 C# [Object.Equals](./equals/) 语义比较对象。 |
| static [Equals](./equals/)(T1 const\&, T2 const\&) | 以 C# 风格比较引用类型对象。 |
| static [Equals](./equals/)(T1 const\&, T2 const\&) | 以 C# 风格比较值类型对象。 |
| static [Equals](./equals/)(float const\&, float const\&) | 模拟 C# 风格的浮点比较，其中两个 NaN 被视为相等，尽管根据 IEC 60559:1989 标准，NaN 不等于任何值，包括 NaN 本身。 |
| static [Equals](./equals/)(double const\&, double const\&) | 模拟 C# 风格的浮点比较，其中两个 NaN 被视为相等，尽管根据 IEC 60559:1989 标准，NaN 不等于任何值，包括 NaN 本身。 |
| virtual [FastCast](./fastcast/)(const Details::FastRttiBase\&, void **) const | 仅供内部使用。 |
| [GetCounter](./getcounter/)() | 获取与对象关联的引用计数数据结构。 |
| virtual [GetHashCode](./gethashcode/)() const | 相当于 C# [Object.GetHashCode()](./gethashcode/) 方法。支持对自定义对象进行哈希。 |
| virtual [GetType](./gettype/)() const | 获取对象的实际类型。相当于 C# [System.Object.GetType()](./gettype/) 调用。 |
| virtual [Is](./is/)(const TypeInfo\&) const | 检查对象是否表示 targetType 描述的类型实例。相当于 C# 的 'is' 运算符。 |
| [Lock](./lock/)() | 实现 C# lock() 语句的锁定。直接调用或使用 [LockContext](../lockcontext/) 哨兵对象。 |
| virtual [MemberwiseClone](./memberwiseclone/)() const | 相当于 C# [Object.MemberwiseClone()](./memberwiseclone/) 方法。支持克隆自定义类型。 |
| [Object](./object/)() | 创建对象。初始化所有内部数据结构。 |
| [Object](./object/)(Object const\&) | 拷贝构造函数。实际上不复制任何内容，只是初始化新对象并支持子类的拷贝构造。 |
| [operator=](./operator=/)(Object const\&) | 赋值运算符。实际上不复制任何内容，只是初始化新对象并支持子类的拷贝构造。 |
| static [ReferenceEquals](./referenceequals/)(ptr const\&, ptr const\&) | 按引用比较对象。 |
| static [ReferenceEquals](./referenceequals/)(T const\&, T const\&) | 按引用比较对象。 |
| static [ReferenceEquals](./referenceequals/)(T const\&, std::nullptr_t) | 使用引用比较值类型对象与 nullptr。 |
| [ReferenceEquals](./referenceequals/)(String const\&, std::nullptr_t) | 针对字符串和 nullptr 情形的 [Object::ReferenceEquals](./referenceequals/) 特化。 |
| [ReferenceEquals](./referenceequals/)(String const\&, String const\&) | 针对字符串情形的 [Object::ReferenceEquals](./referenceequals/) 特化。 |
| [RemovedSharedRefs](./removedsharedrefs/)(int) | 将共享引用计数减少指定的值。 |
| virtual [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) | 将第 n 个模板参数设置为弱指针（而不是共享指针）。允许在容器中将指针切换为弱模式。 |
| [SharedCount](./sharedcount/)() const | 获取共享引用计数器的当前值。 |
| [SharedRefAdded](./sharedrefadded/)() | 递增共享引用计数。不应直接调用；请改用智能指针或 ThisProtector。 |
| [SharedRefRemovedSafe](./sharedrefremovedsafe/)() | 递减并返回共享引用计数。不应直接调用；请改用智能指针或 ThisProtector。 |
| virtual [ToString](./tostring/)() const | 相当于 C# [Object.ToString()](./tostring/) 方法。用于将自定义对象转换为字符串。 |
| static [Type](./type/)() | 实现 C# typeof([System.Object](./)) 构造。 |
| [Unlock](./unlock/)() | 实现 C# lock() 语句的解锁。可直接调用或使用 [LockContext](../lockcontext/) 哨兵对象。 |
| [WeakRefAdded](./weakrefadded/)() | 递增弱引用计数。不应直接调用；请改用智能指针或 ThisProtector。 |
| [WeakRefRemoved](./weakrefremoved/)() | 递减弱引用计数。不应直接调用；请改用智能指针或 ThisProtector。 |
| virtual [~Object](./~object/)() | 销毁对象。释放所有内部数据结构。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [ptr](./ptr/) | 智能指针类型的别名。 |
## 备注


除了 C# [System.Object](./) 类中可用的方法外，它还支持一些特定于翻译代码环境的概念。这包括智能指针类（[System::SmartPtr](../smartptr/)、[System::WeakPtr](../weakptr/)、[System::DynamicWeakPtr](../dynamicweakptr/)）使用的引用计数以及其他与内存管理、调试等相关的服务。

每个 [Object](./) 都有两个引用计数器：共享引用计数器和弱引用计数器。弱引用计数器始终存放在独立的数据结构中，而不是在 [Object](./) 本身中，这使得弱指针可以在被引用对象被销毁后仍然存在。智能引用计数器可以存放在对象本身或同一独立结构中，取决于 ENABLE_EXTERNAL_REFCOUNT 宏的状态。默认情况下，调试构建时启用，发布构建时禁用。如果智能指针计数器存放在对象本身，则仅在存在指向该对象的弱指针时才创建独立的数据结构。否则，它会与对象本身一起创建。

所有智能指针都使用这两个引用计数器，并且归属于同一个唯一的所有权组。

如果在栈上创建 [Object](./) 的子类，则不能创建指向它的智能指针，否则会出现栈删除问题。

此类型既可以作为值类型在栈上分配，也可以使用 [System::MakeObject()](../makeobject/) 函数在堆上分配。对象分配后，切勿混用这两种情况：严禁将 [SmartPtr](../smartptr/) 指针指向栈分配的对象。
## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
