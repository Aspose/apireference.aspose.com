---
title: "System::Xml::XmlNode::idx_get yöntemi"
linktitle: "idx_get"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlNode::idx_get yöntemi. Belirtilen XmlNode::get_LocalName ve XmlNode::get_NamespaceURI değerlerine sahip ilk alt öğeyi C++'ta döndürür."
type: docs
weight: 3000
url: /tr/cpp/system.xml/xmlnode/idx_get/
---
## XmlNode::idx_get(String, String) method


Belirtilen [XmlNode::get_LocalName](../get_localname/) ve [XmlNode::get_NamespaceURI](../get_namespaceuri/) değerlerine sahip ilk alt öğeyi döndürür.

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String localname, String ns)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| yerelAd | Dize | Öğenin yerel adı. |
| ns | Dize | Öğenin ad alanı URI'si. |

### ReturnValue

Eşleşen **localname** ve **ns** değerlerine sahip ilk [XmlElement](../../xmlelement/). Eşleşme bulunamazsa **nullptr** döndürülür.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNode::idx_get(String) method


Belirtilen [XmlNode::get_Name](../get_name/) değerine sahip ilk alt öğeyi döndürür.

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String name)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | Dize | Alınacak öğenin nitelikli adı. |

### ReturnValue

Belirtilen ada uyan ilk [XmlElement](../../xmlelement/). Eşleşme bulunamazsa **nullptr** döndürülür.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
