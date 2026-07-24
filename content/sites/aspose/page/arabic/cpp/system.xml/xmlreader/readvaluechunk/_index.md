---
title: "طريقة System::Xml::XmlReader::ReadValueChunk method"
linktitle: "ReadValueChunk"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlReader::ReadValueChunk method. تقرأ تدفقات نصية كبيرة مدمجة في مستند XML في C++."
type: docs
weight: 7400
url: /ar/cpp/system.xml/xmlreader/readvaluechunk/
---
## XmlReader::ReadValueChunk method


يقرأ تدفقات نصية كبيرة مدمجة في مستند XML.

```cpp
virtual int32_t System::Xml::XmlReader::ReadValueChunk(ArrayPtr<char16_t> buffer, int32_t index, int32_t count)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | ArrayPtr\<char16_t\> | المصفوفة من الأحرف التي تعمل كالمخزن المؤقت الذي تُكتب إليه محتويات النص. لا يمكن أن تكون هذه القيمة **nullptr**. |
| index | int32_t | الإزاحة داخل المخزن المؤقت حيث يمكن لـ [XmlReader](../) بدء نسخ النتائج. |
| count | int32_t | الحد الأقصى لعدد الأحرف التي تُنسخ إلى المخزن المؤقت. يتم إرجاع عدد الأحرف الفعلي المنسوخ من هذه الطريقة. |

### ReturnValue

عدد الأحرف المقروءة إلى المخزن المؤقت. تُرجع القيمة صفر عندما لا يكون هناك مزيد من محتوى النص.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
