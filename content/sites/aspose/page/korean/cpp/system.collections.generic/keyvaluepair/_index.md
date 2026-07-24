---
title: "System::Collections::Generic::KeyValuePair 클래스"
linktitle: "KeyValuePair"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::KeyValuePair 클래스. 키와 값의 쌍. 이 타입은 스택에 할당하고 값 또는 참조로 함수에 전달해야 합니다. C++에서 이 타입의 객체를 관리하기 위해 System::SmartPtr 클래스를 절대 사용하지 마세요."
type: docs
weight: 2900
url: /ko/cpp/system.collections.generic/keyvaluepair/
---
## KeyValuePair class


키와 값의 쌍. 이 타입은 스택에 할당하고 값 또는 참조로 함수에 전달해야 합니다. 이 타입의 객체를 관리하기 위해 [System::SmartPtr](../../system/smartptr/) 클래스를 절대 사용하지 마세요.

```cpp
template<typename TKey,typename TValue>class KeyValuePair
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Key](./get_key/)() const | 키를 가져옵니다. |
| [get_Value](./get_value/)() const | 값을 가져옵니다. |
| [GetHashCode](./gethashcode/)() const | 키와 값의 해시를 XOR하여 키-값 쌍의 해시를 계산합니다. |
| [IsNull](./isnull/)() const | 항상 false를 반환합니다. |
| [KeyValuePair](./keyvaluepair/)() | 널 키-값 쌍 초기화자. |
| [KeyValuePair](./keyvaluepair/)(const TKey\&, const TValue\&) | 생성자. |
| [KeyValuePair](./keyvaluepair/)(const std::pair\<OtherK, OtherV\>\&) | 형 변환 생성자. |
| [operator<](./operator_/)(const KeyValuePair\&) const | [IComparer<KeyValuePair<TKey, TValue>>](../icomparer/) 를 상속받은 클래스용 패치이며, 아무것도 비교하지 않습니다. |
| [ToString](./tostring/)() const | 키-값 쌍을 문자열로 변환합니다. |

## 또 보기

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
