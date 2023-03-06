---
title: GeoConvert.ParsePointText
second_title: Aspose.GIS voor .NET API-referentie
description: GeoConvert methode. Converteert de tekenreeks die сoordinaten bevat naar een IPointobject.
type: docs
weight: 20
url: /nl/net/aspose.gis/geoconvert/parsepointtext/
---
## GeoConvert.ParsePointText method

Converteert de tekenreeks die сoordinaten bevat naar een IPoint-object.

```csharp
public static IPoint ParsePointText(string text)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| text | String | Een tekenreeks die de te converteren coördinaten bevat. De tekenreeks moet zowel de breedte- als de lengtegraad van de coördinaten bevatten. Coördinaten moeten worden gescheiden door spaties, komma's of puntkomma's. |

### Winstwaarde

IPoint-object met coördinaten die gelijk zijn aan de invoertekenreeks.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| [GisException](../../gisexception/) |  |

### Opmerkingen

Voorbeelden: "80° 151°", "74°50.82', 172°08.21'", "80°;151°", "2CMB", "2CMB6682893142", "2C MB 66828 93142", "WMAQ12405535".

### Zie ook

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [GeoConvert](../)
* naamruimte [Aspose.Gis](../../geoconvert/)
* montage [Aspose.GIS](../../../)


