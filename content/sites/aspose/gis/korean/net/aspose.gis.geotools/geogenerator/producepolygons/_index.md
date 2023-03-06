---
title: GeoGenerator.ProducePolygons
second_title: .NET API 참조를 위한 Aspose.GIS
description: GeoGenerator 방법. 지정된 수의 무작위 항목으로 새 IPolygon Enumerator를 생성합니다. 모두 지정된 범위 내에 있습니다.
type: docs
weight: 30
url: /ko/net/aspose.gis.geotools/geogenerator/producepolygons/
---
## GeoGenerator.ProducePolygons method

지정된 수의 무작위 항목으로 새 IPolygon Enumerator를 생성합니다. 모두 지정된 범위 내에 있습니다.

```csharp
public static IEnumerable<IPolygon> ProducePolygons(Extent rect, PolygonGeneratorOptions options)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| rect | Extent | 지정된 지역(참조[`정도`](../../../aspose.gis/extent/)) |
| options | PolygonGeneratorOptions | 다각형 생성 옵션(참조[`다각형 생성기 옵션`](../../polygongeneratoroptions/)) |

### 반환 값

폴리곤의 배열(열거 참조)[`아이폴리곤`](../../../aspose.gis.geometries/ipolygon/))

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentOutOfRangeException | 다각형의 수는 1보다 커야 합니다. |
| NullReferenceException | 범위에 값이 있어야 합니다(NULL이 아님). |
| ArgumentException | 최소 및 최대 길이는 같지 않고 0보다 커야 합니다. |
| ArgumentException | 최대 길이는 최소 길이보다 커야 합니다. |

### 또한보십시오

* interface [IPolygon](../../../aspose.gis.geometries/ipolygon/)
* class [Extent](../../../aspose.gis/extent/)
* class [PolygonGeneratorOptions](../../polygongeneratoroptions/)
* class [GeoGenerator](../)
* 네임스페이스 [Aspose.Gis.GeoTools](../../geogenerator/)
* 집회 [Aspose.GIS](../../../)


