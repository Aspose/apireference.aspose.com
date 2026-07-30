---
title: "طريقة System::Xml::XmlReader::ReadValueChunk"
linktitle: "ReadValueChunk"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlReader::ReadValueChunk. تقرأ تدفقات نصية كبيرة مدمجة في مستند XML في C++."
type: docs
weight: 7400
url: /ar/cpp/system.xml/xmlreader/readvaluechunk/
---
## XmlReader::ReadValueChunk method


يقرأ تدفقات نصية كبيرة مدمجة في مستند XML.

```cpp
virtual int32_t System::Xml::XmlReader::ReadValueChunk(ArrayPtr<char16_t> buffer, int32_t index, int32_t count)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | ArrayPtr\<char16_t\> | المصفوفة من الأحرف التي تعمل كالمخزن المؤقت الذي تُكتب إليه محتويات النص. لا يمكن أن تكون هذه القيمة **nullptr**. |
| index | int32_t | الإزاحة داخل المخزن المؤقت حيث يمكن لـ [XmlReader](../) بدء نسخ النتائج. |
| count | int32_t | الحد الأقصى لعدد الأحرف التي سيتم نسخها إلى المخزن المؤقت. يتم إرجاع العدد الفعلي للأحرف المنسوخة من هذه الطريقة. |

### ReturnValue

عدد الأحرف التي تم قراءتها إلى المخزن المؤقت. يتم إرجاع القيمة صفر عندما لا يكون هناك المزيد من محتوى النص.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
