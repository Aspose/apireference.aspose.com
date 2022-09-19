---
title: DOMException
second_title: Aspose.SVG لمرجع .NET API
description: تمثل واجهة DOMException حدثًا غير طبيعي يسمى استثناء يحدث نتيجة استدعاء طريقة أو الوصول إلى خاصية واجهة برمجة تطبيقات الويب. هذه هي الطريقة التي يتم بها وصف حالات الخطأ في واجهات برمجة تطبيقات الويب.
type: docs
weight: 790
url: /ar/net/aspose.svg.dom/domexception/
---
## DOMException class

تمثل واجهة DOMException حدثًا غير طبيعي (يسمى استثناء) يحدث نتيجة استدعاء طريقة أو الوصول إلى خاصية واجهة برمجة تطبيقات الويب. هذه هي الطريقة التي يتم بها وصف حالات الخطأ في واجهات برمجة تطبيقات الويب.

```csharp
public class DOMException : PlatformException
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [DOMException](domexception#constructor)(string) | يقوم بتهيئة مثيل جديد لملف[`DOMException`](../domexception) فئة . |
| [DOMException](domexception#constructor_1)(string, string) | يقوم بتهيئة مثيل جديد لملف[`DOMException`](../domexception) فئة . |

## الخصائص

| اسم | وصف |
| --- | --- |
| [Code](../../aspose.svg.dom/domexception/code) { get; } | إرجاع قيمة تحتوي على أحد ثوابت رمز الخطأ ، أو 0 إذا لم يكن هناك تطابق. يستخدم هذا الحقل لأسباب تاريخية. |
| override [Message](../../aspose.svg.dom/domexception/message) { get; } | إرجاع سلسلة تمثل رسالة أو وصفًا مرتبطًا باسم الخطأ المحدد. |
| [Name](../../aspose.svg.dom/domexception/name) { get; } | إرجاع سلسلة تحتوي على إحدى السلاسل المقترنة باسم خطأ. |

## مجالات

| اسم | وصف |
| --- | --- |
| const [ABORT_ERR](../../aspose.svg.dom/domexception/abort_err) | تم إحباط العملية. |
| const [DATA_CLONE_ERR](../../aspose.svg.dom/domexception/data_clone_err) | لا يمكن استنساخ الكائن . |
| const [DOMSTRING_SIZE_ERR](../../aspose.svg.dom/domexception/domstring_size_err) | إذا كان نطاق النص المحدد لا يتناسب مع سلسلة DOM. |
| const [HIERARCHY_REQUEST_ERR](../../aspose.svg.dom/domexception/hierarchy_request_err) | إذا تم إدخال أي عقدة في مكان لا تنتمي إليه. |
| const [INDEX_SIZE_ERR](../../aspose.svg.dom/domexception/index_size_err) | إذا كان الفهرس أو الحجم سالبًا أو أكبر من القيمة المسموح بها. |
| const [INUSE_ATTRIBUTE_ERR](../../aspose.svg.dom/domexception/inuse_attribute_err) | إذا جرت محاولة لإضافة سمة مستخدمة بالفعل في مكان آخر. |
| const [INVALID_ACCESS_ERR](../../aspose.svg.dom/domexception/invalid_access_err) | إذا لم يتم دعم معلمة أو عملية بواسطة الكائن الأساسي. |
| const [INVALID_CHARACTER_ERR](../../aspose.svg.dom/domexception/invalid_character_err) | إذا تم تحديد حرف غير صالح أو غير قانوني ، مثل اسم XML. |
| const [INVALID_EXPRESSION_ERR](../../aspose.svg.dom/domexception/invalid_expression_err) | يحتوي التعبير على خطأ في بناء الجملة أو أنه ليس تعبيرًا قانونيًا وفقًا لقواعد محدد XPathEvaluator أو يحتوي على وظائف أو متغيرات خاصة بالامتداد لا يدعمها هذا التطبيق. |
| const [INVALID_MODIFICATION_ERR](../../aspose.svg.dom/domexception/invalid_modification_err) | إذا جرت محاولة لتعديل نوع الكائن الأساسي. |
| const [INVALID_NODE_TYPE_ERR](../../aspose.svg.dom/domexception/invalid_node_type_err) | العقدة المزودة غير صحيحة أو لها أصل غير صحيح لهذه العملية. |
| const [INVALID_STATE_ERR](../../aspose.svg.dom/domexception/invalid_state_err) | إذا جرت محاولة لاستخدام كائن غير قابل للاستخدام أو لم يعد صالحًا للاستخدام. |
| const [NAMESPACE_ERR](../../aspose.svg.dom/domexception/namespace_err) | إذا جرت محاولة لإنشاء كائن أو تغييره بطريقة غير صحيحة فيما يتعلق بمساحات الأسماء. |
| const [NETWORK_ERR](../../aspose.svg.dom/domexception/network_err) | حدث خطأ في الشبكة . |
| const [NOT_FOUND_ERR](../../aspose.svg.dom/domexception/not_found_err) | إذا جرت محاولة للإشارة إلى عقدة في سياق لا توجد فيه. |
| const [NOT_SUPPORTED_ERR](../../aspose.svg.dom/domexception/not_supported_err) | إذا كان التنفيذ لا يدعم النوع المطلوب للكائن أو العملية. |
| const [NO_DATA_ALLOWED_ERR](../../aspose.svg.dom/domexception/no_data_allowed_err) | إذا تم تحديد البيانات للعقدة التي لا تدعم البيانات. |
| const [NO_MODIFICATION_ALLOWED_ERR](../../aspose.svg.dom/domexception/no_modification_allowed_err) | إذا جرت محاولة لتعديل كائن حيث لا يُسمح بإجراء تعديلات. |
| const [QUOTA_EXCEEDED_ERR](../../aspose.svg.dom/domexception/quota_exceeded_err) | تم تجاوز الحصة . |
| const [SECURITY_ERR](../../aspose.svg.dom/domexception/security_err) | العملية غير آمنة . |
| const [SYNTAX_ERR](../../aspose.svg.dom/domexception/syntax_err) | إذا تم تحديد سلسلة غير صالحة أو غير قانونية. |
| const [TIMEOUT_ERR](../../aspose.svg.dom/domexception/timeout_err) | انتهت مهلة العملية . |
| const [TYPE_ERR](../../aspose.svg.dom/domexception/type_err) | لا يمكن تحويل التعبير لإرجاع النوع المحدد. |
| const [TYPE_MISMATCH_ERR](../../aspose.svg.dom/domexception/type_mismatch_err) | إذا كان نوع الكائن غير متوافق مع النوع المتوقع للمعامل المرتبط بالكائن. |
| const [URL_MISMATCH_ERR](../../aspose.svg.dom/domexception/url_mismatch_err) | عنوان URL المحدد لا يتطابق مع عنوان URL آخر. |
| const [VALIDATION_ERR](../../aspose.svg.dom/domexception/validation_err) | إذا كان استدعاء طريقة مثل insertBefore أو removeChild سيجعل العقدة غير صالحة فيما يتعلق بـ "الصلاحية الجزئية" ، فسيتم رفع هذا الاستثناء ولن يتم تنفيذ العملية. يستخدم هذا الرمز في [التحقق من المستوى 3 من DOM]. الرجوع إلى هذه المواصفات للحصول على مزيد من المعلومات. |
| const [WRONG_DOCUMENT_ERR](../../aspose.svg.dom/domexception/wrong_document_err) | إذا تم استخدام العقدة في مستند مختلف عن المستند الذي أنشأها (لا يدعمها) . |

### أنظر أيضا

* class [PlatformException](../../aspose.svg/platformexception)
* مساحة الاسم [Aspose.Svg.Dom](../../aspose.svg.dom)
* المجسم [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
