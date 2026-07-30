---
title: "System::Xml::XmlNamedNodeMap::Item method"
linktitle: "Öğe"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlNamedNodeMap::Item yöntemi. C++'ta XmlNamedNodeMap içinde belirtilen dizindeki düğümü alır."
type: docs
weight: 800
url: /tr/cpp/system.xml/xmlnamednodemap/item/
---
## XmlNamedNodeMap::Item method


Belirtilen dizindeki düğümü [XmlNamedNodeMap](../) içinde alır.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::Item(int32_t index)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| index | int32_t | [XmlNamedNodeMap](../) içinden alınacak düğümün dizin konumu. Dizin sıfır tabanlıdır; bu nedenle, ilk düğümün dizini 0 ve son düğümün dizini [XmlNamedNodeMap::get_Count](../get_count/) - 1'dir. |

### ReturnValue

Belirtilen dizindeki [XmlNode](../../xmlnode/). Eğer **index** 0'dan küçük veya [XmlNamedNodeMap::get_Count](../get_count/) değerine eşit ya da büyükse, **nullptr** döndürülür.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
