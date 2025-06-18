---
title: PhotometricInterpretation
second_title: Aspose.Medical for .NET API Reference
description: Photometric Interpretation. See https//dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_c.7.6.3.htmlsect_C.7.6.3.1.2/.
type: docs
weight: 670
url: /net/aspose.medical.dicom.imaging/photometricinterpretation/
---

## PhotometricInterpretation class

Photometric Interpretation. See https://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_c.7.6.3.html#sect_C.7.6.3.1.2/.

```csharp
public sealed class PhotometricInterpretation : IEquatable<PhotometricInterpretation>, 
    ISpanParsable<PhotometricInterpretation>
```

## Properties

| Name | Description |
| --- | --- |
| static [Monochrome1](../../aspose.medical.dicom.imaging/photometricinterpretation/monochrome1) { get; } | Pixel data represent a single monochrome image plane. The minimum sample value is intended to be displayed as white after any VOI gray scale transformations have been performed. See https://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_c.7.6.3.html#sect_C.7.6.3.1.2:~:text=Defined%20Terms%3A-,MONOCHROME1,-Pixel%20data%20represent. This value may be used only when Samples per Pixel (0028,0002) has a value of 1. Read-only [`PhotometricInterpretation`](../photometricinterpretation). |
| static [Monochrome2](../../aspose.medical.dicom.imaging/photometricinterpretation/monochrome2) { get; } | Pixel data represent a single monochrome image plane. The minimum sample value is intended to be displayed as black after any VOI gray scale transformations have been performed. See https://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_c.7.6.3.html#sect_C.7.6.3.1.2:~:text=in%20PS3.5%20.-,MONOCHROME2,-Pixel%20data%20represent. This value may be used only when Samples per Pixel (0028,0002) has a value of 1. Read-only [`PhotometricInterpretation`](../photometricinterpretation). |
| static [PaletteColor](../../aspose.medical.dicom.imaging/photometricinterpretation/palettecolor) { get; } | Pixel data describe a color image with a single sample per pixel (single image plane). The pixel value is used as an index into each of the Red, Blue, and Green Palette Color Lookup Tables (0028,1101-1103 &amp; 1201-1203). This value may be used only when Samples per Pixel (0028,0002) has a value of 1. When the Photometric Interpretation is Palette Color; Red, Blue, and Green Palette Color Lookup Tables shall be present. See https://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_c.7.6.3.html#sect_C.7.6.3.1.2:~:text=in%20PS3.5%20.-,PALETTE%20COLOR,-Pixel%20data%20describe. Read-only [`PhotometricInterpretation`](../photometricinterpretation). |
| static [Rgb](../../aspose.medical.dicom.imaging/photometricinterpretation/rgb) { get; } | Pixel data represent a color image described by red, green, and blue image planes. The minimum sample value for each color plane represents minimum intensity of the color. This value may be used only when Samples per Pixel (0028,0002) has a value of 3. See https://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_c.7.6.3.html#sect_C.7.6.3.1.2:~:text=shall%20be%20present.-,RGB,-Pixel%20data%20represent. Read-only [`PhotometricInterpretation`](../photometricinterpretation). |
| static [Unknown](../../aspose.medical.dicom.imaging/photometricinterpretation/unknown) { get; } | Unknown Photometric Interpretation. Read-only [`PhotometricInterpretation`](../photometricinterpretation). |
| static [YbrFull](../../aspose.medical.dicom.imaging/photometricinterpretation/ybrfull) { get; } | Pixel data represent a color image described by one luminance (Y) and two chrominance planes (Cb and Cr). This photometric interpretation may be used only when Samples per Pixel (0028,0002) has a value of 3. Black is represented by Y equal to zero. The absence of color is represented by both Cb and Cr values equal to half full scale. In the case where Bits Allocated (0028,0100) has a value of 8 then the following equations convert between RGB and YCBCR Photometric Interpretation: Y = + .2990R + .5870G + .1140B Cb = - .1687R - .3313G + .5000B + 128 Cr = + .5000R - .4187G - .0813B + 128 See https://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_c.7.6.3.html#sect_C.7.6.3.1.2:~:text=Retired.-,YBR_FULL,-Pixel%20data%20represent. Read-only [`PhotometricInterpretation`](../photometricinterpretation). |
| static [YbrFull422](../../aspose.medical.dicom.imaging/photometricinterpretation/ybrfull422) { get; } | The same as YBR_FULL except that the Cb and Cr values are sampled horizontally at half the Y rate and as a result there are half as many Cb and Cr values as Y values. This Photometric Interpretation is only allowed with Planar Configuration (0028,0006) equal to 0. Two Y values shall be stored followed by one Cb and one Cr value. The Cb and Cr values shall be sampled at the location of the first of the two Y values. For each Row of Pixels, the first Cb and Cr samples shall be at the location of the first Y sample. The next Cb and Cr samples shall be at the location of the third Y sample etc. See https://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_c.7.6.3.html#sect_C.7.6.3.1.2:~:text=2%20dated%201990.-,YBR_FULL_422,-The%20same%20as. Read-only [`PhotometricInterpretation`](../photometricinterpretation). |
| static [YbrIct](../../aspose.medical.dicom.imaging/photometricinterpretation/ybrict) { get; } | Pixel data represent a color image described by one luminance (Y) and two chrominance planes (Cb and Cr). This photometric interpretation may be used only when Samples per Pixel (0028,0002) has a value of 3. Black is represented by Y equal to zero. The absence of color is represented by both Cb and Cr values equal to zero. Regardless of the value of Bits Allocated (0028,0100), the following equations convert between RGB and YCbCr Photometric Interpretation: Y = + .29900R + .58700G + .11400B Cb = - .16875R - .33126G + .50000B Cr = + .50000R - .41869G - .08131B See https://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_c.7.6.3.html#sect_C.7.6.3.1.2:~:text=the%20third%20etc.-,YBR_ICT,-Irreversible%20Color%20Transformation. Read-only [`PhotometricInterpretation`](../photometricinterpretation). |
| static [YbrPartial420](../../aspose.medical.dicom.imaging/photometricinterpretation/ybrpartial420) { get; } | The same as YBR_PARTIAL_422 except that the Cb and Cr values are sampled horizontally and vertically at half the Y rate and as a result there are four times less Cb and Cr values than Y values, versus twice less for YBR_PARTIAL_422. This Photometric Interpretation is only allowed with Planar Configuration (0028,0006) equal to 0. The Cb and Cr values shall be sampled at the location of the first of the two Y values. For the first Row of Pixels (etc.), the first Cb and Cr samples shall be at the location of the first Y sample. The next Cb and Cr samples shall be at the location of the third Y sample etc. The next Rows of Pixels containing Cb and Cr samples (at the same locations than for the first Row) will be the third etc. See https://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_c.7.6.3.html#sect_C.7.6.3.1.2:~:text=PS3.3%2D2017b.-,YBR_PARTIAL_420,-Pixel%20data%20represent. Read-only [`PhotometricInterpretation`](../photometricinterpretation). |
| static [YbrPartial422](../../aspose.medical.dicom.imaging/photometricinterpretation/ybrpartial422) { get; } | The same as YBR_FULL_422 except that: black corresponds to Y = 16; Y is restricted to 220 levels (i.e. the maximum value is 235); Cb and Cr each has a minimum value of 16; Cb and Cr are restricted to 225 levels (i.e. the maximum value is 240); lack of color is represented by Cb and Cr equal to 128. In the case where Bits Allocated (0028,0100) has value of 8 then the following equations convert between RGB and YBR_PARTIAL_422 Photometric Interpretation: Y = + .2568R + .5041G + .0979B + 16 Cb = - .1482R - .2910G + .4392B + 128 Cr = + .4392R - .3678G - .0714B + 128 See https://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_c.7.6.3.html#sect_C.7.6.3.1.2:~:text=2008%5D.-,YBR_PARTIAL_422,-Retired.%20See%20PS3.3. Read-only [`PhotometricInterpretation`](../photometricinterpretation). |
| static [YbrRct](../../aspose.medical.dicom.imaging/photometricinterpretation/ybrrct) { get; } | Pixel data represent a color image described by one luminance (Y) and two chrominance planes (Cb and Cr). This photometric interpretation may be used only when Samples per Pixel (0028,0002) has a value of 3. Black is represented by Y equal to zero. The absence of color is represented by both Cb and Cr values equal to zero. Regardless of the value of Bits Allocated (0028,0100), the following equations convert between RGB and YBR_RCT Photometric Interpretation: Y = floor((R + 2G +B) / 4) Cb = B - G Cr = R - G The following equations convert between YBR_RCT and RGB Photometric Interpretation: R = Cr + G G = Y – floor((Cb + Cr) / 4) B = Cb + G See https://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_c.7.6.3.html#sect_C.7.6.3.1.2:~:text=2000%20bit%20stream.-,YBR_RCT,-Reversible%20Color%20Transformation. Read-only [`PhotometricInterpretation`](../photometricinterpretation). |
| [ColorSpace](../../aspose.medical.dicom.imaging/photometricinterpretation/colorspace) { get; } | The color space of the photometric interpretation, or `null` if [`IsPalette`](./ispalette) is `false`. Read-only [`ColorSpace`](./colorspace). |
| [Description](../../aspose.medical.dicom.imaging/photometricinterpretation/description) { get; } | The description of the photometric interpretation. Read-only String. |
| [IsColor](../../aspose.medical.dicom.imaging/photometricinterpretation/iscolor) { get; } | Specifies whether the photometric interpretation represents color (`true`) or grayscale ( `false`). Read-only Boolean. |
| [IsPalette](../../aspose.medical.dicom.imaging/photometricinterpretation/ispalette) { get; } | Specifies whether the photometric interpretation is represented by a palette of colors. Read-only Boolean. |
| [IsYbr](../../aspose.medical.dicom.imaging/photometricinterpretation/isybr) { get; } | Specifies whether the photometric interpretation represents an YBR color scheme. Read-only Boolean. |
| [Value](../../aspose.medical.dicom.imaging/photometricinterpretation/value) { get; } | The identifier value, corresponding with a DICOM defined term for tag (0028, 0004). Read-only String. |

## Methods

| Name | Description |
| --- | --- |
| static [Parse](../../aspose.medical.dicom.imaging/photometricinterpretation/parse#parse)(ReadOnlySpan&lt;char&gt;, IFormatProvider?) |  |
| static [Parse](../../aspose.medical.dicom.imaging/photometricinterpretation/parse#parse_1)(string, IFormatProvider?) |  |
| override [Equals](../../aspose.medical.dicom.imaging/photometricinterpretation/equals#equals_1)(object) |  |
| [Equals](../../aspose.medical.dicom.imaging/photometricinterpretation/equals#equals)(PhotometricInterpretation) |  |
| override [GetHashCode](../../aspose.medical.dicom.imaging/photometricinterpretation/gethashcode)() |  |
| override [ToString](../../aspose.medical.dicom.imaging/photometricinterpretation/tostring)() |  |
| static [TryParse](../../aspose.medical.dicom.imaging/photometricinterpretation/tryparse#tryparse)(ReadOnlySpan&lt;char&gt;, IFormatProvider, out PhotometricInterpretation) |  |
| static [TryParse](../../aspose.medical.dicom.imaging/photometricinterpretation/tryparse#tryparse_1)(string, IFormatProvider, out PhotometricInterpretation) |  |
| [operator ==](../../aspose.medical.dicom.imaging/photometricinterpretation/op_equality) | Determines whether two specified objects have the same value. |
| [operator !=](../../aspose.medical.dicom.imaging/photometricinterpretation/op_inequality) | Determines whether two specified objects have different values. |

### See Also

* namespace [Aspose.Medical.Dicom.Imaging](../../aspose.medical.dicom.imaging)
* assembly [Aspose.Medical](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Medical.dll -->
