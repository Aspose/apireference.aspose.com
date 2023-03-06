---
title: NumericFormat.General
second_title: .NET API 참조를 위한 Aspose.GIS
description: NumericFormat 방법. 숫자 유형과 정밀도 지정자가 있는지 여부에 따라 숫자를 고정 소수점 또는 과학적 표기법인 로 변환합니다. 사용을 권장합니다.
type: docs
weight: 30
url: /ko/net/aspose.gis/numericformat/general/
---
## NumericFormat.General method

숫자 유형과 정밀도 지정자가 있는지 여부에 따라 숫자를 고정 소수점 또는 과학적 표기법인 로 변환합니다. 사용을 권장합니다.

```csharp
public static NumericFormat General(int precision = 0)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| precision | Int32 | 정밀도는 결과 문자열에 나타날 수 있는 최대 유효 자릿수를 정의합니다. 정밀도가 0이면 값 "15"가 사용됩니다. 사용 가능한 최대 정밀도는 "17"입니다. |

### 반환 값

일반 형식 지정자.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentOutOfRangeException | 유효 자릿수가 0보다 작거나 17보다 큽니다. |

### 비고

내부 코드는 다음을 통해 WKT에 대한 숫자 문자열을 생성합니다. coordinate.ToString("G", CultureInfo.InvariantCulture).

### 또한보십시오

* class [NumericFormat](../)
* 네임스페이스 [Aspose.Gis](../../numericformat/)
* 집회 [Aspose.GIS](../../../)


