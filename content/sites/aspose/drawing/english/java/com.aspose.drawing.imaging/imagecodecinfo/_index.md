---
title: ImageCodecInfo
second_title: Aspose.Drawing for Java API Reference
description: The  class provides the necessary storage members and methods to retrieve all pertinent information about the installed image encoders and decoders called codecs.
type: docs
weight: 25
url: /java/com.aspose.drawing.imaging/imagecodecinfo/
---
**Inheritance:**
java.lang.Object
```
public final class ImageCodecInfo
```

The [ImageCodecInfo](../../com.aspose.drawing.imaging/imagecodecinfo) class provides the necessary storage members and methods to retrieve all pertinent information about the installed image encoders and decoders (called codecs). Not inheritable.
## Constructors

| Constructor | Description |
| --- | --- |
| [ImageCodecInfo(UUID clsid, String codecName, String filenameExtension, String formatDescription, UUID formatID, String mimeType, int version)](#ImageCodecInfo-java.util.UUID-java.lang.String-java.lang.String-java.lang.String-java.util.UUID-java.lang.String-int-) |  |
## Methods

| Method | Description |
| --- | --- |
| [getImageDecoders()](#getImageDecoders--) | Returns an array of [ImageCodecInfo](../../com.aspose.drawing.imaging/imagecodecinfo) objects that contain information about the image decoders built into GDI+. |
| [getImageEncoders()](#getImageEncoders--) | Returns an array of [ImageCodecInfo](../../com.aspose.drawing.imaging/imagecodecinfo) objects that contain information about the image encoders built into GDI+. |
| [getClsid()](#getClsid--) | Gets a java.util.UUID structure that contains a GUID that identifies a specific codec. |
| [setClsid(UUID value)](#setClsid-java.util.UUID-) | Sets a java.util.UUID structure that contains a GUID that identifies a specific codec. |
| [getFormatID()](#getFormatID--) | Gets a java.util.UUID structure that contains a GUID that identifies the codec's format. |
| [setFormatID(UUID value)](#setFormatID-java.util.UUID-) | Sets a java.util.UUID structure that contains a GUID that identifies the codec's format. |
| [getCodecName()](#getCodecName--) | Gets a string that contains the name of the codec. |
| [setCodecName(String value)](#setCodecName-java.lang.String-) | Sets a string that contains the name of the codec. |
| [getFormatDescription()](#getFormatDescription--) | Gets a string that describes the codec's file format. |
| [setFormatDescription(String value)](#setFormatDescription-java.lang.String-) | Sets a string that describes the codec's file format. |
| [getFilenameExtension()](#getFilenameExtension--) | Gets string that contains the file name extension(s) used in the codec. |
| [setFilenameExtension(String value)](#setFilenameExtension-java.lang.String-) | Sets string that contains the file name extension(s) used in the codec. |
| [getMimeType()](#getMimeType--) | Gets a string that contains the codec's Multipurpose Internet Mail Extensions (MIME) type. |
| [setMimeType(String value)](#setMimeType-java.lang.String-) | Sets a string that contains the codec's Multipurpose Internet Mail Extensions (MIME) type. |
| [getVersion()](#getVersion--) | Gets the version number of the codec. |
| [setVersion(int value)](#setVersion-int-) | Sets the version number of the codec. |
| [getSignaturePatterns()](#getSignaturePatterns--) | Gets a two dimensional array of bytes that represents the signature of the codec. |
| [setSignaturePatterns(byte[][] value)](#setSignaturePatterns-byte-----) | Sets a two dimensional array of bytes that represents the signature of the codec. |
| [getSignatureMasks()](#getSignatureMasks--) | Gets a two dimensional array of bytes that can be used as a filter. |
| [setSignatureMasks(byte[][] value)](#setSignatureMasks-byte-----) | Sets a two dimensional array of bytes that can be used as a filter. |
### ImageCodecInfo(UUID clsid, String codecName, String filenameExtension, String formatDescription, UUID formatID, String mimeType, int version) {#ImageCodecInfo-java.util.UUID-java.lang.String-java.lang.String-java.lang.String-java.util.UUID-java.lang.String-int-}
```
public ImageCodecInfo(UUID clsid, String codecName, String filenameExtension, String formatDescription, UUID formatID, String mimeType, int version)
```


**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| clsid | java.util.UUID |  |
| codecName | java.lang.String |  |
| filenameExtension | java.lang.String |  |
| formatDescription | java.lang.String |  |
| formatID | java.util.UUID |  |
| mimeType | java.lang.String |  |
| version | int |  |

### getImageDecoders() {#getImageDecoders--}
```
public static ImageCodecInfo[] getImageDecoders()
```


Returns an array of [ImageCodecInfo](../../com.aspose.drawing.imaging/imagecodecinfo) objects that contain information about the image decoders built into GDI+.

**Returns:**
com.aspose.drawing.imaging.ImageCodecInfo[] - An array of [ImageCodecInfo](../../com.aspose.drawing.imaging/imagecodecinfo) objects. Each [ImageCodecInfo](../../com.aspose.drawing.imaging/imagecodecinfo) object in the array contains information about one of the built-in image decoders.
### getImageEncoders() {#getImageEncoders--}
```
public static ImageCodecInfo[] getImageEncoders()
```


Returns an array of [ImageCodecInfo](../../com.aspose.drawing.imaging/imagecodecinfo) objects that contain information about the image encoders built into GDI+.

**Returns:**
com.aspose.drawing.imaging.ImageCodecInfo[] - An array of [ImageCodecInfo](../../com.aspose.drawing.imaging/imagecodecinfo) objects. Each [ImageCodecInfo](../../com.aspose.drawing.imaging/imagecodecinfo) object in the array contains information about one of the built-in image encoders.
### getClsid() {#getClsid--}
```
public UUID getClsid()
```


Gets a java.util.UUID structure that contains a GUID that identifies a specific codec.

**Returns:**
java.util.UUID - a java.util.UUID
### setClsid(UUID value) {#setClsid-java.util.UUID-}
```
public void setClsid(UUID value)
```


Sets a java.util.UUID structure that contains a GUID that identifies a specific codec.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.util.UUID | a java.util.UUID |

### getFormatID() {#getFormatID--}
```
public UUID getFormatID()
```


Gets a java.util.UUID structure that contains a GUID that identifies the codec's format.

**Returns:**
java.util.UUID - a java.util.UUID
### setFormatID(UUID value) {#setFormatID-java.util.UUID-}
```
public void setFormatID(UUID value)
```


Sets a java.util.UUID structure that contains a GUID that identifies the codec's format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.util.UUID | a java.util.UUID |

### getCodecName() {#getCodecName--}
```
public String getCodecName()
```


Gets a string that contains the name of the codec.

**Returns:**
java.lang.String - a string that contains the name of the codec.
### setCodecName(String value) {#setCodecName-java.lang.String-}
```
public void setCodecName(String value)
```


Sets a string that contains the name of the codec.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | a string that contains the name of the codec. |

### getFormatDescription() {#getFormatDescription--}
```
public String getFormatDescription()
```


Gets a string that describes the codec's file format.

**Returns:**
java.lang.String - a string that describes the codec's file format.
### setFormatDescription(String value) {#setFormatDescription-java.lang.String-}
```
public void setFormatDescription(String value)
```


Sets a string that describes the codec's file format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | a string that describes the codec's file format. |

### getFilenameExtension() {#getFilenameExtension--}
```
public String getFilenameExtension()
```


Gets string that contains the file name extension(s) used in the codec. The extensions are separated by semicolons.

**Returns:**
java.lang.String - string that contains the file name extension(s) used in the codec.
### setFilenameExtension(String value) {#setFilenameExtension-java.lang.String-}
```
public void setFilenameExtension(String value)
```


Sets string that contains the file name extension(s) used in the codec. The extensions are separated by semicolons.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | string that contains the file name extension(s) used in the codec. |

### getMimeType() {#getMimeType--}
```
public String getMimeType()
```


Gets a string that contains the codec's Multipurpose Internet Mail Extensions (MIME) type.

**Returns:**
java.lang.String - a string that contains the codec's Multipurpose Internet Mail Extensions (MIME) type.
### setMimeType(String value) {#setMimeType-java.lang.String-}
```
public void setMimeType(String value)
```


Sets a string that contains the codec's Multipurpose Internet Mail Extensions (MIME) type.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | a string that contains the codec's Multipurpose Internet Mail Extensions (MIME) type. |

### getVersion() {#getVersion--}
```
public int getVersion()
```


Gets the version number of the codec.

**Returns:**
int - the version number of the codec.
### setVersion(int value) {#setVersion-int-}
```
public void setVersion(int value)
```


Sets the version number of the codec.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | the version number of the codec. |

### getSignaturePatterns() {#getSignaturePatterns--}
```
public byte[][] getSignaturePatterns()
```


Gets a two dimensional array of bytes that represents the signature of the codec.

**Returns:**
byte[][] - a two dimensional array of bytes that represents the signature of the codec.
### setSignaturePatterns(byte[][] value) {#setSignaturePatterns-byte-----}
```
public void setSignaturePatterns(byte[][] value)
```


Sets a two dimensional array of bytes that represents the signature of the codec.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | byte[][] | a two dimensional array of bytes that represents the signature of the codec. |

### getSignatureMasks() {#getSignatureMasks--}
```
public byte[][] getSignatureMasks()
```


Gets a two dimensional array of bytes that can be used as a filter.

**Returns:**
byte[][] - a two dimensional array of bytes that can be used as a filter.
### setSignatureMasks(byte[][] value) {#setSignatureMasks-byte-----}
```
public void setSignatureMasks(byte[][] value)
```


Sets a two dimensional array of bytes that can be used as a filter.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | byte[][] | a two dimensional array of bytes that can be used as a filter. |

