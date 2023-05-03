---
title: Class EncoderParameter
second_title: .NET API 참조용 Aspose.Drawing
description: System.Drawing.Imaging.EncoderParameter 수업. 이미지 인코더에 값 또는 값 배열을 전달하는 데 사용됩니다.
type: docs
weight: 700
url: /ko/net/system.drawing.imaging/encoderparameter/
---
## EncoderParameter class

이미지 인코더에 값 또는 값 배열을 전달하는 데 사용됩니다.

```csharp
public sealed class EncoderParameter : IDisposable
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [EncoderParameter](encoderparameter/#constructor)(Encoder, byte) | 의 새 인스턴스를 초기화합니다.`EncoderParameter` 지정된 클래스Encoder object 및 하나의 부호 없는 8비트 정수. 설정ValueType property ~에ValueTypeByte , 그리고 설정NumberOfValues 속성을 1. 로 |
| [EncoderParameter](encoderparameter/#constructor_2)(Encoder, byte[]) | 의 새 인스턴스를 초기화합니다.`EncoderParameter`지정된 가 있는 클래스Encoder 개체 및 부호 없는 8비트 정수의 배열입니다. 다음을 설정합니다.ValueType 재산ValueTypeByte , 및 설정NumberOfValues array. 의 요소 수에 대한 속성 |
| [EncoderParameter](encoderparameter/#constructor_11)(Encoder, long) | 의 새 인스턴스를 초기화합니다.`EncoderParameter`지정된 가 있는 클래스Encoder 객체와 하나의 64비트 정수. 설정ValueType property ~에ValueTypeLong (32비트), the 를 설정합니다.NumberOfValues 속성을 1. 로 |
| [EncoderParameter](encoderparameter/#constructor_13)(Encoder, long[]) | 의 새 인스턴스를 초기화합니다.`EncoderParameter`지정된 가 있는 클래스Encoder 객체 및 64비트 정수 배열. 설정ValueType 속성을ValueTypeLong (32비트) 및 sets NumberOfValues array. 의 요소 수에 대한 속성 |
| [EncoderParameter](encoderparameter/#constructor_4)(Encoder, short) | 의 새 인스턴스를 초기화합니다.`EncoderParameter`지정된 가 있는 클래스Encoder 객체와 하나의 16비트 정수. 설정ValueType property ~에ValueTypeShort , 그리고 설정NumberOfValues 속성을 1. 로 |
| [EncoderParameter](encoderparameter/#constructor_5)(Encoder, short[]) | 의 새 인스턴스를 초기화합니다.`EncoderParameter`지정된 가 있는 클래스Encoder 객체 및 16비트 정수 배열. 설정ValueType 속성을ValueTypeShort , the 를 설정합니다.NumberOfValues array. 의 요소 수에 대한 속성 |
| [EncoderParameter](encoderparameter/#constructor_15)(Encoder, string) | 의 새 인스턴스를 초기화합니다.`EncoderParameter`지정된 가 있는 클래스Encoder 객체와 문자열. 문자열은 에 저장되기 전에 null로 끝나는 ASCII 문자열로 변환됩니다.EncoderParameter 물체. 설정ValueType 속성을ValueTypeAscii , 그리고 sets 는NumberOfValues NULL 종료자를 포함하는 ASCII 문자열의 길이에 대한 속성입니다. |
| [EncoderParameter](encoderparameter/#constructor_1)(Encoder, byte, bool) | 의 새 인스턴스를 초기화합니다.`EncoderParameter`지정된 가 있는 클래스Encoder 객체와 하나의 8비트 값. 설정ValueType property ~에ValueTypeUndefined 또는ValueTypeByte , 및 설정NumberOfValues 속성을 1. 로 |
| [EncoderParameter](encoderparameter/#constructor_3)(Encoder, byte[], bool) | 의 새 인스턴스를 초기화합니다.`EncoderParameter`지정된 가 있는 클래스Encoder 객체와 바이트 배열. 설정ValueType 속성을ValueTypeUndefined or ValueTypeByte , 그리고 설정NumberOfValues 속성을 array. 의 요소 수로 |
| [EncoderParameter](encoderparameter/#constructor_6)(Encoder, int, int) | 의 새 인스턴스를 초기화합니다.`EncoderParameter`지정된 가 있는 클래스Encoder객체와 32비트 정수 쌍. 정수 쌍은 분수를 나타냅니다. 첫 번째 정수는 분자이고 두 번째 정수는 분모입니다. ValueType 재산ValueTypeRational , 및 설정NumberOfValues 속성을 1. 로 |
| [EncoderParameter](encoderparameter/#constructor_9)(Encoder, int[], int[]) | 의 새 인스턴스를 초기화합니다.`EncoderParameter`지정된 가 있는 클래스Encoder 객체 및 32비트 정수의 두 배열. 두 배열은 분수의 배열을 나타냅니다. 다음을 설정합니다.ValueType 재산ValueTypeRational , 및 설정NumberOfValues속성의 elements 수에*numerator* 배열의 elements 수와 동일해야 합니다.*denominator* 정렬. |
| [EncoderParameter](encoderparameter/#constructor_12)(Encoder, long, long) | 의 새 인스턴스를 초기화합니다.`EncoderParameter`지정된 가 있는 클래스Encoder 객체와 한 쌍의 64비트 정수. 정수 쌍은 정수 범위를 나타냅니다. 첫 번째 정수는 범위에서 가장 작은 숫자이고 두 번째 정수는 범위에서 가장 큰 숫자입니다. 설정ValueType 재산ValueTypeLongRange , 및 설정NumberOfValues 속성을 1. 로 |
| [EncoderParameter](encoderparameter/#constructor_14)(Encoder, long[], long[]) | 의 새 인스턴스를 초기화합니다.`EncoderParameter`지정된 가 있는 클래스Encoder 객체와 64비트 정수의 두 배열. 두 배열은 배열 정수 범위를 나타냅니다. ValueType 재산ValueTypeLongRange , 및 설정NumberOfValues속성의 elements 수에*rangebegin* 배열의 elements 수와 동일해야 합니다.*rangeend* 배열. |
| [EncoderParameter](encoderparameter/#constructor_7)(Encoder, int, int, int) | 의 새 인스턴스를 초기화합니다.`EncoderParameter`지정된 가 있는 클래스Encoder 개체 및 값의 수, 값의 데이터 유형, 및 저장된 값에 대한 포인터를 지정하는 세 개의 정수EncoderParameter object. |
| [EncoderParameter](encoderparameter/#constructor_8)(Encoder, int, int, int, int) | 의 새 인스턴스를 초기화합니다.`EncoderParameter`지정된 가 있는 클래스Encoder 객체 및 4개의 32비트 정수. 4개의 정수는 분수 범위를 나타냅니다. 처음 두 정수는 범위에서 가장 작은 분수를 나타내고 나머지 두 정수는 범위에서 가장 큰 분수를 나타냅니다. 설정ValueType 속성 to ValueTypeRationalRange , 그리고 sets 는NumberOfValues 속성을 1. 로 |
| [EncoderParameter](encoderparameter/#constructor_10)(Encoder, int[], int[], int[], int[]) | 의 새 인스턴스를 초기화합니다.`EncoderParameter`지정된 가 있는 클래스Encoder 객체 및 32비트 정수의 4개 배열. 4개의 배열은 배열 유리수 범위를 나타냅니다. 유리수 범위는 최소 분수 값에서 최대 분수 값까지의 모든 분수 집합입니다. 다음을 설정합니다.ValueType 재산ValueTypeRationalRange , 및 설정NumberOfValues in 요소 수에 대한 속성*numerator1* 배열, 다른 세 배열의 요소 수와 같아야 합니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Encoder](../../system.drawing.imaging/encoderparameter/encoder/) { get; set; } | 가져오거나 설정합니다.Encoder 이것과 관련된 객체EncoderParameter object. Encoder object는 category 를 지정하는 GUID(Globally Unique Identifier)를 캡슐화합니다(예:Quality ,ColorDepth , 또는Compression )에 저장된 매개변수의EncoderParameter object. |
| [NumberOfValues](../../system.drawing.imaging/encoderparameter/numberofvalues/) { get; } | 여기에 저장된 값 배열의 요소 수를 가져옵니다.EncoderParameter object. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Dispose](../../system.drawing.imaging/encoderparameter/dispose/)() | 이에서 사용하는 모든 리소스를 해제합니다.EncoderParameter object. |

### 또한보십시오

* 네임스페이스 [System.Drawing.Imaging](../../system.drawing.imaging/)
* 집회 [Aspose.Drawing](../../)


