---
title: "Метод Aspose::Page::XPS::XpsDocument::SaveAsImage"
linktitle: "SaveAsImage"
second_title: "Aspose.Page для C++"
description: "Метод Aspose::Page::XPS::XpsDocument::SaveAsImage. Сохраняет документ в файл изображения. Каталог вывода и имя файла будут такими же, как у входного XPS‑файла. Расширение файла будет соответствовать формату изображения, указанному в параметре \"options\". Если документ был инициализирован потоком, который не является FileStream, файл изображения будет сохранён в текущей папке с шаблоном имени файла по умолчанию в C++."
type: docs
weight: 5500
url: /ru/cpp/aspose.page.xps/xpsdocument/saveasimage/
---
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) method


Сохраняет документ в файл изображения. Каталог вывода и имя файла будут такими же, как у входного файла [XPS](../../). Расширение файла будет соответствовать формату изображения в параметре "options". Если документ был инициализирован потоком, который не является FileStream, файл изображения будет сохранён в текущей папке с шаблоном имени файла по умолчанию.

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| параметры | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | Параметры сохранения документа в формате растрового изображения. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>, System::String, System::String) method


Сохраняет документ в файл изображения в указанный каталог с указанным именем файла. Расширение файла будет соответствовать формату изображения в параметре \"options\".

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options, System::String outDir, System::String fileNameTemplate)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| параметры | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | Параметры сохранения документа в формате растрового изображения. |
| outDir | System::String | Каталог вывода, в котором будет сохранён файл изображения. |
| fileNameTemplate | System::String | Шаблон имени файла для изображения (без расширения). Если входной файл [XPS](../../) состоит из одной страницы, он будет точно именем файла, иначе будет добавляться "_[n]", где "n" — номер страницы, начиная с 0, к этому будет присоединён суффикс. Расширение файла будет соответствовать формату изображения в параметре "option". |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
