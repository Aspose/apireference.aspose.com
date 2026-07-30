---
title: "طريقة System::Xml::XmlTextReader::ReadChars"
linktitle: "ReadChars"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlTextReader::ReadChars. يقرأ محتويات النص لعنصر إلى مخزن مؤقت من الأحرف. تم تصميم هذه الطريقة لقراءة تدفقات كبيرة من النص المضمن عن طريق استدعائها بشكل متتابع في C++."
type: docs
weight: 4600
url: /ar/cpp/system.xml/xmltextreader/readchars/
---
## XmlTextReader::ReadChars method


يقرأ محتوى النص لعنصر إلى مخزن أحرف. تم تصميم هذه الطريقة لقراءة تدفقات نصية مدمجة كبيرة عن طريق استدعائها بشكل متتابع.

```cpp
int32_t System::Xml::XmlTextReader::ReadChars(const ArrayPtr<char16_t> &buffer, int32_t index, int32_t count)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const ArrayPtr\<char16_t\>\& | المصفوفة من الأحرف التي تعمل كمخزن مؤقت تُكتب فيها محتويات النص. |
| الفهرس | int32_t | الموضع داخل **buffer** حيث يمكن للطريقة بدء كتابة محتويات النص. |
| count | int32_t | عدد الأحرف التي يجب كتابتها في **buffer**. |

### ReturnValue

عدد الأحرف المقروءة. يمكن أن يكون 0 إذا لم يكن القارئ متموضعًا على عنصر أو إذا لم يتبقَّ أي محتوى نصي لإرجاعه في السياق الحالي.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
