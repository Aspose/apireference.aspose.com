---
title: "System::Xml::ConformanceLevel enum"
linktitle: "ConformanceLevel"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::ConformanceLevel enum. يحدد مقدار الفحص الإدخالي أو الإخراجي الذي تقوم به كائنات XmlReader و XmlWriter في C++."
type: docs
weight: 4600
url: /ar/cpp/system.xml/conformancelevel/
---
## ConformanceLevel enum


يحدد مقدار الفحص الإدخالي أو الإخراجي الذي تقوم به كائنات [XmlReader](../xmlreader/) و [XmlWriter](../xmlwriter/).

```cpp
enum class ConformanceLevel
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| Auto | 0 | الكائن [XmlReader](../xmlreader/) أو [XmlWriter](../xmlwriter/) يكتشف تلقائيًا ما إذا كان يجب إجراء فحص على مستوى المستند أو مستوى الجزء، ويقوم بالفحص المناسب. إذا كنت تغلف كائنًا آخر من نوع [XmlReader](../xmlreader/) أو [XmlWriter](../xmlwriter/)، فإن الكائن الخارجي لا يقوم بأي فحص توافق إضافي. يُترك فحص التوافق للكيان الأساسي. |
| Fragment | 1 | بيانات XML هي [مقتطف XML صالح](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities) كما تعرفه W3C. يمثل هذا المستوى من التوافق مستند XML قد لا يحتوي على عنصر جذر لكنه صالح من حيث البنية. يضمن هذا المستوى من الفحص أن التدفق المقروء أو المكتوب يمكن لأي معالج استهلاكه كـ [كيان XML 1.0 خارجي مُحلل](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities). |
| Document | 2 | بيانات XML تتوافق مع قواعد [مستند XML 1.0 صالح](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed) كما تعرفه W3C. يضمن هذا المستوى من الفحص أن التدفق المقروء أو المكتوب يمكن لأي معالج استهلاكه كـ [مستند XML 1.0](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed). |

## انظر أيضًا

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
