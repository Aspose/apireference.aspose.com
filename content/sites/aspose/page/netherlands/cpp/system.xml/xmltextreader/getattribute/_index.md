---
title: "System::Xml::XmlTextReader::GetAttribute method"
linktitle: "GetAttribute"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlTextReader::GetAttribute method. Retourneert de waarde van het attribuut met de opgegeven index in C++."
type: docs
weight: 3300
url: /nl/cpp/system.xml/xmltextreader/getattribute/
---
## XmlTextReader::GetAttribute(int32_t) method


Geeft de waarde van het attribuut met de opgegeven index terug.

```cpp
String System::Xml::XmlTextReader::GetAttribute(int32_t i) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| i | int32_t | De index van het attribuut. De index is nulgebaseerd. (Het eerste attribuut heeft index 0.) |

### ReturnValue

De waarde van het opgegeven attribuut.

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::GetAttribute(String, String) method


Geeft de waarde van het attribuut met de opgegeven lokale naam en namespace-URI terug.

```cpp
String System::Xml::XmlTextReader::GetAttribute(String localName, String namespaceURI) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| localName | String | De lokale naam van het attribuut. |
| namespaceURI | String | De namespace-URI van het attribuut. |

### ReturnValue

De waarde van het opgegeven attribuut. Als het attribuut niet wordt gevonden, wordt **nullptr** geretourneerd. Deze methode verplaatst de lezer niet.

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::GetAttribute(String) method


Geeft de waarde van het attribuut met de opgegeven naam terug.

```cpp
String System::Xml::XmlTextReader::GetAttribute(String name) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | De gekwalificeerde naam van het attribuut. |

### ReturnValue

De waarde van het opgegeven attribuut. Als het attribuut niet wordt gevonden, wordt **nullptr** geretourneerd.

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
