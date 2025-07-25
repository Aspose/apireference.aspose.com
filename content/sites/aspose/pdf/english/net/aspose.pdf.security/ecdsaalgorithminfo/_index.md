---
title: Class EcdsaAlgorithmInfo
second_title: Aspose.PDF for .NET API Reference
description: Aspose.Pdf.Security.EcdsaAlgorithmInfo class. Represents a class for the information about the ECDSA signature algorithm
type: docs
weight: 10130
url: /net/aspose.pdf.security/ecdsaalgorithminfo/
---
## EcdsaAlgorithmInfo class

Represents a class for the information about the ECDSA signature algorithm.

```csharp
public sealed class EcdsaAlgorithmInfo : KeyedSignatureAlgorithmInfo
```

## Properties

| Name | Description |
| --- | --- |
| [SignatureName](../../aspose.pdf.security/signaturealgorithminfo/signaturename/) { get; } | Gets the name of the signature field. |

## Methods

| Name | Description |
| --- | --- |
| override [ToString](../../aspose.pdf.security/signaturealgorithminfo/tostring/)() | Converts the current information object to its string representation. |

## Fields

| Name | Description |
| --- | --- |
| readonly [AlgorithmType](../../aspose.pdf.security/signaturealgorithminfo/algorithmtype/) | Gets the type of the signature algorithm used for signing the PDF document. |
| readonly [CryptographicStandard](../../aspose.pdf.security/signaturealgorithminfo/cryptographicstandard/) | Gets the cryptographic standard used for signing the PDF document. |
| readonly [DigestHashAlgorithm](../../aspose.pdf.security/signaturealgorithminfo/digesthashalgorithm/) | Gets the digest hash algorithm used for the signature. For a timestamp, this is the digest hash algorithm with which the hash of the document content is signed. |
| readonly [EccName](../../aspose.pdf.security/ecdsaalgorithminfo/eccname/) | Gets the name of the elliptic curve used by the ECDSA. |
| readonly [KeySize](../../aspose.pdf.security/keyedsignaturealgorithminfo/keysize/) | Gets the size of the cryptographic key used by the signature algorithm. |

### See Also

* class [KeyedSignatureAlgorithmInfo](../keyedsignaturealgorithminfo/)
* namespace [Aspose.Pdf.Security](../../aspose.pdf.security/)
* assembly [Aspose.PDF](../../)


