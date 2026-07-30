---
title: "System::IO::BasicSystemOStreamWrapper 类"
linktitle: "BasicSystemOStreamWrapper"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::BasicSystemOStreamWrapper 类。表示一个类似 std::ostream 的包装器，在 C++ 中使用 BasicSystemIOStreamBuf 作为内部缓冲区。"
type: docs
weight: 700
url: /zh/cpp/system.io/basicsystemostreamwrapper/
---
## BasicSystemOStreamWrapper class


表示一个类似 std::ostream 的包装器，使用 [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) 作为内部缓冲区。

```cpp
template<typename Elem,typename Traits>class BasicSystemOStreamWrapper : public std::basic_ostream<Elem, std::char_traits<Elem>>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemOStreamWrapper\&&) | 在移动构造函数和移动赋值运算符中使用，以重置指针并调用 [swap()](./swap/)。 |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | 构造一个新的 [BasicSystemOStreamWrapper](./) 实例。 |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(const BasicSystemOStreamWrapper\&) | 拷贝构造函数。已删除。 |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(BasicSystemOStreamWrapper\&&) | 移动构造函数。 |
| [operator=](./operator=/)(const BasicSystemOStreamWrapper\&) | 拷贝赋值运算符。已删除。 |
| [operator=](./operator=/)(BasicSystemOStreamWrapper\&&) | 移动赋值运算符。 |
| [swap](./swap/)(BasicSystemOStreamWrapper\&) | 调用交换 *this 和 **right**，如果它们不相等的话。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [char_type](./char_type/) |  |
| [Mybase](./mybase/) |  |
| [Mysb](./mysb/) |  |
| [traits_type](./traits_type/) |  |
## 另见

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
