---
title: "Aspose::Page::EPS::PsDocument::SaveAsImage Methode"
linktitle: "SaveAsImage"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::EPS::PsDocument::SaveAsImage Methode. Speichert PS/EPS-Datei in Bilddatei. Das Ausgabeverzeichnis und der Dateiname sind identisch mit denen der Eingabe‑PS‑Datei. Die Dateierweiterung entspricht dem Bildformat im Parameter \\\"options\\\". Wenn das Dokument mit einem Stream initialisiert wurde, der kein FileStream ist, wird die Bilddatei im aktuellen Ordner mit einer Standard‑Dateinamen‑Vorlage in C++ gespeichert."
type: docs
weight: 4300
url: /de/cpp/aspose.page.eps/psdocument/saveasimage/
---
## PsDocument::SaveAsImage(System::SharedPtr\<Device::ImageSaveOptions\>) method


Speichert die PS/EPS‑Datei als Bilddatei. Das Ausgabeverzeichnis und der Dateiname entsprechen denen der Eingabe‑PS‑Datei. Die Dateierweiterung entspricht dem Bildformat im Parameter "options". Wenn das Dokument mit einem Stream initialisiert wurde, der kein FileStream ist, wird die Bilddatei im aktuellen Ordner mit einer Standard‑Dateinamen‑Vorlage gespeichert.

```cpp
void Aspose::Page::EPS::PsDocument::SaveAsImage(System::SharedPtr<Device::ImageSaveOptions> options)
```

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.eps.device/imagesaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::SaveAsImage(System::SharedPtr\<Device::ImageSaveOptions\>, System::String, System::String) method


Speichert die PS/EPS‑Datei als Bilddatei im angegebenen Verzeichnis mit dem angegebenen Dateinamen. Die Dateierweiterung entspricht dem Bildformat im Parameter "options".

```cpp
void Aspose::Page::EPS::PsDocument::SaveAsImage(System::SharedPtr<Device::ImageSaveOptions> options, System::String outDir, System::String fileNameTemplate)
```

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.eps.device/imagesaveoptions/)
* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
