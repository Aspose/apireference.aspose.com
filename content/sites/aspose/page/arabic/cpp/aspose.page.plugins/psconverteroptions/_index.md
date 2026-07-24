---
title: "Aspose::Page::Plugins::PsConverterOptions فئة"
linktitle: "PsConverterOptions"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::Plugins::PsConverterOptions فئة. تمثل خيارات ملحق PsConverter في C++."
type: docs
weight: 1200
url: /ar/cpp/aspose.page.plugins/psconverteroptions/
---
## PsConverterOptions class


تمثل الخيارات لملحق [PsConverter](../psconverter/).

```cpp
class PsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                           public Aspose::Page::Plugins::IDataContainer,
                           public Aspose::Page::Plugins::ISaveInstruction
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | يضيف مصدر بيانات جديد إلى مجموعة بيانات ملحق [PsConverter](../psconverter/). |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | يضيف مصدر بيانات جديد إلى مجموعة بيانات ملحق [PsConverterOptions](./). |
| [get_AdditionalFontsFolders](./get_additionalfontsfolders/)() const | يحدد المجلدات الإضافية التي يجب على المحول العثور فيها على الخطوط للمستند المدخل. المجلد الافتراضي هو مجلد الخطوط القياسي حيث يجد نظام التشغيل الخطوط للاستخدام الداخلي. |
| [get_DataCollection](./get_datacollection/)() override | يعيد مجموعة بيانات ملحق [PsConverterOptions](./). |
| virtual [get_Debug](./get_debug/)() | يحدد ما إذا كان يجب طباعة معلومات التصحيح إلى تدفق الإخراج القياسي أم لا. |
| virtual [get_Exceptions](./get_exceptions/)() | يعيد قائمة بأخطاء التحويل المكبوتة إذا كان [SuppressErrors](../) صحيحًا. |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | فئة الجودة تحدد مستوى الضغط للصورة. القيم المتاحة هي من 0 إلى 100. كلما كان الرقم المحدد أقل، زاد الضغط وبالتالي انخفضت جودة الصورة. القيمة 0 تؤدي إلى أدنى جودة للصورة، بينما القيمة 100 تؤدي إلى أعلى جودة. |
| virtual [get_OperationName](./get_operationname/)() | يرجع اسم العملية. |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | يحصل على مجموعة الأهداف المضافة لحفظ نتائج العملية. |
| [get_SupressErrors](./get_supresserrors/)() const | يحدد ما إذا كان يجب كتم الأخطاء أم لا. إذا كان صحيحًا، تُضاف الأخطاء المكبوتة إلى قائمة [Exceptions](../). إذا كان خاطئًا، سيؤدي أول خطأ إلى إنهاء البرنامج. |
| [set_AdditionalFontsFolders](./set_additionalfontsfolders/)(System::ArrayPtr\<System::String\>) | يحدد المجلدات الإضافية التي يجب على المحول العثور فيها على الخطوط للمستند المدخل. المجلد الافتراضي هو مجلد الخطوط القياسي حيث يجد نظام التشغيل الخطوط للاستخدام الداخلي. |
| virtual [set_Debug](./set_debug/)(bool) | يحدد ما إذا كان يجب طباعة معلومات التصحيح إلى تدفق الإخراج القياسي أم لا. |
| virtual [set_Exceptions](./set_exceptions/)(System::SharedPtr\<System::Collections::Generic::IList\<System::Exception\>\>) | يعيد قائمة بأخطاء التحويل المكبوتة إذا كان [SuppressErrors](../) صحيحًا. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | فئة الجودة تحدد مستوى الضغط للصورة. القيم المتاحة هي من 0 إلى 100. كلما كان الرقم المحدد أقل، زاد الضغط وبالتالي انخفضت جودة الصورة. القيمة 0 تؤدي إلى أدنى جودة للصورة، بينما القيمة 100 تؤدي إلى أعلى جودة. |
| [set_SupressErrors](./set_supresserrors/)(bool) | يحدد ما إذا كان يجب كتم الأخطاء أم لا. إذا كان صحيحًا، تُضاف الأخطاء المكبوتة إلى قائمة [Exceptions](../). إذا كان خاطئًا، سيؤدي أول خطأ إلى إنهاء البرنامج. |
## انظر أيضًا

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
