---
title: "System::Xml::XmlTextReader::ReadContentAsBase64 metod"
linktitle: "ReadContentAsBase64"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlTextReader::ReadContentAsBase64 method. Läser innehållet och returnerar de Base64‑avkodade binära byten i C++."
type: docs
weight: 4700
url: /sv/cpp/system.xml/xmltextreader/readcontentasbase64/
---
## XmlTextReader::ReadContentAsBase64 method


Läser innehållet och returnerar de **Base64**‑avkodade binära bytena.

```cpp
int32_t System::Xml::XmlTextReader::ReadContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
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
