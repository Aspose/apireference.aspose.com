---
title: "System::Xml::XPath::XPathNavigator::CreateAttribute طريقة"
linktitle: "CreateAttribute"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XPath::XPathNavigator::CreateAttribute طريقة. ينشئ عقدة سمة على عقدة العنصر الحالي باستخدام بادئة مساحة الاسم، الاسم المحلي وURI مساحة الاسم المحددين مع القيمة المحددة في C++."
type: docs
weight: 700
url: /ar/cpp/system.xml.xpath/xpathnavigator/createattribute/
---
## XPathNavigator::CreateAttribute method


ينشئ عقدة سمة على عقدة العنصر الحالية باستخدام بادئة الفضاء الاسمي والاسم المحلي وعنوان URI للفضاء الاسمي المحددين مع القيمة المحددة.

```cpp
virtual void System::Xml::XPath::XPathNavigator::CreateAttribute(String prefix, String localName, String namespaceURI, String value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| البادئة | String | بادئة مساحة الاسم لعقدة السمة الجديدة (إن وجدت). |
| localName | String | الاسم المحلي لعقدة السمة الجديدة الذي لا يمكن أن يكون [String::Empty](../../../system/string/empty/) أو **nullptr**. |
| namespaceURI | String | URI مساحة الاسم لعقدة السمة الجديدة (إن وجدت). |
| value | String | قيمة عقدة السمة الجديدة. إذا تم تمرير [String::Empty](../../../system/string/empty/) أو **nullptr**, يتم إنشاء عقدة سمة فارغة. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
