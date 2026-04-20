---
title: "طريقة System::Xml::XPath::XPathNavigator::AppendChildElement"
linktitle: "AppendChildElement"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XPath::XPathNavigator::AppendChildElement. تُنشئ عقدة عنصر فرعي جديدة في نهاية قائمة العقد الفرعية للعقدة الحالية باستخدام بادئة الـ namespace، الاسم المحلي وURI الـ namespace المحددين بالقيمة المحددة في C++."
type: docs
weight: 200
url: /ar/cpp/system.xml.xpath/xpathnavigator/appendchildelement/
---
## XPathNavigator::AppendChildElement method


ينشئ عقدة عنصر فرعية جديدة في نهاية قائمة العقد الفرعية للعقدة الحالية باستخدام بادئة الفضاء الاسمي، الاسم المحلي، وURI الفضاء الاسمي المحددين مع القيمة المحددة.

```cpp
virtual void System::Xml::XPath::XPathNavigator::AppendChildElement(String prefix, String localName, String namespaceURI, String value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| البادئة | String | بادئة الـ namespace لعقدة العنصر الفرعي الجديدة (إن وجدت). |
| localName | String | الاسم المحلي لعقدة العنصر الفرعي الجديدة (إن وجدت). |
| namespaceURI | String | URI الـ namespace لعقدة العنصر الفرعي الجديدة (إن وجدت). [String::Empty](../../../system/string/empty/) و **nullptr** متكافئان. |
| value | String | قيمة عقدة العنصر الفرعي الجديدة. إذا تم تمرير [String::Empty](../../../system/string/empty/) أو **nullptr**، يتم إنشاء عنصر فارغ. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
