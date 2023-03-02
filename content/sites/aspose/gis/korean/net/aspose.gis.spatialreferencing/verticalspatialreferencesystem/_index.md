---
title: Class VerticalSpatialReferenceSystem
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.SpatialReferencing.VerticalSpatialReferenceSystem 수업. 수직 SRS는 높이 좌표를 나타내는 1차원 SRS입니다.
type: docs
weight: 2310
url: /ko/net/aspose.gis.spatialreferencing/verticalspatialreferencesystem/
---
## VerticalSpatialReferenceSystem class

수직 SRS는 높이 좌표를 나타내는 1차원 SRS입니다.

```csharp
public class VerticalSpatialReferenceSystem : SpatialReferenceSystem
```

## 속성

| 이름 | 설명 |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | 변환된 이 SRS를 반환합니다.[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . 사용[`IsCompound`](../spatialreferencesystem/iscompound/) 변환이 가능한지 알아보기 위해. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | 변환된 이 SRS를 반환합니다.[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . 사용[`Type`](../spatialreferencesystem/type/) 변환이 가능한지 알아보기 위해. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | 변환된 이 SRS를 반환합니다.[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) . 사용[`Type`](../spatialreferencesystem/type/) 변환이 가능한지 알아보기 위해. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | 변환된 이 SRS를 반환합니다.[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . 사용[`Type`](../spatialreferencesystem/type/) 변환이 가능한지 알아보기 위해. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | 변환된 이 SRS를 반환합니다.[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) . 사용[`Type`](../spatialreferencesystem/type/) 변환이 가능한지 알아보기 위해. |
| override [AsVertical](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/asvertical/) { get; } | 이 SRS를 반환합니다. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/dimensionscount/) { get; } | 수직 SRS는 항상 1차원이므로 1을 반환합니다. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | 이 개체 식별자가 EPSG 식별자이면 해당 코드를 반환합니다. 그렇지 않으면 -1. 를 반환합니다. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/geographicdatum/) { get; } | 던지기InvalidOperationException , Vertical SRS에는 지리적 데이텀이 없기 때문입니다. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/hasgeographicdatum/) { get; } | 반환`false` , Vertical SRS에는 지리적 데이텀이 없기 때문입니다. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/hasprimemeridian/) { get; } | 반환`false` , 수직 SRS에는 본초 자오선이 없기 때문에. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | 이 식별 가능한 개체의 식별자입니다. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | 이 SRS가 복합(두 SRS의 합집합)인지 여부를 반환합니다. 복합 SRS에서 SRS의 다음 조합이 유효한 것으로 간주됩니다. 지리적 SRS + 수직 SRS, 이 경우 복합 SRS의 유형은Geographic . 예상 SRS + 수직 SRS, 이 경우 복합 SRS 유형은Projected . SRS의 조합이 다른 경우 복합 SRS의 유형은Unknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | 이 SRS가 단일인지 여부를 반환합니다(두 SRS의 합집합 아님). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | 와 동일[`Validate`](../spatialreferencesystem/validate/) , 그러나 오류 메시지를 반환하지 않습니다. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | 이 개체의 이름입니다. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/primemeridian/) { get; } | 던지기InvalidOperationException , 수직 SRS에는 본초 자오선이 없기 때문에. |
| override [Type](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/type/) { get; } | 반환Vertical . |
| [VerticalDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/verticaldatum/) { get; } | 이 SRS에서 사용되는 데이텀. |
| [VerticalUnit](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/verticalunit/) { get; } | 이 SRS에서 사용되는 단위. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | 이것으로부터 변환을 생성합니다.`공간 참조 시스템` 다른 사람에게`공간 참조 시스템` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | 이 SRS의 표현을 WKT 문자열로 반환합니다. 결과 WKT 문자열은 일반적으로 "WKT1"이라고 하는 OGC 01-009 사양과 일치합니다. |
| override [GetAxis](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/getaxis/)(int) | 가져오기[`Axis`](../axis/) 차원을 설명합니다. |
| override [GetUnit](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/getunit/)(int) | 가져오기[`Unit`](../unit/)차원의. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | 이 SRS가 다른 SRS와 동일한지 여부를 감지합니다. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | 현재 개체를 나타내는 문자열을 반환합니다. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | 이것으로부터 변환을 생성합니다.`공간 참조 시스템` 다른 사람에게`공간 참조 시스템` . |
| override [Validate](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/validate/)(out string) | 이 SRS가 유효한지 확인합니다. 보다[`Validate`](../spatialreferencesystem/validate/) 유효성 설명. |

### 또한보십시오

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* 네임스페이스 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* 집회 [Aspose.GIS](../../)


