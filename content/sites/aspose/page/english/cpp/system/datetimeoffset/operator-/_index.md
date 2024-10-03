---
title: System::DateTimeOffset::operator- method
linktitle: operator-
second_title: Aspose.Page for C++
description: 'System::DateTimeOffset::operator- method. Returns a new instance of the DateTimeOffset class representing the date and time value which is the result of subtraction of the specified time span from the value represented by the current object in C++.'
type: docs
weight: 4100
url: /cpp/system/datetimeoffset/operator-/
---
## DateTimeOffset::operator-(TimeSpan) const method


Returns a new instance of the [DateTimeOffset](../) class representing the date and time value which is the result of subtraction of the specified time span from the value represented by the current object.

```cpp
DateTimeOffset System::DateTimeOffset::operator-(TimeSpan value) const
```


| Parameter | Type | Description |
| --- | --- | --- |
| value | TimeSpan | A time interval to subtract |

### ReturnValue

A new instance of the [DateTimeOffset](../) class representing the date and time value which is the result of subtraction of **value** from the value represented by the current object.

## See Also

* Class [DateTimeOffset](../)
* Class [TimeSpan](../../timespan/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::operator-(const DateTimeOffset\&) const method


Returns an instance of [TimeSpan](../../timespan/) class that represents the time interval between the date and time values represented by the current and the specified objects.

```cpp
TimeSpan System::DateTimeOffset::operator-(const DateTimeOffset &other) const
```


| Parameter | Type | Description |
| --- | --- | --- |
| other | const DateTimeOffset\& | An instance of [DateTime](../../datetime/) class that marks one end of the interval to be calculated |

### ReturnValue

An instance of [TimeSpan](../../timespan/) class representing the time interval between the date and time values represented by the current object and **other**.

## See Also

* Class [TimeSpan](../../timespan/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
