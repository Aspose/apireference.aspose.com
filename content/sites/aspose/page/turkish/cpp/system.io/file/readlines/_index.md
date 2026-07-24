---
title: "System::IO::File::ReadLines yöntemi"
linktitle: "ReadLines"
second_title: "Aspose.Page için C++"
description: "System::IO::File::ReadLines yöntemi. Belirtilen karakter kodlamasını kullanarak belirtilen metin dosyasının içeriğini satır satır okur ve her biri dosyanın bir satır içeriğini temsil eden dizelerden oluşan bir yinelenebilir koleksiyon döndürür, C++'ta."
type: docs
weight: 2600
url: /tr/cpp/system.io/file/readlines/
---
## File::ReadLines method


Belirtilen metin dosyasının içeriğini satır satır, belirtilen karakter kodlamasını kullanarak okur ve her biri dosyanın tek bir satırını temsil eden stringlerden oluşan bir enumerable koleksiyon döndürür.

```cpp
static SharedPtr<Collections::Generic::IEnumerable<String>> System::IO::File::ReadLines(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8())
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| yol | const String\& | Okunacak dosyanın yolu |
| encoding | const EncodingPtr\& | Kullanılacak karakter kodlaması |

### ReturnValue

Belirtilen dosyanın içeriğini temsil eden dizelerden oluşan bir sayılabilir koleksiyon

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
