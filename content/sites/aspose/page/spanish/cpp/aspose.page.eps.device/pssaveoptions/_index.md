---
title: "Clase Aspose::Page::EPS::Device::PsSaveOptions"
linktitle: "PsSaveOptions"
second_title: "Aspose.Page para C++"
description: "Clase Aspose::Page::EPS::Device::PsSaveOptions. Esta clase contiene las opciones necesarias para gestionar el proceso de conversión del documento a un archivo PostScript (PS) o Encapsulated PostScript (EPS) en C++."
type: docs
weight: 900
url: /es/cpp/aspose.page.eps.device/pssaveoptions/
---
## PsSaveOptions class


Esta clase contiene las opciones necesarias para gestionar el proceso de conversión del documento a un archivo PostScript (PS) o Encapsulated PostScript ([EPS](../../aspose.page.eps/)).

```cpp
class PsSaveOptions : public Aspose::Page::SaveOptions
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_BackgroundColor](./get_backgroundcolor/)() const | El color de fondo. |
| [get_EmbedFonts](./get_embedfonts/)() const | Indica si se deben incrustar las fuentes utilizadas en el documento PS. |
| [get_EmbedFontsAs](./get_embedfontsas/)() const | Un tipo de fuente en la que incrustar las fuentes en el documento PS. |
| [get_Margins](./get_margins/)() const | Los márgenes de la página. |
| [get_PageSize](./get_pagesize/)() const | El tamaño de la página. |
| [get_SaveFormat](./get_saveformat/)() const | El formato de guardado del archivo resultante. |
| [get_Transparent](./get_transparent/)() const | Indica si el fondo es transparente. |
| [PsSaveOptions](./pssaveoptions/)() | Inicializa una nueva instancia de la clase [PsSaveOptions](./) con valores predeterminados para los indicadores [SuppressErrors](../) (true) y [Debug](../) (false). |
| [PsSaveOptions](./pssaveoptions/)(bool) | Inicializa una nueva instancia de la clase [PsSaveOptions](./) con valores predeterminados para el indicador [Debug](../) (false). |
| [set_BackgroundColor](./set_backgroundcolor/)(System::Nullable\<System::Drawing::Color\>) | El color de fondo. |
| [set_EmbedFonts](./set_embedfonts/)(bool) | Indica si se deben incrustar las fuentes utilizadas en el documento PS. |
| [set_EmbedFontsAs](./set_embedfontsas/)(System::String) | Un tipo de fuente en la que incrustar las fuentes en el documento PS. |
| [set_Margins](./set_margins/)(System::SharedPtr\<Aspose::Page::Margins\>) | Los márgenes de la página. |
| [set_PageSize](./set_pagesize/)(Aspose::Page::Drawing::Size) | El tamaño de la página. |
| [set_SaveFormat](./set_saveformat/)(PsSaveFormat) | El formato de guardado del archivo resultante. |
| [set_Transparent](./set_transparent/)(bool) | Indica si el fondo es transparente. |
## Ver también

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Namespace [Aspose::Page::EPS::Device](../)
* Library [Aspose.Page for C++](../../)
