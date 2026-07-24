---
title: "System::Xml::Schema::XmlSchemaContentProcessing enum"
linktitle: "XmlSchemaContentProcessing"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Schema::XmlSchemaContentProcessing enum. يوفر معلومات حول وضع التحقق من صحة أي استبدالات لعناصر any و anyAttribute في C++."
type: docs
weight: 7300
url: /ar/cpp/system.xml.schema/xmlschemacontentprocessing/
---
## XmlSchemaContentProcessing enum


يوفر معلومات حول وضع التحقق من صحة استبدالات العنصر **any** و **anyAttribute**.

```cpp
enum class XmlSchemaContentProcessing
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| لا شيء | 0 | عناصر المستند غير مُتحقّق منها. |
| تخطي | 1 | يجب أن تتكون عناصر المستند من XML مُشكل بشكل صحيح ولا يتم التحقق من صحتها بواسطة المخطط. |
| متساهل | 2 | إذا تم العثور على المخطط المرتبط، سيتم التحقق من صحة عناصر المستند. لن يتم إلقاء أي أخطاء خلاف ذلك. |
| صارم | 3 | يجب على معالج المخطط أن يجد مخططًا مرتبطًا بالمساحة الاسمية المشار إليها للتحقق من صحة عناصر المستند. |

## انظر أيضًا

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
