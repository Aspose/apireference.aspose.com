---
title: ChangeViewerPreference
second_title: Aspose.PDF for .NET API Referansı
description: Görünüm tercihini değiştirir.
type: docs
weight: 90
url: /tr/net/aspose.pdf.facades/pdfcontenteditor/changeviewerpreference/
---
## PdfContentEditor.ChangeViewerPreference method

Görünüm tercihini değiştirir.

```csharp
public void ChangeViewerPreference(int viewerAttribution)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| viewerAttribution | Int32 | ViewerPreference sınıfında tanımlanan görünüm özniteliği. |

### Örnekler

```csharp
PdfContentEditor editor = new PdfContentEditor();
editor.BindPdf("example.pdf");
editor.ChangeViewerPreference(ViewerPreference.HideMenubar);
editor.ChangeViewerPreference(ViewerPreference.PageModeUseNone);
editor.Save("example_out.pdf");
```

### Ayrıca bakınız

* class [PdfContentEditor](../../pdfcontenteditor)
* ad alanı [Aspose.Pdf.Facades](../../pdfcontenteditor)
* toplantı [Aspose.PDF](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.PDF.dll -->
