---
title: "System::IO::TextReader::ReadBlock yöntemi"
linktitle: "ReadBlock"
second_title: "Aspose.Page için C++"
description: "System::IO::TextReader::ReadBlock yöntemi. Mevcut metin okuyucudan belirtilen azami sayıda karakteri okur ve verileri bir tamponda, belirtilen indeksten başlayarak C++'ta yazar."
type: docs
weight: 500
url: /tr/cpp/system.io/textreader/readblock/
---
## TextReader::ReadBlock method


Mevcut metin okuyucusundan belirtilen azami sayıda karakteri okur ve verileri belirtilen indeksden başlayarak bir tampon belleğe yazar.

```cpp
virtual int System::IO::TextReader::ReadBlock(ArrayPtr<char_t> buffer, int index, int count)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | ArrayPtr\<char_t\> | Okunan verileri yazmak için bir karakter tamponu |
| indeks | int | **buffer** içinde yazmaya başlanacak 0 tabanlı bir indeks |
| count | int | Okunacak azami karakter sayısı |

### ReturnValue

Okunan gerçek karakter sayısı

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
