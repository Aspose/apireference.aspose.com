---
title: "Aspose::Page::EPS::PsDocument::Save metod"
linktitle: "Save"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::EPS::PsDocument::Save metod. Sparar angivet PsDocument som PS- eller EPS-fil. Denna metod används endast när PsDocument skapades från början i C++."
type: docs
weight: 4200
url: /sv/cpp/aspose.page.eps/psdocument/save/
---
## PsDocument::Save() method


Sparar angivet [PsDocument](../) som PS- eller [EPS](../../) fil. Denna metod används endast när [PsDocument](../) skapades från början.

```cpp
void Aspose::Page::EPS::PsDocument::Save()
```

## Se även

* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::Save(System::SharedPtr\<System::IO::Stream\>) method


Sparar angivet [PsDocument](../) till strömmen. Denna metod används endast efter att ha uppdaterat [XMP](../../../aspose.page.eps.xmp/) metadata. Den sparar den ursprungliga [EPS](../../) filen med uppdaterad befintlig metadata eller en ny som skapats vid anrop av GetMetadata‑metoden. I det sista fallet läggs all nödvändig PostScript‑kod och [EPS](../../) kommentarer till.

```cpp
void Aspose::Page::EPS::PsDocument::Save(System::SharedPtr<System::IO::Stream> epsStream)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | Ström för utdata [EPS](../../) fil. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::Save(System::String) method


Sparar angivet [PsDocument](../) som [EPS](../../) fil. Denna metod används endast efter att ha uppdaterat [XMP](../../../aspose.page.eps.xmp/) metadata. Den sparar den ursprungliga [EPS](../../) filen med uppdaterad befintlig metadata eller en ny som skapats vid anrop av GetMetadata‑metoden. I det sista fallet läggs all nödvändig PostScript‑kod och [EPS](../../) kommentarer till.

```cpp
void Aspose::Page::EPS::PsDocument::Save(System::String outEpsFilePath)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| outEpsFilePath | System::String | En utdata [EPS](../../) filsökväg. |

## Se även

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
