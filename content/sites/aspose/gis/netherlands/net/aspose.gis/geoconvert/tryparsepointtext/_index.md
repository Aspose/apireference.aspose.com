---
title: GeoConvert.TryParsePointText
second_title: Aspose.GIS voor .NET API-referentie
description: GeoConvert methode. Converteert de tekenreeks die coördinaten bevat naar een IPointobject. Een geretourneerde waarde geeft aan of de conversie is geslaagd of mislukt.
type: docs
weight: 30
url: /nl/net/aspose.gis/geoconvert/tryparsepointtext/
---
## GeoConvert.TryParsePointText method

Converteert de tekenreeks die coördinaten bevat naar een IPoint-object. Een geretourneerde waarde geeft aan of de conversie is geslaagd of mislukt.

```csharp
public static bool TryParsePointText(string text, out IPoint point)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| text | String | Een tekenreeks die de te converteren coördinaten bevat. De tekenreeks moet zowel de breedte- als de lengtegraad van de coördinaten bevatten. Coördinaten moeten worden gescheiden door spaties, komma's of puntkomma's. |
| point | IPoint& | Wanneer deze methode terugkeert, bevat het IPoint-object met geparseerde coördinaten, als de conversie is gelukt, of null als de conversie is mislukt. |

### Winstwaarde

Waar als de tekst met succes is geparseerd, anders Onwaar.

### Opmerkingen

Voorbeelden: "80° 151°", "74°50.82', 172°08.21'", "80°;151°", "2CMB", "2CMB6682893142", "2C MB 66828 93142", "WMAQ12405535".

### Zie ook

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [GeoConvert](../)
* naamruimte [Aspose.Gis](../../geoconvert/)
* montage [Aspose.GIS](../../../)


