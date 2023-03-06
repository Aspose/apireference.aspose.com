---
title: NumericFormat.Flat
second_title: .NET API 참조를 위한 Aspose.GIS
description: NumericFormat 방법. 과학 표기법 없이 숫자를 고정 소수점 텍스트로 변환합니다.
type: docs
weight: 20
url: /ko/net/aspose.gis/numericformat/flat/
---
## NumericFormat.Flat method

과학 표기법 없이 숫자를 고정 소수점 텍스트로 변환합니다.

```csharp
public static NumericFormat Flat(int significantDigits)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| significantDigits | Int32 | 유효 자릿수입니다. 사용 가능한 최대 정밀도는 "308"입니다. |

### 반환 값

반올림 정밀도 지정자.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentOutOfRangeException | 유효 자릿수가 0보다 작거나 308보다 큽니다. |

### 비고

내부 코드는 다음을 통해 WKT에 대한 숫자 문자열을 생성합니다. coordinate.ToString("0.##..", CultureInfo.InvariantCulture) decision.

### 또한보십시오

* class [NumericFormat](../)
* 네임스페이스 [Aspose.Gis](../../numericformat/)
* 집회 [Aspose.GIS](../../../)


