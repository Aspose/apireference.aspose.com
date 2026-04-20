---
title: "System::Xml::XmlNamedNodeMap::Item method"
linktitle: "العنصر"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlNamedNodeMap::Item method. يسترجع العقدة عند الفهرس المحدد في XmlNamedNodeMap في C++."
type: docs
weight: 800
url: /ar/cpp/system.xml/xmlnamednodemap/item/
---
## XmlNamedNodeMap::Item method


يسترجع العقدة عند الفهرس المحدد في [XmlNamedNodeMap](../).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::Item(int32_t index)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| index | int32_t | موضع الفهرس للعقدة التي سيتم استرجاعها من [XmlNamedNodeMap](../). الفهرس يبدأ من الصفر؛ لذا فإن فهرس أول عقدة هو 0 وفهرس آخر عقدة هو [XmlNamedNodeMap::get_Count](../get_count/) - 1. |

### ReturnValue

[XmlNode](../../xmlnode/) عند الفهرس المحدد. إذا كان **index** أقل من 0 أو أكبر من أو يساوي قيمة [XmlNamedNodeMap::get_Count](../get_count/)، تُعاد **nullptr**.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
