---
title: Scene
second_title: Aspose.3D لمرجع .NET API
description: المشهد هو كائن من المستوى الأعلى يحتوي على العقد  والأشكال الهندسية  والمواد  والأنسجة  والرسوم المتحركة  والوضعيات  والمشاهد الفرعية  وما إلى ذلك. يمكن أن يحتوي المشهد على مشاهد فرعية  ويعمل كدعم متعدد المستندات في ملفات مثل collada / blender / fbx يمكن الوصول إلى التسلسل الهرمي للعقد من خلالRootNode./scene/rootnodeLibrary./scene/library تُستخدم للاحتفاظ بمرجع للكائنات غير المرتبطة أثناء التسلسل مثل البيانات الوصفية أو الكائنات المخصصة بحيث يمكن استخدامها كمكتبة.
type: docs
weight: 2250
url: /ar/net/aspose.threed/scene/
---
## Scene class

المشهد هو كائن من المستوى الأعلى يحتوي على العقد ، والأشكال الهندسية ، والمواد ، والأنسجة ، والرسوم المتحركة ، والوضعيات ، والمشاهد الفرعية ، وما إلى ذلك. يمكن أن يحتوي المشهد على مشاهد فرعية ، ويعمل كدعم متعدد المستندات في ملفات مثل collada / blender / fbx يمكن الوصول إلى التسلسل الهرمي للعقد من خلال[`RootNode`](./rootnode)[`Library`](./library) تُستخدم للاحتفاظ بمرجع للكائنات غير المرتبطة أثناء التسلسل (مثل البيانات الوصفية أو الكائنات المخصصة) بحيث يمكن استخدامها كمكتبة.

```csharp
public class Scene : SceneObject
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [Scene](scene#constructor)() | يقوم بتهيئة مثيل جديد لملف[`Scene`](../scene) فئة . |
| [Scene](scene#constructor_1)(Entity) | يقوم بتهيئة مثيل جديد لملف[`Scene`](../scene) فئة مع كيان مرتبط بعقدة جديدة. |
| [Scene](scene#constructor_2)(Scene, string) | يقوم بتهيئة مثيل جديد لملف[`Scene`](../scene)فئة كمشهد فرعي. |

## الخصائص

| اسم | وصف |
| --- | --- |
| [AnimationClips](../../aspose.threed/scene/animationclips) { get; } | يحصل على الكل[`AnimationClip`](../../aspose.threed.animation/animationclip) المحددة في المشهد. |
| [AssetInfo](../../aspose.threed/scene/assetinfo) { get; set; } | الحصول على أو تعيين معلومات الأصول ذات المستوى الأعلى |
| [CurrentAnimationClip](../../aspose.threed/scene/currentanimationclip) { get; set; } | يحصل أو يحدد الملف النشط[`AnimationClip`](../../aspose.threed.animation/animationclip) |
| [Library](../../aspose.threed/scene/library) { get; } | يمكن تعريف الكائنات التي لم يتم استخدامها بشكل مباشر في التسلسل الهرمي للمشهد في المكتبة. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | الحصول على الاسم أو تعيينه . |
| [Poses](../../aspose.threed/scene/poses) { get; } | يحصل على الكل[`Pose`](../pose) المستخدمة في هذا المشهد. |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | الحصول على مجموعة من كافة الخصائص . |
| [RootNode](../../aspose.threed/scene/rootnode) { get; } | يحصل على العقدة الجذرية للمشهد . |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | يحصل على المشهد الذي ينتمي إليه هذا الكائن |
| [SubScenes](../../aspose.threed/scene/subscenes) { get; } | يحصل على جميع المشاهد الفرعية |

## طُرق

| اسم | وصف |
| --- | --- |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile)(string) | يفتح المشهد من المسار المحدد |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile_3)(string, CancellationToken) | يفتح المشهد من المسار المحدد |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile_1)(string, FileFormat, CancellationToken) | يفتح المشهد من مسار معين باستخدام تنسيق ملف محدد. |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile_2)(string, LoadOptions, CancellationToken) | يفتح المشهد من مسار معين باستخدام تنسيق ملف محدد. |
| static [FromStream](../../aspose.threed/scene/fromstream#fromstream_2)(Stream, CancellationToken) | يفتح المشهد من تيار معين |
| static [FromStream](../../aspose.threed/scene/fromstream#fromstream)(Stream, FileFormat, CancellationToken) | يفتح المشهد من دفق معين باستخدام تنسيق ملف محدد. |
| static [FromStream](../../aspose.threed/scene/fromstream#fromstream_1)(Stream, LoadOptions, CancellationToken) | يفتح المشهد من دفق معين باستخدام تهيئة IO المحددة . |
| [Clear](../../aspose.threed/scene/clear)() | يمسح محتوى المشهد ويستعيد الإعدادات الافتراضية. |
| [CreateAnimationClip](../../aspose.threed/scene/createanimationclip)(string) | وظيفة اختصار لإنشاء ملف[`AnimationClip`](../../aspose.threed.animation/animationclip) الأول[`AnimationClip`](../../aspose.threed.animation/animationclip) سيتم تعيينه إلى[`CurrentAnimationClip`](./currentanimationclip) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | البحث عن الخاصية. يمكن أن تكون خاصية ديناميكية (تم إنشاؤها بواسطة CreateDynamicProperty / SetProperty) أو خاصية أصلية (محددة باسمها) |
| [GetAnimationClip](../../aspose.threed/scene/getanimationclip)(string) | يحصل على اسم[`AnimationClip`](../../aspose.threed.animation/animationclip) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | الحصول على قيمة الخاصية المحددة |
| [Open](../../aspose.threed/scene/open#open)(Stream) | يفتح المشهد من تيار معين |
| [Open](../../aspose.threed/scene/open#open_4)(string) | يفتح المشهد من المسار المحدد |
| [Open](../../aspose.threed/scene/open#open_3)(Stream, CancellationToken) | يفتح المشهد من تيار معين |
| [Open](../../aspose.threed/scene/open#open_8)(string, CancellationToken) | يفتح المشهد من المسار المحدد |
| [Open](../../aspose.threed/scene/open#open_6)(string, LoadOptions) | يفتح المشهد من مسار معين باستخدام تنسيق ملف محدد. |
| [Open](../../aspose.threed/scene/open#open_1)(Stream, FileFormat, CancellationToken) | يفتح المشهد من دفق معين باستخدام تنسيق ملف محدد. |
| [Open](../../aspose.threed/scene/open#open_2)(Stream, LoadOptions, CancellationToken) | يفتح المشهد من دفق معين باستخدام تهيئة IO المحددة . |
| [Open](../../aspose.threed/scene/open#open_5)(string, FileFormat, CancellationToken) | يفتح المشهد من مسار معين باستخدام تنسيق ملف محدد. |
| [Open](../../aspose.threed/scene/open#open_7)(string, LoadOptions, CancellationToken) | يفتح المشهد من مسار معين باستخدام تنسيق ملف محدد. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | يزيل خاصية ديناميكية . |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | إزالة الخاصية المحددة المحددة بالاسم |
| [Render](../../aspose.threed/scene/render#render)(Camera, Bitmap) | تحويل المشهد إلى صورة نقطية من منظور الكاميرا المحددة. |
| [Render](../../aspose.threed/scene/render#render_2)(Camera, string) | تحويل المشهد إلى ملف خارجي من منظور كاميرا معينة. حجم الإخراج الافتراضي هو 1024 × 768 وتنسيق الإخراج هو png |
| [Render](../../aspose.threed/scene/render#render_1)(Camera, Bitmap, ImageRenderOptions) | تحويل المشهد إلى صورة نقطية من منظور الكاميرا المحددة. |
| [Render](../../aspose.threed/scene/render#render_3)(Camera, string, Size, ImageFormat) | تحويل المشهد إلى ملف خارجي من منظور الكاميرا المحددة. |
| [Render](../../aspose.threed/scene/render#render_4)(Camera, string, Size, ImageFormat, ImageRenderOptions) | تحويل المشهد إلى ملف خارجي من منظور الكاميرا المحددة. |
| [Save](../../aspose.threed/scene/save#save_4)(string) | يحفظ المشهد إلى المسار المحدد باستخدام تنسيق الملف المحدد. |
| [Save](../../aspose.threed/scene/save#save)(Stream, FileFormat) | يحفظ المشهد للدفق باستخدام تنسيق ملف محدد. |
| [Save](../../aspose.threed/scene/save#save_2)(Stream, SaveOptions) | يحفظ المشهد للدفق باستخدام تنسيق ملف محدد. |
| [Save](../../aspose.threed/scene/save#save_5)(string, FileFormat) | يحفظ المشهد إلى المسار المحدد باستخدام تنسيق الملف المحدد. |
| [Save](../../aspose.threed/scene/save#save_7)(string, SaveOptions) | يحفظ المشهد إلى المسار المحدد باستخدام تنسيق الملف المحدد. |
| [Save](../../aspose.threed/scene/save#save_1)(Stream, FileFormat, CancellationToken) | يحفظ المشهد للدفق باستخدام تنسيق ملف محدد. |
| [Save](../../aspose.threed/scene/save#save_3)(Stream, SaveOptions, CancellationToken) | يحفظ المشهد للدفق باستخدام تنسيق ملف محدد. |
| [Save](../../aspose.threed/scene/save#save_6)(string, FileFormat, CancellationToken) | يحفظ المشهد إلى المسار المحدد باستخدام تنسيق الملف المحدد. |
| [Save](../../aspose.threed/scene/save#save_8)(string, SaveOptions, CancellationToken) | يحفظ المشهد إلى المسار المحدد باستخدام تنسيق الملف المحدد. |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | يحدد قيمة الخاصية المحددة |

### أنظر أيضا

* class [SceneObject](../sceneobject)
* مساحة الاسم [Aspose.ThreeD](../../aspose.threed)
* المجسم [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
