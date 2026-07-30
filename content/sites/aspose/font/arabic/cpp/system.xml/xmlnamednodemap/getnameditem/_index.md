---
title: "System::Xml::XmlNamedNodeMap::GetNamedItem طريقة"
linktitle: "GetNamedItem"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlNamedNodeMap::GetNamedItem طريقة. يسترجع عقدة ذات القيم المطابقة لـ XmlNode::get_LocalName و XmlNode::get_NamespaceURI في C++."
type: docs
weight: 700
url: /ar/cpp/system.xml/xmlnamednodemap/getnameditem/
---
## XmlNamedNodeMap::GetNamedItem(String, String) method


يسترجع عقدة ذات القيم المطابقة لـ [XmlNode::get_LocalName](../../xmlnode/get_localname/) و [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::GetNamedItem(String localName, String namespaceURI)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| localName | String | الاسم المحلي للعقدة المراد استرجاعها. |
| namespaceURI | String | معرف المورد الموحد (URI) للمساحة الاسمية للعقدة المراد استرجاعها. |

### ReturnValue

[XmlNode](../../xmlnode/) مع الاسم المحلي ومعرف مساحة الاسم URI المطابقين أو **nullptr** إذا لم يتم العثور على عقدة مطابقة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNamedNodeMap::GetNamedItem(String) method


يسترجع [XmlNode](../../xmlnode/) محددًا بالاسم.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::GetNamedItem(String name)
```


| معامل | نوع | الوصف |
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
* Library [Aspose.Font for C++](../../../)
