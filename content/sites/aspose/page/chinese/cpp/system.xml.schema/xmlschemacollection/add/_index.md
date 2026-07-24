---
title: "System::Xml::Schema::XmlSchemaCollection::Add 方法"
linktitle: "Add"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::Schema::XmlSchemaCollection::Add 方法。将 XmlSchema 添加到 C++ 中的集合。"
type: docs
weight: 200
url: /zh/cpp/system.xml.schema/xmlschemacollection/add/
---
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchema\>\&) method


将 [XmlSchema](../../xmlschema/) 添加到集合中。

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchema> &schema)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | 要添加到集合中的 [XmlSchema](../../xmlschema/)。 |

### ReturnValue

[XmlSchema](../../xmlschema/) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchema\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


将 [XmlSchema](../../xmlschema/) 添加到集合中。使用指定的 [XmlResolver](../../../system.xml/xmlresolver/) 来解析任何外部引用。

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchema> &schema, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | 要添加到集合中的 [XmlSchema](../../xmlschema/)。 |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | 用于解析 **include** 和 **import** 元素中引用的命名空间的 [XmlResolver](../../../system.xml/xmlresolver/)。如果它是 **nullptr**，则不会解析外部引用。 |

### ReturnValue

已添加到模式集合中的 [XmlSchema](../../xmlschema/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchemaCollection\>\&) method


将给定集合中定义的所有命名空间（包括其关联的模式）添加到此集合中。

```cpp
void System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchemaCollection> &schema)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchemaCollection\>\& | 您想要添加到此集合的 [XmlSchemaCollection](../)。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaCollection](../)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const SharedPtr\<XmlReader\>\&) method


将包含在 [XmlReader](../../../system.xml/xmlreader/) 中的模式添加到模式集合。

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const SharedPtr<XmlReader> &reader)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| ns | const String\& | 与模式关联的命名空间 URI。对于 XML 模式，这通常是 **targetNamespace**。 |
| reader | const SharedPtr\<XmlReader\>\& | 包含要添加的模式的 [XmlReader](../../../system.xml/xmlreader/)。 |

### ReturnValue

已添加到模式集合中的 [XmlSchema](../../xmlschema/)；如果添加的模式是 XDR 模式或模式中存在编译错误，则为 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


将 [XmlReader](../../../system.xml/xmlreader/) 中包含的模式添加到模式集合中。指定的 [XmlResolver](../../../system.xml/xmlresolver/) 用于解析任何外部资源。

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const SharedPtr<XmlReader> &reader, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| ns | const String\& | 与模式关联的命名空间 URI。对于 XML 模式，这通常是 **targetNamespace**。 |
| reader | const SharedPtr\<XmlReader\>\& | 包含要添加的模式的 [XmlReader](../../../system.xml/xmlreader/)。 |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | 用于解析在 **include** 和 **import** 元素或 **x-schema** 属性中引用的命名空间的 [XmlResolver](../../../system.xml/xmlresolver/)（XDR 模式）。如果此值为 **nullptr**，则不会解析外部引用。 |

### ReturnValue

已添加到模式集合中的 [XmlSchema](../../xmlschema/)；如果添加的模式是 XDR 模式或模式中存在编译错误，则为 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const String\&) method


将给定 URL 定位的模式添加到模式集合中。

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const String &uri)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| ns | const String\& | 与模式关联的命名空间 URI。对于 XML 模式，这通常是 **targetNamespace**。 |
| uri | const String\& | 指定要加载的模式的 URL。 |

### ReturnValue

已添加到模式集合中的 [XmlSchema](../../xmlschema/)；如果添加的模式是 XDR 模式或模式中存在编译错误，则为 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
