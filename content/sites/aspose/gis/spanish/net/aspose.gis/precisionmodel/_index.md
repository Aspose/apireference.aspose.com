---
title: Class PrecisionModel
second_title: Referencia de API de Aspose.GIS para .NET
description: Aspose.Gis.PrecisionModel clase. PrecisionModel especifica un número de dígitos significativos en una coordenada.
type: docs
weight: 1310
url: /es/net/aspose.gis/precisionmodel/
---
## PrecisionModel class

`PrecisionModel` especifica un número de dígitos significativos en una coordenada.

```csharp
public abstract class PrecisionModel : IEquatable<PrecisionModel>
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| static [Exact](../../aspose.gis/precisionmodel/exact/) { get; } | Devuelve un modelo de precisión exacta. De acuerdo con el modelo de precisión exacta, todos los dígitos en un valor doble son significativos. |
| [IsExact](../../aspose.gis/precisionmodel/isexact/) { get; } | Obtiene un valor que indica si este modelo de precisión es exacto. |
| [IsRounding](../../aspose.gis/precisionmodel/isrounding/) { get; } | Obtiene un valor que indica si este modelo de precisión está redondeando. |
| abstract [SignificantDigits](../../aspose.gis/precisionmodel/significantdigits/) { get; } | Obtiene un número de dígitos significativos en un modelo de precisión si se está redondeando. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| static [Rounding](../../aspose.gis/precisionmodel/rounding/)(int) | Devuelve un modelo de precisión de redondeo. De acuerdo con el modelo de precisión de redondeo, solo un número limitado de dígitos son significativos. |
| override [Equals](../../aspose.gis/precisionmodel/equals/#equals_1)(object) | Indica si el objeto actual es igual a otro objeto del mismo tipo. |
| [Equals](../../aspose.gis/precisionmodel/equals/#equals)(PrecisionModel) | Indica si el objeto actual es igual a otro objeto del mismo tipo. |
| override [GetHashCode](../../aspose.gis/precisionmodel/gethashcode/)() | Sirve como la función hash predeterminada. |
| [operator ==](../../aspose.gis/precisionmodel/op_equality/) | Implementa el operador ==. |
| [operator !=](../../aspose.gis/precisionmodel/op_inequality/) | Implementa el operador !=. |

### Observaciones

Hay dos tipos de PrecisionModel:  Exacto`PrecisionModel` (todos los dígitos son significativos); Redondeado`PrecisionModel` (Algunos números de dígitos son significativos). A`PrecisionModel` se puede configurar para[`VectorLayer`](../vectorlayer/) a través de[`DriverOptions`](../driveroptions/) para redondear coordenadas al escribir o leer geometrías.

### Ver también

* property [XYPrecisionModel](../driveroptions/xyprecisionmodel/)
* property [ZPrecisionModel](../driveroptions/zprecisionmodel/)
* property [MPrecisionModel](../driveroptions/mprecisionmodel/)
* espacio de nombres [Aspose.Gis](../../aspose.gis/)
* asamblea [Aspose.GIS](../../)


