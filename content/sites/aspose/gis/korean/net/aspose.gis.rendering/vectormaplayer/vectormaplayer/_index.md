---
title: VectorMapLayer.VectorMapLayer
second_title: .NET API 참조를 위한 Aspose.GIS
description: VectorMapLayer 건설자. 기본 심볼라이저로 새 인스턴스를 만듭니다.
type: docs
weight: 10
url: /ko/net/aspose.gis.rendering/vectormaplayer/vectormaplayer/
---
## VectorMapLayer(FeaturesSequence) {#constructor}

기본 심볼라이저로 새 인스턴스를 만듭니다.

```csharp
public VectorMapLayer(FeaturesSequence featuresSequence)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | 특징 순서. |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null`. |

### 또한보십시오

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorMapLayer](../)
* 네임스페이스 [Aspose.Gis.Rendering](../../vectormaplayer/)
* 집회 [Aspose.GIS](../../../)

---

## VectorMapLayer(FeaturesSequence, VectorSymbolizer) {#constructor_1}

기본 심볼라이저로 새 인스턴스를 만듭니다.

```csharp
public VectorMapLayer(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | 특징 순서. |
| symbolizer | VectorSymbolizer | 레이어 렌더링에 사용할 심볼라이저입니다. 만약에`null`, 기본 심볼라이저가 사용됩니다. |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null`. |

### 또한보십시오

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [VectorMapLayer](../)
* 네임스페이스 [Aspose.Gis.Rendering](../../vectormaplayer/)
* 집회 [Aspose.GIS](../../../)

---

## VectorMapLayer(FeaturesSequence, VectorSymbolizer, Labeling) {#constructor_2}

기본 심볼라이저로 새 인스턴스를 만듭니다.

```csharp
public VectorMapLayer(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer, 
    Labeling labeling)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | 특징 순서. |
| symbolizer | VectorSymbolizer | 레이어 렌더링에 사용할 심볼라이저입니다. 만약에`null`, 기본 심볼라이저가 사용됩니다. |
| labeling | Labeling | 레이어의 피처에 레이블을 지정하는 데 사용할 레이블 지정. 만약에`null` , 기본[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) 사용됩니다. |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null`. |

### 또한보십시오

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [VectorMapLayer](../)
* 네임스페이스 [Aspose.Gis.Rendering](../../vectormaplayer/)
* 집회 [Aspose.GIS](../../../)

---

## VectorMapLayer(VectorLayer, bool) {#constructor_5}

기본 심볼라이저로 새 인스턴스를 만듭니다.

```csharp
public VectorMapLayer(VectorLayer layer, bool keepOpen = true)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| layer | VectorLayer | 벡터 레이어. |
| keepOpen | Boolean | `true` 이후에 레이어를 열어 두려면[`VectorMapLayer`](../) 객체가 폐기되었습니다. 그렇지 않으면,`false` . |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 레이어는`null`. |

### 또한보십시오

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorMapLayer](../)
* 네임스페이스 [Aspose.Gis.Rendering](../../vectormaplayer/)
* 집회 [Aspose.GIS](../../../)

---

## VectorMapLayer(VectorLayer, VectorSymbolizer, bool) {#constructor_4}

새 인스턴스를 만듭니다.

```csharp
public VectorMapLayer(VectorLayer layer, VectorSymbolizer symbolizer, bool keepOpen = true)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| layer | VectorLayer | 벡터 레이어. |
| symbolizer | VectorSymbolizer | 레이어 렌더링에 사용할 심볼라이저입니다. 만약에`null`, 기본 심볼라이저가 사용됩니다. |
| keepOpen | Boolean | `true` 이후에 레이어를 열어 두려면[`VectorMapLayer`](../) 객체가 폐기되었습니다. 그렇지 않으면,`false` . |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 레이어는`null`. |

### 또한보십시오

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [VectorMapLayer](../)
* 네임스페이스 [Aspose.Gis.Rendering](../../vectormaplayer/)
* 집회 [Aspose.GIS](../../../)

---

## VectorMapLayer(VectorLayer, VectorSymbolizer, Labeling, bool) {#constructor_3}

새 인스턴스를 만듭니다.

```csharp
public VectorMapLayer(VectorLayer layer, VectorSymbolizer symbolizer, Labeling labeling, 
    bool keepOpen = true)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| layer | VectorLayer | 벡터 레이어. |
| symbolizer | VectorSymbolizer | 레이어 렌더링에 사용할 심볼라이저. 만약에`null` 기본 심볼라이저가 사용됩니다. |
| labeling | Labeling | 레이어의 피처에 레이블을 지정하는 데 사용할 레이블 지정. 만약에`null` , 기본[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) 사용됩니다. |
| keepOpen | Boolean | `true` 이후에 레이어를 열어 두려면[`VectorMapLayer`](../) 객체가 폐기되었습니다. 그렇지 않으면,`false` . |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 레이어는`null`. |

### 또한보십시오

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [VectorMapLayer](../)
* 네임스페이스 [Aspose.Gis.Rendering](../../vectormaplayer/)
* 집회 [Aspose.GIS](../../../)


