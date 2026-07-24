---
title: "Aspose::Page::XPS::XpsModel::XpsCanvas فئة"
linktitle: "XpsCanvas"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::XpsModel::XpsCanvas فئة. فئة تُضمّن ميزات عنصر Canvas. هذا العنصر يجمع العناصر معًا. على سبيل المثال، يمكن تجميع عناصر Glyphs و Path في Canvas لتُعرّف كوحدة (كوجهة ارتباط تشعبي) أو لتطبيق قيمة خاصية مركبة على كل عنصر فرعي وسلف في C++."
type: docs
weight: 500
url: /ar/cpp/aspose.page.xps.xpsmodel/xpscanvas/
---
## XpsCanvas class


فئة تُغلف ميزات عنصر Canvas. هذا العنصر يجمع العناصر معًا. على سبيل المثال، يمكن تجميع عناصر Glyphs و Path في Canvas لتُعرف كوحدة (كوجهة ارتباط تشعبي) أو لتطبيق قيمة خاصية مركبة على كل عنصر فرعي وسلف.

```cpp
class XpsCanvas : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(T) | يضيف عنصرًا إلى قائمة الأطفال لهذا الـ canvas. |
| [AddCanvas](./addcanvas/)() | يضيف canvas جديدًا إلى قائمة الأطفال لهذا الـ canvas. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | يضيف glyphs جديدة إلى قائمة الأطفال لهذا الـ canvas. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsPathGeometry\>) | يضيف مسارًا جديدًا إلى قائمة الأطفال لهذا الـ canvas. |
| [Clone](./clone/)() | ينسخ هذا الـ canvas. |
| [get_EdgeMode](./get_edgemode/)() const | يرجع/يضبط القيمة التي تتحكم في كيفية عرض حواف المسارات داخل الـ canvas. |
| [Insert](./insert/)(int32_t, T) | يدرج عنصرًا إلى قائمة الأطفال لهذا الـ canvas في موضع *index*. |
| [InsertCanvas](./insertcanvas/)(int32_t) | يدرج canvas جديدًا إلى قائمة الأطفال لهذا الـ canvas في موضع *index*. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | يدرج glyphs جديدة إلى قائمة الأطفال لهذا الـ canvas في موضع *index*. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsPathGeometry\>) | يدرج مسارًا جديدًا إلى قائمة الأطفال لهذا الـ canvas في موضع *index*. |
| [set_EdgeMode](./set_edgemode/)(XpsEdgeMode) | يرجع/يضبط القيمة التي تتحكم في كيفية عرض حواف المسارات داخل الـ canvas. |
## انظر أيضًا

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
