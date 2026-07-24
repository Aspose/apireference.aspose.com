---
title: "System::Xml::WriteState enum"
linktitle: "WriteState"
second_title: "Aspose.Page için C++"
description: "System::Xml::WriteState enum. XmlWriter'ın C++'daki durumunu belirtir."
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
| Başlat | 0 | XmlWriter::Write yönteminin henüz çağrılmadığını gösterir. |
| Prolog | 1 | Prologun yazıldığını gösterir. |
| Element | 2 | Bir öğe başlangıç etiketinin yazıldığını gösterir. |
| Attribute | 3 | Bir öznitelik değerinin yazıldığını gösterir. |
| Content | 4 | Öğe içeriğinin yazıldığını gösterir. |
| Closed | 5 | [XmlWriter::Close](../xmlwriter/close/) yönteminin çağrıldığını gösterir. |
| Error | 6 | Bir istisna fırlatıldı ve bu, [XmlWriter](../xmlwriter/) öğesini geçersiz bir durumda bıraktı. [XmlWriter](../xmlwriter/) öğesini [WriteState::Closed](./) durumuna getirmek için [XmlWriter::Close](../xmlwriter/close/) yöntemini çağırabilirsiniz. Başka herhangi bir [XmlWriter](../xmlwriter/) yöntemi çağrısı InvalidOperationException hatasına neden olur. |

## Ayrıca Bakınız

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
