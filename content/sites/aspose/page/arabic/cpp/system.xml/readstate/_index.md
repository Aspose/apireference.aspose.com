---
title: "System::Xml::ReadState enum"
linktitle: "ReadState"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::ReadState enum. يحدد حالة القارئ في C++."
type: docs
weight: 5300
url: /ar/cpp/system.xml/readstate/
---
## ReadState enum


يحدد حالة القارئ.

```cpp
enum class ReadState
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| Initial | 0 | لم يتم استدعاء طريقة [XmlReader::Read](../xmlreader/read/). |
| Interactive | 1 | تم استدعاء طريقة [XmlReader::Read](../xmlreader/read/). قد يتم استدعاء طرق إضافية على القارئ. |
| خطأ | 2 | حدث خطأ يمنع استمرار عملية القراءة. |
| EndOfFile | 3 | تم الوصول إلى نهاية الملف بنجاح. |
| Closed | 4 | تم استدعاء طريقة [XmlReader::Close](../xmlreader/close/). |

## انظر أيضًا

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
