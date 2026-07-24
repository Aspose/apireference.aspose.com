---
title: "System::Xml::XmlReader::ReadElementString‑metod"
linktitle: "ReadElementString"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlReader::ReadElementString‑metod. Läser ett enbart text‑element. Det rekommenderas dock att använda XmlReader::ReadElementContentAsString‑metoden istället, eftersom den ger ett enklare sätt att hantera denna operation i C++."
type: docs
weight: 6400
url: /sv/cpp/system.xml/xmlreader/readelementstring/
---
## XmlReader::ReadElementString() method


Läser ett enbart text‑element. Det rekommenderas dock att använda [XmlReader::ReadElementContentAsString](../readelementcontentasstring/)‑metoden istället, eftersom den ger ett enklare sätt att hantera denna operation.

```cpp
virtual String System::Xml::XmlReader::ReadElementString()
```


### ReturnValue

Texten som finns i elementet som lästes. En tom sträng om elementet är tomt.

## Se även

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadElementString(String, String) method


Kontrollerar att värdena för [XmlReader::get_LocalName](../get_localname/) och [XmlReader::get_NamespaceURI](../get_namespaceuri/) i det hittade elementet matchar de angivna strängarna innan ett enbart text‑element läses. Det rekommenderas dock att använda [XmlReader::ReadElementContentAsString](../readelementcontentasstring/)‑metoden istället, eftersom den ger ett enklare sätt att hantera denna operation.

```cpp
virtual String System::Xml::XmlReader::ReadElementString(String localname, String ns)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| localname | String | Det lokala namnet att kontrollera. |
| ns | String | Namespace-URI:n att kontrollera. |

### ReturnValue

Texten som finns i elementet som lästes. En tom sträng om elementet är tomt.

## Se även

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadElementString(String) method


Kontrollerar att värdet för [XmlReader::get_Name](../get_name/) för det hittade elementet matchar den angivna strängen innan ett enbart textbaserat element läses. Det rekommenderas dock att använda metoden [XmlReader::ReadElementContentAsString](../readelementcontentasstring/) istället, eftersom den ger ett mer direkt sätt att hantera denna operation.

```cpp
virtual String System::Xml::XmlReader::ReadElementString(String name)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| namn | String | Namnet att kontrollera. |

### ReturnValue

Texten som finns i elementet som lästes. En tom sträng om elementet är tomt.

## Se även

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
