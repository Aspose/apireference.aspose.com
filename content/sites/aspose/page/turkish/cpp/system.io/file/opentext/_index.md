---
title: "System::IO::File::OpenText yöntemi"
linktitle: "OpenText"
second_title: "Aspose.Page için C++"
description: "System::IO::File::OpenText yöntemi. Belirtilen mevcut dosyayı, UTF-8 kodlamasını kullanarak ve paylaşım olmadan C++'ta metin okuma için açar."
type: docs
weight: 2100
url: /tr/cpp/system.io/file/opentext/
---
## File::OpenText method


Belirtilen mevcut dosyayı UTF-8 kodlamasıyla, paylaşım olmadan metin okuma için açar.

```cpp
static StreamReaderPtr System::IO::File::OpenText(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| yol | const String\& | Açılacak dosyanın yolu |
| encoding | const EncodingPtr\& | Kullanılacak karakter kodlaması |

### ReturnValue

Açılan dosyayla ilişkili bir [StreamWriter](../../streamwriter/) nesnesine ait paylaşımlı bir işaretçi

## Ayrıca Bakınız

* Typedef [StreamReaderPtr](../../../system/streamreaderptr/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
