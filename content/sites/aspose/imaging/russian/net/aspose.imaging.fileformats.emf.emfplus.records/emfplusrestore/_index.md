---
title: EmfPlusRestore
second_title: Справочник по Aspose.Imaging for .NET API
description: Запись EmfPlusRestore восстанавливает состояние графики идентифицированное указанным индексом из стека сохраненных состояний графики.
type: docs
weight: 6230
url: /ru/net/aspose.imaging.fileformats.emf.emfplus.records/emfplusrestore/
---
## EmfPlusRestore class

Запись EmfPlusRestore восстанавливает состояние графики, идентифицированное указанным индексом, из стека сохраненных состояний графики.

```csharp
public sealed class EmfPlusRestore : EmfPlusStateRecordType
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [EmfPlusRestore](emfplusrestore)(EmfPlusRecord) | Инициализирует новый экземпляр[`EmfPlusRestore`](../emfplusrestore) класс. |

## Характеристики

| Имя | Описание |
| --- | --- |
| virtual [DataSize](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusrecord/datasize) { get; set; } | Получает или задает 32-разрядное целое число без знака, которое ДОЛЖНО определять 32-разрядное выровненное количество байтов данных в следующем поле RecordData. Это число не включает 12-байтовый заголовок записи. |
| virtual [Flags](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusrecord/flags) { get; set; } | Получает или задает 16-разрядное целое число без знака, содержащее информацию для некоторых записей о том, как должна выполняться операция, и о структуре записи. |
| virtual [Size](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusrecord/size) { get; set; } | Получает или задает 32-разрядное целое число без знака, указывающее 32-разрядное выровненное количество байтов во всей записи, включая 12-разрядный заголовок записи и данные, относящиеся к записи. |
| [StackIndex](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusrestore/stackindex) { get; set; } | Получает или задает 32-разрядное целое число без знака, указывающее уровень, связанный с состоянием графики a . Значение уровня было присвоено графическому состоянию предыдущей записью EmfPlusSave (раздел 2.3.7.5). |
| [Type](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusrecord/type) { get; } | Получает 16-разрядное целое число без знака, определяющее тип записи. |

### Смотрите также

* class [EmfPlusStateRecordType](../emfplusstaterecordtype)
* пространство имен [Aspose.Imaging.FileFormats.Emf.EmfPlus.Records](../../aspose.imaging.fileformats.emf.emfplus.records)
* сборка [Aspose.Imaging](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
