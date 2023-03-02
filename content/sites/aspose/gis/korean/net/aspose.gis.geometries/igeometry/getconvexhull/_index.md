---
title: IGeometry.GetConvexHull
second_title: .NET API 참조를 위한 Aspose.GIS
description: IGeometry 방법. 이 형상의 볼록 껍질을 계산합니다.
type: docs
weight: 220
url: /ko/net/aspose.gis.geometries/igeometry/getconvexhull/
---
## IGeometry.GetConvexHull method

이 형상의 볼록 껍질을 계산합니다.

```csharp
public IGeometry GetConvexHull()
```

### 반환 값

이 도형의 볼록 껍질을 나타내는 도형입니다. 이 도형에 점이 없으면 결과는[`Null`](../../geometry/null/) . 이 도형에 점이 하나만 있는 경우 결과는 이 점입니다. 이 도형에 점이 두 개만 있는 경우 결과는 다음과 같습니다.[`ILineString`](../../ilinestring/) with the points. 이 도형에 3개 이상의 점이 있으면 결과는[`ILinearRing`](../../ilinearring/) 모든 형상 점 주변의 convex 선체를 나타냅니다.

### 또한보십시오

* interface [IGeometry](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../igeometry/)
* 집회 [Aspose.GIS](../../../)


