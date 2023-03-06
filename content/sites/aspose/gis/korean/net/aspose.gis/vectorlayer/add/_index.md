---
title: VectorLayer.Add
second_title: .NET API 참조를 위한 Aspose.GIS
description: VectorLayer 방법. 레이어에서 지원하는 경우 새 기능을 레이어에 추가합니다.VectorLayer 에스Driver .
type: docs
weight: 80
url: /ko/net/aspose.gis/vectorlayer/add/
---
## Add(Feature) {#add}

레이어에서 지원하는 경우 새 기능을 레이어에 추가합니다.[`VectorLayer`](../) 에스[`Driver`](../driver/) .

```csharp
public void Add(Feature feature)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| feature | Feature | 추가할 기능입니다. |

### 예외

| 예외 | 상태 |
| --- | --- |
| InvalidOperationException | 레이어가 읽기 전용인 경우 발생합니다. |

### 또한보십시오

* class [Feature](../../feature/)
* class [VectorLayer](../)
* 네임스페이스 [Aspose.Gis](../../vectorlayer/)
* 집회 [Aspose.GIS](../../../)

---

## Add(Feature, IFeatureStyle) {#add_1}

레이어에서 지원하는 경우 지정된 스타일의 새 기능을 레이어에 추가합니다.[`VectorLayer`](../) 에스[`Driver`](../driver/) .

```csharp
public virtual void Add(Feature feature, IFeatureStyle style)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| feature | Feature | 추가할 기능입니다. |
| style | IFeatureStyle | 피쳐 스타일입니다. 사용`null` 누락된 스타일을 나타냅니다. |

### 예외

| 예외 | 상태 |
| --- | --- |
| InvalidOperationException | 레이어가 스타일을 지원하지 않거나 레이어가 읽기 전용인 경우 발생합니다. |
| InvalidOperationException | 편집 가능한 레이어가 스타일을 지원하지 않는 경우 발생합니다. |
| ArgumentException | 스타일이 드라이버 유형과 일치하지 않으면 발생합니다. |

### 또한보십시오

* class [Feature](../../feature/)
* interface [IFeatureStyle](../../ifeaturestyle/)
* class [VectorLayer](../)
* 네임스페이스 [Aspose.Gis](../../vectorlayer/)
* 집회 [Aspose.GIS](../../../)


