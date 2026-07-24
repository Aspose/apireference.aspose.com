---
title: "System::Xml::XmlNodeType enum"
linktitle: "XmlNodeType"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlNodeType enum. يحدد نوع العقدة في C++."
type: docs
weight: 6200
url: /ar/cpp/system.xml/xmlnodetype/
---
## XmlNodeType enum


يحدد نوع العقدة.

```cpp
enum class XmlNodeType
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| None | 0 | يتم إرجاع هذا بواسطة [XmlReader](../xmlreader/) إذا لم يتم استدعاء طريقة **Read**. |
| Element | 1 | عنصر (على سبيل المثال، **<item>**). |
| Attribute | 2 | سمة (على سبيل المثال، **id='123'**). |
| Text | 3 | المحتوى النصي لعقدة. لا يمكن لعقدة [XmlNodeType::Text](./) أن تحتوي على أي عقد فرعية. يمكن أن تظهر كعقدة فرعية لعقد [XmlNodeType::Attribute](./)، [XmlNodeType::DocumentFragment](./)، [XmlNodeType::Element](./)، و[XmlNodeType::EntityReference](./). |
| CDATA | 4 | قسم CDATA (على سبيل المثال، **my escaped text**). |
| EntityReference | 5 | إشارة إلى كيان (على سبيل المثال، **&num;**). |
| Entity | 6 | إعلان كيان (على سبيل المثال، **<!ENTITY...>**). |
| ProcessingInstruction | 7 | تعليمات معالجة (على سبيل المثال، **<?pi test?>**). |
| Comment | 8 | تعليق (على سبيل المثال، ****). |
| Document | 9 | كائن مستند يعمل كجذر لشجرة المستند، ويوفر الوصول إلى المستند XML بالكامل. |
| DocumentType | 10 | إعلان نوع المستند، المشار إليه بالعلامة التالية (على سبيل المثال، **<!DOCTYPE...>**). |
| DocumentFragment | 11 | مقتطف مستند. |
| Notation | 12 | ترميز في إعلان نوع المستند (على سبيل المثال، **<!NOTATION...>**). |
| مسافة بيضاء | 13 | مسافة بيضاء بين العلامات. |
| SignificantWhitespace | 14 | مسافة بيضاء بين العلامات في نموذج محتوى مختلط أو مسافة بيضاء داخل نطاق **xml:space=\"preserve\"**. |
| EndElement | 15 | علامة عنصر نهائي (على سبيل المثال، ****). |
| EndEntity | 16 | يُرجع عندما يصل [XmlReader](../xmlreader/) إلى نهاية استبدال الكيان نتيجة لاستدعاء [XmlReader::ResolveEntity](../xmlreader/resolveentity/). |
| XmlDeclaration | 17 | إعلان XML (على سبيل المثال، **<?xml version='1.0'?>**). يجب أن تكون عقدة [XmlNodeType::XmlDeclaration](./) أول عقدة في المستند. لا يمكن أن تحتوي على عناصر فرعية. هي عقدة فرعية لعقدة [XmlNodeType::Document](./). يمكن أن تحتوي على سمات توفر معلومات الإصدار والترميز. |

## انظر أيضًا

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
