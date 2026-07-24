---
title: "System::Xml::XmlReader::ReadElementContentAsObject methode"
linktitle: "ReadElementContentAsObject"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlReader::ReadElementContentAsObject methode. Leest het huidige element en retourneert de inhoud als een Object in C++."
type: docs
weight: 6200
url: /nl/cpp/system.xml/xmlreader/readelementcontentasobject/
---
## XmlReader::ReadElementContentAsObject() method


Leest het huidige element en retourneert de inhoud als een [Object](../../../system/object/).

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAsObject()
```


### ReturnValue

Een geboxte object van het meest geschikte type. De waarde van [XmlReader::get_ValueType](../get_valuetype/) bepaalt het geschikte type. Als de inhoud getypeerd is als een lijsttype, retourneert deze methode een array van geboxte objecten van het geschikte type.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadElementContentAsObject(String, String) method


Controleert of de opgegeven lokale naam en namespace-URI overeenkomen met die van het huidige element, leest vervolgens het huidige element en retourneert de inhoud als een [Object](../../../system/object/).

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAsObject(String localName, String namespaceURI)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| localName | String | De lokale naam van het element. |
| namespaceURI | String | De namespace-URI van het element. |

### ReturnValue

Een geboxte object van het meest geschikte type. De waarde van [XmlReader::get_ValueType](../get_valuetype/) bepaalt het geschikte type. Als de inhoud getypeerd is als een lijsttype, retourneert deze methode een array van geboxte objecten van het geschikte type.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
