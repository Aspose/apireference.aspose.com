---
title: "Aspose::Page::EPS::PsDocument::ClipAndNewPath method"
linktitle: "ClipAndNewPath"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::EPS::PsDocument::ClipAndNewPath method. Добавляет обрезку к текущему графическому состоянию и затем записывает оператор \\\"newpath\\\". Это необходимо для избежания слияния этого пути обрезки с некоторыми последующими путями, такими как глифы, очерченные оператором \\\"charpath\\\" в C++."
type: docs
weight: 300
url: /ru/cpp/aspose.page.eps/psdocument/clipandnewpath/
---
## PsDocument::ClipAndNewPath method


Добавляет обрезку к текущему графическому состоянию и затем записывает оператор "newpath". Это необходимо сделать, чтобы избежать слияния этого пути обрезки с некоторыми последующими путями, такими как глифы, очерченные оператором "charpath".

```cpp
void Aspose::Page::EPS::PsDocument::ClipAndNewPath(System::SharedPtr<System::Drawing::Drawing2D::GraphicsPath> s)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| s | System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\> | Путь обрезки. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GraphicsPath](../../../system.drawing.drawing2d/graphicspath/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
