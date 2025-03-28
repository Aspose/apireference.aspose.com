---
title: AccessPermissions
second_title: Aspose.Slides für .NET-API-Referenz
description: Enthält eine Reihe von Flags die angeben welche Zugriffsberechtigungen gewährt werden sollen wenn das Dokument mit Benutzerzugriff geöffnet wird. SehenPdfAccessPermissionsaspose.slides.export/pdfaccesspermissions .
type: docs
weight: 10
url: /de/net/aspose.slides.export/ipdfoptions/accesspermissions/
---
## IPdfOptions.AccessPermissions property

Enthält eine Reihe von Flags, die angeben, welche Zugriffsberechtigungen gewährt werden sollen, wenn das Dokument mit Benutzerzugriff geöffnet wird. Sehen[`PdfAccessPermissions`](../../pdfaccesspermissions) .

```csharp
public PdfAccessPermissions AccessPermissions { get; set; }
```

### Beispiele

```csharp
[C#]
var pdfOptions = new PdfOptions();
pdfOptions.Password = "my_password";
pdfOptions.AccessPermissions = PdfAccessPermissions.PrintDocument | PdfAccessPermissions.HighQualityPrint;

using (var presentation = new Presentation())
{
    presentation.Save(pdfFilePath, SaveFormat.Pdf, pdfOptions);
}
```

### Siehe auch

* enum [PdfAccessPermissions](../../pdfaccesspermissions)
* interface [IPdfOptions](../../ipdfoptions)
* namensraum [Aspose.Slides.Export](../../ipdfoptions)
* Montage [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
