---
title: "System::Array::IndexOf 메서드"
linktitle: "IndexOf"
second_title: "C++용 Aspose.Page"
description: "System::Array::IndexOf 메서드. C++에서 배열 내 지정된 항목이 처음 나타나는 인덱스를 결정합니다."
type: docs
weight: 2900
url: /ko/cpp/system/array/indexof/
---
## Array::IndexOf(const T\&) const method


배열에서 지정된 항목이 처음 나타나는 인덱스를 결정합니다.

```cpp
virtual int System::Array<T>::IndexOf(const T &item) const override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 항목 | const T\& | 찾아야 할 항목의 인덱스 |

### ReturnValue

지정된 항목이 발견되면 첫 번째 발생 인덱스, 그렇지 않으면 -1

## 또 보기

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&) method


배열에서 지정된 항목이 처음 나타나는 인덱스를 결정합니다.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value)
```


| 매개변수 | 설명 |
| --- | --- |
| ArrayType | 대상 배열의 요소 유형 |
| ValueType | 배열에서 검색할 항목의 타입 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | [Array](../)에서 지정된 항목을 검색합니다 |
| value | const ValueType\& | 찾아야 할 항목의 인덱스 |

### ReturnValue

항목이 발견되면 지정된 항목의 첫 번째 발생 인덱스, 그렇지 않으면 -1

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) method


지정된 인덱스부터 시작하여 배열에서 지정된 항목이 처음 나타나는 인덱스를 결정합니다.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex)
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

### ReturnValue

지정된 항목이 발견되면 첫 번째 발생 인덱스, 그렇지 않으면 -1

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) method


시작 인덱스와 범위 내 요소 수로 지정된 배열의 항목 범위에서 지정된 항목이 처음 나타나는 인덱스를 결정합니다.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex, int count)
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

지정된 항목이 발견되면 첫 번째 발생 인덱스, 그렇지 않으면 -1

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
