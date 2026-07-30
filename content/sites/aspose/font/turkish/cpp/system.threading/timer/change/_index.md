---
title: "System::Threading::Timer::Change yöntemi"
linktitle: "Değiştir"
second_title: "Aspose.Font için C++"
description: "System::Threading::Timer::Change yöntemi. C++'da zamanlayıcıyı yeniden planlar veya iptal eder."
type: docs
weight: 200
url: /tr/cpp/system.threading/timer/change/
---
## Timer::Change(int64_t, int64_t) method


Zamanlayıcıyı yeniden zamanlar veya iptal eder.

```cpp
bool System::Threading::Timer::Change(int64_t dueTime, int64_t period)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| dueTime | int64_t | [Timeout](../../timeout/) bir sonraki geri çağırma işlevi çağrısı öncesi, milisaniye cinsinden; negatif değerler zamanlayıcıyı, planlanmış olsa bile iptal eder. |
| period | int64_t | [Timeout](../../timeout/) geri çağırma işlevinin ardışık çağrıları arasındaki süre, milisaniye cinsinden; sıfır veya negatif değerler zamanlayıcının yalnızca bir kez çalıştırılması gerektiği anlamına gelir. |

## Ayrıca Bakınız

* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Timer::Change(System::TimeSpan, System::TimeSpan) method


Zamanlayıcıyı yeniden zamanlar veya iptal eder.

```cpp
bool System::Threading::Timer::Change(System::TimeSpan dueTime, System::TimeSpan period)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| dueTime | System::TimeSpan | [Timeout](../../timeout/) bir sonraki geri çağırma işlevi çağrısı öncesi; negatif değerler zamanlayıcıyı, planlanmış olsa bile iptal eder. |
| period | System::TimeSpan | [Timeout](../../timeout/) geri çağırma işlevinin ardışık çağrıları arasındaki süre; sıfır veya negatif değerler zamanlayıcının yalnızca bir kez çalıştırılması gerektiği anlamına gelir. |

## Ayrıca Bakınız

* Class [TimeSpan](../../../system/timespan/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
