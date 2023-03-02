---
title: Feature.SetValue
second_title: .NET API 참조를 위한 Aspose.GIS
description: Feature 방법. 속성의 새 값을 설정합니다.
type: docs
weight: 100
url: /ko/net/aspose.gis/feature/setvalue/
---
## Feature.SetValue&lt;T&gt; method

속성의 새 값을 설정합니다.

```csharp
public void SetValue<T>(string attributeName, T value)
```

| 모수 | 설명 |
| --- | --- |
| T | 값의 유형입니다. |
| attributeName | 속성의 이름입니다. |
| value | 속성의 값입니다. |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 속성 이름은`null`. |
| ArgumentException | 이 이름을 가진 속성이 이 레이어에 없습니다. |
| InvalidOperationException | 속성이 잠겨 있지 않습니다. |
| InvalidCastException | 값의 유형이 구현되지 않습니다.IConvertible. |
| FormatException | 값이 잘못된 형식이기 때문에 변환에 실패했습니다. |
| OverflowException | 오버플로로 인해 변환에 실패했습니다. |

### 비고

이 메서드는 값을 속성의 유형으로 자동 변환합니다.

### 또한보십시오

* class [Feature](../)
* 네임스페이스 [Aspose.Gis](../../feature/)
* 집회 [Aspose.GIS](../../../)


