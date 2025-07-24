---
title: PixelData
second_title: Aspose.Medical for .NET API Reference
description: Encapsulated base functionality for reading and writing DICOM images pixel data according to the specified transfer syntax.
type: docs
weight: 690
url: /net/aspose.medical.dicom.imaging/pixeldata/
---

## PixelData class

Encapsulated base functionality for reading and writing DICOM images pixel data according to the specified transfer syntax.

```csharp
public abstract class PixelData
```

## Properties

| Name | Description |
| --- | --- |
| [BitDepth](../../aspose.medical.dicom.imaging/pixeldata/bitdepth) { get; } | The [`BitDepth`](./bitdepth) information for image rendering. Read-only [`BitDepth`](./bitdepth). |
| [BitsAllocated](../../aspose.medical.dicom.imaging/pixeldata/bitsallocated) { get; } | The number of bits allocated per pixel sample (0028,0100). Read-only UInt16. |
| [BitsStored](../../aspose.medical.dicom.imaging/pixeldata/bitsstored) { get; set; } | The number of bits stored per pixel sample (0028,0101). Read/Write UInt16. |
| [BytesAllocated](../../aspose.medical.dicom.imaging/pixeldata/bytesallocated) { get; } | The number of bytes allocated per pixel sample. Read-only Int32. |
| [Dataset](../../aspose.medical.dicom.imaging/pixeldata/dataset) { get; } | The DICOM Dataset containing the pixel data. Read-only [`Dataset`](./dataset). |
| [Height](../../aspose.medical.dicom.imaging/pixeldata/height) { get; set; } | The DICOM image height (rows) in pixels. Read/Write UInt16. |
| [HighBit](../../aspose.medical.dicom.imaging/pixeldata/highbit) { get; set; } | The index of the most significant bit (MSB) of pixel sample (0028,0102). Read/Write UInt16. |
| [IsLossy](../../aspose.medical.dicom.imaging/pixeldata/islossy) { get; } | The lossy image compression (0028,2110) status (`true` if stored value is "01"). Read-only Boolean. |
| [LossyCompressionMethod](../../aspose.medical.dicom.imaging/pixeldata/lossycompressionmethod) { get; } | The lossy image compression method (0028,2114). Read-only String. |
| [LossyCompressionRatio](../../aspose.medical.dicom.imaging/pixeldata/lossycompressionratio) { get; } | The lossy image compression ratio (0028,2112). Read-only Decimal. |
| [NumberOfFrames](../../aspose.medical.dicom.imaging/pixeldata/numberofframes) { get; set; } | The DICOM image Number of frames. This value usually equals 1 for single frame images. Read/Write Int32. |
| [PaletteColorLut](../../aspose.medical.dicom.imaging/pixeldata/palettecolorlut) { get; } | The palette color LUT, valid for PALETTE COLOR [`PhotometricInterpretation`](./photometricinterpretation). Read-only [`Bgra32`](../../aspose.medical.imaging.pixelformats/bgra32) array. |
| [PhotometricInterpretation](../../aspose.medical.dicom.imaging/pixeldata/photometricinterpretation) { get; set; } | The photometric Interpretation. Read/Write [`PhotometricInterpretation`](../photometricinterpretation). |
| [PixelRepresentation](../../aspose.medical.dicom.imaging/pixeldata/pixelrepresentation) { get; set; } | The pixel Representation (0028,0103), represents signed/unsigned data of the pixel samples. Read/Write [`PixelRepresentation`](../pixelrepresentation). |
| [PlanarConfiguration](../../aspose.medical.dicom.imaging/pixeldata/planarconfiguration) { get; set; } | The planar Configuration (0028,0006), indicates whether the color pixel data are sent color-by-plane or color-by-pixel. Read/Write [`PixelRepresentation`](../pixelrepresentation). |
| [SamplesPerPixel](../../aspose.medical.dicom.imaging/pixeldata/samplesperpixel) { get; set; } | The number of samples per pixel (0028,0002), usually 1 for grayscale and 3 for color for RGB and YBR. Read/Write UInt16. |
| [Syntax](../../aspose.medical.dicom.imaging/pixeldata/syntax) { get; } | The transfer syntax used to encode the DICOM image pixel data. Read-only [`TransferSyntax`](../../aspose.medical.dicom/transfersyntax). |
| [UncompressedFrameSize](../../aspose.medical.dicom.imaging/pixeldata/uncompressedframesize) { get; } | The uncompressed frame size in bytes. Read-only Int32. |
| [Width](../../aspose.medical.dicom.imaging/pixeldata/width) { get; set; } | The DICOM image width (columns) in pixels. Read/Write UInt16. |

## Methods

| Name | Description |
| --- | --- |
| static [Create](../../aspose.medical.dicom.imaging/pixeldata/create)(Dataset) | Creates a new instance of the [`PixelData`](../pixeldata) and creates Pixel Data element for the given *dataset*. |
| static [Read](../../aspose.medical.dicom.imaging/pixeldata/read)(Dataset) | Creates a new instance of the [`PixelData`](../pixeldata) by reading existing Pixel Data element from the given *dataset*. |
| abstract [AddFrame](../../aspose.medical.dicom.imaging/pixeldata/addframe)(Span&lt;byte&gt;) | Adds new frame into pixel data. New frame will be appended to existing frames. |
| abstract [GetFrame](../../aspose.medical.dicom.imaging/pixeldata/getframe)(int) | Extracts byte frame at the specified position (*index*). |
| [GetPhotometricInterpretation](../../aspose.medical.dicom.imaging/pixeldata/getphotometricinterpretation)() | Returns [`PhotometricInterpretation`](../photometricinterpretation) stored in the [`Dataset`](./dataset) (if specified). If 'Photometric Interpretation' isn't explicitly specified in the Dataset, the calculates default [`PhotometricInterpretation`](../photometricinterpretation) for the given [`Dataset`](./dataset) based on the [`SamplesPerPixel`](../../aspose.medical.dicom.tags/tag/samplesperpixel) and [`RedPaletteColorLookupTableData`](../../aspose.medical.dicom.tags/tag/redpalettecolorlookuptabledata). |
| abstract [GetRawData](../../aspose.medical.dicom.imaging/pixeldata/getrawdata)() | Returns raw pixel data in internal format. |

### See Also

* namespace [Aspose.Medical.Dicom.Imaging](../../aspose.medical.dicom.imaging)
* assembly [Aspose.Medical](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Medical.dll -->
