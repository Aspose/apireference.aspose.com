---
title: "System::Xml::XmlNode::idx_get methode"
linktitle: "idx_get"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlNode::idx_get methode. Retourneert het eerste kindelement met de opgegeven XmlNode::get_LocalName en XmlNode::get_NamespaceURI waarden in C++."
type: docs
weight: 3000
url: /nl/cpp/system.xml/xmlnode/idx_get/
---
## XmlNode::idx_get(String, String) method


Retourneert het eerste kindelement met de opgegeven [XmlNode::get_LocalName](../get_localname/) en [XmlNode::get_NamespaceURI](../get_namespaceuri/) waarden.

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String localname, String ns)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| lokale naam | String | De lokale naam van het element. |
| ns | String | De namespace-URI van het element. |

### ReturnValue

Het eerste [XmlElement](../../xmlelement/) met de overeenkomende **localname** en **ns**. Het retourneert **nullptr** als er geen overeenkomst is.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNode::idx_get(String) method


Retourneert het eerste kindelement met de opgegeven [XmlNode::get_Name](../get_name/).

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String name)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | De gekwalificeerde naam van het op te halen element. |

### ReturnValue

Het eerste [XmlElement](../../xmlelement/) dat overeenkomt met de opgegeven naam. Het retourneert **nullptr** als er geen overeenkomst is.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
