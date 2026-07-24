---
title: "System::Xml::XmlTextReader::ReadChars metod"
linktitle: "ReadChars"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlTextReader::ReadChars metod. Läser textinnehållet i ett element till en teckenbuffert. Denna metod är avsedd att läsa stora strömmar av inbäddad text genom att anropa den successivt i C++."
type: docs
weight: 4600
url: /sv/cpp/system.xml/xmltextreader/readchars/
---
## XmlTextReader::ReadChars method


Läser textinnehållet i ett element till en teckenbuffert. Denna metod är avsedd att läsa stora strömmar av inbäddad text genom att anropa den successivt.

```cpp
int32_t System::Xml::XmlTextReader::ReadChars(const ArrayPtr<char16_t> &buffer, int32_t index, int32_t count)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | const ArrayPtr\<char16_t\>\& | Den teckenarray som fungerar som bufferten som textinnehållet skrivs till. |
| index | int32_t | Positionen inom **buffer** där metoden kan börja skriva textinnehållet. |
| count | int32_t | Antalet tecken som ska skrivas till **buffer**. |

### ReturnValue

Antalet tecken som lästs. Detta kan vara 0 om läsaren inte är placerad på ett element eller om det inte finns mer textinnehåll att returnera i det aktuella sammanhanget.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
