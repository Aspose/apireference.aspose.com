---
title: SpatialReferenceSystemTransformation.Transform
second_title: .NET API 참조를 위한 Aspose.GIS
description: SpatialReferenceSystemTransformation 방법. 소스 공간 참조 시스템에서 대상 공간 참조 시스템으로 형상을 변환합니다.
type: docs
weight: 40
url: /ko/net/aspose.gis.spatialreferencing/spatialreferencesystemtransformation/transform/
---
## SpatialReferenceSystemTransformation.Transform method

소스 공간 참조 시스템에서 대상 공간 참조 시스템으로 형상을 변환합니다.

```csharp
public Geometry Transform(IGeometry geometry)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| geometry | IGeometry | 변환할 형상입니다. |

### 반환 값

대상 공간 참조 시스템의 새 지오메트리.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 기하학은`null` . |
| ArgumentException | 기하학[`SpatialReferenceSystem`](../../../aspose.gis.geometries/igeometry/spatialreferencesystem/) 아니다`null` 그리고 와 동등하지 않습니다.[`Source`](../source/) |
| [TransformationException](../../transformationexception/) | 변환에 실패했습니다. |

### 또한보십시오

* class [Geometry](../../../aspose.gis.geometries/geometry/)
* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [SpatialReferenceSystemTransformation](../)
* 네임스페이스 [Aspose.Gis.SpatialReferencing](../../spatialreferencesystemtransformation/)
* 집회 [Aspose.GIS](../../../)


