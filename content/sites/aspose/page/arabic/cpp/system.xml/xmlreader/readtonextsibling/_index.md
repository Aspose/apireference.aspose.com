---
title: "طريقة System::Xml::XmlReader::ReadToNextSibling"
linktitle: "ReadToNextSibling"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlReader::ReadToNextSibling. يُقدم XmlReader إلى العنصر الشقيق التالي بالاسم المحلي ومساحة الاسم المحددين في C++."
type: docs
weight: 7300
url: /ar/cpp/system.xml/xmlreader/readtonextsibling/
---
## XmlReader::ReadToNextSibling(String, String) method


يُقدم [XmlReader](../) إلى العنصر الشقيق التالي بالاسم المحلي ومساحة الاسم المحددين.

```cpp
virtual bool System::Xml::XmlReader::ReadToNextSibling(String localName, String namespaceURI)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| localName | String | الاسم المحلي للعنصر الشقيق الذي ترغب في الانتقال إليه. |
| namespaceURI | String | URI مساحة الاسم للعنصر الشقيق الذي ترغب في الانتقال إليه. |

### ReturnValue

**true** if a matching sibling element is found; otherwise, **false**. If a matching sibling element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the parent element.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadToNextSibling(String) method


يُقدم [XmlReader](../) إلى العنصر الشقيق التالي بالاسم المؤهل المحدد.

```cpp
virtual bool System::Xml::XmlReader::ReadToNextSibling(String name)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الاسم | String | الاسم المؤهل للعنصر الشقيق الذي ترغب في الانتقال إليه. |

### ReturnValue

**true** if a matching sibling element is found; otherwise **false**. If a matching sibling element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the parent element.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
