---
title: "طريقة System::Xml::XmlNamespaceManager::AddNamespace"
linktitle: "AddNamespace"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlNamespaceManager::AddNamespace. تُضيف المساحة الاسمية المحددة إلى المجموعة في C++."
type: docs
weight: 200
url: /ar/cpp/system.xml/xmlnamespacemanager/addnamespace/
---
## XmlNamespaceManager::AddNamespace method


يضيف مساحة الاسم المحددة إلى المجموعة.

```cpp
virtual void System::Xml::XmlNamespaceManager::AddNamespace(String prefix, String uri)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| prefix | String | البادئة التي يجب ربطها بالمساحة الاسمية التي يتم إضافتها. استخدم [String::Empty](../../../system/string/empty/) لإضافة مساحة اسمية افتراضية. إذا كان سيتم استخدام [XmlNamespaceManager](../) لحل المساحات الاسمية في تعبير لغة مسار XML ([XPath](../../../system.xml.xpath/))، يجب تحديد بادئة. إذا كان تعبير [XPath](../../../system.xml.xpath/) لا يتضمن بادئة، يُفترض أن معرف URI للمساحة الاسمية هو المساحة الاسمية الفارغة. لمزيد من المعلومات حول تعبيرات [XPath](../../../system.xml.xpath/) و[XmlNamespaceManager](../)، راجع طرق XmlNode::SelectNodes(String) وXPathExpression::SetContext(SharedPtr<XmlNamespaceManager>). |
| uri | String | مساحة الاسم للإضافة. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
