---
title: "Aspose::Font::TtfTables::TtfPostTable classe"
linktitle: "TtfPostTable"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::TtfTables::TtfPostTable classe. Représente la table \"post\" du fichier de police TTF en C++."
type: docs
weight: 1500
url: /fr/cpp/aspose.font.ttftables/ttfposttable/
---
## TtfPostTable class


Représente la table "post" du fichier [Font](../../aspose.font/font/) TTF.

```cpp
class TtfPostTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Format](./get_format/)() | Obtient le format fixe (version) de cette table. Obsolète, utilisez la propriété [TableFormat](../). |
| [get_HasNoPostScriptNames](./get_hasnopostscriptnames/)() | Indique qu’aucune information de nom PostScript n’est fournie pour les glyphes de ce fichier de police. |
| [get_IsFixedPitch](./get_isfixedpitch/)() | Obtient uint32 isFixedPitch. 0 si la police est à espacement proportionnel, non zéro si la police n’est pas à espacement proportionnel (c’est‑à‑dire à chasse fixe). |
| [get_ItalicAngle](./get_italicangle/)() | Obtient l’italicAngle fixe. Angle italique en degrés. |
| [get_MaxMemType1](./get_maxmemtype1/)() | Obtient uint32 maxMemType1 Mémoire maximale utilisée lorsqu’une police TrueType est téléchargée en tant que [Font](../../aspose.font/font/) de type 1. |
| [get_MaxMemType42](./get_maxmemtype42/)() | Obtient uint32 maxMemType42 Mémoire maximale utilisée lorsqu’une police TrueType est téléchargée en tant que [Font](../../aspose.font/font/) de type 42. |
| [get_MinMemType1](./get_minmemtype1/)() | Obtient uint32 minMemType1 Mémoire minimale utilisée lorsqu’une police TrueType est téléchargée en tant que [Font](../../aspose.font/font/) de type 1. |
| [get_MinMemType42](./get_minmemtype42/)() | Obtient uint32 minMemType42 Mémoire minimale utilisée lorsqu’une police TrueType est téléchargée en tant que [Font](../../aspose.font/font/) de type 42. |
| [get_TableFormat](./get_tableformat/)() | Obtient le format fixe (version) de cette table. Utilisez les propriétés MajorNumber et MinorNUmber de l’objet [Version16Dot16](../) en notation hexadécimale pour détecter la version utilisée. |
| static [get_Tag](./get_tag/)() | Obtient le tag de la table. |
| [get_UnderlinePosition](./get_underlineposition/)() | Obtient la valeur FWord underlinePosition. |
| [get_UnderlineThickness](./get_underlinethickness/)() | Obtient la valeur FWord underlineThickness. |
| [GetAllGlyphIndexesForGlyphName](./getallglyphindexesforglyphname/)(System::String) | Obtient le tableau des index de glyphes par nom de glyphe. |
| [GetGlyphIndex](./getglyphindex/)(System::String) | Obtient l’index du glyphe par son nom. |
| [GetGlyphName](./getglyphname/)(uint32_t) | Obtient le nom du glyphe par son index. |
## Voir aussi

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
