---
title: Map.Extent
second_title: .NET API 참조를 위한 Aspose.GIS
description: Map 재산. 렌더링할 지도의 경계를 지정합니다. 다음으로 설정한 경우null  범위는 렌더링 중에 모든 레이어의 모든 형상을 포함하도록 계산됩니다.
type: docs
weight: 40
url: /ko/net/aspose.gis.rendering/map/extent/
---
## Map.Extent property

렌더링할 지도의 경계를 지정합니다. 다음으로 설정한 경우`null` , 범위는 렌더링 중에 모든 레이어의 모든 형상을 포함하도록 계산됩니다.

```csharp
public Extent Extent { get; set; }
```

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentException | [`IsValid`](../../../aspose.gis/extent/isvalid/) ~이다`false`.[`Width`](../../../aspose.gis/extent/width/) 0보다 작거나 같습니다.[`Height`](../../../aspose.gis/extent/height/) 0보다 작거나 같습니다.[`SpatialReferenceSystem`](../../../aspose.gis/extent/spatialreferencesystem/) ~이다`null`. |

### 비고

익스텐트의 공간 참조 시스템이 맵의 공간 참조 시스템과 같지 않으면 렌더링하는 동안 익스텐트가 대상 공간 참조 시스템으로 변환됩니다.

### 또한보십시오

* class [Extent](../../../aspose.gis/extent/)
* class [Map](../)
* 네임스페이스 [Aspose.Gis.Rendering](../../map/)
* 집회 [Aspose.GIS](../../../)


