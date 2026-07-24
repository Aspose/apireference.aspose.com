---
title: "Aspose::Page::EPS::PsDocument::CropEps metod"
linktitle: "CropEps"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::EPS::PsDocument::CropEps metod. Beskär angivet PsDocument som EPS‑fil. Den sparar den ursprungliga EPS‑filen med uppdaterad befintlig %BoundingBox eller skapar en ny i C++."
type: docs
weight: 900
url: /sv/cpp/aspose.page.eps/psdocument/cropeps/
---
## PsDocument::CropEps(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<float\>) method


Beskär angivet [PsDocument](../) som [EPS](../../)‑fil. Den sparar den ursprungliga [EPS](../../)‑filen med uppdaterad befintlig %BoundingBox eller skapar en ny.

```cpp
void Aspose::Page::EPS::PsDocument::CropEps(System::SharedPtr<System::IO::Stream> epsStream, System::ArrayPtr<float> cropBox)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | Ström för utdata [EPS](../../) fil. |
| cropBox | System::ArrayPtr\<float\> | Beskärningsrutan (x0, y0, x, y). |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::CropEps(System::String, System::ArrayPtr\<float\>) method


Beskär angivet [PsDocument](../) som [EPS](../../)‑fil. Den sparar den ursprungliga [EPS](../../)‑filen med uppdaterad befintlig %BoundingBox eller skapar en ny.

```cpp
void Aspose::Page::EPS::PsDocument::CropEps(System::String outEpsFilePath, System::ArrayPtr<float> cropBox)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| outEpsFilePath | System::String | Utdata [EPS](../../)-filens sökväg. |
| cropBox | System::ArrayPtr\<float\> | Beskärningsrutan (x0, y0, x, y). |

## Se även

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
