---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions clase"
linktitle: "PdfSaveOptions"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions clase. Clase para opciones de guardado de XPS como PDF en C++."
type: docs
weight: 300
url: /es/cpp/aspose.page.xps.presentation.pdf/pdfsaveoptions/
---
## PdfSaveOptions class


Clase para opciones de guardado XPS-como-PDF.

```cpp
class PdfSaveOptions : public Aspose::Page::SaveOptions,
                       public Aspose::Page::IMultiPageSaveOptions,
                       public Aspose::Page::XPS::Presentation::IXpsTextConversionOptions,
                       public Aspose::Page::XPS::Presentation::IPipelineOptions,
                       public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | Especifica el tamaño de una porción de páginas para pasar de nodo a nodo. |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | La colección de controladores de eventos que realiza modificaciones a una página [XPS](../../aspose.page.xps/) justo antes de que se guarde. |
| [get_EncryptionDetails](./get_encryptiondetails/)() const | Obtiene los detalles de cifrado. Si no se establece, no se realizará ningún cifrado. |
| [get_ImageCompression](./get_imagecompression/)() const | Especifica el tipo de compresión que se utilizará para todas las imágenes del documento. El valor predeterminado es [PdfImageCompression::Auto](../pdfimagecompression/). |
| [get_OutlineTreeExpansionLevel](./get_outlinetreeexpansionlevel/)() const | Especifica hasta qué nivel debe expandirse el esquema del documento cuando el archivo PDF se abre en un visor. 1 - solo se muestran los elementos del esquema de primer nivel, 2 - solo se muestran los elementos de primer y segundo nivel, y así sucesivamente. El valor predeterminado es 1. |
| [get_OutlineTreeHeight](./get_outlinetreeheight/)() const | Especifica la altura del árbol de esquema del documento a guardar. 0 - el árbol de esquema no se convertirá, 1 - solo se convertirán los elementos del esquema de primer nivel, y así sucesivamente. El valor predeterminado es 10. |
| [get_PageNumbers](./get_pagenumbers/)() override | Obtiene/establece la matriz de números de páginas a convertir. |
| [get_PreserveText](./get_preservetext/)() override | En [XPS](../../aspose.page.xps/), algunos elementos de texto pueden contener referencias a formas de glifo alternas que no corresponden a ningún código de carácter en la fuente. Si esta bandera se establece en true, el texto de dichos elementos [XPS](../../aspose.page.xps/) se convierte en formas gráficas. Luego el propio texto aparece transparente encima. Esto deja el texto de dichos elementos seleccionable. Pero el efecto secundario es que el archivo de salida puede ser mucho más grande que el original. Si esta bandera se establece en false, los caracteres que deberían mostrarse como formas alternas se reemplazan por otros caracteres que se asignan a las formas de glifo alternas. Por lo tanto, el texto, aunque sigue siendo seleccionable, será modificado y probablemente se vuelva ilegible. El valor predeterminado es false. |
| [get_TextCompression](./get_textcompression/)() const | Especifica en qué nivel del esquema del documento se deben mostrar los objetos [ApsBookmark](../). 0 - no se muestra. 1 en el primer nivel y así sucesivamente. El valor predeterminado es 0. |
| [PdfSaveOptions](./pdfsaveoptions/)() | Crea una nueva instancia de opciones. |
| [set_BatchSize](./set_batchsize/)(int32_t) override | Especifica el tamaño de una porción de páginas para pasar de nodo a nodo. |
| [set_EncryptionDetails](./set_encryptiondetails/)(System::SharedPtr\<PdfEncryptionDetails\>) | Establece los detalles de cifrado. Si no se establece, no se realizará ningún cifrado. |
| [set_ImageCompression](./set_imagecompression/)(PdfImageCompression) | Especifica el tipo de compresión que se utilizará para todas las imágenes del documento. El valor predeterminado es [PdfImageCompression::Auto](../pdfimagecompression/). |
| [set_OutlineTreeExpansionLevel](./set_outlinetreeexpansionlevel/)(int32_t) | Especifica hasta qué nivel debe expandirse el esquema del documento cuando el archivo PDF se abre en un visor. 1 - solo se muestran los elementos del esquema de primer nivel, 2 - solo se muestran los elementos de primer y segundo nivel, y así sucesivamente. El valor predeterminado es 1. |
| [set_OutlineTreeHeight](./set_outlinetreeheight/)(int32_t) | Especifica la altura del árbol de esquema del documento a guardar. 0 - el árbol de esquema no se convertirá, 1 - solo se convertirán los elementos del esquema de primer nivel, y así sucesivamente. El valor predeterminado es 10. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | Obtiene/establece la matriz de números de páginas a convertir. |
| [set_PreserveText](./set_preservetext/)(bool) override | En [XPS](../../aspose.page.xps/), algunos elementos de texto pueden contener referencias a formas de glifo alternas que no corresponden a ningún código de carácter en la fuente. Si esta bandera se establece en true, el texto de dichos elementos [XPS](../../aspose.page.xps/) se convierte en formas gráficas. Luego el propio texto aparece transparente encima. Esto deja el texto de dichos elementos seleccionable. Pero el efecto secundario es que el archivo de salida puede ser mucho más grande que el original. Si esta bandera se establece en false, los caracteres que deberían mostrarse como formas alternas se reemplazan por otros caracteres que se asignan a las formas de glifo alternas. Por lo tanto, el texto, aunque sigue siendo seleccionable, será modificado y probablemente se vuelva ilegible. El valor predeterminado es false. |
| [set_TextCompression](./set_textcompression/)(PdfTextCompression) | Especifica en qué nivel del esquema del documento se deben mostrar los objetos [ApsBookmark](../). 0 - no se muestra. 1 en el primer nivel y así sucesivamente. El valor predeterminado es 0. |
## Ver también

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IXpsTextConversionOptions](../../aspose.page.xps.presentation/ixpstextconversionoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)
