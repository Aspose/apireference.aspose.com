---
title: DefaultRegularFont
second_title: Référence de l'API Aspose.Slides pour .NET
description: Renvoie ou définit la police utilisée dans le cas où la police source est introuvable. LectureécritureString .
type: docs
weight: 10
url: /fr/net/aspose.slides.export/isaveoptions/defaultregularfont/
---
## ISaveOptions.DefaultRegularFont property

Renvoie ou définit la police utilisée dans le cas où la police source est introuvable. Lecture-écritureString .

```csharp
public string DefaultRegularFont { get; set; }
```

### Exemples

```csharp
[C#]

using (Presentation pres = new Presentation("SomePresentation.pptx"))
{
	HtmlOptions htmlOpts = new HtmlOptions();
	htmlOpts.DefaultRegularFont = "Arial Black";
	pres.Save(@"SomePresentation-out-ArialBlack.html", SaveFormat.Html, htmlOpts);
	htmlOpts.DefaultRegularFont = "Lucida Console";
	pres.Save(@"Somepresentation-out-LucidaConsole.html", SaveFormat.Html, htmlOpts);

	PdfOptions pdfOpts = new PdfOptions();
	pdfOpts.DefaultRegularFont = "Arial Black";
	pres.Save(@"SomePresentation-out-ArialBlack.pdf", SaveFormat.Pdf, pdfOpts);
}
```

### Voir également

* interface [ISaveOptions](../../isaveoptions)
* espace de noms [Aspose.Slides.Export](../../isaveoptions)
* Assemblée [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
