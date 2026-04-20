---
title: "Aspose::Font::CffDataProviders::CffUpdateStringIndexStrategy enum"
linktitle: "CffUpdateStringIndexStrategy"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::CffDataProviders::CffUpdateStringIndexStrategy enum. يحدد كيفية إضافة السلاسل إلى تخزين CFF String INDEX. عندما نحاول إضافة سلسلة ما إلى CFF String INDEX، قد يحدث أن تكون هذه السلسلة موجودة بالفعل في String INDEX. باستخدام الخيار SearchForDuplicates يمكننا إجبار البحث عبر String INDEX لاكتشاف ما إذا كانت هذه السلسلة موجودة بالفعل أم لا. هذا النهج يوفر مساحة في بنية String INDEX، لكنه يتطلب وقتًا أكثر لإضافة السلسلة في C++."
type: docs
weight: 1000
url: /ar/cpp/aspose.font.cffdataproviders/cffupdatestringindexstrategy/
---
## CffUpdateStringIndexStrategy enum


يحدد كيفية إضافة السلاسل إلى تخزين CFF String INDEX. عندما نحاول إضافة سلسلة ما إلى CFF String INDEX، قد يحدث أن تكون هذه السلسلة موجودة بالفعل في String INDEX. باستخدام الخيار [SearchForDuplicates](./) يمكننا إجبار البحث عبر String INDEX لاكتشاف ما إذا كانت هذه السلسلة موجودة بالفعل أم لا. هذا النهج يوفر مساحة في بنية String INDEX، لكنه يتطلب وقتًا أكثر لإضافة السلسلة.

```cpp
enum class CffUpdateStringIndexStrategy
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| SearchForDuplicates | 0 | يحدد أن البحث عن السلسلة التي سيتم إضافتها يجب أن يتم في بنية String INDEX لتجنب إضافة مكررات. |
| AddStringAsIs | 1 | يحدد أنه لا يجب إجراء أي فحوصات للتكرارات عند إضافة سلسلة. هذا الأسلوب يعمل أسرع، لكنه قد يؤدي إلى استخدام غير فعال للذاكرة لسلسلة String INDEX. |

## انظر أيضًا

* Namespace [Aspose::Font::CffDataProviders](../)
* Library [Aspose.Font for C++](../../)
