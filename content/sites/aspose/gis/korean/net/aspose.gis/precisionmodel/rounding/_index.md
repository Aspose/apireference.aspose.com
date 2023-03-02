---
title: PrecisionModel.Rounding
second_title: .NET API 참조를 위한 Aspose.GIS
description: PrecisionModel 방법. 반올림 정밀도 모델을 반환합니다. 반올림 정밀도 모델에 따르면 제한된 자릿수만 중요합니다.
type: docs
weight: 20
url: /ko/net/aspose.gis/precisionmodel/rounding/
---
## PrecisionModel.Rounding method

반올림 정밀도 모델을 반환합니다. 반올림 정밀도 모델에 따르면 제한된 자릿수만 중요합니다.

```csharp
public static PrecisionModel Rounding(int significantDigits)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| significantDigits | Int32 | 유효 자릿수입니다. |

### 반환 값

반올림 정밀도 모델.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentOutOfRangeException | 유효 자릿수가 0보다 작거나 15보다 큽니다. |

### 비고

좌표에 적용할 때 정밀도를 줄이기 위해 다음 코드가 사용됩니다.

```csharp
double rounded = Math.Round(value, significantDigits);
```

### 또한보십시오

* class [PrecisionModel](../)
* 네임스페이스 [Aspose.Gis](../../precisionmodel/)
* 집회 [Aspose.GIS](../../../)


