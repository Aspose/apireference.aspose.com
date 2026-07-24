---
title: "فئة Aspose::Page::SaveOptions"
linktitle: "SaveOptions"
second_title: "Aspose.Page لـ C++"
description: "فئة Aspose::Page::SaveOptions. هذه الفئة تحتوي على الخيارات اللازمة لإدارة عملية التحويل في C++."
type: docs
weight: 1500
url: /ar/cpp/aspose.page/saveoptions/
---
## SaveOptions class


هذه الفئة تحتوي على الخيارات اللازمة لإدارة عملية التحويل.

```cpp
class SaveOptions : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_AdditionalFontsFolders](./get_additionalfontsfolders/)() const | يحدد المجلدات الإضافية التي يجب على المحول العثور فيها على الخطوط للمستند المدخل. المجلد الافتراضي هو مجلد الخطوط القياسي حيث يجد نظام التشغيل الخطوط للاستخدام الداخلي. |
| virtual [get_ConvertFontsToTTF](./get_convertfontstottf/)() | يحدد ما إذا كان سيتم حفظ الخطوط غير TrueType إلى TTF. يقلل ذلك بشكل كبير من حجم المستند الناتج في تحويل PS إلى PDF ويزيد من سرعة تحويل ملفات PS التي تحتوي على كمية كبيرة من النص بخطوط غير TrueType إلى أي تنسيق إخراج. ومع ذلك، هناك إزاحة رأسية صغيرة للنص عند تحويل ملف PostSctipt إلى صورة. |
| virtual [get_Debug](./get_debug/)() | يحدد ما إذا كان يجب طباعة معلومات التصحيح إلى تدفق الإخراج القياسي أم لا. |
| virtual [get_Exceptions](./get_exceptions/)() | يعيد قائمة بأخطاء التحويل المكبوتة إذا كان [SuppressErrors](../) صحيحًا. |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | فئة الجودة تحدد مستوى الضغط للصورة. القيم المتاحة هي من 0 إلى 100. كلما كان الرقم المحدد أقل، زاد الضغط وبالتالي انخفضت جودة الصورة. القيمة 0 تؤدي إلى أدنى جودة للصورة، بينما القيمة 100 تؤدي إلى أعلى جودة. |
| [get_Size](./get_size/)() const | يحصل/يضبط حجم الصورة. |
| virtual [get_SupressErrors](./get_supresserrors/)() | يحدد ما إذا كان يجب كتم الأخطاء أم لا. إذا كان صحيحًا، تُضاف الأخطاء المكبوتة إلى قائمة [Exceptions](../). إذا كان خاطئًا، سيؤدي أول خطأ إلى إنهاء البرنامج. |
| [SaveOptions](./saveoptions/)() | ينشئ نسخة جديدة من فئة [SaveOptions](./) مع القيم الافتراضية للعلامات [SuppressErrors](../) (true) و [Debug](../) (false). |
| [SaveOptions](./saveoptions/)(bool) | ينشئ نسخة جديدة من فئة [SaveOptions](./) مع القيمة الافتراضية للعلامة [Debug](../) (false). |
| [SaveOptions](./saveoptions/)(Aspose::Page::Drawing::Size) | ينشئ نسخة جديدة من [SaveOptions](./) مع حجم الصفحة المحدد. |
| [SaveOptions](./saveoptions/)(bool, Aspose::Page::Drawing::Size) | ينشئ نسخة جديدة من فئة [SaveOptions](./) مع القيمة الافتراضية للعلامة [Debug](../) (false) ومع حجم الصفحة المحدد. |
| [set_AdditionalFontsFolders](./set_additionalfontsfolders/)(System::ArrayPtr\<System::String\>) | يحدد المجلدات الإضافية التي يجب على المحول العثور فيها على الخطوط للمستند المدخل. المجلد الافتراضي هو مجلد الخطوط القياسي حيث يجد نظام التشغيل الخطوط للاستخدام الداخلي. |
| virtual [set_ConvertFontsToTTF](./set_convertfontstottf/)(bool) | يحدد ما إذا كان سيتم حفظ الخطوط غير TrueType إلى TTF. يقلل ذلك بشكل كبير من حجم المستند الناتج في تحويل PS إلى PDF ويزيد من سرعة تحويل ملفات PS التي تحتوي على كمية كبيرة من النص بخطوط غير TrueType إلى أي تنسيق إخراج. ومع ذلك، هناك إزاحة رأسية صغيرة للنص عند تحويل ملف PostSctipt إلى صورة. |
| virtual [set_Debug](./set_debug/)(bool) | يحدد ما إذا كان يجب طباعة معلومات التصحيح إلى تدفق الإخراج القياسي أم لا. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | فئة الجودة تحدد مستوى الضغط للصورة. القيم المتاحة هي من 0 إلى 100. كلما كان الرقم المحدد أقل، زاد الضغط وبالتالي انخفضت جودة الصورة. القيمة 0 تؤدي إلى أدنى جودة للصورة، بينما القيمة 100 تؤدي إلى أعلى جودة. |
| [set_Size](./set_size/)(Aspose::Page::Drawing::Size) | يحصل/يضبط حجم الصورة. |
| virtual [set_SupressErrors](./set_supresserrors/)(bool) | يحدد ما إذا كان يجب كتم الأخطاء أم لا. إذا كان صحيحًا، تُضاف الأخطاء المكبوتة إلى قائمة [Exceptions](../). إذا كان خاطئًا، سيؤدي أول خطأ إلى إنهاء البرنامج. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
