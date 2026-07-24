---
title: "Aspose::Page::XPS::Presentation::IXpsTextConversionOptions فئة"
linktitle: "IXpsTextConversionOptions"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::Presentation::IXpsTextConversionOptions فئة. يحدد الخيارات لتحويل XPS إلى صيغ أخرى في C++."
type: docs
weight: 300
url: /ar/cpp/aspose.page.xps.presentation/ixpstextconversionoptions/
---
## IXpsTextConversionOptions class


يحدد الخيارات لتحويل [XPS](../../aspose.page.xps/) إلى صيغ أخرى.

```cpp
class IXpsTextConversionOptions : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [get_PreserveText](./get_preservetext/)() | في [XPS](../../aspose.page.xps/)، قد تحتوي بعض عناصر النص على مراجع لأشكال حروف بديلة لا تتطابق مع أي رمز حرف في الخط. إذا تم تعيين هذه العلامة إلى true، يتم تحويل النص من تلك العناصر في [XPS](../../aspose.page.xps/) إلى أشكال رسومية. ثم يظهر النص نفسه شفافًا في الأعلى. هذا يجعل نص تلك العناصر قابلًا للتحديد. لكن الأثر الجانبي هو أن ملف الإخراج قد يكون أكبر بكثير من الأصلي. إذا تم تعيين هذه العلامة إلى false، يتم استبدال الأحرف التي يجب عرضها كأشكال بديلة ببعض الأحرف الأخرى التي تُطابق أشكال الحروف البديلة. وبالتالي، سيظل النص قابلًا للتحديد لكنه سيتغير وربما يصبح غير قابل للقراءة. |
| virtual [set_PreserveText](./set_preservetext/)(bool) | في [XPS](../../aspose.page.xps/)، قد تحتوي بعض عناصر النص على مراجع لأشكال حروف بديلة لا تتطابق مع أي رمز حرف في الخط. إذا تم تعيين هذه العلامة إلى true، يتم تحويل النص من تلك العناصر في [XPS](../../aspose.page.xps/) إلى أشكال رسومية. ثم يظهر النص نفسه شفافًا في الأعلى. هذا يجعل نص تلك العناصر قابلًا للتحديد. لكن الأثر الجانبي هو أن ملف الإخراج قد يكون أكبر بكثير من الأصلي. إذا تم تعيين هذه العلامة إلى false، يتم استبدال الأحرف التي يجب عرضها كأشكال بديلة ببعض الأحرف الأخرى التي تُطابق أشكال الحروف البديلة. وبالتالي، سيظل النص قابلًا للتحديد لكنه سيتغير وربما يصبح غير قابل للقراءة. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Presentation](../)
* Library [Aspose.Page for C++](../../)
