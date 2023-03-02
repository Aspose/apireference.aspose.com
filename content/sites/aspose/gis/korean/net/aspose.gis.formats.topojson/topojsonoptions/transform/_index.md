---
title: TopoJsonOptions.Transform
second_title: .NET API 참조를 위한 Aspose.GIS
description: TopoJsonOptions 재산. 출력 TopoJSON. 에서 좌표를 양자화하고 호를 델타 인코딩하는 데 사용할 변환 개체를 지정합니다.
type: docs
weight: 60
url: /ko/net/aspose.gis.formats.topojson/topojsonoptions/transform/
---
## TopoJsonOptions.Transform property

출력 TopoJSON. 에서 좌표를 양자화하고 호를 델타 인코딩하는 데 사용할 변환 개체를 지정합니다.

```csharp
public TopoJsonTransform Transform { get; set; }
```

### 비고

이것은 쓰기 옵션입니다. 읽기에는 영향을 주지 않습니다. 이 옵션은[`QuantizationNumber`](../quantizationnumber/) - 이 두 가지 옵션 중 하나만 사용할 수 없습니다.`null` . 그렇지 않은 경우`null` - 출력 TopoJSON 좌표는 양자화되고 아크는 지정된 변환 개체로 델타 인코딩됩니다. 변환 개체에 대한 자세한 내용은 TopoJSON 사양을 참조하십시오. 기본값은 다음과 같습니다.`null` .

### 또한보십시오

* class [TopoJsonTransform](../../topojsontransform/)
* class [TopoJsonOptions](../)
* 네임스페이스 [Aspose.Gis.Formats.TopoJson](../../topojsonoptions/)
* 집회 [Aspose.GIS](../../../)


