---
title: "System::IO::Stream::WriteAsync yöntemi"
linktitle: "WriteAsync"
second_title: "Aspose.Font için C++"
description: "System::IO::Stream::WriteAsync yöntemi. Asenkron olarak bir dizi baytı mevcut akışa yazar, bu akıştaki mevcut konumu yazılan bayt sayısı kadar ilerletir ve C++'ta iptal isteklerini izler."
type: docs
weight: 2700
url: /tr/cpp/system.io/stream/writeasync/
---
## Stream::WriteAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Geçerli akışa bir bayt dizisini asenkron olarak yazar, bu akış içindeki konumu yazılan bayt sayısı kadar ilerletir ve iptal isteklerini izler.

```cpp
TaskPtr System::IO::Stream::WriteAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | Yazılacak baytları içeren dizi. |
| offset | int32_t | Yazılacak alt aralığın başladığı **buffer** içindeki 0 tabanlı indeks. |
| count | int32_t | Yazılacak alt aralıktaki öğe sayısı. |

### ReturnValue

Asenkron yazma işlemini temsil eden bir görev.

## Ayrıca Bakınız

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## Stream::WriteAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) method


Geçerli akışa bir bayt dizisini asenkron olarak yazar, bu akış içindeki konumu yazılan bayt sayısı kadar ilerletir ve iptal isteklerini izler.

```cpp
virtual TaskPtr System::IO::Stream::WriteAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | Yazılacak baytları içeren dizi. |
| offset | int32_t | Yazılacak alt aralığın başladığı **buffer** içindeki 0 tabanlı indeks. |
| count | int32_t | Yazılacak alt aralıktaki öğe sayısı. |
| cancellationToken | const Threading::CancellationToken\& | İptal isteklerini izlemek için kullanılan token. |

### ReturnValue

Asenkron yazma işlemini temsil eden bir görev.

## Ayrıca Bakınız

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
