---
title: PdfSaveOptions.Compliance
linktitle: Compliance
articleTitle: Compliance
second_title: Aspose.Words для .NET
description: PdfSaveOptions Compliance свойство. Указывает уровень соответствия стандартам PDF для выходных документов на С#.
type: docs
weight: 40
url: /ru/net/aspose.words.saving/pdfsaveoptions/compliance/
---
## PdfSaveOptions.Compliance property

Указывает уровень соответствия стандартам PDF для выходных документов.

```csharp
public PdfCompliance Compliance { get; set; }
```

## Примечания

По умолчаниюPdf17.

## Примеры

Показывает, как установить уровень соответствия стандартам PDF для сохраненных PDF-документов.

```csharp
Document doc = new Document(MyDir + "Images.docx");

// Создаем объект «PdfSaveOptions», который мы можем передать методу «Save» документа.
// чтобы изменить способ преобразования этого метода в .PDF.
// Обратите внимание, что некоторые PdfSaveOptions запрещены при сохранении в один из стандартов и автоматически исправляются.
// Используйте IWarningCallback, чтобы узнать, какие параметры автоматически исправляются.
PdfSaveOptions saveOptions = new PdfSaveOptions();

// Установите для свойства «Соответствие» значение «PdfCompliance.PdfA1b», чтобы оно соответствовало стандарту «PDF/A-1b»,
// целью которого является сохранение визуального вида документа при преобразовании Aspose.Words в PDF.
// Установите для свойства «Соответствие» значение «PdfCompliance.Pdf17», чтобы соответствовать стандарту «1.7».
// Установите для свойства «Соответствие» значение «PdfCompliance.PdfA1a», чтобы оно соответствовало стандарту «PDF/A-1a»,
// который соответствует «PDF/A-1b», а также сохраняет структуру исходного документа.
// Установите для свойства «Соответствие» значение «PdfCompliance.PdfUa1», чтобы оно соответствовало стандарту «PDF/UA-1» (ISO 14289-1),
// целью которого является определение представления электронных документов в формате PDF, обеспечивающих доступ к файлу.
// Установите для свойства «Соответствие» значение «PdfCompliance.Pdf20», чтобы соответствовать стандарту «PDF 2.0» (ISO 32000-2).
// Установите для свойства «Соответствие» значение «PdfCompliance.PdfA4», чтобы оно соответствовало стандарту «PDF/A-4» (ISO 19004:2020),
// который сохраняет статический внешний вид документа с течением времени.
// Это помогает сделать документы доступными для поиска, но может значительно увеличить размер и без того больших документов.
saveOptions.Compliance = pdfCompliance;

doc.Save(ArtifactsDir + "PdfSaveOptions.Compliance.pdf", saveOptions);
```

### Смотрите также

* enum [PdfCompliance](../../pdfcompliance/)
* class [PdfSaveOptions](../)
* пространство имен [Aspose.Words.Saving](../../../aspose.words.saving/)
* сборка [Aspose.Words](../../../)
