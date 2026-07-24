---
title: "Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption class"
linktitle: "InputBinOption"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption classe. Descrive le opzioni delle funzionalità JobInputBin, DocumentInputBin e PageInputBin in C++."
type: docs
weight: 700
url: /it/cpp/aspose.page.xps.xpsmetadata/inputbin/inputbinoption/
---
## InputBinOption class


Descrive le opzioni delle funzionalità [JobInputBin](../../jobinputbin/), [DocumentInputBin](../../documentinputbin/) e [PageInputBin](../../pageinputbin/).

```cpp
class InputBinOption : public Aspose::Page::XPS::XpsMetadata::Option,
                       public Aspose::Page::XPS::XpsMetadata::InputBin::IInputBinItem
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | Aggiunge un array di istanze di [IInputBinOptionItem](../iinputbinoptionitem/) all'opzione. |
| [Clone](./clone/)() | Clona questa istanza di opzione. |
| [InputBinOption](./inputbinoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | Crea una nuova istanza. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [AutoSelect](./autoselect/) | Il dispositivo sceglierà automaticamente la migliore opzione in base alla configurazione. |
| static [AutoSheetFeeder](./autosheetfeeder/) | Vassoio di ingresso del dispositivo per stampanti a getto d'inchiostro. |
| static [Cassette](./cassette/) | Specifica che il vassoio di alimentazione è una cassetta. |
| static [Manual](./manual/) | Specifica il vassoio di alimentazione manuale predefinito. |
| static [Tractor](./tractor/) | Specifica che il vassoio di alimentazione è un trattore. |
## Vedi anche

* Class [Option](../../option/)
* Class [IInputBinItem](../iinputbinitem/)
* Class [InputBin](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
