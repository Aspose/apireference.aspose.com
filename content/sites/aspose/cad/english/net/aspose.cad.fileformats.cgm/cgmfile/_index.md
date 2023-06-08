---
title: Class CgmFile
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Cgm.CgmFile class. CGM image class
type: docs
weight: 4340
url: /net/aspose.cad.fileformats.cgm/cgmfile/
---
## CgmFile class

CGM image class.

```csharp
public class CgmFile
```

## Properties

| Name | Description |
| --- | --- |
| [ColourIndexPrecision](../../aspose.cad.fileformats.cgm/cgmfile/colourindexprecision/) { get; set; } | Gets or sets the current reading colour index precision |
| [ColourModel](../../aspose.cad.fileformats.cgm/cgmfile/colourmodel/) { get; set; } | Gets or sets the current reading colour model |
| [ColourPrecision](../../aspose.cad.fileformats.cgm/cgmfile/colourprecision/) { get; set; } | Gets or sets the current reading colour precision |
| [ColourSelectionMode](../../aspose.cad.fileformats.cgm/cgmfile/colourselectionmode/) { get; set; } | Gets or sets the current reading colour selecion mode |
| [ColourValueExtentMaximumColorValueRGB](../../aspose.cad.fileformats.cgm/cgmfile/colourvalueextentmaximumcolorvaluergb/) { get; set; } | Gets or sets the current reading MaximumColorValueRGB |
| [ColourValueExtentMinimumColorValueRGB](../../aspose.cad.fileformats.cgm/cgmfile/colourvalueextentminimumcolorvaluergb/) { get; set; } | Gets or sets the current reading MinimumColorValueRGB |
| [Commands](../../aspose.cad.fileformats.cgm/cgmfile/commands/) { get; } | The read CGM commands |
| [DeviceViewportSpecificationMode](../../aspose.cad.fileformats.cgm/cgmfile/deviceviewportspecificationmode/) { get; set; } | Gets or sets the current reading DeviceViewportSpecificationMode |
| [EdgeWidthSpecificationMode](../../aspose.cad.fileformats.cgm/cgmfile/edgewidthspecificationmode/) { get; set; } | Gets or sets the current reading EdgeWidthSpecificationMode |
| [IndexPrecision](../../aspose.cad.fileformats.cgm/cgmfile/indexprecision/) { get; set; } | Gets or sets the current reading Index Precision |
| [IntegerPrecision](../../aspose.cad.fileformats.cgm/cgmfile/integerprecision/) { get; set; } | Gets or sets the current reading integer Precision |
| [InteriorStyleSpecificationMode](../../aspose.cad.fileformats.cgm/cgmfile/interiorstylespecificationmode/) { get; set; } | Gets or sets the current reading interior style SpecificationMode |
| [LineWidthSpecificationMode](../../aspose.cad.fileformats.cgm/cgmfile/linewidthspecificationmode/) { get; set; } | Gets or sets the current reading LineWidthSpecificationMode |
| [MarkerSizeSpecificationMode](../../aspose.cad.fileformats.cgm/cgmfile/markersizespecificationmode/) { get; set; } | Gets or sets the current reading MarkerSizeSpecificationMode |
| [Messages](../../aspose.cad.fileformats.cgm/cgmfile/messages/) { get; } | Any messages occured while reading or writing the file |
| [Name](../../aspose.cad.fileformats.cgm/cgmfile/name/) { get; } | Gets the name of the file |
| [NamePrecision](../../aspose.cad.fileformats.cgm/cgmfile/nameprecision/) { get; set; } | Gets or sets the current reading name Precision |
| [RealPrecision](../../aspose.cad.fileformats.cgm/cgmfile/realprecision/) { get; set; } | Gets or sets the current reading real Precision |
| [RealPrecisionProcessed](../../aspose.cad.fileformats.cgm/cgmfile/realprecisionprocessed/) { get; set; } | Gets or sets the current reading real Precision processed flag |
| [RestrictedTextType](../../aspose.cad.fileformats.cgm/cgmfile/restrictedtexttype/) { get; set; } | Gets or sets the current reading RestrictedTextType |
| [VDCIntegerPrecision](../../aspose.cad.fileformats.cgm/cgmfile/vdcintegerprecision/) { get; set; } | Gets or sets the current reading vdc integer Precision |
| [VDCRealPrecision](../../aspose.cad.fileformats.cgm/cgmfile/vdcrealprecision/) { get; set; } | Gets or sets the current reading vdc real Precision |
| [VDCType](../../aspose.cad.fileformats.cgm/cgmfile/vdctype/) { get; set; } | Gets or sets the current reading VDC Type |

## Methods

| Name | Description |
| --- | --- |
| [ApplyValues](../../aspose.cad.fileformats.cgm/cgmfile/applyvalues/)(CgmFile) | Copies the current meta information |
| [ContainsConsumableNumber](../../aspose.cad.fileformats.cgm/cgmfile/containsconsumablenumber/)(string) | Determines whether CGM contains a specific consumable number text |
| [ContainsFigureItemText](../../aspose.cad.fileformats.cgm/cgmfile/containsfigureitemtext/)(string) | Determines whether CGM contains a specific figure item text. |
| [ContainsTextElement](../../aspose.cad.fileformats.cgm/cgmfile/containstextelement/)(string) | Determines whether any text element equals the specified text. |
| [ContainsTorqueTextToFigItem](../../aspose.cad.fileformats.cgm/cgmfile/containstorquetexttofigitem/)(string, string) | Determines whether the torque text ("20 Nm (177 lb-in)" exists nearby the figure item) |
| [GetFigureItemTexts](../../aspose.cad.fileformats.cgm/cgmfile/getfigureitemtexts/)(bool) | Gets all texts of the figure items. |
| [GetGraphicName](../../aspose.cad.fileformats.cgm/cgmfile/getgraphicname/)() | Gets the title of the illustration. |
| [GetInformation](../../aspose.cad.fileformats.cgm/cgmfile/getinformation/)(TextCommand) |  |
| [GetMetaTitle](../../aspose.cad.fileformats.cgm/cgmfile/getmetatitle/)() | Gets the title. |
| [GetRectangles](../../aspose.cad.fileformats.cgm/cgmfile/getrectangles/)() | Gets all found rectangles. |
| [IsWrittenDownToUp](../../aspose.cad.fileformats.cgm/cgmfile/iswrittendowntoup/)(TextCommand) | Determines whether text is rotated 90 dec counterwise |
| [ResetMetaDefinitions](../../aspose.cad.fileformats.cgm/cgmfile/resetmetadefinitions/)() | Resets settings like VDCRealPrecision or ColourModel |

### See Also

* namespace [Aspose.CAD.FileFormats.Cgm](../../aspose.cad.fileformats.cgm/)
* assembly [Aspose.CAD](../../)


