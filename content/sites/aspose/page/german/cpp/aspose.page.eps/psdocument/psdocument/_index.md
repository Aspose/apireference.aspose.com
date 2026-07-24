---
title: "Aspose::Page::EPS::PsDocument::PsDocument Konstruktor"
linktitle: "PsDocument"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::EPS::PsDocument::PsDocument Konstruktor. Initialisiert ein leeres PsDocument. Dieser Konstruktor wird nur für zusätzliche Vorgänge verwendet, die nicht mit PostScript-Dateien zusammenhängen, zum Beispiel zum Konvertieren von Schriftarten in C++."
type: docs
weight: 100
url: /de/cpp/aspose.page.eps/psdocument/psdocument/
---
## PsDocument::PsDocument() constructor


Initialisiert ein leeres [PsDocument](../). Dieser Konstruktor wird nur für zusätzliche Vorgänge verwendet, die nicht mit PostScript-Dateien zusammenhängen, zum Beispiel zum Konvertieren von Schriftarten.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument()
```

## Siehe auch

* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>) constructor


Initialisiert [PsDocument](../) mit einem Stream einer PS/EPS-Datei.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> inPsStream)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| inPsStream | System::SharedPtr\<System::IO::Stream\> | Eingabestream einer PS/EPS-Datei. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) constructor


Initialisiert ein leeres [PsDocument](../) mit einer initialisierten Seite.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | Stream, in dem die PS/EPS-Datei gespeichert wird. |
| Optionen | System::SharedPtr\<Device::PsSaveOptions\> | Ein Satz von Parametern, die das Speichern von PostScript-Dateien steuern. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


Initialisiert ein leeres [PsDocument](../).

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | Stream, in dem die PS/EPS-Datei gespeichert wird. |
| Optionen | System::SharedPtr\<Device::PsSaveOptions\> | Ein Satz von Parametern, die das Speichern von PostScript-Dateien steuern. |
| mehrseitig | bool | Wenn false, wird die Seite nicht initialisiert. In diesem Fall sollte die Seitenerstellung über einen expliziten Aufruf von \"openPage(width, height)\" durchgeführt werden. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


Initialisiert ein leeres [PsDocument](../), wenn die Anzahl der [Postscript](../../../aspose.page.eps.postscript/) Dokumentseiten im Voraus bekannt ist.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | Stream, in dem die PS/EPS-Datei gespeichert wird. |
| Optionen | System::SharedPtr\<Device::PsSaveOptions\> | Ein Satz von Parametern, die das Speichern von PostScript-Dateien steuern. |
| numberOfPages | int32_t | Die Anzahl der Seiten im PostScript-Dokument. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>) constructor


Initialisiert ein leeres [PsDocument](../) mit einer initialisierten Seite.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| outPsFilePath | System::String | Der Ausgabepfad der PS/EPS-Datei. |
| Optionen | System::SharedPtr\<Device::PsSaveOptions\> | Ein Satz von Parametern, die das Speichern von PostScript-Dateien steuern. |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


Initialisiert ein leeres [PsDocument](../).

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| outPsFilePath | System::String | Der Ausgabepfad der PS/EPS-Datei. |
| Optionen | System::SharedPtr\<Device::PsSaveOptions\> | Ein Satz von Parametern, die das Speichern von PostScript-Dateien steuern. |
| mehrseitig | bool | Wenn false, wird die Seite nicht initialisiert. In diesem Fall sollte die Seitenerstellung über einen expliziten Aufruf von \"openPage(width, height)\" durchgeführt werden. |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


Initialisiert ein leeres [PsDocument](../), wenn die Anzahl der [Postscript](../../../aspose.page.eps.postscript/) Dokumentseiten im Voraus bekannt ist.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| outPsFilePath | System::String | Der Ausgabepfad der PS/EPS-Datei. |
| Optionen | System::SharedPtr\<Device::PsSaveOptions\> | Ein Satz von Parametern, die das Speichern von PostScript-Dateien steuern. |
| numberOfPages | int32_t | Die Anzahl der Seiten im PostScript-Dokument. |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String) constructor


Initialisiert [PsDocument](../) mit einer Eingabe‑PS/EPS‑Datei.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String psFilePath)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| psFilePath | System::String | PS/EPS-Dateipfad. |

## Siehe auch

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
