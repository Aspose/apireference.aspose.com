---
title: CompressionMethod enumeration
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 30
url: /aspose.cad.fileformats.psd/compressionmethod/
is_root: false
---

## CompressionMethod enumeration

Defines the compression method used for image data.



The CompressionMethod type exposes the following members:

### Fields
| Field | Description |
| :- | :- |
| RAW | No compression. The image data stored as raw bytes in RGBA planar order.<br/>That means that first all R data is written, then all G is written, then all B and finally all A data is written. |
| RLE | RLE compressed the image data starts with the byte counts for all the scan lines (rows * channels), with each<br/>count stored as a two-byte value. The RLE compressed data follows, with each scan line compressed separately.<br/>The RLE compression is the same compression algorithm used by the Macintosh ROM routine PackBits and the TIFF standard. |
| ZIP_WITHOUT_PREDICTION | ZIP without prediction. |
| ZIP_WITH_PREDICTION | ZIP with prediction. |



### See Also
* module [`aspose.cad.fileformats.psd`](..)
