---
title: "System::Array::Array 생성자"
linktitle: "Array"
second_title: "C++용 Aspose.Page"
description: "System::Array::Array 생성자. C++에서 빈 배열을 생성합니다."
type: docs
weight: 100
url: /ko/cpp/system/array/array/
---
## Array::Array() constructor


빈 배열을 생성합니다.

```cpp
System::Array<T>::Array()
```

## 또 보기

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(const std::array\<UnderlyingType, InitArraySize\>\&) constructor


지정된 배열(요소가 **[UnderlyingType](../underlyingtype/)** 유형인)에서 값을 복사하여 [Array](../) 객체를 생성하고 채웁니다.

```cpp
template<std::size_t> System::Array<T>::Array(const std::array<UnderlyingType, InitArraySize> &init)
```


| 매개변수 | 설명 |
| --- | --- |
| InitArraySize | **init** 배열의 요소 수. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| init | const std::array\<UnderlyingType, InitArraySize\>\& | 구성 중인 배열에 복사할 [Array](../). |

## 또 보기

* Typedef [UnderlyingType](../underlyingtype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(const std::vector\<Q\>\&) constructor


값 유형이 **T**와 동일하지만 **[UnderlyingType](../underlyingtype/)**와 다른 std::vector 객체에서 복사한 값을 사용하여 [Array](../) 객체를 생성하고 채웁니다.

```cpp
template<typename Q,typename> System::Array<T>::Array(const std::vector<Q> &value)
```


| 매개변수 | 설명 |
| --- | --- |
| Q | 복사할 std::vector 객체 요소의 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const std::vector\\<Q\\>\\& | 값을 복사할 std::vector |

## 또 보기

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(const vector_t\&) constructor


복사 생성자.

```cpp
System::Array<T>::Array(const vector_t &assgn)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| assgn | const vector_t\\& | 값을 복사할 std::vector |

## 또 보기

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(int, const T\&) constructor


채우기 생성자.

```cpp
System::Array<T>::Array(int count, const T &init=T())
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| count | int | 배열의 초기 크기 |
| init | const T\& | 배열을 채우는 데 사용되는 초기값 |

## 또 보기

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(int, const T) constructor


채우기 생성자.

```cpp
System::Array<T>::Array(int count, const T inits[])
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| count | int | 배열의 초기 크기 |
| inits | const T | 배열을 채우는 값들 |

## 또 보기

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(std::initializer_list\<bool\>, int) constructor


지정된 초기화 리스트(요소가 bool 형인)에서 값을 가져와 [Array](../) 객체를 생성하고 채웁니다.

```cpp
System::Array<T>::Array(std::initializer_list<bool> init, int=0)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| init | std::initializer_list\<bool\> | 배열을 채우는 요소를 포함하는 초기화 리스트 |

## 또 보기

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(std::initializer_list\<UnderlyingType\>) constructor


지정된 초기화 리스트(요소가 **[UnderlyingType](../underlyingtype/)** 형인)에서 값을 가져와 [Array](../) 객체를 생성하고 채웁니다.

```cpp
System::Array<T>::Array(std::initializer_list<UnderlyingType> init)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| init | std::initializer_list\<UnderlyingType\> | 배열을 채우는 요소를 포함하는 초기화 리스트 |

## 또 보기

* Typedef [UnderlyingType](../underlyingtype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(std::vector\<Q\>\&&) constructor


[Array](../) 객체를 생성하고, 값 유형이 **T**와 동일하지만 **[UnderlyingType](../underlyingtype/)**와 다른 std::vector 객체에서 이동된 값으로 채웁니다.

```cpp
template<typename Q,typename> System::Array<T>::Array(std::vector<Q> &&value)
```


| 매개변수 | 설명 |
| --- | --- |
| Q | 요소를 이동할 std::vector 객체의 요소 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | std::vector\<Q\>\&& | 값을 복사할 std::vector |

## 또 보기

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type, ValueType) constructor


채우기 생성자.

```cpp
template<typename ValueType> System::Array<T>::Array(typename std::enable_if<std::is_arithmetic<T>::value &&std::is_arithmetic<ValueType>::value &&std::is_convertible<ValueType, T>::value, int>::type count, ValueType init)
```


| 매개변수 | 설명 |
| --- | --- |
| ValueType | 초기값의 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| count | typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type | 배열의 초기 크기 |
| init | ValueType | 배열을 채우는 데 사용되는 초기값 |

## 또 보기

* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(vector_t\&&) constructor


이동 생성자.

```cpp
System::Array<T>::Array(vector_t &&value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | vector_t\&& | 배열이 획득하는 요소가 있는 std::vector |

## 또 보기

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
