---
title: "класс Aspose::Page::EPS::PsDocument"
linktitle: "PsDocument"
second_title: "Aspose.Page для C++"
description: "Класс Aspose::Page::EPS::PsDocument. Этот класс инкапсулирует PS/EPS документы в C++."
type: docs
weight: 700
url: /ru/cpp/aspose.page.eps/psdocument/
---
## PsDocument class


Этот класс инкапсулирует документы PS/EPS.

```cpp
class PsDocument : public Aspose::Page::Document
```

## Методы

| Метод | Описание |
| --- | --- |
| [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Добавляет обрезку к текущему графическому состоянию. |
| [ClipAndNewPath](./clipandnewpath/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Добавляет обрезку к текущему графическому состоянию и затем записывает оператор "newpath". Это необходимо сделать, чтобы избежать слияния этого пути обрезки с некоторыми последующими путями, такими как глифы, очерченные оператором "charpath". |
| [ClipRectangle](./cliprectangle/)(System::Drawing::RectangleF) | Добавляет прямоугольник обрезки к текущему графическому состоянию. |
| [ClipText](./cliptext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Добавляет обрезку из контура заданного текста в заданном шрифте. |
| [ClosePage](./closepage/)() | Завершить текущую страницу. |
| [ConvertType1FontToTTF](./converttype1fonttottf/)(System::String, System::String) | Преобразует шрифт Type 1 в **TrueType**. Имя преобразованного TTF‑шрифта будет таким же, как у входного шрифта Type 1, с расширением ".ttf". Файл TTF будет сохранён в указанную выходную директорию. |
| [ConvertType3FontToTTF](./converttype3fonttottf/)(System::String, System::String) | Преобразует шрифт Type 3 в **TrueType**. Имя преобразованного TTF‑шрифта будет таким же, как у входного файла шрифта Type 3, с расширением ".ttf". Файл TTF будет сохранён в указанную выходную директорию. |
| [ConvertType3FontToTTF](./converttype3fonttottf/)(System::String, System::SharedPtr\<System::IO::Stream\>) | Преобразует шрифт Type 3 в поток **TrueType**. |
| [CropEps](./cropeps/)(System::String, System::ArrayPtr\<float\>) | Обрезает данный [PsDocument](./) как файл [EPS](../). Он сохраняет исходный файл [EPS](../) с обновлённым существующим %BoundingBox или создаёт новый. |
| [CropEps](./cropeps/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<float\>) | Обрезает данный [PsDocument](./) как файл [EPS](../). Он сохраняет исходный файл [EPS](../) с обновлённым существующим %BoundingBox или создаёт новый. |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Нарисовать произвольный путь. |
| [DrawArc](./drawarc/)(double, double, double, double, double, double) | Рисует дугу. |
| [DrawExplicitImageMask](./drawexplicitimagemask/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Рисует маскированное изображение. |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>) | Рисует изображение. |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) | Рисует преобразованное изображение с фоном. |
| [DrawLine](./drawline/)(double, double, double, double) | Рисует отрезок линии. |
| [DrawOval](./drawoval/)(double, double, double, double) | Рисует овал. |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Рисует многоугольник. |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Рисует полигон. |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Рисует полилинию. |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Рисует полилинию. |
| [DrawRect](./drawrect/)(double, double, double, double) | Рисует прямоугольник. |
| [DrawRoundRect](./drawroundrect/)(double, double, double, double, double, double) | Рисует скруглённый прямоугольник. |
| [DrawTransparentImage](./drawtransparentimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, int32_t) | Отрисовывает преобразованное прозрачное изображение. Если у изображения нет альфа‑канала, оно будет отрисовано как непрозрачное. |
| [ExtractEpsBoundingBox](./extractepsboundingbox/)() | Читает файл [EPS](../) и извлекает ограничивающий прямоугольник изображения [EPS](../) из комментария %BoundingBox или границы стандартного размера страницы (0, 0, 595, 842), если он отсутствует. |
| [ExtractEpsSize](./extractepssize/)() | Читает файл [EPS](../) и извлекает размер изображения [EPS](../) из комментария %BoundingBox или стандартного размера страницы (595, 842), если он отсутствует. |
| [ExtractText](./extracttext/)(System::SharedPtr\<SaveOptions\>, int32_t, int32_t) | Извлекает текст из файла PS. Текст может быть извлечён только если он записан шрифтом Type 42 (**TrueType**) или шрифтом Type 0 с шрифтами Type 42 в его векторной карте. |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Заполняет произвольный путь. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Добавляет строку текста, заполняя внутреннюю часть глифов и рисуя контуры глифов. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Добавляет строку текста, заполняя внутреннюю часть глифов и рисуя контуры глифов. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Добавляет строку текста, заполняя внутреннюю часть глифов и рисуя контуры глифов. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Добавляет строку текста, заполняя внутреннюю часть глифов и рисуя контуры глифов. |
| [FillArc](./fillarc/)(double, double, double, double, double, double) | Заполняет дугу. |
| [FillOval](./filloval/)(double, double, double, double) | Заполняет овал. |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Заполняет полигон. |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Заполняет полигон. |
| [FillRect](./fillrect/)(double, double, double, double) | Заполняет прямоугольник. |
| [FillRoundRect](./fillroundrect/)(double, double, double, double, double, double) | Заполняет скруглённый прямоугольник. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Добавляет строку текста, заполняя внутреннюю часть глифов. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | Добавляет строку текста, заполняя внутреннюю часть глифов. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Добавляет строку текста, заполняя внутреннюю часть глифов. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Добавляет строку текста, заполняя внутреннюю часть глифов. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Добавляет строку текста, заполняя внутреннюю часть глифов. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Добавляет строку текста, заполняя внутреннюю часть глифов. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Добавляет строку текста, заполняя внутреннюю часть глифов. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Добавляет строку текста, заполняя внутреннюю часть глифов. |
| [get_InputStream](./get_inputstream/)() | Инициализирует [PsDocument](./) с помощью потока и параметров загрузки. |
| [get_NumberOfPages](./get_numberofpages/)() const | Возвращает количество страниц в полученном PDF‑документе. |
| [GetPaint](./getpaint/)() | Получает объект рисования текущего графического состояния. |
| [GetStroke](./getstroke/)() | Устанавливает обводку в текущем графическом состоянии. |
| [GetXmpMetadata](./getxmpmetadata/)() | Читает файл PS/EPS и извлекает XmpMetdata, если он уже существует, или добавляет новый, если его нет. |
| [MergeToPdf](./mergetopdf/)(System::String, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | Объединяет файлы PS/EPS в устройство. |
| [MergeToPdf](./mergetopdf/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | Объединяет файлы PS/EPS в устройство. |
| [OpenPage](./openpage/)(float, float) | Создаёт новую страницу и делает её текущей. |
| [OpenPage](./openpage/)(System::String) | Создаёт новую страницу с размером документа и делает её текущей. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Добавляет строку текста, рисуя контуры глифов. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | Добавляет строку текста, рисуя контуры глифов. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Добавляет строку текста, рисуя контуры глифов. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Добавляет строку текста, рисуя контуры глифов. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Добавляет строку текста, рисуя контуры глифов. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Добавляет строку текста, рисуя контуры глифов. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Добавляет строку текста, рисуя контуры глифов. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Добавляет строку текста, рисуя контуры глифов. |
| [PsDocument](./psdocument/)() | Инициализирует пустой [PsDocument](./). Этот конструктор используется только для дополнительных операций, не связанных с файлами PostScript, например, преобразования шрифтов. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Инициализирует пустой [PsDocument](./) с инициализированной страницей. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Инициализирует пустой [PsDocument](./) с инициализированной страницей. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) | Инициализирует пустой [PsDocument](./). |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) | Инициализирует пустой [PsDocument](./). |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | Инициализирует пустой [PsDocument](./), когда количество страниц документа [Postscript](../../aspose.page.eps.postscript/) известно заранее. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | Инициализирует пустой [PsDocument](./), когда количество страниц документа [Postscript](../../aspose.page.eps.postscript/) известно заранее. |
| [PsDocument](./psdocument/)(System::String) | Инициализирует [PsDocument](./) входным файлом PS/EPS. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>) | Инициализирует [PsDocument](./) потоком файла PS/EPS. |
| [ResizeEps](./resizeeps/)(System::String, System::Drawing::SizeF, Units) | Изменяет размер данного [PsDocument](./) как файл [EPS](../). Этот метод используется только после извлечения размера [EPS](../). Он сохраняет исходный [EPS](../) filD:\\ASPOSE.GIT\\aspose.pdf.cpp\\cs_porter_produce\\Aspose.Page.Cpp.Page.Cpp\\eps\\src_eps\\PsDocument.hThe output directory where image file will be saved.e с обновлённым существующим %BoundingBox или будет создан новый. Также будет установлена матрица преобразования [Page](../../aspose.page/). |
| [ResizeEps](./resizeeps/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) | Изменяет размер данного [PsDocument](./) как файл [EPS](../). Этот метод используется только после извлечения размера [EPS](../). Он сохраняет исходный файл [EPS](../) с обновлённым существующим %BoundingBox или создаёт новый. Также будет установлена матрица преобразования [Page](../../aspose.page/). |
| [Rotate](./rotate/)(float) | Добавляет вращение против часовой стрелки относительно начала координат к текущему графическому состоянию (поворачивает текущую матрицу). |
| [Rotate](./rotate/)(int32_t) | Добавляет вращение против часовой стрелки относительно начала координат к текущему графическому состоянию (поворачивает текущую матрицу). |
| [Save](./save/)(System::String) | Сохраняет данный [PsDocument](./) как файл [EPS](../). Этот метод используется только после обновления метаданных [XMP](../../aspose.page.eps.xmp/). Он сохраняет исходный файл [EPS](../) с обновлёнными существующими метаданными или создаёт новый при вызове метода GetMetadata. В последнем случае добавляется весь необходимый код PostScript и комментарии [EPS](../). |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | Сохраняет данный [PsDocument](./) в поток. Этот метод используется только после обновления метаданных [XMP](../../aspose.page.eps.xmp/). Он сохраняет исходный файл [EPS](../) с обновлёнными существующими метаданными или создаёт новый при вызове метода GetMetadata. В последнем случае добавляется весь необходимый код PostScript и комментарии [EPS](../). |
| [Save](./save/)() | Сохраняет данный [PsDocument](./) как файл PS или [EPS](../). Этот метод используется только когда [PsDocument](./) был создан с нуля. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Device::ImageSaveOptions\>) | Сохраняет файл PS/EPS в файл изображения. Каталог вывода и имя файла будут такими же, как у входного PS‑файла. Расширение файла будет соответствовать формату изображения, указанному в параметре \"options\". Если документ был инициализирован потоком, который не является FileStream, файл изображения будет сохранён в текущей папке с шаблоном имени файла по умолчанию. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Device::ImageSaveOptions\>, System::String, System::String) | Сохраняет файл PS/EPS в файл изображения в указанный каталог с указанным именем файла. Расширение файла будет соответствовать формату изображения, указанному в параметре \"options\". |
| [SaveAsImagesBytes](./saveasimagesbytes/)(System::SharedPtr\<Device::ImageSaveOptions\>) | Сохраняет файл PS/EPS в массивы байтов изображений. |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Device::PdfSaveOptions\>) | Сохраняет файл PS/EPS в PDF‑файл. |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PdfSaveOptions\>) | Сохраняет файл PS/EPS в поток PDF. |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Сохраняет изображение PNG/JPEG/TIFF/BMP/GIF/EMF из входного потока в выходной поток [EPS](../). |
| static [SaveImageAsEps](./saveimageaseps/)(System::String, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Сохраняет изображение PNG/JPEG/TIFF/BMP/GIF/EMF из файла в файл [EPS](../). |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Сохраняет объект Bitmap в файл [EPS](../). |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Сохраняет объект Bitmap в выходной поток [EPS](../). |
| [Scale](./scale/)(float, float) | Добавляет масштаб к текущему графическому состоянию (масштабирует текущую матрицу). |
| [set_InputStream](./set_inputstream/)(System::SharedPtr\<System::IO::Stream\>) | Инициализирует [PsDocument](./) с помощью потока и параметров загрузки. |
| [SetPageDevice](./setpagedevice/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Устанавливает параметры устройства страницы (см. оператор \"setpagedevice\" в спецификации PostScript). Среди них могут быть размер страницы, цвет и т.д. |
| [SetPageSize](./setpagesize/)(float, float) | Устанавливает размер страницы. Чтобы создать страницы разных размеров в одном документе, используйте метод [SetPageDevice](./setpagedevice/) сразу после этого метода. |
| [SetPaint](./setpaint/)(System::SharedPtr\<System::Drawing::Brush\>) | Устанавливает заливку в текущем графическом состоянии. |
| [SetStroke](./setstroke/)(System::SharedPtr\<System::Drawing::Pen\>) | Устанавливает обводку в текущем графическом состоянии. |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Устанавливает текущую трансформацию в эту. |
| [Shear](./shear/)(float, float) | Поворачивает текущее графическое состояние против часовой стрелки вокруг точки. |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Добавляет трансформацию к текущему графическому состоянию (конкатенирует эту матрицу с текущей). |
| [Translate](./translate/)(float, float) | Добавляет перемещение к текущему графическому состоянию (перемещает текущую матрицу). |
| [WriteGraphicsRestore](./writegraphicsrestore/)() | Записывает восстановление текущего графического состояния (см. спецификацию PostScript по оператору "grestore"). |
| [WriteGraphicsSave](./writegraphicssave/)() | Записывает сохранение текущего графического состояния (см. спецификацию PostScript по оператору "gsave"). |
## См. также

* Class [Document](../../aspose.page/document/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)
