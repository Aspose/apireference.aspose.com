---
title: "System::IO::File::ReadAllLines metodu"
linktitle: "ReadAllLines"
second_title: "Aspose.Font için C++"
description: "System::IO::File::ReadAllLines metodu. Belirtilen metin dosyasının içeriğini, belirtilen karakter kodlamasını kullanarak, satır satır bir dize dizisine okur C++'de."
type: docs
weight: 2400
url: /tr/cpp/system.io/file/readalllines/
---
## File::ReadAllLines method


Belirtilen metin dosyasının içeriğini satır satır, belirtilen karakter kodlamasını kullanarak bir dizi dizeye okur.

```cpp
static ArrayPtr<String> System::IO::File::ReadAllLines(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8())
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| yol | const String\& | Okunacak dosyanın yolu |
| encoding | const EncodingPtr\& | Kullanılacak karakter kodlaması |

### ReturnValue

Belirtilen dosyadan tek bir satırı temsil eden, her öğesi bir dize olan dize dizisi

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
