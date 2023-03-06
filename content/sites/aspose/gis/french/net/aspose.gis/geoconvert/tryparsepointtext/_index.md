---
title: GeoConvert.TryParsePointText
second_title: Référence de l'API Aspose.GIS pour .NET
description: GeoConvert méthode. Convertit la chaîne qui contient les coordonnées en objet IPoint. Une valeur de retour indique si la conversion a réussi ou échoué.
type: docs
weight: 30
url: /fr/net/aspose.gis/geoconvert/tryparsepointtext/
---
## GeoConvert.TryParsePointText method

Convertit la chaîne qui contient les coordonnées en objet IPoint. Une valeur de retour indique si la conversion a réussi ou échoué.

```csharp
public static bool TryParsePointText(string text, out IPoint point)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| text | String | Une chaîne contenant les coordonnées à convertir. La chaîne doit contenir à la fois la latitude et la longitude. Les coordonnées doivent être séparées par des espaces, des virgules ou des points-virgules. |
| point | IPoint& | Lorsque cette méthode revient, contient l'objet IPoint avec les coordonnées analysées, si la conversion a réussi, ou null si la conversion a échoué. |

### Return_Value

Vrai si le texte a été analysé avec succès, sinon Faux.

### Remarques

Exemples : "80° 151°", "74°50.82', 172°08.21'", "80°;151°", "2CMB", "2CMB6682893142", "2C MB 66828 93142", "WMAQ12405535".

### Voir également

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [GeoConvert](../)
* espace de noms [Aspose.Gis](../../geoconvert/)
* Assemblée [Aspose.GIS](../../../)


