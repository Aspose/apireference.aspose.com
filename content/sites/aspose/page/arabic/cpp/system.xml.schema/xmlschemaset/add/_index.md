---
title: "System::Xml::Schema::XmlSchemaSet::Add طريقة"
linktitle: "Add"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Schema::XmlSchemaSet::Add طريقة. يضيف XmlSchema المحدد إلى XmlSchemaSet في C++."
type: docs
weight: 200
url: /ar/cpp/system.xml.schema/xmlschemaset/add/
---
## XmlSchemaSet::Add(const SharedPtr\<XmlSchema\>\&) method


يضيف [XmlSchema](../../xmlschema/) المحدد إلى [XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(const SharedPtr<XmlSchema> &schema)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | الكائن [XmlSchema](../../xmlschema/) لإضافته إلى [XmlSchemaSet](../). |

### ReturnValue

كائن [XmlSchema](../../xmlschema/) إذا كان المخطط صالحًا. إذا لم يكن المخطط صالحًا وتم تحديد [ValidationEventHandler](../../validationeventhandler/)، يتم إرجاع **nullptr** ويتم رفع حدث التحقق المناسب. وإلا، يتم رمي [XmlSchemaException](../../xmlschemaexception/).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Add(const SharedPtr\<XmlSchemaSet\>\&) method


يضيف جميع مخططات XML [Schema](../../) للغة التعريف (XSD) الموجودة في [XmlSchemaSet](../) المحدد إلى [XmlSchemaSet](../).

```cpp
void System::Xml::Schema::XmlSchemaSet::Add(const SharedPtr<XmlSchemaSet> &schemas)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| schemas | const SharedPtr\<XmlSchemaSet\>\& | الكائن [XmlSchemaSet](../). |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Add(String, const SharedPtr\<XmlReader\>\&) method


يضيف مخطط XML [Schema](../../) للغة التعريف (XSD) الموجود في [XmlReader](../../../system.xml/xmlreader/) إلى [XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(String targetNamespace, const SharedPtr<XmlReader> &schemaDocument)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| targetNamespace | String | قيمة **targetNamespace** للمخطط، أو **nullptr** لاستخدام **targetNamespace** المحدد في المخطط. |
| schemaDocument | const SharedPtr\<XmlReader\>\& | الكائن [XmlReader](../../../system.xml/xmlreader/). |

### ReturnValue

كائن [XmlSchema](../../xmlschema/) إذا كان المخطط صالحًا. إذا لم يكن المخطط صالحًا وتم تحديد [ValidationEventHandler](../../validationeventhandler/)، يتم إرجاع **nullptr** ويتم رفع حدث التحقق المناسب. وإلا، يتم رمي [XmlSchemaException](../../xmlschemaexception/).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Add(String, const String\&) method


يضيف مخطط XML [Schema](../../) للغة التعريف (XSD) الموجود في عنوان URL المحدد إلى [XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(String targetNamespace, const String &schemaUri)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| targetNamespace | String | قيمة **targetNamespace** للمخطط، أو **nullptr** لاستخدام **targetNamespace** المحدد في المخطط. |
| schemaUri | const String\& | عنوان URL الذي يحدد المخطط المراد تحميله. |

### ReturnValue

كائن [XmlSchema](../../xmlschema/) إذا كان المخطط صالحًا. إذا لم يكن المخطط صالحًا وتم تحديد [ValidationEventHandler](../../validationeventhandler/)، يتم إرجاع **nullptr** ويتم رفع حدث التحقق المناسب. وإلا، يتم رمي [XmlSchemaException](../../xmlschemaexception/).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
