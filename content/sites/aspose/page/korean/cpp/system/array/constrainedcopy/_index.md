---
title: "System::Array::ConstrainedCopy 메서드"
linktitle: "ConstrainedCopy"
second_title: "C++용 Aspose.Page"
description: "System::Array::ConstrainedCopy 메서드. 지정된 소스부터 시작하여 System.Array에서 요소 범위를 복사합니다 (C++)."
type: docs
weight: 4700
url: /ko/cpp/system/array/constrainedcopy/
---
## Array::ConstrainedCopy method


지정된 소스부터 시작하여 [System.Array](../)에서 요소 범위를 복사합니다.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::ConstrainedCopy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| 매개변수 | 설명 |
| --- | --- |
| SrcType | 소스 배열의 요소 유형 |
| DstType | 대상 배열의 요소 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | 소스 배열 |
| srcIndex | int64_t | 복사할 항목 범위의 시작을 지정하는 소스 배열의 인덱스 |
| dstArray | const ArrayPtr\<DstType\>\& | 대상 배열 |
| dstIndex | int64_t | 복사된 항목을 삽입하기 시작하는 대상 배열의 인덱스 |
| count | int64_t | 복사할 요소의 개수 |
## 비고


아무런 UNDONES도 없는 임시 원시 구현!
## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
