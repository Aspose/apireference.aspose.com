---
title: "System::Xml::WriteState enum"
linktitle: "WriteState"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::WriteState enum. يحدد حالة الـ XmlWriter في C++."
type: docs
weight: 5700
url: /ar/cpp/system.xml/writestate/
---
## WriteState enum


يحدد حالة الـ [XmlWriter](../xmlwriter/).

```cpp
enum class WriteState
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| ابدأ | 0 | يشير إلى أن طريقة XmlWriter::Write لم تُستدعَ بعد. |
| Prolog | 1 | يشير إلى أن الـ prolog يتم كتابته. |
| Element | 2 | يشير إلى أن وسم بدء العنصر يتم كتابته. |
| Attribute | 3 | يشير إلى أن قيمة السمة تُكتب. |
| Content | 4 | يشير إلى أن محتوى العنصر يُكتب. |
| Closed | 5 | يشير إلى أن طريقة [XmlWriter::Close](../xmlwriter/close/) قد تم استدعاؤها. |
| Error | 6 | تم إلقاء استثناء، مما ترك الـ [XmlWriter](../xmlwriter/) في حالة غير صالحة. يمكنك استدعاء طريقة [XmlWriter::Close](../xmlwriter/close/) لوضع الـ [XmlWriter](../xmlwriter/) في حالة [WriteState::Closed](./). أي استدعاءات أخرى لطريقة [XmlWriter](../xmlwriter/) تؤدي إلى حدوث InvalidOperationException. |

## انظر أيضًا

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
