---
title: "System::Xml::XmlDocument::Validate طريقة"
linktitle: "Validate"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlDocument::Validate طريقة. يتحقق من صحة XmlDocument مقابل مخططات لغة تعريف مخطط XML (XSD) الموجودة في قائمة XmlDocument::get_Schemas في C++."
type: docs
weight: 4300
url: /ar/cpp/system.xml/xmldocument/validate/
---
## XmlDocument::Validate(Schema::ValidationEventHandler) method


يتحقق من صحة [XmlDocument](../) مقابل مخططات XML [Schema](../../../system.xml.schema/) لغة تعريف المخطط (XSD) الموجودة في قائمة [XmlDocument::get_Schemas](../get_schemas/).

```cpp
void System::Xml::XmlDocument::Validate(Schema::ValidationEventHandler validationEventHandler)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| validationEventHandler | Schema::ValidationEventHandler | كائن [Schema::ValidationEventHandler](../../../system.xml.schema/validationeventhandler/) الذي يتلقى معلومات حول تحذيرات وأخطاء التحقق من صحة المخطط. |

## انظر أيضًا

* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::Validate(Schema::ValidationEventHandler, const SharedPtr\<XmlNode\>\&) method


يتحقق من صحة كائن [XmlNode](../../xmlnode/) المحدد مقابل مخططات XML [Schema](../../../system.xml.schema/) لغة تعريف المخطط (XSD) الموجودة في قائمة [XmlDocument::get_Schemas](../get_schemas/).

```cpp
void System::Xml::XmlDocument::Validate(Schema::ValidationEventHandler validationEventHandler, const SharedPtr<XmlNode> &nodeToValidate)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| validationEventHandler | Schema::ValidationEventHandler | كائن [Schema::ValidationEventHandler](../../../system.xml.schema/validationeventhandler/) الذي يتلقى معلومات حول تحذيرات وأخطاء التحقق من صحة المخطط. |
| nodeToValidate | const SharedPtr\<XmlNode\>\& | كائن [XmlNode](../../xmlnode/) الذي تم إنشاؤه من [XmlDocument](../) للتحقق. |

## انظر أيضًا

* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
