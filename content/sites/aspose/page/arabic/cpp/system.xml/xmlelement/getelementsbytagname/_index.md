---
title: "طريقة System::Xml::XmlElement::GetElementsByTagName"
linktitle: "GetElementsByTagName"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlElement::GetElementsByTagName. تُرجع XmlNodeList تحتوي على قائمة بجميع العناصر التابعة التي تطابق القيم المحددة لـ XmlElement::get_LocalName و XmlElement::get_NamespaceURI في C++."
type: docs
weight: 1500
url: /ar/cpp/system.xml/xmlelement/getelementsbytagname/
---
## XmlElement::GetElementsByTagName(String, String) method


تُرجع [XmlNodeList](../../xmlnodelist/) تحتوي على قائمة بجميع العناصر التابعة التي تطابق القيم المحددة لـ [XmlElement::get_LocalName](../get_localname/) و [XmlElement::get_NamespaceURI](../get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String localName, String namespaceURI)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| localName | String | الاسم المحلي للمطابقة. النجمة (*) هي قيمة خاصة تطابق جميع الوسوم. |
| namespaceURI | String | معرف URI للمساحة الاسمية للمطابقة. |

### ReturnValue

قائمة [XmlNodeList](../../xmlnodelist/) تحتوي على جميع العقد المتطابقة. تكون القائمة فارغة إذا لم توجد أي عقد متطابقة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::GetElementsByTagName(String) method


يرجع [XmlNodeList](../../xmlnodelist/) يحتوي على قائمة بجميع العناصر التابعة التي تتطابق مع [XmlElement::get_Name](../get_name/) المحدد.

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String name)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الاسم | String | علامة الاسم للمطابقة. هذه اسم مؤهل. يتم مطابقتها مع قيمة **get_Name** للعقدة المتطابقة. النجمة (*) هي قيمة خاصة تطابق جميع العلامات. |

### ReturnValue

قائمة [XmlNodeList](../../xmlnodelist/) تحتوي على جميع العقد المتطابقة. تكون القائمة فارغة إذا لم توجد أي عقد متطابقة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
