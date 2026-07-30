---
title: "System::Net::EndPoint 类"
linktitle: "EndPoint"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::EndPoint 类。该抽象类包含网络地址。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 900
url: /zh/cpp/system.net/endpoint/
---
## EndPoint class


该抽象类包含网络地址。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class EndPoint : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Create](./create/)(System::SharedPtr\<SocketAddress\>) | 使用指定的套接字地址创建 [EndPoint](./) 类的新实例。 |
| virtual [get_AddressFamily](./get_addressfamily/)() | RTTI 信息。 |
| virtual [GetImpl](./getimpl/)() const | 返回指向实现的指针。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [ImplPtr](./implptr/) | 实现的指针。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
