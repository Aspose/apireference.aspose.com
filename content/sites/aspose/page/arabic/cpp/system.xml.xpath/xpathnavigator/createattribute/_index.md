---
title: "طريقة System::Xml::XPath::XPathNavigator::CreateAttribute"
linktitle: "CreateAttribute"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XPath::XPathNavigator::CreateAttribute. تُنشئ عقدة سمة على عقدة العنصر الحالية باستخدام بادئة الفضاء الاسمي، الاسم المحلي وURI الفضاء الاسمي المحددين مع القيمة المحددة في C++."
type: docs
weight: 700
url: /ar/cpp/system.xml.xpath/xpathnavigator/createattribute/
---
## XPathNavigator::CreateAttribute method


ينشئ عقدة سمة على عقدة العنصر الحالية باستخدام بادئة الفضاء الاسمي والاسم المحلي ومعرف الفضاء الاسمي المحددين مع القيمة المحددة.

```cpp
virtual void System::Xml::XPath::XPathNavigator::CreateAttribute(String prefix, String localName, String namespaceURI, String value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| البادئة | String | بادئة الفضاء الاسمي لعقدة السمة الجديدة (إن وجدت). |
| localName | String | الاسم المحلي لعقدة السمة الجديدة والذي لا يمكن أن يكون [String::Empty](../../../system/string/empty/) أو **nullptr**. |
| namespaceURI | String | URI الفضاء الاسمي لعقدة السمة الجديدة (إن وجدت). |
| value | String | قيمة عقدة السمة الجديدة. إذا تم تمرير [String::Empty](../../../system/string/empty/) أو **nullptr**، يتم إنشاء عقدة سمة فارغة. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
