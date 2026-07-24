---
title: "Aspose::Page::EPS::PsDocument::Save-Methode"
linktitle: "Save"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::EPS::PsDocument::Save-Methode. Speichert das angegebene PsDocument als PS- oder EPS-Datei. Diese Methode wird nur verwendet, wenn das PsDocument in C++ von Grund auf neu erstellt wurde."
type: docs
weight: 4200
url: /de/cpp/aspose.page.eps/psdocument/save/
---
## PsDocument::Save() method


Speichert das angegebene [PsDocument](../) als PS- oder [EPS](../../)-Datei. Diese Methode wird nur verwendet, wenn das [PsDocument](../) von Grund auf neu erstellt wurde.

```cpp
void Aspose::Page::EPS::PsDocument::Save()
```

## Siehe auch

* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::Save(System::SharedPtr\<System::IO::Stream\>) method


Speichert das angegebene [PsDocument](../) in den Stream. Diese Methode wird nur nach dem Aktualisieren der [XMP](../../../aspose.page.eps.xmp/)-Metadaten verwendet. Sie speichert die ursprüngliche [EPS](../../)-Datei mit aktualisierten vorhandenen Metadaten oder einer neuen, die beim Aufruf der GetMetadata-Methode erstellt wurde. Im letzten Fall werden alle notwendigen PostScript‑Code und [EPS](../../)-Kommentare hinzugefügt.

```cpp
void Aspose::Page::EPS::PsDocument::Save(System::SharedPtr<System::IO::Stream> epsStream)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | Stream der Ausgabedatei [EPS](../../). |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::Save(System::String) method


Speichert das angegebene [PsDocument](../) als [EPS](../../)-Datei. Diese Methode wird nur nach dem Aktualisieren der [XMP](../../../aspose.page.eps.xmp/)-Metadaten verwendet. Sie speichert die ursprüngliche [EPS](../../)-Datei mit aktualisierten vorhandenen Metadaten oder einer neuen, die beim Aufruf der GetMetadata-Methode erstellt wurde. Im letzten Fall werden alle notwendigen PostScript‑Code und [EPS](../../)-Kommentare hinzugefügt.

```cpp
void Aspose::Page::EPS::PsDocument::Save(System::String outEpsFilePath)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| outEpsFilePath | System::String | Ein Pfad für die Ausgabedatei [EPS](../../). |

## Siehe auch

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
