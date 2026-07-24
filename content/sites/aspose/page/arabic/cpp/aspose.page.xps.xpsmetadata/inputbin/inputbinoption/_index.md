---
title: "Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption class"
linktitle: "InputBinOption"
second_title: "Aspose.Page لـ C++"
description: "فئة Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption. تصف خيارات ميزات JobInputBin و DocumentInputBin و PageInputBin في C++."
type: docs
weight: 700
url: /ar/cpp/aspose.page.xps.xpsmetadata/inputbin/inputbinoption/
---
## InputBinOption class


يصف خيارات ميزات [JobInputBin](../../jobinputbin/)، [DocumentInputBin](../../documentinputbin/) و [PageInputBin](../../pageinputbin/).

```cpp
class InputBinOption : public Aspose::Page::XPS::XpsMetadata::Option,
                       public Aspose::Page::XPS::XpsMetadata::InputBin::IInputBinItem
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | يضيف مصفوفة من مثيلات [IInputBinOptionItem](../iinputbinoptionitem/) إلى الخيار. |
| [Clone](./clone/)() | ينسخ نسخة من كائن الخيار هذا. |
| [InputBinOption](./inputbinoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | ينشئ مثيلًا جديدًا. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [AutoSelect](./autoselect/) | سيختار الجهاز تلقائيًا الخيار الأفضل بناءً على التكوين. |
| static [AutoSheetFeeder](./autosheetfeeder/) | صينية إدخال الجهاز للطابعات النافثة للحبر. |
| static [Cassette](./cassette/) | يحدد أن صينية التغذية هي كاسيت. |
| static [Manual](./manual/) | يحدد صينية التغذية اليدوية الافتراضية. |
| static [Tractor](./tractor/) | يحدد أن صينية التغذية هي جرار. |
## انظر أيضًا

* Class [Option](../../option/)
* Class [IInputBinItem](../iinputbinitem/)
* Class [InputBin](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
