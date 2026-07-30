---
title: "System::Xml::Schema::XmlSchemaSet::Add طريقة"
linktitle: "Add"
second_title: "Aspose.Font لـ C++"
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


| معامل | نوع | الوصف |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | كائن [XmlSchema](../../xmlschema/) لإضافته إلى [XmlSchemaSet](../). |

### ReturnValue

كائن [XmlSchema](../../xmlschema/) إذا كان المخطط صالحًا. إذا لم يكن المخطط صالحًا وتم تحديد [ValidationEventHandler](../../validationeventhandler/)، يتم إرجاع **nullptr** ويتم رفع حدث التحقق المناسب. وإلا، يتم رمي [XmlSchemaException](../../xmlschemaexception/).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaSet::Add(const SharedPtr\<XmlSchemaSet\>\&) method


يضيف جميع مخططات XML [Schema](../../) لغة التعريف (XSD) الموجودة في [XmlSchemaSet](../) المحدد إلى [XmlSchemaSet](../).

```cpp
void System::Xml::Schema::XmlSchemaSet::Add(const SharedPtr<XmlSchemaSet> &schemas)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| schemas | const SharedPtr\<XmlSchemaSet\>\& | كائن [XmlSchemaSet](../). |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaSet::Add(String, const SharedPtr\<XmlReader\>\&) method


يضيف مخطط تعريف لغة XML [Schema](../../) (XSD) الموجود في [XmlReader](../../../system.xml/xmlreader/) إلى [XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(String targetNamespace, const SharedPtr<XmlReader> &schemaDocument)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| targetNamespace | String | قيمة **targetNamespace** للمخطط، أو **nullptr** لاستخدام **targetNamespace** المحدد في المخطط. |
| schemaDocument | const SharedPtr\<XmlReader\>\& | كائن [XmlReader](../../../system.xml/xmlreader/). |

### ReturnValue

كائن [XmlSchema](../../xmlschema/) إذا كان المخطط صالحًا. إذا لم يكن المخطط صالحًا وتم تحديد [ValidationEventHandler](../../validationeventhandler/)، يتم إرجاع **nullptr** ويتم رفع حدث التحقق المناسب. وإلا، يتم رمي [XmlSchemaException](../../xmlschemaexception/).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaSet::Add(String, const String\&) method


يضيف مخطط تعريف لغة XML [Schema](../../) (XSD) في عنوان URL المحدد إلى [XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(String targetNamespace, const String &schemaUri)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| targetNamespace | String | قيمة **targetNamespace** للمخطط، أو **nullptr** لاستخدام **targetNamespace** المحدد في المخطط. |
| schemaUri | const String\& | ‏URL الذي يحدد المخطط المراد تحميله. |

### ReturnValue

كائن [XmlSchema](../../xmlschema/) إذا كان المخطط صالحًا. إذا لم يكن المخطط صالحًا وتم تحديد [ValidationEventHandler](../../validationeventhandler/)، يتم إرجاع **nullptr** ويتم رفع حدث التحقق المناسب. وإلا، يتم رمي [XmlSchemaException](../../xmlschemaexception/).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
