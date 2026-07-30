---
title: "System::Xml::Schema::XmlSchemaSet::Contains method"
linktitle: "Contains"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSchemaSet::Contains method. يوضح ما إذا كان كائن XmlSchema الخاص بلغة تعريف مخطط XML (XSD) المحدد موجودًا في XmlSchemaSet في C++."
type: docs
weight: 400
url: /ar/cpp/system.xml.schema/xmlschemaset/contains/
---
## XmlSchemaSet::Contains(const SharedPtr\<XmlSchema\>\&) method


يوضح ما إذا كان كائن [XmlSchema](../../xmlschema/) الخاص بلغة تعريف XML [Schema](../../) (XSD) المحدد موجودًا في [XmlSchemaSet](../).

```cpp
bool System::Xml::Schema::XmlSchemaSet::Contains(const SharedPtr<XmlSchema> &schema)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | كائن الـ [XmlSchema](../../xmlschema/). |

### ReturnValue

**true** if the [XmlSchema](../../xmlschema/) object is in the [XmlSchemaSet](../); otherwise, **false**.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaSet::Contains(String) method


يوضح ما إذا كان مخطط XML [Schema](../../) الخاص بلغة تعريف (XSD) مع مساحة الاسم المستهدفة المحددة URI موجودًا في [XmlSchemaSet](../).

```cpp
bool System::Xml::Schema::XmlSchemaSet::Contains(String targetNamespace)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| targetNamespace | String | خاصية المخطط **targetNamespace**. |

### ReturnValue

**true** if a schema with the specified target namespace URI is in the [XmlSchemaSet](../); otherwise, **false**.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
