---
title: "Aspose::Page::EPS::PsDocument::CropEps метод"
linktitle: "CropEps"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::EPS::PsDocument::CropEps метод. Обрезает заданный PsDocument как EPS‑файл. Он сохраняет исходный EPS‑файл с обновлённым существующим %BoundingBox или создаёт новый в C++."
type: docs
weight: 900
url: /ru/cpp/aspose.page.eps/psdocument/cropeps/
---
## PsDocument::CropEps(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<float\>) method


Обрезает заданный [PsDocument](../) как файл [EPS](../../). Он сохраняет исходный файл [EPS](../../) с обновлённым существующим %BoundingBox или создаёт новый.

```cpp
void Aspose::Page::EPS::PsDocument::CropEps(System::SharedPtr<System::IO::Stream> epsStream, System::ArrayPtr<float> cropBox)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | Поток выходного файла [EPS](../../). |
| cropBox | System::ArrayPtr\<float\> | Окно обрезки (x0, y0, x, y). |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::CropEps(System::String, System::ArrayPtr\<float\>) method


Обрезает заданный [PsDocument](../) как файл [EPS](../../). Он сохраняет исходный файл [EPS](../../) с обновлённым существующим %BoundingBox или создаёт новый.

```cpp
void Aspose::Page::EPS::PsDocument::CropEps(System::String outEpsFilePath, System::ArrayPtr<float> cropBox)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| outEpsFilePath | System::String | Путь к выходному файлу [EPS](../../). |
| cropBox | System::ArrayPtr\<float\> | Окно обрезки (x0, y0, x, y). |

## См. также

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
