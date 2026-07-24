---
title: "System::Xml::Schema::XmlSchemaType::IsDerivedFrom طريقة"
linktitle: "IsDerivedFrom"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Schema::XmlSchemaType::IsDerivedFrom طريقة. تُرجع قيمة تشير إلى ما إذا كان نوع المخطط المشتق المحدد مشتقًا من نوع المخطط الأساسي المحدد في C++."
type: docs
weight: 1700
url: /ar/cpp/system.xml.schema/xmlschematype/isderivedfrom/
---
## XmlSchemaType::IsDerivedFrom method


يعيد قيمة تشير إلى ما إذا كان نوع المخطط المشتق المحدد مشتقًا من نوع المخطط الأساسي المحدد.

```cpp
static bool System::Xml::Schema::XmlSchemaType::IsDerivedFrom(SharedPtr<XmlSchemaType> derivedType, const SharedPtr<XmlSchemaType> &baseType, XmlSchemaDerivationMethod except)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| derivedType | SharedPtr\<XmlSchemaType\> | نوع [XmlSchemaType](../) المشتق للاختبار. |
| baseType | const SharedPtr\<XmlSchemaType\>\& | نوع [XmlSchemaType](../) الأساسي لاختبار المشتق [XmlSchemaType](../) ضده. |
| except | XmlSchemaDerivationMethod | إحدى قيم [XmlSchemaDerivationMethod](../../xmlschemaderivationmethod/) التي تمثل طريقة اشتقاق نوع لاستبعادها من الاختبار. |

### ReturnValue

**true** if the derived type is derived from the base type; otherwise, **false**.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaType](../)
* Enum [XmlSchemaDerivationMethod](../../xmlschemaderivationmethod/)
* Class [XmlSchemaType](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
