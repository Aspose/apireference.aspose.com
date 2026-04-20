---
title: "Aspose::Font::FontEnvironment class"
linktitle: "FontEnvironment"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::FontEnvironment class. يوفر معلومات حول البيئة الحالية والمنصة في C++."
type: docs
weight: 600
url: /ar/cpp/aspose.font/fontenvironment/
---
## FontEnvironment class


يوفر معلومات حول البيئة الحالية والمنصة.

```cpp
class FontEnvironment : public System::Object
```

## Enums

| تعداد | الوصف |
| --- | --- |
| [ParsingStrictness](./parsingstrictness/) | أنواع صرامة التحليل. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| static [get_CffCommonFontsSettings](./get_cffcommonfontssettings/)() | الإعدادات المشتركة لخطوط CFF. |
| static [get_Current](./get_current/)() | يحصل على البيئة الحالية. |
| [get_CurrentPlatformId](./get_currentplatformid/)() | يحصل على معرّف المنصة الحالي. |
| [get_FontSpecificEncodings](./get_fontspecificencodings/)() const | يخزن الترميزات المحددة للخطوط الموجهة للمستهلك. على سبيل المثال، تستخدم مستندات PDF ترميزات خاصة بـ Adobe Symbol وZapfDingbats. |
| [get_Strictness](./get_strictness/)() const | قد تحتوي بعض الخطوط على بيانات غير متوقعة، أو ميزات غير محددة، أو قد تكون مقصوصة بشكل تقريبي. |
| [set_Strictness](./set_strictness/)(FontEnvironment::ParsingStrictness) | قد تحتوي بعض الخطوط على بيانات غير متوقعة، أو ميزات غير محددة، أو قد تكون مقصوصة بشكل تقريبي. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
