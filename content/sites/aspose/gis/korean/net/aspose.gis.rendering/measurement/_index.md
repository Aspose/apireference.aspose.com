---
title: Struct Measurement
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.Rendering.Measurement 구조체. 렌더 측정을 나타내는 숫자입니다.
type: docs
weight: 1740
url: /ko/net/aspose.gis.rendering/measurement/
---
## Measurement structure

렌더 측정을 나타내는 숫자입니다.

```csharp
public struct Measurement
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [Measurement](measurement/)(double, Unit) | 새 인스턴스를 만듭니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| static [Zero](../../aspose.gis.rendering/measurement/zero/) { get; } | 길이가 0인 측정값입니다. |
| [Unit](../../aspose.gis.rendering/measurement/unit/) { get; } | 측정 단위. |
| [Value](../../aspose.gis.rendering/measurement/value/) { get; } | 측정 길이를 나타내는 숫자. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| static [Inches](../../aspose.gis.rendering/measurement/inches/)(double) | 의 새 인스턴스를 반환합니다.`측정` 길이를 인치로 나타냅니다. |
| static [MapUnits](../../aspose.gis.rendering/measurement/mapunits/)(double) | 의 새 인스턴스를 반환합니다.`측정` 맵 공간 참조 단위에서 길이를 나타내는 것입니다. |
| static [MetersOnEarth](../../aspose.gis.rendering/measurement/metersonearth/)(double) | 의 새 인스턴스를 반환합니다.`측정` 지구에서 미터 단위로 길이를 나타냅니다. |
| static [Millimeters](../../aspose.gis.rendering/measurement/millimeters/)(double) | 의 새 인스턴스를 반환합니다.`측정` 밀리미터 단위로 길이를 나타냅니다. |
| static [Pixels](../../aspose.gis.rendering/measurement/pixels/)(double) | 의 새 인스턴스를 반환합니다.`측정` 길이를 픽셀 단위로 나타냅니다. |
| static [Points](../../aspose.gis.rendering/measurement/points/)(double) | 의 새 인스턴스를 반환합니다.`측정` 길이를 포인트로 나타냅니다. |
| override [ToString](../../aspose.gis.rendering/measurement/tostring/)() | 문자열로 변환된 이 인스턴스를 반환합니다. |
| [operator /](../../aspose.gis.rendering/measurement/op_division/) | 계수로 측정을 나눕니다. |
| [implicit operator](../../aspose.gis.rendering/measurement/op_implicit/) | 의 새 인스턴스를 반환합니다.`측정` 길이를 픽셀 단위로 나타냅니다. |
| [operator *](../../aspose.gis.rendering/measurement/op_multiply/) | 계수로 측정값을 곱합니다. |

### 또한보십시오

* 네임스페이스 [Aspose.Gis.Rendering](../../aspose.gis.rendering/)
* 집회 [Aspose.GIS](../../)


