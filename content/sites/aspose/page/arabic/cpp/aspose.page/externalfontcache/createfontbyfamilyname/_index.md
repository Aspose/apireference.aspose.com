---
title: "Aspose::Page::ExternalFontCache::CreateFontByFamilyName طريقة"
linktitle: "CreateFontByFamilyName"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::ExternalFontCache::CreateFontByFamilyName طريقة. يجلب DrFont حسب اسم عائلة الخط، الحجم، النمط والحروف الكبيرة للخط في C++."
type: docs
weight: 100
url: /ar/cpp/aspose.page/externalfontcache/createfontbyfamilyname/
---
## ExternalFontCache::CreateFontByFamilyName method


يجلب [DrFont](../) حسب اسم عائلة الخط، الحجم، النمط وحروف الخط الكبيرة.

```cpp
static System::SharedPtr<System::Drawing::Font> Aspose::Page::ExternalFontCache::CreateFontByFamilyName(System::String familyName, float size, System::Drawing::FontStyle style)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| familyName | System::String | [الخط](../../../aspose.page.font/) اسم العائلة. |
| sizePoints | float | [الخط](../../../aspose.page.font/) الحجم بالنقاط (نقطة واحدة هي 1/72 من البوصة). |
| style | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) نمط. |

### ReturnValue

يرجع DrFont
## ملاحظات



يجلب [DrFont](../) حسب اسم عائلة الخط، الحجم، النمط واسم عائلة الخط البديل.


يجلب [DrFont](../) حسب اسم عائلة الخط، الحجم، النمط، الحروف الكبيرة للخط واسم عائلة الخط البديل.


يجلب [System::Drawing::Font](../../../system.drawing/font/) حسب اسم عائلة الخط، النمط والحجم.


ينشئ [System::Drawing::Font](../../../system.drawing/font/) باستخدام اسم عائلة الخط، النمط والحجم.


///
## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [ExternalFontCache](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
