---
title: "System::Net::IPHostEntry class"
linktitle: "IPHostEntry"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::IPHostEntry class。表示有关互联网主机地址的信息。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 2600
url: /zh/cpp/system.net/iphostentry/
---
## IPHostEntry class


表示有关互联网主机地址的信息。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针在函数调用时作为参数传递。

```cpp
class IPHostEntry : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_AddressList](./get_addresslist/)() | 获取主机的 IP 地址集合。 |
| [get_Aliases](./get_aliases/)() | 获取主机的别名集合。 |
| [get_HostName](./get_hostname/)() const | RTTI 信息。 |
| [IPHostEntry](./iphostentry/)() | 构造一个新实例。 |
| [set_AddressList](./set_addresslist/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>) | 设置主机的 IP 地址集合。 |
| [set_Aliases](./set_aliases/)(System::ArrayPtr\<String\>) | 设置主机的别名集合。 |
| [set_HostName](./set_hostname/)(String) | 设置主机名。 |
| [ToString](./tostring/)() const override | 相当于 C# 的 [Object.ToString()](../../system/object/tostring/) 方法。用于将自定义对象转换为字符串。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
