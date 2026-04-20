---
title: "طريقة System::Xml::XmlNode::SelectNodes"
linktitle: "SelectNodes"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlNode::SelectNodes. تختار قائمة من العقد التي تطابق تعبير XPath في C++."
type: docs
weight: 3800
url: /ar/cpp/system.xml/xmlnode/selectnodes/
---
## XmlNode::SelectNodes(const String\&) method


تختار قائمة من العقد التي تطابق تعبير [XPath](../../../system.xml.xpath/).

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath)
```


| معامل | نوع | الوصف |
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
* Library [Aspose.Font for C++](../../../)
## XmlNode::SelectNodes(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) method


تختار قائمة من العقد التي تطابق تعبير [XPath](../../../system.xml.xpath/). يتم حل أي بادئات موجودة في تعبير [XPath](../../../system.xml.xpath/) باستخدام [XmlNamespaceManager](../../xmlnamespacemanager/) المقدم.

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath, const SharedPtr<XmlNamespaceManager> &nsmgr)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| xpath | const String\& | تعبير [XPath](../../../system.xml.xpath/). |
| nsmgr | const SharedPtr\<XmlNamespaceManager\>\& | ‏[XmlNamespaceManager](../../xmlnamespacemanager/) لاستخدامه في حل المساحات الاسمية للبادئات في تعبير [XPath](../../../system.xml.xpath/). |

### ReturnValue

قائمة [XmlNodeList](../../xmlnodelist/) تحتوي على مجموعة من العقد التي تطابق استعلام [XPath](../../../system.xml.xpath/).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
