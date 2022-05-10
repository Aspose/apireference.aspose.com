---
title: System.Drawing.Imaging
second_title: Aspose.Drawing for .NET API Reference
description: The Imaging namespace provides advanced GDI+ imaging functionality. Basic graphics functionality is provided by the Drawing namespace.
type: docs
weight: 40
url: /net/system.drawing.imaging/
---
The Imaging namespace provides advanced GDI+ imaging functionality. Basic graphics functionality is provided by the Drawing namespace.

## Classes

| Class | Description |
| --- | --- |
| class [BitmapData](./bitmapdata) | Specifies the attributes of a bitmap image. The BitmapData class is used by the LockBits and UnlockBits methods of the Bitmap class. Not inheritable. |
| class [ColorMap](./colormap) | Defines a map for converting colors. Several methods of the ImageAttributes class adjust image colors by using a color-remap table, which is an array of ColorMap structures. Not inheritable. |
| class [ColorMatrix](./colormatrix) | Defines a 5 x 5 matrix that contains the coordinates for the RGBA space. Several methods of the ImageAttributes class adjust image colors by using a color matrix. This class cannot be inherited. |
| class [ColorPalette](./colorpalette) | Defines an array of colors that make up a color palette. The colors are 32-bit ARGB colors. Not inheritable. |
| class [Encoder](./encoder) | An Encoder object encapsulates a globally unique identifier (GUID) that identifies the category of an image encoder parameter. |
| class [EncoderParameter](./encoderparameter) | Used to pass a value, or an array of values, to an image encoder. |
| class [EncoderParameters](./encoderparameters) | Encapsulates an array of EncoderParameter objects. |
| class [FrameDimension](./framedimension) | Provides properties that get the frame dimensions of an image. Not inheritable. |
| class [ImageAttributes](./imageattributes) | Contains information about how bitmap and metafile colors are manipulated during rendering. |
| class [ImageCodecInfo](./imagecodecinfo) | The ImageCodecInfo class provides the necessary storage members and methods to retrieve all pertinent information about the installed image encoders and decoders (called codecs). Not inheritable. |
| class [ImageFormat](./imageformat) | Specifies the file format of the image. Not inheritable. |
| class [Metafile](./metafile) | Defines a graphic metafile. A metafile contains records that describe a sequence of graphics operations that can be recorded (constructed) and played back (displayed). This class is not inheritable. |
| class [MetafileHeader](./metafileheader) | Contains attributes of an associated Metafile. Not inheritable. |
| class [MetaHeader](./metaheader) | Contains information about a windows-format (WMF) metafile. |
| static class [NamespaceDoc](./namespacedoc) | The Imaging namespace provides advanced GDI+ imaging functionality. Basic graphics functionality is provided by the Drawing namespace. |
| delegate [PlayRecordCallback](./playrecordcallback) | This delegate is not used. For an example of enumerating the records of a metafile, see [`EnumerateMetafile`](system.drawing/graphics/enumeratemetafile). |
| class [PropertyItem](./propertyitem) | Encapsulates a metadata property to be included in an image file. Not inheritable. |
| class [WmfPlaceableFileHeader](./wmfplaceablefileheader) | Defines a placeable metafile. Not inheritable. |
## Enumeration

| Enumeration | Description |
| --- | --- |
| enum [ColorAdjustType](./coloradjusttype) | Specifies which GDI+ objects use color adjustment information. |
| enum [ColorChannelFlag](./colorchannelflag) | Specifies individual channels in the CMYK (cyan, magenta, yellow, black) color space. This enumeration is used by the [`SetOutputChannel`](system.drawing.imaging/imageattributes/setoutputchannel) methods. |
| enum [ColorMatrixFlag](./colormatrixflag) | Specifies the types of images and colors that will be affected by the color and grayscale adjustment settings of an ImageAttributes. |
| enum [EmfPlusRecordType](./emfplusrecordtype) | Specifies the methods available for use with a metafile to read and write graphic commands. |
| enum [EmfType](./emftype) | Specifies the nature of the records that are placed in an Enhanced Metafile (EMF) file. This enumeration is used by several constructors in the Metafile class. |
| enum [EncoderValue](./encodervalue) | Used to specify the parameter value passed to a JPEG or TIFF image encoder when using the EncoderParameters) or EncoderParameters) methods. |
| enum [ImageFlags](./imageflags) | Specifies the attributes of the pixel data contained in an [`Image`](system.drawing/image) object. The Flags property returns a member of this enumeration. This enumeration has a FlagsAttribute attribute that allows a bitwise combination of its member values. |
| enum [ImageLockMode](./imagelockmode) | Specifies flags that are passed to the flags parameter of the [`LockBits`](system.drawing/bitmap/lockbits) method. The [`LockBits`](system.drawing/bitmap/lockbits) method locks a portion of an image so that you can read or write the pixel data. |
| enum [MetafileFrameUnit](./metafileframeunit) | Specifies the unit of measurement for the rectangle used to size and position a metafile. This is specified during the creation of the Metafile object. |
| enum [MetafileType](./metafiletype) | Specifies types of metafiles. |
| enum [PixelFormat](./pixelformat) | Specifies the format of the color data for each pixel in the image. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
