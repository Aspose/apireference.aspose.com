---
title: "System::Threading::Tasks::FromException method"
linktitle: "FromException"
second_title: "Aspose.Font için C++"
description: "System::Threading::Tasks::FromException yöntemi. C++'ta belirtilen bir istisna ile tamamlanmış bir görev oluşturur."
type: docs
weight: 1300
url: /tr/cpp/system.threading.tasks/fromexception/
---
## System::Threading::Tasks::FromException(const Exception\&) method


Belirtilen bir istisna ile tamamlanmış bir görev oluşturur.

```cpp
TaskPtr System::Threading::Tasks::FromException(const Exception &exception)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| istisna | const Exception\\& | Görevi tamamlamak için kullanılacak istisna. |

### ReturnValue

Hatalı bir görev.

## Ayrıca Bakınız

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [Exception](../../system/exception/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::FromException(const Exception\&) method


Belirtilen bir istisna ve sonuç türü ile tamamlanmış bir görev oluşturur.

```cpp
template<typename TResult> RTaskPtr<TResult> System::Threading::Tasks::FromException(const Exception &exception)
```


| Parametre | Açıklama |
| --- | --- |
| TResult | Görev sonucunun türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| istisna | const Exception\\& | Görevi tamamlamak için kullanılacak istisna. |

### ReturnValue

Belirtilen sonuç türüne sahip hatalı bir görev.

## Ayrıca Bakınız

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [Exception](../../system/exception/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
