---
title: "Aspose::Page::XPS::Presentation::IXpsTextConversionOptions class"
linktitle: "IXpsTextConversionOptions"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::Presentation::IXpsTextConversionOptions class. Define opciones para la conversión de XPS a otros formatos en C++."
type: docs
weight: 300
url: /es/cpp/aspose.page.xps.presentation/ixpstextconversionoptions/
---
## IXpsTextConversionOptions class


Define opciones para la conversión de [XPS](../../aspose.page.xps/) a otros formatos.

```cpp
class IXpsTextConversionOptions : public virtual System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| virtual [get_PreserveText](./get_preservetext/)() | En [XPS](../../aspose.page.xps/), algunos elementos de texto pueden contener referencias a formas de glifo alternas que no corresponden a ningún código de carácter en la fuente. Si esta bandera se establece en true, el texto de dichos elementos [XPS](../../aspose.page.xps/) se convierte en formas gráficas. Entonces el propio texto aparece transparente encima. Esto deja el texto de dichos elementos seleccionable. Pero el efecto secundario es que el archivo de salida puede ser mucho más grande que el original. Si esta bandera se establece en false, los caracteres que deberían mostrarse como formas alternas se sustituyen por otros caracteres que se asignan a las formas de glifo alternas. Por lo tanto, el texto, aunque sigue siendo seleccionable, será modificado y probablemente ilegible. |
| virtual [set_PreserveText](./set_preservetext/)(bool) | En [XPS](../../aspose.page.xps/), algunos elementos de texto pueden contener referencias a formas de glifo alternas que no corresponden a ningún código de carácter en la fuente. Si esta bandera se establece en true, el texto de dichos elementos [XPS](../../aspose.page.xps/) se convierte en formas gráficas. Entonces el propio texto aparece transparente encima. Esto deja el texto de dichos elementos seleccionable. Pero el efecto secundario es que el archivo de salida puede ser mucho más grande que el original. Si esta bandera se establece en false, los caracteres que deberían mostrarse como formas alternas se sustituyen por otros caracteres que se asignan a las formas de glifo alternas. Por lo tanto, el texto, aunque sigue siendo seleccionable, será modificado y probablemente ilegible. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Presentation](../)
* Library [Aspose.Page for C++](../../)
