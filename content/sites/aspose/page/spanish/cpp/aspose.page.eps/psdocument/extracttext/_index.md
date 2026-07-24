---
title: "Aspose::Page::EPS::PsDocument::ExtractText método"
linktitle: "ExtractText"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::EPS::PsDocument::ExtractText método. Extrae texto de un archivo PS. El texto solo puede extraerse si está escrito con una fuente Type 42 (TrueType) o una fuente Type 0 con fuentes Type 42 en su Vector Map en C++."
type: docs
weight: 2300
url: /es/cpp/aspose.page.eps/psdocument/extracttext/
---
## PsDocument::ExtractText method


Extrae texto de un archivo PS. El texto solo puede extraerse si está escrito con la fuente Type 42 (**TrueType**) o con una fuente Type 0 que contenga fuentes Type 42 en su Mapa Vectorial.

```cpp
System::String Aspose::Page::EPS::PsDocument::ExtractText(System::SharedPtr<SaveOptions> options, int32_t startPage=0, int32_t endPage=0)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| opciones | System::SharedPtr\<SaveOptions\> | Las opciones de guardado. |
| startPage | int32_t | La página desde la cual comenzar a extraer texto. Este parámetro es útil para documentos multipágina. |
| endPage | int32_t | La página hasta la cual terminar de extraer texto. Este parámetro es útil para documentos multipágina. |

### ReturnValue

El texto extraído.

## Ver también

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [SaveOptions](../../../aspose.page/saveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
