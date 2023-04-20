---
title: Class SVGAngle
second_title: Aspose.SVG für .NET-API-Referenz
description: Aspose.Svg.DataTypes.SVGAngle klas. Die Schnittstelle SVGAngle entspricht dem Grunddatentyp Winkel.
type: docs
weight: 80
url: /de/net/aspose.svg.datatypes/svgangle/
---
## SVGAngle class

Die Schnittstelle SVGAngle entspricht dem Grunddatentyp Winkel.

```csharp
public class SVGAngle : SVGValueType
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [UnitType](../../aspose.svg.datatypes/svgangle/unittype/) { get; } | Der Typ des Werts, wie er von einer der auf dieser Schnittstelle definierten SVG_ANGLETYPE_*-Konstanten angegeben wird. |
| [Value](../../aspose.svg.datatypes/svgangle/value/) { get; set; } | Der Winkelwert als Fließkommawert in Grad. Das Festlegen dieses Attributs bewirkt, dass valueInSpecifiedUnits und valueAsString automatisch aktualisiert werden, um diese Einstellung widerzuspiegeln. |
| [ValueAsString](../../aspose.svg.datatypes/svgangle/valueasstring/) { get; set; } | Der Winkelwert als Zeichenfolgenwert in den durch unitType ausgedrückten Einheiten. Das Festlegen dieses Attributs bewirkt, dass value, valueInSpecifiedUnits und unitType automatisch aktualisiert werden, um diese Einstellung widerzuspiegeln. |
| [ValueInSpecifiedUnits](../../aspose.svg.datatypes/svgangle/valueinspecifiedunits/) { get; set; } | Der Winkelwert als Fließkommawert in den Einheiten, ausgedrückt durch unitType. Das Festlegen dieses Attributs bewirkt, dass value und valueAsString automatisch aktualisiert werden, um diese Einstellung widerzuspiegeln. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [ConvertToSpecifiedUnits](../../aspose.svg.datatypes/svgangle/converttospecifiedunits/)(ushort) | Den gleichen zugrunde liegenden gespeicherten Wert beibehalten, aber die gespeicherte Einheitenkennung auf den angegebenen unitType zurücksetzen. Die Objektattribute unitType, valueInSpecifiedUnits und valueAsString können als Ergebnis dieser Methode geändert werden. |
| [Dispose](../../aspose.svg.datatypes/svgvaluetype/dispose/)() | Gibt nicht verwaltete und – optional – verwaltete Ressourcen frei. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Diese Methode wird zum Abrufen des ECMAScript-Objekts verwendetType . |
| [NewValueSpecifiedUnits](../../aspose.svg.datatypes/svgangle/newvaluespecifiedunits/)(ushort, float) | Setzt den Wert als Zahl mit einem zugeordneten unitType zurück und ersetzt dadurch die Werte für alle Attribute des Objekts. |
| override [ToString](../../aspose.svg.datatypes/svgangle/tostring/)() | Gibt a zurückString die diese Instanz darstellt. |

## Felder

| Name | Beschreibung |
| --- | --- |
| const [SVG_ANGLETYPE_DEG](../../aspose.svg.datatypes/svgangle/svg_angletype_deg/) | Der Einheitentyp wurde explizit auf Grad gesetzt. |
| const [SVG_ANGLETYPE_GRAD](../../aspose.svg.datatypes/svgangle/svg_angletype_grad/) | Der Einheitentyp ist Radiant. |
| const [SVG_ANGLETYPE_RAD](../../aspose.svg.datatypes/svgangle/svg_angletype_rad/) | Der Einheitentyp ist Radiant. |
| const [SVG_ANGLETYPE_UNKNOWN](../../aspose.svg.datatypes/svgangle/svg_angletype_unknown/) | Der Einheitentyp ist keiner der vordefinierten Einheitentypen. Es ist ungültig, einen neuen Wert dieses Typs zu definieren oder einen vorhandenen Wert auf diesen Typ umzustellen. |
| const [SVG_ANGLETYPE_UNSPECIFIED](../../aspose.svg.datatypes/svgangle/svg_angletype_unspecified/) | Es wurde kein Einheitentyp angegeben (dh es wurde ein einheitenloser Wert angegeben). Bei Winkeln wird ein Wert ohne Einheit so behandelt, als ob Grad angegeben wäre. |

### Siehe auch

* class [SVGValueType](../svgvaluetype/)
* namensraum [Aspose.Svg.DataTypes](../../aspose.svg.datatypes/)
* Montage [Aspose.SVG](../../)


