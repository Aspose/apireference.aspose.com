---
title: "System::Xml::XmlTextReader::ReadElementContentAsBinHex metod"
linktitle: "ReadElementContentAsBinHex"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlTextReader::ReadElementContentAsBinHex metod. Läser elementet och avkodar BinHex-innehållet i C++."
type: docs
weight: 5000
url: /sv/cpp/system.xml/xmltextreader/readelementcontentasbinhex/
---
## XmlTextReader::ReadElementContentAsBinHex method


Läser elementet och avkodar **BinHex**‑innehållet.

```cpp
int32_t System::Xml::XmlTextReader::ReadElementContentAsBinHex(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | ArrayPtr\<uint8_t\> | Bufferten som texten ska kopieras till. Detta värde kan inte vara **nullptr**. |
| index | int32_t | Offseten i bufferten där kopieringen av resultatet ska börja. |
| count | int32_t | Det maximala antalet byte som ska kopieras till bufferten. Det faktiska antalet kopierade byte returneras från denna metod. |

### ReturnValue

Antalet byte som skrivits till bufferten.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
