---
title: "System::DateTimeOffset::DateTimeOffset 생성자"
linktitle: "DateTimeOffset"
second_title: "C++용 Aspose.Page"
description: "System::DateTimeOffset::DateTimeOffset 생성자. C++의 기본 생성자."
type: docs
weight: 100
url: /ko/cpp/system/datetimeoffset/datetimeoffset/
---
## DateTimeOffset::DateTimeOffset() constructor


기본 생성자.

```cpp
System::DateTimeOffset::DateTimeOffset()=default
```

## 또 보기

* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::DateTimeOffset(DateTime) constructor


생성자.

```cpp
System::DateTimeOffset::DateTimeOffset(DateTime date_time)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| date_time | DateTime | 날짜 및 시간. |

## 또 보기

* Class [DateTime](../../datetime/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::DateTimeOffset(DateTime, TimeSpan) constructor


생성자.

```cpp
System::DateTimeOffset::DateTimeOffset(DateTime date_time, TimeSpan offset)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| date_time | DateTime | 날짜 및 시간. |
| offset | TimeSpan | UTC로부터의 시간 오프셋. |

## 또 보기

* Class [DateTime](../../datetime/)
* Class [TimeSpan](../../timespan/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::DateTimeOffset(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, TimeSpan) constructor


생성자.

```cpp
System::DateTimeOffset::DateTimeOffset(int year, int month, int day, int hour, int minute, int second, int millisecond, const SharedPtr<Globalization::Calendar> &calendar, TimeSpan offset)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 연도 | int | 연도. |
| 월 | int | 월 (1~12). |
| 일 | int | 일 (1~해당 월의 일수). |
| 시 | int | 시 (0~23). |
| 분 | int | 분 (0~59). |
| 초 | int | 초 (0~59). |
| 밀리초 | int | 밀리초 (0~999). |
| 캘린더 | const SharedPtr\<Globalization::Calendar\>\& | 연도, 월 및 일을 해석하는 데 사용되는 캘린더. |
| offset | TimeSpan | UTC로부터의 시간 오프셋. |

## 또 보기

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Class [TimeSpan](../../timespan/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::DateTimeOffset(int, int, int, int, int, int, int, TimeSpan) constructor


생성자.

```cpp
System::DateTimeOffset::DateTimeOffset(int year, int month, int day, int hour, int minute, int second, int millisecond, TimeSpan offset)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 연도 | int | 연도 (1~9999). |
| 월 | int | 월 (1~12). |
| 일 | int | 일 (1~해당 월의 일수). |
| 시 | int | 시 (0~23). |
| 분 | int | 분 (0~59). |
| 초 | int | 초 (0~59). |
| 밀리초 | int | 밀리초 (0~999). |
| offset | TimeSpan | UTC로부터의 시간 오프셋. |

## 또 보기

* Class [TimeSpan](../../timespan/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::DateTimeOffset(int, int, int, int, int, int, TimeSpan) constructor


생성자.

```cpp
System::DateTimeOffset::DateTimeOffset(int year, int month, int day, int hour, int minute, int second, TimeSpan offset)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 연도 | int | 연도 (1~9999). |
| 월 | int | 월 (1~12). |
| 일 | int | 일 (1~해당 월의 일수). |
| 시 | int | 시 (0~23). |
| 분 | int | 분 (0~59). |
| 초 | int | 초 (0~59). |
| offset | TimeSpan | UTC로부터의 시간 오프셋. |

## 또 보기

* Class [TimeSpan](../../timespan/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::DateTimeOffset(int64_t, TimeSpan) constructor


생성자.

```cpp
System::DateTimeOffset::DateTimeOffset(int64_t ticks, TimeSpan offset)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| ticks | int64_t | 틱 수. |
| offset | TimeSpan | UTC로부터의 시간 오프셋. |

## 또 보기

* Class [TimeSpan](../../timespan/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
