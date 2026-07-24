---
title: "Aspose::Page::Metered::SetMeteredKey método"
linktitle: "SetMeteredKey"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::Metered::SetMeteredKey método. Establece la clave pública y privada medida. Si compras una licencia medida, al iniciar la aplicación, esta API debe ser llamada; normalmente, eso es suficiente. Sin embargo, si siempre falla al subir los datos de consumo y supera las 24 horas, la licencia se establecerá en estado de evaluación; para evitar tal caso, deberías comprobar regularmente el estado de la licencia, y si está en estado de evaluación, llamar a esta API nuevamente en C++."
type: docs
weight: 200
url: /es/cpp/aspose.page/metered/setmeteredkey/
---
## Metered::SetMeteredKey method


Establece la clave pública y privada medida. Si compra una licencia medida, al iniciar la aplicación, debe llamarse a esta API; normalmente, esto es suficiente. Sin embargo, si siempre falla la carga de datos de consumo y supera las 24 horas, la licencia se establecerá en estado de evaluación; para evitar este caso, debe comprobar regularmente el estado de la licencia, y si está en estado de evaluación, llamar a esta API nuevamente.

```cpp
void Aspose::Page::Metered::SetMeteredKey(System::String publicKey, System::String privateKey)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| publicKey | System::String | clave pública |
| privateKey | System::String | clave privada |

## Ver también

* Class [String](../../../system/string/)
* Class [Metered](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
