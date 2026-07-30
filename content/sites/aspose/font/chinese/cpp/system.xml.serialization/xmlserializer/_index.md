---
title: "System::Xml::Serialization::XmlSerializer 类"
linktitle: "XmlSerializer"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Serialization::XmlSerializer 类。执行对象到 XML 文档的序列化和反序列化。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 600
url: /zh/cpp/system.xml.serialization/xmlserializer/
---
## XmlSerializer class


执行对象在 XML 文档中的序列化和反序列化。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class XmlSerializer : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [CanDeserialize](./candeserialize/)(System::SharedPtr\<XmlReader\>) | 检查特定读取器是否处于可反序列化状态。 |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::Stream\>) | 将 XML 文档反序列化为对象。 |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::TextReader\>) | 将 XML 文档反序列化为对象。 |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>) | 将 XML 文档反序列化为对象。 |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>, String) | 将 XML 文档反序列化为对象。 |
| [Serialize](./serialize/)(System::SharedPtr\<IO::Stream\>, System::SharedPtr\<Object\>) | 将文档序列化为 XML。 |
| [Serialize](./serialize/)(System::SharedPtr\<IO::TextWriter\>, System::SharedPtr\<Object\>) | 将文档序列化为 XML。 |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>) | 将文档序列化为 XML。 |
| [Serialize](./serialize/)(System::SharedPtr\<IO::Stream\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | 将文档序列化为 XML。 |
| [Serialize](./serialize/)(System::SharedPtr\<IO::TextWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | 将文档序列化为 XML。 |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | 将文档序列化为 XML。 |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>, String) | 将文档序列化为 XML。 |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>, String, String) | 将文档序列化为 XML。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [EncodingNamespace](./encodingnamespace/) | 编码命名空间名称。 |
| static [WsdlNamespace](./wsdlnamespace/) | RTTI。 |
| static [WsdlTypesNamespace](./wsdltypesnamespace/) | WSDL 类型命名空间名称。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Font for C++](../../)
