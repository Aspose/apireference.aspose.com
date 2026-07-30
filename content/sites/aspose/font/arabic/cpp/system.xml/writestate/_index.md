---
title: "System::Xml::WriteState عدد"
linktitle: "WriteState"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::WriteState عدد. يحدد حالة XmlWriter في C++."
type: docs
weight: 5700
url: /ar/cpp/system.xml/writestate/
---
## WriteState enum


يحدد حالة [XmlWriter](../xmlwriter/).

```cpp
enum class WriteState
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| ابدأ | 0 | يشير إلى أن طريقة XmlWriter::Write لم تُستدعَ بعد. |
| Prolog | 1 | يشير إلى أن المقدمة (prolog) تُكتب. |
| Element | 2 | يشير إلى أن وسم بدء العنصر يُكتب. |
| Attribute | 3 | يشير إلى أن قيمة السمة تُكتب. |
| Content | 4 | يشير إلى أن محتوى العنصر يُكتب. |
| Closed | 5 | يشير إلى أن طريقة [XmlWriter::Close](../xmlwriter/close/) قد تم استدعاؤها. |
| Error | 6 | تم إلقاء استثناء، مما ترك الـ [XmlWriter](../xmlwriter/) في حالة غير صالحة. يمكنك استدعاء طريقة [XmlWriter::Close](../xmlwriter/close/) لوضع الـ [XmlWriter](../xmlwriter/) في حالة [WriteState::Closed](./). أي استدعاءات أخرى لطريقة [XmlWriter](../xmlwriter/) تؤدي إلى حدوث InvalidOperationException. |

## انظر أيضًا

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
