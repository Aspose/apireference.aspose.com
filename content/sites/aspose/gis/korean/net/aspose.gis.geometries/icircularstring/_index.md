---
title: Interface ICircularString
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.Geometries.ICircularString 상호 작용. 점 사이에 원형 보간이 있는 다중 꼭지점 곡선입니다.
type: docs
weight: 960
url: /ko/net/aspose.gis.geometries/icircularstring/
---
## ICircularString interface

점 사이에 원형 보간이 있는 다중 꼭지점 곡선입니다.

```csharp
public interface ICircularString : ICurve, IEquatable<ICircularString>, IReadOnlyList<IPoint>
```

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [ToEditable](../../aspose.gis.geometries/icircularstring/toeditable/)() | 이 지오메트리의 편집 가능한 복사본을 가져옵니다. |

### 비고

`원형 문자열` 끝과 끝이 연결된 하나 이상의 원호 세그먼트로 구성됩니다. 처음 세 점은 첫 번째 세그먼트를 정의합니다. 첫 번째 점은 호의 시작점입니다. 두 번째 점은 시작점 또는 끝점을 제외한 호의 중간점입니다. 세 번째 점은 호의 끝점입니다. 후속 호는 중간 및 끝점에 의해서만 정의되며, 시작점이 암시적으로 이전 세그먼트의 끝점으로 정의되기 때문에

### 또한보십시오

* interface [ICurve](../icurve/)
* interface [IPoint](../ipoint/)
* 네임스페이스 [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* 집회 [Aspose.GIS](../../)


