---
title: DefaultRegularFont
second_title: Aspose.Slides for .NET API 参考
description: 返回或设置在未找到源字体时使用的字体 读写String
type: docs
weight: 10
url: /zh/net/aspose.slides.export/saveoptions/defaultregularfont/
---
## SaveOptions.DefaultRegularFont property

返回或设置在未找到源字体时使用的字体。 读写String。

```csharp
public string DefaultRegularFont { get; set; }
```

### 例子

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

### 也可以看看

* class [SaveOptions](../../saveoptions)
* 命名空间 [Aspose.Slides.Export](../../saveoptions)
* 部件 [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
