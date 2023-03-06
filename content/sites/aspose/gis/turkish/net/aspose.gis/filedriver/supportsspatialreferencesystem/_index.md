---
title: FileDriver.SupportsSpatialReferenceSystem
second_title: Aspose.GIS for .NET API Referansı
description: FileDriver yöntem. Belirtilen uzamsal referans sisteminin sürücü tarafından desteklenip desteklenmediğini belirler.
type: docs
weight: 100
url: /tr/net/aspose.gis/filedriver/supportsspatialreferencesystem/
---
## FileDriver.SupportsSpatialReferenceSystem method

Belirtilen uzamsal referans sisteminin sürücü tarafından desteklenip desteklenmediğini belirler.

```csharp
public abstract bool SupportsSpatialReferenceSystem(SpatialReferenceSystem spatialReferenceSystem)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| spatialReferenceSystem | SpatialReferenceSystem | Mekansal referans sistemi. |

### Geri dönüş değeri

Belirtilen uzamsal referans sisteminin sürücü tarafından desteklenip desteklenmediğini gösteren Boole değeri. `null` herhangi bir sürücü tarafından desteklendiği kabul edilir.

### Notlar

Uzamsal referans sistemi desteklenmiyorsa ve bunu[`CreateLayer`](../createlayer/) yöntem, birNotSupportedException atılacak.

### Ayrıca bakınız

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* ad alanı [Aspose.Gis](../../filedriver/)
* toplantı [Aspose.GIS](../../../)


