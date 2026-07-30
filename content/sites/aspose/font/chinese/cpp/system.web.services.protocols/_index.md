---
title: "System::Web::Services::Protocols namespace"
linktitle: "System::Web::Services::Protocols"
second_title: "Aspose.Font 适用于 C++"
description: "如何在 C++ 中使用 System::Web::Services::Protocols 命名空间。"
type: docs
weight: 7500
url: /zh/cpp/system.web.services.protocols/
---



## 类

| 类 | 描述 |
| --- | --- |
| [HttpWebClientProtocol](./httpwebclientprotocol/) | 此基类用于所有使用 HTTP 的 XML [Web](../system.web/) 服务客户端代理。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [InvokeCompletedEventArgs](./invokecompletedeventargs/) | 此类的实例作为参数传递给 InvokeCompletedEventHandler 委托。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [SoapClientMessage](./soapclientmessage/) | 表示已发送的 SOAP 请求或已接收的 SOAP 响应中的数据。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [SoapDocumentMethodAttribute](./soapdocumentmethodattribute/) | 指定该方法传递或返回的所有 SOAP 消息使用 Document 格式。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/) | 设置 SOAP 请求和响应的默认格式。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [SoapHeader](./soapheader/) | 表示 SOAP 头部的内容。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [SoapHeaderAttribute](./soapheaderattribute/) | 指定 XML [Web](../system.web/) 服务方法或 XML [Web](../system.web/) 服务客户端可以处理的 SOAP 头部。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [SoapHeaderCollection](./soapheadercollection/) | 包含 [SoapHeader](./soapheader/) 类实例的集合。 |
| [SoapHttpClientProtocol](./soaphttpclientprotocol/) | 在使用 SOAP 时，客户端代理服务必须继承此类。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [SoapMessage](./soapmessage/) | 表示 SOAP 消息。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [WebClientProtocol](./webclientprotocol/) | 此基类用于所有使用 ASP.NET 创建的 XML [Web](../system.web/) 服务客户端代理。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
## Enums

| 枚举 | 描述 |
| --- | --- |
| [SoapHeaderDirection](./soapheaderdirection/) | 枚举 SOAP 头部的方向。 |
| [SoapMessageStage](./soapmessagestage/) | 枚举 SOAP 消息的处理阶段。 |
| [SoapParameterStyle](./soapparameterstyle/) | 枚举 SOAP 消息中参数的格式。 |
| [SoapProtocolVersion](./soapprotocolversion/) | 枚举 SOAP 的版本。 |
| [SoapServiceRoutingStyle](./soapserviceroutingstyle/) | 枚举 SOAP 消息路由到 XML [Web](../system.web/) 服务的方式选项。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [SoapException](./soapexception/) |  |
