---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions Klasse"
linktitle: "PdfSaveOptions"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions Klasse. Klasse für XPS-zu-PDF-Speicheroptionen in C++."
type: docs
weight: 300
url: /de/cpp/aspose.page.xps.presentation.pdf/pdfsaveoptions/
---
## PdfSaveOptions class


Klasse für XPS-zu-PDF Speicheroptionen.

```cpp
class PdfSaveOptions : public Aspose::Page::SaveOptions,
                       public Aspose::Page::IMultiPageSaveOptions,
                       public Aspose::Page::XPS::Presentation::IXpsTextConversionOptions,
                       public Aspose::Page::XPS::Presentation::IPipelineOptions,
                       public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | Gibt die Größe eines Seitenabschnitts an, der von Knoten zu Knoten weitergegeben wird. |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | Die Sammlung von Ereignis‑Handlern, die Änderungen an einer [XPS](../../aspose.page.xps/)‑Seite kurz vor dem Speichern vornimmt. |
| [get_EncryptionDetails](./get_encryptiondetails/)() const | Liefert Verschlüsselungsdetails. Wenn nicht festgelegt, wird keine Verschlüsselung durchgeführt. |
| [get_ImageCompression](./get_imagecompression/)() const | Gibt den Kompressionstyp an, der für alle Bilder im Dokument verwendet wird. Standard ist [PdfImageCompression::Auto](../pdfimagecompression/). |
| [get_OutlineTreeExpansionLevel](./get_outlinetreeexpansionlevel/)() const | Gibt an, bis zu welcher Ebene die Dokumentenübersicht erweitert werden soll, wenn die PDF-Datei in einem Viewer geöffnet wird. 1 - nur die Elemente der ersten Ebene werden angezeigt, 2 - nur die Elemente der ersten und zweiten Ebene werden angezeigt, und so weiter. Standard ist 1. |
| [get_OutlineTreeHeight](./get_outlinetreeheight/)() const | Gibt die Höhe des zu speichernden Dokumentenübersichtsbaums an. 0 - der Übersichtsbaum wird nicht konvertiert, 1 - nur die Elemente der ersten Ebene werden konvertiert, und so weiter. Standard ist 10. |
| [get_PageNumbers](./get_pagenumbers/)() override | Liest/setzt das Array von Seitenzahlen, die konvertiert werden sollen. |
| [get_PreserveText](./get_preservetext/)() override | In [XPS](../../aspose.page.xps/), können einige Textelemente Verweise auf alternative Glyphenformen enthalten, die keinem Zeichencode in der Schriftart entsprechen. Wenn dieses Flag auf true gesetzt ist, wird der Text solcher [XPS](../../aspose.page.xps/) Elemente in Grafikformen konvertiert. Dann erscheint der Text selbst transparent darüber. Dadurch bleibt der Text dieser Elemente auswählbar. Der Nebeneffekt ist jedoch, dass die Ausgabedatei viel größer sein kann als das Original. Wenn dieses Flag auf false gesetzt ist, werden die Zeichen, die als alternative Formen angezeigt werden sollen, durch andere Zeichen ersetzt, die den alternativen Glyphenformen zugeordnet werden. Daher wird der Text, obwohl weiterhin auswählbar, modifiziert und wahrscheinlich unlesbar. Standard ist false. |
| [get_TextCompression](./get_textcompression/)() const | Gibt an, auf welcher Ebene der Dokumentenübersicht [ApsBookmark](../)-Objekte angezeigt werden sollen. 0 - nicht angezeigt. 1 - auf der ersten Ebene und so weiter. Standard ist 0. |
| [PdfSaveOptions](./pdfsaveoptions/)() | Erstellt eine neue Instanz von Optionen. |
| [set_BatchSize](./set_batchsize/)(int32_t) override | Gibt die Größe eines Seitenabschnitts an, der von Knoten zu Knoten weitergegeben wird. |
| [set_EncryptionDetails](./set_encryptiondetails/)(System::SharedPtr\<PdfEncryptionDetails\>) | Legt Verschlüsselungsdetails fest. Wenn nicht festgelegt, wird keine Verschlüsselung durchgeführt. |
| [set_ImageCompression](./set_imagecompression/)(PdfImageCompression) | Gibt den Kompressionstyp an, der für alle Bilder im Dokument verwendet wird. Standard ist [PdfImageCompression::Auto](../pdfimagecompression/). |
| [set_OutlineTreeExpansionLevel](./set_outlinetreeexpansionlevel/)(int32_t) | Gibt an, bis zu welcher Ebene die Dokumentenübersicht erweitert werden soll, wenn die PDF-Datei in einem Viewer geöffnet wird. 1 - nur die Elemente der ersten Ebene werden angezeigt, 2 - nur die Elemente der ersten und zweiten Ebene werden angezeigt, und so weiter. Standard ist 1. |
| [set_OutlineTreeHeight](./set_outlinetreeheight/)(int32_t) | Gibt die Höhe des zu speichernden Dokumentenübersichtsbaums an. 0 - der Übersichtsbaum wird nicht konvertiert, 1 - nur die Elemente der ersten Ebene werden konvertiert, und so weiter. Standard ist 10. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | Liest/setzt das Array von Seitenzahlen, die konvertiert werden sollen. |
| [set_PreserveText](./set_preservetext/)(bool) override | In [XPS](../../aspose.page.xps/), können einige Textelemente Verweise auf alternative Glyphenformen enthalten, die keinem Zeichencode in der Schriftart entsprechen. Wenn dieses Flag auf true gesetzt ist, wird der Text solcher [XPS](../../aspose.page.xps/) Elemente in Grafikformen konvertiert. Dann erscheint der Text selbst transparent darüber. Dadurch bleibt der Text dieser Elemente auswählbar. Der Nebeneffekt ist jedoch, dass die Ausgabedatei viel größer sein kann als das Original. Wenn dieses Flag auf false gesetzt ist, werden die Zeichen, die als alternative Formen angezeigt werden sollen, durch andere Zeichen ersetzt, die den alternativen Glyphenformen zugeordnet werden. Daher wird der Text, obwohl weiterhin auswählbar, modifiziert und wahrscheinlich unlesbar. Standard ist false. |
| [set_TextCompression](./set_textcompression/)(PdfTextCompression) | Gibt an, auf welcher Ebene der Dokumentenübersicht [ApsBookmark](../)-Objekte angezeigt werden sollen. 0 - nicht angezeigt. 1 - auf der ersten Ebene und so weiter. Standard ist 0. |
## Siehe auch

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IXpsTextConversionOptions](../../aspose.page.xps.presentation/ixpstextconversionoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)
