---
title: "System::Xml::XmlReader::MoveToAttribute methode"
linktitle: "MoveToAttribute"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlReader::MoveToAttribute methode. Wanneer overschreven in een afgeleide klasse, verplaatst het zich naar het attribuut met de opgegeven index in C++."
type: docs
weight: 3200
url: /nl/cpp/system.xml/xmlreader/movetoattribute/
---
## XmlReader::MoveToAttribute(int32_t) method


Wanneer overschreven in een afgeleide klasse, verplaatst zich naar het attribuut met de opgegeven index.

```cpp
virtual void System::Xml::XmlReader::MoveToAttribute(int32_t i)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| i | int32_t | De index van het attribuut. |

## Zie ook

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::MoveToAttribute(String) method


Wanneer overschreven in een afgeleide klasse, verplaatst het zich naar het attribuut met de opgegeven [XmlReader::get_Name](../get_name/) waarde.

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | De gekwalificeerde naam van het attribuut. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::MoveToAttribute(String, String) method


Wanneer overschreven in een afgeleide klasse, verplaatst het zich naar het attribuut met de opgegeven [XmlReader::get_LocalName](../get_localname/) en [XmlReader::get_NamespaceURI](../get_namespaceuri/) waarden.

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name, String ns)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | De lokale naam van het attribuut. |
| ns | String | De namespace-URI van het attribuut. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
