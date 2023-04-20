---
title: Class SVGAngle
second_title: Referencia de API de Aspose.SVG para .NET
description: Aspose.Svg.DataTypes.SVGAngle clase. La interfaz SVGAngle corresponde al tipo de datos básico de ángulo.
type: docs
weight: 80
url: /es/net/aspose.svg.datatypes/svgangle/
---
## SVGAngle class

La interfaz SVGAngle corresponde al tipo de datos básico de ángulo.

```csharp
public class SVGAngle : SVGValueType
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [UnitType](../../aspose.svg.datatypes/svgangle/unittype/) { get; } | El tipo del valor especificado por una de las constantes SVG_ANGLETYPE_* definidas en esta interfaz. |
| [Value](../../aspose.svg.datatypes/svgangle/value/) { get; set; } | El valor del ángulo como valor de punto flotante, en grados. La configuración de este atributo hará que valueInSpecifiedUnits y valueAsString se actualicen automáticamente para reflejar esta configuración. |
| [ValueAsString](../../aspose.svg.datatypes/svgangle/valueasstring/) { get; set; } | El valor del ángulo como un valor de cadena, en las unidades expresadas por unitType. La configuración de este atributo hará que value, valueInSpecifiedUnits y unitType se actualicen automáticamente para reflejar esta configuración. |
| [ValueInSpecifiedUnits](../../aspose.svg.datatypes/svgangle/valueinspecifiedunits/) { get; set; } | El valor del ángulo como un valor de punto flotante, en las unidades expresadas por unitType. La configuración de este atributo hará que value y valueAsString se actualicen automáticamente para reflejar esta configuración. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [ConvertToSpecifiedUnits](../../aspose.svg.datatypes/svgangle/converttospecifiedunits/)(ushort) | Conserva el mismo valor almacenado subyacente, pero restablece el identificador de la unidad almacenada al tipo de unidad dado. Los atributos de objeto unitType, valueInSpecifiedUnits y valueAsString pueden modificarse como resultado de este método. |
| [Dispose](../../aspose.svg.datatypes/svgvaluetype/dispose/)() | Libera recursos no administrados y, opcionalmente, administrados. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Este método se utiliza para recuperar el objeto ECMAScriptType . |
| [NewValueSpecifiedUnits](../../aspose.svg.datatypes/svgangle/newvaluespecifiedunits/)(ushort, float) | Restablezca el valor como un número con un tipo de unidad asociado, reemplazando así los valores de todos los atributos del objeto. |
| override [ToString](../../aspose.svg.datatypes/svgangle/tostring/)() | Devuelve unString que representa esta instancia. |

## Campos

| Nombre | Descripción |
| --- | --- |
| const [SVG_ANGLETYPE_DEG](../../aspose.svg.datatypes/svgangle/svg_angletype_deg/) | El tipo de unidad se estableció explícitamente en grados. |
| const [SVG_ANGLETYPE_GRAD](../../aspose.svg.datatypes/svgangle/svg_angletype_grad/) | El tipo de unidad es radianes. |
| const [SVG_ANGLETYPE_RAD](../../aspose.svg.datatypes/svgangle/svg_angletype_rad/) | El tipo de unidad es radianes. |
| const [SVG_ANGLETYPE_UNKNOWN](../../aspose.svg.datatypes/svgangle/svg_angletype_unknown/) | El tipo de unidad no es uno de los tipos de unidad predefinidos. No es válido intentar definir un nuevo valor de este tipo o intentar cambiar un valor existente a este tipo. |
| const [SVG_ANGLETYPE_UNSPECIFIED](../../aspose.svg.datatypes/svgangle/svg_angletype_unspecified/) | No se proporcionó ningún tipo de unidad (es decir, se especificó un valor sin unidad). Para ángulos, un valor sin unidades se trata igual que si se especificaran grados. |

### Ver también

* class [SVGValueType](../svgvaluetype/)
* espacio de nombres [Aspose.Svg.DataTypes](../../aspose.svg.datatypes/)
* asamblea [Aspose.SVG](../../)


