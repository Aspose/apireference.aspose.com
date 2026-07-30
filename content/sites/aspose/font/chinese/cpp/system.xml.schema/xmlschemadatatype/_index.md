---
title: "System::Xml::Schema::XmlSchemaDatatype 类"
linktitle: "XmlSchemaDatatype"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaDatatype 类。XmlSchemaDatatype 类是一个抽象类，用于将 XML Schema 定义语言 (XSD) 类型映射到 C++ 中的运行时类型。"
type: docs
weight: 2400
url: /zh/cpp/system.xml.schema/xmlschemadatatype/
---
## XmlSchemaDatatype class


该 [XmlSchemaDatatype](./) 类是一个抽象类，用于将 XML [Schema](../) 定义语言 (XSD) 类型映射到运行时类型。

```cpp
class XmlSchemaDatatype : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [ChangeType](./changetype/)(SharedPtr\<Object\>, const TypeInfo\&) | 将指定的值（其类型是由 [XmlSchemaDatatype](./) 表示的 XML 架构类型的有效表示之一）转换为指定的运行时类型。 |
| virtual [ChangeType](./changetype/)(SharedPtr\<Object\>, const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | 如果 [XmlSchemaDatatype](./) 表示 **xs:QName** 类型或其派生类型，则使用 [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) 将指定的值（其类型是由 [XmlSchemaDatatype](./) 表示的 XML 架构类型的有效表示之一）转换为指定的运行时类型。 |
| virtual [get_TokenizedType](./get_tokenizedtype/)() | 在派生类中重写时，获取 **string** 的类型，该类型在万维网 [Web](../../system.web/) 联盟 (W3C) XML 1.0 规范中有规定。 |
| virtual [get_TypeCode](./get_typecode/)() | 返回简单类型的 [XmlTypeCode](../xmltypecode/) 值。 |
| virtual [get_ValueType](./get_valuetype/)() | 在派生类中重写时，获取该项的类型。 |
| virtual [get_Variety](./get_variety/)() | 返回简单类型的 [XmlSchemaDatatypeVariety](../xmlschemadatatypevariety/) 值。 |
| virtual [IsDerivedFrom](./isderivedfrom/)(SharedPtr\<XmlSchemaDatatype\>) | 此方法始终返回 **false**。 |
| virtual [ParseValue](./parsevalue/)(String, SharedPtr\<XmlNameTable\>, SharedPtr\<IXmlNamespaceResolver\>) | 在派生类中重写时，验证指定的 **string** 是否符合内置或用户定义的简单类型。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
