---
title: EmfPlusDrawLines
second_title: Справочник по Aspose.Imaging for .NET API
description: Запись EmfPlusDrawlLines определяет рисование ряда соединенных линий
type: docs
weight: 5980
url: /ru/net/aspose.imaging.fileformats.emf.emfplus.records/emfplusdrawlines/
---
## EmfPlusDrawLines class

Запись EmfPlusDrawlLines определяет рисование ряда соединенных линий

```csharp
public sealed class EmfPlusDrawLines : EmfPlusDrawingRecordType
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [EmfPlusDrawLines](emfplusdrawlines)(EmfPlusRecord) | Инициализирует новый экземпляр[`EmfPlusDrawLines`](../emfplusdrawlines) класс. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [ClosedShape](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusdrawlines/closedshape) { get; set; } | Получает или задает значение, указывающее, является ли [замкнутая форма]. |
| [Compressed](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusdrawlines/compressed) { get; set; } | Получает или задает значение, указывающее, является ли это[`EmfPlusDrawClosedCurve`](../emfplusdrawclosedcurve)сжато. Этот бит указывает, задает ли поле PointData сжатые данные. Если установлено, PointData указывает абсолютные местоположения в координатном пространстве с 16-битными целочисленными координатами. Если этот флажок не установлен, PointData указывает абсолютные местоположения в пространстве координат с 32-битными координатами с плавающей запятой. Примечание. Если установлен флаг Relative (ниже), этот флаг не определен и ДОЛЖЕН игнорироваться |
| virtual [DataSize](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusrecord/datasize) { get; set; } | Получает или задает 32-разрядное целое число без знака, которое ДОЛЖНО определять 32-разрядное выровненное количество байтов данных в следующем поле RecordData. Это число не включает 12-байтовый заголовок записи. |
| virtual [Flags](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusrecord/flags) { get; set; } | Получает или задает 16-разрядное целое число без знака, содержащее информацию для некоторых записей о том, как должна выполняться операция, и о структуре записи. |
| [ObjectId](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusdrawlines/objectid) { get; set; } | Получает или задает идентификатор объекта. Индекс объекта EmfPlusPen (раздел 2.2.1.7) в таблице объектов EMF+ для рисования линий. Значение ДОЛЖНО быть от нуля до 63 включительно. |
| [PointData](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusdrawlines/pointdata) { get; set; } | Получает или задает точку data Массив точек Count, указывающих начальную и конечную точки рисуемых линий. |
| [Relative](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusdrawlines/relative) { get; set; } | Получает или задает значение, указывающее, является ли это[`EmfPlusDrawClosedCurve`](../emfplusdrawclosedcurve)является относительным. Этот бит указывает, указывает ли поле PointData относительные или абсолютные местоположения. Если установлено, каждый элемент в PointData указывает местоположение в координатном пространстве, относительное к местоположению, указанному предыдущим элементом в массиве. В случае первого элемента в PointData предполагается предыдущее местоположение с координатами (0,0). Если он не установлен, PointData указывает абсолютные местоположения в соответствии с флагом C. Примечание. Если этот флаг установлен, флаг Compressed (выше) не определен и ДОЛЖЕН игнорироваться |
| virtual [Size](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusrecord/size) { get; set; } | Получает или задает 32-разрядное целое число без знака, указывающее 32-разрядное выровненное количество байтов во всей записи, включая 12-разрядный заголовок записи и данные, относящиеся к записи. |
| [Type](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusrecord/type) { get; } | Получает 16-разрядное целое число без знака, определяющее тип записи. |

### Смотрите также

* class [EmfPlusDrawingRecordType](../emfplusdrawingrecordtype)
* пространство имен [Aspose.Imaging.FileFormats.Emf.EmfPlus.Records](../../aspose.imaging.fileformats.emf.emfplus.records)
* сборка [Aspose.Imaging](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
