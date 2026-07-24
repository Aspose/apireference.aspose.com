---
title: "Aspose::Page::EPS::PsDocument::ResizeEps method"
linktitle: "ResizeEps"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::EPS::PsDocument::ResizeEps method. Ändert die Größe des angegebenen PsDocument als EPS‑Datei. Diese Methode wird nur nach dem Extrahieren der EPS‑Größe verwendet. Sie speichert die ursprüngliche EPS‑Datei mit aktualisierter vorhandener %BoundingBox oder erstellt eine neue. Die Seiten‑Transformationsmatrix wird ebenfalls in C++ gesetzt."
type: docs
weight: 4000
url: /de/cpp/aspose.page.eps/psdocument/resizeeps/
---
## PsDocument::ResizeEps(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) method


Ändert die Größe des angegebenen [PsDocument](../) als [EPS](../../)-Datei. Diese Methode wird nur nach dem Extrahieren der [EPS](../../)-Größe verwendet. Sie speichert die ursprüngliche [EPS](../../) filD:\ASPOSE.GIT\aspose.pdf.cpp\cs_porter_produce\Aspose.Page.Cpp.Page.Cpp\eps\src_eps\PsDocument.hThe output directory where image file will be saved.e mit aktualisiertem vorhandenem %BoundingBox oder es wird ein neues erstellt. Die Transformationsmatrix von [Page](../../../aspose.page/) wird ebenfalls gesetzt.

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::SharedPtr<System::IO::Stream> epsStream, System::Drawing::SizeF newSizeInUnits, Units units)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | Stream der Ausgabedatei [EPS](../../). |
| newSizeInUnits | System::Drawing::SizeF | Neue Größe des [EPS](../../)-Bildes in zugewiesenen Einheiten. |
| Einheiten | Einheiten | Die Einheiten der neuen Größe. Können Punkte, Zoll, Millimeter, Zentimeter und Prozentsätze der ursprünglichen Größe sein. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::ResizeEps(System::String, System::Drawing::SizeF, Units) method


Ändert die Größe des angegebenen [PsDocument](../) als [EPS](../../)-Datei. Diese Methode wird nur nach dem Extrahieren der [EPS](../../)-Größe verwendet. Sie speichert die ursprüngliche [EPS](../../) filD:\ASPOSE.GIT\aspose.pdf.cpp\cs_porter_produce\Aspose.Page.Cpp.Page.Cpp\eps\src_eps\PsDocument.hThe output directory where image file will be saved.e mit aktualisiertem vorhandenem %BoundingBox oder es wird ein neues erstellt. Die Transformationsmatrix von [Page](../../../aspose.page/) wird ebenfalls gesetzt.

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::String outEpsFilePath, System::Drawing::SizeF newSizeInUnits, Units units)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| outEpsFilePath | System::String | Der Ausgabepfad der [EPS](../../)-Datei. |
| newSizeInUnits | System::Drawing::SizeF | Neue Größe des [EPS](../../)-Bildes in zugewiesenen Einheiten. |
| Einheiten | Einheiten | Die Einheiten der neuen Größe. Können Punkte, Zoll, Millimeter, Zentimeter und Prozentsätze der ursprünglichen Größe sein. |

## Siehe auch

* Class [String](../../../system/string/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
