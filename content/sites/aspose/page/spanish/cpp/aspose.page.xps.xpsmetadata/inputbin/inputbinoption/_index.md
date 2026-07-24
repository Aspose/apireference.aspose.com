---
title: "Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption class"
linktitle: "InputBinOption"
second_title: "Aspose.Page para C++"
description: "Clase Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption. Describe las opciones de características de JobInputBin, DocumentInputBin y PageInputBin en C++."
type: docs
weight: 700
url: /es/cpp/aspose.page.xps.xpsmetadata/inputbin/inputbinoption/
---
## InputBinOption class


Describe las opciones de características de [JobInputBin](../../jobinputbin/), [DocumentInputBin](../../documentinputbin/) y [PageInputBin](../../pageinputbin/).

```cpp
class InputBinOption : public Aspose::Page::XPS::XpsMetadata::Option,
                       public Aspose::Page::XPS::XpsMetadata::InputBin::IInputBinItem
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | Agrega una matriz de instancias de [IInputBinOptionItem](../iinputbinoptionitem/) a la opción. |
| [Clone](./clone/)() | Clona esta instancia de opción. |
| [InputBinOption](./inputbinoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | Crea una nueva instancia. |
## Campos

| Campo | Descripción |
| --- | --- |
| static [AutoSelect](./autoselect/) | El dispositivo elegirá automáticamente la mejor opción según la configuración. |
| static [AutoSheetFeeder](./autosheetfeeder/) | Bandeja de entrada del dispositivo para impresoras de inyección de tinta. |
| static [Cassette](./cassette/) | Especifica que la bandeja de alimentación es una casete. |
| static [Manual](./manual/) | Especifica la bandeja de alimentación manual predeterminada. |
| static [Tractor](./tractor/) | Especifica que la bandeja de alimentación es una transportadora. |
## Ver también

* Class [Option](../../option/)
* Class [IInputBinItem](../iinputbinitem/)
* Class [InputBin](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
