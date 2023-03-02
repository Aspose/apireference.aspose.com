---
title: PrecisionModel.Rounding
second_title: Referencia de API de Aspose.GIS para .NET
description: PrecisionModel método. Devuelve un modelo de precisión de redondeo. De acuerdo con el modelo de precisión de redondeo solo un número limitado de dígitos son significativos.
type: docs
weight: 20
url: /es/net/aspose.gis/precisionmodel/rounding/
---
## PrecisionModel.Rounding method

Devuelve un modelo de precisión de redondeo. De acuerdo con el modelo de precisión de redondeo, solo un número limitado de dígitos son significativos.

```csharp
public static PrecisionModel Rounding(int significantDigits)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| significantDigits | Int32 | Número de dígitos significativos. |

### Valor_devuelto

Modelo de precisión de redondeo.

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentOutOfRangeException | El número de dígitos significativos es menor que 0 o mayor que 15. |

### Observaciones

Cuando se aplica a una coordenada, el siguiente código se usa para reducir la precisión:

```csharp
double rounded = Math.Round(value, significantDigits);
```

### Ver también

* class [PrecisionModel](../)
* espacio de nombres [Aspose.Gis](../../precisionmodel/)
* asamblea [Aspose.GIS](../../../)


