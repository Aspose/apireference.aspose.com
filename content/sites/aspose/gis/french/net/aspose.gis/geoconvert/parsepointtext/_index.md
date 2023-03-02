---
title: GeoConvert.ParsePointText
second_title: Référence de l'API Aspose.GIS pour .NET
description: GeoConvert méthode. Convertit la chaîne contenant les coordonnées en objet IPoint.
type: docs
weight: 20
url: /fr/net/aspose.gis/geoconvert/parsepointtext/
---
## GeoConvert.ParsePointText method

Convertit la chaîne contenant les coordonnées en objet IPoint.

```csharp
public static IPoint ParsePointText(string text)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| text | String | Une chaîne contenant les coordonnées à convertir. La chaîne doit contenir à la fois la latitude et la longitude. Les coordonnées doivent être séparées par des espaces, des virgules ou des points-virgules. |

### Return_Value

Objet IPoint avec des coordonnées équivalentes à la chaîne d'entrée.

### Exceptions

| exception | condition |
| --- | --- |
| [GisException](../../gisexception/) |  |

### Remarques

Exemples : "80° 151°", "74°50.82', 172°08.21'", "80°;151°", "2CMB", "2CMB6682893142", "2C MB 66828 93142", "WMAQ12405535".

### Voir également

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [GeoConvert](../)
* espace de noms [Aspose.Gis](../../geoconvert/)
* Assemblée [Aspose.GIS](../../../)


