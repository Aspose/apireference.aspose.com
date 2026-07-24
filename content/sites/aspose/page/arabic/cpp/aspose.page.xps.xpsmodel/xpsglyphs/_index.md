---
title: "فئة Aspose::Page::XPS::XpsModel::XpsGlyphs"
linktitle: "XpsGlyphs"
second_title: "Aspose.Page لـ C++"
description: "فئة Aspose::Page::XPS::XpsModel::XpsGlyphs. فئة تُغلف ميزات عنصر Glyphs. يمثل هذا العنصر سلسلة من النص المنسق بشكل موحد من خط واحد. يوفر المعلومات اللازمة للتصوير الدقيق ويدعم ميزات البحث والاختيار في مستهلكي العرض في C++."
type: docs
weight: 1500
url: /ar/cpp/aspose.page.xps.xpsmodel/xpsglyphs/
---
## XpsGlyphs class


فئة تُغلف ميزات عنصر Glyphs. هذا العنصر يمثل سلسلة من النص المنسق بشكل موحد من خط واحد. يوفر المعلومات اللازمة للتصيير الدقيق ويدعم ميزات البحث والاختيار في المستهلكين الذين يعرضون المحتوى.

```cpp
class XpsGlyphs : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() | استنسخ هذه الرموز. |
| [get_BidiLevel](./get_bidilevel/)() const | إرجاع/تعيين القيمة التي تحدد مستوى التعشيق الثنائي الاتجاه لخوارزمية Unicode. القيم الزوجية تعني تخطيط من اليسار إلى اليمين، والقيم الفردية تعني تخطيط من اليمين إلى اليسار. يضع تخطيط من اليمين إلى اليسار أصل السطر على الجانب الأيمن من أول رمز، مع عرض تقدم إيجابي (يمثل التقدم إلى اليسار) يضع الرموز اللاحقة إلى يسار الرمز السابق. |
| [get_Fill](./get_fill/)() | إرجاع/تعيين الفرشاة المستخدمة لملء شكل الرموز المرسومة. |
| [get_Font](./get_font/)() | إرجاع مورد الخط للخط **TrueType** المستخدم لتنسيق نص العناصر. |
| [get_FontRenderingEmSize](./get_fontrenderingemsize/)() const | إرجاع/تعيين حجم الخط بوحدات سطح الرسم، معبرًا عنه كقيمة عائمة بوحدات الفضاء الإحداثي الفعّال. |
| [get_Indices](./get_indices/)() |  |
| [get_IsSideways](./get_issideways/)() const | إرجاع/تعيين القيمة التي تشير إلى أن الحرف تم تدويره على جانبه، مع تعريف الأصل كنقطة أعلى مركز الحرف غير المدور. |
| [get_OriginX](./get_originx/)() const | إرجاع/تعيين إحداثي x لأول حرف في السلسلة، بوحدات مساحة الإحداثيات الفعّالة. |
| [get_OriginY](./get_originy/)() const | إرجاع/تعيين إحداثي y لأول حرف في السلسلة، بوحدات مساحة الإحداثيات الفعّالة. |
| [get_StyleSimulations](./get_stylesimulations/)() const | إرجاع/تعيين القيمة التي تحدد محاكاة النمط. |
| [get_UnicodeString](./get_unicodestring/)() const | إرجاع/تعيين سلسلة النص التي تم عرضها بواسطة عنصر Glyphs. يتم تحديد النص كنقاط شفرة Unicode. |
| [set_BidiLevel](./set_bidilevel/)(int32_t) | إرجاع/تعيين القيمة التي تحدد مستوى التعشيق الثنائي الاتجاه لخوارزمية Unicode. القيم الزوجية تعني تخطيط من اليسار إلى اليمين، والقيم الفردية تعني تخطيط من اليمين إلى اليسار. يضع تخطيط من اليمين إلى اليسار أصل السطر على الجانب الأيمن من أول رمز، مع عرض تقدم إيجابي (يمثل التقدم إلى اليسار) يضع الرموز اللاحقة إلى يسار الرمز السابق. |
| [set_Fill](./set_fill/)(System::SharedPtr\<XpsBrush\>) | إرجاع/تعيين الفرشاة المستخدمة لملء شكل الرموز المرسومة. |
| [set_FontRenderingEmSize](./set_fontrenderingemsize/)(float) | إرجاع/تعيين حجم الخط بوحدات سطح الرسم، معبرًا عنه كقيمة عائمة بوحدات الفضاء الإحداثي الفعّال. |
| [set_Indices](./set_indices/)(System::SharedPtr\<System::Collections::Generic::SortedList\<int32_t, System::SharedPtr\<XpsGlyphMapping\>\>\>) |  |
| [set_IsSideways](./set_issideways/)(bool) | إرجاع/تعيين القيمة التي تشير إلى أن الحرف تم تدويره على جانبه، مع تعريف الأصل كنقطة أعلى مركز الحرف غير المدور. |
| [set_OriginX](./set_originx/)(float) | إرجاع/تعيين إحداثي x لأول حرف في السلسلة، بوحدات مساحة الإحداثيات الفعّالة. |
| [set_OriginY](./set_originy/)(float) | إرجاع/تعيين إحداثي y لأول حرف في السلسلة، بوحدات مساحة الإحداثيات الفعّالة. |
| [set_StyleSimulations](./set_stylesimulations/)(XpsStyleSimulations) | إرجاع/تعيين القيمة التي تحدد محاكاة النمط. |
| [set_UnicodeString](./set_unicodestring/)(System::String) | إرجاع/تعيين سلسلة النص التي تم عرضها بواسطة عنصر Glyphs. يتم تحديد النص كنقاط شفرة Unicode. |
## انظر أيضًا

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
