---
title: "System::IO::File::WriteAllLines-Methode"
linktitle: "WriteAllLines"
second_title: "Aspose.Font für C++"
description: "System::IO::File::WriteAllLines-Methode. Erstellt eine neue Textdatei oder überschreibt die vorhandene und schreibt alle Zeichenketten aus dem angegebenen Zeichenketten‑Array in die Datei, jede Zeichenkette in einer neuen Zeile, unter Verwendung der angegebenen Kodierung in C++."
type: docs
weight: 3600
url: /de/cpp/system.io/file/writealllines/
---
## File::WriteAllLines(const String\&, const ArrayPtr\<String\>\&, const EncodingPtr\&) method


Erstellt eine neue Textdatei oder überschreibt die vorhandene und schreibt alle Zeichenketten aus dem angegebenen Array von Zeichenketten hinein, jede Zeichenkette in einer neuen Zeile, unter Verwendung der angegebenen Kodierung.

```cpp
static void System::IO::File::WriteAllLines(const String &path, const ArrayPtr<String> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | const String\& | Die Datei, die erstellt oder überschrieben werden soll |
| Inhalte | const ArrayPtr\<String\>\& | Ein Zeichenketten‑Array |
| encoding | const EncodingPtr\& | Die zu verwendende Zeichenkodierung |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## File::WriteAllLines(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) method


Erstellt eine neue Textdatei oder überschreibt die vorhandene und schreibt alle Zeichenketten aus der angegebenen aufzählbaren Sammlung von Zeichenketten hinein, jede Zeichenkette in einer neuen Zeile, unter Verwendung der angegebenen Kodierung.

```cpp
static void System::IO::File::WriteAllLines(const String &path, const SharedPtr<Collections::Generic::IEnumerable<String>> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | const String\& | Die Datei, die erstellt oder überschrieben werden soll |
| Inhalte | const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | Eine aufzählbare Sammlung von Zeichenketten |
| encoding | const EncodingPtr\& | Die zu verwendende Zeichenkodierung |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
