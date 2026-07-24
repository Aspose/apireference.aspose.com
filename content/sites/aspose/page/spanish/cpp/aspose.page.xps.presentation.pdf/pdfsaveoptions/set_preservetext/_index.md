---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions::set_PreserveText método"
linktitle: "set_PreserveText"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions::set_PreserveText método. En XPS, algunos elementos de texto pueden contener referencias a formas de glifo alternas que no corresponden a ningún código de carácter en la fuente. Si esta bandera se establece en true, el texto de dichos elementos XPS se convierte en formas gráficas. Entonces el propio texto aparece transparente encima. Esto deja el texto de dichos elementos seleccionable. Pero el efecto secundario es que el archivo de salida puede ser mucho más grande que el original. Si esta bandera se establece en false, los caracteres que deberían mostrarse como formas alternas se reemplazan por otros caracteres que se asignan a las formas de glifo alternas. Por lo tanto, el texto, aunque siga siendo seleccionable, será modificado y probablemente ilegible. El valor predeterminado es false en C++."
type: docs
weight: 1700
url: /es/cpp/aspose.page.xps.presentation.pdf/pdfsaveoptions/set_preservetext/
---
## PdfSaveOptions::set_PreserveText method


En [XPS](../../../aspose.page.xps/), algunos elementos de texto pueden contener referencias a formas de glifo alternas que no corresponden a ningún código de carácter en la fuente. Si esta bandera se establece en true, el texto de dichos elementos [XPS](../../../aspose.page.xps/) se convierte en formas gráficas. Entonces el propio texto aparece transparente encima. Esto deja el texto de dichos elementos seleccionable. Pero el efecto secundario es que el archivo de salida puede ser mucho más grande que el original. Si esta bandera se establece en false, los caracteres que deberían mostrarse como formas alternas se reemplazan por otros caracteres que se asignan a las formas de glifo alternas. Por lo tanto, el texto, aunque siga siendo seleccionable, será modificado y probablemente ilegible. El valor predeterminado es false.

```cpp
void Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions::set_PreserveText(bool value) override
```

## Ver también

* Class [PdfSaveOptions](../)
* Namespace [Aspose::Page::XPS::Presentation::Pdf](../../)
* Library [Aspose.Page for C++](../../../)
