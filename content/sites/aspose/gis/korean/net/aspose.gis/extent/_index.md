---
title: Class Extent
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.Extent 수업. 2차원 공간 경계 상자입니다.
type: docs
weight: 120
url: /ko/net/aspose.gis/extent/
---
## Extent class

2차원 공간 경계 상자입니다.

```csharp
public class Extent : IEquatable<Extent>
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [Extent](extent/#constructor)() | 새 인스턴스를 만듭니다. |
| [Extent](extent/#constructor_1)(SpatialReferenceSystem) | 새 인스턴스를 만듭니다. |
| [Extent](extent/#constructor_2)(double, double, double, double, SpatialReferenceSystem) | 새 인스턴스를 만듭니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Center](../../aspose.gis/extent/center/) { get; } | 범위의 중심. |
| [Height](../../aspose.gis/extent/height/) { get; } | 범위의 높이. |
| [IsValid](../../aspose.gis/extent/isvalid/) { get; } | 이 여부를 결정합니다.`Extent` 유효합니다. |
| [SpatialReferenceSystem](../../aspose.gis/extent/spatialreferencesystem/) { get; set; } | [`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) 이 익스텐트와 연관됨. 가능`null` 만약에[`SpatialReferenceSystem`](./spatialreferencesystem/) 알 수 없음. 사용[`GetTransformed`](./gettransformed/) 차이 공간 참조 시스템 간의 범위를 변환하기 위해. |
| [Width](../../aspose.gis/extent/width/) { get; } | 범위의 너비입니다. |
| [XMax](../../aspose.gis/extent/xmax/) { get; set; } | X 좌표의 최대값. |
| [XMin](../../aspose.gis/extent/xmin/) { get; set; } | X 좌표의 최소값. |
| [YMax](../../aspose.gis/extent/ymax/) { get; set; } | Y 좌표의 최대값입니다. |
| [YMin](../../aspose.gis/extent/ymin/) { get; set; } | Y 좌표의 최소값입니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Clone](../../aspose.gis/extent/clone/)() | 이 인스턴스를 복제합니다. |
| [Contains](../../aspose.gis/extent/contains/#contains)(Extent) | 이 익스텐트에 인수가 포함되어 있는지 여부를 결정합니다. |
| [Contains](../../aspose.gis/extent/contains/#contains_1)(IGeometry) | 이 익스텐트에 인수가 포함되어 있는지 여부를 결정합니다. |
| [Contains](../../aspose.gis/extent/contains/#contains_2)(double, double) | 이 범위에 인수로 정의된 좌표가 포함되어 있는지 여부를 결정합니다. |
| [Equals](../../aspose.gis/extent/equals/#equals)(Extent) | 현재 개체가 같은 유형의 다른 개체와 같은지 여부를 나타냅니다. |
| override [Equals](../../aspose.gis/extent/equals/#equals_1)(object) | 지정된 개체가 현재 개체와 같은지 여부를 확인합니다. |
| override [GetHashCode](../../aspose.gis/extent/gethashcode/)() | 기본 해시 함수 역할을 합니다. |
| [GetTransformed](../../aspose.gis/extent/gettransformed/)(SpatialReferenceSystem) | 지정된 새 범위를 반환합니다.[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) 이 범위를 포함하는 . |
| [Grow](../../aspose.gis/extent/grow/#grow)(Extent) | 인수를 포함하도록 이 익스텐트를 늘립니다. |
| [Grow](../../aspose.gis/extent/grow/#grow_1)(double, double) | 지정된 점을 포함하도록 이 범위를 늘립니다. |
| [GrowX](../../aspose.gis/extent/growx/)(double) | 지정된 값을 포함하도록 X축을 따라 이 범위를 확장합니다. |
| [GrowY](../../aspose.gis/extent/growy/)(double) | 지정된 값을 포함하도록 Y축을 따라 이 범위를 늘립니다. |
| [Intersects](../../aspose.gis/extent/intersects/#intersects)(Extent) | 이 범위가 인수와 교차하는지 여부를 결정합니다. |
| [Intersects](../../aspose.gis/extent/intersects/#intersects_1)(IGeometry) | 이 범위가 인수와 교차하는지 여부를 결정합니다. |
| [Normalize](../../aspose.gis/extent/normalize/)() | 스왑[`XMin`](./xmin/) ~와 함께[`XMax`](./xmax/) 만약에[`Width`](./width/) 음수 and [`YMin`](./ymin/) ~와 함께[`YMax`](./ymax/) 만약에[`Height`](./height/) 음수입니다. |
| [ToPolygon](../../aspose.gis/extent/topolygon/)() | 이 범위를 나타내는 직사각형 폴리곤으로 변환합니다. |
| override [ToString](../../aspose.gis/extent/tostring/)() | 현재 개체를 나타내는 문자열을 반환합니다. |
| [operator ==](../../aspose.gis/extent/op_equality/) | '==' 연산자를 구현합니다. |
| [operator !=](../../aspose.gis/extent/op_inequality/) | '!=' 연산자를 구현합니다. |

### 또한보십시오

* 네임스페이스 [Aspose.Gis](../../aspose.gis/)
* 집회 [Aspose.GIS](../../)


