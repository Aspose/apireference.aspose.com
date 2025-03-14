---
title: DigitalSignature.Comments
linktitle: Comments
articleTitle: Comments
second_title: Aspose.Words for .NET
description: Discover the DigitalSignature Comments property to enhance your signing process with clear purpose comments. Boost efficiency and clarity in your documents!
type: docs
weight: 20
url: /net/aspose.words.digitalsignatures/digitalsignature/comments/
---
## DigitalSignature.Comments property

Gets the signing purpose comment.

```csharp
public string Comments { get; }
```

## Examples

Shows how to validate and display information about each signature in a document.

```csharp
Document doc = new Document(MyDir + "Digitally signed.docx");

foreach (DigitalSignature signature in doc.DigitalSignatures)
{
    Console.WriteLine($"{(signature.IsValid ? "Valid" : "Invalid")} signature: ");
    Console.WriteLine($"\tReason:\t{signature.Comments}");
    Console.WriteLine($"\tType:\t{signature.SignatureType}");
    Console.WriteLine($"\tSign time:\t{signature.SignTime}");
    Console.WriteLine($"\tSubject name:\t{signature.CertificateHolder.Certificate.SubjectName}");
    Console.WriteLine($"\tIssuer name:\t{signature.CertificateHolder.Certificate.IssuerName.Name}");
    Console.WriteLine();
}
```

### See Also

* class [DigitalSignature](../)
* namespace [Aspose.Words.DigitalSignatures](../../../aspose.words.digitalsignatures/)
* assembly [Aspose.Words](../../../)
