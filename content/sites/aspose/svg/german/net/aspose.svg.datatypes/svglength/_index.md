---
title: SVGLength
second_title: Aspose.SVG für .NET-API-Referenz
description: Die SVGLengthSchnittstelle entspricht dem Basisdatentyp length. Ein SVGLengthObjekt kann als schreibgeschützt gekennzeichnet werden was bedeutet dass Versuche das Objekt zu ändern dazu führen dass eine Ausnahme ausgelöst wird wie unten beschrieben.
type: docs
weight: 220
url: /de/net/aspose.svg.datatypes/svglength/
---
## SVGLength class

Die SVGLength-Schnittstelle entspricht dem Basisdatentyp length. Ein SVGLength-Objekt kann als schreibgeschützt gekennzeichnet werden, was bedeutet, dass Versuche, das Objekt zu ändern, dazu führen, dass eine Ausnahme ausgelöst wird, wie unten beschrieben.

```csharp
public class SVGLength : SVGValueType
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [UnitType](../../aspose.svg.datatypes/svglength/unittype) { get; } | Der Typ des Werts, wie er von einer der auf dieser Schnittstelle definierten SVG_LENGTHTYPE_*-Konstanten angegeben wird. |
| [Value](../../aspose.svg.datatypes/svglength/value) { get; set; } | Der Wert als Fließkommawert in Benutzereinheiten. Das Festlegen dieses Attributs bewirkt, dass valueInSpecifiedUnits und valueAsString automatisch aktualisiert werden, um diese Einstellung widerzuspiegeln. |
| [ValueAsString](../../aspose.svg.datatypes/svglength/valueasstring) { get; set; } | Der Wert als Zeichenfolgenwert in den durch unitType ausgedrückten Einheiten. Das Festlegen dieses Attributs bewirkt, dass value, valueInSpecifiedUnits und unitType automatisch aktualisiert werden, um diese Einstellung widerzuspiegeln. |
| [ValueInSpecifiedUnits](../../aspose.svg.datatypes/svglength/valueinspecifiedunits) { get; set; } | Der Wert als Fließkommawert in den durch unitType ausgedrückten Einheiten. Das Festlegen dieses Attributs bewirkt, dass value und valueAsString automatisch aktualisiert werden, um diese Einstellung widerzuspiegeln. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [ConvertToSpecifiedUnits](../../aspose.svg.datatypes/svglength/converttospecifiedunits)(ushort) | Den gleichen zugrunde liegenden gespeicherten Wert beibehalten, aber die gespeicherte Einheitenkennung auf den angegebenen unitType zurücksetzen. Die Objektattribute unitType, valueInSpecifiedUnits und valueAsString können als Ergebnis dieser Methode geändert werden. Wenn der ursprüngliche Wert beispielsweise „0,5 cm“ war und die Methode aufgerufen wurde, um ihn in Millimeter umzuwandeln, würde der unitType in SVG_LENGTHTYPE_MM geändert, valueInSpecifiedUnits würde in den numerischen Wert 5 geändert und valueAsString würde in „5 mm“ geändert. |
| [Dispose](../../aspose.svg.datatypes/svgvaluetype/dispose)() | Gibt nicht verwaltete und – optional – verwaltete Ressourcen frei. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | Diese Methode wird zum Abrufen des ECMAScript-Objekts verwendetType . |
| [NewValueSpecifiedUnits](../../aspose.svg.datatypes/svglength/newvaluespecifiedunits)(ushort, float) | Setzt den Wert als Zahl mit einem zugeordneten unitType zurück und ersetzt dadurch die Werte für alle Attribute des Objekts. |
| override [ToString](../../aspose.svg.datatypes/svglength/tostring)() | Gibt a zurückString die diese Instanz darstellt. |

## Felder

| Name | Beschreibung |
| --- | --- |
| const [SVG_LENGTHTYPE_CM](../../aspose.svg.datatypes/svglength/svg_lengthtype_cm) | Ein Wert wurde mit den in CSS2 definierten cm-Einheiten angegeben. |
| const [SVG_LENGTHTYPE_EMS](../../aspose.svg.datatypes/svglength/svg_lengthtype_ems) | Ein Wert wurde mit den in CSS2 definierten em-Einheiten angegeben. |
| const [SVG_LENGTHTYPE_EXS](../../aspose.svg.datatypes/svglength/svg_lengthtype_exs) | Ein Wert wurde mit den in CSS2 definierten Ex-Einheiten angegeben. |
| const [SVG_LENGTHTYPE_IN](../../aspose.svg.datatypes/svglength/svg_lengthtype_in) | Ein Wert wurde mit den in CSS2 definierten in-Einheiten angegeben. |
| const [SVG_LENGTHTYPE_MM](../../aspose.svg.datatypes/svglength/svg_lengthtype_mm) | Ein Wert wurde mit den in CSS2 definierten mm-Einheiten angegeben. |
| const [SVG_LENGTHTYPE_NUMBER](../../aspose.svg.datatypes/svglength/svg_lengthtype_number) | Es wurde kein Einheitentyp angegeben (dh es wurde ein Wert ohne Einheit angegeben), was auf einen Wert in Benutzereinheiten hinweist. |
| const [SVG_LENGTHTYPE_PC](../../aspose.svg.datatypes/svglength/svg_lengthtype_pc) | Ein Wert wurde mit den in CSS2 definierten PC-Einheiten angegeben. |
| const [SVG_LENGTHTYPE_PERCENTAGE](../../aspose.svg.datatypes/svglength/svg_lengthtype_percentage) | Es wurde ein Prozentwert angegeben. |
| const [SVG_LENGTHTYPE_PT](../../aspose.svg.datatypes/svglength/svg_lengthtype_pt) | Ein Wert wurde mit den in CSS2 definierten pt-Einheiten angegeben. |
| const [SVG_LENGTHTYPE_PX](../../aspose.svg.datatypes/svglength/svg_lengthtype_px) | Ein Wert wurde mit den in CSS2 definierten px-Einheiten angegeben. |
| const [SVG_LENGTHTYPE_UNKNOWN](../../aspose.svg.datatypes/svglength/svg_lengthtype_unknown) | Der Einheitentyp ist keiner der vordefinierten Einheitentypen. Es ist ungültig, einen neuen Wert dieses Typs zu definieren oder einen vorhandenen Wert auf diesen Typ umzustellen. |

### Siehe auch

* class [SVGValueType](../svgvaluetype)
* namensraum [Aspose.Svg.DataTypes](../../aspose.svg.datatypes)
* Montage [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
