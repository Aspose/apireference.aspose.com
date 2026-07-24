---
title: "System::Xml::XmlTextReader::GetAttribute metod"
linktitle: "GetAttribute"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlTextReader::GetAttribute metod. Returnerar värdet på attributet med det angivna indexet i C++."
type: docs
weight: 3300
url: /sv/cpp/system.xml/xmltextreader/getattribute/
---
## XmlTextReader::GetAttribute(int32_t) method


Returnerar värdet på attributet med det angivna indexet.

```cpp
String System::Xml::XmlTextReader::GetAttribute(int32_t i) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| i | int32_t | Indexet för attributet. Indexet är nollbaserat. (Det första attributet har index 0.) |

### ReturnValue

Värdet på det angivna attributet.

## Se även

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::GetAttribute(String, String) method


Returnerar värdet på attributet med det angivna lokala namnet och namnrymdens URI.

```cpp
String System::Xml::XmlTextReader::GetAttribute(String localName, String namespaceURI) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| localName | String | Det lokala namnet på attributet. |
| namespaceURI | String | Namnrymd‑URI:n för attributet. |

### ReturnValue

Värdet på det angivna attributet. Om attributet inte hittas, returneras **nullptr**. Denna metod flyttar inte läsaren.

## Se även

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::GetAttribute(String) method


Returnerar värdet på attributet med det angivna namnet.

```cpp
String System::Xml::XmlTextReader::GetAttribute(String name) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| namn | String | Det kvalificerade namnet på attributet. |

### ReturnValue

Värdet på det angivna attributet. Om attributet inte hittas returneras **nullptr**.

## Se även

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
