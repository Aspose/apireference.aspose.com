---
title: "System::Web::Services::Protocols::SoapHeader 类"
linktitle: "SoapHeader"
second_title: "Aspose.Font 适用于 C++"
description: "System::Web::Services::Protocols::SoapHeader 类。表示 SOAP 头的内容。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 600
url: /zh/cpp/system.web.services.protocols/soapheader/
---
## SoapHeader class


表示 SOAP 头的内容。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class SoapHeader : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Actor](./get_actor/)() | 获取在使用 SOAP 1.1 版本时 SOAP 头接收方的 URI。 |
| [get_DidUnderstand](./get_didunderstand/)() | 获取指示 SOAP 头是否已正确处理的值。 |
| [get_EncodedMustUnderstand](./get_encodedmustunderstand/)() | 获取在使用 SOAP 1.1 版本时 'mustUnderstand' 属性的值。 |
| [get_EncodedMustUnderstand12](./get_encodedmustunderstand12/)() | 获取在使用 SOAP 1.2 版本时 'mustUnderstand' 属性的值。 |
| [get_EncodedRelay](./get_encodedrelay/)() | 获取 'relay' 属性值的字符串表示。 |
| [get_MustUnderstand](./get_mustunderstand/)() | 获取指示是否必须理解 SOAP 头的值。 |
| [get_Relay](./get_relay/)() | 获取 'relay' 属性的值。 |
| [get_Role](./get_role/)() | 获取在使用 SOAP 版本 1.2 时 SOAP 头接收方的 URI。 |
| [set_Actor](./set_actor/)(String) | 设置在使用 SOAP 版本 1.1 时 SOAP 头接收方的 URI。 |
| [set_DidUnderstand](./set_didunderstand/)(bool) | 设置指示 SOAP 头是否已正确处理的值。 |
| [set_EncodedMustUnderstand](./set_encodedmustunderstand/)(String) | 在使用 SOAP 版本 1.1 时设置 'mustUnderstand' 属性的值。 |
| [set_EncodedMustUnderstand12](./set_encodedmustunderstand12/)(String) | 在使用 SOAP 版本 1.2 时设置 'mustUnderstand' 属性的值。 |
| [set_EncodedRelay](./set_encodedrelay/)(String) | 设置 'relay' 属性值的字符串表示。 |
| [set_MustUnderstand](./set_mustunderstand/)(bool) | 设置指示是否必须理解 SOAP 头的值。 |
| [set_Relay](./set_relay/)(bool) | 设置 'relay' 属性的值。 |
| [set_Role](./set_role/)(String) | 设置在使用 SOAP 版本 1.2 时 SOAP 头接收方的 URI。 |
| [SoapHeader](./soapheader/)(System::SharedPtr\<Xml::XmlElement\>) | 构造一个新实例。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
