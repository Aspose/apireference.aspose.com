---
title: "System::Xml::XmlNodeType enum"
linktitle: "XmlNodeType"
second_title: "Aspose.Font لـ C++"
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
| Text | 3 | محتوى النص لعقدة. لا يمكن لعقدة [XmlNodeType::Text](./) أن تحتوي على أي عقد فرعية. يمكن أن تظهر كعقدة فرعية لعقد [XmlNodeType::Attribute](./)، [XmlNodeType::DocumentFragment](./)، [XmlNodeType::Element](./)، وعقد [XmlNodeType::EntityReference](./). |
| CDATA | 4 | قسم CDATA (على سبيل المثال، **my escaped text**). |
| مرجع كيان | 5 | إشارة إلى كيان (على سبيل المثال، **&num;**). |
| كيان | 6 | إعلان كيان (على سبيل المثال، **<!ENTITY...>**). |
| تعليمات المعالجة | 7 | تعليمات معالجة (على سبيل المثال، **<?pi test?>**). |
| تعليق | 8 | تعليق (على سبيل المثال، ****). |
| مستند | 9 | كائن مستند يعمل كجذر شجرة المستند، ويوفر الوصول إلى كامل مستند XML. |
| نوع المستند | 10 | إعلان نوع المستند، المشار إليه بالوسم التالي (على سبيل المثال، **<!DOCTYPE...>**). |
| جزء المستند | 11 | جزء من المستند. |
| ترميز | 12 | ترميز في إعلان نوع المستند (على سبيل المثال، **<!NOTATION...>**). |
| مسافة بيضاء | 13 | مسافة بيضاء بين العلامات. |
| مسافة بيضاء هامة | 14 | مسافة بيضاء بين العلامات في نموذج محتوى مختلط أو مسافة بيضاء داخل نطاق **xml:space=\"preserve\"**. |
| نهاية العنصر | 15 | وسم عنصر نهائي (على سبيل المثال، ****). |
| EndEntity | 16 | يُرجع عندما يصل [XmlReader](../xmlreader/) إلى نهاية استبدال الكيان نتيجة لاستدعاء [XmlReader::ResolveEntity](../xmlreader/resolveentity/). |
| XmlDeclaration | 17 | إعلان XML (على سبيل المثال، **<?xml version='1.0'?>**). يجب أن تكون عقدة [XmlNodeType::XmlDeclaration](./) هي أول عقدة في المستند. لا يمكن أن تحتوي على أبناء. هي عقدة فرعية لعقدة [XmlNodeType::Document](./). يمكن أن تحتوي على سمات توفر معلومات الإصدار والترميز. |

## انظر أيضًا

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
