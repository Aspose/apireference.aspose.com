---
title: "System::Collections::Generic::operator== 메서드"
linktitle: "operator=="
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::operator== 메서드. ''equals'' 의미를 사용하여 두 키-값 쌍을 비교합니다. C++에서 정의된 경우, 키와 값 모두에 대해 operator == 또는 EqualsTo 메서드를 사용합니다."
type: docs
weight: 5600
url: /ko/cpp/system.collections.generic/operator==/
---
## System::Collections::Generic::operator== method


'equals' 의미를 사용하여 두 키-값 쌍을 비교합니다. 정의된 경우, 키와 값 모두에 대해 operator == 또는 EqualsTo 메서드를 사용합니다.

```cpp
template<typename TKey,typename TValue> bool System::Collections::Generic::operator==(const KeyValuePair<TKey, TValue> &left, const KeyValuePair<TKey, TValue> &right)
```


| 매개변수 | 설명 |
| --- | --- |
| TKey | 키 유형. |
| TValue | 값 형식. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 왼쪽 | const KeyValuePair\<TKey, TValue\>\& | 좌변 피연산자. |
| 오른쪽 | const KeyValuePair\<TKey, TValue\>\& | 우변 피연산자. |

### ReturnValue

키와 값이 모두 일치하면 true, 그렇지 않으면 false.

## 또 보기

* Class [KeyValuePair](../keyvaluepair/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
