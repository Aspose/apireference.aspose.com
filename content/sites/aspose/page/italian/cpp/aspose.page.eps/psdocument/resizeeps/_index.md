---
title: "Aspose::Page::EPS::PsDocument::ResizeEps metodo"
linktitle: "ResizeEps"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::EPS::PsDocument::ResizeEps metodo. Ridimensiona il PsDocument fornito come file EPS. Questo metodo è usato solo dopo aver estratto le dimensioni EPS. Salva il file EPS iniziale con il %BoundingBox esistente aggiornato oppure ne crea uno nuovo. La matrice di trasformazione della pagina verrà impostata anche in C++."
type: docs
weight: 4000
url: /it/cpp/aspose.page.eps/psdocument/resizeeps/
---
## PsDocument::ResizeEps(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) method


Ridimensiona il [PsDocument](../) fornito come file [EPS](../../). Questo metodo è usato solo dopo aver estratto le dimensioni del [EPS](../../). Salva il file [EPS](../../) con il %BoundingBox esistente aggiornato o ne verrà creato uno nuovo. Anche la matrice di trasformazione di [Page](../../../aspose.page/) verrà impostata.

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::SharedPtr<System::IO::Stream> epsStream, System::Drawing::SizeF newSizeInUnits, Units units)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | Stream del file [EPS](../../) di output. |
| newSizeInUnits | System::Drawing::SizeF | Nuova dimensione dell'immagine [EPS](../../) nelle unità assegnate. |
| unità | Unità | Le unità della nuova dimensione. Possono essere punti, pollici, millimetri, centimetri e percentuali della dimensione iniziale. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::ResizeEps(System::String, System::Drawing::SizeF, Units) method


Ridimensiona il [PsDocument](../) fornito come file [EPS](../../). Questo metodo è usato solo dopo aver estratto le dimensioni del [EPS](../../). Salva il file [EPS](../../) filD:\ASPOSE.GIT\aspose.pdf.cpp\cs_porter_produce\Aspose.Page.Cpp.Page.Cpp\eps\src_eps\PsDocument.hLa directory di output dove verrà salvato il file immagine.e con il %BoundingBox esistente aggiornato o ne verrà creato uno nuovo. Anche la matrice di trasformazione di [Page](../../../aspose.page/) verrà impostata.

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::String outEpsFilePath, System::Drawing::SizeF newSizeInUnits, Units units)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| outEpsFilePath | System::String | Il percorso del file [EPS](../../) di output. |
| newSizeInUnits | System::Drawing::SizeF | Nuova dimensione dell'immagine [EPS](../../) nelle unità assegnate. |
| unità | Unità | Le unità della nuova dimensione. Possono essere punti, pollici, millimetri, centimetri e percentuali della dimensione iniziale. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
