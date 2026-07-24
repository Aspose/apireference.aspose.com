---
title: "System::Array::LastIndexOf method"
linktitle: "LastIndexOf"
second_title: "C++용 Aspose.Page"
description: "System::Array::LastIndexOf 메서드. 시작 인덱스와 범위 내 요소 수로 지정된 배열의 항목 범위에서 지정된 항목이 마지막으로 나타나는 인덱스를 C++에서 결정합니다."
type: docs
weight: 5500
url: /ko/cpp/system/array/lastindexof/
---
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) method


시작 인덱스와 범위 내 요소 수로 지정된 배열의 항목 범위에서 지정된 항목이 마지막으로 나타나는 인덱스를 결정합니다.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex, int count)
```


| 매개변수 | 설명 |
| --- | --- |
| ArrayType | 대상 배열의 요소 유형 |
| ValueType | 배열에서 검색할 항목의 타입 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | [Array](../)에서 지정된 항목을 검색합니다 |
| value | const ValueType\& | 찾아야 할 항목의 인덱스 |
| startIndex | int | 검색이 시작되는 인덱스 |
| count | int | 검색할 범위의 요소 수 |

### ReturnValue

항목이 발견되면 지정된 항목이 마지막으로 나타나는 인덱스를 반환하고, 그렇지 않으면 -1을 반환합니다.

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&) method


배열에서 지정된 항목이 마지막으로 나타나는 인덱스를 결정합니다.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &items, const ValueType &value)
```


| 매개변수 | 설명 |
| --- | --- |
| ArrayType | 대상 배열의 요소 유형 |
| ValueType | 배열에서 검색할 항목의 타입 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| items | const ArrayPtr\<ArrayType\>\& | [Array](../)에서 지정된 항목을 검색합니다 |
| value | const ValueType\& | 찾아야 할 항목의 인덱스 |

### ReturnValue

항목이 발견되면 지정된 항목이 마지막으로 나타나는 인덱스를 반환하고, 그렇지 않으면 -1을 반환합니다.

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) method


지정된 인덱스부터 시작하여 배열에서 지정된 항목이 마지막으로 나타나는 인덱스를 결정합니다.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &items, const ValueType &value, int startIndex)
```


| 매개변수 | 설명 |
| --- | --- |
| ArrayType | 대상 배열의 요소 유형 |
| ValueType | 배열에서 검색할 항목의 타입 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| items | const ArrayPtr\<ArrayType\>\& | [Array](../)에서 지정된 항목을 검색합니다 |
| value | const ValueType\& | 찾아야 할 항목의 인덱스 |
| startIndex | int | 검색이 시작되는 인덱스 |

### ReturnValue

항목이 발견되면 지정된 항목이 마지막으로 나타나는 인덱스를 반환하고, 그렇지 않으면 -1을 반환합니다.

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
