---
title: "System::Xml::XmlNodeReader::ReadElementContentAsBinHex Methode"
linktitle: "ReadElementContentAsBinHex"
second_title: "Aspose.Page für C++"
description: "System::Xml::XmlNodeReader::ReadElementContentAsBinHex Methode. Liest das Element und dekodiert den BinHex‑Inhalt in C++."
type: docs
weight: 3500
url: /de/cpp/system.xml/xmlnodereader/readelementcontentasbinhex/
---
## XmlNodeReader::ReadElementContentAsBinHex method


Liest das Element und dekodiert den BinHex-Inhalt.

```cpp
int32_t System::Xml::XmlNodeReader::ReadElementContentAsBinHex(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
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
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
