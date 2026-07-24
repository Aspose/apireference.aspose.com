---
title: "System::Xml::XmlDateTimeSerializationMode عدد"
linktitle: "XmlDateTimeSerializationMode"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlDateTimeSerializationMode enum. يحدد كيفية معالجة قيمة الوقت عند التحويل بين النص و DateTime في C++."
type: docs
weight: 5800
url: /ar/cpp/system.xml/xmldatetimeserializationmode/
---
## XmlDateTimeSerializationMode enum


يحدد كيفية معالجة قيمة الوقت عند التحويل بين النص و [DateTime](../../system/datetime/).

```cpp
enum class XmlDateTimeSerializationMode
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| Local | 0 | اعتبره وقتًا محليًا. إذا كان كائن [DateTime](../../system/datetime/) يمثل توقيتًا عالميًا منسقًا (UTC)، يتم تحويله إلى الوقت المحلي. |
| Utc | 1 | اعتبره توقيت UTC. إذا كان كائن [DateTime](../../system/datetime/) يمثل وقتًا محليًا، يتم تحويله إلى توقيت UTC. |
| Unspecified | 2 | اعتبره وقتًا محليًا إذا كان يتم تحويل [DateTime](../../system/datetime/) إلى سلسلة. إذا تم تحويل سلسلة إلى [DateTime](../../system/datetime/)، فقم بالتحويل إلى وقت محلي إذا تم تحديد منطقة زمنية. |
| RoundtripKind | 3 | يجب الحفاظ على معلومات المنطقة الزمنية عند التحويل. |

## انظر أيضًا

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
