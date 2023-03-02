---
title: TopoJsonOptions.QuantizationNumber
second_title: .NET API 참조를 위한 Aspose.GIS
description: TopoJsonOptions 재산. 출력 TopoJSON에서 좌표를 양자화하고 호를 델타 인코딩하는 데 사용할 양자화 번호를 지정합니다.
type: docs
weight: 50
url: /ko/net/aspose.gis.formats.topojson/topojsonoptions/quantizationnumber/
---
## TopoJsonOptions.QuantizationNumber property

출력 TopoJSON에서 좌표를 양자화하고 호를 델타 인코딩하는 데 사용할 양자화 번호를 지정합니다.

```csharp
public int? QuantizationNumber { get; set; }
```

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentOutOfRangeException | 인수가 2보다 작습니다. |

### 비고

이것은 쓰기 옵션입니다. 읽기에는 영향을 주지 않습니다. 이 옵션은[`Transform`](../transform/) - 이 두 가지 옵션 중 하나만 사용할 수 없습니다.`null` . 그렇지 않은 경우`null` - 출력 TopoJSON 좌표는 양자화되고 아크는 specified 양자화 번호로 델타 인코딩됩니다. 양자화 수는 결과 양자화 좌표에서 차원 당 표현할 수 있는 최대 값 수를 결정합니다. 일반적으로 10의 거듭제곱이 선택됩니다. 기본값은`null` .

### 또한보십시오

* class [TopoJsonOptions](../)
* 네임스페이스 [Aspose.Gis.Formats.TopoJson](../../topojsonoptions/)
* 집회 [Aspose.GIS](../../../)


