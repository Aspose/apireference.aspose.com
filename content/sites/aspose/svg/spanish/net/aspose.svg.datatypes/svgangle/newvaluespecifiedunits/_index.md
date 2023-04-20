---
title: SVGAngle.NewValueSpecifiedUnits
second_title: Referencia de API de Aspose.SVG para .NET
description: SVGAngle método. Restablezca el valor como un número con un tipo de unidad asociado reemplazando así los valores de todos los atributos del objeto.
type: docs
weight: 60
url: /es/net/aspose.svg.datatypes/svgangle/newvaluespecifiedunits/
---
## SVGAngle.NewValueSpecifiedUnits method

Restablezca el valor como un número con un tipo de unidad asociado, reemplazando así los valores de todos los atributos del objeto.

```csharp
public void NewValueSpecifiedUnits(ushort newUnitType, float valueInSpecifiedUnits)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| newUnitType | UInt16 | El tipo de unidad para el valor (por ejemplo, SVG_ANGLETYPE_DEG). |
| valueInSpecifiedUnits | Single | El valor del ángulo. |

### Excepciones

| excepción | condición |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | Código[`NOT_SUPPORTED_ERR`](../../../aspose.svg.dom/domexception/not_supported_err/) Se genera si unitType es SVG_ANGLETYPE_UNKNOWN o no es una constante de tipo de unidad válida (una de las otras constantes SVG_ANGLETYPE_* definidas en esta interfaz). |
| [DOMException](../../../aspose.svg.dom/domexception/) | Código[`NO_MODIFICATION_ALLOWED_ERR`](../../../aspose.svg.dom/domexception/no_modification_allowed_err/) Se genera cuando el ángulo corresponde a un atributo de solo lectura o cuando el objeto en sí es de solo lectura. |

### Ver también

* class [SVGAngle](../)
* espacio de nombres [Aspose.Svg.DataTypes](../../svgangle/)
* asamblea [Aspose.SVG](../../../)


