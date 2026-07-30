---
title: "System::Net::Sockets::IPPacketInformation 类"
linktitle: "IPPacketInformation"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Sockets::IPPacketInformation 类。表示有关数据包的信息。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 100
url: /zh/cpp/system.net.sockets/ippacketinformation/
---
## IPPacketInformation class


表示有关数据包的信息。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class IPPacketInformation : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | 使用 C# [Object.Equals](../../system/object/equals/) 语义比较两个对象。 |
| [get_Address](./get_address/)() | 返回接收数据包的地址。 |
| [get_Interface](./get_interface/)() | 返回网络接口信息。 |
| [GetHashCode](./gethashcode/)() const override | 相当于 C# [Object.GetHashCode()](../../system/object/gethashcode/) 方法。启用自定义对象的哈希计算。 |
| [IPPacketInformation](./ippacketinformation/)(System::SharedPtr\<IPAddress\>, int32_t) | 构造一个新实例。 |
| [IPPacketInformation](./ippacketinformation/)() | 构造一个新实例。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
