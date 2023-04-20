---
title: Interface ITrueTypeFont
second_title: Référence de l'API Aspose.SVG pour .NET
description: Aspose.Svg.Drawing.ITrueTypeFont interface. Déclare des méthodes pour travailler avec la police TrueType.
type: docs
weight: 1510
url: /fr/net/aspose.svg.drawing/itruetypefont/
---
## ITrueTypeFont interface

Déclare des méthodes pour travailler avec la police TrueType.

```csharp
public interface ITrueTypeFont
```

## Propriétés

| Nom | La description |
| --- | --- |
| [DataSize](../../aspose.svg.drawing/itruetypefont/datasize/) { get; } | Renvoie la taille des données de police en octets |
| [FamilyName](../../aspose.svg.drawing/itruetypefont/familyname/) { get; } | Obtenir le nom de la famille de polices. |
| [FullFontName](../../aspose.svg.drawing/itruetypefont/fullfontname/) { get; } | Cela devrait être une combinaison de "FamilyName" et "SubFamilyName". Exception : si la police est "Regular" comme indiqué dans "SubFamilyName", alors n'utilisez que le nom de famille contenu dans "FamilyName". Une exception à la définition ci-dessus du nom complet de la police concerne les chaînes de plate-forme Microsoft pour les polices CFF OpenType : dans ce cas, la chaîne du nom complet de la police doit être identique au nom de police PostScript dans l'INDEX des noms CFF. |
| [SubFamilyName](../../aspose.svg.drawing/itruetypefont/subfamilyname/) { get; } | Le nom de la sous-famille de polices distingue la police dans un groupe avec le même nom de famille de polices. Ceci est supposé traiter le style (italique, oblique) et le poids (léger, gras, noir, etc.). Une police sans différences particulières de poids ou de style (par exemple poids moyen, non italique et fsSelection bit 6 défini) doit avoir la chaîne "Regular" stockée à cette position. |

## Méthodes

| Nom | La description |
| --- | --- |
| [GetAscent](../../aspose.svg.drawing/itruetypefont/getascent/)(float) | Renvoie l'ascension, en points. |
| [GetData](../../aspose.svg.drawing/itruetypefont/getdata/)() | Ouvrez le flux avec les données de police. L'appelant est responsable de la suppression du flux. |
| [GetDescent](../../aspose.svg.drawing/itruetypefont/getdescent/)(float) | Renvoie la descente, en points. |

### Voir également

* espace de noms [Aspose.Svg.Drawing](../../aspose.svg.drawing/)
* Assemblée [Aspose.SVG](../../)


