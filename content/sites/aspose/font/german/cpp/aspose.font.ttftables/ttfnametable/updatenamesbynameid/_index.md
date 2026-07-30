---
title: "Aspose::Font::TtfTables::TtfNameTable::UpdateNamesByNameId method"
linktitle: "UpdateNamesByNameId"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::TtfTables::TtfNameTable::UpdateNamesByNameId method. Wählt alle Datensätze aus, die zur logischen Zeichenkettenkategorie gehören, die durch den Parameter nameId angegeben ist, und aktualisiert das Namensfeld (String‑Daten) in diesen Datensätzen. Felder, die sich auf die Plattform (platformID, Plattform‑spezifische Kodierungs‑ID) und die Sprache (Language ID) beziehen, werden von dieser Methode nicht beeinflusst. Nur die Zeichenkettendaten des Namens werden durch einen neuen Namen ersetzt. Verwenden Sie diese Methode mit Vorsicht, da sie die ursprünglichen Namen für alle Plattformen und Sprachen, die zu nameId gehören, ersetzt. Es kann zu Konflikten führen, wenn die ursprünglichen Namen unterschiedliche Werte hatten, da der Ersetzungsvorgang all diese Werte durch einen einzigen neuen Wert ändert. Und dieser neue Wert kann eine logische Inkonsistenz mit einigen Plattformen und Sprachen aufweisen. Diese Methode ist nützlich für Fälle, in denen der ursprüngliche Name eine einheitliche Darstellung für alle Plattformen und Sprachen hat, zum Beispiel, wenn die Namens‑String‑Daten in englischer Sprache in C++ vorliegen."
type: docs
weight: 1100
url: /de/cpp/aspose.font.ttftables/ttfnametable/updatenamesbynameid/
---
## TtfNameTable::UpdateNamesByNameId method


Wählt alle Datensätze aus, die zur logischen Zeichenkettenkategorie gehören, angegeben durch den Parameter nameId, und aktualisiert das Namensfeld (String‑Daten) in diesen Datensätzen. Felder, die sich auf die Plattform (platformID, plattformspezifische Kodierungs‑ID) und die Sprache (Language ID) beziehen, werden von dieser Methode nicht beeinflusst. Nur die String‑Daten des Namens werden durch einen neuen Namen ersetzt. Verwenden Sie diese Methode mit Vorsicht, da sie die ursprünglichen Namen für alle Plattformen und Sprachen, die zu nameId gehören, ersetzt. Es kann zu Konflikten kommen, wenn die ursprünglichen Namen unterschiedliche Werte hatten, da der Ersetzungsvorgang all diese Werte durch einen einzigen neuen Wert ändert. Und dieser neue Wert kann eine logische Inkonsistenz mit einigen Plattformen und Sprachen aufweisen. Diese Methode ist nützlich für Fälle, in denen der ursprüngliche Name eine einheitliche Darstellung für alle Plattformen und Sprachen hat, zum Beispiel, wenn die String‑Daten des Namens in englischer Sprache vorliegen.

```cpp
void Aspose::Font::TtfTables::TtfNameTable::UpdateNamesByNameId(TtfNameTable::NameId nameId, System::String newName)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| nameId | TtfNameTable::NameId | Namensidentifikator, logische Zeichenkettenkategorie, angegeben durch die [NameId](../nameid/)‑Aufzählung |
| newName | System::String | Neuer Name oder neue Zeichenkettendaten |

## Siehe auch

* Enum [NameId](../nameid/)
* Class [String](../../../system/string/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
