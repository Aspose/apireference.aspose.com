---
title: "Aspose::Page::Plugins::XpsConverterOptions فئة"
linktitle: "XpsConverterOptions"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::Plugins::XpsConverterOptions فئة. تمثّل خيارات لإضافة XpsConverter في C++."
type: docs
weight: 2000
url: /ar/cpp/aspose.page.plugins/xpsconverteroptions/
---
## XpsConverterOptions class


يمثّل خيارات لإضافة [XpsConverter](../xpsconverter/).

```cpp
class XpsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                            public Aspose::Page::Plugins::IDataContainer,
                            public Aspose::Page::Plugins::ISaveInstruction
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | يضيف مصدر بيانات جديد إلى مجموعة بيانات إضافة [XpsConverter](../xpsconverter/). |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | يضيف مصدر بيانات جديد إلى مجموعة بيانات إضافة [XpsConverterOptions](./). |
| [get_DataCollection](./get_datacollection/)() override | يعيد مجموعة بيانات إضافة [XpsConverterOptions](./). |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | فئة الجودة تحدد مستوى الضغط للصورة. القيم المتاحة هي من 0 إلى 100. كلما كان الرقم المحدد أقل، زاد الضغط وبالتالي انخفضت جودة الصورة. القيمة 0 تؤدي إلى أدنى جودة للصورة، بينما القيمة 100 تؤدي إلى أعلى جودة. |
| virtual [get_OperationName](./get_operationname/)() | يرجع اسم العملية. |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | يحصل على مجموعة الأهداف المضافة لحفظ نتائج العملية. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | فئة الجودة تحدد مستوى الضغط للصورة. القيم المتاحة هي من 0 إلى 100. كلما كان الرقم المحدد أقل، زاد الضغط وبالتالي انخفضت جودة الصورة. القيمة 0 تؤدي إلى أدنى جودة للصورة، بينما القيمة 100 تؤدي إلى أعلى جودة. |
## انظر أيضًا

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
