---
title: "Clase Aspose::Page::Metered"
linktitle: "Medido"
second_title: "Aspose.Page para C++"
description: "Clase Aspose::Page::Metered. Proporciona métodos para establecer la clave medida en C++."
type: docs
weight: 1400
url: /es/cpp/aspose.page/metered/
---
## Metered class


Proporciona métodos para establecer la clave medida.

```cpp
class Metered : public System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| static [GetConsumptionCredit](./getconsumptioncredit/)() | Obtiene el crédito de consumo. |
| static [GetConsumptionQuantity](./getconsumptionquantity/)() | Obtiene el tamaño del archivo de consumo. |
| [Metered](./metered/)() | Inicializa una nueva instancia de esta clase. |
| [SetMeteredKey](./setmeteredkey/)(System::String, System::String) | Establece la clave pública y privada medida. Si compra una licencia medida, al iniciar la aplicación, debe llamarse a esta API; normalmente, esto es suficiente. Sin embargo, si siempre falla la carga de datos de consumo y supera las 24 horas, la licencia se establecerá en estado de evaluación; para evitar este caso, debe comprobar regularmente el estado de la licencia, y si está en estado de evaluación, llamar a esta API nuevamente. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
