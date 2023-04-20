---
title: Interface IMediaList
second_title: Aspose.SVG voor .NET API-referentie
description: Aspose.Svg.Dom.Css.IMediaList koppel. De MediaListinterface biedt de abstractie van een geordende verzameling media zonder te definiëren of te beperken hoe deze verzameling wordt geïmplementeerd. Een lege lijst is hetzelfde als een lijst die het medium all bevat.
type: docs
weight: 730
url: /nl/net/aspose.svg.dom.css/imedialist/
---
## IMediaList interface

De MediaList-interface biedt de abstractie van een geordende verzameling media, zonder te definiëren of te beperken hoe deze verzameling wordt geïmplementeerd. Een lege lijst is hetzelfde als een lijst die het medium "all" bevat.

```csharp
public interface IMediaList : IEnumerable<string>
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Item](../../aspose.svg.dom.css/imedialist/item/) { get; } | Geeft als resultaat de index in de lijst. Als de index groter is dan of gelijk is aan het aantal media in de lijst, retourneert dit null. De media-index. |
| [Length](../../aspose.svg.dom.css/imedialist/length/) { get; } | Het aantal media in de lijst. Het bereik van geldige media is 0 tot en met lengte-1. |
| [MediaText](../../aspose.svg.dom.css/imedialist/mediatext/) { get; } | De ontleedbare tekstweergave van de medialijst. Dit is een door komma's gescheiden lijst met media. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [AppendMedium](../../aspose.svg.dom.css/imedialist/appendmedium/)(string) | Voegt het medium newMedium toe aan het einde van de lijst. Als het nieuweMedium al in gebruik is, wordt het eerst verwijderd. |
| [DeleteMedium](../../aspose.svg.dom.css/imedialist/deletemedium/)(string) | Verwijdert het medium aangegeven door oldMedium uit de lijst. |

### Zie ook

* naamruimte [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* montage [Aspose.SVG](../../)


