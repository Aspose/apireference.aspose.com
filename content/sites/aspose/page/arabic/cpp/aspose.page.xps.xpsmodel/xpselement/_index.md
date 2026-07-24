---
title: "Aspose::Page::XPS::XpsModel::XpsElement class"
linktitle: "XpsElement"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::XpsModel::XpsElement class. فئة تُجَسِّد ميزات عنصر XPS الشائعة في C++."
type: docs
weight: 900
url: /ar/cpp/aspose.page.xps.xpsmodel/xpselement/
---
## XpsElement class


الفئة التي تُجَسِّد ميزات العنصر الشائعة [XPS](../../aspose.page.xps/).

```cpp
class XpsElement : public Aspose::Page::XPS::XpsModel::XpsObject,
                   public System::Collections::Generic::IEnumerable<System::SharedPtr<XpsContentElement>>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [begin](./begin/)() | يحصل على المؤشر الذي يشير إلى العنصر الأول (إن وجد) في المجموعة. |
| [begin](./begin/)() const | يحصل على المؤشر الذي يشير إلى العنصر الأول (إن وجد) في النسخة المؤهلة بالثابت من المجموعة. |
| [cbegin](./cbegin/)() const | يحصل على المؤشر الذي يشير إلى العنصر الأول المؤهل بالثابت (إن وجد) في المجموعة. |
| [cend](./cend/)() const | يحصل على المؤشر الذي يشير مباشرة بعد العنصر الأخير المؤهل بالثابت (إن وجد) في المجموعة. |
| [cpp_set_parent_shared](./cpp_set_parent_shared/)() |  |
| [cpp_set_parent_weak](./cpp_set_parent_weak/)() |  |
| [end](./end/)() | يحصل على المؤشر الذي يشير مباشرةً بعد العنصر الأخير (إن وجد) في المجموعة. |
| [end](./end/)() const | يحصل على المؤشر الذي يشير مباشرةً بعد العنصر الأخير (إن وجد) في النسخة المؤهلة بالثابت من المجموعة. |
| [get_Count](./get_count/)() | يرجع عدد العناصر الفرعية. |
| [get_Parent](./get_parent/)() const |  |
| [GetEnumerator](./getenumerator/)() override | تنفيذ واجهة [System::Collections::Generic::IEnumerable<XpsContentElement>](../../system.collections.generic/ienumerable/) . |
| [idx_get](./idx_get/)(int32_t) | يوفر الوصول إلى أبناء العنصر عبر الفهرس *i* . |
| [set_Parent](./set_parent/)(System::SharedPtr\<XpsElement\>) |  |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | يحصل على المؤشر الذي يشير إلى العنصر الأول (إن وجد) في النسخة المؤهلة بالثابت من المجموعة. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | يحصل على المؤشر الذي يشير إلى العنصر الأول (إن وجد) في المجموعة. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | يحصل على المؤشر الذي يشير مباشرةً بعد العنصر الأخير (إن وجد) في النسخة المؤهلة بالثابت من المجموعة. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | يحصل على المؤشر الذي يشير مباشرةً بعد العنصر الأخير (إن وجد) في المجموعة. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [const_iterator](./const_iterator/) | نوع المكرّر الثابت. |
| [iterator](./iterator/) | نوع المكرّر. |
| [iterator_holder_type](./iterator_holder_type/) | نوع مجموعة يتم استخدام أنواع المؤشرات الخاصة به كأنواع مؤشرات في المجموعة الحالية. |
| [virtualized_iterator](./virtualized_iterator/) | نوع افتراضي. |
| [virtualized_iterator_element](./virtualized_iterator_element/) | نوع عنصر افتراضي. |
## انظر أيضًا

* Class [XpsObject](../xpsobject/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
