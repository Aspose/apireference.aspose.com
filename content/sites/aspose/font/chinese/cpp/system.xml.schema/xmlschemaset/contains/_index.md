---
title: "System::Xml::Schema::XmlSchemaSet::Contains method"
linktitle: "Contains"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaSet::Contains 方法。指示指定的 XML Schema 定义语言 (XSD) XmlSchema 对象是否位于 C++ 中的 XmlSchemaSet 中。"
type: docs
weight: 400
url: /zh/cpp/system.xml.schema/xmlschemaset/contains/
---
## XmlSchemaSet::Contains(const SharedPtr\<XmlSchema\>\&) method


指示指定的 XML [Schema](../../) 定义语言 (XSD) [XmlSchema](../../xmlschema/) 对象是否在 [XmlSchemaSet](../) 中。

```cpp
bool System::Xml::Schema::XmlSchemaSet::Contains(const SharedPtr<XmlSchema> &schema)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | [XmlSchema](../../xmlschema/) 对象。 |

### ReturnValue

**true** if the [XmlSchema](../../xmlschema/) object is in the [XmlSchemaSet](../); otherwise, **false**.

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaSet::Contains(String) method


指示具有指定目标命名空间 URI 的 XML [Schema](../../) 定义语言 (XSD) 模式是否在 [XmlSchemaSet](../) 中。

```cpp
bool System::Xml::Schema::XmlSchemaSet::Contains(String targetNamespace)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| targetNamespace | String | 架构的 **targetNamespace** 属性。 |

### ReturnValue

**true** if a schema with the specified target namespace URI is in the [XmlSchemaSet](../); otherwise, **false**.

## 另见

* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
