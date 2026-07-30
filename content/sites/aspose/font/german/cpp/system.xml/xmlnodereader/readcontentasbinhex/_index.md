---
title: "System::Xml::XmlNodeReader::ReadContentAsBinHex-Methode"
linktitle: "ReadContentAsBinHex"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlNodeReader::ReadContentAsBinHex-Methode. Liest den Inhalt und gibt die BinHex-dekodierten Binärbytes in C++ zurück."
type: docs
weight: 3300
url: /de/cpp/system.xml/xmlnodereader/readcontentasbinhex/
---
## XmlNodeReader::ReadContentAsBinHex method


Liest den Inhalt und gibt die BinHex-dekodierten Binärbytes zurück.

```cpp
int32_t System::Xml::XmlNodeReader::ReadContentAsBinHex(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | ArrayPtr\<uint8_t\> | Der Puffer, in den der resultierende Text kopiert werden soll. Dieser Wert darf nicht **nullptr** sein. |
| Index | int32_t | Der Offset im Puffer, an dem das Ergebnis kopiert werden soll. |
| count | int32_t | Die maximale Anzahl von Bytes, die in den Puffer kopiert werden sollen. Die tatsächliche Anzahl kopierter Bytes wird von dieser Methode zurückgegeben. |

### ReturnValue

Die Anzahl der Bytes, die in den Puffer geschrieben wurden.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
