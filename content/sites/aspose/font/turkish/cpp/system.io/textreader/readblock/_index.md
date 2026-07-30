---
title: "System::IO::TextReader::ReadBlock method"
linktitle: "ReadBlock"
second_title: "Aspose.Font için C++"
description: "System::IO::TextReader::ReadBlock yöntemi. Belirtilen maksimum karakter sayısını geçerli metin okuyucusundan okur ve verileri bir tamponda, belirtilen indeksten başlayarak yazar C++'ta."
type: docs
weight: 500
url: /tr/cpp/system.io/textreader/readblock/
---
## TextReader::ReadBlock method


Mevcut metin okuyucusundan belirtilen azami sayıda karakteri okur ve veriyi belirtilen indexten başlayarak bir tampon belleğe yazar.

```cpp
virtual int System::IO::TextReader::ReadBlock(ArrayPtr<char_t> buffer, int index, int count)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | ArrayPtr\<char_t\> | Okunan verileri yazmak için bir karakter tamponu |
| indeks | int | **buffer** içinde yazmaya başlanacak 0 tabanlı bir indeks |
| count | int | Okunacak maksimum karakter sayısı |

### ReturnValue

Okunan gerçek karakter sayısı

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
