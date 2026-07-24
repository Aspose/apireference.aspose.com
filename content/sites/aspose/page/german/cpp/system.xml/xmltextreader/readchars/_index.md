---
title: "System::Xml::XmlTextReader::ReadChars-Methode"
linktitle: "ReadChars"
second_title: "Aspose.Page für C++"
description: "System::Xml::XmlTextReader::ReadChars-Methode. Liest den Textinhalt eines Elements in einen Zeichenpuffer. Diese Methode ist dafür ausgelegt, große Datenströme eingebetteten Textes zu lesen, indem sie in C++ wiederholt aufgerufen wird."
type: docs
weight: 4600
url: /de/cpp/system.xml/xmltextreader/readchars/
---
## XmlTextReader::ReadChars method


Liest den Textinhalt eines Elements in einen Zeichenpuffer. Diese Methode ist dafür ausgelegt, große Streams eingebetteten Textes durch wiederholtes Aufrufen zu lesen.

```cpp
int32_t System::Xml::XmlTextReader::ReadChars(const ArrayPtr<char16_t> &buffer, int32_t index, int32_t count)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Puffer | const ArrayPtr\<char16_t\>\& | Das Zeichenarray, das als Puffer dient, in den die Textinhalte geschrieben werden. |
| Index | int32_t | Die Position innerhalb von **buffer**, an der die Methode beginnen kann, Textinhalte zu schreiben. |
| count | int32_t | Die Anzahl der Zeichen, die in **buffer** geschrieben werden sollen. |

### ReturnValue

Die Anzahl der gelesenen Zeichen. Dies kann 0 sein, wenn der Reader nicht auf einem Element positioniert ist oder wenn im aktuellen Kontext kein weiterer Textinhalt zurückzugeben ist.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
