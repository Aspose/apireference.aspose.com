---
title: "Aspose::Font::TtfTables::TtfHeadTable classe"
linktitle: "TtfHeadTable"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::TtfTables::TtfHeadTable classe. Rappresenta la tabella \"head\" del file Font TTF in C++."
type: docs
weight: 700
url: /it/cpp/aspose.font.ttftables/ttfheadtable/
---
## TtfHeadTable class


Rappresenta la tabella "head" del file TTF [Font](../../aspose.font/font/)

```cpp
class TtfHeadTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_CheckSumAdjustment](./get_checksumadjustment/)() const | Restituisce uint32 checkSumAdjustment. Per calcolarlo: impostalo a 0, calcola il checksum per la tabella 'head' e inseriscilo nella directory della tabella, somma l'intero font come uint32, quindi memorizza B1B0AFBA - somma. Il checksum per la tabella 'head' non sarà errato. Va bene. |
| [get_Created](./get_created/)() const | Restituisce longDateTime data internazionale di creazione. |
| [get_Flags](./get_flags/)() const | Restituisce uint16 flag. |
| [get_FontDirectionHint](./get_fontdirectionhint/)() const | Restituisce int16 fontDirectionHint. 0 Glifi direzionali misti; 1 Solo glifi fortemente da sinistra a destra; 2 Come 1 ma contiene anche neutrali; -1 Solo glifi fortemente da destra a sinistra; -2 Come -1 ma contiene anche neutrali. |
| [get_FontRevision](./get_fontrevision/)() const | Restituisce fixed fontRevision impostato dal produttore del font. |
| [get_GlyphDataFormat](./get_glyphdataformat/)() const | Restituisce int16 glyphDataFormat 0 per il formato corrente. |
| [get_IndexToLocFormat](./get_indextolocformat/)() const | Restituisce int16 indexToLocFormat 0 per offset brevi, 1 per lunghi. |
| [get_LowestRecPPEM](./get_lowestrecppem/)() const | Restituisce uint16 lowestRecPPEM dimensione leggibile più piccola in pixel. |
| [get_MacStyle](./get_macstyle/)() const | Restituisce uint16 macStyle. |
| [get_MagicNumber](./get_magicnumber/)() const | Restituisce uint32 magicNumber impostato a 0x5F0F3CF5. |
| [get_Modified](./get_modified/)() const | Restituisce longDateTime data internazionale di modifica. |
| static [get_Tag](./get_tag/)() | Ottiene il tag della tabella. |
| [get_UnitsPerEM](./get_unitsperem/)() const | Restituisce uint16 unitsPerEm intervallo da 64 a 16384. |
| [get_Version](./get_version/)() const | Versione fissa 0x00010000 se (versione 1.0). |
| [get_XMax](./get_xmax/)() const | Restituisce FWord xMax per tutti i riquadri di delimitazione dei glifi. |
| [get_XMin](./get_xmin/)() const | Restituisce FWord xMin per tutti i riquadri di delimitazione dei glifi. |
| [get_YMax](./get_ymax/)() const | Restituisce FWord yMax per tutti i riquadri di delimitazione dei glifi. |
| [get_YMin](./get_ymin/)() const | Restituisce FWord yMin per tutti i riquadri di delimitazione dei glifi. |
## Vedi anche

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
