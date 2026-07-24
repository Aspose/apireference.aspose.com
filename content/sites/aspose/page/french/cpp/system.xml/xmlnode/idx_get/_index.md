---
title: "Méthode System::Xml::XmlNode::idx_get"
linktitle: "idx_get"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Xml::XmlNode::idx_get. Retourne le premier élément enfant avec les valeurs spécifiées XmlNode::get_LocalName et XmlNode::get_NamespaceURI en C++."
type: docs
weight: 3000
url: /fr/cpp/system.xml/xmlnode/idx_get/
---
## XmlNode::idx_get(String, String) method


Retourne le premier élément enfant avec les valeurs spécifiées [XmlNode::get_LocalName](../get_localname/) et [XmlNode::get_NamespaceURI](../get_namespaceuri/).

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String localname, String ns)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nom local | String | Le nom local de l'élément. |
| ns | String | L’URI d’espace de noms de l’élément. |

### ReturnValue

Le premier [XmlElement](../../xmlelement/) avec le **localname** et le **ns** correspondants. Il renvoie **nullptr** s’il n’y a aucune correspondance.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNode::idx_get(String) method


Retourne le premier élément enfant avec le [XmlNode::get_Name](../get_name/) spécifié.

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String name)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| name | String | Le nom qualifié de l’élément à récupérer. |

### ReturnValue

Le premier [XmlElement](../../xmlelement/) qui correspond au nom spécifié. Il renvoie **nullptr** s’il n’y a aucune correspondance.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
