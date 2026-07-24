---
title: "Aspose::Page::XPS::Presentation::IXpsTextConversionOptions class"
linktitle: "IXpsTextConversionOptions"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::Presentation::IXpsTextConversionOptions class. Definieert opties voor de conversie van XPS naar andere formaten in C++."
type: docs
weight: 300
url: /nl/cpp/aspose.page.xps.presentation/ixpstextconversionoptions/
---
## IXpsTextConversionOptions class


Definieert opties voor de conversie van [XPS](../../aspose.page.xps/) naar andere formaten.

```cpp
class IXpsTextConversionOptions : public virtual System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [get_PreserveText](./get_preservetext/)() | In [XPS](../../aspose.page.xps/) kunnen sommige textelementen verwijzingen bevatten naar alternatieve glyphvormen die niet overeenkomen met een tekencode in het lettertype. Dient deze vlag op true te staan, wordt de tekst van dergelijke [XPS](../../aspose.page.xps/) elementen geconverteerd naar grafische vormen. Daarna verschijnt de tekst zelf transparant erboven. Dit maakt de tekst van dergelijke elementen selecteerbaar. Maar het neveneffect is dat het uitvoerbestand veel groter kan zijn dan het origineel. Staat deze vlag op false, worden de tekens die als alternatieve vormen weergegeven moeten worden vervangen door andere tekens die worden gemapt op de alternatieve glyphvormen. Daarom zal de tekst, hoewel nog steeds selecteerbaar, worden aangepast en waarschijnlijk onleesbaar worden. |
| virtual [set_PreserveText](./set_preservetext/)(bool) | In [XPS](../../aspose.page.xps/) kunnen sommige textelementen verwijzingen bevatten naar alternatieve glyphvormen die niet overeenkomen met een tekencode in het lettertype. Dient deze vlag op true te staan, wordt de tekst van dergelijke [XPS](../../aspose.page.xps/) elementen geconverteerd naar grafische vormen. Daarna verschijnt de tekst zelf transparant erboven. Dit maakt de tekst van dergelijke elementen selecteerbaar. Maar het neveneffect is dat het uitvoerbestand veel groter kan zijn dan het origineel. Staat deze vlag op false, worden de tekens die als alternatieve vormen weergegeven moeten worden vervangen door andere tekens die worden gemapt op de alternatieve glyphvormen. Daarom zal de tekst, hoewel nog steeds selecteerbaar, worden aangepast en waarschijnlijk onleesbaar worden. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Presentation](../)
* Library [Aspose.Page for C++](../../)
