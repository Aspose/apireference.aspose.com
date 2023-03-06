---
title: XyzTiles.GetTiles
second_title: .NET API 참조를 위한 Aspose.GIS
description: XyzTiles 방법. 공간 경계 상자 및 확대/축소 수준으로 타일을 로드합니다.
type: docs
weight: 40
url: /ko/net/aspose.gis.formats.xyztile/xyztiles/gettiles/
---
## XyzTiles.GetTiles method

공간 경계 상자 및 확대/축소 수준으로 타일을 로드합니다.

```csharp
public IEnumerable<WebTile> GetTiles(int zoom, Extent extent)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| zoom | Int32 | 타일을 로드하기 위한 확대/축소 수준입니다. 가장 높은 확대/축소 수준은 0입니다. 대부분의 타일 공급자는 약 22개의 최대 확대/축소 수준이 있습니다. |
| extent | Extent | 타일을 로드할 경계 상자입니다. 누락된 경우 Wgs84 공간 참조가 사용됩니다. |

### 반환 값

웹 타일.

### 또한보십시오

* class [WebTile](../../../aspose.gis.raster.web/webtile/)
* class [Extent](../../../aspose.gis/extent/)
* class [XyzTiles](../)
* 네임스페이스 [Aspose.Gis.Formats.XyzTile](../../xyztiles/)
* 집회 [Aspose.GIS](../../../)


