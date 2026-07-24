---
title: "طريقة System::Xml::XPath::XPathNavigator::CheckValidity"
linktitle: "CheckValidity"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XPath::XPathNavigator::CheckValidity. تتحقق من أن بيانات XML في XPathNavigator تتطابق مع مخطط تعريف لغة XML Schema (XSD) المقدم في C++."
type: docs
weight: 300
url: /ar/cpp/system.xml.xpath/xpathnavigator/checkvalidity/
---
## XPathNavigator::CheckValidity method


يتحقق من أن بيانات XML في [XPathNavigator](../) تتطابق مع لغة تعريف مخطط XML [Schema](../../../system.xml.schema/) (XSD) المقدم.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::CheckValidity(SharedPtr<System::Xml::Schema::XmlSchemaSet> schemas, System::Xml::Schema::ValidationEventHandler validationEventHandler)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| schemas | SharedPtr\<System::Xml::Schema::XmlSchemaSet\> | مجموعة XmlSchemaSet التي تحتوي على المخططات المستخدمة للتحقق من صحة بيانات XML الموجودة في [XPathNavigator](../). |
| validationEventHandler | System::Xml::Schema::ValidationEventHandler | معالج ValidationEventHandler الذي يتلقى معلومات حول تحذيرات وأخطاء التحقق من صحة المخطط. |

### ReturnValue

**true** if no schema validation errors occurred; otherwise, **false**.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../../system.xml.schema/xmlschemaset/)
* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
