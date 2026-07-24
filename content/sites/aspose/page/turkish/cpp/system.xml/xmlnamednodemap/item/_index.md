---
title: "System::Xml::XmlNamedNodeMap::Item yöntemi"
linktitle: "Item"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlNamedNodeMap::Item yöntemi. C++'ta XmlNamedNodeMap içinde belirtilen indeksteki düğümü alır."
type: docs
weight: 800
url: /tr/cpp/system.xml/xmlnamednodemap/item/
---
## XmlNamedNodeMap::Item method


[XmlNamedNodeMap](../) içinde belirtilen indeksteki düğümü alır.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::Item(int32_t index)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| index | int32_t | Alınacak düğümün konum indeksini [XmlNamedNodeMap](../) üzerinden belirtin. İndeks sıfır tabanlıdır; bu nedenle, ilk düğümün indeksi 0 ve son düğümün indeksi [XmlNamedNodeMap::get_Count](../get_count/) - 1'dir. |

### ReturnValue

Belirtilen indeksteki [XmlNode](../../xmlnode/). **index** 0'dan küçük veya [XmlNamedNodeMap::get_Count](../get_count/) değerine eşit ya da büyükse, **nullptr** döndürülür.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
