---
title: "System::IO::FileStream::WriteAsync yöntemi"
linktitle: "WriteAsync"
second_title: "Aspose.Page için C++"
description: "System::IO::FileStream::WriteAsync yöntemi. Bayt dizisini mevcut akışa asenkron olarak yazar, bu akıştaki mevcut konumu yazılan bayt sayısı kadar ilerletir ve C++'ta iptal isteklerini izler."
type: docs
weight: 2000
url: /tr/cpp/system.io/filestream/writeasync/
---
## FileStream::WriteAsync method


Geçerli akışa bir bayt dizisini asenkron olarak yazar, bu akıştaki mevcut konumu yazılan bayt sayısı kadar ilerletir ve iptal isteklerini izler.

```cpp
TaskPtr System::IO::FileStream::WriteAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | const ArrayPtr\<uint8_t\>\& | Yazılacak baytları içeren dizi. |
| offset | int32_t | Yazma alt aralığının başladığı **buffer** içindeki 0 tabanlı indeks. |
| count | int32_t | Yazılacak alt aralıktaki öğe sayısı. |
| cancellationToken | const Threading::CancellationToken\& | İptal isteklerini izlemek için token. |

### ReturnValue

Asenkron yazma işlemini temsil eden bir görev.

## Ayrıca Bakınız

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
