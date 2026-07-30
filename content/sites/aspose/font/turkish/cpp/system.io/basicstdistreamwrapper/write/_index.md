---
title: "System::IO::BasicSTDIStreamWrapper::Write yöntemi"
linktitle: "Write"
second_title: "Aspose.Font için C++"
description: "System::IO::BasicSTDIStreamWrapper::Write yöntemi. Sarma modu ikili ise, belirtilen bayt dizisinden belirtilen alt aralığı akışa yazar; aksi takdirde belirtilen bayt dizisinden belirtilen alt aralığı char_type tipine dönüştürür ve sonucu akışa yazar. C++'ta desteklenmez!"
type: docs
weight: 700
url: /tr/cpp/system.io/basicstdistreamwrapper/write/
---
## BasicSTDIStreamWrapper::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Sarma modu ikili ise, belirtilen bayt dizisinden belirtilen alt aralığı akışa yazar; aksi takdirde belirtilen bayt dizisinden belirtilen alt aralığı [char_type](../char_type/) tipine dönüştürür ve sonucu akışa yazar. Desteklenmez!

```cpp
virtual void System::IO::BasicSTDIStreamWrapper<T, typename>::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | Yazılacak baytları içeren dizi. |
| offset | int32_t | Yazılacak alt aralığın başladığı **buffer** içindeki 0 tabanlı indeks. |
| count | int32_t | Yazılacak alt aralıktaki öğe sayısı. |

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BasicSTDIStreamWrapper::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Belirtilen bayt dizisinden belirtilen alt aralığı akışa yazar.

```cpp
virtual void System::IO::BasicSTDIStreamWrapper<T, typename>::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | Yazılacak baytları içeren dizi görünümü |
| offset | int32_t | **buffer** içinde yazma alt aralığının başladığı öğenin 0 tabanlı indeksi |
| count | int32_t | Yazılacak alt aralıktaki öğe sayısı |

## Ayrıca Bakınız

* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
