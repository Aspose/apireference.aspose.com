---
title: "Aspose::Font::TtfTables::TtfHeadTable classe"
linktitle: "TtfHeadTable"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::TtfTables::TtfHeadTable classe. Représente la table \"head\" du fichier de police TTF en C++."
type: docs
weight: 700
url: /fr/cpp/aspose.font.ttftables/ttfheadtable/
---
## TtfHeadTable class


Représente la table "head" du fichier [Font](../../aspose.font/font/) TTF.

```cpp
class TtfHeadTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_CheckSumAdjustment](./get_checksumadjustment/)() const | Obtient uint32 checkSumAdjustment. Pour calculer : le définir à 0, calculer la somme de contrôle pour la table 'head' et la placer dans le répertoire des tables, sommer l’ensemble de la police en uint32, puis stocker B1B0AFBA - somme. La somme de contrôle pour la table 'head' ne sera pas incorrecte. C’est correct. |
| [get_Created](./get_created/)() const | Obtient longDateTime date internationale de création. |
| [get_Flags](./get_flags/)() const | Obtient uint16 indicateurs. |
| [get_FontDirectionHint](./get_fontdirectionhint/)() const | Obtient int16 fontDirectionHint. 0 Glyphes directionnels mixtes ; 1 Seulement des glyphes fortement de gauche à droite ; 2 Comme 1 mais contenant également des neutres ; -1 Seulement des glyphes fortement de droite à gauche ; -2 Comme -1 mais contenant également des neutres. |
| [get_FontRevision](./get_fontrevision/)() const | Obtient fixed fontRevision défini par le fabricant de la police. |
| [get_GlyphDataFormat](./get_glyphdataformat/)() const | Obtient int16 glyphDataFormat 0 pour le format actuel. |
| [get_IndexToLocFormat](./get_indextolocformat/)() const | Obtient int16 indexToLocFormat 0 pour les décalages courts, 1 pour les longs. |
| [get_LowestRecPPEM](./get_lowestrecppem/)() const | Obtient uint16 lowestRecPPEM plus petite taille lisible en pixels. |
| [get_MacStyle](./get_macstyle/)() const | Obtient uint16 macStyle. |
| [get_MagicNumber](./get_magicnumber/)() const | Obtient uint32 magicNumber défini à 0x5F0F3CF5. |
| [get_Modified](./get_modified/)() const | Obtient longDateTime date internationale de modification. |
| static [get_Tag](./get_tag/)() | Obtient le tag de la table. |
| [get_UnitsPerEM](./get_unitsperem/)() const | Obtient uint16 unitsPerEm plage de 64 à 16384. |
| [get_Version](./get_version/)() const | Version fixe 0x00010000 si (version 1.0). |
| [get_XMax](./get_xmax/)() const | Obtient FWord xMax pour toutes les boîtes englobantes des glyphes. |
| [get_XMin](./get_xmin/)() const | Obtient FWord xMin pour toutes les boîtes englobantes des glyphes. |
| [get_YMax](./get_ymax/)() const | Obtient FWord yMax pour toutes les boîtes englobantes des glyphes. |
| [get_YMin](./get_ymin/)() const | Obtient FWord yMin pour toutes les boîtes englobantes des glyphes. |
## Voir aussi

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
