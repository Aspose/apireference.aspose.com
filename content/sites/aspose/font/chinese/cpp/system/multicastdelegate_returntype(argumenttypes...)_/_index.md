---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)> 类"
linktitle: "MulticastDelegate< ReturnType(ArgumentTypes...)>"
second_title: "Aspose.Font 适用于 C++"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)> 类。表示委托的集合。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 System::SmartPtr 类来管理此类型的对象（在 C++ 中）。"
type: docs
weight: 4500
url: /zh/cpp/system/multicastdelegate_returntype(argumenttypes...)_/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)> class


表示委托的集合。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](../smartptr/) 类来管理此类型的对象。

```cpp
template<class ReturnType,class...>class MulticastDelegate< ReturnType(ArgumentTypes...)> : public System::Details::DelegateHoldingVariables
```


| 参数 | 描述 |
| --- | --- |
| ReturnType | 集合中每个委托指向的可调用实体的返回类型 |
| ArgumentTypes | 集合中每个委托指向的可调用实体的参数列表 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [BeginInvoke](./begininvoke/)(ArgumentTypes..., const AsyncCallback\&, const CallbackArgumentType\&) | 未实现。 |
| [connect](./connect/)(Callback) | 将指定的委托添加到集合中。 |
| [connect](./connect/)(std::function\<R(Args...)>) | 将指定的函数对象添加到委托集合中。函数对象在添加到集合之前会被转换为 [Callback](./callback/) 委托类型。 |
| [connect](./connect/)(MulticastDelegate\&) | 将指定的 MulticastDelegate 对象添加到委托集合中。 |
| [connect](./connect/)(MemberType ClassType::*, ClassType *) | 将指定对象的指定非静态方法添加到委托集合中。 |
| [connect](./connect/)(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) | 将指定对象的指定非静态方法添加到委托集合中。 |
| [disconnect](./disconnect/)(Callback) | 从委托集合中移除指定的委托。 |
| [disconnect](./disconnect/)(MemberType ClassType::*, ClassType *) | 从委托集合中移除指定对象的指定非静态方法。 |
| [disconnect](./disconnect/)(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) | 从委托集合中移除指定对象的指定非静态方法。 |
| [disconnect](./disconnect/)(MulticastDelegate\&) | 从委托集合中移除指定的 MulticastDelegate 对象。 |
| [disconnect_all_slots](./disconnect_all_slots/)() | 从委托集合中移除所有委托。 |
| [empty](./empty/)() const | 确定委托集合是否为空。 |
| [EndInvoke](./endinvoke/)(const SharedPtr\<IAsyncResult\>\&) | 未实现。 |
| [Equals](./equals/)(const MulticastDelegate\&) |  |
| [GetHashCode](./gethashcode/)() const |  |
| [GetType](./gettype/)() const |  |
| [invoke](./invoke/)(ArgumentTypes...) const | 调用委托集合中当前存在的所有委托。委托按照添加到集合的顺序依次调用。该方法在委托执行期间会阻塞。 |
| [IsNull](./isnull/)() const | 确定委托集合是否为空。 |
| [MulticastDelegate](./multicastdelegate/)() | 构造一个空集合。 |
| [MulticastDelegate](./multicastdelegate/)(std::nullptr_t) | 等同于默认构造函数。 |
| [MulticastDelegate](./multicastdelegate/)(const MulticastDelegate\&) | 对委托集合执行浅拷贝。 |
| [MulticastDelegate](./multicastdelegate/)(MulticastDelegate\&&) | 移动构造函数。 |
| [MulticastDelegate](./multicastdelegate/)(Callback\&&) | 构造一个实例并将指定的委托放入委托集合。 |
| [MulticastDelegate](./multicastdelegate/)(T) | 构造一个实例并将指定的值放入委托集合。 |
| [MulticastDelegate](./multicastdelegate/)(std::function\<ReturnType(ArgumentTypes...)>) | 构造一个实例并将指定的值放入委托集合。 |
| [operator!=](./operator!=/)(const std::nullptr_t\&) const | 确定委托集合是否非空。 |
| [operator!=](./operator!=/)(const MulticastDelegate\&) const | 确定两个 MulticastDelegate 实例——当前对象和指定对象——是否不相等。 |
| [operator()](./operator()/)(ArgumentTypes...) const | 调用委托集合中当前存在的所有委托。委托按照添加到集合的顺序依次调用。操作符在委托执行期间会阻塞。 |
| [operator+=](./operator+=/)(Callback) | 将指定的委托添加到集合中。 |
| [operator-=](./operator-=/)(Callback) | 从委托集合中移除指定的委托。 |
| [operator=](./operator=/)(const MulticastDelegate\&) | 将由指定对象表示的委托集合分配给当前对象。结果是两个对象指向同一委托集合。 |
| [operator=](./operator=/)(MulticastDelegate\&&) | 移动赋值运算符。 |
| [operator==](./operator==/)(const std::nullptr_t\&) const | 确定委托集合是否为空。 |
| [operator==](./operator==/)(const MulticastDelegate\&) const | 确定两个 MulticastDelegate 实例——当前对象和指定对象——是否相等。 |
| [remove_empty_callbacks](./remove_empty_callbacks/)() const | 清除为空的包含回调（实际上不调用任何内容）。 |
| [ToString](./tostring/)() const |  |
| static [Type](./type/)() | 返回对表示 MulticastDelegate 类类型信息的 [TypeInfo](../typeinfo/) 对象的引用。 |
| [~MulticastDelegate](./~multicastdelegate/)() | 析构函数。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Callback](./callback/) | MulticastDelegate 类所表示的委托类型。 |

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
