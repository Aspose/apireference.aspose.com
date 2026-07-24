---
title: "Класс Aspose::Page::XPS::Presentation::Xps::TiffDataReader"
linktitle: "TiffDataReader"
second_title: "Aspose.Page для C++"
description: "Класс Aspose::Page::XPS::Presentation::Xps::TiffDataReader. Класс используется для чтения данных из каталога файлов TIFF‑изображения (IFD). Он помогает считывать разрешение TIFF и проверять соответствие TIFF в C++."
type: docs
weight: 100
url: /ru/cpp/aspose.page.xps.presentation.xps/tiffdatareader/
---
## TiffDataReader class


Класс используется для чтения данных из каталога файлов изображений TIFF (IFD). Он помогает читать разрешение TIFF и проверять соответствие TIFF.

```cpp
class TiffDataReader : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_ImageHeight](./get_imageheight/)() | Возвращает высоту TIFF‑изображения. Если высота равна 0, возвращает значение по умолчанию (100). |
| [get_ImageWidth](./get_imagewidth/)() | Возвращает ширину TIFF‑изображения. Если ширина равна 0, возвращает значение по умолчанию (100). |
| [get_ImageXResolution](./get_imagexresolution/)() const | Возвращает разрешение X TIFF‑изображения. |
| [get_ImageYResolution](./get_imageyresolution/)() const | Возвращает разрешение Y TIFF‑изображения. |
| [get_IsConformXpsSpecification](./get_isconformxpsspecification/)() | Возвращает true, если TIFF‑изображение соответствует спецификации [XPS](../../aspose.page.xps/) и может быть вставлено в документ [XPS](../../aspose.page.xps/) без изменений. |
| static [IsTiff](./istiff/)(System::ArrayPtr\<uint8_t\>) | Документация формата находится в Aspose.Words\\Doc. |
| [TiffDataReader](./tiffdatareader/)(System::ArrayPtr\<uint8_t\>) | Инициализирует новый экземпляр класса [TiffDataReader](./). |
| [TiffDataReader](./tiffdatareader/)(System::SharedPtr\<Foundation::BigEndianBinaryReader\>) | Инициализирует новый экземпляр класса [TiffDataReader](./). |
## См. также

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Presentation::Xps](../)
* Library [Aspose.Page for C++](../../)
