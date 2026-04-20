---
title: "طريقة System::Xml::Schema::XmlSchema::Compile"
linktitle: "Compile"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::Schema::XmlSchema::Compile. تُجمع نموذج XML SchemaObject (SOM) إلى معلومات المخطط للتحقق. تُستخدم للتحقق من البنية النحوية والدلالية للنموذج المُنشأ برمجياً. يتم إجراء فحص التحقق الدلالي أثناء التجميع في C++."
type: docs
weight: 200
url: /ar/cpp/system.xml.schema/xmlschema/compile/
---
## XmlSchema::Compile(ValidationEventHandler) method


تُجمع XML [Schema](../../)[Object](../../../system/object/) Model (SOM) إلى معلومات المخطط للتحقق. تُستخدم للتحقق من البنية النحوية والدلالية للنموذج المُنشأ برمجياً. يتم إجراء فحص التحقق الدلالي أثناء التجميع.

```cpp
void System::Xml::Schema::XmlSchema::Compile(ValidationEventHandler validationEventHandler)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| validationEventHandler | ValidationEventHandler | معالج حدث التحقق الذي يتلقى معلومات حول أخطاء التحقق في XML [Schema](../../). |

## انظر أيضًا

* Typedef [ValidationEventHandler](../../validationeventhandler/)
* Class [XmlSchema](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchema::Compile(ValidationEventHandler, const SharedPtr\<XmlResolver\>\&) method


تُجمع XML [Schema](../../)[Object](../../../system/object/) Model (SOM) إلى معلومات المخطط للتحقق. تُستخدم للتحقق من البنية النحوية والدلالية للنموذج المُنشأ برمجياً. يتم إجراء فحص التحقق الدلالي أثناء التجميع.

```cpp
void System::Xml::Schema::XmlSchema::Compile(ValidationEventHandler validationEventHandler, const SharedPtr<XmlResolver> &resolver)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| validationEventHandler | ValidationEventHandler | معالج حدث التحقق الذي يتلقى معلومات حول أخطاء التحقق في XML [Schema](../../). |
| resolver | const SharedPtr\<XmlResolver\>\& | الـ [XmlResolver](../../../system.xml/xmlresolver/) المستخدم لحل مساحات الأسماء المشار إليها في العناصر **include** و **import**. |

## انظر أيضًا

* Typedef [ValidationEventHandler](../../validationeventhandler/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchema](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
