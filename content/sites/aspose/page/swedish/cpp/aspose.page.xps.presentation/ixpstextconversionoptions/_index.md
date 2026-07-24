---
title: "Aspose::Page::XPS::Presentation::IXpsTextConversionOptions class"
linktitle: "IXpsTextConversionOptions"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::Presentation::IXpsTextConversionOptions class. Definierar alternativ för konvertering av XPS till andra format i C++."
type: docs
weight: 300
url: /sv/cpp/aspose.page.xps.presentation/ixpstextconversionoptions/
---
## IXpsTextConversionOptions class


Definierar alternativ för konvertering av [XPS](../../aspose.page.xps/) till andra format.

```cpp
class IXpsTextConversionOptions : public virtual System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| virtual [get_PreserveText](./get_preservetext/)() | I [XPS](../../aspose.page.xps/) kan vissa textelement innehålla referenser till alternativa glyfformer som inte motsvarar någon teckenkod i teckensnittet. Om denna flagga är satt till true konverteras texten från sådana [XPS](../../aspose.page.xps/)-element till grafiska former. Därefter visas själva texten transparent ovanpå. Detta gör att texten i sådana element kan väljas. Men bieffekten är att utdatafilen kan bli mycket större än originalet. Om flaggan är satt till false ersätts tecknen som ska visas som alternativa former med andra tecken som mappas till de alternativa glyfformerna. Därför kommer texten, även om den fortfarande är valbar, att modifieras och sannolikt bli oläslig. |
| virtual [set_PreserveText](./set_preservetext/)(bool) | I [XPS](../../aspose.page.xps/) kan vissa textelement innehålla referenser till alternativa glyfformer som inte motsvarar någon teckenkod i teckensnittet. Om denna flagga är satt till true konverteras texten från sådana [XPS](../../aspose.page.xps/)-element till grafiska former. Därefter visas själva texten transparent ovanpå. Detta gör att texten i sådana element kan väljas. Men bieffekten är att utdatafilen kan bli mycket större än originalet. Om flaggan är satt till false ersätts tecknen som ska visas som alternativa former med andra tecken som mappas till de alternativa glyfformerna. Därför kommer texten, även om den fortfarande är valbar, att modifieras och sannolikt bli oläslig. |
## Se även

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Presentation](../)
* Library [Aspose.Page for C++](../../)
