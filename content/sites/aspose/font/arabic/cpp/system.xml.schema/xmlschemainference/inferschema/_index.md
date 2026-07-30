---
title: "طريقة System::Xml::Schema::XmlSchemaInference::InferSchema"
linktitle: "InferSchema"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSchemaInference::InferSchema method. تستنتج مخطط تعريف لغة XML (XSD) من مستند XML الموجود في كائن XmlReader المحدد في C++."
type: docs
weight: 400
url: /ar/cpp/system.xml.schema/xmlschemainference/inferschema/
---
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&) method


تستنتج مخطط XML [Schema](../../) Definition Language (XSD) من مستند XML الموجود في كائن [XmlReader](../../../system.xml/xmlreader/) المحدد.

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | كائن [XmlReader](../../../system.xml/xmlreader/) يحتوي على مستند XML لاستنتاج مخطط منه. |

### ReturnValue

كائن [XmlSchemaSet](../../xmlschemaset/) يحتوي على المخططات المستنتجة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlSchemaSet\>) method


تستنتج مخطط XML [Schema](../../) Definition Language (XSD) من مستند XML الموجود في كائن [XmlReader](../../../system.xml/xmlreader/) المحدد، وتقوم بتحسين المخطط المستنتج باستخدام مخطط موجود في كائن [XmlSchemaSet](../../xmlschemaset/) المحدد بنفس مساحة الاسم المستهدفة.

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument, SharedPtr<XmlSchemaSet> schemas)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | كائن [XmlReader](../../../system.xml/xmlreader/) يحتوي على مستند XML لاستنتاج مخطط منه. |
| schemas | SharedPtr\<XmlSchemaSet\> | كائن [XmlSchemaSet](../../xmlschemaset/) يحتوي على مخطط موجود يُستخدم لتحسين المخطط المستنتج. |

### ReturnValue

كائن [XmlSchemaSet](../../xmlschemaset/) يحتوي على المخططات المستنتجة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
