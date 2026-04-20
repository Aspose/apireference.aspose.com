---
title: "System::Xml::XmlNamedNodeMap::RemoveNamedItem طريقة"
linktitle: "RemoveNamedItem"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlNamedNodeMap::RemoveNamedItem. يزيل عقدةً ذات قيم XmlNode::get_LocalName و XmlNode::get_NamespaceURI المتطابقة في C++."
type: docs
weight: 900
url: /ar/cpp/system.xml/xmlnamednodemap/removenameditem/
---
## XmlNamedNodeMap::RemoveNamedItem(String, String) method


يزيل عقدةً ذات قيم [XmlNode::get_LocalName](../../xmlnode/get_localname/) و [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) المتطابقة.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String localName, String namespaceURI)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| localName | String | الاسم المحلي للعقدة التي سيتم إزالتها. |
| namespaceURI | String | معرف URI للمساحة الاسمية للعقدة التي سيتم إزالتها. |

### ReturnValue

العقدة [XmlNode](../../xmlnode/) التي تم إزالتها أو **nullptr** إذا لم يتم العثور على عقدة مطابقة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNamedNodeMap::RemoveNamedItem(String) method


يزيل العقدة من [XmlNamedNodeMap](../).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String name)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| name | String | الاسم المؤهل للعقدة التي سيتم إزالتها. يتم مطابقة الاسم مع قيمة [XmlNode::get_Name](../../xmlnode/get_name/) للعقدة المطابقة. |

### ReturnValue

العقدة [XmlNode](../../xmlnode/) التي تم إزالتها من هذا [XmlNamedNodeMap](../) أو **nullptr** إذا لم يتم العثور على عقدة مطابقة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
