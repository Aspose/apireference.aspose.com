---
title: Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption class
linktitle: InputBinOption
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption class. Describes the JobInputBin, DocumentInputBin and PageInputBin features options in C++.'
type: docs
weight: 700
url: /cpp/aspose.page.xps.xpsmetadata/inputbin/inputbinoption/
---
## InputBinOption class


Describes the [JobInputBin](../../jobinputbin/), [DocumentInputBin](../../documentinputbin/) and [PageInputBin](../../pageinputbin/) features options.

```cpp
class InputBinOption : public Aspose::Page::XPS::XpsMetadata::Option,
                       public Aspose::Page::XPS::XpsMetadata::InputBin::IInputBinItem
```

## Methods

| Method | Description |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | Adds an array of [IInputBinOptionItem](../iinputbinoptionitem/) instances to the option. |
| [Clone](./clone/)() | Clones this option instance. |
| [InputBinOption](./inputbinoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | Creates a new instance. |
## Fields

| Field | Description |
| --- | --- |
| static [AutoSelect](./autoselect/) | [Device](../../../aspose.page/device/) will automatically choose best option based on configuration. |
| static [AutoSheetFeeder](./autosheetfeeder/) | [Device](../../../aspose.page/device/) Input tray for Inkjet Printers. |
| static [Cassette](./cassette/) | Specifies the feed bin is a cassette. |
| static [Manual](./manual/) | Specifies the default manual feed bin. |
| static [Tractor](./tractor/) | Specifies the feed bin is a tractor. |
## See Also

* Class [Option](../../option/)
* Class [IInputBinItem](../iinputbinitem/)
* Class [InputBin](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
