---
title: "System::Threading::Thread::Join yöntemi"
linktitle: "Join"
second_title: "Aspose.Font için C++"
description: "System::Threading::Thread::Join yöntemi. Yönetilen iş parçacığını birleştirir. Gerekirse C++'da sınırsız bekleme yapar."
type: docs
weight: 1400
url: /tr/cpp/system.threading/thread/join/
---
## Thread::Join() method


Yönetilen thread'e katılır. Gerekirse sınırsız bekleme yapar.

```cpp
void System::Threading::Thread::Join()
```

## Ayrıca Bakınız

* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Thread::Join(int) method


Yönetilen thread'e katılır. Sınırlı bekleme yapar.

```cpp
bool System::Threading::Thread::Join(int millisecondsTimeout)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| millisecondsTimeout | int | Milisaniye cinsinden bekleme zaman aşımı. |

### ReturnValue

İş parçacığı başarılı bir şekilde birleştirildiyse doğru, zaman aşımı aşıldıysa yanlış.

## Ayrıca Bakınız

* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Thread::Join(TimeSpan) method


Yönetilen thread'e katılır. Sınırlı bekleme yapar.

```cpp
bool System::Threading::Thread::Join(TimeSpan timeout)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| timeout | TimeSpan | İş parçacığının sonlanmasını beklemek için gereken süreyi belirten bir [TimeSpan](../../../system/timespan/) nesnesi. |

### ReturnValue

İş parçacığı başarılı bir şekilde birleştirildiyse doğru, zaman aşımı aşıldıysa yanlış.

## Ayrıca Bakınız

* Class [TimeSpan](../../../system/timespan/)
* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
