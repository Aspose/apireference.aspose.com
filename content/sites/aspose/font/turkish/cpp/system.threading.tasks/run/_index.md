---
title: "System::Threading::Tasks::Run yöntemi"
linktitle: "Run"
second_title: "Aspose.Font için C++"
description: "System::Threading::Tasks::Run yöntemi. Belirtilen işi iş parçacığı havuzunda çalıştırmak için kuyruğa ekler ve C++'ta bu iş için bir Task tutamacı döndürür."
type: docs
weight: 1600
url: /tr/cpp/system.threading.tasks/run/
---
## System::Threading::Tasks::Run(const Action<>\&) method


Belirtilen işi iş parçacığı havuzunda çalıştırmak için kuyruğa ekler ve bu iş için bir [Task](../task/) tutamacı döndürür.

```cpp
TaskPtr System::Threading::Tasks::Run(const Action<> &action)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| action | const Action<>\& | Asenkron olarak yürütülecek iş. |

### ReturnValue

İş parçacığı havuzunda yürütülmek üzere kuyruğa eklenen işi temsil eden bir [Task](../task/).

## Ayrıca Bakınız

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [Action](../../system/action/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::Run(const Action<>\&, const CancellationToken\&) method


Belirtilen işi iş parçacığı havuzunda çalıştırmak için kuyruğa ekler ve bu iş için bir [Task](../task/) tutamacı döndürür.

```cpp
TaskPtr System::Threading::Tasks::Run(const Action<> &action, const CancellationToken &cancellationToken)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| action | const Action<>\& | Asenkron olarak yürütülecek iş. |
| cancellationToken | const CancellationToken\& | Henüz başlamamışsa işi iptal etmek için kullanılabilecek bir iptal belirteci. |

### ReturnValue

İş parçacığı havuzunda yürütülmek üzere kuyruğa eklenen işi temsil eden bir [Task](../task/).

## Ayrıca Bakınız

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [Action](../../system/action/)
* Class [CancellationToken](../../system.threading/cancellationtoken/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::Run(const Func\<TaskPtr\>\&) method


Belirtilen işi iş parçacığı havuzunda çalıştırmak için kuyruğa ekler ve işlev tarafından döndürülen [Task](../task/) için bir vekil döndürür.

```cpp
TaskPtr System::Threading::Tasks::Run(const Func<TaskPtr> &function)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| function | const Func\<TaskPtr\>\& | Asenkron olarak yürütülecek iş, bir [Task](../task/) döndürür. |

### ReturnValue

İşlev tarafından döndürülen [Task](../task/) için bir vekili temsil eden bir [Task](../task/).

## Ayrıca Bakınız

* Typedef [TaskPtr](../../system/taskptr/)
* Class [Func](../../system/func/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::Run(const Func\<TResult\>\&) method


Belirtilen işi iş parçacığı havuzunda çalıştırmak üzere kuyruğa ekler ve bu iş için bir [Task<TResult>](../task/) tutamağı döndürür.

```cpp
template<typename TResult> RTaskPtr<TResult> System::Threading::Tasks::Run(const Func<TResult> &function)
```


| Parametre | Açıklama |
| --- | --- |
| TResult | Görev tarafından döndürülen sonucun türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| fonksiyon | const Func\<TResult\>\& | Asenkron olarak yürütülecek iş. |

### ReturnValue

İş parçacığı havuzunda yürütülmek üzere kuyruğa eklenen işi temsil eden bir [Task<TResult>](../task/).

## Ayrıca Bakınız

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Class [Func](../../system/func/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
