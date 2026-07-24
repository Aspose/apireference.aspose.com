---
title: "الفئة Aspose::Page::XPS::ApsLoadOptions"
linktitle: "ApsLoadOptions"
second_title: "Aspose.Page لـ C++"
description: "الفئة Aspose::Page::XPS::ApsLoadOptions. خيارات تحميل مستند APS في C++."
type: docs
weight: 100
url: /ar/cpp/aspose.page.xps/apsloadoptions/
---
## ApsLoadOptions class


خيارات تحميل مستند APS.

```cpp
class ApsLoadOptions : public Aspose::Page::XPS::LoadOptions
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [ApsLoadOptions](./apsloadoptions/)() | ينشئ نسخة جديدة من الخيارات. |
| [get_TransparencyThreshold](./get_transparencythreshold/)() const | قيمة صحيحة من 0 إلى 255، تُعتبر أي بكسل في الصورة يحتوي على قيم ألفا أقل من هذه القيمة شفافًا بالكامل. لا يدعم PostScript الشفافية، لكنه يمكنه تطبيق قناع صريح فوق الصورة الملونة حيث تكون بعض البكسلات غير شفافة تمامًا وبعضها الآخر شفاف بالكامل. يُستخدم عتبة الشفافية للعثور على أقرب تشابه بين الأصل ونتيجة PostScript. القيمة الافتراضية هي 255. |
| [set_TransparencyThreshold](./set_transparencythreshold/)(int32_t) | قيمة صحيحة من 0 إلى 255، تُعتبر أي بكسل في الصورة يحتوي على قيم ألفا أقل من هذه القيمة شفافًا بالكامل. لا يدعم PostScript الشفافية، لكنه يمكنه تطبيق قناع صريح فوق الصورة الملونة حيث تكون بعض البكسلات غير شفافة تمامًا وبعضها الآخر شفاف بالكامل. يُستخدم عتبة الشفافية للعثور على أقرب تشابه بين الأصل ونتيجة PostScript. القيمة الافتراضية هي 255. |
## انظر أيضًا

* Class [LoadOptions](../loadoptions/)
* Namespace [Aspose::Page::XPS](../)
* Library [Aspose.Page for C++](../../)
