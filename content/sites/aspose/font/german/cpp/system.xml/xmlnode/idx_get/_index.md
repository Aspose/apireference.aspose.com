---
title: "System::Xml::XmlNode::idx_get Methode"
linktitle: "idx_get"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlNode::idx_get Methode. Gibt das erste Kind-Element mit den angegebenen XmlNode::get_LocalName‑ und XmlNode::get_NamespaceURI‑Werten in C++ zurück."
type: docs
weight: 3000
url: /de/cpp/system.xml/xmlnode/idx_get/
---
## XmlNode::idx_get(String, String) method


Gibt das erste Kind-Element mit den angegebenen [XmlNode::get_LocalName](../get_localname/) und [XmlNode::get_NamespaceURI](../get_namespaceuri/) Werten zurück.

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String localname, String ns)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| localname | String | Der lokale Name des Elements. |
| ns | String | Die Namespace-URI des Elements. |

### ReturnValue

Das erste [XmlElement](../../xmlelement/) mit dem passenden **localname** und **ns**. Es gibt **nullptr** zurück, wenn keine Übereinstimmung gefunden wird.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNode::idx_get(String) method


Gibt das erste Kind-Element mit dem angegebenen [XmlNode::get_Name](../get_name/) zurück.

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String name)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | String | Der qualifizierte Name des abzurufenden Elements. |

### ReturnValue

Das erste [XmlElement](../../xmlelement/) das dem angegebenen Namen entspricht. Es gibt **nullptr** zurück, wenn keine Übereinstimmung gefunden wird.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
