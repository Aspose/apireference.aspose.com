---
title: "System::Xml::Schema::XmlSchemaInference::InferSchema 方法"
linktitle: "InferSchema"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaInference::InferSchema 方法。推断 XML 架构定义语言 (XSD) 架构，来源于 C++ 中指定的 XmlReader 对象所包含的 XML 文档。"
type: docs
weight: 400
url: /zh/cpp/system.xml.schema/xmlschemainference/inferschema/
---
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&) method


推断 XML [Schema](../../) 定义语言 (XSD) 架构，来源于指定的 [XmlReader](../../../system.xml/xmlreader/) 对象所包含的 XML 文档。

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | 一个包含用于推断架构的 XML 文档的 [XmlReader](../../../system.xml/xmlreader/) 对象。 |

### ReturnValue

一个包含已推断架构的 [XmlSchemaSet](../../xmlschemaset/) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlSchemaSet\>) method


推断 XML [Schema](../../) 定义语言 (XSD) 架构，来源于指定的 [XmlReader](../../../system.xml/xmlreader/) 对象所包含的 XML 文档，并使用在具有相同目标命名空间的指定 [XmlSchemaSet](../../xmlschemaset/) 对象中的现有架构来细化已推断的架构。

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument, SharedPtr<XmlSchemaSet> schemas)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | 一个包含用于推断架构的 XML 文档的 [XmlReader](../../../system.xml/xmlreader/) 对象。 |
| schemas | SharedPtr\<XmlSchemaSet\> | 一个包含用于细化已推断架构的现有架构的 [XmlSchemaSet](../../xmlschemaset/) 对象。 |

### ReturnValue

一个包含已推断架构的 [XmlSchemaSet](../../xmlschemaset/) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
