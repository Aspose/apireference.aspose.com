---
title: IsBackground
second_title: Aspose.PDF per .NET API Reference
description: Ottiene o imposta lo stato in background. Se true stamp verrà posizionato come sfondo della pagina spammata. Per impostazione predefinita è impostato su false.
type: docs
weight: 30
url: /it/net/aspose.pdf.facades/stamp/isbackground/
---
## Stamp.IsBackground property

Ottiene o imposta lo stato in background. Se true stamp verrà posizionato come sfondo della pagina spammata. Per impostazione predefinita è impostato su false.

```csharp
public bool IsBackground { get; set; }
```

### Esempi

```csharp
PdfFileStamp fileStamp = new PdfFileStamp("input.pdf", "output.pdf");
Stamp stamp = new Stamp();
stamp.BindLogo(new FormattedText("STAMP"));
stamp.IsBackground = true;
fileStamp.AddStamp(stamp);
fileStamp.Close();
```

### Guarda anche

* class [Stamp](../../stamp)
* spazio dei nomi [Aspose.Pdf.Facades](../../stamp)
* assemblea [Aspose.PDF](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.PDF.dll -->
