---
title: "Aspose::Page::Font::DrFont Klasse"
linktitle: "DrFont"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::Font::DrFont Klasse. Verwenden Sie diese Klasse anstelle von GDI+ Font in C++."
type: docs
weight: 100
url: /de/cpp/aspose.page.font/drfont/
---
## DrFont class


Verwenden Sie diese Klasse anstelle von GDI+ [Font](../).

```cpp
class DrFont : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Bestimmt, ob das angegebene [System::Object](../../system/object/) gleich dieser Instanz ist. |
| [get_AscentLis](./get_ascentlis/)() | Zellaufstieg dieser Schrift (lis). Dies ist ein vertikaler Abstand von der Zelloberseite zur Zellgrundlinie. |
| [get_AscentPoints](./get_ascentpoints/)() | Gibt den Zellaufstieg in Punkten zurück. |
| [get_CellHeightLis](./get_cellheightlis/)() | Gibt die Zellhöhe dieser Schriftart (lis) zurück. Dies ist eine Abkürzung für [AscentLis](../) + [DescentLis](../). |
| [get_CellHeightPoints](./get_cellheightpoints/)() | Abkürzung für [AscentPoints](../) + [DescentPoints](../). |
| [get_DescentLis](./get_descentlis/)() | Zellabstieg dieser Schriftart (lis). Dies ist ein vertikaler Abstand vom Zellenboden zur Zellgrundlinie. |
| [get_DescentPoints](./get_descentpoints/)() | Gibt den Zellabstieg in Punkten zurück. |
| [get_FamilyName](./get_familyname/)() | Liest den Namen dieser Schriftart. |
| [get_IsBold](./get_isbold/)() | Liest einen Wert, der angibt, ob diese Instanz fett ist. |
| [get_IsItalic](./get_isitalic/)() | Liest einen Wert, der angibt, ob diese Instanz kursiv ist. |
| [get_LeadingLis](./get_leadinglis/)() | Gibt den Zeilenabstand dieser Schriftart (lis) zurück. Dies ist eine Abkürzung für [LineSpacingLis](../) - [CellHeightLis](../). |
| [get_LeadingPoints](./get_leadingpoints/)() | Gibt den Zeilenabstand dieser Schriftart (lis) zurück. Dies ist eine Abkürzung für [LineSpacingLis](../) - [CellHeightLis](../). |
| [get_LineSpacingLis](./get_linespacinglis/)() | Gibt den Zellenabstand dieser Schriftart (lis) zurück. Dies ist ein vertikaler Abstand zwischen den Grundlinien der beiden Glyphen. |
| [get_LineSpacingPoints](./get_linespacingpoints/)() | Gibt den Zellenabstand dieser Schriftart (Punkte) zurück. Dies ist ein vertikaler Abstand zwischen den Grundlinien der beiden Glyphen. |
| [get_SizePoints](./get_sizepoints/)() | Liest die Größe dieser Schriftart (Punkte). |
| [get_SmallCapsScaleFactor](./get_smallcapsscalefactor/)() | Liest die Großbuchstaben der Schriftart. |
| [get_Style](./get_style/)() | Liest die TrueType-Schrift. |
| [get_StyleEx](./get_styleex/)() | Diese Eigenschaft enthält zusätzliche Informationen zum Stil der Schriftart. |
| [GetCharWidthLis](./getcharwidthlis/)(char16_t) | Liest die Zeichenbreite lis. |
| [GetCharWidthPoints](./getcharwidthpoints/)(char16_t) | Gibt die Breite des Zeichens (Punkte) zurück. |
| [GetHashCode](./gethashcode/)() const override | Gibt einen Hashcode für diese Instanz zurück. |
| [GetTextSizePoints](./gettextsizepoints/)(System::String) | Gibt die Mess-Textbox des Textes in Punkten zurück. |
| [GetTextWidthLis](./gettextwidthlis/)(System::String) | Liest die Textbreite lis. |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String) | Liest die Textbreite in Punkten. |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String, int32_t, int32_t) | Liest die Textbreite in Punkten. |
| static [IsPoorlyRenderedByGdiPlus](./ispoorlyrenderedbygdiplus/)(System::String) | Gibt True für die Schriftart "Microsoft Sans Serif" zurück. Diese wird von GDI+ schlecht dargestellt. Siehe Test286 und Gemini-6959. |
| [Replace](./replace/)(System::SharedPtr\<DrFont\>) | Ersetzt den Schriftartinhalt. |
| [set_SizePoints](./set_sizepoints/)(float) | Liest die Größe dieser Schriftart (Punkte). |
| [set_StyleEx](./set_styleex/)(int16_t) | Diese Eigenschaft enthält zusätzliche Informationen zum Stil der Schriftart. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Font](../)
* Library [Aspose.Page for C++](../../)
