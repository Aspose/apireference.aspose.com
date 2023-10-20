---
title: Class StringFormat
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.StringFormat class. Encapsulates text layout information such as alignment orientation and tab stops display manipulations such as ellipsis insertion and national digit substitution and OpenType features. This class cannot be inherited
type: docs
weight: 1090
url: /net/system.drawing/stringformat/
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
| static [GenericDefault](../../system.drawing/stringformat/genericdefault/) { get; } | Gets a generic default StringFormat object. |
| static [GenericTypographic](../../system.drawing/stringformat/generictypographic/) { get; } | Gets a generic typographic StringFormat object. |
| [Alignment](../../system.drawing/stringformat/alignment/) { get; set; } | Gets or sets text alignment information on the vertical plane. |
| [DigitSubstitutionLanguage](../../system.drawing/stringformat/digitsubstitutionlanguage/) { get; } | Gets the language that is used when local digits are substituted for western digits. |
| [DigitSubstitutionMethod](../../system.drawing/stringformat/digitsubstitutionmethod/) { get; } | Gets the method to be used for digit substitution. |
| [FormatFlags](../../system.drawing/stringformat/formatflags/) { get; set; } | Gets or sets a StringFormatFlags enumeration that contains formatting information. |
| [HotkeyPrefix](../../system.drawing/stringformat/hotkeyprefix/) { get; set; } | Gets or sets the HotkeyPrefix object for this StringFormat object. |
| [LineAlignment](../../system.drawing/stringformat/linealignment/) { get; set; } | Gets or sets the line alignment on the horizontal plane. |
| [Trimming](../../system.drawing/stringformat/trimming/) { get; set; } | Gets or sets the StringTrimming enumeration for this StringFormat object. |

## Methods

| Name | Description |
| --- | --- |
| [Clone](../../system.drawing/stringformat/clone/)() | Creates an exact copy of this `StringFormat` object. |
| [Dispose](../../system.drawing/stringformat/dispose/)() | Releases all resources used by this StringFormat object. |
| [GetTabStops](../../system.drawing/stringformat/gettabstops/)(out float) | Gets the tab stops for this StringFormat object. |
| [SetDigitSubstitution](../../system.drawing/stringformat/setdigitsubstitution/)(int, StringDigitSubstitute) | Specifies the language and method to be used when local digits are substituted for western digits. |
| [SetMeasurableCharacterRanges](../../system.drawing/stringformat/setmeasurablecharacterranges/)(CharacterRange[]) | Specifies an array of CharacterRange structures that represent the ranges of characters measured by a call to the MeasureCharacterRanges method. |
| [SetTabStops](../../system.drawing/stringformat/settabstops/)(float, float[]) | Sets tab stops for this StringFormat object. |

### See Also

* namespace [System.Drawing](../../system.drawing/)
* assembly [Aspose.Drawing](../../)


