---
title: "Aspose::Page::XPS::ApsLoadOptions::set_TransparencyThreshold طريقة"
linktitle: "set_TransparencyThreshold"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::ApsLoadOptions::set_TransparencyThreshold طريقة. قيمة صحيحة من 0 إلى 255 أدنى من ذلك سيُعتبر بكسل الصورة الذي يحتوي على قيم ألفا شفافاً بالكامل. لا يدعم PostScript الشفافية، لكنه يمكنه تطبيق قناع صريح فوق الصورة الملونة حيث بعض البكسلات ستكون معتمة بالكامل وبعضها الآخر سيكون شفافاً بالكامل. تُستخدم عتبة الشفافية للعثور على أقرب تشابه بين الأصل ونتيجة PostScript. القيمة الافتراضية هي 255 في C++."
type: docs
weight: 300
url: /ar/cpp/aspose.page.xps/apsloadoptions/set_transparencythreshold/
---
## ApsLoadOptions::set_TransparencyThreshold method


قيمة صحيحة من 0 إلى 255، تُعتبر أي بكسل في الصورة يحتوي على قيم ألفا أقل من هذه القيمة شفافًا بالكامل. لا يدعم PostScript الشفافية، لكنه يمكنه تطبيق قناع صريح فوق الصورة الملونة حيث تكون بعض البكسلات غير شفافة تمامًا وبعضها الآخر شفاف بالكامل. يُستخدم عتبة الشفافية للعثور على أقرب تشابه بين الأصل ونتيجة PostScript. القيمة الافتراضية هي 255.

```cpp
void Aspose::Page::XPS::ApsLoadOptions::set_TransparencyThreshold(int32_t value)
```

## انظر أيضًا

* Class [ApsLoadOptions](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
