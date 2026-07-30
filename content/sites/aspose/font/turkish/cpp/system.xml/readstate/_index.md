---
title: "System::Xml::ReadState enum"
linktitle: "ReadState"
second_title: "Aspose.Font için C++"
description: "System::Xml::ReadState enum. C++'da okuyucunun durumunu belirtir."
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
| Initial | 0 | The [XmlReader::Read](../xmlreader/read/) yöntemi çağrılmamıştır. |
| Interactive | 1 | The [XmlReader::Read](../xmlreader/read/) yöntemi çağrıldı. Okuyucu üzerinde ek yöntemler çağrılabilir. |
| Hata | 2 | Okuma işleminin devam etmesini engelleyen bir hata oluştu. |
| EndOfFile | 3 | Dosyanın sonuna başarıyla ulaşıldı. |
| Closed | 4 | The [XmlReader::Close](../xmlreader/close/) yöntemi çağrıldı. |

## Ayrıca Bakınız

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
