---
title: GeoGenerator.ProducePoints
second_title: .NET API 참조를 위한 Aspose.GIS
description: GeoGenerator 방법. 지정된 영역에 속하는 포인트 배열을 생성합니다.
type: docs
weight: 20
url: /ko/net/aspose.gis.geotools/geogenerator/producepoints/
---
## GeoGenerator.ProducePoints method

지정된 영역에 속하는 포인트 배열을 생성합니다.

```csharp
public static IEnumerable<IGeometry> ProducePoints(Extent rect, PointGeneratorOptions options)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| rect | Extent | 지정된 지역(참조[`정도`](../../../aspose.gis/extent/)). |
| options | PointGeneratorOptions | 점 생성 옵션(참조[`포인트 생성기 옵션`](../../pointgeneratoroptions/)). |

### 반환 값

점의 배열(열거 참조[`I기하학`](../../../aspose.gis.geometries/igeometry/)).

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentOutOfRangeException | 포인트의 수는 1보다 커야 합니다. |
| NullReferenceException | 익스텐트에는 값이 있어야 합니다(NULL이 아님). |

### 또한보십시오

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../../../aspose.gis/extent/)
* class [PointGeneratorOptions](../../pointgeneratoroptions/)
* class [GeoGenerator](../)
* 네임스페이스 [Aspose.Gis.GeoTools](../../geogenerator/)
* 집회 [Aspose.GIS](../../../)


