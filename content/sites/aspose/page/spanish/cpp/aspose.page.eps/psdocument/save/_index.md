---
title: "Método Aspose::Page::EPS::PsDocument::Save"
linktitle: "Save"
second_title: "Aspose.Page para C++"
description: "Método Aspose::Page::EPS::PsDocument::Save. Guarda el PsDocument proporcionado como archivo PS o EPS. Este método se usa solo cuando el PsDocument fue creado desde cero en C++."
type: docs
weight: 4200
url: /es/cpp/aspose.page.eps/psdocument/save/
---
## PsDocument::Save() method


Guarda el [PsDocument](../) proporcionado como archivo PS o [EPS](../../). Este método se usa solo cuando el [PsDocument](../) fue creado desde cero.

```cpp
void Aspose::Page::EPS::PsDocument::Save()
```

## Ver también

* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::Save(System::SharedPtr\<System::IO::Stream\>) method


Guarda el [PsDocument](../) proporcionado en el flujo. Este método se usa solo después de actualizar los metadatos [XMP](../../../aspose.page.eps.xmp/). Guarda el archivo [EPS](../../) inicial con los metadatos existentes actualizados o con uno nuevo creado al llamar al método GetMetadata. En el último caso se añaden todo el código PostScript necesario y los comentarios [EPS](../../).

```cpp
void Aspose::Page::EPS::PsDocument::Save(System::SharedPtr<System::IO::Stream> epsStream)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | Flujo del archivo [EPS](../../) de salida. |

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::Save(System::String) method


Guarda el [PsDocument](../) proporcionado como archivo [EPS](../../). Este método se usa solo después de actualizar los metadatos [XMP](../../../aspose.page.eps.xmp/). Guarda el archivo [EPS](../../) inicial con los metadatos existentes actualizados o con uno nuevo creado al llamar al método GetMetadata. En el último caso se añaden todo el código PostScript necesario y los comentarios [EPS](../../).

```cpp
void Aspose::Page::EPS::PsDocument::Save(System::String outEpsFilePath)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| outEpsFilePath | System::String | Una ruta de archivo [EPS](../../) de salida. |

## Ver también

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
