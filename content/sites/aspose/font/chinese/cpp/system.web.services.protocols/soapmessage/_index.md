---
title: "System::Web::Services::Protocols::SoapMessage 类"
linktitle: "SoapMessage"
second_title: "Aspose.Font 适用于 C++"
description: "System::Web::Services::Protocols::SoapMessage 类。表示 SOAP 消息。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 1000
url: /zh/cpp/system.web.services.protocols/soapmessage/
---
## SoapMessage class


表示 SOAP 消息。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class SoapMessage : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [CollectHeaders](./collectheaders/)(System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>, SoapHeaderDirection) | 设置 SOAP 标头的内部集合。 |
| [FindHeader](./findheader/)(System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>, const TypeInfo\&) | 通过指定的标头类型查找标头映射。 |
| virtual [get_Action](./get_action/)() | 返回 'SOAPAction' 属性的值。 |
| [get_ContentEncoding](./get_contentencoding/)() | 获取 'Content-Encoding' 头的值。 |
| [get_ContentType](./get_contenttype/)() | 获取 'Content-Type' 标头的值。 |
| [get_Exception](./get_exception/)() | 获取 XML [Web](../../system.web/) 服务方法抛出的异常。 |
| [get_Headers](./get_headers/)() | 返回 SOAP 标头的集合。 |
| [get_InParameters](./get_inparameters/)() | 获取传递给 XML [Web](../../system.web/) 服务方法的参数。 |
| [get_IsSoap12](./get_issoap12/)() | 返回一个值，指示是否使用 SOAP 版本 1.2。 |
| [get_OutParameters](./get_outparameters/)() | 获取传递给 XML [Web](../../system.web/) 服务方法的输出参数。 |
| virtual [get_SoapVersion](./get_soapversion/)() | 返回使用的 SOAP 版本。 |
| [get_Stage](./get_stage/)() | 获取 SOAP 消息的处理阶段。 |
| [get_Stream](./get_stream/)() | 获取包含 SOAP 消息数据的流。 |
| virtual [get_Url](./get_url/)() | 返回 XML [Web](../../system.web/) 服务的 URL。 |
| [GetInParameterValue](./getinparametervalue/)(int32_t) | 获取指定索引处的输入参数值。 |
| [GetOutParameterValue](./getoutparametervalue/)(int32_t) | 获取指定索引处的输出参数值。 |
| [GetReturnValue](./getreturnvalue/)() | 获取 XML [Web](../../system.web/) 服务方法的返回值。 |
| [set_ContentEncoding](./set_contentencoding/)(String) | 设置 'Content-Encoding' 头的值。 |
| [set_ContentType](./set_contenttype/)(String) | 设置 'Content-Type' 标头的值。 |
| [set_InParameters](./set_inparameters/)(System::ArrayPtr\<System::SharedPtr\<Object\>\>) | 设置传递给 XML [Web](../../system.web/) 服务方法的参数。 |
| [set_InternalStream](./set_internalstream/)(System::SharedPtr\<System::IO::Stream\>) | 设置包含 SOAP 消息数据的流。 |
| [set_OutParameters](./set_outparameters/)(System::ArrayPtr\<System::SharedPtr\<Object\>\>) | 设置传递给 XML [Web](../../system.web/) 服务方法的输出参数。 |
| [SetException](./setexception/)(SoapException) | 设置 XML [Web](../../system.web/) 服务方法抛出的异常。 |
| [SetHeaders](./setheaders/)(System::SharedPtr\<SoapHeaderCollection\>) | 设置 SOAP 头的集合。 |
| [SetStage](./setstage/)(SoapMessageStage) | 设置 SOAP 消息的处理阶段。 |
| [SetStream](./setstream/)(System::SharedPtr\<System::IO::Stream\>) | 设置包含 SOAP 消息数据的流。 |
| [SoapMessage](./soapmessage/)() | 构造一个新实例。 |
| [UpdateHeaderValues](./updateheadervalues/)(System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>) | 更新 SOAP 头的内部集合。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
