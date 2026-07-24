---
title: "System::IO::BasicSystemIOStreamBuf 类"
linktitle: "BasicSystemIOStreamBuf"
second_title: "Aspose.Page 适用于 C++"
description: "System::IO::BasicSystemIOStreamBuf 类。表示一个缓冲区，该缓冲区包装类似 System::IO::Stream 的流，并允许它们在 C++ 中用作类似 std::iostream 的流的内部缓冲区。"
type: docs
weight: 400
url: /zh/cpp/system.io/basicsystemiostreambuf/
---
## BasicSystemIOStreamBuf class


表示一个缓冲区，该缓冲区包装 [System::IO::Stream](../stream/)-like 流，并允许它们在 std::iostream-like 流中用作内部缓冲区。

```cpp
template<typename Elem,typename Traits>class BasicSystemIOStreamBuf : public std::basic_streambuf<Elem, std::char_traits<Elem>>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIOStreamBuf\&&) | 在移动构造函数和移动赋值运算符中使用，以重置指针并调用 [swap()](./swap/)。 |
| explicit [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)() | 构造一个新的 [BasicSystemIOStreamBuf](./) 实例。 |
| explicit [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(const SharedPtr\<Stream\>\&, SystemIOStreamWrappingMode, const std::locale\&) | 构造一个新的 [BasicSystemIOStreamBuf](./) 实例。 |
| [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(const BasicSystemIOStreamBuf\&) | 拷贝构造函数。已删除。 |
| [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(BasicSystemIOStreamBuf\&&) | 移动构造函数。 |
| [operator=](./operator=/)(const BasicSystemIOStreamBuf\&) | 拷贝赋值运算符。已删除。 |
| [operator=](./operator=/)(BasicSystemIOStreamBuf\&&) | 移动赋值运算符。 |
| [swap](./swap/)(BasicSystemIOStreamBuf\&) | 如果它们不相等，则调用交换 *this 和 right。 |
| [~BasicSystemIOStreamBuf](./~basicsystemiostreambuf/)() override | 析构函数。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [char_type](./char_type/) |  |
| [int_type](./int_type/) |  |
| [Mysb](./mysb/) |  |
| [off_type](./off_type/) |  |
| [pos_type](./pos_type/) |  |
| [traits_type](./traits_type/) |  |
## 另见

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
