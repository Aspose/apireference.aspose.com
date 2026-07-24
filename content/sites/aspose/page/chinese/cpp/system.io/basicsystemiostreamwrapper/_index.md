---
title: "System::IO::BasicSystemIOStreamWrapper 类"
linktitle: "BasicSystemIOStreamWrapper"
second_title: "Aspose.Page 适用于 C++"
description: "System::IO::BasicSystemIOStreamWrapper 类。表示一个类似 std::iostream 的包装器，在 C++ 中使用 BasicSystemIOStreamBuf 作为内部缓冲区。"
type: docs
weight: 500
url: /zh/cpp/system.io/basicsystemiostreamwrapper/
---
## BasicSystemIOStreamWrapper class


表示一个类似 std::iostream 的包装器，使用 [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) 作为内部缓冲区。

```cpp
template<typename Elem,typename Traits>class BasicSystemIOStreamWrapper : public std::basic_iostream<Elem, std::char_traits<Elem>>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIOStreamWrapper\&&) | 在移动构造函数和移动赋值运算符中使用，以重置指针并调用 [swap()](./swap/)。 |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | 构造一个新的 [BasicSystemIOStreamWrapper](./) 实例。 |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(const BasicSystemIOStreamWrapper\&) | 拷贝构造函数。已删除。 |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(BasicSystemIOStreamWrapper\&&) | 移动构造函数。 |
| [operator=](./operator=/)(const BasicSystemIOStreamWrapper\&) | 拷贝赋值运算符。已删除。 |
| [operator=](./operator=/)(BasicSystemIOStreamWrapper\&&) | 移动赋值运算符。 |
| [swap](./swap/)(BasicSystemIOStreamWrapper\&) | 如果它们不相等，则调用交换 *this 和 **right**。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [char_type](./char_type/) |  |
| [Mybase](./mybase/) |  |
| [Mysb](./mysb/) |  |
| [traits_type](./traits_type/) |  |
## 另见

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
