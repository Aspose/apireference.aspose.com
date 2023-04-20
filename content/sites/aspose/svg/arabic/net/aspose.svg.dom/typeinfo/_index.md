---
title: Class TypeInfo
second_title: Aspose.SVG لمرجع .NET API
description: Aspose.Svg.Dom.TypeInfo فصل. يمثل TypeInfo نوعًا مشار إليه من عقد Element أو Attr المحدد في المخططات المرتبطة بالمستند.
type: docs
weight: 1280
url: /ar/net/aspose.svg.dom/typeinfo/
---
## TypeInfo class

يمثل TypeInfo نوعًا مشار إليه من عقد Element أو Attr المحدد في المخططات المرتبطة بالمستند.

```csharp
public class TypeInfo : DOMObject
```

## الخصائص

| اسم | وصف |
| --- | --- |
| [TypeName](../../aspose.svg.dom/typeinfo/typename/) { get; } | اسم نوع تم التصريح عنه للعنصر أو السمة المقترنة ، أو لاغٍ إذا كان غير معروف. |
| [TypeNamespace](../../aspose.svg.dom/typeinfo/typenamespace/) { get; } | يحصل على مساحة اسم النوع. مساحة الاسم من النوع المعلن عنها للعنصر أو السمة المرتبطة أو فارغة إذا لم يكن للعنصر إعلان أو إذا لم تتوفر معلومات مساحة الاسم. |

## طُرق

| اسم | وصف |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | تُستخدم هذه الطريقة لاسترداد كائن ECMAScriptType . |
| [IsDerivedFrom](../../aspose.svg.dom/typeinfo/isderivedfrom/)(string, string, ulong) | ترجع هذه الطريقة إذا كان هناك اشتقاق بين تعريف نوع المرجع ، أي TypeInfo الذي يتم من خلاله استدعاء الطريقة ، وتعريف النوع الآخر ، أي الذي تم تمريره كمعامل . |

## مجالات

| اسم | وصف |
| --- | --- |
| const [DERIVATION_EXTENSION](../../aspose.svg.dom/typeinfo/derivation_extension/) | إذا كان مخطط المستند عبارة عن مخطط XML [مخطط XML الجزء 1] ، فإن هذا الثابت يمثل الاشتقاق حسب الامتداد. |
| const [DERIVATION_LIST](../../aspose.svg.dom/typeinfo/derivation_list/) | إذا كان مخطط المستند عبارة عن مخطط XML [مخطط XML الجزء 1] ، فإن هذا الثابت يمثل القائمة. |
| const [DERIVATION_RESTRICTION](../../aspose.svg.dom/typeinfo/derivation_restriction/) | إذا كان مخطط المستند عبارة عن مخطط XML [مخطط XML الجزء 1] ، فإن هذا الثابت يمثل الاشتقاق عن طريق التقييد إذا كانت الأنواع المعقدة متضمنة ، أو تقييدًا إذا كانت الأنواع البسيطة متضمنة. |
| const [DERIVATION_UNION](../../aspose.svg.dom/typeinfo/derivation_union/) | إذا كان مخطط المستند عبارة عن مخطط XML [مخطط XML الجزء 1] ، فإن هذا الثابت يمثل الاتحاد إذا كانت الأنواع البسيطة متضمنة. |

### أنظر أيضا

* class [DOMObject](../domobject/)
* مساحة الاسم [Aspose.Svg.Dom](../../aspose.svg.dom/)
* المجسم [Aspose.SVG](../../)


