---
title: "System::Xml::Schema::XmlSchemaInference::InferSchema 方法"
linktitle: "InferSchema"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::Schema::XmlSchemaInference::InferSchema 方法。根据在 C++ 中指定的 XmlReader 对象中包含的 XML 文档推断 XML 架构定义语言 (XSD) 架构。"
type: docs
weight: 400
url: /zh/cpp/system.xml.schema/xmlschemainference/inferschema/
---
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&) method


根据指定的 [XmlReader](../../../system.xml/xmlreader/) 对象中包含的 XML 文档推断 XML [Schema](../../) 定义语言 (XSD) 架构。

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | 包含用于推断架构的 XML 文档的 [XmlReader](../../../system.xml/xmlreader/) 对象。 |

### ReturnValue

包含已推断架构的 [XmlSchemaSet](../../xmlschemaset/) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlSchemaSet\>) method


根据指定的 [XmlReader](../../../system.xml/xmlreader/) 对象中包含的 XML 文档推断 XML [Schema](../../) 定义语言 (XSD) 架构，并使用在具有相同目标命名空间的 [XmlSchemaSet](../../xmlschemaset/) 对象中指定的现有架构来细化推断的架构。

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument, SharedPtr<XmlSchemaSet> schemas)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | 包含用于推断架构的 XML 文档的 [XmlReader](../../../system.xml/xmlreader/) 对象。 |
| schemas | SharedPtr\<XmlSchemaSet\> | 包含用于细化推断架构的现有架构的 [XmlSchemaSet](../../xmlschemaset/) 对象。 |

### ReturnValue

包含已推断架构的 [XmlSchemaSet](../../xmlschemaset/) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
