---
title: "طريقة System::Xml::XmlReader::IsStartElement"
linktitle: "IsStartElement"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlReader::IsStartElement. تستدعي XmlReader::MoveToContent وتختبر ما إذا كانت عقدة المحتوى الحالية علامة بداية أو علامة عنصر فارغ في C++."
type: docs
weight: 3000
url: /ar/cpp/system.xml/xmlreader/isstartelement/
---
## XmlReader::IsStartElement() method


تستدعي [XmlReader::MoveToContent](../movetocontent/) وتختبر ما إذا كانت عقدة المحتوى الحالية علامة بداية أو علامة عنصر فارغ.

```cpp
virtual bool System::Xml::XmlReader::IsStartElement()
```


### ReturnValue

**true** if [XmlReader::MoveToContent](../movetocontent/) finds a start tag or empty element tag; **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found.

## انظر أيضًا

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::IsStartElement(String, String) method


تستدعي [XmlReader::MoveToContent](../movetocontent/) وتختبر ما إذا كانت عقدة المحتوى الحالية علامة بداية أو علامة عنصر فارغ وما إذا كانت قيمتي [XmlReader::get_LocalName](../get_localname/) و[XmlReader::get_NamespaceURI](../get_namespaceuri/) للعنصر المكتشف تطابق السلاسل المعطاة.

```cpp
virtual bool System::Xml::XmlReader::IsStartElement(String localname, String ns)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| localname | String | السلسلة للمطابقة مع قيمة **LocalName** للعنصر المكتشف. |
| ns | String | السلسلة للمطابقة مع قيمة **NamespaceURI** للعنصر المكتشف. |

### ReturnValue

**true** if the resulting node is an element. **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found or if the **LocalName** and **NamespaceURI** values of the element do not match the specified strings.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::IsStartElement(String) method


تستدعي [XmlReader::MoveToContent](../movetocontent/) وتختبر ما إذا كانت عقدة المحتوى الحالية علامة بداية أو علامة عنصر فارغ وما إذا كانت قيمة [XmlReader::get_Name](../get_name/) للعنصر المكتشف تطابق الوسيط المعطى.

```cpp
virtual bool System::Xml::XmlReader::IsStartElement(String name)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الاسم | String | السلسلة المطابقة مع قيمة **Name** للعنصر المكتشف. |

### ReturnValue

**true** if the resulting node is an element and the **Name** value matches the specified string. **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found or if the element **Name** value does not match the specified string.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
