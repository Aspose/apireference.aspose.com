---
title: "System::Xml::Schema::XmlSchemaCollection::idx_get طريقة"
linktitle: "idx_get"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Schema::XmlSchemaCollection::idx_get طريقة. تُرجع XmlSchema المرتبط بعنوان مساحة الاسم المعطى في C++."
type: docs
weight: 800
url: /ar/cpp/system.xml.schema/xmlschemacollection/idx_get/
---
## XmlSchemaCollection::idx_get method


تُرجع [XmlSchema](../../xmlschema/) المرتبط بعنوان مساحة الاسم المعطى.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::idx_get(const String &ns)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| ns | const String\& | عنوان مساحة الاسم المرتبط بالمخطط الذي تريد إرجاعه. عادةً ما يكون هذا **targetNamespace** للمخطط. |

### ReturnValue

[XmlSchema](../../xmlschema/) المرتبط بعنوان مساحة الاسم؛ **nullptr** إذا لم يكن هناك مخطط محمَّل مرتبط بعنوان المساحة المعطى أو إذا كانت المساحة مرتبطة بمخطط XDR.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
