---
title: PdfAOptionsBase.AlignText
second_title: Aspose.PDF for .NET API Reference
description: Свойство PdfAOptionsBase. Получает или устанавливает значение, указывающее, необходимы ли дополнительные средства для сохранения выравнивания текста в процессе конвертации PDF/A
type: docs
weight: 10
url: /ru/net/aspose.pdf.plugins/pdfaoptionsbase/aligntext/
---
## Свойство PdfAOptionsBase.AlignText

Получает или устанавливает значение, указывающее, необходимы ли дополнительные средства для сохранения выравнивания текста в процессе конвертации PDF/A.

```csharp
public bool AlignText { get; set; }
```

### Значение свойства

`true`, если выравнивание текста изменяется и необходимы дополнительные действия для его восстановления; в противном случае `false`.

## Примечания

При установке в `true` процесс конвертации попытается восстановить исходные границы сегмента текста. Для большинства документов нет необходимости изменять это свойство с его значения по умолчанию `false`, так как выравнивание текста не изменяется в процессе конвертации по умолчанию.

### См. также

* класс [PdfAOptionsBase](../)
* пространство имен [Aspose.Pdf.Plugins](../../../aspose.pdf.plugins/)
* сборка [Aspose.PDF](../../../)