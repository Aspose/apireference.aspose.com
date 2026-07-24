---
title: "طريقة System::Xml::XmlDocument::GetElementsByTagName"
linktitle: "GetElementsByTagName"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlDocument::GetElementsByTagName. تُرجع XmlNodeList يحتوي على قائمة بجميع العناصر التابعة التي تطابق XmlDocument::get_LocalName و XmlNode::get_NamespaceURI المحددين في C++."
type: docs
weight: 3200
url: /ar/cpp/system.xml/xmldocument/getelementsbytagname/
---
## XmlDocument::GetElementsByTagName(String, String) method


تُرجع [XmlNodeList](../../xmlnodelist/) يحتوي على قائمة بجميع العناصر التابعة التي تطابق [XmlDocument::get_LocalName](../get_localname/) و [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlDocument::GetElementsByTagName(String localName, String namespaceURI)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| localName | String | اسم LocalName للمطابقة. القيمة الخاصة **\"*\"** تطابق جميع العلامات. |
| namespaceURI | String | NamespaceURI للمطابقة. |

### ReturnValue

قائمة [XmlNodeList](../../xmlnodelist/) تحتوي على جميع العقد المطابقة. إذا لم تطابق أي عقدة **localName** و **namespaceURI** المحددين، ستكون المجموعة المرجعة فارغة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::GetElementsByTagName(String) method


تُرجع [XmlNodeList](../../xmlnodelist/) يحتوي على قائمة بجميع العناصر التابعة التي تطابق الاسم المحدد.

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlDocument::GetElementsByTagName(String name)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الاسم | String | الاسم المؤهل للمطابقة. يتم مطابقته مع قيمة **get_Name** للعقدة المطابقة. القيمة الخاصة **\"*\"** تطابق جميع العلامات. |

### ReturnValue

قائمة [XmlNodeList](../../xmlnodelist/) تحتوي على جميع العقد المطابقة. إذا لم تطابق أي عقدة **name**، ستكون المجموعة المرجعة فارغة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
