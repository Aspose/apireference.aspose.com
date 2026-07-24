---
title: "System::Xml::XmlReader::GetAttribute methode"
linktitle: "GetAttribute"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlReader::GetAttribute methode. Wanneer overschreven in een afgeleide klasse, haalt deze de waarde op van het attribuut met de opgegeven index in C++."
type: docs
weight: 2800
url: /nl/cpp/system.xml/xmlreader/getattribute/
---
## XmlReader::GetAttribute(int32_t) method


Wanneer overschreven in een afgeleide klasse, haalt de waarde van het attribuut op met de opgegeven index.

```cpp
virtual String System::Xml::XmlReader::GetAttribute(int32_t i)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| i | int32_t | De index van het attribuut. De index is nulgebaseerd. (Het eerste attribuut heeft index 0.) |

### ReturnValue

De waarde van het opgegeven attribuut. Deze methode verplaatst de lezer niet.

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::GetAttribute(String) method


Wanneer overschreven in een afgeleide klasse, haalt deze de waarde op van het attribuut met de opgegeven [XmlReader::get_Name](../get_name/) waarde.

```cpp
virtual String System::Xml::XmlReader::GetAttribute(String name)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | De gekwalificeerde naam van het attribuut. |

### ReturnValue

De waarde van het opgegeven attribuut. Als het attribuut niet wordt gevonden of de waarde [String::Empty](../../../system/string/empty/) is, wordt **nullptr** geretourneerd.

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::GetAttribute(String, String) method


Wanneer overschreven in een afgeleide klasse, haalt deze de waarde op van het attribuut met de opgegeven [XmlReader::get_LocalName](../get_localname/) en [XmlReader::get_NamespaceURI](../get_namespaceuri/) waarden.

```cpp
virtual String System::Xml::XmlReader::GetAttribute(String name, String namespaceURI)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | De lokale naam van het attribuut. |
| namespaceURI | String | De namespace-URI van het attribuut. |

### ReturnValue

De waarde van het opgegeven attribuut. Als het attribuut niet wordt gevonden of de waarde [String::Empty](../../../system/string/empty/) is, wordt **nullptr** geretourneerd. Deze methode verplaatst de lezer niet.

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
