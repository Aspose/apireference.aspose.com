---
title: "System::Collections::Generic::List::LastIndexOf 메서드"
linktitle: "LastIndexOf"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::List::LastIndexOf 메서드. 지정된 객체를 검색하고 C++ 전체 리스트에서 마지막 발생 위치의 0 기반 인덱스를 반환합니다."
type: docs
weight: 3400
url: /ko/cpp/system.collections.generic/list/lastindexof/
---
## List::LastIndexOf(const T\&) const method


지정된 객체를 검색하고 전체 리스트 내에서 마지막으로 나타나는 위치의 0 기반 인덱스를 반환합니다.

```cpp
int32_t System::Collections::Generic::List<T>::LastIndexOf(const T &item) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 항목 | const T\& | 리스트에서 찾을 객체 |

### ReturnValue

전체 [List](../)에서 항목의 마지막 발생 위치의 0 기반 인덱스이며, 찾지 못하면 -1을 반환합니다.

## 또 보기

* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## List::LastIndexOf(const T\&, int32_t) const method


지정된 객체를 검색하고 첫 번째 요소부터 지정된 인덱스까지 확장되는 [List](../)의 요소 범위 내에서 마지막 발생 위치의 0 기반 인덱스를 반환합니다.

```cpp
int32_t System::Collections::Generic::List<T>::LastIndexOf(const T &item, int32_t index) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 항목 | const T\& | 리스트에서 찾을 객체 |
| index | int32_t | 역방향 검색의 0 기반 시작 인덱스. |

### ReturnValue

첫 번째 요소부터 인덱스까지 확장되는 [List](../)의 요소 범위 내에서 항목의 마지막 발생 위치의 0 기반 인덱스이며, 찾지 못하면 -1을 반환합니다.

## 또 보기

* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## List::LastIndexOf(const T\&, int32_t, int32_t) const method


지정된 객체를 검색하고 지정된 개수의 요소를 포함하며 지정된 인덱스에서 끝나는 [List](../)의 요소 범위 내에서 마지막 발생 위치의 0 기반 인덱스를 반환합니다.

```cpp
int32_t System::Collections::Generic::List<T>::LastIndexOf(const T &item, int32_t index, int32_t count) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| item | const T\& | [List](../)에서 찾을 객체 |
| index | int32_t | 역방향 검색의 0 기반 시작 인덱스. |
| count | int32_t | 검색할 구간의 요소 수. |

### ReturnValue

[List](../)에서 count 개수의 요소를 포함하고 인덱스에서 끝나는 요소 범위 내에서 항목의 마지막 발생 위치의 0 기반 인덱스이며, 찾지 못하면 -1을 반환합니다.

## 또 보기

* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
