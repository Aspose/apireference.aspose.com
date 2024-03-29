---
title: EmfCommentEmfSpool
second_title: Справочник по Aspose.Imaging for .NET API
description: Запись EMR_COMMENT_EMFSPOOL содержит встроенные записи EMFSPOOL. Примечание. Поля не описанные в этом разделе указаны в разделе 2.3.3.
type: docs
weight: 3370
url: /ru/net/aspose.imaging.fileformats.emf.emf.records/emfcommentemfspool/
---
## EmfCommentEmfSpool class

Запись EMR_COMMENT_EMFSPOOL содержит встроенные записи EMFSPOOL. Примечание. Поля, не описанные в этом разделе, указаны в разделе 2.3.3.

```csharp
public sealed class EmfCommentEmfSpool : EmfCommentRecordType
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [EmfCommentEmfSpool](emfcommentemfspool#constructor)() | Инициализирует новый экземпляр[`EmfCommentEmfSpool`](../emfcommentemfspool) класс. |
| [EmfCommentEmfSpool](emfcommentemfspool#constructor_1)(EmfRecord) | Инициализирует новый экземпляр[`EmfCommentEmfSpool`](../emfcommentemfspool) класс. |

## Характеристики

| Имя | Описание |
| --- | --- |
| override [CommentIdentifier](../../aspose.imaging.fileformats.emf.emf.records/emfcommentemfspool/commentidentifier) { get; set; } | Получает или задает 32-разрядное целое число без знака, которое идентифицирует эту запись комментария как содержащую записи EMFSPOOL. Значение 0x00000000 идентифицирует это как запись EMR_COMMENT_EMFSPOOL. |
| [DataSize](../../aspose.imaging.fileformats.emf.emf.records/emfcommentrecordtype/datasize) { get; set; } | Получает или задает 32-разрядное целое число без знака, указывающее размер в байтах полей CommentIdentifier и CommentRecordParm в поле RecordBuffer, за которым следует . Он НЕ ДОЛЖЕН включать размер самого себя или размер поля AlignmentPadding, если present |
| [EmfSpoolRecordIdentifier](../../aspose.imaging.fileformats.emf.emf.records/emfcommentemfspool/emfspoolrecordidentifier) { get; set; } | Получает или задает 32-разрядное целое число без знака, определяющее тип записи EMR_COMMENT_EMFSPOOL. |
| [EmfSpoolRecords](../../aspose.imaging.fileformats.emf.emf.records/emfcommentemfspool/emfspoolrecords) { get; set; } | Получает или задает массив байтов переменной длины, содержащий одну или несколько записей определения шрифта EMFSPOOL ([MS-EMFSPOOL], раздел 2.2.3.3). |
| [Size](../../aspose.imaging.fileformats.emf.emf.records/emfrecord/size) { get; set; } | Получает или задает размер записи |
| [Type](../../aspose.imaging.fileformats.emf.emf.records/emfrecord/type) { get; set; } | Получает или задает тип. |

### Смотрите также

* class [EmfCommentRecordType](../emfcommentrecordtype)
* пространство имен [Aspose.Imaging.FileFormats.Emf.Emf.Records](../../aspose.imaging.fileformats.emf.emf.records)
* сборка [Aspose.Imaging](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
