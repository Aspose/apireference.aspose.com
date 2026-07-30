---
title: "System::SmartPtr 类"
linktitle: "SmartPtr"
second_title: "Aspose.Font 适用于 C++"
description: "System::SmartPtr 类。用于包装在堆上分配的类型的指针类。使用它来管理继承 Object 的类的内存。此指针类型遵循侵入式指针语义。引用计数要么存储在 Object 本身，要么存储在与 Object 实例紧密绑定的计数结构中。无论如何，所有 SmartPtr 实例都会形成单一所有权组，这与 std::shared_ptr 类的行为不同。将原始指针转换为 SmartPtr 是安全的，前提是还有其他 SmartPtr 实例持有对同一对象的共享引用。SmartPtr 类实例可以处于两种状态之一：共享指针和弱指针。为了保持对象存活，应该使其共享引用计数为正。弱指针和共享指针都可以用于访问指向的对象（调用方法、读取或写入字段等），但弱指针不参与共享指针的引用计数。当最后一个 ''shared'' SmartPtr 指针被销毁时，对象将被删除。因此，请确保在对象不存在其他共享 SmartPtr 指针时（例如在对象构造或销毁期间）不会发生这种情况。使用 System::Object::ThisProtector 哨兵对象（在 C++ 代码中）或 CppCTORSelfReference、CppSelfReference 属性（在 C# 代码中）来解决此问题。同样，使用 System::WeakPtr 指针类或 System::SmartPtrMode::Weak 指针模式（在 C++ 代码中）或 CppWeakPtr 属性（在 C# 代码中）来打破循环引用。如果两个或更多对象使用 ''shared'' 指针相互引用，它们将永远不会被删除。如果需要在运行时切换指针类型（弱或共享），请使用 System::SmartPtr<T>::set_Mode() 方法或 System::DynamicWeakPtr 类。SmartPtr 类不包含任何虚方法。只有在您自行创建内存管理策略时才应继承它。此类型是用于管理其他对象删除的指针。它应在栈上分配，并在 C++ 中以值或 const 引用方式传递给函数。"
type: docs
weight: 5500
url: /zh/cpp/system/smartptr/
---
## SmartPtr class


用于包装在堆上分配的类型的指针类。使用它来管理继承 [Object](../object/) 的类的内存。此指针类型遵循侵入式指针语义。引用计数要么存储在 [Object](../object/) 本身，要么存储在与 [Object](../object/) 实例紧密绑定的计数结构中。无论如何，所有 [SmartPtr](./) 实例都会形成单一所有权组，这与 std::shared_ptr 类的行为不同。将原始指针转换为 [SmartPtr](./) 是安全的，前提是还有其他 [SmartPtr](./) 实例持有对同一对象的共享引用。[SmartPtr](./) 类实例可以处于两种状态之一：共享指针和弱指针。为了保持对象存活，应该使其共享引用计数为正。弱指针和共享指针都可以用于访问指向的对象（调用方法、读取或写入字段等），但弱指针不参与共享指针的引用计数。[Object](../object/) 在最后一个 'shared' [SmartPtr](./) 指针被销毁时被删除。因此，请确保在对象不存在其他共享 [SmartPtr](./) 指针时（例如在对象构造或销毁期间）不会发生这种情况。使用 System::Object::ThisProtector 哨兵对象（在 C++ 代码中）或 CppCTORSelfReference、CppSelfReference 属性（在 C# 代码中）来解决此问题。同样，使用 [System::WeakPtr](../weakptr/) 指针类或 [System::SmartPtrMode::Weak](../smartptrmode/) 指针模式（在 C++ 代码中）或 CppWeakPtr 属性（在 C# 代码中）来打破循环引用。如果两个或更多对象使用 'shared' 指针相互引用，它们将永远不会被删除。如果需要在运行时切换指针类型（弱或共享），请使用 [System::SmartPtr<T>::set_Mode()](./set_mode/) 方法或 [System::DynamicWeakPtr](../dynamicweakptr/) 类。[SmartPtr](./) 类不包含任何虚方法。只有在您自行创建内存管理策略时才应继承它。此类型是用于管理其他对象删除的指针。它应在栈上分配，并在 C++ 中以值或 const 引用方式传递给函数。

```cpp
template<class T>class SmartPtr
```


| 参数 | 描述 |
| --- | --- |
| T | 指向对象的类型。必须是 [System::Object](../object/) 或其子类。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [begin](./begin/)() | 用于访问底层集合的 [begin()](./begin/) 方法的访问器。仅在 [SmartPtr_](./smartptr_/) 为具有 [begin()](./begin/) 方法的特化类型时编译。 |
| [begin](./begin/)() const | 用于访问底层集合的 [begin()](./begin/) 方法的访问器。仅在 [SmartPtr_](./smartptr_/) 为具有 [begin()](./begin/) 方法的特化类型时编译。 |
| [Cast](./cast/)() const | 将指针强制转换为其自身类型。 |
| [Cast](./cast/)() const | 使用 static_cast 将指针转换为基类型。 |
| [Cast](./cast/)() const | 使用 dynamic_cast 将指针转换为派生类型。 |
| [Cast](./cast/)() const | 使用 dynamic_cast 将指针转换为派生类型。 |
| [cbegin](./cbegin/)() const | 用于访问底层集合的 [cbegin()](./cbegin/) 方法的访问器。仅在 [SmartPtr_](./smartptr_/) 为具有 [cbegin()](./cbegin/) 方法的特化类型时编译。 |
| [cend](./cend/)() const | 用于访问底层集合的 [cend()](./cend/) 方法的访问器。仅在 [SmartPtr_](./smartptr_/) 为具有 [cend()](./cend/) 方法的特化类型时编译。 |
| [const_pointer_cast](./const_pointer_cast/)() const | 使用 const_cast 对指向的对象进行类型转换。 |
| [dynamic_pointer_cast](./dynamic_pointer_cast/)() const | 使用 dynamic_cast 对指向的对象进行类型转换。 |
| [end](./end/)() | 用于访问底层集合的 [end()](./end/) 方法的访问器。仅在 [SmartPtr_](./smartptr_/) 为具有 [end()](./end/) 方法的特化类型时编译。 |
| [end](./end/)() const | 用于访问底层集合的 [end()](./end/) 方法的访问器。仅在 [SmartPtr_](./smartptr_/) 为具有 [end()](./end/) 方法的特化类型时编译。 |
| [get](./get/)() const | 获取指向的对象。 |
| [get_Mode](./get_mode/)() const | 获取指针模式。 |
| [get_shared](./get_shared/)() const | 获取指向的对象，但断言指针处于共享模式。 |
| [get_shared_count](./get_shared_count/)() const | 获取指向被引用对象的共享指针数量，包括当前指针。断言当前指针处于共享模式。 |
| [GetHashCode](./gethashcode/)() const | 对指向的对象调用 [GetHashCode()](./gethashcode/)。 |
| [GetObjectNotNull](./getobjectnotnull/)() const | 获取当前引用的对象（如果有），否则抛出异常。 |
| [GetObjectOrNull](./getobjectornull/)() const | 获取指向的对象（如果有），否则返回 nullptr。等同于 [get()](./get/)。 |
| [GetObjectOwner](./getobjectowner/)() const | 获取被引用的对象。 |
| [GetPointer](./getpointer/)() const | 获取指向的对象（如果有），否则返回 nullptr。等同于 [get()](./get/)。 |
| [Is](./is/)(const System::TypeInfo\&) const | 检查指向的对象是否为特定类型或其子类型。遵循 C# 的 'is' 语义。 |
| [IsAliasingPtr](./isaliasingptr/)() const | 检查指针是否指向除拥有对象之外的其他对象（由别名构造函数创建）。 |
| [IsShared](./isshared/)() const | 检查指针是否处于共享模式。 |
| [IsWeak](./isweak/)() const | 检查指针是否处于弱引用模式。 |
| explicit [operator bool](./operatorbool/)() const | 检查指针是否非空。 |
| [operator!](./operator!/)() const | 检查指针是否为空。 |
| [operator*](./operator_/)() const | 获取指向对象的引用。断言指针非空。 |
| [operator->](./operator-_/)() const | 允许访问被引用对象的成员。 |
| [operator<](./operator_/)(Y *) const | 为 [SmartPtr](./) 类提供小于比较语义。 |
| [operator<](./operator_/)(SmartPtr\<Y\> const\&) const | 为 [SmartPtr](./) 类提供小于比较语义。 |
| [operator=](./operator=/)(SmartPtr_\&&) | 对 [SmartPtr](./) 对象进行移动赋值。x 将变得不可用。 |
| [operator=](./operator=/)(const SmartPtr_\&) | 对 [SmartPtr](./) 对象进行拷贝赋值。 |
| [operator=](./operator=/)(const SmartPtr\<Q\>\&) | 对 [SmartPtr](./) 对象进行拷贝赋值。执行所需的类型转换。 |
| [operator=](./operator=/)(Pointee_ *) | 将原始指针赋给 [SmartPtr](./) 对象。 |
| [operator=](./operator=/)(std::nullptr_t) | 将指针值设为 nullptr。 |
| [operator==](./operator==/)(std::nullptr_t) const | 检查指针是否指向 nullptr。 |
| [operator[]](./operator[]/)(IdxType) const | 数组元素的访问器。仅在 [SmartPtr_](./smartptr_/) 是 [System::Array](../array/) 的特化时编译。 |
| [RemoveAliasing](./removealiasing/)() const | 从指针中移除别名（由别名构造函数创建），确保它管理（如果是共享）或跟踪（如果是弱引用）指向的同一对象。 |
| [reset](./reset/)(Pointee_ *) | 设置指向的对象。 |
| [reset](./reset/)() | 使指针指向 nullptr。 |
| [set_Mode](./set_mode/)(SmartPtrMode) | 设置指针模式。可能会更改被引用对象的引用计数。 |
| [SetContainedTemplateWeakPtr](./setcontainedtemplateweakptr/)(uint32_t) const | 在指向的对象上调用 SetTemplateWeakPtr() 方法（如果有）。 |
| [SmartPtr](./smartptr/)(SmartPtrMode) | 创建所需模式的 [SmartPtr](./) 对象。 |
| [SmartPtr](./smartptr/)(std::nullptr_t, SmartPtrMode) | 创建所需模式的空指针 [SmartPtr](./) 对象。 |
| [SmartPtr](./smartptr/)(Pointee_ *, SmartPtrMode) | 创建指向指定对象的 [SmartPtr](./)，或将原始指针转换为 [SmartPtr](./)。 |
| [SmartPtr](./smartptr/)(const SmartPtr_\&, SmartPtrMode) | 复制构造 [SmartPtr](./) 对象。之后两个指针指向同一对象。 |
| [SmartPtr](./smartptr/)(const SmartPtr\<Q\>\&, SmartPtrMode) | 复制构造 [SmartPtr](./) 对象。之后两个指针指向同一对象。如果允许，则执行类型转换。 |
| [SmartPtr](./smartptr/)(SmartPtr_\&&, SmartPtrMode) | 移动构造 [SmartPtr](./) 对象。实际上，如果两个指针模式相同，则交换它们。调用后 x 可能不可用。 |
| explicit [SmartPtr](./smartptr/)(const SmartPtr\<Array\<Y\>\>\&, SmartPtrMode) | 通过创建不同类型的新数组来转换被引用数组的类型。如果在 C# 中存在 C++ 不支持的数组类型转换，这将非常有用。 |
| explicit [SmartPtr](./smartptr/)(const Y\&) | 初始化空数组。用于翻译某些 C# 代码结构。 |
| [SmartPtr](./smartptr/)(const SmartPtr\<P\>\&, Pointee_ *, SmartPtrMode) | 构造一个与 ptr 初始值共享所有权信息的 [SmartPtr](./)，但持有一个不相关且未管理的指针 p。 |
| [static_pointer_cast](./static_pointer_cast/)() const | 使用 static_cast 对指向的对象进行指针类型转换。 |
| [ToObjectPtr](./toobjectptr/)() const | 将任意指针类型转换为指向 [Object](../object/) 的指针。无需 [Pointee_](./pointee_/) 类型完整。 |
| static [Type](./type/)() | 获取 [Pointee_](./pointee_/) 类型的 [System::TypeInfo](../typeinfo/) 对象的快捷方式。 |
| [~SmartPtr](./~smartptr/)() | 销毁 [SmartPtr](./) 对象。如有必要，减少指向对象的引用计数并删除对象。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [ArrayType](./arraytype/) | 如果是 [System::Array](../array/) 的特化，则与 [Pointee_](./pointee_/) 相同，否则为 void。 |
| [Pointee_](./pointee_/) | 指向的类型。 |
| [SmartPtr_](./smartptr_/) | 特化的智能指针类型。 |
| [ValueType](./valuetype/) | 指向数组的存储类型。仅在 T 为 [System::Array](../array/) 的特化时有意义。 |

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
