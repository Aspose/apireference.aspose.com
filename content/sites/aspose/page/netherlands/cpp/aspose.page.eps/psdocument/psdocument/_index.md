---
title: "Aspose::Page::EPS::PsDocument::PsDocument constructor"
linktitle: "PsDocument"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::EPS::PsDocument::PsDocument constructor. Initialiseert een lege PsDocument. Deze constructor wordt alleen gebruikt voor extra bewerkingen die niet gerelateerd zijn aan PostScript-bestanden, bijvoorbeeld het converteren van lettertypen in C++."
type: docs
weight: 100
url: /nl/cpp/aspose.page.eps/psdocument/psdocument/
---
## PsDocument::PsDocument() constructor


Initialiseert een lege [PsDocument](../). Deze constructor wordt alleen gebruikt voor extra bewerkingen die niet gerelateerd zijn aan PostScript-bestanden, bijvoorbeeld het converteren van lettertypen.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument()
```

## Zie ook

* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>) constructor


Initialiseert [PsDocument](../) met een stroom van een PS/EPS-bestand.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> inPsStream)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| inPsStream | System::SharedPtr\<System::IO::Stream\> | Invoerstroom van PS/EPS-bestand. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) constructor


Initialiseert een lege [PsDocument](../) met een geïnitialiseerde pagina.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | Stroom waarin het PS/EPS-bestand wordt opgeslagen. |
| opties | System::SharedPtr\<Device::PsSaveOptions\> | Een set parameters die het opslaan van een PostScript-bestand regelen. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


Initialiseert een lege [PsDocument](../).

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | Stroom waarin het PS/EPS-bestand wordt opgeslagen. |
| opties | System::SharedPtr\<Device::PsSaveOptions\> | Een set parameters die het opslaan van een PostScript-bestand regelen. |
| meerdere pagina's | bool | Als false wordt, wordt de pagina niet geïnitialiseerd. In dit geval moet de paginainitialisatie worden uitgevoerd via een expliciete "openPage(width, height)"‑aanroep. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


Initialiseert een lege [PsDocument](../) wanneer het aantal [Postscript](../../../aspose.page.eps.postscript/) documentpagina's van tevoren bekend is.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | Stroom waarin het PS/EPS-bestand wordt opgeslagen. |
| opties | System::SharedPtr\<Device::PsSaveOptions\> | Een set parameters die het opslaan van een PostScript-bestand regelen. |
| numberOfPages | int32_t | Het aantal pagina's in het PostScript‑document. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>) constructor


Initialiseert een lege [PsDocument](../) met een geïnitialiseerde pagina.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| outPsFilePath | System::String | Het uitvoer‑PS/EPS‑bestandspad. |
| opties | System::SharedPtr\<Device::PsSaveOptions\> | Een set parameters die het opslaan van een PostScript-bestand regelen. |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


Initialiseert een lege [PsDocument](../).

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| outPsFilePath | System::String | Het uitvoer‑PS/EPS‑bestandspad. |
| opties | System::SharedPtr\<Device::PsSaveOptions\> | Een set parameters die het opslaan van een PostScript-bestand regelen. |
| meerdere pagina's | bool | Als false wordt, wordt de pagina niet geïnitialiseerd. In dit geval moet de paginainitialisatie worden uitgevoerd via een expliciete "openPage(width, height)"‑aanroep. |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


Initialiseert een lege [PsDocument](../) wanneer het aantal [Postscript](../../../aspose.page.eps.postscript/) documentpagina's van tevoren bekend is.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| outPsFilePath | System::String | Het uitvoer‑PS/EPS‑bestandspad. |
| opties | System::SharedPtr\<Device::PsSaveOptions\> | Een set parameters die het opslaan van een PostScript-bestand regelen. |
| numberOfPages | int32_t | Het aantal pagina's in het PostScript‑document. |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String) constructor


Initialiseert [PsDocument](../) met een invoer‑PS/EPS‑bestand.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String psFilePath)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| psFilePath | System::String | PS/EPS‑bestandspad. |

## Zie ook

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
