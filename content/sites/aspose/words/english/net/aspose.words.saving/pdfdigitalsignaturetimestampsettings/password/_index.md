---
title: PdfDigitalSignatureTimestampSettings.Password
linktitle: Password
articleTitle: Password
second_title: Aspose.Words for .NET
description: Secure your PDF documents with the PdfDigitalSignatureTimestampSettings. Easily manage timestamp server passwords for enhanced protection and compliance.
type: docs
weight: 20
url: /net/aspose.words.saving/pdfdigitalsignaturetimestampsettings/password/
---
## PdfDigitalSignatureTimestampSettings.Password property

Timestamp server password.

```csharp
public string Password { get; set; }
```

## Remarks

The default value is `null`.

## Examples

Shows how to sign a saved PDF document digitally and timestamp it.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
builder.Writeln("Signed PDF contents.");

// Create a "PdfSaveOptions" object that we can pass to the document's "Save" method
// to modify how that method converts the document to .PDF.
PdfSaveOptions options = new PdfSaveOptions();

// Create a digital signature and assign it to our SaveOptions object to sign the document when we save it to PDF.
CertificateHolder certificateHolder = CertificateHolder.Create(MyDir + "morzal.pfx", "aw");
options.DigitalSignatureDetails = new PdfDigitalSignatureDetails(certificateHolder, "Test Signing", "Aspose Office", DateTime.Now);

// Create a timestamp authority-verified timestamp.
options.DigitalSignatureDetails.TimestampSettings =
    new PdfDigitalSignatureTimestampSettings("https://freetsa.org/tsr", "JohnDoe", "MyPassword");

// The default lifespan of the timestamp is 100 seconds.
Assert.That(options.DigitalSignatureDetails.TimestampSettings.Timeout.TotalSeconds, Is.EqualTo(100.0d));

// We can set our timeout period via the constructor.
options.DigitalSignatureDetails.TimestampSettings =
    new PdfDigitalSignatureTimestampSettings("https://freetsa.org/tsr", "JohnDoe", "MyPassword", TimeSpan.FromMinutes(30));

Assert.That(options.DigitalSignatureDetails.TimestampSettings.Timeout.TotalSeconds, Is.EqualTo(1800.0d));
Assert.That(options.DigitalSignatureDetails.TimestampSettings.ServerUrl, Is.EqualTo("https://freetsa.org/tsr"));
Assert.That(options.DigitalSignatureDetails.TimestampSettings.UserName, Is.EqualTo("JohnDoe"));
Assert.That(options.DigitalSignatureDetails.TimestampSettings.Password, Is.EqualTo("MyPassword"));

// The "Save" method will apply our signature to the output document at this time.
doc.Save(ArtifactsDir + "PdfSaveOptions.PdfDigitalSignatureTimestamp.pdf", options);
```

### See Also

* class [PdfDigitalSignatureTimestampSettings](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)
