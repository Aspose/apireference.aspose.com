---
title: Extent.GetTransformed
second_title: .NET API 참조를 위한 Aspose.GIS
description: Extent 방법. 지정된 새 범위를 반환합니다.SpatialReferenceSystem 이 범위를 포함하는 .
type: docs
weight: 150
url: /ko/net/aspose.gis/extent/gettransformed/
---
## Extent.GetTransformed method

지정된 새 범위를 반환합니다.[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) 이 범위를 포함하는 .

```csharp
public Extent GetTransformed(SpatialReferenceSystem targetSrs)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| targetSrs | SpatialReferenceSystem | [`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) 로 변신합니다. |

### 반환 값

지정된 SRS로 이 정도 변환한 결과.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null` . |
| NotSupportedException | 제공된 SRS로의 변환은 지원되지 않습니다. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | 변환에 실패했습니다. |
| InvalidOperationException | [`SpatialReferenceSystem`](../spatialreferencesystem/) 이 정도는`null` . |

### 또한보십시오

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Extent](../)
* 네임스페이스 [Aspose.Gis](../../extent/)
* 집회 [Aspose.GIS](../../../)


