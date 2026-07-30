---
title: "System::Xml::WriteState enum"
linktitle: "WriteState"
second_title: "Aspose.Font için C++"
description: "System::Xml::WriteState enum. C++'de XmlWriter'ın durumunu belirtir."
type: docs
weight: 5700
url: /tr/cpp/system.xml/writestate/
---
## WriteState enum


[XmlWriter](../xmlwriter/) durumunu belirtir.

```cpp
enum class WriteState
```

### Değerler

| Ad | Değer | Açıklama |
| --- | --- | --- |
| Başlat | 0 | XmlWriter::Write metodunun henüz çağrılmadığını gösterir. |
| Prolog | 1 | Prologun yazıldığını gösterir. |
| Element | 2 | Bir öğenin başlangıç etiketinin yazıldığını gösterir. |
| Attribute | 3 | Bir öznitelik değerinin yazıldığını gösterir. |
| Content | 4 | Öğe içeriğinin yazıldığını gösterir. |
| Closed | 5 | Bu, [XmlWriter::Close](../xmlwriter/close/) yönteminin çağrıldığını gösterir. |
| Error | 6 | Bir istisna atıldı ve bu, [XmlWriter](../xmlwriter/) öğesini geçersiz bir duruma bıraktı. [XmlWriter::Close](../xmlwriter/close/) yöntemini çağırarak [XmlWriter](../xmlwriter/) öğesini [WriteState::Closed](./) durumuna getirebilirsiniz. Başka herhangi bir [XmlWriter](../xmlwriter/) yöntemi çağrısı InvalidOperationException hatasına neden olur. |

## Ayrıca Bakınız

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
