---
title: "طريقة System::Xml::Schema::XmlSchema::Compile"
linktitle: "تجميع"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::Schema::XmlSchema::Compile. تُجمع نموذج XML SchemaObject (SOM) إلى معلومات المخطط للتصديق. يُستخدم للتحقق من البنية النحوية والدلالية لـ SOM المُنشأ برمجيًا. يتم إجراء فحص التصديق الدلالي أثناء التجميع في C++."
type: docs
weight: 200
url: /ar/cpp/system.xml.schema/xmlschema/compile/
---
## XmlSchema::Compile(ValidationEventHandler) method


يُجمع نموذج XML [Schema](../../)[Object](../../../system/object/) (SOM) إلى معلومات المخطط للتصديق. يُستخدم للتحقق من البنية النحوية والدلالية لـ SOM المُنشأ برمجيًا. يتم إجراء فحص التصديق الدلالي أثناء التجميع.

```cpp
void System::Xml::Schema::XmlSchema::Compile(ValidationEventHandler validationEventHandler)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| validationEventHandler | ValidationEventHandler | معالج حدث التصديق الذي يتلقى معلومات حول أخطاء تصديق XML [Schema](../../). |

## انظر أيضًا

* Typedef [ValidationEventHandler](../../validationeventhandler/)
* Class [XmlSchema](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchema::Compile(ValidationEventHandler, const SharedPtr\<XmlResolver\>\&) method


يُجمع نموذج XML [Schema](../../)[Object](../../../system/object/) (SOM) إلى معلومات المخطط للتصديق. يُستخدم للتحقق من البنية النحوية والدلالية لـ SOM المُنشأ برمجيًا. يتم إجراء فحص التصديق الدلالي أثناء التجميع.

```cpp
void System::Xml::Schema::XmlSchema::Compile(ValidationEventHandler validationEventHandler, const SharedPtr<XmlResolver> &resolver)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| validationEventHandler | ValidationEventHandler | معالج حدث التصديق الذي يتلقى معلومات حول أخطاء تصديق XML [Schema](../../). |
| resolver | const SharedPtr\<XmlResolver\>\& | الـ [XmlResolver](../../../system.xml/xmlresolver/) المستخدم لحل مساحات الأسماء المشار إليها في عناصر **include** و **import**. |

## انظر أيضًا

* Typedef [ValidationEventHandler](../../validationeventhandler/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchema](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
