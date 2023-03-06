---
title: Aspose.Gis.SpatialReferencing
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.SpatialReferencing 네임스페이스는 공간 참조좌표 참조 시스템 작업을 위한 클래스를 제공합니다.
type: docs
weight: 370
url: /ko/net/aspose.gis.spatialreferencing/
---
`Aspose.Gis.SpatialReferencing` 네임스페이스는 공간 참조(좌표 참조 시스템) 작업을 위한 클래스를 제공합니다.

## 클래스

| 수업 | 설명 |
| --- | --- |
| [Axis](./axis/) | 축은 SRS의 한 차원을 나타냅니다. |
| [BursaWolfParameters](./bursawolfparameters/) | 다른 데이텀으로 변환하기 위한 Bursa-Wolf 공식의 매개변수를 포함하는 클래스입니다. |
| [CompoundSpatialReferenceSystem](./compoundspatialreferencesystem/) | 복합 SRS는 두 개의 기본 SRS를 결합하며, 그 중 어느 것도 복합될 수 없습니다. |
| [Ellipsoid](./ellipsoid/) | 타원체는 지구에 가까운 타원체를 나타냅니다. |
| [GeocentricSpatialReferenceSystem](./geocentricspatialreferencesystem/) | Geocentric SRS는 지구 중심을 원점으로 하는 3차원 데카르트 SRS입니다. |
| [GeocentricSpatialReferenceSystemParameters](./geocentricspatialreferencesystemparameters/) | 지구 중심 SRS를 생성하기 위한 매개변수. 매개변수에는 적절한 기본값이 있으므로 일부만 지정해야 합니다. 지정하는 경우`null` 모든 매개변수에 기본값이 사용됩니다. |
| [GeographicDatum](./geographicdatum/) | 지리적 데이텀은 경도와 위도를 지구상의 특정 위치와 관련시킵니다. |
| [GeographicSpatialReferenceSystem](./geographicspatialreferencesystem/) | 지리적 SRS는 경도와 위도를 기반으로 하는 SRS입니다. 지리적 SRS는 2차원 또는 3차원일 수 있습니다. 지리적 SRS가 3차원인 경우 실제로는 2차원 SRS와 수직 SRS의 복합 SRS입니다. |
| [GeographicSpatialReferenceSystemParameters](./geographicspatialreferencesystemparameters/) | 지리적 SRS를 생성하기 위한 매개변수. 매개변수에는 적절한 기본값이 있으므로 일부만 지정해야 합니다. 지정하는 경우`null` 모든 매개변수에 기본값이 사용됩니다. |
| [IdentifiableObject](./identifiableobject/) | EPSG 코드와 이름을 가질 수 있는 개체를 나타냅니다. |
| [Identifier](./identifier/) | 식별자 - 개체의 외부 설명에 대한 참조를 나타냅니다. WKT에서 SRS를 생성하면[`Identifier`](../aspose.gis.spatialreferencing/identifier/) "AUTHORITY" 키워드에 해당합니다. |
| [LocalDatum](./localdatum/) | 로컬 공간 참조 시스템에서 측정에 사용되는 방법을 나타냅니다. |
| [LocalSpatialReferenceSystem](./localspatialreferencesystem/) | 지구가 아닌 일부 객체에 대한 로컬 SRS 관련 좌표입니다. |
| [PrimeMeridian](./primemeridian/) | PrimeMeridian은 경도가 0. 로 정의되는 자오선을 나타냅니다. |
| [ProjectedSpatialReferenceSystem](./projectedspatialreferencesystem/) | 투영된 SRS는 지리적 SRS에 투영을 적용한 결과입니다. 투영된 SRS는 2차원일 수도 있고 3차원일 수도 있습니다. SRS. |
| [ProjectedSpatialReferenceSystemParameters](./projectedspatialreferencesystemparameters/) | 예상 SRS를 생성하기 위한 매개변수. 일부 매개변수에는 기본값이 있습니다. 일부 매개변수에는 합리적인 기본값이 있으므로 매개변수만 지정할 필요는 없습니다. `null` 이러한 매개변수에는 기본값이 사용됩니다. [`ProjectionMethodName`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodname/) 그리고[`Base`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/base/) 기본값이 없습니다 - `null` 이 속성에 대한 값입니다. |
| [Projection](./projection/) | (경도, 위도)를 (x, y)로 변환하는 매개변수가 있는 프로젝션 방법을 나타냅니다. |
| [SpatialReferenceSystem](./spatialreferencesystem/) | 공간 참조 시스템은 좌표를 지구상의 장소에 매핑합니다. 다양한 유형의 SRS가 있습니다.[`Type`](../aspose.gis.spatialreferencing/spatialreferencesystem/type/) . SRS 유형이Geographic or Projected SRS는 복합 또는 단일일 수 있습니다. 참조[`IsCompound`](../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) . |
| [SpatialReferenceSystemTransformation](./spatialreferencesystemtransformation/) | 공간 참조 시스템 변환은 소스 공간 참조 시스템에서 대상 공간 참조 시스템으로 형상을 변환합니다. |
| [TransformationException](./transformationexception/) | 좌표 변환 중 또는 변환 생성 중 오류가 발생하면 변환 예외가 발생합니다. |
| [Unit](./unit/) | 측정 단위를 나타냅니다. |
| [VerticalDatum](./verticaldatum/) | 수직 측정에 사용되는 방법을 나타냅니다. |
| [VerticalSpatialReferenceSystem](./verticalspatialreferencesystem/) | 수직 SRS는 높이 좌표를 나타내는 1차원 SRS입니다. |
## 열거

| 열거 | 설명 |
| --- | --- |
| [AxisDirection](./axisdirection/) | 축 방향은 축이 가리키는 방향을 정의합니다. |
| [GeocentricAxisesOrder](./geocentricaxisesorder/) | 지구 중심 SRS에서 축의 순서를 나타냅니다. |
| [GeographicAxisesOrder](./geographicaxisesorder/) | 지리적 SRS에서 축의 순서를 나타냅니다. |
| [ParameterType](./parametertype/) | 에서 매개변수 유형을 결정합니다.[`Projection`](../aspose.gis.spatialreferencing/projection/) . |
| [ProjectedAxisesOrder](./projectedaxisesorder/) | 지리적 SRS에서 축의 순서를 나타냅니다. |
| [SpatialReferenceSystemType](./spatialreferencesystemtype/) | 공간 참조 시스템의 유형을 나타냅니다. |


