---
title: "System::Web::Services::Protocols::SoapHttpClientProtocol 类"
linktitle: "SoapHttpClientProtocol"
second_title: "Aspose.Font 适用于 C++"
description: "System::Web::Services::Protocols::SoapHttpClientProtocol 类。当使用 SOAP 时，客户端代理服务必须继承此类。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 900
url: /zh/cpp/system.web.services.protocols/soaphttpclientprotocol/
---
## SoapHttpClientProtocol class


当使用 SOAP 时，客户端代理服务必须继承此类。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class SoapHttpClientProtocol : public System::Web::Services::Protocols::HttpWebClientProtocol
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Discover](./discover/)() | 将当前实例绑定到 XML [Web](../../system.web/) 服务。 |
| [get_SoapVersion](./get_soapversion/)() | 获取 SOAP 版本。 |
| [InitializeSerializers](./initializeserializers/)(const System::TypeInfo\&, System::SharedPtr\<System::Xml::Serialization::XmlSerializerImplementation\>, String) | 初始化内部字段。 |
| [set_SoapVersion](./set_soapversion/)(SoapProtocolVersion) | 设置 SOAP 版本。 |
| [SoapHttpClientProtocol](./soaphttpclientprotocol/)() | 构造一个新实例。 |
## 另见

* Class [HttpWebClientProtocol](../httpwebclientprotocol/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
