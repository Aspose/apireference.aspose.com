---
title: "System::Net::NetworkInformation::IPGlobalProperties 类"
linktitle: "IPGlobalProperties"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::NetworkInformation::IPGlobalProperties 类。 表示本地计算机网络连接的信息。 此类的对象只能使用 System::MakeObject() 函数分配。 切勿在栈上或使用 new 操作符创建此类型的实例，因为这会导致运行时错误和/或断言故障。 始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 200
url: /zh/cpp/system.net.networkinformation/ipglobalproperties/
---
## IPGlobalProperties class


表示本地计算机网络连接的信息。 此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。 切勿在栈上或使用 new 操作符创建此类型的实例，因为这会导致运行时错误和/或断言故障。 始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class IPGlobalProperties : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [get_DomainName](./get_domainname/)() | 返回本地计算机注册的域。 |
| virtual [get_HostName](./get_hostname/)() | 返回本地计算机的主机名。 |
| static [GetIPGlobalProperties](./getipglobalproperties/)() | RTTI 信息。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Net::NetworkInformation](../)
* Library [Aspose.Font for C++](../../)
