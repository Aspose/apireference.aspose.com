---
title: "Aspose::Page::EPS::PsDocument::ResizeEps метод"
linktitle: "ResizeEps"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::EPS::PsDocument::ResizeEps метод. Изменяет размер заданного PsDocument как EPS‑файла. Этот метод используется только после извлечения размера EPS. Он сохраняет исходный EPS‑файл с обновлённым существующим %BoundingBox или создаёт новый. Матрица преобразования страницы также будет установлена в C++."
type: docs
weight: 4000
url: /ru/cpp/aspose.page.eps/psdocument/resizeeps/
---
## PsDocument::ResizeEps(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) method


Преобразует заданный [PsDocument](../) в файл [EPS](../../). Этот метод используется только после извлечения размера [EPS](../../). Он сохраняет исходный файл [EPS](../../) с обновлённым существующим %BoundingBox или будет создан новый. Также будет установлена матрица преобразования [Page](../../../aspose.page/).

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::SharedPtr<System::IO::Stream> epsStream, System::Drawing::SizeF newSizeInUnits, Units units)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | Поток выходного файла [EPS](../../). |
| newSizeInUnits | System::Drawing::SizeF | Новый размер изображения [EPS](../../) в заданных единицах. |
| единицы | Единицы | Единицы нового размера. Могут быть точки, дюймы, миллиметры, сантиметры и проценты от исходного размера. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::ResizeEps(System::String, System::Drawing::SizeF, Units) method


Преобразует заданный [PsDocument](../) в файл [EPS](../../). Этот метод используется только после извлечения размера [EPS](../../). Он сохраняет исходный файл [EPS](../../) filD:\\ASPOSE.GIT\\aspose.pdf.cpp\\cs_porter_produce\\Aspose.Page.Cpp.Page.Cpp\\eps\\src_eps\\PsDocument.hThe output directory where image file will be saved.e с обновлённым существующим %BoundingBox или создаёт новый. Также будет установлена матрица преобразования [Page](../../../aspose.page/).

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::String outEpsFilePath, System::Drawing::SizeF newSizeInUnits, Units units)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| outEpsFilePath | System::String | Путь к выходному файлу [EPS](../../). |
| newSizeInUnits | System::Drawing::SizeF | Новый размер изображения [EPS](../../) в заданных единицах. |
| единицы | Единицы | Единицы нового размера. Могут быть точки, дюймы, миллиметры, сантиметры и проценты от исходного размера. |

## См. также

* Class [String](../../../system/string/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
