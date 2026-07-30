---
title: "System::Xml::XmlValidatingReader::ReadElementContentAsBase64‑Methode"
linktitle: "ReadElementContentAsBase64"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlValidatingReader::ReadElementContentAsBase64‑Methode. Liest das Element und decodiert den Base64‑Inhalt in C++."
type: docs
weight: 4300
url: /de/cpp/system.xml/xmlvalidatingreader/readelementcontentasbase64/
---
## XmlValidatingReader::ReadElementContentAsBase64 method


Liest das Element und dekodiert den Base64-Inhalt.

```cpp
int32_t System::Xml::XmlValidatingReader::ReadElementContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
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
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
