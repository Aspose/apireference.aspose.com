---
title: "System::Threading::WaitHandle::WaitOne metodu"
linktitle: "WaitOne"
second_title: "Aspose.Page için C++"
description: "System::Threading::WaitHandle::WaitOne metodu. C++'de tanıtıcının süresiz olarak tetiklenmesini bekler."
type: docs
weight: 600
url: /tr/cpp/system.threading/waithandle/waitone/
---
## WaitHandle::WaitOne() method


İşleyicinin tetiklenmesini sınırsız süre bekler.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne()
```


### ReturnValue

Zaman aşımı oluşmadığı için her zaman true döner.

## Ayrıca Bakınız

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(int) method


İşleyicinin tetiklenmesini bekler.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) bekleme süresi, milisaniye cinsinden; -1 sonsuz beklemeyi, 0 kontrol edip dönmeyi, pozitif değerler ise zaman aşımını ifade eder. |

### ReturnValue

Tanıtıcı tetiklendiğinde True, zaman aşımı aşıldığında false.

## Ayrıca Bakınız

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(int, bool) method


İşleyicinin tetiklenmesini bekler.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout, bool exitContext)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) bekleme süresi, milisaniye cinsinden; -1 sonsuz beklemeyi, 0 kontrol edip dönmeyi, pozitif değerler ise zaman aşımını ifade eder. |
| exitContext | bool | True ise, bekleme sırasında tanıtıcı üzerindeki kilidi, ona beklemeden önce bırakmalıdır. |

### ReturnValue

Tanıtıcı tetiklendiğinde True, zaman aşımı aşıldığında false.

## Ayrıca Bakınız

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(TimeSpan) method


İşleyicinin tetiklenmesini bekler.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(TimeSpan timeout)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| timeout | TimeSpan | Beklenecek milisaniye sayısını temsil eden bir [System::TimeSpan](../../../system/timespan/), ya da -1 milisaniyeyi temsil ederek süresiz beklemeyi gösteren bir [System::TimeSpan](../../../system/timespan/). |

### ReturnValue

Tanıtıcı tetiklendiğinde True, zaman aşımı aşıldığında false.

## Ayrıca Bakınız

* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
