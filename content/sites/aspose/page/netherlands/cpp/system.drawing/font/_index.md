---
title: "System::Drawing::Font klasse"
linktitle: "Font"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Font klasse. Vertegenwoordigt een specifiek formaat voor tekst, inclusief lettertype, grootte en stijl. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 700
url: /nl/cpp/system.drawing/font/
---
## Font class


Vertegenwoordigt een specifiek formaat voor tekst, inclusief lettertype, grootte en stijl. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class Font : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clone](./clone/)() | Retourneert een kopie van het huidige lettertype. |
| [Dispose](./dispose/)() | Geeft alle door het huidige object verworven besturingssysteembronnen vrij. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Bepaalt of het huidige en het opgegeven object identiek zijn. |
| [Font](./font/)(const SharedPtr\<Font\>\&, FontStyle) | Construeert een nieuwe instantie van de [Font](./) klasse die het opgegeven bestaande lettertype met de opgegeven lettertype‑stijl vertegenwoordigt. |
| [Font](./font/)(const SharedPtr\<FontFamily\>\&, float, FontStyle, GraphicsUnit, uint8_t, bool) | Construeert een nieuwe instantie van de [Font](./) klasse. |
| [Font](./font/)(const SharedPtr\<FontFamily\>\&, float, GraphicsUnit) | Construeert een nieuwe instantie van de [Font](./) klasse. |
| [Font](./font/)(const String\&, float, FontStyle, GraphicsUnit, uint8_t, bool) | Construeert een nieuwe instantie van de [Font](./) klasse. |
| [Font](./font/)(const String\&, float, GraphicsUnit) | Construeert een nieuwe instantie van de [Font](./) klasse. |
| static [FromLogFont](./fromlogfont/)(const SharedPtr\<Object\>\&) | NOG NIET GEÏMPLENTEERD. |
| [get_Bold](./get_bold/)() | Bepaalt of het lettertype dat door het huidige object wordt vertegenwoordigd, de vette stijl heeft toegepast. |
| [get_FontFamily](./get_fontfamily/)() | Retourneert de lettertypefamilie van het lettertype dat door het huidige object wordt vertegenwoordigd. |
| [get_FontStyle](./get_fontstyle/)() | Retourneert de lettertype‑stijl van het lettertype dat door het huidige object wordt vertegenwoordigd. |
| [get_GdiCharSet](./get_gdicharset/)() | Retourneert een waarde die aangeeft welke GDI‑karakterset wordt gebruikt door het lettertype dat door het huidige object wordt vertegenwoordigd. |
| [get_Height](./get_height/)() | Retourneert de regelafstand van het lettertype dat door het huidige object wordt vertegenwoordigd in pixels. |
| [get_Italic](./get_italic/)() | Bepaalt of het lettertype dat door het huidige object wordt vertegenwoordigd de cursieve stijl heeft toegepast. |
| [get_Name](./get_name/)() | Retourneert de naam van het lettertype dat door het huidige object wordt vertegenwoordigd. |
| [get_OriginalFontName](./get_originalfontname/)() | Retourneert de oorspronkelijk opgegeven naam van het lettertype. |
| [get_Size](./get_size/)() | Retourneert de em-grootte van het lettertype dat door het huidige object wordt vertegenwoordigd, gemeten in de eenheden die zijn gespecificeerd door de eigenschap Unit. |
| [get_SizeInPoints](./get_sizeinpoints/)() | Retourneert de em-grootte van het lettertype dat door het huidige object wordt vertegenwoordigd in punten. |
| [get_Strikeout](./get_strikeout/)() | Bepaalt of het lettertype dat door het huidige object wordt vertegenwoordigd de doorhalingstijl heeft toegepast. |
| [get_Style](./get_style/)() | Retourneert de lettertype‑stijl van het lettertype dat door het huidige object wordt vertegenwoordigd. |
| [get_Underline](./get_underline/)() | Bepaalt of het lettertype dat door het huidige object wordt vertegenwoordigd de onderstreepte stijl heeft toegepast. |
| [get_Unit](./get_unit/)() | Retourneert de meeteenheid voor het lettertype dat door het huidige object wordt vertegenwoordigd. |
| [GetHeight](./getheight/)(const SharedPtr\<Graphics\>\&) | Retourneert de regelafstand van het lettertype dat door het huidige object wordt vertegenwoordigd, in de huidige eenheid van een gespecificeerd [Graphics](../graphics/) object. |
| [GetHeight](./getheight/)(float) | Retourneert de hoogte van het lettertype dat door het huidige object wordt vertegenwoordigd wanneer het wordt getekend op een weergaveapparaat met de opgegeven verticale resolutie. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
