---
title: "طريقة System::Xml::XmlElement::GetElementsByTagName"
linktitle: "GetElementsByTagName"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlElement::GetElementsByTagName. تُرجع XmlNodeList يحتوي على قائمة بجميع العناصر التابعة التي تطابق القيم المحددة لـ XmlElement::get_LocalName و XmlElement::get_NamespaceURI في C++."
type: docs
weight: 1500
url: /ar/cpp/system.xml/xmlelement/getelementsbytagname/
---
## XmlElement::GetElementsByTagName(String, String) method


تُرجع [XmlNodeList](../../xmlnodelist/) يحتوي على قائمة بجميع العناصر التابعة التي تطابق القيم المحددة لـ [XmlElement::get_LocalName](../get_localname/) و [XmlElement::get_NamespaceURI](../get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String localName, String namespaceURI)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| localName | String | الاسم المحلي للمطابقة. النجمة (*) هي قيمة خاصة تطابق جميع الوسوم. |
| namespaceURI | String | معرف مساحة الاسم للمطابقة. |

### ReturnValue

[XmlNodeList](../../xmlnodelist/) يحتوي على قائمة بجميع العقد المطابقة. تكون القائمة فارغة إذا لم توجد عقد مطابقة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlElement::GetElementsByTagName(String) method


تُرجع [XmlNodeList](../../xmlnodelist/) يحتوي على قائمة بجميع العناصر التابعة التي تطابق القيمة المحددة لـ [XmlElement::get_Name](../get_name/).

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String name)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| name | String | وسم الاسم للمطابقة. هذا اسم مؤهل. يتم مطابقته مع قيمة **get_Name** للعقدة المطابقة. النجمة (*) هي قيمة خاصة تطابق جميع الوسوم. |

### ReturnValue

[XmlNodeList](../../xmlnodelist/) يحتوي على قائمة بجميع العقد المطابقة. تكون القائمة فارغة إذا لم توجد عقد مطابقة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
