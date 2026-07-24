---
title: "System::Xml::ReadState enum"
linktitle: "ReadState"
second_title: "Aspose.Page için C++"
description: "System::Xml::ReadState enum. C++'ta okuyucunun durumunu belirtir."
type: docs
weight: 5300
url: /tr/cpp/system.xml/readstate/
---
## ReadState enum


Okuyucunun durumunu belirtir.

```cpp
enum class ReadState
```

### Değerler

| Ad | Değer | Açıklama |
| --- | --- | --- |
| Initial | 0 | Bu [XmlReader::Read](../xmlreader/read/) yöntemi çağrılmadı. |
| Interactive | 1 | Bu [XmlReader::Read](../xmlreader/read/) yöntemi çağrıldı. Okuyucu üzerinde ek yöntemler çağrılabilir. |
| Error | 2 | Okuma işleminin devam etmesini engelleyen bir hata oluştu. |
| EndOfFile | 3 | Dosyanın sonuna başarıyla ulaşıldı. |
| Closed | 4 | Bu [XmlReader::Close](../xmlreader/close/) yöntemi çağrıldı. |

## Ayrıca Bakınız

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
