---
title: Class CifReplacingEncoderFallbackBuffer
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.CifReplacingEncoderFallbackBuffer class. The replacing encoder fallback buffer that actually does the replacement work
type: docs
weight: 360
url: /net/aspose.cad/cifreplacingencoderfallbackbuffer/
---
## CifReplacingEncoderFallbackBuffer class

The replacing encoder fallback buffer that actually does the replacement work

```csharp
public class CifReplacingEncoderFallbackBuffer : EncoderFallbackBuffer
```

## Constructors

| Name | Description |
| --- | --- |
| [CifReplacingEncoderFallbackBuffer](cifreplacingencoderfallbackbuffer/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| override [Remaining](../../aspose.cad/cifreplacingencoderfallbackbuffer/remaining/) { get; } | Count of remaining characters in replacement buffer |

## Methods

| Name | Description |
| --- | --- |
| override [Fallback](../../aspose.cad/cifreplacingencoderfallbackbuffer/fallback/#fallback_1)(char, int) | Called when a single-char character out of output codepage is encountered |
| override [Fallback](../../aspose.cad/cifreplacingencoderfallbackbuffer/fallback/#fallback)(char, char, int) | Called when a surrogate pair of characters out of output codepage is encountered |
| override [GetNextChar](../../aspose.cad/cifreplacingencoderfallbackbuffer/getnextchar/)() | Gets next replacement char |
| override [MovePrevious](../../aspose.cad/cifreplacingencoderfallbackbuffer/moveprevious/)() | Rewinds position in the replacement buffer by one |

### See Also

* namespace [Aspose.CAD](../../aspose.cad/)
* assembly [Aspose.CAD](../../)


