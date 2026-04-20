---
title: "System::Xml::Schema::XmlSchemaSet::Schemas طريقة"
linktitle: "المخططات"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSchemaSet::Schemas طريقة. تُرجِع مجموعة من جميع مخططات تعريف لغة XML Schema (XSD) الموجودة في XmlSchemaSet في C++."
type: docs
weight: 1600
url: /ar/cpp/system.xml.schema/xmlschemaset/schemas/
---
## XmlSchemaSet::Schemas() method


يُرجِع مجموعة من جميع مخططات XML [Schema](../../) تعريف اللغة (XSD) الموجودة في [XmlSchemaSet](../).

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
* Library [Aspose.Font for C++](../../../)
## XmlSchemaSet::Schemas(String) method


يُرجِع مجموعة من جميع مخططات XML [Schema](../../) تعريف اللغة (XSD) الموجودة في [XmlSchemaSet](../) والتي تنتمي إلى مساحة الأسماء المحددة.

```cpp
SharedPtr<Collections::Generic::List<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas(String targetNamespace)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| targetNamespace | String | خاصية المخطط **targetNamespace**. |

### ReturnValue

كائن IList يحتوي على جميع المخططات التي تم إضافتها إلى [XmlSchemaSet](../) والتي تنتمي إلى مساحة الأسماء المحددة. إذا لم يتم إضافة أي مخططات إلى [XmlSchemaSet](../)، يتم إرجاع مجموعة فارغة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../../../system.collections.generic/list/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
