---
title: FeatureAttributeCollection.Item
second_title: .NET API 참조를 위한 Aspose.GIS
description: FeatureAttributeCollection 재산. 가져오거나 설정합니다.FeatureAttribute 지정된 index. 에서
type: docs
weight: 30
url: /ko/net/aspose.gis/featureattributecollection/item/
---
## FeatureAttributeCollection indexer (1 of 2)

가져오거나 설정합니다.[`FeatureAttribute`](../../featureattribute/) 지정된 index. 에서

```csharp
public FeatureAttribute this[int index] { get; set; }
```

| 모수 | 설명 |
| --- | --- |
| index | 가져오거나 설정할 특성의 0부터 시작하는 인덱스입니다. |

### 반환 값

지정된 인덱스의 속성입니다.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentOutOfRangeException | 인덱스가 범위를 벗어났습니다. |
| InvalidOperationException | 잠긴 컬렉션을 수정하려고 시도합니다. |

### 또한보십시오

* class [FeatureAttribute](../../featureattribute/)
* class [FeatureAttributeCollection](../)
* 네임스페이스 [Aspose.Gis](../../featureattributecollection/)
* 집회 [Aspose.GIS](../../../)

---

## FeatureAttributeCollection indexer (2 of 2)

가져오거나 설정합니다.[`FeatureAttribute`](../../featureattribute/) 지정된 이름으로.

```csharp
public FeatureAttribute this[string name] { get; }
```

| 모수 | 설명 |
| --- | --- |
| name | 속성의 이름입니다. |

### 반환 값

지정된 이름을 가진 속성 또는`null` 찾을 수 없는 경우.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 속성 이름은`null`. |

### 또한보십시오

* class [FeatureAttribute](../../featureattribute/)
* class [FeatureAttributeCollection](../)
* 네임스페이스 [Aspose.Gis](../../featureattributecollection/)
* 집회 [Aspose.GIS](../../../)


