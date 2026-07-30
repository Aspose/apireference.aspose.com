---
title: "System::Xml::XmlReader::ReadValueChunk Methode"
linktitle: "ReadValueChunk"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlReader::ReadValueChunk Methode. Liest große Textströme, die in einem XML-Dokument in C++ eingebettet sind."
type: docs
weight: 7400
url: /de/cpp/system.xml/xmlreader/readvaluechunk/
---
## XmlReader::ReadValueChunk method


Liest große Textströme, die in ein XML‑Dokument eingebettet sind.

```cpp
virtual int32_t System::Xml::XmlReader::ReadValueChunk(ArrayPtr<char16_t> buffer, int32_t index, int32_t count)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | ArrayPtr\<char16_t\> | Das Zeichenarray, das als Puffer dient, in den die Textinhalte geschrieben werden. Dieser Wert darf nicht **nullptr** sein. |
| index | int32_t | Der Versatz innerhalb des Puffers, an dem der [XmlReader](../) mit dem Kopieren der Ergebnisse beginnen kann. |
| count | int32_t | Die maximale Anzahl von Zeichen, die in den Puffer kopiert werden sollen. Die tatsächlich kopierte Zeichenanzahl wird von dieser Methode zurückgegeben. |

### ReturnValue

Die Anzahl der in den Puffer gelesenen Zeichen. Der Wert Null wird zurückgegeben, wenn kein Textinhalt mehr vorhanden ist.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
