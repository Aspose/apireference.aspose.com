---
title: "System::Threading::Thread::Join yöntemi"
linktitle: "Join"
second_title: "Aspose.Page için C++"
description: "System::Threading::Thread::Join yöntemi. Yönetilen iş parçacığını birleştirir. Gerekirse C++'ta sınırsız bekleme yapar."
type: docs
weight: 1400
url: /tr/cpp/system.threading/thread/join/
---
## Thread::Join() method


Yönetilen iş parçacığına katılır. Gerekirse sınırsız bekleme yapar.

```cpp
void System::Threading::Thread::Join()
```

## Ayrıca Bakınız

* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Thread::Join(int) method


Yönetilen iş parçacığına katılır. Sınırlı bekleme yapar.

```cpp
bool System::Threading::Thread::Join(int millisecondsTimeout)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| millisecondsTimeout | int | Milisaniye cinsinden bekleme zaman aşımı. |

### ReturnValue

İş parçacığı başarılı bir şekilde birleştirildiyse doğru, zaman aşımı aşıldıysa yanlış.

## Ayrıca Bakınız

* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Thread::Join(TimeSpan) method


Yönetilen iş parçacığına katılır. Sınırlı bekleme yapar.

```cpp
bool System::Threading::Thread::Join(TimeSpan timeout)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| timeout | TimeSpan | İş parçacığının sonlanmasını beklemek için gereken süreyi belirten bir [TimeSpan](../../../system/timespan/) nesnesi. |

### ReturnValue

İş parçacığı başarılı bir şekilde birleştirildiyse doğru, zaman aşımı aşıldıysa yanlış.

## Ayrıca Bakınız

* Class [TimeSpan](../../../system/timespan/)
* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
