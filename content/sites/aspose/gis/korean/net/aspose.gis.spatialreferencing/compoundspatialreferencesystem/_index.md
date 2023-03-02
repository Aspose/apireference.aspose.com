---
title: Class CompoundSpatialReferenceSystem
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.SpatialReferencing.CompoundSpatialReferenceSystem 수업. 복합 SRS는 두 개의 기본 SRS를 결합하며 그 중 어느 것도 복합될 수 없습니다.
type: docs
weight: 2060
url: /ko/net/aspose.gis.spatialreferencing/compoundspatialreferencesystem/
---
## CompoundSpatialReferenceSystem class

복합 SRS는 두 개의 기본 SRS를 결합하며, 그 중 어느 것도 복합될 수 없습니다.

```csharp
public class CompoundSpatialReferenceSystem : SpatialReferenceSystem
```

## 속성

| 이름 | 설명 |
| --- | --- |
| override [AsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/ascompound/) { get; } | 반환합니다. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | 변환된 이 SRS를 반환합니다.[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . 사용[`Type`](../spatialreferencesystem/type/) 변환이 가능한지 알아보기 위해. |
| override [AsGeographic](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asgeographic/) { get; } | 이 SRS의 지리적 표시를 반환합니다. 이 복합 SRS가 실제로 지리적 SRS를 나타내는 경우 결과는 3차원 지리적 SRS(경도, 위도, 높이 차원 포함)가 됩니다. 그렇지 않으면 예외가 발생합니다. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | 변환된 이 SRS를 반환합니다.[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . 사용[`Type`](../spatialreferencesystem/type/) 변환이 가능한지 알아보기 위해. |
| override [AsProjected](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asprojected/) { get; } | 이 SRS의 예상 표현을 반환합니다. 이 복합 SRS가 실제로 투영된 SRS를 나타내는 경우 결과는 3차원 투영된 SRS(X, Y, 높이 치수 포함)가 됩니다. 그렇지 않으면 예외가 발생합니다. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | 변환된 이 SRS를 반환합니다.[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . 사용[`Type`](../spatialreferencesystem/type/) 변환이 가능한지 알아보기 위해. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/dimensionscount/) { get; } | 차원 수. 복합 SRS의 경우 이는 기본 SRS. 의 차원 수 합계입니다. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | 이 개체 식별자가 EPSG 식별자이면 해당 코드를 반환합니다. 그렇지 않으면 -1. 를 반환합니다. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/geographicdatum/) { get; } | 이 SRS의 지리적 데이터를 반환합니다. 둘 다인 경우[`Head`](./head/) 그리고[`Tail`](./tail/) 지리적 기준이 있음 - head. 의 지리적 기준을 반환합니다. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasgeographicdatum/) { get; } | 기본 SRS에 지리적 데이터가 있는 경우 복합 SRS에 지리적 데이터가 있습니다. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasprimemeridian/) { get; } | 기본 SRS 중 하나라도 본초 자오선을 갖는 경우 복합 SRS도 본초 자오선을 갖습니다. |
| [Head](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/head/) { get; } | 첫 번째 기본 SRS. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | 이 식별 가능한 개체의 식별자입니다. |
| override [IsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/iscompound/) { get; } | 반환`true` . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | 이 SRS가 단일인지 여부를 반환합니다(두 SRS의 합집합 아님). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | 와 동일[`Validate`](../spatialreferencesystem/validate/) , 그러나 오류 메시지를 반환하지 않습니다. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | 이 개체의 이름입니다. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/primemeridian/) { get; } | 이 SRS의 본초 자오선을 반환합니다. 둘 다인 경우[`Head`](./head/) 그리고[`Tail`](./tail/) 본초 자오선 있음 - head. 의 본초 자오선 반환 |
| [Tail](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/tail/) { get; } | 두 번째 기본 SRS. |
| override [Type](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/type/) { get; } | 이 복합 SRS의 유형입니다. 될 수 있습니다Geographicif 이 복합 SRS는 지리적 SRS와 수직 SRS의 조합이거나Projected if 이 복합 SRS는 투영 및 수직 SRS의 조합입니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | 이것으로부터 변환을 생성합니다.`공간 참조 시스템` 다른 사람에게`공간 참조 시스템` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | 이 SRS의 표현을 WKT 문자열로 반환합니다. 결과 WKT 문자열은 일반적으로 "WKT1"이라고 하는 OGC 01-009 사양과 일치합니다. |
| override [GetAxis](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getaxis/)(int) | 가져오기[`Axis`](../axis/) 차원을 설명합니다. |
| override [GetUnit](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getunit/)(int) | 가져오기[`Unit`](../unit/)차원의. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | 이 SRS가 다른 SRS와 동일한지 여부를 감지합니다. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | 현재 개체를 나타내는 문자열을 반환합니다. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | 이것으로부터 변환을 생성합니다.`공간 참조 시스템` 다른 사람에게`공간 참조 시스템` . |
| override [Validate](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/validate/)(out string) | 이 SRS가 유효한지 확인합니다. 보다[`Validate`](../spatialreferencesystem/validate/) 유효성 설명. |

### 또한보십시오

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* 네임스페이스 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* 집회 [Aspose.GIS](../../)


