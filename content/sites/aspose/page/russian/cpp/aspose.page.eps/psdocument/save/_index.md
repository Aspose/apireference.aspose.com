---
title: "Aspose::Page::EPS::PsDocument::Save метод"
linktitle: "Save"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::EPS::PsDocument::Save метод. Сохраняет указанный PsDocument как файл PS или EPS. Этот метод используется только когда PsDocument был создан с нуля в C++."
type: docs
weight: 4200
url: /ru/cpp/aspose.page.eps/psdocument/save/
---
## PsDocument::Save() method


Сохраняет указанный [PsDocument](../) как файл PS или [EPS](../../). Этот метод используется только когда [PsDocument](../) был создан с нуля.

```cpp
void Aspose::Page::EPS::PsDocument::Save()
```

## См. также

* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::Save(System::SharedPtr\<System::IO::Stream\>) method


Сохраняет указанный [PsDocument](../) в поток. Этот метод используется только после обновления метаданных [XMP](../../../aspose.page.eps.xmp/). Он сохраняет исходный файл [EPS](../../) с обновлёнными существующими метаданными или с новым, созданным при вызове метода GetMetadata. В последнем случае добавляются все необходимые коды PostScript и комментарии [EPS](../../).

```cpp
void Aspose::Page::EPS::PsDocument::Save(System::SharedPtr<System::IO::Stream> epsStream)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | Поток выходного файла [EPS](../../). |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::Save(System::String) method


Сохраняет указанный [PsDocument](../) как файл [EPS](../../). Этот метод используется только после обновления метаданных [XMP](../../../aspose.page.eps.xmp/). Он сохраняет исходный файл [EPS](../../) с обновлёнными существующими метаданными или с новым, созданным при вызове метода GetMetadata. В последнем случае добавляются все необходимые коды PostScript и комментарии [EPS](../../).

```cpp
void Aspose::Page::EPS::PsDocument::Save(System::String outEpsFilePath)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| outEpsFilePath | System::String | Путь к выходному файлу [EPS](../../). |

## См. также

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
