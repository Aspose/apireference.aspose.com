---
title: "Aspose::Page::EPS::PsDocument::CropEps Methode"
linktitle: "CropEps"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::EPS::PsDocument::CropEps Methode. Schneidet das angegebene PsDocument als EPS‑Datei zu. Sie speichert die ursprüngliche EPS‑Datei mit aktualisiertem vorhandenem %BoundingBox oder erstellt ein neues in C++."
type: docs
weight: 900
url: /de/cpp/aspose.page.eps/psdocument/cropeps/
---
## PsDocument::CropEps(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<float\>) method


Schneidet das angegebene [PsDocument](../) als [EPS](../../)-Datei zu. Sie speichert die ursprüngliche [EPS](../../)-Datei mit aktualisiertem vorhandenem %BoundingBox oder erstellt ein neues.

```cpp
void Aspose::Page::EPS::PsDocument::CropEps(System::SharedPtr<System::IO::Stream> epsStream, System::ArrayPtr<float> cropBox)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | Stream der Ausgabedatei [EPS](../../). |
| cropBox | System::ArrayPtr\<float\> | Das Zuschneidefeld (x0, y0, x, y). |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::CropEps(System::String, System::ArrayPtr\<float\>) method


Schneidet das angegebene [PsDocument](../) als [EPS](../../)-Datei zu. Sie speichert die ursprüngliche [EPS](../../)-Datei mit aktualisiertem vorhandenem %BoundingBox oder erstellt ein neues.

```cpp
void Aspose::Page::EPS::PsDocument::CropEps(System::String outEpsFilePath, System::ArrayPtr<float> cropBox)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| outEpsFilePath | System::String | Der Ausgabepfad der [EPS](../../)-Datei. |
| cropBox | System::ArrayPtr\<float\> | Das Zuschneidefeld (x0, y0, x, y). |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
