---
title: "System::IO::TextReader::Read yöntemi"
linktitle: "Read"
second_title: "Aspose.Font için C++"
description: "System::IO::TextReader::Read yöntemi. Akıştan tek bir karakteri C++'ta okur."
type: docs
weight: 400
url: /tr/cpp/system.io/textreader/read/
---
## TextReader::Read() method


Akıştan tek bir karakter okur.

```cpp
virtual int System::IO::TextReader::Read()
```


### ReturnValue

UTF-16 kodlamasıyla kodlanmış karakteri okur; eğer okunan karakter UTF-16'da iki kod noktasına karşılık geliyorsa yalnızca yüksek surrogat döndürülür.

## Ayrıca Bakınız

* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## TextReader::Read(ArrayPtr\<char_t\>, int, int) method


Akıştan belirtilen sayıda karakteri okur ve belirtilen konumdan başlayarak belirtilen karakter dizisine yazar.

```cpp
virtual int System::IO::TextReader::Read(ArrayPtr<char_t> buffer, int index, int count)
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
* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
