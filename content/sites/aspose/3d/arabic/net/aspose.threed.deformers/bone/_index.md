---
title: Bone
second_title: Aspose.3D لمرجع .NET API
description: تحدد العظم المجموعة الفرعية لنقطة التحكم في الهندسة  ووزن المزج المحدد لكل نقطة تحكم.Bone./bone لا يمكن استخدام الكائن مباشرة  أSkinDeformer./skindeformer المثال يستخدم لتشويه الهندسة  وSkinDeformer./skindeformerيأتي مع مجموعة من العظام  كل عظم مرتبط بالعقدة . ملاحظة يمكن تقييد نقطة التحكم في الهندسة بأكثر من عظمة.
type: docs
weight: 180
url: /ar/net/aspose.threed.deformers/bone/
---
## Bone class

تحدد العظم المجموعة الفرعية لنقطة التحكم في الهندسة ، ووزن المزج المحدد لكل نقطة تحكم.[`Bone`](../bone) لا يمكن استخدام الكائن مباشرة ، أ[`SkinDeformer`](../skindeformer) المثال يستخدم لتشويه الهندسة ، و[`SkinDeformer`](../skindeformer)يأتي مع مجموعة من العظام ، كل عظم مرتبط بالعقدة . ملاحظة: يمكن تقييد نقطة التحكم في الهندسة بأكثر من عظمة.

```csharp
public class Bone : A3DObject
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [Bone](bone#constructor)() | يقوم بتهيئة مثيل جديد لملف[`Bone`](../bone) فئة . |
| [Bone](bone#constructor_1)(string) | يقوم بتهيئة مثيل جديد لملف[`Bone`](../bone) فئة . |

## الخصائص

| اسم | وصف |
| --- | --- |
| [BoneTransform](../../aspose.threed.deformers/bone/bonetransform) { get; set; } | الحصول على أو تعيين مصفوفة تحويل العظم. |
| [Item](../../aspose.threed.deformers/bone/item) { get; set; } |  |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | الحصول على الاسم أو تعيينه . |
| [Node](../../aspose.threed.deformers/bone/node) { get; set; } | الحصول على العقدة أو تعيينها. العقدة العظمية هي العظم الذي يتصل به الجلد[`SkinDeformer`](../skindeformer) سيستخدم العقدة العظمية للتأثير على إزاحة نقاط التحكم[`Skeleton`](../../aspose.threed.entities/skeleton)مرفق ، ولكنه ليس مطلوبًا . مرفق[`Skeleton`](../../aspose.threed.entities/skeleton) عادةً ما يستخدم بواسطة برنامج DCC لإظهار الهيكل العظمي للمستخدم. |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | الحصول على مجموعة من كافة الخصائص . |
| [Transform](../../aspose.threed.deformers/bone/transform) { get; set; } | الحصول على أو تعيين مصفوفة التحويل للعقدة التي تحتوي على العظم. |
| [WeightCount](../../aspose.threed.deformers/bone/weightcount) { get; } | الحصول على عدد الوزن ، يتم تمديده تلقائيًا بمقدار[`SetWeight`](./setweight) |

## طُرق

| اسم | وصف |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | البحث عن الخاصية. يمكن أن تكون خاصية ديناميكية (تم إنشاؤها بواسطة CreateDynamicProperty / SetProperty) أو خاصية أصلية (محددة باسمها) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | الحصول على قيمة الخاصية المحددة |
| [GetWeight](../../aspose.threed.deformers/bone/getweight)(int) | الحصول على الوزن لنقطة التحكم المحددة بواسطة index |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | يزيل خاصية ديناميكية . |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | إزالة الخاصية المحددة المحددة بالاسم |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | يحدد قيمة الخاصية المحددة |
| [SetWeight](../../aspose.threed.deformers/bone/setweight)(int, double) | يضبط الوزن لنقطة التحكم المحددة بواسطة index |

### أنظر أيضا

* class [A3DObject](../../aspose.threed/a3dobject)
* مساحة الاسم [Aspose.ThreeD.Deformers](../../aspose.threed.deformers)
* المجسم [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
