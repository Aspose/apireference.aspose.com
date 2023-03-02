---
title: FileGdbOptions.XYTolerance
second_title: Référence de l'API Aspose.GIS pour .NET
description: FileGdbOptions propriété. Tolérance daccrochage X et Y.
type: docs
weight: 70
url: /fr/net/aspose.gis.formats.filegdb/filegdboptions/xytolerance/
---
## FileGdbOptions.XYTolerance property

Tolérance d'accrochage X et Y.

```csharp
public double? XYTolerance { get; set; }
```

### Remarques

Il s'agit d'une option de création qui n'affecte pas la lecture. Ce paramètre contrôle une tolérance d'accrochage utilisée pour les entités ArcGIS avancées. Il n'affecte pas le comportement d'Aspose.GIS, mais il peut être utilisé par ArcGIS. L'unité du paramètre est l'unité du système de référence spatiale. Si défini sur`null` la valeur par défaut est utilisée. La valeur par défaut dépend du système de référence spatiale et est égale à 0,000000008983153 degrés pour les systèmes géographiques ou 0,001 mètre pour les systèmes projetés (les valeurs sont transformées en unités de système de référence spatiale). Si le système de référence spatiale est inconnu, la valeur par défaut est 0,001.

### Voir également

* class [FileGdbOptions](../)
* espace de noms [Aspose.Gis.Formats.FileGdb](../../filegdboptions/)
* Assemblée [Aspose.GIS](../../../)


