---
title: "System::IO::FileStream::ReadAsync method"
linktitle: "ReadAsync"
second_title: "Aspose.Page için C++"
description: "System::IO::FileStream::ReadAsync method. Mevcut akıştan asenkron olarak bir bayt dizisi okur, okunan bayt sayısı kadar akış içindeki konumu ilerletir ve C++'ta iptal isteklerini izler."
type: docs
weight: 1400
url: /tr/cpp/system.io/filestream/readasync/
---
## FileStream::ReadAsync method


Geçerli akıştan bir bayt dizisini asenkron olarak okur, akış içindeki konumu okunan bayt sayısı kadar ilerletir ve iptal isteklerini izler.

```cpp
RTaskPtr<int32_t> System::IO::FileStream::ReadAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | const ArrayPtr\<uint8_t\>\& | Okunan baytların yazılacağı bayt dizisi. |
| offset | int32_t | **buffer** içinde yazmaya başlanacak 0 tabanlı bir konum. |
| count | int32_t | Okunacak bayt sayısı. |
| cancellationToken | const Threading::CancellationToken\& | İptal isteklerini izlemek için token. |

### ReturnValue

Asenkron okuma işlemini temsil eden bir görev. TResult parametresinin değeri, tampon içine okunan toplam bayt sayısını içerir. Sonuç değeri, istenen bayt sayısı kadar mevcut bayt bulunmadığında istenen sayıdan daha az olabilir veya akışın sonuna gelinmişse 0 (sıfır) olabilir.

## Ayrıca Bakınız

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
