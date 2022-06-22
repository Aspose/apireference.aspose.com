---
title: TiffOptions
second_title: Справочник по Aspose.CAD для .NET API
description: Опции формата файла tiff. Обратите внимание что теги ширины и высоты будут перезаписаны при создании изображения параметрами ширины и высоты поэтому нет необходимости указывать их напрямую. Обратите внимание что многие параметры возвращают значение по умолчанию но это не означает что этот параметр устанавливается явно как значение тега. Чтобы проверить наличие тега используйте свойство Tags или соответствующий метод IsTagPresent.
type: docs
weight: 29940
url: /ru/net/aspose.cad.imageoptions/tiffoptions/
---
## TiffOptions class

Опции формата файла tiff. Обратите внимание, что теги ширины и высоты будут перезаписаны при создании изображения параметрами ширины и высоты, поэтому нет необходимости указывать их напрямую. Обратите внимание, что многие параметры возвращают значение по умолчанию, но это не означает, что этот параметр устанавливается явно как значение тега. Чтобы проверить наличие тега, используйте свойство Tags или соответствующий метод IsTagPresent.

```csharp
public class TiffOptions : ImageOptionsBase
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [TiffOptions](tiffoptions#constructor_2)(TiffDataType[]) | Инициализирует новый экземпляр класса[`TiffOptions`](../tiffoptions). |
| [TiffOptions](tiffoptions#constructor)(TiffExpectedFormat) | Инициализирует новый экземпляр класса[`TiffOptions`](../tiffoptions). По умолчанию используется соглашение с прямым порядком байтов. |
| [TiffOptions](tiffoptions#constructor_3)(TiffOptions) | Инициализирует новый экземпляр класса[`TiffOptions`](../tiffoptions). |
| [TiffOptions](tiffoptions#constructor_1)(TiffExpectedFormat, TiffByteOrder) | Инициализирует новый экземпляр класса[`TiffOptions`](../tiffoptions). |

## Характеристики

| Имя | Описание |
| --- | --- |
| [AlphaStorage](../../aspose.cad.imageoptions/tiffoptions/alphastorage) { get; set; } | Получает или задает параметр хранения альфа-канала. Параметры, отличные отUnspecified используются, когда их более 3[`SamplesPerPixel`](./samplesperpixel)определено. |
| [Artist](../../aspose.cad.imageoptions/tiffoptions/artist) { get; set; } | Получает или устанавливает исполнителя. |
| [BitsPerPixel](../../aspose.cad.imageoptions/tiffoptions/bitsperpixel) { get; } | Получает биты на пиксель. |
| [BitsPerSample](../../aspose.cad.imageoptions/tiffoptions/bitspersample) { get; set; } | Получает или устанавливает биты на выборку. |
| [ByteOrder](../../aspose.cad.imageoptions/tiffoptions/byteorder) { get; set; } | Получает или задает значение, указывающее порядок байтов в TIFF. |
| [ColorMap](../../aspose.cad.imageoptions/tiffoptions/colormap) { get; set; } | Получает или задает карту цветов. |
| [Compression](../../aspose.cad.imageoptions/tiffoptions/compression) { get; set; } | Получает или задает сжатие. |
| [Copyright](../../aspose.cad.imageoptions/tiffoptions/copyright) { get; set; } | Получает или устанавливает авторские права. |
| [DateTime](../../aspose.cad.imageoptions/tiffoptions/datetime) { get; set; } | Получает или устанавливает дату и время. |
| [DocumentName](../../aspose.cad.imageoptions/tiffoptions/documentname) { get; set; } | Получает или задает имя документа. |
| [FaxT4Options](../../aspose.cad.imageoptions/tiffoptions/faxt4options) { get; set; } | Получает или задает параметры факса t4. |
| [FillOrder](../../aspose.cad.imageoptions/tiffoptions/fillorder) { get; set; } | Получает или задает порядок заполнения байтовых битов. |
| [HalfToneHints](../../aspose.cad.imageoptions/tiffoptions/halftonehints) { get; set; } | Получает или устанавливает полутоновые подсказки. |
| [IccProfile](../../aspose.cad.imageoptions/tiffoptions/iccprofile) { get; } | Получает поток профиля icc. |
| [ImageDescription](../../aspose.cad.imageoptions/tiffoptions/imagedescription) { get; set; } | Получает или задает описание изображения. |
| [ImageLength](../../aspose.cad.imageoptions/tiffoptions/imagelength) { get; set; } | Получает или задает длину изображения. |
| [ImageWidth](../../aspose.cad.imageoptions/tiffoptions/imagewidth) { get; set; } | Получает или задает ширину изображения. |
| [InkNames](../../aspose.cad.imageoptions/tiffoptions/inknames) { get; set; } | Получает или задает имена чернил. |
| [InterruptionToken](../../aspose.cad/imageoptionsbase/interruptiontoken) { get; set; } | Токен, который можно использовать для прерывания операции экспорта |
| [IsExtraSamplesPresent](../../aspose.cad.imageoptions/tiffoptions/isextrasamplespresent) { get; } | Получает значение, указывающее, присутствуют ли дополнительные выборки. |
| [IsValid](../../aspose.cad.imageoptions/tiffoptions/isvalid) { get; } | Получает значение, указывающее, правильно ли сконфигурирован[`TiffOptions`](../tiffoptions). Используйте метод Validate, чтобы найти причину сбоя. |
| [Layers](../../aspose.cad/imageoptionsbase/layers) { get; set; } | Получает или устанавливает имена слоев, которые необходимо экспортировать. Все данные будут экспортированы без слоев, если имена не заданы. |
| [MaxSampleValue](../../aspose.cad.imageoptions/tiffoptions/maxsamplevalue) { get; set; } | Получает или задает максимальное значение выборки. |
| [MinSampleValue](../../aspose.cad.imageoptions/tiffoptions/minsamplevalue) { get; set; } | Получает или задает минимальное значение выборки. |
| [Orientation](../../aspose.cad.imageoptions/tiffoptions/orientation) { get; set; } | Получает или задает ориентацию. |
| [PageName](../../aspose.cad.imageoptions/tiffoptions/pagename) { get; set; } | Получает или задает имя страницы. |
| [PageNumber](../../aspose.cad.imageoptions/tiffoptions/pagenumber) { get; set; } | Получает или задает тег номера страницы. |
| override [Palette](../../aspose.cad.imageoptions/tiffoptions/palette) { get; set; } | Получает или задает цветовую палитру. |
| [Pc3File](../../aspose.cad/imageoptionsbase/pc3file) { get; set; } | Получает или задает полное имя файла PC3. |
| [Photometric](../../aspose.cad.imageoptions/tiffoptions/photometric) { get; set; } | Получает или задает фотометрический параметр. |
| [PlanarConfiguration](../../aspose.cad.imageoptions/tiffoptions/planarconfiguration) { get; set; } | Получает или задает планарную конфигурацию. |
| [Predictor](../../aspose.cad.imageoptions/tiffoptions/predictor) { get; set; } | Получает или задает предиктор для сжатия LZW. |
| override [ResolutionSettings](../../aspose.cad.imageoptions/tiffoptions/resolutionsettings) { get; set; } | Получает или устанавливает параметры разрешения. |
| [ResolutionUnit](../../aspose.cad.imageoptions/tiffoptions/resolutionunit) { get; set; } | Получает или задает единицу разрешения. |
| [Rotation](../../aspose.cad/imageoptionsbase/rotation) { get; set; } | Получает или устанавливает параметр для поворота, отражения или поворота и отражения изображения.. |
| [RowsPerStrip](../../aspose.cad.imageoptions/tiffoptions/rowsperstrip) { get; set; } | Получает или задает количество строк в полосе. |
| [SampleFormat](../../aspose.cad.imageoptions/tiffoptions/sampleformat) { get; set; } | Получает или задает образец формата. |
| [SamplesPerPixel](../../aspose.cad.imageoptions/tiffoptions/samplesperpixel) { get; } | Получает выборки на пиксель. Чтобы изменить значение этого свойства, используйте установщик свойств[`BitsPerSample`](./bitspersample). |
| [ScannerManufacturer](../../aspose.cad.imageoptions/tiffoptions/scannermanufacturer) { get; set; } | Получает или задает производителя сканера. |
| [ScannerModel](../../aspose.cad.imageoptions/tiffoptions/scannermodel) { get; set; } | Получает или задает модель сканера. |
| [SmaxSampleValue](../../aspose.cad.imageoptions/tiffoptions/smaxsamplevalue) { get; set; } | Получает или задает максимальное значение выборки. Значение имеет тип поля, который лучше всего соответствует образцу данных (тип Byte, Short или Long). |
| [SminSampleValue](../../aspose.cad.imageoptions/tiffoptions/sminsamplevalue) { get; set; } | Получает или задает минимальное значение выборки. Значение имеет тип поля, который лучше всего соответствует образцу данных (тип Byte, Short или Long). |
| [SoftwareType](../../aspose.cad.imageoptions/tiffoptions/softwaretype) { get; set; } | Получает или задает тип программного обеспечения. |
| [Source](../../aspose.cad/imageoptionsbase/source) { get; set; } | Получает или задает источник для создания изображения. |
| [StripByteCounts](../../aspose.cad.imageoptions/tiffoptions/stripbytecounts) { get; set; } | Получает или задает счетчик байтов полосы. |
| [StripOffsets](../../aspose.cad.imageoptions/tiffoptions/stripoffsets) { get; set; } | Получает или задает смещения полосы. |
| [SubFileType](../../aspose.cad.imageoptions/tiffoptions/subfiletype) { get; set; } | Получает или задает общее указание типа данных, содержащихся в этом подфайле. |
| [Tags](../../aspose.cad.imageoptions/tiffoptions/tags) { get; set; } | Получает или устанавливает теги. |
| override [TargetFormat](../../aspose.cad.imageoptions/tiffoptions/targetformat) { get; } |  |
| [TargetPrinter](../../aspose.cad.imageoptions/tiffoptions/targetprinter) { get; set; } | Получает или задает целевой принтер. |
| [Threshholding](../../aspose.cad.imageoptions/tiffoptions/threshholding) { get; set; } | Получает или устанавливает пороговое значение. |
| [Timeout](../../aspose.cad/imageoptionsbase/timeout) { get; set; } | Значение времени ожидания для операции экспорта |
| [TotalPages](../../aspose.cad.imageoptions/tiffoptions/totalpages) { get; } | Получает общее количество страниц. |
| [UserWatermarkColor](../../aspose.cad/imageoptionsbase/userwatermarkcolor) { get; set; } | Цвет пользовательского водяного знака |
| [UserWatermarkText](../../aspose.cad/imageoptionsbase/userwatermarktext) { get; set; } | Текст для пользовательского водяного знака |
| [ValidTagCount](../../aspose.cad.imageoptions/tiffoptions/validtagcount) { get; } | Получает допустимое количество тегов. Это не общее количество тегов, а количество тегов, которые могут быть сохранены. |
| [VectorRasterizationOptions](../../aspose.cad/imageoptionsbase/vectorrasterizationoptions) { get; set; } | Получает или задает параметры векторной растеризации. |
| override [XmpData](../../aspose.cad.imageoptions/tiffoptions/xmpdata) { get; set; } | Получает или задает контейнер метаданных XMP. |
| [Xposition](../../aspose.cad.imageoptions/tiffoptions/xposition) { get; set; } | Получает или устанавливает позицию x. |
| [Xresolution](../../aspose.cad.imageoptions/tiffoptions/xresolution) { get; set; } | Получает или задает разрешение x. |
| [Yposition](../../aspose.cad.imageoptions/tiffoptions/yposition) { get; set; } | Получает или задает позицию y. |
| [Yresolution](../../aspose.cad.imageoptions/tiffoptions/yresolution) { get; set; } | Получает или задает разрешение по оси y. |

## Методы

| Имя | Описание |
| --- | --- |
| [AddTag](../../aspose.cad.imageoptions/tiffoptions/addtag)(TiffDataType) | Добавляет новый тег. |
| [AddTags](../../aspose.cad.imageoptions/tiffoptions/addtags)(TiffDataType[]) | Добавляет теги. |
| [GetTagByType](../../aspose.cad.imageoptions/tiffoptions/gettagbytype)(TiffTags) | Получает экземпляр тега по типу. |
| [IsTagPresent](../../aspose.cad.imageoptions/tiffoptions/istagpresent)(TiffTags) | Определяет, присутствует ли тег в опциях или нет. |
| [RemoveTag](../../aspose.cad.imageoptions/tiffoptions/removetag)(TiffTags) | Удаляет тег. |
| [Validate](../../aspose.cad.imageoptions/tiffoptions/validate)() | Проверяет правильность комбинации тегов |
| static [GetValidTagsCount](../../aspose.cad.imageoptions/tiffoptions/getvalidtagscount)(TiffDataType[]) | Получает количество допустимых тегов. |

### Смотрите также

* class [ImageOptionsBase](../../aspose.cad/imageoptionsbase)
* пространство имен [Aspose.CAD.ImageOptions](../../aspose.cad.imageoptions)
* сборка [Aspose.CAD](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.CAD.dll -->
