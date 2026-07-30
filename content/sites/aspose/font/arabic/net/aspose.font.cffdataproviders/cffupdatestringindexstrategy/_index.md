---
title: "التعداد CffUpdateStringIndexStrategy"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "تعداد Aspose.Font.CffDataProviders.CffUpdateStringIndexStrategy. يحدد كيفية إضافة السلاسل إلى تخزين فهرس السلاسل CFF. عندما نحاول إضافة سلسلة إلى فهرس السلاسل CFF قد يحدث أن تكون هذه السلسلة موجودة بالفعل في الفهرس. باستخدام الخيار SearchForDuplicates يمكننا فرض البحث عبر فهرس السلاسل لاكتشاف ما إذا كانت هذه السلسلة موجودة بالفعل أم لا. هذا النهج يوفر مساحة في بنية فهرس السلاسل لكنه يتطلب وقتًا أطول لإضافة السلسلة."
type: docs
weight: 70
url: /ar/net/aspose.font.cffdataproviders/cffupdatestringindexstrategy/
---
## CffUpdateStringIndexStrategy enumeration

يحدد كيفية إضافة السلاسل إلى تخزين فهرس سلاسل CFF. عندما نحاول إضافة سلسلة ما إلى فهرس سلاسل CFF، قد يحدث أن تكون هذه السلسلة موجودة بالفعل في الفهرس. باستخدام الخيار SearchForDuplicates يمكننا إجبار البحث عبر الفهرس لاكتشاف ما إذا كانت هذه السلسلة موجودة بالفعل أم لا. هذا النهج يوفر مساحة في بنية فهرس السلاسل، لكنه يتطلب وقتًا أكبر لإضافة السلسلة.

```csharp
public enum CffUpdateStringIndexStrategy
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| SearchForDuplicates | `0` | يحدد أن البحث عن السلسلة التي سيتم إضافتها يجب أن يتم في بنية فهرس السلاسل لتجنب إضافة مكررات. |
| AddStringAsIs | `1` | يحدد أنه لا ينبغي إجراء أي فحص للمكررات عند إضافة سلسلة. هذا النهج يعمل بشكل أسرع، لكنه قد يؤدي إلى استخدام غير فعال للذاكرة في فهرس السلاسل. |

### انظر أيضاً

* namespace [Aspose.Font.CffDataProviders](../../aspose.font.cffdataproviders/)
* assembly [Aspose.Font](../../)


