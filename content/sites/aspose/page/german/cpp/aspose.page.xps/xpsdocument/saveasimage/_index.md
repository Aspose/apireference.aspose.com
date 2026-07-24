---
title: "Aspose::Page::XPS::XpsDocument::SaveAsImage-Methode"
linktitle: "SaveAsImage"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsDocument::SaveAsImage-Methode. Speichert das Dokument in eine Bilddatei. Das Ausgabeverzeichnis und der Dateiname entsprechen denen der Eingabe‑XPS‑Datei. Die Dateierweiterung entspricht dem Bildformat im Parameter \"options\". Wenn das Dokument mit einem Stream initialisiert wurde, der kein FileStream ist, wird die Bilddatei im aktuellen Ordner mit einer Standard‑Dateinamen‑Vorlage in C++ gespeichert."
type: docs
weight: 5500
url: /de/cpp/aspose.page.xps/xpsdocument/saveasimage/
---
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) method


Speichert das Dokument als Bilddatei. Das Ausgabeverzeichnis und der Dateiname entsprechen denen der Eingabe-[XPS](../../)-Datei. Die Dateierweiterung entspricht dem Bildformat im Parameter "options". Wenn das Dokument mit einem Stream initialisiert wurde, der kein FileStream ist, wird die Bilddatei im aktuellen Ordner mit einer Standard-Dateinamenvorlage gespeichert.

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Optionen | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | Optionen zum Speichern des Dokuments im Bitmap-Bildformat. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>, System::String, System::String) method


Speichert das Dokument in eine Bilddatei im angegebenen Verzeichnis mit dem angegebenen Dateinamen. Die Dateierweiterung entspricht dem Bildformat im Parameter "options".

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options, System::String outDir, System::String fileNameTemplate)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Optionen | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | Optionen zum Speichern des Dokuments im Bitmap-Bildformat. |
| outDir | System::String | Das Ausgabeverzeichnis, in dem die Bilddatei gespeichert wird. |
| fileNameTemplate | System::String | Die Dateinamenvorlage für das Bild (ohne Erweiterung). Wenn die Eingabe-[XPS](../../)-Datei einseitig ist, entspricht sie exakt dem Dateinamen, andernfalls "_[n]", wobei "n" die Seitennummer beginnend bei 0 ist, wird ein Suffix an diese angehängt. Die Dateierweiterung entspricht dem Bildformat im Parameter "option". |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
