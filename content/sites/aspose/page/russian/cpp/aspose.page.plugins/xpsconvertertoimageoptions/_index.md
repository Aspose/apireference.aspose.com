---
title: "Aspose::Page::Plugins::XpsConverterToImageOptions класс"
linktitle: "XpsConverterToImageOptions"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::Plugins::XpsConverterToImageOptions класс. Представляет параметры конвертера XPS в изображение для плагина XpsConverter в C++."
type: docs
weight: 2100
url: /ru/cpp/aspose.page.plugins/xpsconvertertoimageoptions/
---
## XpsConverterToImageOptions class


Представляет параметры конвертера [XPS](../../aspose.page.xps/) в изображение для плагина [XpsConverter](../xpsconverter/).

```cpp
class XpsConverterToImageOptions : public Aspose::Page::Plugins::XpsConverterOptions
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_ImageFormat](./get_imageformat/)() const | Получает/устанавливает тип изображения. |
| [get_OperationName](./get_operationname/)() override | Возвращает имя операции. |
| [get_PageNumbers](./get_pagenumbers/)() const | Получает/устанавливает массив номеров страниц в документе [XPS](../../aspose.page.xps/) для конвертации. Если не задано, будут конвертированы все страницы. |
| [get_Resolution](./get_resolution/)() const | Получает/устанавливает разрешение изображения. |
| [get_Size](./get_size/)() const | Получает/устанавливает размер получаемого изображения. |
| [get_SmoothingMode](./get_smoothingmode/)() const | Получает/устанавливает режим сглаживания при рендеринге изображения. |
| [set_ImageFormat](./set_imageformat/)(Aspose::Page::Drawing::Imaging::ImageFormat) | Получает/устанавливает тип изображения. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) | Получает/устанавливает массив номеров страниц в документе [XPS](../../aspose.page.xps/) для конвертации. Если не задано, будут конвертированы все страницы. |
| [set_Resolution](./set_resolution/)(float) | Получает/устанавливает разрешение изображения. |
| [set_Size](./set_size/)(System::Drawing::Size) | Получает/устанавливает размер получаемого изображения. |
| [set_SmoothingMode](./set_smoothingmode/)(System::Nullable\<System::Drawing::Drawing2D::SmoothingMode\>) | Получает/устанавливает режим сглаживания при рендеринге изображения. |
| [XpsConverterToImageOptions](./xpsconvertertoimageoptions/)() | Инициализирует новый экземпляр объекта [XpsConverterToImageOptions](./) с параметрами по умолчанию. |
| [XpsConverterToImageOptions](./xpsconvertertoimageoptions/)(Aspose::Page::Drawing::Imaging::ImageFormat) | Инициализирует новый экземпляр объекта [XpsConverterToImageOptions](./) с форматом изображения. |
| [XpsConverterToImageOptions](./xpsconvertertoimageoptions/)(System::Drawing::Size) | Инициализирует новый экземпляр объекта [XpsConverterToImageOptions](./) с размером получаемого изображения. |
| [XpsConverterToImageOptions](./xpsconvertertoimageoptions/)(Aspose::Page::Drawing::Imaging::ImageFormat, System::Drawing::Size) | Инициализирует новый экземпляр объекта [XpsConverterToImageOptions](./) с форматом изображения и размером получаемого изображения. |
## См. также

* Class [XpsConverterOptions](../xpsconverteroptions/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
