---
title: "System::Xml::Schema::XmlSchemaCollection::Contains 方法"
linktitle: "Contains"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaCollection::Contains 方法。返回一个值，指示指定的 XmlSchema 的 **targetNamespace** 是否在集合中（C++）。"
type: docs
weight: 300
url: /zh/cpp/system.xml.schema/xmlschemacollection/contains/
---
## XmlSchemaCollection::Contains(const SharedPtr\<XmlSchema\>\&) method


返回一个值，指示指定的 [XmlSchema](../../xmlschema/) 的 **targetNamespace** 是否在集合中。

```cpp
bool System::Xml::Schema::XmlSchemaCollection::Contains(const SharedPtr<XmlSchema> &schema)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | [XmlSchema](../../xmlschema/) 对象。 |

### ReturnValue

**true** if there is a schema in the collection with the same **targetNamespace**; otherwise, **false**.

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaCollection::Contains(const String\&) method


返回一个值，指示具有指定命名空间的模式是否在集合中。

```cpp
bool System::Xml::Schema::XmlSchemaCollection::Contains(const String &ns)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| ns | const String\& | 与模式关联的命名空间 URI。对于 XML 模式，通常是目标命名空间。 |

### ReturnValue

**true** if a schema with the specified namespace is in the collection; otherwise, **false**.

## 另见

* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
