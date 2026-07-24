---
title: "System::IO::File::ReadAllLines yöntemi"
linktitle: "ReadAllLines"
second_title: "Aspose.Page için C++"
description: "System::IO::File::ReadAllLines yöntemi. Belirtilen metin dosyasının içeriğini satır satır okuyarak, belirtilen karakter kodlamasını kullanarak C++'ta bir dize dizisine aktarır."
type: docs
weight: 2400
url: /tr/cpp/system.io/file/readalllines/
---
## File::ReadAllLines method


Belirtilen metin dosyasının içeriğini satır satır, belirtilen karakter kodlamasını kullanarak bir dizi stringe okur.

```cpp
static ArrayPtr<String> System::IO::File::ReadAllLines(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8())
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| yol | const String\& | Okunacak dosyanın yolu |
| encoding | const EncodingPtr\& | Kullanılacak karakter kodlaması |

### ReturnValue

Her öğesi belirtilen dosyadan tek bir satırı temsil eden bir dize dizisi

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
