---
title: "تعداد Aspose::Font::TtfTables::TtfNameTable::NameId"
linktitle: "NameId"
second_title: "Aspose.Font لـ C++"
description: "تعداد Aspose::Font::TtfTables::TtfNameTable::NameId. يمثل NameId في C++."
type: docs
weight: 1600
url: /ar/cpp/aspose.font.ttftables/ttfnametable/nameid/
---
## NameId enum


يمثل [NameId](./).

```cpp
enum class NameId : uint16_t
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| CopyrightNotice | 0 | 0 إشعار حقوق النشر. |
| FontFamily | 1 | 1 عائلة [Font](../../../aspose.font/font/). هذه السلسلة هي اسم عائلة [Font](../../../aspose.font/font/) الذي يراه المستخدم على منصات ماك. |
| FontSubfamily | 2 | 2 الفئة الفرعية [Font](../../../aspose.font/font/). هذه السلسلة هي عائلة [Font](../../../aspose.font/font/) التي يراها المستخدم على منصات ماك. |
| UniqueFontId | 3 | 3 تعريف فريد للفئة الفرعية (مواصفة Apple). 3 معرف فريد لـ [Font](../../../aspose.font/font/) (مواصفة MS). |
| FullName | 4 | 4 الاسم الكامل لـ [Font](../../../aspose.font/font/). |
| الإصدار | 5 | 5 إصدار جدول الأسماء. |
| PostScriptName | 6 | 6 اسم PostScript لـ [Font](../../../aspose.font/font/). ملاحظة: قد يحتوي [Font](../../../aspose.font/font/) على اسم PostScript واحد فقط ويجب أن يكون هذا الاسم ASCII. |
| TrademarkNotice | 7 | 7 إشعار العلامة التجارية. |
| ManufacturerName | 8 | 8 اسم الشركة المصنعة. |
| اسم المصمم | 9 | 9 Designer؛ اسم المصمم للخط. |
| الوصف | 10 | 10 Description؛ وصف الخط. يمكن أن يحتوي على معلومات الإصدار، توصيات الاستخدام، التاريخ، الميزات، وما إلى ذلك. |
| UrlVendor | 11 | 11 URL لمورد الـ [Font](../../../aspose.font/font/) (مع البروتوكول، مثلًا [http://](http://)، [ftp://](ftp://)). إذا تم تضمين رقم تسلسلي فريد في الـ URL، يمكن استخدامه لتسجيل الـ [Font](../../../aspose.font/font/). |
| UrlDesigner | 12 | 12 URL لمصمم الـ [Font](../../../aspose.font/font/) (مع البروتوكول، مثلًا [http://](http://)، [ftp://](ftp://)) |
| LicenseDescription | 13 | 13 وصف الـ [License](../../../aspose.font/license/); وصف كيفية الاستخدام القانوني للـ [Font](../../../aspose.font/font/)، أو سيناريوهات مثال مختلفة للاستخدام المرخص. يجب كتابة هذا الحقل بلغة بسيطة، لا بأسلوب قانوني. |
| LicenseInfoUrl | 14 | 14 عنوان URL لمعلومات الـ [License](../../../aspose.font/license/)، حيث يمكن العثور على معلومات ترخيص إضافية. |
| PreferredFamily | 16 | 15 محجوز 16 Preferred Family (لـ Windows فقط)؛ في Windows، يُعرض اسم العائلة في قائمة الـ [Font](../../../aspose.font/font/); يُظهر اسم الفئة الفرعية كاسم النمط. لأسباب تاريخية، احتوت عائلات الـ [Font](../../../aspose.font/font/) على حد أقصى أربعة أنماط، لكن مصممي الـ [Font](../../../aspose.font/font/) قد يجمعون أكثر من أربعة خطوط في عائلة واحدة. تسمح معرفات Preferred Family و Preferred Subfamily لمصممي الـ [Font](../../../aspose.font/font/) بتضمين تجميعات العائلة/الفئة الفرعية المفضلة. هذه المعرفات موجودة فقط إذا كانت مختلفة عن المعرفين 1 و 2. |
| PreferredSubfamily | 17 | 17 Preferred Subfamily (لـ Windows فقط)؛ في Windows، يُعرض اسم العائلة في قائمة الـ [Font](../../../aspose.font/font/); يُظهر اسم الفئة الفرعية كاسم النمط. لأسباب تاريخية، احتوت عائلات الـ [Font](../../../aspose.font/font/) على حد أقصى أربعة أنماط، لكن مصممي الـ [Font](../../../aspose.font/font/) قد يجمعون أكثر من أربعة خطوط في عائلة واحدة. تسمح معرفات Preferred Family و Preferred Subfamily لمصممي الـ [Font](../../../aspose.font/font/) بتضمين تجميعات العائلة/الفئة الفرعية المفضلة. هذه المعرفات موجودة فقط إذا كانت مختلفة عن المعرفين 1 و 2. |
| CompatibleFull | 18 | 18 Compatible Full (لـ Macintosh فقط)؛ على Macintosh، يُنشأ اسم القائمة باستخدام مورد الـ [Font](../../../aspose.font/font/). عادةً ما يتطابق مع الاسم الكامل. إذا أردت أن يظهر اسم الـ [Font](../../../aspose.font/font/) بشكل مختلف عن الاسم الكامل، يمكنك إدراج اسم Compatible Full في المعرف 18. هذا الاسم لا يستخدمه نظام Mac OS نفسه، لكنه قد يستخدمه مطورو التطبيقات (مثلًا Adobe). |
| SampleText | 19 | 19 Sample text. يمكن أن يكون هذا هو اسم الـ [Font](../../../aspose.font/font/)، أو أي نص آخر يعتقد المصمم أنه أفضل نص عينة لتظهر كيف يبدو الـ [Font](../../../aspose.font/font/). |
| PostScriptCID | 20 | وجوده في الخط يعني أن nameID 6 يحتوي على اسم خط PostScript يُقصد به الاستخدام مع استدعاء “composefont” لتفعيل الخط في مفسر PostScript. |
| WwsFamilyName | 21 | يُستخدم لتوفير اسم عائلة متوافق مع WWS في حال لم تتطابق الإدخالات للمعرفين 16 و 17 مع نموذج WWS. |
| WwsSubfamilyName | 22 | يُستخدم بالاشتراك مع المعرف 21، هذا المعرف يوفر اسم فئة فرعية متوافق مع WWS (يعكس فقط خصائص الوزن والعرض والانحدار) في حال لم تتطابق الإدخالات للمعرفين 16 و 17 مع نموذج WWS. |
| LightBackground | 23 | هذا المعرف، إذا استُخدم في مصفوفة تسميات لوحة الألوان في جدول CPAL، يحدد أن لوحة الألوان المقابلة في جدول CPAL مناسبة للاستخدام مع الخط عند عرضه على خلفية فاتحة مثل الأبيض. |
| DarkBackground | 24 | هذا المعرف، إذا استُخدم في مصفوفة تسميات لوحة الألوان في جدول CPAL، يحدد أن لوحة الألوان المقابلة في جدول CPAL مناسبة للاستخدام مع الخط عند عرضه على خلفية داكنة مثل الأسود. |
| VariationsPostScriptNamePrefix | 25 | إذا كان موجودًا في خط متغير، قد يُستخدم كبادئة عائلة في خوارزمية توليد اسم PostScript للخطوط المتغيرة. |

## انظر أيضًا

* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
