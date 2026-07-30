---
title: "Classe Aspose::Font::TtfTables::TtfMaxpTable"
linktitle: "TtfMaxpTable"
second_title: "Aspose.Font pour C++"
description: "Classe Aspose::Font::TtfTables::TtfMaxpTable. Représente la table \"maxp\" du fichier de police TTF en C++."
type: docs
weight: 1200
url: /fr/cpp/aspose.font.ttftables/ttfmaxptable/
---
## TtfMaxpTable class


Représente la table "maxp" du fichier [Font](../../aspose.font/font/) TTF.

```cpp
class TtfMaxpTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_MaxComponentContours](./get_maxcomponentcontours/)() const | Obtient uint16 maxComponentContours contours dans un glyphe composé. |
| [get_MaxComponentDepth](./get_maxcomponentdepth/)() const | Obtient uint16 maxComponentDepth niveaux de récursion, définis à 0 si la police ne contient que des glyphes simples. |
| [get_MaxComponentElements](./get_maxcomponentelements/)() const | Obtient uint16 maxComponentElements nombre de glyphes référencés au niveau supérieur. |
| [get_MaxComponentPoints](./get_maxcomponentpoints/)() const | Obtient uint16 maxComponentPoints points dans un glyphe composé. |
| [get_MaxContours](./get_maxcontours/)() const | Obtient uint16 maxContours contours dans un glyphe non composé. |
| [get_MaxFunctionDefs](./get_maxfunctiondefs/)() const | Obtient uint16 maxFunctionDefs nombre de FDEFs. |
| [get_MaxInstructionDefs](./get_maxinstructiondefs/)() const | Obtient le nombre uint16 maxInstructionDefs d'IDEFs. |
| [get_MaxPoints](./get_maxpoints/)() const | Obtient le nombre uint16 maxPoints de points dans un glyphe non composé. |
| [get_MaxSizeOfInstructions](./get_maxsizeofinstructions/)() const | Obtient le nombre d'octets uint16 maxSizeOfInstructions pour les instructions du glyphe. |
| [get_MaxStackElements](./get_maxstackelements/)() const | Obtient la profondeur maximale de pile uint16 maxStackElements. |
| [get_MaxStorage](./get_maxstorage/)() const | Obtient le nombre uint16 maxStorage d'emplacements de la zone de stockage. |
| [get_MaxTwilightPoints](./get_maxtwilightpoints/)() const | Obtient le nombre uint16 maxTwilightPoints de points utilisés dans la zone crépusculaire (Z0). |
| [get_MaxZones](./get_maxzones/)() const | Obtient le nombre uint16 maxZones fixé à 2. |
| [get_NumGlyphs](./get_numglyphs/)() const | Obtient le nombre uint16 numGlyphs de glyphes dans le [Font](../../aspose.font/font/). |
| [get_TableVersion](./get_tableversion/)() const | Obtient la version du format. Utilisez les propriétés MajorNumber et MinorNUmber de l'objet [Version16Dot16](../) en notation hexadécimale pour détecter la version utilisée. |
| static [get_Tag](./get_tag/)() | Obtient le tag de la table. |
| [get_Version](./get_version/)() const | Obtient la version fixe 0x00010000 si (version 1.0). Obsolète, utilisez la propriété [TableVersion](../) à la place. |
## Voir aussi

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
