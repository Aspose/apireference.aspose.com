---
title: Enum XpsFillRule
second_title: Referencia de la API de Aspose.Page para .NET
description: Aspose.Page.XPS.XpsModel.XpsFillRule enumeración. Valores válidos de la propiedad FillRule del elemento PathGeometry.
type: docs
weight: 3070
url: /es/net/aspose.page.xps.xpsmodel/xpsfillrule/
---
## XpsFillRule enumeration

Valores válidos de la propiedad FillRule del elemento PathGeometry.

```csharp
public enum XpsFillRule
```

### Valores

| Nombre | Valor | Descripción |
| --- | --- | --- |
| EvenOdd | `0` | Esta regla determina el "interior" de un punto en el lienzo dibujando un rayo desde el punto hasta el infinito en cualquier dirección y contando el número de segmentos de la forma dada que cruza el rayo. Si este número es impar, el punto está adentro; si es par, el punto está fuera. |
| NonZero | `1` | Esta regla determina el "interior" de un punto en el lienzo dibujando un rayo desde el punto hasta el infinito en cualquier dirección y luego examinando los lugares donde un segmento de la forma cruza el rayo. Comenzando con una cuenta de cero, sume uno cada vez que un segmento cruce el rayo de izquierda a derecha y reste uno cada vez que un segmento de ruta cruce el rayo de derecha a izquierda. Después de contar los cruces, si el resultado es cero entonces el punto está fuera del camino; de lo contrario, está dentro. |

### Ver también

* espacio de nombres [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* asamblea [Aspose.Page](../../)


