---
title: "Aspose::Page::EPS::PsDocument::SaveImageAsEps method"
linktitle: "SaveImageAsEps"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::EPS::PsDocument::SaveImageAsEps method. Сохраняет объект Bitmap в поток вывода EPS в C++."
type: docs
weight: 5800
url: /ru/cpp/aspose.page.eps/psdocument/saveimageaseps/
---
## PsDocument::SaveImageAsEps(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) method


Сохраняет объект Bitmap в поток вывода [EPS](../../).

```cpp
static void Aspose::Page::EPS::PsDocument::SaveImageAsEps(System::SharedPtr<System::Drawing::Bitmap> image, System::SharedPtr<System::IO::Stream> epsStream, System::SharedPtr<Device::PsSaveOptions> options)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| изображение | System::SharedPtr\<System::Drawing::Bitmap\> | Изображение. |
| epsStream | System::SharedPtr\<System::IO::Stream\> | [EPS](../../) поток вывода. |
| параметры | System::SharedPtr\<Device::PsSaveOptions\> | Содержит параметры, указывающие вывод ошибок, возникших во время преобразования. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Bitmap](../../../system.drawing/bitmap/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::SaveImageAsEps(System::SharedPtr\<System::Drawing::Bitmap\>, System::String, System::SharedPtr\<Device::PsSaveOptions\>) method


Сохраняет объект Bitmap в файл [EPS](../../).

```cpp
static void Aspose::Page::EPS::PsDocument::SaveImageAsEps(System::SharedPtr<System::Drawing::Bitmap> image, System::String epsFilePath, System::SharedPtr<Device::PsSaveOptions> options)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| изображение | System::SharedPtr\<System::Drawing::Bitmap\> | Изображение. |
| epsFilePath | System::String | Путь к файлу [EPS](../../). |
| параметры | System::SharedPtr\<Device::PsSaveOptions\> | Содержит параметры, указывающие вывод ошибок, возникших во время преобразования. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Bitmap](../../../system.drawing/bitmap/)
* Class [String](../../../system/string/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::SaveImageAsEps(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) method


Сохраняет изображение PNG/JPEG/TIFF/BMP/GIF/EMF из входного потока в [EPS](../../) поток вывода.

```cpp
static void Aspose::Page::EPS::PsDocument::SaveImageAsEps(System::SharedPtr<System::IO::Stream> imageStream, System::SharedPtr<System::IO::Stream> epsStream, System::SharedPtr<Device::PsSaveOptions> options)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| imageStream | System::SharedPtr\<System::IO::Stream\> | Входной поток изображения. |
| epsStream | System::SharedPtr\<System::IO::Stream\> | [EPS](../../) поток вывода. |
| параметры | System::SharedPtr\<Device::PsSaveOptions\> | Содержит параметры, указывающие вывод ошибок, возникших во время преобразования. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::SaveImageAsEps(System::String, System::String, System::SharedPtr\<Device::PsSaveOptions\>) method


Сохраняет изображение PNG/JPEG/TIFF/BMP/GIF/EMF из файла в файл [EPS](../../).

```cpp
static void Aspose::Page::EPS::PsDocument::SaveImageAsEps(System::String imageFilePath, System::String epsFilePath, System::SharedPtr<Device::PsSaveOptions> options)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| imageFilePath | System::String | Путь к файлу изображения. |
| epsFilePath | System::String | Путь к файлу [EPS](../../). |
| параметры | System::SharedPtr\<Device::PsSaveOptions\> | Содержит параметры, указывающие вывод ошибок, возникших во время преобразования. |

## См. также

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
