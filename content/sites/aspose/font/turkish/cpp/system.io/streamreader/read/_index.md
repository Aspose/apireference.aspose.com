---
title: "System::IO::StreamReader::Read method"
linktitle: "Read"
second_title: "Aspose.Font için C++"
description: "System::IO::StreamReader::Read yöntemi. Akıştan tek bir karakter okur C++'da."
type: docs
weight: 900
url: /tr/cpp/system.io/streamreader/read/
---
## StreamReader::Read() method


Akıştan tek bir karakter okur.

```cpp
virtual int System::IO::StreamReader::Read() override
```


### ReturnValue

UTF-16 kodlamasıyla kodlanmış karakteri okur; eğer okunan karakter UTF-16'da iki kod noktasına karşılık geliyorsa yalnızca yüksek surrogat döndürülür.

## Ayrıca Bakınız

* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::Read(ArrayPtr\<char_t\>, int, int) method


Akıştan belirtilen sayıda karakteri okur, bunları UTF-16 kodlamasına dönüştürür ve elde edilen UTF-16 karakterlerini belirtilen konumdan başlayarak belirtilen karakter dizisine yazar.

```cpp
virtual int System::IO::StreamReader::Read(ArrayPtr<char_t> buffer, int index, int count) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | ArrayPtr\<char_t\> | Akıştan okunan karakterleri yazmak için UTF-16 karakter dizisi |
| indeks | int | **buffer** içinde yazmaya başlanacak 0 tabanlı bir indeks |
| count | int | Akıştan okunacak karakter sayısı |

### ReturnValue

Akıştan okunan karakter sayısı

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
