---
title: "Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption class"
linktitle: "InputBinOption"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption Klasse. Beschreibt die JobInputBin-, DocumentInputBin- und PageInputBin-Feature-Optionen in C++."
type: docs
weight: 700
url: /de/cpp/aspose.page.xps.xpsmetadata/inputbin/inputbinoption/
---
## InputBinOption class


Beschreibt die [JobInputBin](../../jobinputbin/), [DocumentInputBin](../../documentinputbin/) und [PageInputBin](../../pageinputbin/) Feature-Optionen.

```cpp
class InputBinOption : public Aspose::Page::XPS::XpsMetadata::Option,
                       public Aspose::Page::XPS::XpsMetadata::InputBin::IInputBinItem
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | Fügt dem Optionsobjekt ein Array von [IInputBinOptionItem](../iinputbinoptionitem/)-Instanzen hinzu. |
| [Clone](./clone/)() | Klonen Sie diese Optionsinstanz. |
| [InputBinOption](./inputbinoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | Erstellt eine neue Instanz. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [AutoSelect](./autoselect/) | Das Gerät wählt automatisch die beste Option basierend auf der Konfiguration. |
| static [AutoSheetFeeder](./autosheetfeeder/) | Geräte-Einzug für Tintenstrahldrucker. |
| static [Cassette](./cassette/) | Gibt an, dass das Zuführfach ein Kassettenfach ist. |
| static [Manual](./manual/) | Gibt das standardmäßige manuelle Zuführfach an. |
| static [Tractor](./tractor/) | Gibt an, dass das Zuführfach ein Traktorfach ist. |
## Siehe auch

* Class [Option](../../option/)
* Class [IInputBinItem](../iinputbinitem/)
* Class [InputBin](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
