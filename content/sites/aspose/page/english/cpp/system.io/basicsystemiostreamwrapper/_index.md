---
title: System::IO::BasicSystemIOStreamWrapper class
linktitle: BasicSystemIOStreamWrapper
second_title: Aspose.Page for C++
description: 'System::IO::BasicSystemIOStreamWrapper class. Represents a std::iostream-like wrapper that used BasicSystemIOStreamBuf as internal buffer in C++.'
type: docs
weight: 500
url: /cpp/system.io/basicsystemiostreamwrapper/
---
## BasicSystemIOStreamWrapper class


Represents a std::iostream-like wrapper that used [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) as internal buffer.

```cpp
template<typename Elem,typename Traits>class BasicSystemIOStreamWrapper : public std::basic_iostream<Elem, std::char_traits<Elem>>
```

## Methods

| Method | Description |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIOStreamWrapper\&&) | Used in move constructor and move assignment operator to reset pointers and call [swap()](./swap/). |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | Constructs a new instance of the [BasicSystemIOStreamWrapper](./). |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(const BasicSystemIOStreamWrapper\&) | Copy constructor. Deleted. |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(BasicSystemIOStreamWrapper\&&) | Move constructor. |
| [operator=](./operator=/)(const BasicSystemIOStreamWrapper\&) | Copy assignment operator. Deleted. |
| [operator=](./operator=/)(BasicSystemIOStreamWrapper\&&) | Move assignment operator. |
| [swap](./swap/)(BasicSystemIOStreamWrapper\&) | Call to swap *this and **right**, if they are not equal. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [char_type](./char_type/) |  |
| [traits_type](./traits_type/) |  |
| [Mybase](./mybase/) |  |
| [Mysb](./mysb/) |  |
## See Also

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
