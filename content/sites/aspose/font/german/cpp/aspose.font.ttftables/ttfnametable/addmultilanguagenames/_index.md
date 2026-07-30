---
title: "Aspose::Font::TtfTables::TtfNameTable::AddMultiLanguageNames-Methode"
linktitle: "AddMultiLanguageNames"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::TtfTables::TtfNameTable::AddMultiLanguageNames-Methode. Extrahiert alle mehrsprachigen Zeichenketten aus dem übergebenen mlNames-Objekt und erstellt für jede extrahierte Zeichenkette eine entsprechende NameRecord-Struktur unter Verwendung der übergebenen Parameter platformId, platformSpecificId und nameId. Der Wert für das Feld languageID wird aus dem mlNames-Objekt entnommen. Der neu erstellte Datensatz wird in die Tabelle eingefügt. Wird ein Datensatz gefunden, der mit den Feldern platformID, platformSpecificID, nameID und, langugeId übereinstimmt, wird der neu erstellte Datensatz nicht hinzugefügt und nur die Zeichenkettendaten des bestehenden Datensatzes in C++ aktualisiert."
type: docs
weight: 200
url: /de/cpp/aspose.font.ttftables/ttfnametable/addmultilanguagenames/
---
## TtfNameTable::AddMultiLanguageNames method


Extrahiert alle mehrsprachigen Zeichenketten aus dem übergebenen *mlNames*-Objekt und erstellt für jede extrahierte Zeichenkette eine entsprechende [NameRecord](../namerecord/)-Struktur unter Verwendung der übergebenen Parameter *platformId*, *platformSpecificId* und *nameId*. Der Wert für das Feld languageID wird aus dem *mlNames*-Objekt entnommen. Der neu erstellte Datensatz wird in die Tabelle eingefügt. Wird ein Datensatz gefunden, der mit den Feldern platformID, platformSpecificID, nameID und, langugeId übereinstimmt, wird der neu erstellte Datensatz nicht hinzugefügt und nur die Zeichenkettendaten des bestehenden Datensatzes aktualisiert.

```cpp
void Aspose::Font::TtfTables::TtfNameTable::AddMultiLanguageNames(System::SharedPtr<MultiLanguageString> mlNames, TtfNameTable::PlatformId platformId, uint16_t platformSpecificId, TtfNameTable::NameId nameId)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| mlNames | System::SharedPtr\<MultiLanguageString\> | Mehrsprachige Zeichenkette |
| platformId | TtfNameTable::PlatformId | Plattform-Identifikator |
| platformSpecificId | uint16_t | Plattform-spezifischer Kodierungsidentifikator |
| nameId | TtfNameTable::NameId | Namensidentifikator, logische Zeichenkettenkategorie, angegeben durch die [NameId](../nameid/)‑Aufzählung |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [MultiLanguageString](../../../aspose.font/multilanguagestring/)
* Enum [PlatformId](../platformid/)
* Enum [NameId](../nameid/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
