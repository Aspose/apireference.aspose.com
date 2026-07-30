---
title: "System::Xml::Schema::XmlSchemaSet::Add 方法"
linktitle: "Add"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaSet::Add 方法。将给定的 XmlSchema 添加到 XmlSchemaSet 中，使用 C++。"
type: docs
weight: 200
url: /zh/cpp/system.xml.schema/xmlschemaset/add/
---
## XmlSchemaSet::Add(const SharedPtr\<XmlSchema\>\&) method


将给定的 [XmlSchema](../../xmlschema/) 添加到 [XmlSchemaSet](../)。

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(const SharedPtr<XmlSchema> &schema)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | 要添加到 [XmlSchemaSet](../) 的 [XmlSchema](../../xmlschema/) 对象。 |

### ReturnValue

如果模式有效，则返回一个 [XmlSchema](../../xmlschema/) 对象。如果模式无效且指定了 [ValidationEventHandler](../../validationeventhandler/)，则返回 **nullptr** 并触发相应的验证事件。否则，将抛出 [XmlSchemaException](../../xmlschemaexception/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaSet::Add(const SharedPtr\<XmlSchemaSet\>\&) method


将给定的 [XmlSchemaSet](../) 中的所有 XML [Schema](../../) 定义语言 (XSD) 模式添加到 [XmlSchemaSet](../)。

```cpp
void System::Xml::Schema::XmlSchemaSet::Add(const SharedPtr<XmlSchemaSet> &schemas)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| schemas | const SharedPtr\<XmlSchemaSet\>\& | [XmlSchemaSet](../) 对象。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaSet::Add(String, const SharedPtr\<XmlReader\>\&) method


将包含在 [XmlReader](../../../system.xml/xmlreader/) 中的 XML [Schema](../../) 定义语言 (XSD) 架构添加到 [XmlSchemaSet](../)。

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(String targetNamespace, const SharedPtr<XmlReader> &schemaDocument)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| targetNamespace | String | 模式的 **targetNamespace** 值，或使用 **nullptr** 来采用模式中指定的 **targetNamespace**。 |
| schemaDocument | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) 对象。 |

### ReturnValue

如果模式有效，则返回一个 [XmlSchema](../../xmlschema/) 对象。如果模式无效且指定了 [ValidationEventHandler](../../validationeventhandler/)，则返回 **nullptr** 并触发相应的验证事件。否则，将抛出 [XmlSchemaException](../../xmlschemaexception/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaSet::Add(String, const String\&) method


将位于指定 URL 的 XML [Schema](../../) 定义语言 (XSD) 架构添加到 [XmlSchemaSet](../)。

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(String targetNamespace, const String &schemaUri)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| targetNamespace | String | 模式的 **targetNamespace** 值，或使用 **nullptr** 来采用模式中指定的 **targetNamespace**。 |
| schemaUri | const String\& | 指定要加载的模式的 URL。 |

### ReturnValue

如果模式有效，则返回一个 [XmlSchema](../../xmlschema/) 对象。如果模式无效且指定了 [ValidationEventHandler](../../validationeventhandler/)，则返回 **nullptr** 并触发相应的验证事件。否则，将抛出 [XmlSchemaException](../../xmlschemaexception/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
