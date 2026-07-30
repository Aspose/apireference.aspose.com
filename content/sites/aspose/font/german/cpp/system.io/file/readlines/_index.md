---
title: "System::IO::File::ReadLines-Methode"
linktitle: "ReadLines"
second_title: "Aspose.Font für C++"
description: "System::IO::File::ReadLines-Methode. Liest den Inhalt der angegebenen Textdatei zeilenweise unter Verwendung der angegebenen Zeichenkodierung und gibt eine aufzählbare Sammlung von Zeichenketten zurück, von denen jede eine einzelne Zeile des Dateiinhalts in C++ darstellt."
type: docs
weight: 2600
url: /de/cpp/system.io/file/readlines/
---
## File::ReadLines method


Liest den Inhalt der angegebenen Textdatei zeilenweise unter Verwendung der angegebenen Zeichenkodierung und gibt eine aufzählbare Sammlung von Zeichenketten zurück, von denen jede eine einzelne Zeile des Dateiinhalts darstellt.

```cpp
static SharedPtr<Collections::Generic::IEnumerable<String>> System::IO::File::ReadLines(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8())
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | const String\& | Der Pfad der zu lesenden Datei |
| encoding | const EncodingPtr\& | Die zu verwendende Zeichenkodierung |

### ReturnValue

Eine aufzählbare Sammlung von Zeichenketten, die den Inhalt der angegebenen Datei darstellen

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
