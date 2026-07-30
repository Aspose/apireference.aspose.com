---
title: "System::IO::File::AppendAllLines-Methode"
linktitle: "AppendAllLines"
second_title: "Aspose.Font für C++"
description: "System::IO::File::AppendAllLines-Methode. Fügt Zeichenketten aus der angegebenen Sammlung von Zeichenketten in die angegebene Datei ein, wobei die angegebene Codierung verwendet wird, indem jede Zeichenkette in einer neuen Zeile geschrieben wird. Wenn die angegebene Datei nicht existiert, wird sie erstellt. Die Datei wird nach dem Schreiben aller Zeichenketten in C++ geschlossen."
type: docs
weight: 100
url: /de/cpp/system.io/file/appendalllines/
---
## File::AppendAllLines method


Fügt Zeichenketten aus der angegebenen Sammlung von Zeichenketten an die angegebene Datei mit der angegebenen Kodierung an, indem jede Zeichenkette in einer neuen Zeile geschrieben wird. Wenn die angegebene Datei nicht existiert, wird sie erstellt. Die Datei wird nach dem Schreiben aller Zeichenketten geschlossen.

```cpp
static void System::IO::File::AppendAllLines(const String &path, const SharedPtr<Collections::Generic::IEnumerable<String>> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | const String\& | Der Pfad der Datei, zu der die Zeichenketten angehängt werden sollen |
| Inhalte | const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | Die Zeichenketten, die in die Datei geschrieben werden sollen |
| encoding | const EncodingPtr\& | Die zu verwendende Zeichenkodierung |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
