---
title: "طريقة System::Xml::XmlReader::ReadToDescendant"
linktitle: "ReadToDescendant"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlReader::ReadToDescendant. تُحَرِّك XmlReader إلى العنصر السليل التالي بالاسم المحلي المحدد ومسار URI للمساحة الاسمية في C++."
type: docs
weight: 7100
url: /ar/cpp/system.xml/xmlreader/readtodescendant/
---
## XmlReader::ReadToDescendant(String, String) method


يقوم بتقدم [XmlReader](../) إلى العنصر المتفرع التالي بالاسم المحلي ومسار مساحة الاسم المحددين.

```cpp
virtual bool System::Xml::XmlReader::ReadToDescendant(String localName, String namespaceURI)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| localName | String | الاسم المحلي للعنصر الذي ترغب في الانتقال إليه. |
| namespaceURI | String | مسار مساحة الاسم للعنصر الذي ترغب في الانتقال إليه. |

### ReturnValue

**true** if a matching descendant element is found; otherwise **false**. If a matching child element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the element. If the [XmlReader](../) is not positioned on an element when [XmlReader::ReadToDescendant(String,String)](./) was called, this method returns **false** and the position of the [XmlReader](../) is not changed.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadToDescendant(String) method


يقوم بتقدم [XmlReader](../) إلى العنصر المتفرع التالي بالاسم المؤهل المحدد.

```cpp
virtual bool System::Xml::XmlReader::ReadToDescendant(String name)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الاسم | String | الاسم المؤهل للعنصر الذي ترغب في الانتقال إليه. |

### ReturnValue

**true** if a matching descendant element is found; otherwise **false**. If a matching child element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the element. If the [XmlReader](../) is not positioned on an element when [XmlReader::ReadToDescendant(String)](./) was called, this method returns **false** and the position of the [XmlReader](../) is not changed.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
