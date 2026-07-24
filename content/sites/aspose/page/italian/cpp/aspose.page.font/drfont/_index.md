---
title: "Aspose::Page::Font::DrFont classe"
linktitle: "DrFont"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::Font::DrFont classe. Usa questa classe al posto di GDI+ Font in C++."
type: docs
weight: 100
url: /it/cpp/aspose.page.font/drfont/
---
## DrFont class


Usa questa classe al posto di GDI+ [Font](../).

```cpp
class DrFont : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Determina se il [System::Object](../../system/object/) specificato è uguale a questa istanza. |
| [get_AscentLis](./get_ascentlis/)() | Ascensione della cella di questo font (lis). Questa è una distanza verticale dalla parte superiore della cella alla linea di base della cella. |
| [get_AscentPoints](./get_ascentpoints/)() | Restituisce l'ascesa della cella in punti. |
| [get_CellHeightLis](./get_cellheightlis/)() | Restituisce l'altezza della cella di questo carattere (lis). Questa è una scorciatoia per [AscentLis](../) + [DescentLis](../). |
| [get_CellHeightPoints](./get_cellheightpoints/)() | Scorciatoia per [AscentPoints](../) + [DescentPoints](../). |
| [get_DescentLis](./get_descentlis/)() | Discesa della cella di questo carattere (lis). Questa è una distanza verticale dal fondo della cella alla linea di base della cella. |
| [get_DescentPoints](./get_descentpoints/)() | Restituisce la discesa della cella in punti. |
| [get_FamilyName](./get_familyname/)() | Ottiene il nome di questo carattere. |
| [get_IsBold](./get_isbold/)() | Ottiene un valore che indica se questa istanza è in grassetto. |
| [get_IsItalic](./get_isitalic/)() | Ottiene un valore che indica se questa istanza è in corsivo. |
| [get_LeadingLis](./get_leadinglis/)() | Restituisce l'interlinea di questo carattere (lis). Questa è una scorciatoia per [LineSpacingLis](../) - [CellHeightLis](../). |
| [get_LeadingPoints](./get_leadingpoints/)() | Restituisce l'interlinea di questo carattere (lis). Questa è una scorciatoia per [LineSpacingLis](../) - [CellHeightLis](../). |
| [get_LineSpacingLis](./get_linespacinglis/)() | Restituisce la spaziatura della cella di questo carattere (lis). Questa è una distanza verticale tra le linee di base dei due glifi. |
| [get_LineSpacingPoints](./get_linespacingpoints/)() | Restituisce la spaziatura della cella di questo carattere (punti). Questa è una distanza verticale tra le linee di base dei due glifi. |
| [get_SizePoints](./get_sizepoints/)() | Ottiene la dimensione di questo carattere (punti). |
| [get_SmallCapsScaleFactor](./get_smallcapsscalefactor/)() | Ottiene le maiuscole del carattere. |
| [get_Style](./get_style/)() | Ottiene il carattere TrueType. |
| [get_StyleEx](./get_styleex/)() | Questa proprietà contiene informazioni aggiuntive sullo stile del carattere. |
| [GetCharWidthLis](./getcharwidthlis/)(char16_t) | Ottiene la larghezza del carattere lis. |
| [GetCharWidthPoints](./getcharwidthpoints/)(char16_t) | Restituisce la larghezza del carattere (punti). |
| [GetHashCode](./gethashcode/)() const override | Restituisce un codice hash per questa istanza. |
| [GetTextSizePoints](./gettextsizepoints/)(System::String) | Restituisce la casella di testo di misurazione del testo in punti. |
| [GetTextWidthLis](./gettextwidthlis/)(System::String) | Ottiene la larghezza del testo lis. |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String) | Ottiene la larghezza del testo in punti. |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String, int32_t, int32_t) | Ottiene la larghezza del testo in punti. |
| static [IsPoorlyRenderedByGdiPlus](./ispoorlyrenderedbygdiplus/)(System::String) | Restituisce True per il carattere "Microsoft Sans Serif". Questo è reso male da GDI+. Vedi Test286 e Gemini-6959. |
| [Replace](./replace/)(System::SharedPtr\<DrFont\>) | Sostituisci il contenuto del carattere. |
| [set_SizePoints](./set_sizepoints/)(float) | Ottiene la dimensione di questo carattere (punti). |
| [set_StyleEx](./set_styleex/)(int16_t) | Questa proprietà contiene informazioni aggiuntive sullo stile del carattere. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Font](../)
* Library [Aspose.Page for C++](../../)
