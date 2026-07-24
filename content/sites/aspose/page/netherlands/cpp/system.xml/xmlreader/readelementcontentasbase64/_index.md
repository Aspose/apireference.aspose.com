---
title: "System::Xml::XmlReader::ReadElementContentAsBase64 methode"
linktitle: "ReadElementContentAsBase64"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlReader::ReadElementContentAsBase64 methode. Leest het element en decodeert de Base64-inhoud in C++."
type: docs
weight: 5300
url: /nl/cpp/system.xml/xmlreader/readelementcontentasbase64/
---
## XmlReader::ReadElementContentAsBase64 method


Leest het element en decodeert de **Base64** inhoud.

```cpp
virtual int32_t System::Xml::XmlReader::ReadElementContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | ArrayPtr\<uint8_t\> | De buffer waarin de resulterende tekst moet worden gekopieerd. Deze waarde mag niet **nullptr** zijn. |
| index | int32_t | De offset in de buffer waar het resultaat moet worden gekopieerd. |
| count | int32_t | Het maximale aantal bytes dat naar de buffer moet worden gekopieerd. Het werkelijke aantal gekopieerde bytes wordt geretourneerd door deze methode. |

### ReturnValue

Het aantal bytes dat naar de buffer is geschreven.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
