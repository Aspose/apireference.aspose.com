---
title: "Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption class"
linktitle: "InputBinOption"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption klass. Beskriver JobInputBin-, DocumentInputBin- och PageInputBin-funktionernas alternativ i C++."
type: docs
weight: 700
url: /sv/cpp/aspose.page.xps.xpsmetadata/inputbin/inputbinoption/
---
## InputBinOption class


Beskriver alternativen för [JobInputBin](../../jobinputbin/), [DocumentInputBin](../../documentinputbin/) och [PageInputBin](../../pageinputbin/) funktioner.

```cpp
class InputBinOption : public Aspose::Page::XPS::XpsMetadata::Option,
                       public Aspose::Page::XPS::XpsMetadata::InputBin::IInputBinItem
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | Lägger till en array av [IInputBinOptionItem](../iinputbinoptionitem/)‑instanser till alternativet. |
| [Clone](./clone/)() | Klonar detta alternativ‑objekt. |
| [InputBinOption](./inputbinoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | Skapar en ny instans. |
## Fält

| Fält | Beskrivning |
| --- | --- |
| static [AutoSelect](./autoselect/) | Enheten väljer automatiskt det bästa alternativet baserat på konfigurationen. |
| static [AutoSheetFeeder](./autosheetfeeder/) | Enhetens inmatningsfack för bläckstråleskrivare. |
| static [Cassette](./cassette/) | Anger att matningsfacket är en kassett. |
| static [Manual](./manual/) | Anger standard manuellt matningsfack. |
| static [Tractor](./tractor/) | Anger att matningsfacket är en traktor. |
## Se även

* Class [Option](../../option/)
* Class [IInputBinItem](../iinputbinitem/)
* Class [InputBin](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
