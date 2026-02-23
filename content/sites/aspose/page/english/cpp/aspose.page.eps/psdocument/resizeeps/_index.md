---
title: Aspose::Page::EPS::PsDocument::ResizeEps method
linktitle: ResizeEps
second_title: Aspose.Page for C++
description: 'Aspose::Page::EPS::PsDocument::ResizeEps method. Resizes given PsDocument as EPS file. This method is used only after extracting EPS size. It saves initial EPS file with updated existing %BoundingBox or new one will be created. Page transformation matrix also will be set in C++.'
type: docs
weight: 4000
url: /cpp/aspose.page.eps/psdocument/resizeeps/
---
## PsDocument::ResizeEps(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) method


Resizes given [PsDocument](../) as [EPS](../../) file. This method is used only after extracting [EPS](../../) size. It saves initial [EPS](../../) file with updated existing %BoundingBox or new one will be created. [Page](../../../aspose.page/) transformation matrix also will be set.

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::SharedPtr<System::IO::Stream> epsStream, System::Drawing::SizeF newSizeInUnits, Units units)
```


| Parameter | Type | Description |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | Stream of output [EPS](../../) file. |
| newSizeInUnits | System::Drawing::SizeF | New size of [EPS](../../) image in assigned units. |
| units | Units | The units of the new size. Can be points, inches, millimeters, centimeters and percents of initial size. |

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::ResizeEps(System::String, System::Drawing::SizeF, Units) method


Resizes given [PsDocument](../) as [EPS](../../) file. This method is used only after extracting [EPS](../../) size. It saves initial [EPS](../../) filD:\ASPOSE.GIT\aspose.pdf.cpp\cs_porter_produce\Aspose.Page.Cpp.Page.Cpp\eps\src_eps\PsDocument.hThe output directory where image file will be saved.e with updated existing %BoundingBox or new one will be created. [Page](../../../aspose.page/) transformation matrix also will be set.

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::String outEpsFilePath, System::Drawing::SizeF newSizeInUnits, Units units)
```


| Parameter | Type | Description |
| --- | --- | --- |
| outEpsFilePath | System::String | The output [EPS](../../) file path. |
| newSizeInUnits | System::Drawing::SizeF | New size of [EPS](../../) image in assigned units. |
| units | Units | The units of the new size. Can be points, inches, millimeters, centimeters and percents of initial size. |

## See Also

* Class [String](../../../system/string/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
