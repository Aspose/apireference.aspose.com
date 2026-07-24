---
title: "Aspose::Page::EPS::Device::PsSaveOptions класс"
linktitle: "PsSaveOptions"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::EPS::Device::PsSaveOptions класс. Этот класс содержит параметры, необходимые для управления процессом преобразования документа в файл PostScript (PS) или Encapsulated PostScript (EPS) в C++."
type: docs
weight: 900
url: /ru/cpp/aspose.page.eps.device/pssaveoptions/
---
## PsSaveOptions class


Этот класс содержит параметры, необходимые для управления процессом преобразования документа в файл PostScript (PS) или Encapsulated PostScript ([EPS](../../aspose.page.eps/)).

```cpp
class PsSaveOptions : public Aspose::Page::SaveOptions
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_BackgroundColor](./get_backgroundcolor/)() const | Цвет фона. |
| [get_EmbedFonts](./get_embedfonts/)() const | Указывает, следует ли встраивать используемые шрифты в документ PS. |
| [get_EmbedFontsAs](./get_embedfontsas/)() const | Тип шрифта, в котором следует встраивать шрифты в документ PS. |
| [get_Margins](./get_margins/)() const | Поля страницы. |
| [get_PageSize](./get_pagesize/)() const | Размер страницы. |
| [get_SaveFormat](./get_saveformat/)() const | Формат сохранения полученного файла. |
| [get_Transparent](./get_transparent/)() const | Указывает, является ли фон прозрачным. |
| [PsSaveOptions](./pssaveoptions/)() | Инициализирует новый экземпляр класса [PsSaveOptions](./) с значениями по умолчанию для флагов [SuppressErrors](../) (true) и [Debug](../) (false). |
| [PsSaveOptions](./pssaveoptions/)(bool) | Инициализирует новый экземпляр класса [PsSaveOptions](./) с значениями по умолчанию для флага [Debug](../) (false). |
| [set_BackgroundColor](./set_backgroundcolor/)(System::Nullable\<System::Drawing::Color\>) | Цвет фона. |
| [set_EmbedFonts](./set_embedfonts/)(bool) | Указывает, следует ли встраивать используемые шрифты в документ PS. |
| [set_EmbedFontsAs](./set_embedfontsas/)(System::String) | Тип шрифта, в котором следует встраивать шрифты в документ PS. |
| [set_Margins](./set_margins/)(System::SharedPtr\<Aspose::Page::Margins\>) | Поля страницы. |
| [set_PageSize](./set_pagesize/)(Aspose::Page::Drawing::Size) | Размер страницы. |
| [set_SaveFormat](./set_saveformat/)(PsSaveFormat) | Формат сохранения полученного файла. |
| [set_Transparent](./set_transparent/)(bool) | Указывает, является ли фон прозрачным. |
## См. также

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Namespace [Aspose::Page::EPS::Device](../)
* Library [Aspose.Page for C++](../../)
