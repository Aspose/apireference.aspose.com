---
title: "System::Xml::XmlReader::ReadContentAsBase64-Methode"
linktitle: "ReadContentAsBase64"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlReader::ReadContentAsBase64-Methode. Liest den Inhalt und gibt die Base64‑decodierten Binärbytes in C++ zurück."
type: docs
weight: 4000
url: /de/cpp/system.xml/xmlreader/readcontentasbase64/
---
## XmlReader::ReadContentAsBase64 method


Liest den Inhalt und gibt die Base64-dekodierten Binärbytes zurück.

```cpp
virtual int32_t System::Xml::XmlReader::ReadContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count)
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
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
