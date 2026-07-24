---
title: "System::Xml::XmlValidatingReader::ReadContentAsBinHex-Methode"
linktitle: "ReadContentAsBinHex"
second_title: "Aspose.Page für C++"
description: "System::Xml::XmlValidatingReader::ReadContentAsBinHex-Methode. Liest den Inhalt und gibt die BinHex-dekodierten Binärbytes in C++ zurück."
type: docs
weight: 4200
url: /de/cpp/system.xml/xmlvalidatingreader/readcontentasbinhex/
---
## XmlValidatingReader::ReadContentAsBinHex method


Liest den Inhalt und gibt die BinHex-dekodierten Binärbytes zurück.

```cpp
int32_t System::Xml::XmlValidatingReader::ReadContentAsBinHex(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Puffer | ArrayPtr\<uint8_t\> | Der Puffer, in den der resultierende Text kopiert werden soll. Dieser Wert darf nicht **nullptr** sein. |
| Index | int32_t | Der Offset im Puffer, ab dem das Ergebnis kopiert werden soll. |
| count | int32_t | Die maximale Anzahl von Bytes, die in den Puffer kopiert werden sollen. Die tatsächlich kopierte Byte‑Anzahl wird von dieser Methode zurückgegeben. |

### ReturnValue

Die Anzahl der in den Puffer geschriebenen Bytes.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
