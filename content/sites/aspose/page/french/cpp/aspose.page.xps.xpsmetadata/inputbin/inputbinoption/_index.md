---
title: "Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption class"
linktitle: "InputBinOption"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption classe. Décrit les options des fonctionnalités JobInputBin, DocumentInputBin et PageInputBin en C++."
type: docs
weight: 700
url: /fr/cpp/aspose.page.xps.xpsmetadata/inputbin/inputbinoption/
---
## InputBinOption class


Décrit les options des fonctionnalités [JobInputBin](../../jobinputbin/), [DocumentInputBin](../../documentinputbin/) et [PageInputBin](../../pageinputbin/).

```cpp
class InputBinOption : public Aspose::Page::XPS::XpsMetadata::Option,
                       public Aspose::Page::XPS::XpsMetadata::InputBin::IInputBinItem
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | Ajoute un tableau d'instances de [IInputBinOptionItem](../iinputbinoptionitem/) à l'option. |
| [Clone](./clone/)() | Clone cette instance d'option. |
| [InputBinOption](./inputbinoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | Crée une nouvelle instance. |
## Champs

| Champ | Description |
| --- | --- |
| static [AutoSelect](./autoselect/) | L'appareil choisira automatiquement la meilleure option en fonction de la configuration. |
| static [AutoSheetFeeder](./autosheetfeeder/) | Bac d'entrée de l'appareil pour imprimantes à jet d'encre. |
| static [Cassette](./cassette/) | Spécifie que le bac d'alimentation est une cassette. |
| static [Manual](./manual/) | Spécifie le bac d'alimentation manuel par défaut. |
| static [Tractor](./tractor/) | Spécifie que le bac d'alimentation est un tracteur. |
## Voir aussi

* Class [Option](../../option/)
* Class [IInputBinItem](../iinputbinitem/)
* Class [InputBin](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
