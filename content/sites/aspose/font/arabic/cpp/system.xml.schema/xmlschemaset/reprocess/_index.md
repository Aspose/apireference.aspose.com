---
title: "System::Xml::Schema::XmlSchemaSet::Reprocess طريقة"
linktitle: "إعادة المعالجة"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSchemaSet::Reprocess طريقة. يعيد معالجة مخطط تعريف لغة XML Schema (XSD) الموجود بالفعل في XmlSchemaSet في C++."
type: docs
weight: 1500
url: /ar/cpp/system.xml.schema/xmlschemaset/reprocess/
---
## XmlSchemaSet::Reprocess method


يعيد معالجة مخطط XML [Schema](../../) تعريف اللغة (XSD) الموجود بالفعل في [XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Reprocess(SharedPtr<XmlSchema> schema)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مخطط | SharedPtr\<XmlSchema\> | المخطط لإعادة معالجته. |

### ReturnValue

كائن [XmlSchema](../../xmlschema/) إذا كان المخطط مخططًا صالحًا. إذا لم يكن المخطط صالحًا وتم تحديد [ValidationEventHandler](../../validationeventhandler/)، يتم إرجاع **nullptr** ويتم رفع حدث التحقق المناسب. وإلا، يتم رمي [XmlSchemaException](../../xmlschemaexception/).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
