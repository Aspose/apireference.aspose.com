---
title: Class SpatialReferenceSystem
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.SpatialReferencing.SpatialReferenceSystem 수업. 공간 참조 시스템은 좌표를 지구상의 장소에 매핑합니다. 다양한 유형의 SRS가 있습니다.Type . SRS 유형이Geographic or Projected SRS는 복합 또는 단일일 수 있습니다. 참조IsCompound .
type: docs
weight: 2250
url: /ko/net/aspose.gis.spatialreferencing/spatialreferencesystem/
---
## SpatialReferenceSystem class

공간 참조 시스템은 좌표를 지구상의 장소에 매핑합니다. 다양한 유형의 SRS가 있습니다.[`Type`](./type/) . SRS 유형이Geographic or Projected SRS는 복합 또는 단일일 수 있습니다. 참조[`IsCompound`](./iscompound/) .

```csharp
public abstract class SpatialReferenceSystem : IdentifiableObject
```

## 속성

| 이름 | 설명 |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | 변환된 이 SRS를 반환합니다.[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . 사용[`IsCompound`](./iscompound/) 변환이 가능한지 알아보기 위해. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | 변환된 이 SRS를 반환합니다.[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . 사용[`Type`](./type/) 변환이 가능한지 알아보기 위해. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | 변환된 이 SRS를 반환합니다.[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) . 사용[`Type`](./type/) 변환이 가능한지 알아보기 위해. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | 변환된 이 SRS를 반환합니다.[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . 사용[`Type`](./type/) 변환이 가능한지 알아보기 위해. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | 변환된 이 SRS를 반환합니다.[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) . 사용[`Type`](./type/) 변환이 가능한지 알아보기 위해. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | 변환된 이 SRS를 반환합니다.[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . 사용[`Type`](./type/) 변환이 가능한지 알아보기 위해. |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/spatialreferencesystem/dimensionscount/) { get; } | 이 SRS의 차원 수를 반환합니다. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | 이 개체 식별자가 EPSG 식별자이면 해당 코드를 반환합니다. 그렇지 않으면 -1. 를 반환합니다. |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum/) { get; } | 이 SRS의 지리적 데이터를 반환합니다. |
| abstract [HasGeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/hasgeographicdatum/) { get; } | 이 SRS에 지리적 데이텀이 있는지 여부를 결정합니다. 모든 지리적, 투영 및 지구 중심 SRS에 해당합니다. |
| abstract [HasPrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/hasprimemeridian/) { get; } | 이 SRS에 본초 자오선이 있는지 여부를 반환합니다. 모든 지리적, 예상 및 지구 중심 SRS에 해당합니다. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | 이 식별 가능한 개체의 식별자입니다. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | 이 SRS가 복합(두 SRS의 합집합)인지 여부를 반환합니다. 복합 SRS에서 SRS의 다음 조합이 유효한 것으로 간주됩니다. 지리적 SRS + 수직 SRS, 이 경우 복합 SRS의 유형은Geographic . 예상 SRS + 수직 SRS, 이 경우 복합 SRS 유형은Projected . SRS의 조합이 다른 경우 복합 SRS의 유형은Unknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | 이 SRS가 단일인지 여부를 반환합니다(두 SRS의 합집합 아님). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | 와 동일[`Validate`](./validate/) , 그러나 오류 메시지를 반환하지 않습니다. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | 이 개체의 이름입니다. |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian/) { get; } | 이 SRS의 본초 자오선을 반환합니다. |
| abstract [Type](../../aspose.gis.spatialreferencing/spatialreferencesystem/type/) { get; } | 이 SRS의 유형을 가져옵니다. 참조[`SpatialReferenceSystemType`](../spatialreferencesystemtype/) . |
| static [Etrs89](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89/) { get; } | ETRS 89 (EPSG:4258) 공간 참조 시스템. |
| static [Etrs89LambertAzimuthalEqualArea](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89lambertazimuthalequalarea/) { get; } | ETRS 89 / ETRS Lambert Azimuthal Equal Area (EPSG:3035) 공간 참조 시스템. |
| static [Etrs89LambertConformalConic](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89lambertconformalconic/) { get; } | ETRS 89 / Lambert Conformal Conic(EPSG:3034) 공간 참조 시스템. |
| static [Nad83](../../aspose.gis.spatialreferencing/spatialreferencesystem/nad83/) { get; } | NAD 83 (EPSG:4269) 공간 참조 시스템. |
| static [Osgb36](../../aspose.gis.spatialreferencing/spatialreferencesystem/osgb36/) { get; } | OSGB 36(EPSG:4277) 공간 참조 시스템. |
| static [Osgb36BritishNationalGrid](../../aspose.gis.spatialreferencing/spatialreferencesystem/osgb36britishnationalgrid/) { get; } | OSGB 36 / British National Grid(EPSG:27700) 공간 참조 시스템. |
| static [WebMercator](../../aspose.gis.spatialreferencing/spatialreferencesystem/webmercator/) { get; } | 웹 메르카토르(EPSG:3857) 공간 참조 시스템. |
| static [Wgs72](../../aspose.gis.spatialreferencing/spatialreferencesystem/wgs72/) { get; } | WGS 72(EPSG:4322) 공간 참조 시스템. |
| static [Wgs84](../../aspose.gis.spatialreferencing/spatialreferencesystem/wgs84/) { get; } | WGS 84(EPSG:4326) 공간 참조 시스템. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| static [CreateFromEpsg](../../aspose.gis.spatialreferencing/spatialreferencesystem/createfromepsg/)(int) | 지정된 EPSG 코드를 기반으로 공간 참조 시스템을 생성합니다. |
| static [CreateFromWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/createfromwkt/)(string) | 새로 만들기`공간 참조 시스템` WKT(잘 알려진 텍스트) string. 기반 |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | 이것으로부터 변환을 생성합니다.`공간 참조 시스템` 다른 사람에게`공간 참조 시스템` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | 이 SRS의 표현을 WKT 문자열로 반환합니다. 결과 WKT 문자열은 일반적으로 "WKT1"이라고 하는 OGC 01-009 사양과 일치합니다. |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis/)(int) | 가져오기[`Axis`](../axis/) 차원을 설명합니다. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit/)(int) | 가져오기[`Unit`](../unit/)차원의. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | 이 SRS가 다른 SRS와 동일한지 여부를 감지합니다. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | 현재 개체를 나타내는 문자열을 반환합니다. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | 이것으로부터 변환을 생성합니다.`공간 참조 시스템` 다른 사람에게`공간 참조 시스템` . |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate/)(out string) | 이 SRS가 유효한지 확인하십시오. |
| static [CreateCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/createcompound/)(string, SpatialReferenceSystem, SpatialReferenceSystem, Identifier) | 복합 SRS를 만듭니다. |
| static [CreateGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/creategeocentric/)(GeocentricSpatialReferenceSystemParameters, Identifier) | 맞춤형 매개변수에서 지구 중심 SRS를 생성합니다. |
| static [CreateGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/creategeographic/)(GeographicSpatialReferenceSystemParameters, Identifier) | 사용자 정의 매개변수에서 지리적 SRS를 생성합니다. |
| static [CreateLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/createlocal/)(string, LocalDatum, Unit, ICollection&lt;Axis&gt;, Identifier) | 로컬 SRS를 만듭니다. |
| static [CreateProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/createprojected/)(ProjectedSpatialReferenceSystemParameters, Identifier) | 맞춤형 매개변수에서 예상 SRS를 생성합니다. |
| static [CreateVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/createvertical/)(string, VerticalDatum, Unit, Axis, Identifier) | 수직 SRS를 생성합니다. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem, SpatialReferenceSystem) | 두 SRS가 동일한지 확인합니다. 동일한 SRS의 동일한 좌표가 지구상의 동일한 위치와 일치합니다. 동일한 SRS의 일부 매개변수가 다를 수 있습니다. 예를 들어[`Name`](../identifiableobject/name/) . |
| static [TryCreateFromEpsg](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromepsg/)(int, out SpatialReferenceSystem) | 지정된 EPSG 코드를 기반으로 공간 참조 시스템을 생성합니다. |
| static [TryCreateFromWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromwkt/)(string, out SpatialReferenceSystem) | 새로 만들기`공간 참조 시스템` WKT(잘 알려진 텍스트) string. 기반 |

### 또한보십시오

* class [IdentifiableObject](../identifiableobject/)
* 네임스페이스 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* 집회 [Aspose.GIS](../../)


