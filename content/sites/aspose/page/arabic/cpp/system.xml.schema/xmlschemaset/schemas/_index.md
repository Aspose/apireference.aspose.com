---
title: "طريقة System::Xml::Schema::XmlSchemaSet::Schemas"
linktitle: "Schemas"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::Schema::XmlSchemaSet::Schemas. تُرجع مجموعة من جميع مخططات تعريف لغة XML (XSD) الموجودة في XmlSchemaSet بلغة C++."
type: docs
weight: 1600
url: /ar/cpp/system.xml.schema/xmlschemaset/schemas/
---
## XmlSchemaSet::Schemas() method


تُرجع مجموعة من جميع مخططات تعريف لغة XML (XSD) في [المخطط](../../) داخل [XmlSchemaSet](../).

```cpp
SharedPtr<Collections::Generic::IList<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas()
```


### ReturnValue

كائن IList يحتوي على جميع المخططات التي تم إضافتها إلى [XmlSchemaSet](../). إذا لم يتم إضافة أي مخططات إلى [XmlSchemaSet](../)، يتم إرجاع مجموعة فارغة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Schemas(String) method


تُرجع مجموعة من جميع مخططات تعريف لغة XML (XSD) في [المخطط](../../) داخل [XmlSchemaSet](../) التي تنتمي إلى مساحة الاسم المحددة.

```cpp
SharedPtr<Collections::Generic::List<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas(String targetNamespace)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| targetNamespace | String | خاصية المخطط **targetNamespace**. |

### ReturnValue

كائن IList يحتوي على جميع المخططات التي تم إضافتها إلى [XmlSchemaSet](../) والتي تنتمي إلى مساحة الاسم المحددة. إذا لم يتم إضافة أي مخططات إلى [XmlSchemaSet](../)، يتم إرجاع مجموعة فارغة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../../../system.collections.generic/list/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
