---
title: "System::IO::File::ReadLines method"
linktitle: "ReadLines"
second_title: "Aspose.Font için C++"
description: "System::IO::File::ReadLines yöntemi. Belirtilen metin dosyasının içeriğini belirtilen karakter kodlamasını kullanarak satır satır okur ve C++'ta dosyanın içeriğinin her bir satırını temsil eden dizelerden oluşan bir yinelemeli koleksiyon döndürür."
type: docs
weight: 2600
url: /tr/cpp/system.io/file/readlines/
---
## File::ReadLines method


Belirtilen metin dosyasının içeriğini satır satır, belirtilen karakter kodlamasını kullanarak okur ve her biri dosyanın tek bir satırını temsil eden dize koleksiyonunu döndürür.

```cpp
static SharedPtr<Collections::Generic::IEnumerable<String>> System::IO::File::ReadLines(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8())
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| yol | const String\& | Okunacak dosyanın yolu |
| encoding | const EncodingPtr\& | Kullanılacak karakter kodlaması |

### ReturnValue

Belirtilen dosyanın içeriğini temsil eden dizelerden oluşan bir yinelemeli koleksiyon

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
