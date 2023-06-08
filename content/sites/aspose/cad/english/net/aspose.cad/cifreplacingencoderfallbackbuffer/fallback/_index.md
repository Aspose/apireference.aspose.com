---
title: CifReplacingEncoderFallbackBuffer.Fallback
second_title: Aspose.CAD for .NET API Reference
description: CifReplacingEncoderFallbackBuffer method. Called when a singlechar character out of output codepage is encountered
type: docs
weight: 30
url: /net/aspose.cad/cifreplacingencoderfallbackbuffer/fallback/
---
## Fallback(char, int) {#fallback_1}

Called when a single-char character out of output codepage is encountered

```csharp
public override bool Fallback(char charUnknown, int index)
```

| Parameter | Type | Description |
| --- | --- | --- |
| charUnknown | Char | Out of codepage character |
| index | Int32 | Index of character in the input string |

### Return Value

True if we do replace, false if not

### See Also

* class [CifReplacingEncoderFallbackBuffer](../)
* namespace [Aspose.CAD](../../cifreplacingencoderfallbackbuffer/)
* assembly [Aspose.CAD](../../../)

---

## Fallback(char, char, int) {#fallback}

Called when a surrogate pair of characters out of output codepage is encountered

```csharp
public override bool Fallback(char charUnknownHigh, char charUnknownLow, int index)
```

| Parameter | Type | Description |
| --- | --- | --- |
| charUnknownHigh | Char | Out of codepage character - high surrogate |
| charUnknownLow | Char | Out of codepage character - low surrogate |
| index | Int32 | Index of character in the input string |

### Return Value

True if we do replace, false if not

### See Also

* class [CifReplacingEncoderFallbackBuffer](../)
* namespace [Aspose.CAD](../../cifreplacingencoderfallbackbuffer/)
* assembly [Aspose.CAD](../../../)


