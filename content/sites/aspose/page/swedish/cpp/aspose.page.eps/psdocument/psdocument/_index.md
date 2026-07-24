---
title: "Aspose::Page::EPS::PsDocument::PsDocument constructor"
linktitle: "PsDocument"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::EPS::PsDocument::PsDocument constructor. Initierar ett tomt PsDocument. Denna konstruktor används endast för ytterligare operationer som inte är relaterade till PostScript-filer, till exempel konvertering av teckensnitt i C++."
type: docs
weight: 100
url: /sv/cpp/aspose.page.eps/psdocument/psdocument/
---
## PsDocument::PsDocument() constructor


Initierar ett tomt [PsDocument](../). Denna konstruktor används endast för ytterligare operationer som inte är relaterade till PostScript-filer, till exempel konvertering av teckensnitt.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument()
```

## Se även

* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>) constructor


Initierar [PsDocument](../) med en ström av PS/EPS-fil.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> inPsStream)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| inPsStream | System::SharedPtr\<System::IO::Stream\> | Indataström för PS/EPS-fil. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) constructor


Initierar ett tomt [PsDocument](../) med en initierad sida.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | Ström där PS/EPS-filen ska sparas. |
| alternativ | System::SharedPtr\<Device::PsSaveOptions\> | En uppsättning parametrar som styr sparandet av PostScript-filen. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


Initierar ett tomt [PsDocument](../).

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | Ström där PS/EPS-filen ska sparas. |
| alternativ | System::SharedPtr\<Device::PsSaveOptions\> | En uppsättning parametrar som styr sparandet av PostScript-filen. |
| flersidig | bool | Om falskt kommer sidan inte att initieras. I detta fall bör sidinitiering utföras via ett explicit \"openPage(width, height)\"-anrop. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


Initierar ett tomt [PsDocument](../) när antalet [Postscript](../../../aspose.page.eps.postscript/) dokumentsidor är känt i förväg.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | Ström där PS/EPS-filen ska sparas. |
| alternativ | System::SharedPtr\<Device::PsSaveOptions\> | En uppsättning parametrar som styr sparandet av PostScript-filen. |
| numberOfPages | int32_t | Antalet sidor i PostScript-dokumentet. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>) constructor


Initierar ett tomt [PsDocument](../) med en initierad sida.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| outPsFilePath | System::String | Sökvägen för utdata PS/EPS-filen. |
| alternativ | System::SharedPtr\<Device::PsSaveOptions\> | En uppsättning parametrar som styr sparandet av PostScript-filen. |

## Se även

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


Initierar ett tomt [PsDocument](../).

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| outPsFilePath | System::String | Sökvägen för utdata PS/EPS-filen. |
| alternativ | System::SharedPtr\<Device::PsSaveOptions\> | En uppsättning parametrar som styr sparandet av PostScript-filen. |
| flersidig | bool | Om falskt kommer sidan inte att initieras. I detta fall bör sidinitiering utföras via ett explicit \"openPage(width, height)\"-anrop. |

## Se även

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


Initierar ett tomt [PsDocument](../) när antalet [Postscript](../../../aspose.page.eps.postscript/) dokumentsidor är känt i förväg.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| outPsFilePath | System::String | Sökvägen för utdata PS/EPS-filen. |
| alternativ | System::SharedPtr\<Device::PsSaveOptions\> | En uppsättning parametrar som styr sparandet av PostScript-filen. |
| numberOfPages | int32_t | Antalet sidor i PostScript-dokumentet. |

## Se även

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String) constructor


Initierar [PsDocument](../) med en inmatningsfil för PS/EPS.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String psFilePath)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| psFilePath | System::String | Sökväg till PS/EPS-fil. |

## Se även

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
