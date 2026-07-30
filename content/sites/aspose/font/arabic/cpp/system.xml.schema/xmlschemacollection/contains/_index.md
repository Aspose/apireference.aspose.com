---
title: "طريقة System::Xml::Schema::XmlSchemaCollection::Contains"
linktitle: "Contains"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::Schema::XmlSchemaCollection::Contains. تُرجع قيمة تُشير إلى ما إذا كان **targetNamespace** الخاص بـ XmlSchema المحدد موجودًا في المجموعة في C++."
type: docs
weight: 300
url: /ar/cpp/system.xml.schema/xmlschemacollection/contains/
---
## XmlSchemaCollection::Contains(const SharedPtr\<XmlSchema\>\&) method


تُرجع قيمة تُشير إلى ما إذا كان **targetNamespace** الخاص بـ [XmlSchema](../../xmlschema/) المحدد موجودًا في المجموعة.

```cpp
bool System::Xml::Schema::XmlSchemaCollection::Contains(const SharedPtr<XmlSchema> &schema)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | كائن الـ [XmlSchema](../../xmlschema/). |

### ReturnValue

**true** if there is a schema in the collection with the same **targetNamespace**; otherwise, **false**.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaCollection::Contains(const String\&) method


يعيد قيمة تشير إلى ما إذا كان مخطط بالمساحة الاسمية المحددة موجودًا في المجموعة.

```cpp
bool System::Xml::Schema::XmlSchemaCollection::Contains(const String &ns)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| ns | const String\& | عنوان مساحة الاسم المرتبط بالمخطط. بالنسبة لمخططات XML، عادةً ما يكون هذا هو مساحة الاسم الهدف. |

### ReturnValue

**true** if a schema with the specified namespace is in the collection; otherwise, **false**.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
