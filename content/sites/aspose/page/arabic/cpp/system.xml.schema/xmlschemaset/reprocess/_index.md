---
title: "طريقة System::Xml::Schema::XmlSchemaSet::Reprocess"
linktitle: "إعادة معالجة"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::Schema::XmlSchemaSet::Reprocess. تُعيد معالجة مخطط تعريف لغة XML (XSD) الموجود بالفعل في XmlSchemaSet بلغة C++."
type: docs
weight: 1500
url: /ar/cpp/system.xml.schema/xmlschemaset/reprocess/
---
## XmlSchemaSet::Reprocess method


تُعيد معالجة [المخطط](../../) تعريف لغة XML (XSD) الموجود بالفعل في [XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Reprocess(SharedPtr<XmlSchema> schema)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| مخطط | SharedPtr\<XmlSchema\> | المخطط لإعادة معالجته. |

### ReturnValue

كائن [XmlSchema](../../xmlschema/) إذا كان المخطط مخططًا صالحًا. إذا لم يكن المخطط صالحًا وتم تحديد [ValidationEventHandler](../../validationeventhandler/)، يتم إرجاع **nullptr** ويتم رفع حدث التحقق المناسب. وإلا، يتم رمي استثناء [XmlSchemaException](../../xmlschemaexception/).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
