---
title: Aspose::Page::XPS::Presentation::Aps::ApsSaveOptions class
linktitle: ApsSaveOptions
second_title: Aspose.Page for C++
description: 'How to use Aspose::Page::XPS::Presentation::Aps::ApsSaveOptions class in C++.'
type: docs
weight: 200
url: /cpp/aspose.page.xps.presentation.aps/apssaveoptions/
---
## ApsSaveOptions class




```cpp
class ApsSaveOptions : public Aspose::Page::SaveOptions,
                       public Aspose::Page::IMultiPageSaveOptions,
                       public Aspose::Page::XPS::Presentation::IXpsTextConversionOptions
```

## Methods

| Method | Description |
| --- | --- |
| [ApsSaveOptions](./apssaveoptions/)() | Creates new instance of options. |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() const | The collection of event handlers that performs modifications to an [XPS](../../aspose.page.xps/) page just before it is saved. |
| [get_ConversionMode](./get_conversionmode/)() const | Conversion mode. |
| [get_EmulatePdfToAps](./get_emulatepdftoaps/)() const | Gets/sets the value indicating whether hyperlink active rectangles should be set to target locations and page numbers in jump links should be plus 1. This is the way Aspose.PDF converts PDF document to APS. |
| [get_PageNumbers](./get_pagenumbers/)() override | Gets/sets the array of numbers of pages to convert. |
| [get_PreserveText](./get_preservetext/)() override | In [XPS](../../aspose.page.xps/), some text elements may contain references to alternate glyph forms that do not correspond to any character code in the font. If this flag is set to true, the text from such [XPS](../../aspose.page.xps/) elements is converted to graphic shapes. Then the text itself appears transparent on top. This leaves the text of such elements selectable. But the side effect is that the output file may be much larger than the original. If this flag is set to false, the characters that should be displayed as alternate forms are replaced with some other characters that become mapped to the alternate glyph forms. Therefore the text, although still selectable, will be modified and likely become unreadable. Default is false. |
| [get_TexturizeLinearGradientBrush](./get_texturizelineargradientbrush/)() const | Gets/sets the value indicating whether the LinearGradientBrush will be converted to DrTextureBrush. |
| [get_TexturizeRadialGradientBrush](./get_texturizeradialgradientbrush/)() const | Gets/sets the value indicating whether the RadialGradientBrush will be converted to DrTextureBrush. |
| [get_UsePdfCoordinates](./get_usepdfcoordinates/)() const | Gets/set the value indicating whether coordinates of [XPS](../../aspose.page.xps/) elements should be converted to system coordinates of PDF format. |
| [set_ConversionMode](./set_conversionmode/)(XpsConversionMode) | Conversion mode. |
| [set_EmulatePdfToAps](./set_emulatepdftoaps/)(bool) | Gets/sets the value indicating whether hyperlink active rectangles should be set to target locations and page numbers in jump links should be plus 1. This is the way Aspose.PDF converts PDF document to APS. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | Gets/sets the array of numbers of pages to convert. |
| [set_PreserveText](./set_preservetext/)(bool) override | In [XPS](../../aspose.page.xps/), some text elements may contain references to alternate glyph forms that do not correspond to any character code in the font. If this flag is set to true, the text from such [XPS](../../aspose.page.xps/) elements is converted to graphic shapes. Then the text itself appears transparent on top. This leaves the text of such elements selectable. But the side effect is that the output file may be much larger than the original. If this flag is set to false, the characters that should be displayed as alternate forms are replaced with some other characters that become mapped to the alternate glyph forms. Therefore the text, although still selectable, will be modified and likely become unreadable. Default is false. |
| [set_TexturizeLinearGradientBrush](./set_texturizelineargradientbrush/)(bool) | Gets/sets the value indicating whether the LinearGradientBrush will be converted to DrTextureBrush. |
| [set_TexturizeRadialGradientBrush](./set_texturizeradialgradientbrush/)(bool) | Gets/sets the value indicating whether the RadialGradientBrush will be converted to DrTextureBrush. |
| [set_UsePdfCoordinates](./set_usepdfcoordinates/)(bool) | Gets/set the value indicating whether coordinates of [XPS](../../aspose.page.xps/) elements should be converted to system coordinates of PDF format. |
## See Also

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IXpsTextConversionOptions](../../aspose.page.xps.presentation/ixpstextconversionoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Aps](../)
* Library [Aspose.Page for C++](../../)
