---
title: Class SVGLength
second_title: Referencia de API de Aspose.SVG para .NET
description: Aspose.Svg.DataTypes.SVGLength clase. La interfaz SVGLength corresponde al tipo de datos básico de longitud. Un objeto SVGLength se puede designar como de solo lectura lo que significa que los intentos de modificar el objeto generarán una excepción como se describe a continuación.
type: docs
weight: 220
url: /es/net/aspose.svg.datatypes/svglength/
---
## SVGLength class

La interfaz SVGLength corresponde al tipo de datos básico de longitud. Un objeto SVGLength se puede designar como de solo lectura, lo que significa que los intentos de modificar el objeto generarán una excepción, como se describe a continuación.

```csharp
public class SVGLength : SVGValueType
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [UnitType](../../aspose.svg.datatypes/svglength/unittype/) { get; } | El tipo del valor especificado por una de las constantes SVG_LENGTHTYPE_* definidas en esta interfaz. |
| [Value](../../aspose.svg.datatypes/svglength/value/) { get; set; } | El valor como valor de punto flotante, en unidades de usuario. La configuración de este atributo hará que valueInSpecifiedUnits y valueAsString se actualicen automáticamente para reflejar esta configuración. |
| [ValueAsString](../../aspose.svg.datatypes/svglength/valueasstring/) { get; set; } | El valor como un valor de cadena, en las unidades expresadas por unitType. La configuración de este atributo hará que value, valueInSpecifiedUnits y unitType se actualicen automáticamente para reflejar esta configuración. |
| [ValueInSpecifiedUnits](../../aspose.svg.datatypes/svglength/valueinspecifiedunits/) { get; set; } | El valor como valor de punto flotante, en las unidades expresadas por unitType. La configuración de este atributo hará que value y valueAsString se actualicen automáticamente para reflejar esta configuración. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [ConvertToSpecifiedUnits](../../aspose.svg.datatypes/svglength/converttospecifiedunits/)(ushort) | Conserva el mismo valor almacenado subyacente, pero restablece el identificador de la unidad almacenada al tipo de unidad dado. Los atributos de objeto unitType, valueInSpecifiedUnits y valueAsString pueden modificarse como resultado de este método. Por ejemplo, si el valor original fuera "0,5 cm" y se invocara el método para convertir a milímetros, el tipo de unidad se cambiaría a SVG_LENGTHTYPE_MM, valueInSpecifiedUnits se cambiaría al valor numérico 5 y valueAsString se cambiaría a "5 mm". |
| [Dispose](../../aspose.svg.datatypes/svgvaluetype/dispose/)() | Libera recursos no administrados y, opcionalmente, administrados. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Este método se utiliza para recuperar el objeto ECMAScriptType . |
| [NewValueSpecifiedUnits](../../aspose.svg.datatypes/svglength/newvaluespecifiedunits/)(ushort, float) | Restablezca el valor como un número con un tipo de unidad asociado, reemplazando así los valores de todos los atributos del objeto. |
| override [ToString](../../aspose.svg.datatypes/svglength/tostring/)() | Devuelve unString que representa esta instancia. |

## Campos

| Nombre | Descripción |
| --- | --- |
| const [SVG_LENGTHTYPE_CM](../../aspose.svg.datatypes/svglength/svg_lengthtype_cm/) | Se especificó un valor usando las unidades cm definidas en CSS2. |
| const [SVG_LENGTHTYPE_EMS](../../aspose.svg.datatypes/svglength/svg_lengthtype_ems/) | Se especificó un valor usando las unidades em definidas en CSS2. |
| const [SVG_LENGTHTYPE_EXS](../../aspose.svg.datatypes/svglength/svg_lengthtype_exs/) | Se especificó un valor usando las unidades ex definidas en CSS2. |
| const [SVG_LENGTHTYPE_IN](../../aspose.svg.datatypes/svglength/svg_lengthtype_in/) | Se especificó un valor usando las unidades definidas en CSS2. |
| const [SVG_LENGTHTYPE_MM](../../aspose.svg.datatypes/svglength/svg_lengthtype_mm/) | Se especificó un valor utilizando las unidades de mm definidas en CSS2. |
| const [SVG_LENGTHTYPE_NUMBER](../../aspose.svg.datatypes/svglength/svg_lengthtype_number/) | No se proporcionó ningún tipo de unidad (es decir, se especificó un valor sin unidad), lo que indica un valor en unidades de usuario. |
| const [SVG_LENGTHTYPE_PC](../../aspose.svg.datatypes/svglength/svg_lengthtype_pc/) | Se especificó un valor usando las unidades pc definidas en CSS2. |
| const [SVG_LENGTHTYPE_PERCENTAGE](../../aspose.svg.datatypes/svglength/svg_lengthtype_percentage/) | Se especificó un valor porcentual. |
| const [SVG_LENGTHTYPE_PT](../../aspose.svg.datatypes/svglength/svg_lengthtype_pt/) | Se especificó un valor usando las unidades pt definidas en CSS2. |
| const [SVG_LENGTHTYPE_PX](../../aspose.svg.datatypes/svglength/svg_lengthtype_px/) | Se especificó un valor usando las unidades px definidas en CSS2. |
| const [SVG_LENGTHTYPE_UNKNOWN](../../aspose.svg.datatypes/svglength/svg_lengthtype_unknown/) | El tipo de unidad no es uno de los tipos de unidad predefinidos. No es válido intentar definir un nuevo valor de este tipo o intentar cambiar un valor existente a este tipo. |

### Ver también

* class [SVGValueType](../svgvaluetype/)
* espacio de nombres [Aspose.Svg.DataTypes](../../aspose.svg.datatypes/)
* asamblea [Aspose.SVG](../../)


