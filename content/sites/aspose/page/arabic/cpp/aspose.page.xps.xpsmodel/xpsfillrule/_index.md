---
title: "Aspose::Page::XPS::XpsModel::XpsFillRule enum"
linktitle: "XpsFillRule"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::XpsModel::XpsFillRule enum. القيم الصالحة لخاصية FillRule لعنصر PathGeometry element''s في C++."
type: docs
weight: 4900
url: /ar/cpp/aspose.page.xps.xpsmodel/xpsfillrule/
---
## XpsFillRule enum


القيم الصالحة لخاصية FillRule لعنصر PathGeometry.

```cpp
enum class XpsFillRule
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| EvenOdd | 0 | تحدد هذه القاعدة “الداخلية” لنقطة على اللوحة عن طريق رسم شعاع من النقطة إلى اللانهاية في أي اتجاه وعدّ عدد القطاعات من الشكل المعطى التي يقطعها الشعاع. إذا كان هذا العدد فرديًا، تكون النقطة داخل الشكل؛ إذا كان زوجيًا، تكون النقطة خارجه. |
| NonZero | 1 | تحدد هذه القاعدة ما إذا كانت النقطة داخل الشكل على اللوحة عن طريق رسم شعاع من النقطة إلى ما لا نهاية في أي اتجاه ثم فحص الأماكن التي يقطع فيها جزء من الشكل الشعاع. بدءًا من عدٍّ يساوي صفر، أضف واحدًا كلما قطع جزء الشعاع من اليسار إلى اليمين واطرح واحدًا كلما قطع جزء المسار الشعاع من اليمين إلى اليسار. بعد عدّ التقاطعات، إذا كان الناتج صفرًا فإن النقطة خارج المسار؛ وإلا فهي داخل المسار. |

## انظر أيضًا

* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
