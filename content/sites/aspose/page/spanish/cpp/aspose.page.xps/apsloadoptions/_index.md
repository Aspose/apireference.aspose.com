---
title: "Aspose::Page::XPS::ApsLoadOptions clase"
linktitle: "ApsLoadOptions"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::ApsLoadOptions clase. Opciones de carga de documentos APS en C++."
type: docs
weight: 100
url: /es/cpp/aspose.page.xps/apsloadoptions/
---
## ApsLoadOptions class


Opciones de carga de documentos APS.

```cpp
class ApsLoadOptions : public Aspose::Page::XPS::LoadOptions
```

## Métodos

| Método | Descripción |
| --- | --- |
| [ApsLoadOptions](./apsloadoptions/)() | Crea una nueva instancia de opciones. |
| [get_TransparencyThreshold](./get_transparencythreshold/)() const | Un valor entero de 0 a 255 por debajo del cual el píxel de la imagen que contiene valores alfa se considerará totalmente transparente. PostScript no admite transparencia, pero puede aplicar una máscara explícita sobre la imagen en color donde algunos píxeles serán totalmente opacos y otros serán totalmente transparentes. El umbral de transparencia se utiliza para encontrar la mayor similitud entre el original y el resultado de PostScript. El valor predeterminado es 255. |
| [set_TransparencyThreshold](./set_transparencythreshold/)(int32_t) | Un valor entero de 0 a 255 por debajo del cual el píxel de la imagen que contiene valores alfa se considerará totalmente transparente. PostScript no admite transparencia, pero puede aplicar una máscara explícita sobre la imagen en color donde algunos píxeles serán totalmente opacos y otros serán totalmente transparentes. El umbral de transparencia se utiliza para encontrar la mayor similitud entre el original y el resultado de PostScript. El valor predeterminado es 255. |
## Ver también

* Class [LoadOptions](../loadoptions/)
* Namespace [Aspose::Page::XPS](../)
* Library [Aspose.Page for C++](../../)
