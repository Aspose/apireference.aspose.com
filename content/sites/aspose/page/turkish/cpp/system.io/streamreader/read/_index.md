---
title: "System::IO::StreamReader::Read yöntemi"
linktitle: "Oku"
second_title: "Aspose.Page için C++"
description: "System::IO::StreamReader::Read yöntemi. C++'ta akıştan tek bir karakter okur."
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

UTF-16 kodlamasıyla kodlanmış karakter okunur; eğer okunan karakter UTF-16 kodlamasında iki kod noktasına karşılık geliyorsa yalnızca yüksek surragate döndürülür.

## Ayrıca Bakınız

* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::Read(ArrayPtr\<char_t\>, int, int) method


Belirtilen sayıda karakteri akıştan okur, UTF-16 kodlamasına dönüştürür ve elde edilen UTF-16 karakterlerini belirtilen konumdan başlayarak belirtilen karakter dizisine yazar.

```cpp
virtual int System::IO::StreamReader::Read(ArrayPtr<char_t> buffer, int index, int count) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | ArrayPtr\<char_t\> | Akıştan okunan karakterleri yazmak için UTF-16 karakter dizisi |
| indeks | int | Yazmaya başlanacak **buffer** içinde 0 tabanlı bir indeks |
| count | int | Akıştan okunacak karakter sayısı |

### ReturnValue

Akıştan okunan karakter sayısı

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
