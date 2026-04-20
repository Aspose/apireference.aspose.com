---
title: "طريقة System::Xml::XmlNode::idx_get"
linktitle: "idx_get"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlNode::idx_get. تُرجع العنصر الفرعي الأول الذي يملك القيم المحددة لـ XmlNode::get_LocalName و XmlNode::get_NamespaceURI في C++."
type: docs
weight: 3000
url: /ar/cpp/system.xml/xmlnode/idx_get/
---
## XmlNode::idx_get(String, String) method


تُرجع العنصر الفرعي الأول الذي يملك القيم المحددة لـ [XmlNode::get_LocalName](../get_localname/) و [XmlNode::get_NamespaceURI](../get_namespaceuri/).

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String localname, String ns)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الاسم المحلي | String | الاسم المحلي للعنصر. |
| ns | String | معرف مساحة الاسم (URI) للعنصر. |

### ReturnValue

العنصر [XmlElement](../../xmlelement/) الأول الذي يطابق **localname** و **ns**. تُعيد **nullptr** إذا لم يوجد تطابق.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNode::idx_get(String) method


تُرجع العنصر الفرعي الأول الذي يملك القيمة المحددة لـ [XmlNode::get_Name](../get_name/).

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String name)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| name | String | الاسم المؤهل للعنصر المراد استرجاعه. |

### ReturnValue

العنصر [XmlElement](../../xmlelement/) الأول الذي يطابق الاسم المحدد. تُعيد **nullptr** إذا لم يوجد تطابق.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
