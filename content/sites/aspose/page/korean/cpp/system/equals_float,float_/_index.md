---
title: "System::Equals< float, float > 메서드"
linktitle: "같음< float, float >"
second_title: "C++용 Aspose.Page"
description: "System::Equals< float, float > 메서드. 단정밀도 부동소수점 값에 대한 특수화입니다. IEC 60559:1989에 의해 두 부동소수점 NaN은 항상 서로 다르다고 정의되지만, System.Object.Equals에 대한 계약은 오버라이드가 동등 연산자의 요구 사항을 만족해야 함을 요구합니다. 따라서 System.Double.Equals와 System.Single.Equals는 두 NaN을 비교할 때 True를 반환하지만, 해당 경우 동등 연산자는 False를 반환합니다(이는 C++ 표준에서 요구하는 바입니다)."
type: docs
weight: 18400
url: /ko/cpp/system/equals_float,float_/
---
## System::Equals< float, float > method


단정밀도 부동소수점 값에 대한 특수화입니다. IEC 60559:1989에 의해 두 부동소수점 NaN은 항상 서로 다르다고 정의되지만, [System.Object.Equals](../object/equals/)에 대한 계약은 오버라이드가 동등 연산자의 요구 사항을 만족해야 함을 요구합니다. 따라서 System.Double.Equals와 System.Single.Equals는 두 NaN을 비교할 때 True를 반환하지만, 해당 경우 동등 연산자는 False를 반환합니다(표준에서 요구하는 바와 같습니다).

```cpp
bool System::Equals<float, float>(const float &a, const float &b)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| a | const float\& | 첫 번째 비교값 |
| b | const float\& | 두 번째 비교값 |

### ReturnValue

두 값이 NaN이거나 동일하면 True, 그렇지 않으면 false

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
