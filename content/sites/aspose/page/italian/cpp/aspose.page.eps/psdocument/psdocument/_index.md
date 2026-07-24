---
title: "Aspose::Page::EPS::PsDocument::PsDocument costruttore"
linktitle: "PsDocument"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::EPS::PsDocument::PsDocument costruttore. Inizializza un PsDocument vuoto. Questo costruttore è usato solo per operazioni aggiuntive che non sono correlate ai file PostScript, per esempio, la conversione dei font in C++."
type: docs
weight: 100
url: /it/cpp/aspose.page.eps/psdocument/psdocument/
---
## PsDocument::PsDocument() constructor


Inizializza un [PsDocument](../) vuoto. Questo costruttore è usato solo per operazioni aggiuntive che non sono correlate ai file PostScript, per esempio, la conversione dei font.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument()
```

## Vedi anche

* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>) constructor


Inizializza [PsDocument](../) con un flusso di file PS/EPS.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> inPsStream)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| inPsStream | System::SharedPtr\<System::IO::Stream\> | Stream di input del file PS/EPS. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) constructor


Inizializza un [PsDocument](../) vuoto con una pagina inizializzata.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | Flusso dove salvare il file PS/EPS. |
| options | System::SharedPtr\<Device::PsSaveOptions\> | Un insieme di parametri che controllano il salvataggio del file PostScript. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


Inizializza un [PsDocument](../) vuoto.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | Flusso dove salvare il file PS/EPS. |
| options | System::SharedPtr\<Device::PsSaveOptions\> | Un insieme di parametri che controllano il salvataggio del file PostScript. |
| multipagina | bool | Se false la pagina non verrà inizializzata. In questo caso l'inizializzazione della pagina deve essere eseguita tramite una chiamata esplicita \"openPage(width, height)\". |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


Inizializza un [PsDocument](../) vuoto quando il numero di pagine del documento [Postscript](../../../aspose.page.eps.postscript/) è noto in anticipo.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | Flusso dove salvare il file PS/EPS. |
| options | System::SharedPtr\<Device::PsSaveOptions\> | Un insieme di parametri che controllano il salvataggio del file PostScript. |
| numberOfPages | int32_t | Il numero di pagine nel documento PostScript. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>) constructor


Inizializza un [PsDocument](../) vuoto con una pagina inizializzata.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| outPsFilePath | System::String | Il percorso del file PS/EPS di output. |
| options | System::SharedPtr\<Device::PsSaveOptions\> | Un insieme di parametri che controllano il salvataggio del file PostScript. |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


Inizializza un [PsDocument](../) vuoto.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| outPsFilePath | System::String | Il percorso del file PS/EPS di output. |
| options | System::SharedPtr\<Device::PsSaveOptions\> | Un insieme di parametri che controllano il salvataggio del file PostScript. |
| multipagina | bool | Se false la pagina non verrà inizializzata. In questo caso l'inizializzazione della pagina deve essere eseguita tramite una chiamata esplicita \"openPage(width, height)\". |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


Inizializza un [PsDocument](../) vuoto quando il numero di pagine del documento [Postscript](../../../aspose.page.eps.postscript/) è noto in anticipo.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| outPsFilePath | System::String | Il percorso del file PS/EPS di output. |
| options | System::SharedPtr\<Device::PsSaveOptions\> | Un insieme di parametri che controllano il salvataggio del file PostScript. |
| numberOfPages | int32_t | Il numero di pagine nel documento PostScript. |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String) constructor


Inizializza [PsDocument](../) con un file PS/EPS di input.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String psFilePath)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| psFilePath | System::String | Percorso del file PS/EPS. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
