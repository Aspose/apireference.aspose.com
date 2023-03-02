---
title: Class ProjectedSpatialReferenceSystem
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.SpatialReferencing.ProjectedSpatialReferenceSystem 수업. 투영된 SRS는 지리적 SRS에 투영을 적용한 결과입니다. 투영된 SRS는 2차원일 수도 있고 3차원일 수도 있습니다. SRS.
type: docs
weight: 2220
url: /ko/net/aspose.gis.spatialreferencing/projectedspatialreferencesystem/
---
## ProjectedSpatialReferenceSystem class

투영된 SRS는 지리적 SRS에 투영을 적용한 결과입니다. 투영된 SRS는 2차원일 수도 있고 3차원일 수도 있습니다. SRS.

```csharp
public abstract class ProjectedSpatialReferenceSystem : SpatialReferenceSystem
```

## 속성

| 이름 | 설명 |
| --- | --- |
| abstract [AngularUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/angularunit/) { get; } | 단위, 이 SRS의 각도 값과 다음의 각도 매개변수에 사용됩니다.[`Projection`](./projection/) . 각도 단위 일치[`Base`](./base/) . |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | 변환된 이 SRS를 반환합니다.[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . 사용[`IsCompound`](../spatialreferencesystem/iscompound/) 변환이 가능한지 알아보기 위해. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | 변환된 이 SRS를 반환합니다.[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . 사용[`Type`](../spatialreferencesystem/type/) 변환이 가능한지 알아보기 위해. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | 변환된 이 SRS를 반환합니다.[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) . 사용[`Type`](../spatialreferencesystem/type/) 변환이 가능한지 알아보기 위해. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | 변환된 이 SRS를 반환합니다.[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . 사용[`Type`](../spatialreferencesystem/type/) 변환이 가능한지 알아보기 위해. |
| [AsProjected](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/asprojected/) { get; } | 반환합니다. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | 변환된 이 SRS를 반환합니다.[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . 사용[`Type`](../spatialreferencesystem/type/) 변환이 가능한지 알아보기 위해. |
| abstract [AxisesOrder](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/axisesorder/) { get; } | 이 SRS의 축 순서. 이 SRS가 유효하지 않고 축 방향이 잘못된 경우Invalid 반환됩니다. |
| abstract [Base](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/base/) { get; } | 지리적 SRS[`Projection`](./projection/) 이 SRS를 얻기 위해 적용되었습니다. |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/dimensionscount/) { get; } | 이 SRS의 차원 수를 반환합니다. 투영된 SRS의 경우 다음과 같을 수 있습니다. 2 - 단일 투영 SRS인 경우. 3 - 단일, 2차원 투영 SRS 및 수직 SRS로 구성된 복합 SRS인 경우 3차원을 추가합니다. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | 이 개체 식별자가 EPSG 식별자이면 해당 코드를 반환합니다. 그렇지 않으면 -1. 를 반환합니다. |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum/) { get; } | 이 SRS의 지리적 데이터를 반환합니다. |
| [HasGeographicDatum](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/hasgeographicdatum/) { get; } | 투영된 SRS는 항상 본초 자오선을 갖기 때문에 true를 반환합니다. |
| [HasPrimeMeridian](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/hasprimemeridian/) { get; } | 투영된 SRS는 항상 본초 자오선을 갖기 때문에 true를 반환합니다. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | 이 식별 가능한 개체의 식별자입니다. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | 이 SRS가 복합(두 SRS의 합집합)인지 여부를 반환합니다. 복합 SRS에서 SRS의 다음 조합이 유효한 것으로 간주됩니다. 지리적 SRS + 수직 SRS, 이 경우 복합 SRS의 유형은Geographic . 예상 SRS + 수직 SRS, 이 경우 복합 SRS 유형은Projected . SRS의 조합이 다른 경우 복합 SRS의 유형은Unknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | 이 SRS가 단일인지 여부를 반환합니다(두 SRS의 합집합 아님). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | 와 동일[`Validate`](../spatialreferencesystem/validate/) , 그러나 오류 메시지를 반환하지 않습니다. |
| abstract [LinearUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/linearunit/) { get; } | 단위, 이 SRS의 선형 치수 및 다음의 선형 매개변수에 사용됩니다.[`Projection`](./projection/) . |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | 이 개체의 이름입니다. |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian/) { get; } | 이 SRS의 본초 자오선을 반환합니다. |
| abstract [Projection](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/projection/) { get; } | 적용된 프로젝션[`Base`](./base/) 이 SRS를 얻으려면. |
| [Type](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/type/) { get; } | 반환Projected . |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | 이것으로부터 변환을 생성합니다.`공간 참조 시스템` 다른 사람에게`공간 참조 시스템` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | 이 SRS의 표현을 WKT 문자열로 반환합니다. 결과 WKT 문자열은 일반적으로 "WKT1"이라고 하는 OGC 01-009 사양과 일치합니다. |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis/)(int) | 가져오기[`Axis`](../axis/) 차원을 설명합니다. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit/)(int) | 가져오기[`Unit`](../unit/)차원의. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | 이 SRS가 다른 SRS와 동일한지 여부를 감지합니다. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | 현재 개체를 나타내는 문자열을 반환합니다. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | 이것으로부터 변환을 생성합니다.`공간 참조 시스템` 다른 사람에게`공간 참조 시스템` . |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate/)(out string) | 이 SRS가 유효한지 확인하십시오. |

### 또한보십시오

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* 네임스페이스 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* 집회 [Aspose.GIS](../../)


