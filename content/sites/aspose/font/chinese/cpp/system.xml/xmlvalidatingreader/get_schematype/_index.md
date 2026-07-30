---
title: "System::Xml::XmlValidatingReader::get_SchemaType 方法"
linktitle: "get_SchemaType"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlValidatingReader::get_SchemaType 方法。返回 C++ 中的模式类型对象。"
type: docs
weight: 2700
url: /zh/cpp/system.xml/xmlvalidatingreader/get_schematype/
---
## XmlValidatingReader::get_SchemaType method


返回模式类型对象。

```cpp
SharedPtr<Object> System::Xml::XmlValidatingReader::get_SchemaType()
```


### ReturnValue

XmlSchemaDatatype、XmlSchemaSimpleType 或 XmlSchemaComplexType，取决于节点值是内置的 XML [Schema](../../../system.xml.schema/) 定义语言（XSD）类型还是用户定义的 simpleType 或 complexType；如果当前节点没有模式类型，则为 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
