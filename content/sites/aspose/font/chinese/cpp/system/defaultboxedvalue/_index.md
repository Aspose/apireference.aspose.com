---
title: "System::DefaultBoxedValue 类"
linktitle: "DefaultBoxedValue"
second_title: "Aspose.Font 适用于 C++"
description: "System::DefaultBoxedValue 类。BoxedValue 类的实现。允许在不复制公共代码的情况下声明其 BoxingValue 特化。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并在 C++ 中使用该指针将其作为参数传递给函数。"
type: docs
weight: 2000
url: /zh/cpp/system/defaultboxedvalue/
---
## DefaultBoxedValue class


[BoxedValue](../boxedvalue/) class implementation. Allows it BoxingValue specializations to be declared without duplicating common code. Objects of this class should only be allocated using [System::MakeObject()](../makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<class T>class DefaultBoxedValue : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [DefaultBoxedValue](./defaultboxedvalue/)(const T\&) | 构造一个表示指定值的 [DefaultBoxedValue](./) 类的新实例。 |
| [Equals](./equals/)(ptr) override | 确定当前对象和指定对象所表示的装箱值是否相等。 |
| [GetHashCode](./gethashcode/)() const override | 返回当前对象的哈希码。 |
| [GetType](./gettype/)() const override | 获取对象的实际类型。 |
| [is](./is/)() const | 确定当前对象所表示的装箱值的类型是否为 **V**。 |
| [ToString](./tostring/)() const override | 返回装箱值的字符串表示。 |
| [unbox](./unbox/)() const | 对装箱值进行拆箱。 |
## 另见

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
