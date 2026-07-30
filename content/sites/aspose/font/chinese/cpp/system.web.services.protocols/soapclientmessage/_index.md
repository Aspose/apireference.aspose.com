---
title: "System::Web::Services::Protocols::SoapClientMessage 类"
linktitle: "SoapClientMessage"
second_title: "Aspose.Font 适用于 C++"
description: "System::Web::Services::Protocols::SoapClientMessage 类。表示在发送的 SOAP 请求或接收的 SOAP 响应中的数据。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 300
url: /zh/cpp/system.web.services.protocols/soapclientmessage/
---
## SoapClientMessage class


表示在发送的 SOAP 请求或接收的 SOAP 响应中的数据。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class SoapClientMessage : public System::Web::Services::Protocols::SoapMessage
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Action](./get_action/)() override | 返回 'SOAPAction' 属性的值。 |
| [get_Client](./get_client/)() | 返回客户端代理类的实例。 |
| virtual [get_OneWay](./get_oneway/)() | 返回一个值，指示客户端是否不等待服务器完成方法的处理。 |
| [get_SoapVersion](./get_soapversion/)() override | 返回使用的 SOAP 版本。 |
| [get_Url](./get_url/)() override | 返回 XML [Web](../../system.web/) 服务的 URL。 |
| [SoapClientMessage](./soapclientmessage/)(System::SharedPtr\<SoapHttpClientProtocol\>, System::SharedPtr\<SoapMethodStubInfo\>, String, System::ArrayPtr\<System::SharedPtr\<Object\>\>) | 构造一个新实例。 |
## 另见

* Class [SoapMessage](../soapmessage/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
