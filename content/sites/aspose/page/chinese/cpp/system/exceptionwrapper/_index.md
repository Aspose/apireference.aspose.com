---
title: "System::ExceptionWrapper 类"
linktitle: "ExceptionWrapper"
second_title: "Aspose.Page 适用于 C++"
description: "System::ExceptionWrapper 类。模板，表示从 C++ 中 Exception 类派生的异常的包装器。"
type: docs
weight: 2600
url: /zh/cpp/system/exceptionwrapper/
---
## ExceptionWrapper class


表示从 [Exception](../exception/) 类派生的异常包装器的模板。

```cpp
template<typename T>class ExceptionWrapper
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [ExceptionWrapper](./exceptionwrapper/)(std::nullptr_t) | 构造一个不代表任何异常的 [ExceptionWrapper](./) 类的空实例。 |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionPtr\&) | 构造一个包含传入指针的 [ExceptionWrapper](./) 类实例。 |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionWrapper\&) | 拷贝构造函数。 |
| [ExceptionWrapper](./exceptionwrapper/)(ExceptionWrapper\&&) | 移动构造函数。 |
| explicit [ExceptionWrapper](./exceptionwrapper/)(Args\&&...) | 将参数转发给 [Exception](../exception/) 类构造函数并创建持有新 [Exception](../exception/) 类实例的智能指针的构造函数。 |
| static [operator new](./operatornew/)(std::size_t) |  |
| static [operator new[]](./operatornew[]/)(std::size_t) |  |
| [operator SharedPtr< Object >](./operatorsharedptr_object_/)() | 隐式转换运算符到 [SharedPtr<Object>](../sharedptr/) |
| [operator->](./operator-_/)() const | 允许访问 [Exception](../exception/) 对象的成员。 |
| [operator=](./operator=/)(const ExceptionWrapper\&) | 赋值运算符。 |
| [operator=](./operator=/)(ExceptionWrapper\&&) | 移动赋值运算符。 |
| static [Type](./type/)() | 获取 [Exception](../exception/) 类型的 [System::TypeInfo](../typeinfo/) 对象的快捷方式。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [ExceptionType](./exceptiontype/) | 用于类型转换函数。 |
## 另见

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
