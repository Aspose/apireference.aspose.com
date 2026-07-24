---
title: "System::Xml::XmlNode::SelectNodes method"
linktitle: "SelectNodes"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlNode::SelectNodes method. يختار قائمة من العقد التي تطابق تعبير XPath في C++."
type: docs
weight: 3800
url: /ar/cpp/system.xml/xmlnode/selectnodes/
---
## XmlNode::SelectNodes(const String\&) method


يختار قائمة من العقد التي تطابق تعبير [XPath](../../../system.xml.xpath/).

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| xpath | const String\& | تعبير [XPath](../../../system.xml.xpath/). |

### ReturnValue

قائمة [XmlNodeList](../../xmlnodelist/) تحتوي على مجموعة من العقد التي تطابق استعلام [XPath](../../../system.xml.xpath/).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNode::SelectNodes(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) method


يختار قائمة من العقد التي تطابق تعبير [XPath](../../../system.xml.xpath/). يتم حل أي بادئات موجودة في تعبير [XPath](../../../system.xml.xpath/) باستخدام [XmlNamespaceManager](../../xmlnamespacemanager/) المقدم.

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath, const SharedPtr<XmlNamespaceManager> &nsmgr)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| xpath | const String\& | تعبير [XPath](../../../system.xml.xpath/). |
| nsmgr | const SharedPtr\<XmlNamespaceManager\>\& | [XmlNamespaceManager](../../xmlnamespacemanager/) لاستخدامه في حل المساحات الاسمية للبادئات في تعبير [XPath](../../../system.xml.xpath/). |

### ReturnValue

قائمة [XmlNodeList](../../xmlnodelist/) تحتوي على مجموعة من العقد التي تطابق استعلام [XPath](../../../system.xml.xpath/).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
