---
title: "طريقة System::Xml::XmlNamedNodeMap::Item"
linktitle: "Item"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlNamedNodeMap::Item. تسترجع العقدة في الفهرس المحدد في XmlNamedNodeMap في C++."
type: docs
weight: 800
url: /ar/cpp/system.xml/xmlnamednodemap/item/
---
## XmlNamedNodeMap::Item method


تسترجع العقدة في الفهرس المحدد في [XmlNamedNodeMap](../).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::Item(int32_t index)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| index | int32_t | موضع الفهرس للعقدة التي سيتم استرجاعها من [XmlNamedNodeMap](../). الفهرس يبدأ من الصفر؛ لذلك، فهرس العقدة الأولى هو 0 وفهرس العقدة الأخيرة هو [XmlNamedNodeMap::get_Count](../get_count/) - 1. |

### ReturnValue

العقدة [XmlNode](../../xmlnode/) في الفهرس المحدد. إذا كان **index** أقل من 0 أو أكبر من أو يساوي قيمة [XmlNamedNodeMap::get_Count](../get_count/)، يتم إرجاع **nullptr**.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
