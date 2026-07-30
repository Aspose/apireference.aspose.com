---
title: "System::Web::Services::Protocols::SoapDocumentMethodAttribute 类"
linktitle: "SoapDocumentMethodAttribute"
second_title: "Aspose.Font 适用于 C++"
description: "System::Web::Services::Protocols::SoapDocumentMethodAttribute 类。指定所有从该方法传递或返回的 SOAP 消息使用 Document 格式。该类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 400
url: /zh/cpp/system.web.services.protocols/soapdocumentmethodattribute/
---
## SoapDocumentMethodAttribute class


指定所有从该方法传递或返回的 SOAP 消息使用 Document 格式。该类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class SoapDocumentMethodAttribute : public System::Attribute
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Action](./get_action/)() | RTTI 信息。 |
| [get_Binding](./get_binding/)() | 获取 XML Web 服务方法实现操作的绑定。 |
| [get_OneWay](./get_oneway/)() | 获取指示客户端是否不等待服务器完成方法处理的值。 |
| [get_ParameterStyle](./get_parameterstyle/)() | 获取指示参数是否封装在位于 'Body' 元素下的单个 XML 元素中的值。 |
| [get_RequestElementName](./get_requestelementname/)() | 获取与 SOAP 请求关联的 XML 元素名称，该元素在服务描述中定义为操作。 |
| [get_RequestNamespace](./get_requestnamespace/)() | 获取与 SOAP 请求关联的命名空间。 |
| [get_ResponseElementName](./get_responseelementname/)() | 获取与 SOAP 响应关联的 XML 元素名称。 |
| [get_ResponseNamespace](./get_responsenamespace/)() | 获取与 SOAP 响应关联的命名空间。 |
| [get_Use](./get_use/)() | 获取决定消息编码方式的值。 |
| [set_Action](./set_action/)(String) | 设置 'SOAPAction' 属性的值。 |
| [set_Binding](./set_binding/)(String) | 设置 XML web service 方法实现操作的绑定。 |
| [set_OneWay](./set_oneway/)(bool) | 设置一个值，指示客户端是否不等待服务器完成方法的处理。 |
| [set_ParameterStyle](./set_parameterstyle/)(SoapParameterStyle) | 设置一个值，指示参数是否封装在位于 'Body' 元素下的单个 XML 元素中。 |
| [set_RequestElementName](./set_requestelementname/)(String) | 设置与 SOAP 请求关联的 XML 元素的名称，该元素在服务描述中定义为操作。 |
| [set_RequestNamespace](./set_requestnamespace/)(String) | 设置与 SOAP 请求关联的命名空间。 |
| [set_ResponseElementName](./set_responseelementname/)(String) | 设置与 SOAP 响应关联的 XML 元素的名称。 |
| [set_ResponseNamespace](./set_responsenamespace/)(String) | 设置与 SOAP 响应关联的命名空间。 |
| [set_Use](./set_use/)(Description::SoapBindingUse) | 设置决定消息编码方式的值。 |
| [SoapDocumentMethodAttribute](./soapdocumentmethodattribute/)() | 构造一个新实例。 |
| [SoapDocumentMethodAttribute](./soapdocumentmethodattribute/)(String) | 构造一个新实例。 |
## 另见

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
