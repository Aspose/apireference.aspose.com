---
title: "System::DateTime::DateTime 생성자"
linktitle: "DateTime"
second_title: "C++용 Aspose.Page"
description: "System::DateTime::DateTime 생성자. C++에서 MinValue와 동일한 가장 작은 날짜 및 시간 값을 나타내는 인스턴스를 생성합니다."
type: docs
weight: 100
url: /ko/cpp/system/datetime/datetime/
---
## DateTime::DateTime() constructor


MinValue와 동일한 가장 작은 날짜 및 시간 값을 나타내는 인스턴스를 생성합니다.

```cpp
System::DateTime::DateTime()
```

## 또 보기

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(const DateTime\&) constructor


인스턴스를 복사 생성합니다.

```cpp
System::DateTime::DateTime(const DateTime &dt)=default
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| dt | const DateTime\& | 표시된 날짜 및 시간 값을 복사할 [DateTime](../) 클래스의 인스턴스 |

## 또 보기

* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int) constructor


특정 연도, 월, 일로 지정된 날짜 및 시간 값을 나타내는 인스턴스를 생성합니다.

```cpp
System::DateTime::DateTime(int year, int month, int day)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 연도 | int | 구성 중인 인스턴스가 나타낼 연도입니다. |
| 월 | int | 구성 중인 인스턴스가 나타낼 **year**의 월입니다. |
| 일 | int | 구성 중인 인스턴스가 나타낼 **month**의 일입니다. |

## 또 보기

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, const SharedPtr\<Globalization::Calendar\>\&) constructor


지정된 달력에서 특정 연도, 월, 일로 지정된 날짜 및 시간 값을 나타내는 인스턴스를 생성합니다.

```cpp
System::DateTime::DateTime(int year, int month, int day, const SharedPtr<Globalization::Calendar> &calendar)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 연도 | int | 구성 중인 인스턴스가 나타낼 연도입니다. |
| 월 | int | 구성 중인 인스턴스가 나타낼 **year**의 월입니다. |
| 일 | int | 구성 중인 인스턴스가 나타낼 **month**의 일입니다. |
| 캘린더 | const SharedPtr\<Globalization::Calendar\>\& | 지정된 **year**, **month**, **day**를 해석하는 데 사용되는 달력입니다. |

## 또 보기

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int) constructor


특정 연도, 월, 일, 시, 분 및 초로 지정된 날짜 및 시간 값을 나타내는 인스턴스를 생성합니다.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 연도 | int | 구성 중인 인스턴스가 나타낼 연도입니다. |
| 월 | int | 구성 중인 인스턴스가 나타낼 **year**의 월입니다. |
| 일 | int | 구성 중인 인스턴스가 나타낼 **month**의 일입니다. |
| 시 | int | 구성 중인 인스턴스가 나타낼 **day**의 시입니다. |
| 분 | int | 구성 중인 인스턴스가 나타낼 **hour**의 분입니다. |
| 초 | int | 구성 중인 인스턴스가 나타낼 **minute**의 초입니다. |

## 또 보기

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&) constructor


지정된 달력에서 특정 연도, 월, 일, 시, 분 및 초로 지정된 날짜 및 시간 값을 나타내는 인스턴스를 생성합니다.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, const SharedPtr<Globalization::Calendar> &calendar)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 연도 | int | 구성 중인 인스턴스가 나타낼 연도입니다. |
| 월 | int | 구성 중인 인스턴스가 나타낼 **year**의 월입니다. |
| 일 | int | 구성 중인 인스턴스가 나타낼 **month**의 일입니다. |
| 시 | int | 구성 중인 인스턴스가 나타낼 **day**의 시입니다. |
| 분 | int | 구성 중인 인스턴스가 나타낼 **hour**의 분입니다. |
| 초 | int | 구성 중인 인스턴스가 나타낼 **minute**의 초입니다. |
| 캘린더 | const SharedPtr\<Globalization::Calendar\>\& | 지정된 **year**, **month**, **day**를 해석하는 데 사용되는 달력입니다. |

## 또 보기

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, DateTimeKind) constructor


특정 연도, 월, 일, 시, 분 및 초로 지정된 날짜 및 시간 값을 나타내는 인스턴스를 생성합니다.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, DateTimeKind kind)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 연도 | int | 구성 중인 인스턴스가 나타낼 연도입니다. |
| 월 | int | 구성 중인 인스턴스가 나타낼 **year**의 월입니다. |
| 일 | int | 구성 중인 인스턴스가 나타낼 **month**의 일입니다. |
| 시 | int | 구성 중인 인스턴스가 나타낼 **day**의 시입니다. |
| 분 | int | 구성 중인 인스턴스가 나타낼 **hour**의 분입니다. |
| 초 | int | 구성 중인 인스턴스가 나타낼 **minute**의 초입니다. |
| 종류 | DateTimeKind | 제공된 날짜 및 시간 매개변수가 로컬 시간, UTC 시간 또는 둘 다 아닌지를 나타내는 값입니다. |

## 또 보기

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, DateTimeKind) constructor


지정된 달력에서 특정 연도, 월, 일, 시, 분, 초 및 밀리초로 지정된 날짜 및 시간 값을 나타내는 인스턴스를 생성합니다.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, int millisecond, const SharedPtr<Globalization::Calendar> &calendar, DateTimeKind kind=DateTimeKind::Unspecified)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 연도 | int | 구성 중인 인스턴스가 나타낼 연도입니다. |
| 월 | int | 구성 중인 인스턴스가 나타낼 **year**의 월입니다. |
| 일 | int | 구성 중인 인스턴스가 나타낼 **month**의 일입니다. |
| 시 | int | 구성 중인 인스턴스가 나타낼 **day**의 시입니다. |
| 분 | int | 구성 중인 인스턴스가 나타낼 **hour**의 분입니다. |
| 초 | int | 구성 중인 인스턴스가 나타낼 **minute**의 초입니다. |
| 밀리초 | int | 구성 중인 인스턴스가 나타낼 **second**의 밀리초입니다. |
| 종류 | const SharedPtr\<Globalization::Calendar\>\& | 제공된 날짜 및 시간 매개변수가 로컬 시간, UTC 시간 또는 둘 다 아닌지를 나타내는 값입니다. |
| 캘린더 | DateTimeKind | 지정된 **year**, **month**, **day**를 해석하는 데 사용되는 달력입니다. |

## 또 보기

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, int, DateTimeKind) constructor


특정 연도, 월, 일, 시, 분, 초 및 밀리초로 지정된 날짜 및 시간 값을 나타내는 인스턴스를 생성합니다.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, int millisecond, DateTimeKind kind=DateTimeKind::Unspecified)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 연도 | int | 구성 중인 인스턴스가 나타낼 연도입니다. |
| 월 | int | 구성 중인 인스턴스가 나타낼 **year**의 월입니다. |
| 일 | int | 구성 중인 인스턴스가 나타낼 **month**의 일입니다. |
| 시 | int | 구성 중인 인스턴스가 나타낼 **day**의 시입니다. |
| 분 | int | 구성 중인 인스턴스가 나타낼 **hour**의 분입니다. |
| 초 | int | 구성 중인 인스턴스가 나타낼 **minute**의 초입니다. |
| 밀리초 | int | 구성 중인 인스턴스가 나타낼 **second**의 밀리초입니다. |
| 종류 | DateTimeKind | 제공된 날짜 및 시간 매개변수가 로컬 시간, UTC 시간 또는 둘 다 아닌지를 나타내는 값입니다. |

## 또 보기

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int64_t, DateTimeKind, bool) constructor


틱 수로 지정된 날짜 및 시간 값을 나타내는 인스턴스를 생성합니다. 내부 사용용.

```cpp
System::DateTime::DateTime(int64_t ticks, DateTimeKind kind, bool is_ambiguous_local_dst)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| ticks | int64_t | 그레고리력에서 0001년 1월 1일 00:00:00.000 이후 경과한 100ns 간격의 수입니다. |
| 종류 | DateTimeKind | **ticks** 매개변수가 로컬 시간, UTC 시간 또는 둘 다 아닌지를 나타내는 값입니다. |
| is_ambiguous_local_dst | bool | 지정된 날짜와 시간이 모호하고 여러 UTC 시간에 매핑될 수 있는 경우 true입니다. |

## 또 보기

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int64_t, DateTimeKind) constructor


틱 수로 지정된 날짜 및 시간 값을 나타내는 인스턴스를 생성합니다.

```cpp
System::DateTime::DateTime(int64_t ticks, DateTimeKind kind=DateTimeKind::Unspecified)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| ticks | int64_t | 그레고리력에서 0001년 1월 1일 00:00:00.000 이후 경과한 100ns 간격의 수입니다. |
| 종류 | DateTimeKind | **ticks** 매개변수가 로컬 시간, UTC 시간 또는 둘 다 아닌지를 나타내는 값입니다. |

## 또 보기

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
