---
title: "System::Web::Services::Protocols::SoapHeaderAttribute 类"
linktitle: "SoapHeaderAttribute"
second_title: "Aspose.Font 适用于 C++"
description: "System::Web::Services::Protocols::SoapHeaderAttribute 类。指定 XML Web 服务方法或 XML Web 服务客户端可以处理的 SOAP 标头。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 700
url: /zh/cpp/system.web.services.protocols/soapheaderattribute/
---
## SoapHeaderAttribute class


指定 XML [Web](../../system.web/) 服务方法或 XML [Web](../../system.web/) 服务客户端可以处理的 SOAP 标头。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class SoapHeaderAttribute : public System::Attribute
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Direction](./get_direction/)() | RTTI 信息。 |
| [get_MemberName](./get_membername/)() | 获取用于接收 SOAP 标头内容的 XML SOAP 服务的成员变量名称。 |
| [get_Required](./get_required/)() | 获取一个值，指示接收方 XML [Web](../../system.web/) 服务或 XML [Web](../../system.web/) 服务客户端是否必须理解并处理该 SOAP 标头。 |
| [set_Direction](./set_direction/)(SoapHeaderDirection) | 设置 SOAP 标头方向。 |
| [set_MemberName](./set_membername/)(String) | 设置用于接收 SOAP 标头内容的 XML SOAP 服务的成员变量名称。 |
| [set_Required](./set_required/)(bool) | 设置一个值，指示接收方 XML [Web](../../system.web/) 服务或 XML [Web](../../system.web/) 服务客户端是否必须理解并处理该 SOAP 标头。 |
| [SoapHeaderAttribute](./soapheaderattribute/)(String) | 构造一个新实例。 |
## 另见

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
