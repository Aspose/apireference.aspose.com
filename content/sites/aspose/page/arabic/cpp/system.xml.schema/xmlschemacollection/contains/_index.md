---
title: "System::Xml::Schema::XmlSchemaCollection::Contains طريقة"
linktitle: "Contains"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Schema::XmlSchemaCollection::Contains طريقة. تُرجع قيمة تُشير إلى ما إذا كان **targetNamespace** الخاص بـ XmlSchema المحدد موجودًا في المجموعة في C++."
type: docs
weight: 300
url: /ar/cpp/system.xml.schema/xmlschemacollection/contains/
---
## XmlSchemaCollection::Contains(const SharedPtr\<XmlSchema\>\&) method


تُرجع قيمة تُشير إلى ما إذا كان **targetNamespace** الخاص بـ [XmlSchema](../../xmlschema/) المحدد موجودًا في المجموعة.

```cpp
bool System::Xml::Schema::XmlSchemaCollection::Contains(const SharedPtr<XmlSchema> &schema)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | الكائن [XmlSchema](../../xmlschema/). |

### ReturnValue

**true** if there is a schema in the collection with the same **targetNamespace**; otherwise, **false**.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Contains(const String\&) method


يعيد قيمة تشير إلى ما إذا كان مخطط بالمساحة الاسمية المحددة موجودًا في المجموعة.

```cpp
bool System::Xml::Schema::XmlSchemaCollection::Contains(const String &ns)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| ns | const String\& | معرف URI للمساحة الاسمية المرتبط بالمخطط. بالنسبة لمخططات XML، عادةً ما يكون هذا هو مساحة الاسم الهدف. |

### ReturnValue

**true** if a schema with the specified namespace is in the collection; otherwise, **false**.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
