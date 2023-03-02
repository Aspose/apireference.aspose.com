---
title: GeoConvert.ParsePointText
second_title: Aspose.GIS für .NET-API-Referenz
description: GeoConvert methode. Konvertiert die Zeichenfolge die Koordinaten enthält in ein IPointObjekt.
type: docs
weight: 20
url: /de/net/aspose.gis/geoconvert/parsepointtext/
---
## GeoConvert.ParsePointText method

Konvertiert die Zeichenfolge, die Koordinaten enthält, in ein IPoint-Objekt.

```csharp
public static IPoint ParsePointText(string text)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| text | String | Eine Zeichenfolge, die umzuwandelnde Koordinaten enthält. Die Zeichenfolge sollte sowohl Breiten- als auch Längenkoordinaten enthalten. Koordinaten sollten durch Leerzeichen, Komma oder Semikolon getrennt werden. |

### Rückgabewert

IPoint-Objekt mit Koordinaten, die der Eingabezeichenfolge entsprechen.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| [GisException](../../gisexception/) |  |

### Bemerkungen

Beispiele: "80° 151°", "74°50.82', 172°08.21'", "80°;151°", "2CMB", "2CMB6682893142", "2C MB 66828 93142", "WMAQ12405535".

### Siehe auch

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [GeoConvert](../)
* namensraum [Aspose.Gis](../../geoconvert/)
* Montage [Aspose.GIS](../../../)


