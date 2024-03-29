---
title: DecryptFile
second_title: Aspose.PDF per .NET API Reference
description: Decrittografa un documento Pdf crittografato tramite la password del proprietario. Se il documento non ha la password del proprietario è consentito utilizzare la password dellutente. Genera uneccezione se il processo non riesce.
type: docs
weight: 60
url: /it/net/aspose.pdf.facades/pdffilesecurity/decryptfile/
---
## PdfFileSecurity.DecryptFile method

Decrittografa un documento Pdf crittografato tramite la password del proprietario. Se il documento non ha la password del proprietario, è consentito utilizzare la password dell'utente. Genera un'eccezione se il processo non riesce.

```csharp
public bool DecryptFile(string ownerPassword)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| ownerPassword | String | Password del proprietario. |

### Valore di ritorno

Vero per il successo.

### Esempi

```csharp
[C#]
string inFile = "D:\\input.pdf"; //Il TestPath potrebbe essere riassegnato.
string outFile = "D:\\output.pdf"; //Il TestPath potrebbe essere riassegnato.	
PdfFileSecurity fileSecurity = new PdfFileSecurity(inFile,outFile);		
fileSecurity.DecryptFile("ownerpass");

[Visual Basic]
Dim inFile As String = "D:\\input.pdf"  'The TestPath may be re-assigned.'
Dim outFile As String = "D:\\output.pdf"  'The TestPath may be re-assigned.'
Dim fileSecurity As PdfFileSecurity = New PdfFileSecurity(inFile,outFile) 
fileSecurity.DecryptFile("ownerpass")
```

### Guarda anche

* class [PdfFileSecurity](../../pdffilesecurity)
* spazio dei nomi [Aspose.Pdf.Facades](../../pdffilesecurity)
* assemblea [Aspose.PDF](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.PDF.dll -->
