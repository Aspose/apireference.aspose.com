---
title: SpatialReferenceSystem.IsCompound
second_title: Aspose.GIS for .NET API リファレンス
description: SpatialReferenceSystem 財産. この SRS が複合 2 つの SRS の和集合 であるかどうかを返します 複合 SRS の次の SRS の組み合わせが有効と見なされますGeographic . 投影 SRS  垂直 SRSこの場合複合 SRS のタイプは次のようになりますProjected . SRSの組み合わせが異なる場合複合SRSの種類はUnknown .
type: docs
weight: 130
url: /ja/net/aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/
---
## SpatialReferenceSystem.IsCompound property

この SRS が複合 (2 つの SRS の和集合) であるかどうかを返します。 複合 SRS の次の SRS の組み合わせが有効と見なされます:Geographic . 投影 SRS + 垂直 SRS。この場合、複合 SRS のタイプは次のようになります。Projected . SRSの組み合わせが異なる場合、複合SRSの種類はUnknown .

```csharp
public virtual bool IsCompound { get; }
```

### 備考

WKT では、これは COMPD_CS. です。

### 関連項目

* class [SpatialReferenceSystem](../)
* 名前空間 [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* 組み立て [Aspose.GIS](../../../)


