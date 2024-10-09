---
title: Aspose::Page::EPS::PsDocument::CropEps method
linktitle: CropEps
second_title: Aspose.Page for C++
description: 'Aspose::Page::EPS::PsDocument::CropEps method. Crops given PsDocument as EPS file. It saves initial EPS file with updated existing %BoundingBox or new one will be created in C++.'
type: docs
weight: 700
url: /cpp/aspose.page.eps/psdocument/cropeps/
---
## PsDocument::CropEps(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<float\>) method


Crops given [PsDocument](../) as [EPS](../../) file. It saves initial [EPS](../../) file with updated existing %BoundingBox or new one will be created.

```cpp
void Aspose::Page::EPS::PsDocument::CropEps(System::SharedPtr<System::IO::Stream> epsStream, System::ArrayPtr<float> cropBox)
```


| Parameter | Type | Description |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | Stream of output [EPS](../../) file. |
| cropBox | System::ArrayPtr\<float\> | The crop box (x0, y0, x, y). |

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::CropEps(System::String, System::ArrayPtr\<float\>) method


Crops given [PsDocument](../) as [EPS](../../) file. It saves initial [EPS](../../) file with updated existing %BoundingBox or new one will be created.

```cpp
void Aspose::Page::EPS::PsDocument::CropEps(System::String outEpsFilePath, System::ArrayPtr<float> cropBox)
```


| Parameter | Type | Description |
| --- | --- | --- |
| outEpsFilePath | System::String | The output [EPS](../../) file path. |
| cropBox | System::ArrayPtr\<float\> | The crop box (x0, y0, x, y). |

## See Also

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
