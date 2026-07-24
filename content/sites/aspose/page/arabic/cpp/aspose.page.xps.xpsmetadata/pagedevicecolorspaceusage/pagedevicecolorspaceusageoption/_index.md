---
title: "Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption فئة"
linktitle: "PageDeviceColorSpaceUsageOption"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption فئة. يصف خيارات ميزة PageDeviceColorSpaceUsage في C++."
type: docs
weight: 200
url: /ar/cpp/aspose.page.xps.xpsmetadata/pagedevicecolorspaceusage/pagedevicecolorspaceusageoption/
---
## PageDeviceColorSpaceUsageOption class


يصف خيارات ميزة [PageDeviceColorSpaceUsage](../).

```cpp
class PageDeviceColorSpaceUsageOption : public Aspose::Page::XPS::XpsMetadata::Option
```

## الحقول

| حقل | الوصف |
| --- | --- |
| static [MatchToDefault](./matchtodefault/) | إذا قرر الجهاز أن الملف التعريفي المحدد بواسطة المعامل [PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/) يمكن استخدامه كملف تعريف مساحة لون الجهاز، فسيتم اعتبار جميع العناصر التي تستخدم نفس الملف التعريفي بأنها محددة بالفعل في مساحة لون الجهاز. يجب على جميع العناصر الأخرى أن تستخدم الملف التعريفي المحدد لتلك العنصر. إذا تعذر استخدام الملف التعريفي كملف تعريف مساحة لون الجهاز، يجب إدارة الألوان للعناصر التي تستخدم الملف التعريفي مثل أي عنصر آخر يستخدم ملف اللون. |
| static [OverrideDeviceDefault](./overridedevicedefault/) | إذا كان الملف التعريفي المحدد بواسطة المعامل [PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/) يحتوي على عدد من القنوات يطابق عدد الألوان الأساسية للجهاز، يجب أن يُستخدم بدلاً من إدارة اللون الداخلية للجهاز لجميع العناصر. تُفترض أن العناصر التي تستخدم هذا الملف التعريفي تكون في مساحة لون الجهاز ولن تُدار ألوانها أكثر. |
## انظر أيضًا

* Class [Option](../../option/)
* Class [PageDeviceColorSpaceUsage](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
