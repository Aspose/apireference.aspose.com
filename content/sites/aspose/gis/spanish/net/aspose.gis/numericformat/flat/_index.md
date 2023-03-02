---
title: NumericFormat.Flat
second_title: Referencia de API de Aspose.GIS para .NET
description: NumericFormat método. Convierte un número en un texto de punto fijo sin notación científica.
type: docs
weight: 20
url: /es/net/aspose.gis/numericformat/flat/
---
## NumericFormat.Flat method

Convierte un número en un texto de punto fijo sin notación científica.

```csharp
public static NumericFormat Flat(int significantDigits)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| significantDigits | Int32 | Número de dígitos significativos. La precisión máxima disponible es "308" |

### Valor_devuelto

El especificador de precisión de redondeo.

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentOutOfRangeException | El número de dígitos significativos es menor que 0 o mayor que 308. |

### Observaciones

El código interno genera cadenas de números para WKT a través de:ordinar.ToString("0.##..", CultureInfo.InvariantCulture) decision.

### Ver también

* class [NumericFormat](../)
* espacio de nombres [Aspose.Gis](../../numericformat/)
* asamblea [Aspose.GIS](../../../)


