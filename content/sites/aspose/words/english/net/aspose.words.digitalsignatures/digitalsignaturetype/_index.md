---
title: DigitalSignatureType Enum
linktitle: DigitalSignatureType
articleTitle: DigitalSignatureType
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words.DigitalSignatures.DigitalSignatureType enum to enhance your document security with versatile digital signature options.
type: docs
weight: 600
url: /net/aspose.words.digitalsignatures/digitalsignaturetype/
---
## DigitalSignatureType enumeration

Specifies the type of a digital signature.

```csharp
public enum DigitalSignatureType
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Unknown | `0` | Indicates an error, unknown digital signature type. |
| CryptoApi | `1` | The Crypto API signature method used in Microsoft Word 97-2003 .DOC binary documents. |
| XmlDsig | `2` | The XmlDsig signature method used in OOXML and OpenDocument documents. |

## Examples

Shows how to sign documents with X.509 certificates.

```csharp
// Verify that a document is not signed.
Assert.False(FileFormatUtil.DetectFileFormat(MyDir + "Document.docx").HasDigitalSignature);

// Create a CertificateHolder object from a PKCS12 file, which we will use to sign the document.
CertificateHolder certificateHolder = CertificateHolder.Create(MyDir + "morzal.pfx", "aw", null);

// There are two ways of saving a signed copy of a document to the local file system:
// 1 - Designate a document by a local system filename and save a signed copy at a location specified by another filename.
SignOptions signOptions = new SignOptions { SignTime = DateTime.Now };
DigitalSignatureUtil.Sign(MyDir + "Document.docx", ArtifactsDir + "Document.DigitalSignature.docx",
    certificateHolder, signOptions);

Assert.True(FileFormatUtil.DetectFileFormat(ArtifactsDir + "Document.DigitalSignature.docx").HasDigitalSignature);

// 2 - Take a document from a stream and save a signed copy to another stream.
using (FileStream inDoc = new FileStream(MyDir + "Document.docx", FileMode.Open))
{
    using (FileStream outDoc = new FileStream(ArtifactsDir + "Document.DigitalSignature.docx", FileMode.Create))
    {
        DigitalSignatureUtil.Sign(inDoc, outDoc, certificateHolder);
    }
}

Assert.True(FileFormatUtil.DetectFileFormat(ArtifactsDir + "Document.DigitalSignature.docx").HasDigitalSignature);

// Please verify that all of the document's digital signatures are valid and check their details.
Document signedDoc = new Document(ArtifactsDir + "Document.DigitalSignature.docx");
DigitalSignatureCollection digitalSignatureCollection = signedDoc.DigitalSignatures;

Assert.True(digitalSignatureCollection.IsValid);
Assert.AreEqual(1, digitalSignatureCollection.Count);
Assert.AreEqual(DigitalSignatureType.XmlDsig, digitalSignatureCollection[0].SignatureType);
Assert.AreEqual("CN=Morzal.Me", signedDoc.DigitalSignatures[0].IssuerName);
Assert.AreEqual("CN=Morzal.Me", signedDoc.DigitalSignatures[0].SubjectName);
```

### See Also

* namespace [Aspose.Words.DigitalSignatures](../../aspose.words.digitalsignatures/)
* assembly [Aspose.Words](../../)
