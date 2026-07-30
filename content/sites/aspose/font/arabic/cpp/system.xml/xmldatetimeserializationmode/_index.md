---
title: "System::Xml::XmlDateTimeSerializationMode enum"
linktitle: "XmlDateTimeSerializationMode"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlDateTimeSerializationMode enum. يحدد كيفية معالجة قيمة الوقت عند التحويل بين السلسلة و DateTime في C++."
type: docs
weight: 5800
url: /ar/cpp/system.xml/xmldatetimeserializationmode/
---
## XmlDateTimeSerializationMode enum


يحدد كيفية معالجة قيمة الوقت عند التحويل بين السلسلة و [DateTime](../../system/datetime/).

```cpp
enum class XmlDateTimeSerializationMode
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| Local | 0 | اعتبره توقيتًا محليًا. إذا كان كائن [DateTime](../../system/datetime/) يمثل توقيتًا عالميًا منسقًا (UTC)، يتم تحويله إلى التوقيت المحلي. |
| Utc | 1 | اعتبره توقيتًا عالميًا (UTC). إذا كان كائن [DateTime](../../system/datetime/) يمثل توقيتًا محليًا، يتم تحويله إلى توقيت عالمي (UTC). |
| Unspecified | 2 | اعتبره توقيتًا محليًا إذا كان يتم تحويل [DateTime](../../system/datetime/) إلى سلسلة. إذا تم تحويل سلسلة إلى [DateTime](../../system/datetime/)، فحوّل إلى توقيت محلي إذا تم تحديد منطقة زمنية. |
| RoundtripKind | 3 | يجب الحفاظ على معلومات المنطقة الزمنية عند التحويل. |

## انظر أيضًا

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
