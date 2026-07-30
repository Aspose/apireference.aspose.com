---
title: "System::Threading::Tasks::Delay yöntemi"
linktitle: "Gecikme"
second_title: "Aspose.Font için C++"
description: "System::Threading::Tasks::Delay yöntemi. C++'da bir zaman gecikmesinden sonra tamamlanan bir görev oluşturur."
type: docs
weight: 1000
url: /tr/cpp/system.threading.tasks/delay/
---
## System::Threading::Tasks::Delay(int32_t) method


Bir zaman gecikmesinden sonra tamamlanan bir görev oluşturur.

```cpp
TaskPtr System::Threading::Tasks::Delay(int32_t millisecondsDelay)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| millisecondsDelay | int32_t | Dönen görevin tamamlanmadan önce bekleyeceği milisaniye sayısı, ya da süresiz beklemek için -1. |

### ReturnValue

Zaman gecikmesini temsil eden bir görev.

## Ayrıca Bakınız

* Typedef [TaskPtr](../../system/taskptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::Delay(int32_t, const CancellationToken\&) method


Bir zaman gecikmesinden sonra tamamlanan ve iptal edilebilen bir görev oluşturur.

```cpp
TaskPtr System::Threading::Tasks::Delay(int32_t millisecondsDelay, const CancellationToken &cancellationToken)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| millisecondsDelay | int32_t | Dönen görevin tamamlanmadan önce bekleyeceği milisaniye sayısı, ya da süresiz beklemek için -1. |
| cancellationToken | const CancellationToken\& | Gecikmeyi iptal etmek için kullanılabilecek iptal belirteci. |

### ReturnValue

Zaman gecikmesini temsil eden bir görev.

## Ayrıca Bakınız

* Typedef [TaskPtr](../../system/taskptr/)
* Class [CancellationToken](../../system.threading/cancellationtoken/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
