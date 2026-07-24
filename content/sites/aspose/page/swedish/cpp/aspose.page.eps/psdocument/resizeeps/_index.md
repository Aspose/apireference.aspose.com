---
title: "Aspose::Page::EPS::PsDocument::ResizeEps metod"
linktitle: "ResizeEps"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::EPS::PsDocument::ResizeEps metod. Ändrar storlek på angivet PsDocument som EPS-fil. Denna metod används endast efter att EPS-storleken har extraherats. Den sparar den ursprungliga EPS-filen med uppdaterad befintlig %BoundingBox eller en ny kommer att skapas. Sidans transformationsmatris kommer också att sättas i C++."
type: docs
weight: 4000
url: /sv/cpp/aspose.page.eps/psdocument/resizeeps/
---
## PsDocument::ResizeEps(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) method


Ändrar storlek på given [PsDocument](../) som [EPS](../../)-fil. Denna metod används endast efter att ha extraherat [EPS](../../)-storlek. Den sparar den ursprungliga [EPS](../../) filD:\\ASPOSE.GIT\\aspose.pdf.cpp\\cs_porter_produce\\Aspose.Page.Cpp.Page.Cpp\\eps\\src_eps\\PsDocument.hDen utdata katalog där bildfilen kommer att sparas.e med uppdaterad befintlig %BoundingBox eller en ny kommer att skapas. [Page](../../../aspose.page/) transformationsmatris kommer också att sättas.

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::SharedPtr<System::IO::Stream> epsStream, System::Drawing::SizeF newSizeInUnits, Units units)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | Ström för utdata [EPS](../../) fil. |
| newSizeInUnits | System::Drawing::SizeF | Ny storlek på [EPS](../../)-bilden i tilldelade enheter. |
| enheter | Enheter | Enheterna för den nya storleken. Kan vara punkter, tum, millimeter, centimeter och procent av den ursprungliga storleken. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::ResizeEps(System::String, System::Drawing::SizeF, Units) method


Ändrar storlek på given [PsDocument](../) som [EPS](../../)-fil. Denna metod används endast efter att ha extraherat [EPS](../../)-storlek. Den sparar den ursprungliga [EPS](../../) filD:\\ASPOSE.GIT\\aspose.pdf.cpp\\cs_porter_produce\\Aspose.Page.Cpp.Page.Cpp\\eps\\src_eps\\PsDocument.hDen utdata katalog där bildfilen kommer att sparas.e med uppdaterad befintlig %BoundingBox eller en ny kommer att skapas. [Page](../../../aspose.page/) transformationsmatris kommer också att sättas.

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::String outEpsFilePath, System::Drawing::SizeF newSizeInUnits, Units units)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| outEpsFilePath | System::String | Utdata [EPS](../../)-filens sökväg. |
| newSizeInUnits | System::Drawing::SizeF | Ny storlek på [EPS](../../)-bilden i tilldelade enheter. |
| enheter | Enheter | Enheterna för den nya storleken. Kan vara punkter, tum, millimeter, centimeter och procent av den ursprungliga storleken. |

## Se även

* Class [String](../../../system/string/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
