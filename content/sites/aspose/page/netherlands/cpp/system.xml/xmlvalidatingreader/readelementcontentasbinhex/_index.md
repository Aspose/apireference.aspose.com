---
title: "System::Xml::XmlValidatingReader::ReadElementContentAsBinHex method"
linktitle: "ReadElementContentAsBinHex"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlValidatingReader::ReadElementContentAsBinHex method. Leest het element en decodeert de BinHex-inhoud in C++."
type: docs
weight: 4400
url: /nl/cpp/system.xml/xmlvalidatingreader/readelementcontentasbinhex/
---
## XmlValidatingReader::ReadElementContentAsBinHex method


Leest het element en decodeert de BinHex-inhoud.

```cpp
int32_t System::Xml::XmlValidatingReader::ReadElementContentAsBinHex(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
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
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
