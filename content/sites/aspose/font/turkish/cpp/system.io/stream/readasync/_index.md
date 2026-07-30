---
title: "System::IO::Stream::ReadAsync yöntemi"
linktitle: "ReadAsync"
second_title: "Aspose.Font için C++"
description: "System::IO::Stream::ReadAsync yöntemi. Mevcut akıştan bir bayt dizisini asenkron olarak okur, okunan bayt sayısı kadar akış içindeki konumu ilerletir ve C++'ta iptal isteklerini izler."
type: docs
weight: 1900
url: /tr/cpp/system.io/stream/readasync/
---
## Stream::ReadAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Geçerli akıştan bir bayt dizisini asenkron olarak okur, akış içindeki konumu okunan bayt sayısı kadar ilerletir ve iptal isteklerini izler.

```cpp
RTaskPtr<int32_t> System::IO::Stream::ReadAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | Okunan baytların yazılacağı bayt dizisi. |
| offset | int32_t | **buffer** içinde 0 tabanlı bir konum, yazmaya başlanacak yer. |
| count | int32_t | Okunacak bayt sayısı. |

### ReturnValue

Asenkron okuma işlemini temsil eden bir görev. TResult parametresinin değeri, tampon içine okunan toplam bayt sayısını içerir. Sonuç değeri, mevcut mevcut bayt sayısı istenen sayıdan az ise istenen bayt sayısından daha az olabilir veya akışın sonuna ulaşılmışsa 0 (sıfır) olabilir.

## Ayrıca Bakınız

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## Stream::ReadAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) method


Geçerli akıştan bir bayt dizisini asenkron olarak okur, akış içindeki konumu okunan bayt sayısı kadar ilerletir ve iptal isteklerini izler.

```cpp
virtual RTaskPtr<int32_t> System::IO::Stream::ReadAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | Okunan baytların yazılacağı bayt dizisi. |
| offset | int32_t | **buffer** içinde 0 tabanlı bir konum, yazmaya başlanacak yer. |
| count | int32_t | Okunacak bayt sayısı. |
| cancellationToken | const Threading::CancellationToken\& | İptal isteklerini izlemek için kullanılan token. |

### ReturnValue

Asenkron okuma işlemini temsil eden bir görev. TResult parametresinin değeri, tampon içine okunan toplam bayt sayısını içerir. Sonuç değeri, mevcut mevcut bayt sayısı istenen sayıdan az ise istenen bayt sayısından daha az olabilir veya akışın sonuna ulaşılmışsa 0 (sıfır) olabilir.

## Ayrıca Bakınız

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
