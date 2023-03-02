---
title: Feature.GetValuesList
second_title: .NET API 참조를 위한 Aspose.GIS
description: Feature 방법. 속성 시퀀스의 값을 목록으로 가져옵니다.
type: docs
weight: 70
url: /ko/net/aspose.gis/feature/getvalueslist/
---
## Feature.GetValuesList&lt;T&gt; method

속성 시퀀스의 값을 목록으로 가져옵니다.

```csharp
public List<T> GetValuesList<T>(string attributeName, string separator)
```

| 모수 | 설명 |
| --- | --- |
| T | 값에 대해 원하는 유형입니다. |
| attributeName | 속성의 이름입니다. |
| separator | 시퀀스의 속성 이름과 색인 값을 구분하는 데 사용되는 문자열입니다. |

### 반환 값

시퀀스 인덱스 값에 따라 이름이 다른 속성의 값 목록입니다.

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

이것은 사용[`GetValue`](../getvalue/) 단일 값을 얻으려면. 따라서 이 메서드는 값을 제네릭 형식 매개 변수에서 요청한 형식으로 자동 변환합니다.  인덱스가 0인 속성을 찾을 수 없으면 생성됩니다.ArgumentException .

### 또한보십시오

* class [Feature](../)
* 네임스페이스 [Aspose.Gis](../../feature/)
* 집회 [Aspose.GIS](../../../)


