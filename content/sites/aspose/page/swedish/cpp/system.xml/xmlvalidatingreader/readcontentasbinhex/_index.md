---
title: "System::Xml::XmlValidatingReader::ReadContentAsBinHex metod"
linktitle: "ReadContentAsBinHex"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlValidatingReader::ReadContentAsBinHex metod. Läser innehållet och returnerar de BinHex‑avkodade binära bytena i C++."
type: docs
weight: 4200
url: /sv/cpp/system.xml/xmlvalidatingreader/readcontentasbinhex/
---
## XmlValidatingReader::ReadContentAsBinHex method


Läser innehållet och returnerar de BinHex-dekodade binära byten.

```cpp
int32_t System::Xml::XmlValidatingReader::ReadContentAsBinHex(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
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
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
