---
title: "Aspose::Page::EPS::PsDocument::PsDocument constructeur"
linktitle: "PsDocument"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::EPS::PsDocument::PsDocument constructeur. Initialise un PsDocument vide. Ce constructeur n'est utilisé que pour des opérations supplémentaires qui ne sont pas liées aux fichiers PostScript, par exemple, la conversion de polices en C++."
type: docs
weight: 100
url: /fr/cpp/aspose.page.eps/psdocument/psdocument/
---
## PsDocument::PsDocument() constructor


Initialise un [PsDocument](../) vide. Ce constructeur n'est utilisé que pour des opérations supplémentaires qui ne sont pas liées aux fichiers PostScript, par exemple, la conversion de polices.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument()
```

## Voir aussi

* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>) constructor


Initialise le [PsDocument](../) avec un flux de fichier PS/EPS.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> inPsStream)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| inPsStream | System::SharedPtr\<System::IO::Stream\> | Flux d'entrée du fichier PS/EPS. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) constructor


Initialise un [PsDocument](../) vide avec une page initialisée.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | Flux où enregistrer le fichier PS/EPS. |
| options | System::SharedPtr\<Device::PsSaveOptions\> | Un ensemble de paramètres contrôlant la sauvegarde du fichier PostScript. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


Initialise un [PsDocument](../) vide.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | Flux où enregistrer le fichier PS/EPS. |
| options | System::SharedPtr\<Device::PsSaveOptions\> | Un ensemble de paramètres contrôlant la sauvegarde du fichier PostScript. |
| multipage | bool | Si false, la page ne sera pas initialisée. Dans ce cas, l'initialisation de la page doit être effectuée via l'appel explicite \"openPage(width, height)\". |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


Initialise un [PsDocument](../) vide lorsque le nombre de pages du document [Postscript](../../../aspose.page.eps.postscript/) est connu à l'avance.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | Flux où enregistrer le fichier PS/EPS. |
| options | System::SharedPtr\<Device::PsSaveOptions\> | Un ensemble de paramètres contrôlant la sauvegarde du fichier PostScript. |
| numberOfPages | int32_t | Le nombre de pages du document PostScript. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>) constructor


Initialise un [PsDocument](../) vide avec une page initialisée.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| outPsFilePath | System::String | Le chemin du fichier PS/EPS de sortie. |
| options | System::SharedPtr\<Device::PsSaveOptions\> | Un ensemble de paramètres contrôlant la sauvegarde du fichier PostScript. |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


Initialise un [PsDocument](../) vide.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| outPsFilePath | System::String | Le chemin du fichier PS/EPS de sortie. |
| options | System::SharedPtr\<Device::PsSaveOptions\> | Un ensemble de paramètres contrôlant la sauvegarde du fichier PostScript. |
| multipage | bool | Si false, la page ne sera pas initialisée. Dans ce cas, l'initialisation de la page doit être effectuée via l'appel explicite \"openPage(width, height)\". |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


Initialise un [PsDocument](../) vide lorsque le nombre de pages du document [Postscript](../../../aspose.page.eps.postscript/) est connu à l'avance.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| outPsFilePath | System::String | Le chemin du fichier PS/EPS de sortie. |
| options | System::SharedPtr\<Device::PsSaveOptions\> | Un ensemble de paramètres contrôlant la sauvegarde du fichier PostScript. |
| numberOfPages | int32_t | Le nombre de pages du document PostScript. |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String) constructor


Initialise le [PsDocument](../) avec un fichier PS/EPS d'entrée.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String psFilePath)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| psFilePath | System::String | Chemin du fichier PS/EPS. |

## Voir aussi

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
