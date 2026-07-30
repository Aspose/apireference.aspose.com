---
title: "System::Threading::Timer::Timer yapıcı"
linktitle: "Timer"
second_title: "Aspose.Font için C++"
description: "System::Threading::Timer::Timer yapıcı. C++'da yapıcı."
type: docs
weight: 100
url: /tr/cpp/system.threading/timer/timer/
---
## Timer::Timer(TimerCallback) constructor


Yapıcı.

```cpp
System::Threading::Timer::Timer(TimerCallback callback)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| geri arama | TimerCallback | Zamanlayıcı tarafından çağrılacak işlev. |

## Ayrıca Bakınız

* Typedef [TimerCallback](../../timercallback/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Timer::Timer(TimerCallback, const System::SharedPtr\<System::Object\>\&, int64_t, int64_t) constructor


Yapıcı.

```cpp
System::Threading::Timer::Timer(TimerCallback callback, const System::SharedPtr<System::Object> &state, int64_t dueTime, int64_t period)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| geri arama | TimerCallback | Zamanlayıcı tarafından çağrılacak işlev. |
| durum | const System::SharedPtr\<System::Object\>\& | Geri çağırma işlevi argümanı. |
| dueTime | int64_t | [Timeout](../../timeout/) geri arama işlevinin ilk çağrısından önce, milisaniye cinsinden; negatif değerler zamanlayıcıyı oluşturulduktan sonra planlamaz, böylece daha sonra yeniden planlanabilir. |
| period | int64_t | [Timeout](../../timeout/) geri çağırma işlevinin ardışık çağrıları arasındaki süre, milisaniye cinsinden; sıfır veya negatif değerler zamanlayıcının yalnızca bir kez çalıştırılması gerektiği anlamına gelir. |

## Ayrıca Bakınız

* Typedef [TimerCallback](../../timercallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Timer::Timer(TimerCallback, const System::SharedPtr\<System::Object\>\&, System::TimeSpan, System::TimeSpan) constructor


Yapıcı.

```cpp
System::Threading::Timer::Timer(TimerCallback callback, const System::SharedPtr<System::Object> &state, System::TimeSpan dueTime, System::TimeSpan period)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| geri arama | TimerCallback | Zamanlayıcı tarafından çağrılacak işlev. |
| durum | const System::SharedPtr\<System::Object\>\& | Geri çağırma işlevi argümanı. |
| dueTime | System::TimeSpan | [Timeout](../../timeout/) geri arama işlevinin ilk çağrısından önce; negatif değerler zamanlayıcıyı oluşturulduktan sonra planlamaz, böylece daha sonra yeniden planlanabilir. |
| period | System::TimeSpan | [Timeout](../../timeout/) geri çağırma işlevinin ardışık çağrıları arasındaki süre; sıfır veya negatif değerler zamanlayıcının yalnızca bir kez çalıştırılması gerektiği anlamına gelir. |

## Ayrıca Bakınız

* Typedef [TimerCallback](../../timercallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
