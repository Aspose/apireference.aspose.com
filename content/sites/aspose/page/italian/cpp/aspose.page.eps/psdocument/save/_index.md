---
title: "Aspose::Page::EPS::PsDocument::Save metodo"
linktitle: "Save"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::EPS::PsDocument::Save metodo. Salva il PsDocument fornito come file PS o EPS. Questo metodo è usato solo quando il PsDocument è stato creato da zero in C++."
type: docs
weight: 4200
url: /it/cpp/aspose.page.eps/psdocument/save/
---
## PsDocument::Save() method


Salva il [PsDocument](../) fornito come file PS o [EPS](../../). Questo metodo è usato solo quando il [PsDocument](../) è stato creato da zero.

```cpp
void Aspose::Page::EPS::PsDocument::Save()
```

## Vedi anche

* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::Save(System::SharedPtr\<System::IO::Stream\>) method


Salva il [PsDocument](../) fornito nello stream. Questo metodo è usato solo dopo l'aggiornamento dei metadati [XMP](../../../aspose.page.eps.xmp/). Salva il file [EPS](../../) iniziale con i metadati esistenti aggiornati o con uno nuovo creato durante la chiamata al metodo GetMetadata. Nell'ultimo caso vengono aggiunti tutto il codice PostScript necessario e i commenti [EPS](../../).

```cpp
void Aspose::Page::EPS::PsDocument::Save(System::SharedPtr<System::IO::Stream> epsStream)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | Stream del file [EPS](../../) di output. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::Save(System::String) method


Salva il [PsDocument](../) fornito come file [EPS](../../). Questo metodo è usato solo dopo l'aggiornamento dei metadati [XMP](../../../aspose.page.eps.xmp/). Salva il file [EPS](../../) iniziale con i metadati esistenti aggiornati o con uno nuovo creato durante la chiamata al metodo GetMetadata. Nell'ultimo caso vengono aggiunti tutto il codice PostScript necessario e i commenti [EPS](../../).

```cpp
void Aspose::Page::EPS::PsDocument::Save(System::String outEpsFilePath)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| outEpsFilePath | System::String | Un percorso di file [EPS](../../) di output. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
