---
title: Interface ICircularString
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.Geometries.ICircularString koppel. Een curve met meerdere hoekpunten met circulaire interpolatie tussen punten.
type: docs
weight: 960
url: /nl/net/aspose.gis.geometries/icircularstring/
---
## ICircularString interface

Een curve met meerdere hoekpunten met circulaire interpolatie tussen punten.

```csharp
public interface ICircularString : ICurve, IEquatable<ICircularString>, IReadOnlyList<IPoint>
```

## methoden

| Naam | Beschrijving |
| --- | --- |
| [ToEditable](../../aspose.gis.geometries/icircularstring/toeditable/)() | Krijgt een bewerkbare kopie van deze geometrie. |

### Opmerkingen

De`Circulaire tekenreeks` bestaat uit een of meer cirkelboogsegmenten die met de uiteinden aan elkaar zijn verbonden. De eerste drie punten definiëren het eerste segment. Het eerste punt is het beginpunt van de boog. Het tweede punt is elk tussenliggend punt op de boog behalve het begin- of eindpunt. Het derde punt is het einde van de boog. Volgende bogen worden alleen gedefinieerd door hun tussen- en eindpunten, aangezien het startpunt impliciet wordt gedefinieerd als het eindpunt van het vorige segment.

### Zie ook

* interface [ICurve](../icurve/)
* interface [IPoint](../ipoint/)
* naamruimte [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* montage [Aspose.GIS](../../)


