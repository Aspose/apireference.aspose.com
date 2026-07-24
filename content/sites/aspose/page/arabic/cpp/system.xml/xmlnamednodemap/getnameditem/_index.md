---
title: "System::Xml::XmlNamedNodeMap::GetNamedItem method"
linktitle: "GetNamedItem"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlNamedNodeMap::GetNamedItem method. يسترجع عقدة ذات القيم المتطابقة لـ XmlNode::get_LocalName و XmlNode::get_NamespaceURI في C++."
type: docs
weight: 700
url: /ar/cpp/system.xml/xmlnamednodemap/getnameditem/
---
## XmlNamedNodeMap::GetNamedItem(String, String) method


يسترجع عقدة ذات القيم المتطابقة لـ [XmlNode::get_LocalName](../../xmlnode/get_localname/) و [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::GetNamedItem(String localName, String namespaceURI)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| localName | String | الاسم المحلي للعقدة المراد استرجاعها. |
| namespaceURI | String | معرف المورد الموحد (URI) للمساحة الاسمية للعقدة المراد استرجاعها. |

### ReturnValue

[XmlNode](../../xmlnode/) مع الاسم المحلي ومعرف المساحة الاسمية المتطابقين أو **nullptr** إذا لم يتم العثور على عقدة مطابقة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNamedNodeMap::GetNamedItem(String) method


يسترجع [XmlNode](../../xmlnode/) المحدد بالاسم.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::GetNamedItem(String name)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| name | String | الاسم المؤهل للعقدة المراد استرجاعها. يتم مطابقته مع قيمة [XmlNode::get_Name](../../xmlnode/get_name/) للعقدة المطابقة. |

### ReturnValue

[XmlNode](../../xmlnode/) بالاسم المحدد أو **nullptr** إذا لم يتم العثور على عقدة مطابقة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
