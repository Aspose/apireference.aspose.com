---
title: Class StringFormat
second_title: Aspose.Drawing for .NET API Reference
description: Aspose.Drawing.StringFormat class. Encapsulates text layout information such as alignment orientation and tab stops display manipulations such as ellipsis insertion and national digit substitution and OpenType features. This class cannot be inherited
type: docs
weight: 1100
url: /net/aspose.drawing/stringformat/
---
## StringFormat class

Encapsulates text layout information (such as alignment, orientation and tab stops) display manipulations (such as ellipsis insertion and national digit substitution) and OpenType features. This class cannot be inherited.

```csharp
public sealed class StringFormat : IDisposable
```

## Constructors

| Name | Description |
| --- | --- |
| [StringFormat](stringformat/#constructor)() | Initializes a new instance of the `StringFormat` class. |
| [StringFormat](stringformat/#constructor_1)(StringFormat) | Initializes a new instance of the `StringFormat` class from the specified existing StringFormat object. |
| [StringFormat](stringformat/#constructor_2)(StringFormatFlags) | Initializes a new instance of the `StringFormat` class with the specified StringFormatFlags enumeration. |
| [StringFormat](stringformat/#constructor_3)(StringFormatFlags, int) | Initializes a new instance of the `StringFormat` class with the specified [`StringFormatFlags`](../stringformatflags/) enumeration and language. |

## Properties

| Name | Description |
| --- | --- |
| static [GenericDefault](../../aspose.drawing/stringformat/genericdefault/) { get; } | Gets a generic default StringFormat object. |
| static [GenericTypographic](../../aspose.drawing/stringformat/generictypographic/) { get; } | Gets a generic typographic StringFormat object. |
| [Alignment](../../aspose.drawing/stringformat/alignment/) { get; set; } | Gets or sets text alignment information on the vertical plane. |
| [DigitSubstitutionLanguage](../../aspose.drawing/stringformat/digitsubstitutionlanguage/) { get; } | Gets the language that is used when local digits are substituted for western digits. |
| [DigitSubstitutionMethod](../../aspose.drawing/stringformat/digitsubstitutionmethod/) { get; } | Gets the method to be used for digit substitution. |
| [FormatFlags](../../aspose.drawing/stringformat/formatflags/) { get; set; } | Gets or sets a StringFormatFlags enumeration that contains formatting information. |
| [HotkeyPrefix](../../aspose.drawing/stringformat/hotkeyprefix/) { get; set; } | Gets or sets the HotkeyPrefix object for this StringFormat object. |
| [LineAlignment](../../aspose.drawing/stringformat/linealignment/) { get; set; } | Gets or sets the line alignment on the horizontal plane. |
| [Trimming](../../aspose.drawing/stringformat/trimming/) { get; set; } | Gets or sets the StringTrimming enumeration for this StringFormat object. |

## Methods

| Name | Description |
| --- | --- |
| [Clone](../../aspose.drawing/stringformat/clone/)() | Creates an exact copy of this `StringFormat` object. |
| [Dispose](../../aspose.drawing/stringformat/dispose/)() | Releases all resources used by this StringFormat object. |
| [GetTabStops](../../aspose.drawing/stringformat/gettabstops/)(out float) | Gets the tab stops for this StringFormat object. |
| [SetDigitSubstitution](../../aspose.drawing/stringformat/setdigitsubstitution/)(int, StringDigitSubstitute) | Specifies the language and method to be used when local digits are substituted for western digits. |
| [SetMeasurableCharacterRanges](../../aspose.drawing/stringformat/setmeasurablecharacterranges/)(CharacterRange[]) | Specifies an array of CharacterRange structures that represent the ranges of characters measured by a call to the MeasureCharacterRanges method. |
| [SetTabStops](../../aspose.drawing/stringformat/settabstops/)(float, float[]) | Sets tab stops for this StringFormat object. |

### See Also

* namespace [Aspose.Drawing](../../aspose.drawing/)
* assembly [Aspose.Drawing.Common](../../)


