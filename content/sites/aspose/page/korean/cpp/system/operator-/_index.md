---
title: "System::operator- method"
linktitle: "operator-"
second_title: "C++용 Aspose.Page"
description: "System::operator- 메서드. 지정된 값에서 지정된 Decimal 객체가 나타내는 값을 빼는 결과 값을 나타내는 Decimal 클래스의 새 인스턴스를 반환합니다."
type: docs
weight: 28100
url: /ko/cpp/system/operator-/
---
## System::operator-(const T\&, const Decimal\&) method


지정된 값에서 지정된 [Decimal](../decimal/) 객체가 나타내는 값을 빼는 결과 값을 나타내는 [Decimal](../decimal/) 클래스의 새 인스턴스를 반환합니다.

```cpp
template<typename T,typename _> Decimal System::operator-(const T &x, const Decimal &d)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| x | const T\& | 뺄 값 |
| d | const Decimal\& | 빼기된 값을 나타내는 [Decimal](../decimal/) 객체 |

### ReturnValue

새로운 [Decimal](../decimal/) 클래스 인스턴스로, **x**에서 **d**가 나타내는 값을 빼서 얻은 값을 나타냅니다.

## 또 보기

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator-(const T1\&, const Nullable\<T2\>\&) method


null이 아닌 값과 nullable 값을 빼습니다.

```cpp
template<typename T1,typename T2,typename> System::Nullable<decltype(some - other.get_Value())> System::operator-(const T1 &some, const Nullable<T2> &other)
```


| 매개변수 | 설명 |
| --- | --- |
| T1 | 왼쪽 피연산자 타입. |
| T2 | 오른쪽 피연산자 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 일부 | const T1\& | 왼쪽 피연산자. |
| 기타 | const Nullable\<T2\>\& | 오른쪽 피연산자. |

### ReturnValue

뺄셈 결과.

## 또 보기

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator-(DayOfWeek, DayOfWeek) method


요일 사이의 일수 차이를 계산합니다.

```cpp
auto System::operator-(DayOfWeek a, DayOfWeek b)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| a | DayOfWeek | 피감수 |
| b | DayOfWeek | 감수 |

### ReturnValue

요일 **a**와 **b** 사이의 일수; **b**가 **a**보다 뒤에 있으면 반환값은 음수입니다.

## 또 보기

* Enum [DayOfWeek](../dayofweek/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator-(MulticastDelegate\<T\>, MulticastDelegate\<T\>) method


왼쪽 대리자 콜백 목록의 끝에서 오른쪽 대리자의 모든 콜백을 분리합니다.

```cpp
template<typename T> MulticastDelegate<T> System::operator-(MulticastDelegate<T> lhv, MulticastDelegate<T> rhv)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| lhv | MulticastDelegate\<T\> | 콜백이 제거될 대리자. |
| rhv | MulticastDelegate\<T\> | 콜백이 제거될 대리자. |

### ReturnValue

왼쪽 값의 콜백을 포함하지만 오른쪽 값의 콜백은 제외한 대리자를 반환합니다.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
