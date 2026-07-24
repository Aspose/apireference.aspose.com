---
title: "System::Xml::XmlReader::ReadElementString methode"
linktitle: "ReadElementString"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlReader::ReadElementString methode. Leest een uitsluitend-tekst element. Het wordt echter aanbevolen om in plaats daarvan de XmlReader::ReadElementContentAsString-methode te gebruiken, omdat deze een eenvoudigere manier biedt om deze bewerking af te handelen in C++."
type: docs
weight: 6400
url: /nl/cpp/system.xml/xmlreader/readelementstring/
---
## XmlReader::ReadElementString() method


Leest een uitsluitend-tekst element. Het wordt echter aanbevolen om in plaats daarvan de [XmlReader::ReadElementContentAsString](../readelementcontentasstring/) methode te gebruiken, omdat deze een eenvoudigere manier biedt om deze bewerking af te handelen.

```cpp
virtual String System::Xml::XmlReader::ReadElementString()
```


### ReturnValue

De tekst die in het gelezen element staat. Een lege tekenreeks als het element leeg is.

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadElementString(String, String) method


Controleert of de [XmlReader::get_LocalName](../get_localname/) en [XmlReader::get_NamespaceURI](../get_namespaceuri/) waarden van het gevonden element overeenkomen met de opgegeven tekenreeksen voordat een uitsluitend-tekst element wordt gelezen. Het wordt echter aanbevolen om in plaats daarvan de [XmlReader::ReadElementContentAsString](../readelementcontentasstring/) methode te gebruiken, omdat deze een eenvoudigere manier biedt om deze bewerking af te handelen.

```cpp
virtual String System::Xml::XmlReader::ReadElementString(String localname, String ns)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| lokale naam | String | De lokale naam om te controleren. |
| ns | String | De namespace-URI om te controleren. |

### ReturnValue

De tekst die in het gelezen element staat. Een lege tekenreeks als het element leeg is.

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadElementString(String) method


Controleert of de [XmlReader::get_Name](../get_name/) waarde van het gevonden element overeenkomt met de opgegeven tekenreeks voordat een alleen-tekst element wordt gelezen. Het wordt echter aanbevolen om in plaats daarvan de [XmlReader::ReadElementContentAsString](../readelementcontentasstring/) methode te gebruiken, omdat deze een meer directe manier biedt om deze bewerking af te handelen.

```cpp
virtual String System::Xml::XmlReader::ReadElementString(String name)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | De te controleren naam. |

### ReturnValue

De tekst die in het gelezen element staat. Een lege tekenreeks als het element leeg is.

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
