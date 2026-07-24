---
title: "Aspose::Page::SaveOptions klass"
linktitle: "SaveOptions"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::SaveOptions klass. Denna klass innehåller alternativ som behövs för att hantera konverteringsprocessen i C++."
type: docs
weight: 1500
url: /sv/cpp/aspose.page/saveoptions/
---
## SaveOptions class


Denna klass innehåller alternativ som behövs för att hantera konverteringsprocessen.

```cpp
class SaveOptions : public virtual System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [get_AdditionalFontsFolders](./get_additionalfontsfolders/)() const | Anger ytterligare mappar där konverteraren ska hitta teckensnitt för inmatningsdokumentet. Standardmappen är standardteckensnittsmappen där OS hittar teckensnitt för interna behov. |
| virtual [get_ConvertFontsToTTF](./get_convertfontstottf/)() | Anger om icke-TrueType-teckensnitt ska sparas som TTF. Det minskar avsevärt volymen på det resulterande dokumentet vid PS till PDF-konvertering och ökar hastigheten för konvertering av PS-filer med en stor mängd text i icke-TrueType-teckensnitt till vilket outputformat som helst. Det finns dock en liten vertikal förskjutning av texten när en PostSctipt-fil konverteras till bild. |
| virtual [get_Debug](./get_debug/)() | Anger om felsökningsinformation ska skrivas ut till standardutdataflödet eller inte. |
| virtual [get_Exceptions](./get_exceptions/)() | Returnerar en lista över undertryckta konverteringsfel om [SuppressErrors](../) är sant. |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | Kvalitetskategorin anger komprimeringsnivån för en bild. Tillgängliga värden är 0 till 100. Ju lägre det angivna talet är, desto högre blir komprimeringen och därmed lägre bildkvalitet. Värdet 0 ger den lägsta bildkvaliteten, medan 100 ger den högsta. |
| [get_Size](./get_size/)() const | Hämtar/anger storleken på bilden. |
| virtual [get_SupressErrors](./get_supresserrors/)() | Anger om fel ska undertryckas eller inte. Om sant läggs undertryckta fel till i [Exceptions](../)-listan. Om falskt avslutas programmet vid det första felet. |
| [SaveOptions](./saveoptions/)() | Initierar en ny instans av klassen [SaveOptions](./) med standardvärden för flaggorna [SuppressErrors](../) (true) och [Debug](../) (false). |
| [SaveOptions](./saveoptions/)(bool) | Initierar en ny instans av klassen [SaveOptions](./) med standardvärde för flaggan [Debug](../) (false). |
| [SaveOptions](./saveoptions/)(Aspose::Page::Drawing::Size) | Initierar en ny instans av [SaveOptions](./) med specificerad sidstorlek. |
| [SaveOptions](./saveoptions/)(bool, Aspose::Page::Drawing::Size) | Initierar en ny instans av klassen [SaveOptions](./) med standardvärde för flaggan [Debug](../) (false) och med specificerad sidstorlek. |
| [set_AdditionalFontsFolders](./set_additionalfontsfolders/)(System::ArrayPtr\<System::String\>) | Anger ytterligare mappar där konverteraren ska hitta teckensnitt för inmatningsdokumentet. Standardmappen är standardteckensnittsmappen där OS hittar teckensnitt för interna behov. |
| virtual [set_ConvertFontsToTTF](./set_convertfontstottf/)(bool) | Anger om icke-TrueType-teckensnitt ska sparas som TTF. Det minskar avsevärt volymen på det resulterande dokumentet vid PS till PDF-konvertering och ökar hastigheten för konvertering av PS-filer med en stor mängd text i icke-TrueType-teckensnitt till vilket outputformat som helst. Det finns dock en liten vertikal förskjutning av texten när en PostSctipt-fil konverteras till bild. |
| virtual [set_Debug](./set_debug/)(bool) | Anger om felsökningsinformation ska skrivas ut till standardutdataflödet eller inte. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | Kvalitetskategorin anger komprimeringsnivån för en bild. Tillgängliga värden är 0 till 100. Ju lägre det angivna talet är, desto högre blir komprimeringen och därmed lägre bildkvalitet. Värdet 0 ger den lägsta bildkvaliteten, medan 100 ger den högsta. |
| [set_Size](./set_size/)(Aspose::Page::Drawing::Size) | Hämtar/anger storleken på bilden. |
| virtual [set_SupressErrors](./set_supresserrors/)(bool) | Anger om fel ska undertryckas eller inte. Om sant läggs undertryckta fel till i [Exceptions](../)-listan. Om falskt avslutas programmet vid det första felet. |
## Se även

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
