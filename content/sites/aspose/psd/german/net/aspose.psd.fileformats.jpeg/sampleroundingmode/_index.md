---
title: Enum SampleRoundingMode
second_title: Aspose.PSD für .NET-API-Referenz
description: Aspose.PSD.FileFormats.Jpeg.SampleRoundingMode opsomming. Definiert wie ein nBitWert in einen 8BitWert umgewandelt wird.
type: docs
weight: 1530
url: /de/net/aspose.psd.fileformats.jpeg/sampleroundingmode/
---
## SampleRoundingMode enumeration

Definiert, wie ein n-Bit-Wert in einen 8-Bit-Wert umgewandelt wird.

```csharp
public enum SampleRoundingMode
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Extrapolate | `0` | Extrapoliert einen 8-Bit-Wert, um ihn in n Bits einzupassen, wobei 1 &lt; n &lt; 8. Die Anzahl aller möglichen 8-Bit-Werte ist 1 &lt;&lt; 8 = 256, von 0 bis 255. Die Anzahl aller möglichen n-Bit-Werte sind 1 &lt;&lt; n, von 0 bis (1 &lt;&lt; n) - 1. Der vernünftigste n-Bit-Wert Vn, der einem 8-Bit-Wert V8 entspricht, ist gleich Vn = V8 &gt;&gt; (8 - N). |
| Truncate | `1` | Kürzt einen 8-Bit-Wert, um ihn in n Bits einzupassen, wobei 1 &lt; n &lt; 8. Die Anzahl aller möglichen n-Bit-Werte ist 1 &lt;&lt; n, von 0 bis (1 &lt;&lt; n) - 1. Der vernünftigste n-Bit-Wert Vn, der einem 8-Bit-Wert V8 entspricht, ist gleich Vn = V8 &amp; ((1 &lt;&lt; n) - 1). |

### Siehe auch

* namensraum [Aspose.PSD.FileFormats.Jpeg](../../aspose.psd.fileformats.jpeg/)
* Montage [Aspose.PSD](../../)


