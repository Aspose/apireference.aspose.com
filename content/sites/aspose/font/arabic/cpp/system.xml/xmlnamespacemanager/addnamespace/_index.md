---
title: "طريقة System::Xml::XmlNamespaceManager::AddNamespace"
linktitle: "AddNamespace"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlNamespaceManager::AddNamespace. يضيف مساحة الاسم المعطاة إلى المجموعة في C++."
type: docs
weight: 200
url: /ar/cpp/system.xml/xmlnamespacemanager/addnamespace/
---
## XmlNamespaceManager::AddNamespace method


يضيف مساحة الاسم المحددة إلى المجموعة.

```cpp
virtual void System::Xml::XmlNamespaceManager::AddNamespace(String prefix, String uri)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| prefix | String | البادئة التي يجب ربطها بمساحة الاسم التي يتم إضافتها. استخدم [String::Empty](../../../system/string/empty/) لإضافة مساحة اسم افتراضية. إذا كان سيتم استخدام [XmlNamespaceManager](../) لحل مساحات الأسماء في تعبير لغة مسار XML ([XPath](../../../system.xml.xpath/))، يجب تحديد بادئة. إذا لم يتضمن تعبير [XPath](../../../system.xml.xpath/) بادئة، يُفترض أن معرف مورد اسم المساحة (URI) هو مساحة الاسم الفارغة. لمزيد من المعلومات حول تعبيرات [XPath](../../../system.xml.xpath/) و[XmlNamespaceManager](../)، راجع طرق XmlNode::SelectNodes(String) وXPathExpression::SetContext(SharedPtr<XmlNamespaceManager>). |
| uri | String | مساحة الاسم لإضافتها. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
