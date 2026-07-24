---
title: "System::Xml::XmlTextReader::ReadContentAsBase64 methode"
linktitle: "ReadContentAsBase64"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlTextReader::ReadContentAsBase64-methode. Leest de inhoud en retourneert de Base64-gedecodeerde binaire bytes in C++."
type: docs
weight: 4700
url: /nl/cpp/system.xml/xmltextreader/readcontentasbase64/
---
## XmlTextReader::ReadContentAsBase64 method


Leest de inhoud en retourneert de **Base64** gedecodeerde binaire bytes.

```cpp
int32_t System::Xml::XmlTextReader::ReadContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
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
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
