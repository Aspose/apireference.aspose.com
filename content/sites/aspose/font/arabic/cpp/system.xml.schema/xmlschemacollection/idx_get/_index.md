---
title: "طريقة System::Xml::Schema::XmlSchemaCollection::idx_get"
linktitle: "idx_get"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::Schema::XmlSchemaCollection::idx_get. تُرجع XmlSchema المرتبط بعنوان مساحة الاسم المعطى في C++."
type: docs
weight: 800
url: /ar/cpp/system.xml.schema/xmlschemacollection/idx_get/
---
## XmlSchemaCollection::idx_get method


تُرجع [XmlSchema](../../xmlschema/) المرتبط بعنوان مساحة الاسم المعطى.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::idx_get(const String &ns)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| ns | const String\& | عنوان مساحة الاسم المرتبط بالمخطط الذي تريد إرجاعه. عادةً ما يكون هذا هو **targetNamespace** للمخطط. |

### ReturnValue

الـ[XmlSchema](../../xmlschema/) المرتبط بعنوان مساحة الاسم؛ **nullptr** إذا لم يكن هناك مخطط محمَّل مرتبط بالمساحة المعطاة أو إذا كانت المساحة مرتبطة بمخطط XDR.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
