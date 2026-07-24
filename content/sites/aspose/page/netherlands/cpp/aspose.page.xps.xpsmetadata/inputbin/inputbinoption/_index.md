---
title: "Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption class"
linktitle: "InputBinOption"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption class. Beschrijft de opties voor de JobInputBin-, DocumentInputBin- en PageInputBin-functies in C++."
type: docs
weight: 700
url: /nl/cpp/aspose.page.xps.xpsmetadata/inputbin/inputbinoption/
---
## InputBinOption class


Beschrijft de opties voor de [JobInputBin](../../jobinputbin/), [DocumentInputBin](../../documentinputbin/) en [PageInputBin](../../pageinputbin/) functies.

```cpp
class InputBinOption : public Aspose::Page::XPS::XpsMetadata::Option,
                       public Aspose::Page::XPS::XpsMetadata::InputBin::IInputBinItem
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | Voegt een array van [IInputBinOptionItem](../iinputbinoptionitem/) instanties toe aan de optie. |
| [Clone](./clone/)() | Kloont deze optie-instantie. |
| [InputBinOption](./inputbinoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | Maakt een nieuw exemplaar aan. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [AutoSelect](./autoselect/) | Apparaat kiest automatisch de beste optie op basis van de configuratie. |
| static [AutoSheetFeeder](./autosheetfeeder/) | Invoerlade van het apparaat voor inkjetprinters. |
| static [Cassette](./cassette/) | Specificeert dat de voedlade een cassette is. |
| static [Manual](./manual/) | Specificeert de standaard handmatige voedlade. |
| static [Tractor](./tractor/) | Specificeert dat de voedlade een tractor is. |
## Zie ook

* Class [Option](../../option/)
* Class [IInputBinItem](../iinputbinitem/)
* Class [InputBin](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
