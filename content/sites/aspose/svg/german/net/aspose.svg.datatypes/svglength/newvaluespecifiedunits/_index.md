---
title: SVGLength.NewValueSpecifiedUnits
second_title: Aspose.SVG für .NET-API-Referenz
description: SVGLength methode. Setzt den Wert als Zahl mit einem zugeordneten unitType zurück und ersetzt dadurch die Werte für alle Attribute des Objekts.
type: docs
weight: 60
url: /de/net/aspose.svg.datatypes/svglength/newvaluespecifiedunits/
---
## SVGLength.NewValueSpecifiedUnits method

Setzt den Wert als Zahl mit einem zugeordneten unitType zurück und ersetzt dadurch die Werte für alle Attribute des Objekts.

```csharp
public void NewValueSpecifiedUnits(ushort unitType, float valueInSpecifiedUnits)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| unitType | UInt16 | Der Einheitentyp für den Wert. |
| valueInSpecifiedUnits | Single | Der neue Wert.. |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | -Code[`NOT_SUPPORTED_ERR`](../../../aspose.svg.dom/domexception/not_supported_err/) Wird ausgelöst, wenn unitType SVG_LENGTHTYPE_UNKNOWN oder keine gültige Einheitstypkonstante ist (eine der anderen SVG_LENGTHTYPE_*-Konstanten, die auf dieser Schnittstelle definiert sind). |
| [DOMException](../../../aspose.svg.dom/domexception/) | -Code[`NO_MODIFICATION_ALLOWED_ERR`](../../../aspose.svg.dom/domexception/no_modification_allowed_err/) Wird ausgelöst, wenn die Länge einem schreibgeschützten Attribut entspricht oder wenn das Objekt selbst schreibgeschützt ist. |

### Siehe auch

* class [SVGLength](../)
* namensraum [Aspose.Svg.DataTypes](../../svglength/)
* Montage [Aspose.SVG](../../../)


