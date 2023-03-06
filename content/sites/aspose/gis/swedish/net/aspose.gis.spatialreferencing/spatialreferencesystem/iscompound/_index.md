---
title: SpatialReferenceSystem.IsCompound
second_title: Aspose.GIS för .NET API Referens
description: SpatialReferenceSystem fast egendom. Returnerar om denna SRS är sammansatt en förening av två SRS. Följande kombinationer av SRS i sammansatt SRS anses giltiga Geografisk SRS  Vertikal SRS i detta fall kommer typen av sammansatt SRS att varaGeographic . Projicerad SRS  Vertikal SRS i detta fall kommer typen av sammansatt SRS att varaProjected . Om kombinationen av SRS skiljer sig kommer typen av sammansatt SRS att varaUnknown .
type: docs
weight: 130
url: /sv/net/aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/
---
## SpatialReferenceSystem.IsCompound property

Returnerar om denna SRS är sammansatt (en förening av två SRS). Följande kombinationer av SRS i sammansatt SRS anses giltiga: Geografisk SRS + Vertikal SRS, i detta fall kommer typen av sammansatt SRS att varaGeographic . Projicerad SRS + Vertikal SRS, i detta fall kommer typen av sammansatt SRS att varaProjected . Om kombinationen av SRS skiljer sig, kommer typen av sammansatt SRS att varaUnknown .

```csharp
public virtual bool IsCompound { get; }
```

### Anmärkningar

I WKT är detta COMPD_CS.

### Se även

* class [SpatialReferenceSystem](../)
* namnutrymme [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* hopsättning [Aspose.GIS](../../../)


