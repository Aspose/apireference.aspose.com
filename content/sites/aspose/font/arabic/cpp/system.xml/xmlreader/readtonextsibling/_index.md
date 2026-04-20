---
title: "System::Xml::XmlReader::ReadToNextSibling طريقة"
linktitle: "ReadToNextSibling"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlReader::ReadToNextSibling طريقة. يقدم XmlReader إلى العنصر الشقيق التالي بالاسم المحلي ومسار مساحة الاسم المحددين في C++."
type: docs
weight: 7300
url: /ar/cpp/system.xml/xmlreader/readtonextsibling/
---
## XmlReader::ReadToNextSibling(String, String) method


يقدم [XmlReader](../) إلى العنصر الشقيق التالي بالاسم المحلي ومسار مساحة الاسم المحددين.

```cpp
virtual bool System::Xml::XmlReader::ReadToNextSibling(String localName, String namespaceURI)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| localName | String | الاسم المحلي للعنصر الشقيق الذي ترغب في الانتقال إليه. |
| namespaceURI | String | معرّف مساحة الاسم URI للعنصر الشقيق الذي ترغب في الانتقال إليه. |

### ReturnValue

**true** if a matching sibling element is found; otherwise, **false**. If a matching sibling element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the parent element.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::ReadToNextSibling(String) method


يتقدّم بـ [XmlReader](../) إلى العنصر الشقيق التالي بالاسم المؤهل المحدد.

```cpp
virtual bool System::Xml::XmlReader::ReadToNextSibling(String name)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| name | String | الاسم المؤهل للعنصر الشقيق الذي ترغب في الانتقال إليه. |

### ReturnValue

**true** if a matching sibling element is found; otherwise **false**. If a matching sibling element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the parent element.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
