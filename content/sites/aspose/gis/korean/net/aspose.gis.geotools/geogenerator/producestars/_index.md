---
title: GeoGenerator.ProduceStars
second_title: .NET API 참조를 위한 Aspose.GIS
description: GeoGenerator 방법. 주어진 범위 내에서 모두 별 배열을 생성합니다.
type: docs
weight: 40
url: /ko/net/aspose.gis.geotools/geogenerator/producestars/
---
## GeoGenerator.ProduceStars method

주어진 범위 내에서 모두 별 배열을 생성합니다.

```csharp
public static IEnumerable<IPolygon> ProduceStars(Extent rect, StarGeneratorOptions options)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| rect | Extent | 지정된 지역(참조[`정도`](../../../aspose.gis/extent/)) |
| options | StarGeneratorOptions | 다각형 생성 옵션(참조[`StarGenerator 옵션`](../../stargeneratoroptions/)) |

### 반환 값

별의 배열(열거 참조[`아이폴리곤`](../../../aspose.gis.geometries/ipolygon/))

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentOutOfRangeException | 별의 수는 1보다 강해야 합니다. |
| NullReferenceException | 범위에 값이 있어야 합니다(NULL이 아님). |
| ArgumentException | 최소 및 최대 길이는 같지 않고 3보다 커야 합니다. |
| ArgumentException | 최대 길이는 최소 길이보다 커야 합니다. |

### 또한보십시오

* interface [IPolygon](../../../aspose.gis.geometries/ipolygon/)
* class [Extent](../../../aspose.gis/extent/)
* class [StarGeneratorOptions](../../stargeneratoroptions/)
* class [GeoGenerator](../)
* 네임스페이스 [Aspose.Gis.GeoTools](../../geogenerator/)
* 집회 [Aspose.GIS](../../../)


