---
title: Feature.GetValue
second_title: .NET API 참조를 위한 Aspose.GIS
description: Feature 방법. 속성 값을 가져옵니다.
type: docs
weight: 30
url: /ko/net/aspose.gis/feature/getvalue/
---
## GetValue&lt;T&gt;(string) {#getvalue_1}

속성 값을 가져옵니다.

```csharp
public T GetValue<T>(string attributeName)
```

| 모수 | 설명 |
| --- | --- |
| T | 값에 대해 원하는 유형입니다. |
| attributeName | 속성의 이름입니다. |

### 반환 값

속성의 값입니다.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 속성 이름은`null`. |
| ArgumentException | 이 이름을 가진 속성이 이 레이어에 없습니다. |
| InvalidOperationException | 속성이 잠겨 있지 않습니다. |
| InvalidOperationException | 이 특성 값은 이 기능에 대해 설정되지 않았습니다. |
| InvalidCastException | 요청한 유형이 구현되지 않습니다.IConvertible. |
| InvalidCastException | 속성 값은`null`, 그러나 요청된 유형은 값 유형입니다. |
| FormatException | 값이 잘못된 형식이기 때문에 변환에 실패했습니다. |
| OverflowException | 오버플로로 인해 변환에 실패했습니다. |

### 비고

이 메서드는 값을 제네릭 형식 매개 변수에서 요청한 형식으로 자동 변환합니다.  레이어가 레이어에 대해 정의된 모든 특성에 대한 값을 갖는 피처를 요구하지 않는 경우 이 방법은 실패할 수 있습니다.InvalidOperationException 누락된 값이 요청된 경우. 이러한 레이어로 작업할 때 다음을 사용하는 것이 좋습니다.[`GetValueOrDefault`](../getvalueordefault/) .

### 또한보십시오

* class [Feature](../)
* 네임스페이스 [Aspose.Gis](../../feature/)
* 집회 [Aspose.GIS](../../../)

---

## GetValue(string) {#getvalue}

속성 값을 가져옵니다.

```csharp
public object GetValue(string attributeName)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| attributeName | String | 속성의 이름입니다. |

### 반환 값

속성의 값입니다.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 속성 이름은`null`. |
| ArgumentException | 이 이름을 가진 속성이 이 레이어에 없습니다. |
| InvalidOperationException | 속성이 잠겨 있지 않습니다. |
| InvalidOperationException | 이 특성 값은 이 기능에 대해 설정되지 않았습니다. |

### 비고

레이어가 레이어에 대해 정의된 모든 특성에 대한 값을 갖는 피처를 요구하지 않는 경우 이 방법은 실패할 수 있습니다.InvalidOperationException 누락된 값이 요청된 경우. 이러한 레이어로 작업할 때 다음을 사용하는 것이 좋습니다.[`GetValueOrDefault`](../getvalueordefault/) .

### 또한보십시오

* class [Feature](../)
* 네임스페이스 [Aspose.Gis](../../feature/)
* 집회 [Aspose.GIS](../../../)


