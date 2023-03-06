---
title: FeaturesSequence.WhereIntersects
second_title: .NET API 참조를 위한 Aspose.GIS
description: FeaturesSequence 방법. 다른 피처 시퀀스에 있는 모든 도형의 합집합을 기반으로 피처를 필터링합니다.
type: docs
weight: 100
url: /ko/net/aspose.gis/featuressequence/whereintersects/
---
## WhereIntersects(FeaturesSequence) {#whereintersects_1}

다른 피처 시퀀스에 있는 모든 도형의 합집합을 기반으로 피처를 필터링합니다.

```csharp
public FeaturesSequence WhereIntersects(FeaturesSequence sequence)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| sequence | FeaturesSequence | 기타 기능 시퀀스. |

### 반환 값

다른 피처 시퀀스에 있는 모든 지오메트리의 합집합과 교차하는 피처.

### 또한보십시오

* class [FeaturesSequence](../)
* 네임스페이스 [Aspose.Gis](../../featuressequence/)
* 집회 [Aspose.GIS](../../../)

---

## WhereIntersects(IGeometry) {#whereintersects_2}

제공된 지오메트리를 기반으로 피쳐를 필터링합니다.

```csharp
public virtual FeaturesSequence WhereIntersects(IGeometry geometry)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| geometry | IGeometry | 필터 기하학. |

### 반환 값

제공된 지오메트리와 교차하는 피처.

### 또한보십시오

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [FeaturesSequence](../)
* 네임스페이스 [Aspose.Gis](../../featuressequence/)
* 집회 [Aspose.GIS](../../../)

---

## WhereIntersects(Extent) {#whereintersects}

범위를 기준으로 기능을 필터링합니다.

```csharp
public virtual FeaturesSequence WhereIntersects(Extent extent)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| extent | Extent | 범위를 필터링합니다. |

### 반환 값

제공된 지오메트리와 교차하는 피처.

### 또한보십시오

* class [Extent](../../extent/)
* class [FeaturesSequence](../)
* 네임스페이스 [Aspose.Gis](../../featuressequence/)
* 집회 [Aspose.GIS](../../../)


