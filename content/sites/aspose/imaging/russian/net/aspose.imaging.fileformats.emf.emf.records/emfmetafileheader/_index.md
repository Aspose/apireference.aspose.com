---
title: EmfMetafileHeader
second_title: Справочник по Aspose.Imaging for .NET API
description: Типы записей EMR_HEADER определяют начальные точки метафайлов EMF и указывают свойства устройства на котором было создано изображение в метафайле . Информация в записи заголовка позволяет метафайлам EMF быть независимыми от какого-либо конкретного устройства вывода. Значение поля Size можно использовать для различения различных типов записей EMR_HEADER перечисленных ранее в этом разделе. Существует три возможных headers Базовый заголовок который является записью EmfMetafileHeader. Часть этого заголовка с фиксированным размером составляет 88 байт и содержит объект Header. Первый заголовок расширения который является записью EmfMetafileHeaderExtension1. часть этого заголовка составляет 100 байт и он содержит объект Header object и объект HeaderExtension1 раздел 2.2.10. Второй заголовок расширения который является записью EmfMetafileHeaderExtension2. Часть фиксированного размера этого заголовка составляет 108 байт и он содержит объект Header объект HeaderExtension1 и объект HeaderExtension2 раздел 2.2.11.
type: docs
weight: 3810
url: /ru/net/aspose.imaging.fileformats.emf.emf.records/emfmetafileheader/
---
## EmfMetafileHeader class

Типы записей EMR_HEADER определяют начальные точки метафайлов EMF и указывают свойства устройства, на котором было создано изображение в метафайле . Информация в записи заголовка позволяет метафайлам EMF быть независимыми от какого-либо конкретного устройства вывода. Значение поля Size можно использовать для различения различных типов записей EMR_HEADER, перечисленных ранее в этом разделе. Существует три возможных headers: Базовый заголовок, который является записью EmfMetafileHeader. Часть этого заголовка с фиксированным размером составляет 88 байт и содержит объект Header. Первый заголовок расширения, который является записью EmfMetafileHeaderExtension1. часть этого заголовка составляет 100 байт, и он содержит объект Header object и объект HeaderExtension1 (раздел 2.2.10). Второй заголовок расширения, который является записью EmfMetafileHeaderExtension2. Часть фиксированного размера этого заголовка составляет 108 байт, и он содержит объект Header, объект HeaderExtension1 и объект HeaderExtension2 (раздел 2.2.11).

```csharp
public class EmfMetafileHeader : EmfRecord
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [EmfMetafileHeader](emfmetafileheader#constructor)() | Инициализирует новый экземпляр[`EmfMetafileHeader`](../emfmetafileheader) класс. |
| [EmfMetafileHeader](emfmetafileheader#constructor_1)(EmfMetafileHeader) | Инициализирует новый экземпляр[`EmfMetafileHeader`](../emfmetafileheader) класс. |
| [EmfMetafileHeader](emfmetafileheader#constructor_2)(EmfRecord) | Инициализирует новый экземпляр[`EmfMetafileHeader`](../emfmetafileheader) класс. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [EmfDescription](../../aspose.imaging.fileformats.emf.emf.records/emfmetafileheader/emfdescription) { get; set; } | Получает или задает описание EMF Необязательная строка Unicode UTF16-LE с нулем в конце произвольной длины и содержимого. Его расположение в записи и количество символов задаются полями offDescription и nDescription соответственно в EmfHeader. Если значение любого из полей равно нулю, строка описания отсутствует. |
| [EmfDescriptionBuffer](../../aspose.imaging.fileformats.emf.emf.records/emfmetafileheader/emfdescriptionbuffer) { get; set; } | Получает или задает описание EMF buffer Необязательный массив байтов, содержащий строку описания EMF, которая не обязательно должна быть непрерывной с фиксированной частью записи EmfMetafileHeader . Соответственно, поле в этом буфере с пометкой «UndefinedSpace» является необязательным и ДОЛЖНО игнорироваться. |
| [EmfHeader](../../aspose.imaging.fileformats.emf.emf.records/emfmetafileheader/emfheader) { get; set; } | Получает или задает объект заголовка (раздел 2.2.9), который содержит информацию о content и структуре метафайла |
| [EmfHeaderRecordBuffer](../../aspose.imaging.fileformats.emf.emf.records/emfmetafileheader/emfheaderrecordbuffer) { get; set; } | Получает или задает необязательный массив байтов, содержащий оставшуюся часть записи заголовка EMF. Размер этого поля ДОЛЖЕН быть кратен 4 байтам |
| [Size](../../aspose.imaging.fileformats.emf.emf.records/emfrecord/size) { get; set; } | Получает или задает размер записи |
| [Type](../../aspose.imaging.fileformats.emf.emf.records/emfrecord/type) { get; set; } | Получает или задает тип. |

### Смотрите также

* class [EmfRecord](../emfrecord)
* пространство имен [Aspose.Imaging.FileFormats.Emf.Emf.Records](../../aspose.imaging.fileformats.emf.emf.records)
* сборка [Aspose.Imaging](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
