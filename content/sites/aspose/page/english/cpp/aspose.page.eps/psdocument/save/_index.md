---
title: Aspose::Page::EPS::PsDocument::Save method
linktitle: Save
second_title: Aspose.Page for C++
description: 'Aspose::Page::EPS::PsDocument::Save method. Saves given PsDocument as EPS file. This method is used only when PsDocument was created from scratch in C++.'
type: docs
weight: 4200
url: /cpp/aspose.page.eps/psdocument/save/
---
## PsDocument::Save() method


Saves given [PsDocument](../) as [EPS](../../) file. This method is used only when [PsDocument](../) was created from scratch.

```cpp
void Aspose::Page::EPS::PsDocument::Save()
```

## See Also

* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::Save(System::SharedPtr\<System::IO::Stream\>) method


Saves given [PsDocument](../) as [EPS](../../) file. This method is used only after updating [XMP](../../../aspose.page.eps.xmp/) metadata. It saves initial [EPS](../../) file with updated existing metadata or new one created while calling GetMetadata method. In the last case all necessary PostScript code and [EPS](../../) comments are added.

```cpp
void Aspose::Page::EPS::PsDocument::Save(System::SharedPtr<System::IO::Stream> epsStream)
```


| Parameter | Type | Description |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | Stream of output [EPS](../../) file. |

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
