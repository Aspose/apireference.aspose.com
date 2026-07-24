---
title: "System::Xml::XmlNode::idx_get yöntemi"
linktitle: "idx_get"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlNode::idx_get yöntemi. C++'ta belirtilen XmlNode::get_LocalName ve XmlNode::get_NamespaceURI değerlerine sahip ilk alt öğeyi döndürür."
type: docs
weight: 3000
url: /tr/cpp/system.xml/xmlnode/idx_get/
---
## XmlNode::idx_get(String, String) method


Belirtilen [XmlNode::get_LocalName](../get_localname/) ve [XmlNode::get_NamespaceURI](../get_namespaceuri/) değerlerine sahip ilk alt öğeyi döndürür.

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String localname, String ns)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| yerel ad | String | Öğenin yerel adı. |
| ns | String | Öğenin ad alanı URI'si. |

### ReturnValue

Eşleşen **localname** ve **ns** değerlerine sahip ilk [XmlElement](../../xmlelement/). Eşleşme yoksa **nullptr** döndürülür.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNode::idx_get(String) method


Belirtilen [XmlNode::get_Name](../get_name/) değerine sahip ilk alt öğeyi döndürür.

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String name)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| ad | String | Alınacak öğenin nitelikli adı. |

### ReturnValue

Belirtilen ada uyan ilk [XmlElement](../../xmlelement/). Eşleşme yoksa **nullptr** döndürülür.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
