---
title: PdfSaveOptions.ImageCompression
second_title: Справочник по API Aspose.Note для .NET
description: PdfSaveOptions свойство. Получает или задает тип сжатия применяемый к изображениям в файле PDF.
type: docs
weight: 20
url: /ru/net/aspose.note.saving/pdfsaveoptions/imagecompression/
---
## PdfSaveOptions.ImageCompression property

Получает или задает тип сжатия, применяемый к изображениям в файле PDF.

```csharp
public PdfImageCompression ImageCompression { get; set; }
```

### Примеры

Показывает, как сохранить документ в формате pdf, используя определенные настройки.

```csharp
// Путь к каталогу документов.
string dataDir = RunExamples.GetDataDir_LoadingAndSaving();

// Загрузите документ в Aspose.Note.
Document doc = new Document(dataDir + "Aspose.one");

// Инициализировать объект PdfSaveOptions
PdfSaveOptions opts = new PdfSaveOptions
                          {
                              // Использовать сжатие JPEG
                              ImageCompression = Saving.Pdf.PdfImageCompression.Jpeg,

                              // Качество сжатия JPEG
                              JpegQuality = 90
                          };

dataDir = dataDir + "Document.SaveWithOptions_out.pdf";
doc.Save(dataDir, opts);
```

### Смотрите также

* enum [PdfImageCompression](../../../aspose.note.saving.pdf/pdfimagecompression/)
* class [PdfSaveOptions](../)
* пространство имен [Aspose.Note.Saving](../../pdfsaveoptions/)
* сборка [Aspose.Note](../../../)


