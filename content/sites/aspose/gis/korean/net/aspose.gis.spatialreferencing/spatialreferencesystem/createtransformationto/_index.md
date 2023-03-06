---
title: SpatialReferenceSystem.CreateTransformationTo
second_title: .NET API 참조를 위한 Aspose.GIS
description: SpatialReferenceSystem 방법. 이것으로부터 변환을 생성합니다.공간 참조 시스템 다른 사람에게공간 참조 시스템 .
type: docs
weight: 180
url: /ko/net/aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/
---
## SpatialReferenceSystem.CreateTransformationTo method

이것으로부터 변환을 생성합니다.`공간 참조 시스템` 다른 사람에게`공간 참조 시스템` .

```csharp
public SpatialReferenceSystemTransformation CreateTransformationTo(SpatialReferenceSystem targetSrs)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| targetSrs | SpatialReferenceSystem | 또 다른`공간 참조 시스템`. |

### 반환 값

이것으로부터의 변신`공간 참조 시스템` 다른 사람에게`공간 참조 시스템`.

### 예외

| 예외 | 상태 |
| --- | --- |
| NotSupportedException | 이 사이의 변환`공간 참조 시스템` 및 인수가 지원되지 않습니다. 프로젝션 중 하나가 지원되지 않거나 시스템 중 하나가[`VerticalSpatialReferenceSystem`](../../verticalspatialreferencesystem/) or [`LocalSpatialReferenceSystem`](../../localspatialreferencesystem/) . |
| [TransformationException](../../transformationexception/) | 내부 매개 변수가 잘못되어 변환을 만들지 못했습니다.`공간 참조 시스템` . |

### 또한보십시오

* method [TryCreateTransformationTo](../trycreatetransformationto/)
* class [SpatialReferenceSystemTransformation](../../spatialreferencesystemtransformation/)
* class [SpatialReferenceSystem](../)
* 네임스페이스 [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* 집회 [Aspose.GIS](../../../)


