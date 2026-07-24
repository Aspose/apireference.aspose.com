---
title: "طريقة System::Xml::Schema::XmlSchemaSet::Contains"
linktitle: "Contains"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::Schema::XmlSchemaSet::Contains. تُشير إلى ما إذا كان كائن XmlSchema المحدد لمخطط تعريف لغة XML (XSD) موجودًا في XmlSchemaSet بلغة C++."
type: docs
weight: 400
url: /ar/cpp/system.xml.schema/xmlschemaset/contains/
---
## XmlSchemaSet::Contains(const SharedPtr\<XmlSchema\>\&) method


تشير إلى ما إذا كان كائن [XmlSchema](../../xmlschema/) لمخطط تعريف لغة XML (XSD) المحدد موجودًا في [XmlSchemaSet](../).

```cpp
bool System::Xml::Schema::XmlSchemaSet::Contains(const SharedPtr<XmlSchema> &schema)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | الكائن [XmlSchema](../../xmlschema/). |

### ReturnValue

**true** if the [XmlSchema](../../xmlschema/) object is in the [XmlSchemaSet](../); otherwise, **false**.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Contains(String) method


تشير إلى ما إذا كان [المخطط](../../) تعريف لغة XML (XSD) مع مساحة الاسم الهدف المحددة موجودًا في [XmlSchemaSet](../).

```cpp
bool System::Xml::Schema::XmlSchemaSet::Contains(String targetNamespace)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| targetNamespace | String | خاصية المخطط **targetNamespace**. |

### ReturnValue

**true** if a schema with the specified target namespace URI is in the [XmlSchemaSet](../); otherwise, **false**.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
