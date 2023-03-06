---
title: MapInfoInterchangeOptions.TextStringAttribute
second_title: Aspose.GIS für .NET-API-Referenz
description: MapInfoInterchangeOptions eigendom. Gibt den Namen des Attributs an das den Text des grafischen Objekts Text darstellt.
type: docs
weight: 20
url: /de/net/aspose.gis.formats.mapinfointerchange/mapinfointerchangeoptions/textstringattribute/
---
## MapInfoInterchangeOptions.TextStringAttribute property

Gibt den Namen des Attributs an, das den Text des grafischen Objekts „Text“ darstellt.

```csharp
public string TextStringAttribute { get; set; }
```

### Bemerkungen

MapInfo Interchange Format gibt ein grafisches Objekt des Typs „Text“ an. Das grafische Objekt „Text“ repräsentiert eine Beschriftung auf einer Karte. Wir exportieren 'Text'-Grafikobjekte als a[`Feature`](../../../aspose.gis/feature/) mit[`Polygon`](../../../aspose.gis.geometries/polygon/) Geometrie, die das Label begrenzt. Der Text des Labels wird exportiert als[`FeatureAttribute`](../../../aspose.gis/featureattribute/) . Diese Eigenschaft gibt den Namen des Attributs an, das verwendet wird, um den Text des Etiketts zu exportieren. Der Standardwert ist`"Textzeichenfolge"` .

### Siehe auch

* class [MapInfoInterchangeOptions](../)
* namensraum [Aspose.Gis.Formats.MapInfoInterchange](../../mapinfointerchangeoptions/)
* Montage [Aspose.GIS](../../../)


