---
title: GeoGenerator.ProduceLines
second_title: .NET API 참조를 위한 Aspose.GIS
description: GeoGenerator 방법. 지정된 수의 임의 항목으로 새 ILineString Enumerator를 생성합니다. 모든 항목은 지정된 범위 내에 있습니다.
type: docs
weight: 10
url: /ko/net/aspose.gis.geotools/geogenerator/producelines/
---
## GeoGenerator.ProduceLines method

지정된 수의 임의 항목으로 새 ILineString Enumerator를 생성합니다. 모든 항목은 지정된 범위 내에 있습니다.

```csharp
public static IEnumerable<ILineString> ProduceLines(Extent rect, LineGeneratorOptions options)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| rect | Extent | 지정된 지역(참조[`정도`](../../../aspose.gis/extent/)) |
| options | LineGeneratorOptions | 라인 생성 옵션(참조[`라인 생성기 옵션`](../../linegeneratoroptions/)) |

### 반환 값

라인 배열(열거 참조)[`ILineString`](../../../aspose.gis.geometries/ilinestring/))

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentOutOfRangeException | 라인 수는 1보다 커야 합니다. |
| NullReferenceException | 범위에 값이 있어야 합니다(NULL이 아님). |

### 또한보십시오

* interface [ILineString](../../../aspose.gis.geometries/ilinestring/)
* class [Extent](../../../aspose.gis/extent/)
* class [LineGeneratorOptions](../../linegeneratoroptions/)
* class [GeoGenerator](../)
* 네임스페이스 [Aspose.Gis.GeoTools](../../geogenerator/)
* 집회 [Aspose.GIS](../../../)


