---
title: "طريقة System::Xml::XmlNode::SelectSingleNode"
linktitle: "SelectSingleNode"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlNode::SelectSingleNode. تختار أول XmlNode يطابق تعبير XPath في C++."
type: docs
weight: 3900
url: /ar/cpp/system.xml/xmlnode/selectsinglenode/
---
## XmlNode::SelectSingleNode(const String\&) method


تختار أول [XmlNode](../) يطابق تعبير [XPath](../../../system.xml.xpath/).

```cpp
SharedPtr<XmlNode> System::Xml::XmlNode::SelectSingleNode(const String &xpath)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| xpath | const String\& | تعبير [XPath](../../../system.xml.xpath/). |

### ReturnValue

أول [XmlNode](../) يطابق استعلام [XPath](../../../system.xml.xpath/) أو **nullptr** إذا لم يُعثر على عقدة مطابقة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNode::SelectSingleNode(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) method


تختار أول [XmlNode](../) يطابق تعبير [XPath](../../../system.xml.xpath/). أي بادئات تم العثور عليها في تعبير [XPath](../../../system.xml.xpath/) يتم حلها باستخدام [XmlNamespaceManager](../../xmlnamespacemanager/) المقدم.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNode::SelectSingleNode(const String &xpath, const SharedPtr<XmlNamespaceManager> &nsmgr)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| xpath | const String\& | تعبير [XPath](../../../system.xml.xpath/). |
| nsmgr | const SharedPtr\<XmlNamespaceManager\>\& | [XmlNamespaceManager](../../xmlnamespacemanager/) لاستخدامه في حل المساحات الاسمية للبادئات في تعبير [XPath](../../../system.xml.xpath/). |

### ReturnValue

أول [XmlNode](../) يطابق استعلام [XPath](../../../system.xml.xpath/) أو **nullptr** إذا لم يُعثر على عقدة مطابقة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
