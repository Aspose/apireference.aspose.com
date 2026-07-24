---
title: "Aspose::Page::EPS::PsDocument::SaveAsImage метод"
linktitle: "SaveAsImage"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::EPS::PsDocument::SaveAsImage метод. Сохраняет файл PS/EPS в файл изображения. Выходной каталог и имя файла будут такими же, как у входного PS‑файла. Расширение файла будет соответствовать формату изображения в параметре \"options\". Если документ был инициализирован потоком, который не является FileStream, файл изображения будет сохранён в текущей папке с шаблоном имени файла по умолчанию в C++."
type: docs
weight: 4300
url: /ru/cpp/aspose.page.eps/psdocument/saveasimage/
---
## PsDocument::SaveAsImage(System::SharedPtr\<Device::ImageSaveOptions\>) method


Сохраняет файл PS/EPS в файл изображения. Каталог вывода и имя файла будут такими же, как у входного PS‑файла. Расширение файла будет соответствовать формату изображения, указанному в параметре \"options\". Если документ был инициализирован потоком, который не является FileStream, файл изображения будет сохранён в текущей папке с шаблоном имени файла по умолчанию.

```cpp
void Aspose::Page::EPS::PsDocument::SaveAsImage(System::SharedPtr<Device::ImageSaveOptions> options)
```

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.eps.device/imagesaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::SaveAsImage(System::SharedPtr\<Device::ImageSaveOptions\>, System::String, System::String) method


Сохраняет файл PS/EPS в файл изображения в указанный каталог с указанным именем файла. Расширение файла будет соответствовать формату изображения, указанному в параметре \"options\".

```cpp
void Aspose::Page::EPS::PsDocument::SaveAsImage(System::SharedPtr<Device::ImageSaveOptions> options, System::String outDir, System::String fileNameTemplate)
```

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.eps.device/imagesaveoptions/)
* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
