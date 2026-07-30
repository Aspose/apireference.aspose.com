---
title: "System::Web::Services::Protocols::SoapDocumentServiceAttribute 类"
linktitle: "SoapDocumentServiceAttribute"
second_title: "Aspose.Font 适用于 C++"
description: "System::Web::Services::Protocols::SoapDocumentServiceAttribute 类。设置 SOAP 请求和响应的默认格式。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 500
url: /zh/cpp/system.web.services.protocols/soapdocumentserviceattribute/
---
## SoapDocumentServiceAttribute class


设置 SOAP 请求和响应的默认格式。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class SoapDocumentServiceAttribute : public System::Attribute
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_ParameterStyle](./get_parameterstyle/)() | RTTI 信息。 |
| [get_RoutingStyle](./get_routingstyle/)() | 获取一个值，显示 SOAP 消息如何路由到服务。 |
| [get_Use](./get_use/)() | 获取参数的格式化方式。 |
| [set_ParameterStyle](./set_parameterstyle/)(SoapParameterStyle) | 设置一个值，指示参数是否封装在位于 'Body' 元素下的单个 XML 元素中。 |
| [set_RoutingStyle](./set_routingstyle/)(SoapServiceRoutingStyle) | 设置一个值，显示 SOAP 消息如何路由到服务。 |
| [set_Use](./set_use/)(Description::SoapBindingUse) | 设置参数的格式化方式。 |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)() | 构造一个新实例。 |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)(Description::SoapBindingUse) | 构造一个新实例。 |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)(Description::SoapBindingUse, SoapParameterStyle) | 构造一个新实例。 |
## 另见

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
