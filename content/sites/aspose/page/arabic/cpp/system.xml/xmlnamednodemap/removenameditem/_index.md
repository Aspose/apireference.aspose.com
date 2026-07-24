---
title: "System::Xml::XmlNamedNodeMap::RemoveNamedItem method"
linktitle: "RemoveNamedItem"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlNamedNodeMap::RemoveNamedItem method. يزيل عقدة ذات القيم المتطابقة لـ XmlNode::get_LocalName و XmlNode::get_NamespaceURI في C++."
type: docs
weight: 900
url: /ar/cpp/system.xml/xmlnamednodemap/removenameditem/
---
## XmlNamedNodeMap::RemoveNamedItem(String, String) method


يزيل عقدة ذات القيم المتطابقة لـ [XmlNode::get_LocalName](../../xmlnode/get_localname/) و [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String localName, String namespaceURI)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| localName | String | الاسم المحلي للعقدة المراد إزالتها. |
| namespaceURI | String | معرف المساحة الاسمية للعقدة المراد إزالتها. |

### ReturnValue

[XmlNode](../../xmlnode/) التي تم إزالتها أو **nullptr** إذا لم يتم العثور على عقدة مطابقة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNamedNodeMap::RemoveNamedItem(String) method


يزيل العقدة من [XmlNamedNodeMap](../).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String name)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| name | String | الاسم المؤهل للعقدة المراد إزالتها. يتم مطابقة الاسم مع قيمة [XmlNode::get_Name](../../xmlnode/get_name/) للعقدة المطابقة. |

### ReturnValue

[XmlNode](../../xmlnode/) التي تم إزالتها من [XmlNamedNodeMap](../) أو **nullptr** إذا لم يتم العثور على عقدة مطابقة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
