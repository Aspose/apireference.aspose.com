---
title: Node
second_title: Aspose.3D لمرجع .NET API
description: يمثل عنصرًا في الرسم البياني للمشهد . الرسم البياني للمشهد هو شجرة من كائنات العقدة. يتم تضمين خدمات إدارة الشجرة ذاتيًا في هذه الفئة. لاحظ أن Aspose.3D SDK لا تختبر صلاحية الرسم البياني للمشهد الذي تم إنشاؤه. تقع على عاتق المتصل مسؤولية التأكد من أنه لا يقوم بإنشاء رسوم بيانية دورية في تسلسل هرمي للعقدة . إلى جانب إدارة الشجرة  تحدد هذه الفئة جميع الخصائص المطلوبة لوصف موضع الكائن في المشهد. تتضمن هذه المعلومات الخصائص الأساسية للترجمة والدوران والقياس والخيارات الأكثر تقدمًا للمحاور والحدود وسمات مفاصل IK مثل الصلابة والتخميد . عند إنشائه لأول مرة  يكون كائن العقدة فارغًا أي يكون كائن بدون أي تمثيل رسومي يحتوي فقط على معلومات الموقع. في هذه الحالة  يمكن استخدامه لتمثيل الوالدين في بنية شجرة العقدة ولكن ليس أكثر من ذلك بكثير. الاستخدام العادي لهذا النوع من الكائنات هو إضافتهم كيانًا يتخصص في العقدة انظر الكيان . الكيان هو كائن في حد ذاته ومتصل بالعقدة. هذا يعني أيضًا أنه يمكن مشاركة نفس الكيان بين عقد متعددة. الكاميرا  الضوء  الشبكة  إلخ ... كلها كيانات وكلها مشتقة من كيان الفئة الأساسية.
type: docs
weight: 1470
url: /ar/net/aspose.threed/node/
---
## Node class

يمثل عنصرًا في الرسم البياني للمشهد . الرسم البياني للمشهد هو شجرة من كائنات العقدة. يتم تضمين خدمات إدارة الشجرة ذاتيًا في هذه الفئة. لاحظ أن Aspose.3D SDK لا تختبر صلاحية الرسم البياني للمشهد الذي تم إنشاؤه. تقع على عاتق المتصل مسؤولية التأكد من أنه لا يقوم بإنشاء رسوم بيانية دورية في تسلسل هرمي للعقدة . إلى جانب إدارة الشجرة ، تحدد هذه الفئة جميع الخصائص المطلوبة لوصف موضع الكائن في المشهد. تتضمن هذه المعلومات الخصائص الأساسية للترجمة والدوران والقياس والخيارات الأكثر تقدمًا للمحاور والحدود وسمات مفاصل IK مثل الصلابة والتخميد . عند إنشائه لأول مرة ، يكون كائن العقدة "فارغًا" (أي: يكون كائن بدون أي تمثيل رسومي يحتوي فقط على معلومات الموقع). في هذه الحالة ، يمكن استخدامه لتمثيل الوالدين في بنية شجرة العقدة ولكن ليس أكثر من ذلك بكثير. الاستخدام العادي لهذا النوع من الكائنات هو إضافتهم كيانًا يتخصص في العقدة (انظر "الكيان") . الكيان هو كائن في حد ذاته ومتصل بالعقدة. هذا يعني أيضًا أنه يمكن مشاركة نفس الكيان بين عقد متعددة. الكاميرا ، الضوء ، الشبكة ، إلخ ... كلها كيانات وكلها مشتقة من كيان الفئة الأساسية.

```csharp
public class Node : SceneObject
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [Node](node#constructor)() | يقوم بتهيئة مثيل جديد لملف[`Node`](../node) فئة . |
| [Node](node#constructor_1)(string) | يقوم بتهيئة مثيل جديد لملف[`Node`](../node) فئة . |
| [Node](node#constructor_2)(string, Entity) | يقوم بتهيئة مثيل جديد لملف[`Node`](../node) فئة . |

## الخصائص

| اسم | وصف |
| --- | --- |
| [AssetInfo](../../aspose.threed/node/assetinfo) { get; set; } | معلومات الأصول لكل عقدة |
| [ChildNodes](../../aspose.threed/node/childnodes) { get; } | يحصل على العقد الفرعية . |
| [Entities](../../aspose.threed/node/entities) { get; } | يحصل على جميع كيانات العقدة . |
| [Entity](../../aspose.threed/node/entity) { get; set; } | الحصول على الكيان الأول المرفق بهذه العقدة أو تعيينه ، إذا تم تعيينه ، سيمسح الكيانات الأخرى. |
| [Excluded](../../aspose.threed/node/excluded) { get; set; } | الحصول على أو تعيين ما إذا كان سيتم استبعاد هذه العقدة وجميع العقد / الكيانات التابعة أثناء التصدير. |
| [GlobalTransform](../../aspose.threed/node/globaltransform) { get; } | يحصل على التحويل العالمي . |
| [Material](../../aspose.threed/node/material) { get; set; } | الحصول على أو تعيين المادة الأولى المرتبطة بهذه العقدة ، إذا تم تعيينها ، فسيؤدي ذلك إلى مسح المواد الأخرى |
| [Materials](../../aspose.threed/node/materials) { get; } | يحصل على المواد المرتبطة بهذه العقدة. |
| [MetaDatas](../../aspose.threed/node/metadatas) { get; } | يحصل على البيانات الوصفية المحددة في هذه العقدة. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | الحصول على الاسم أو تعيينه . |
| [ParentNode](../../aspose.threed/node/parentnode) { get; set; } | الحصول على العقدة الأصلية أو تعيينها. |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | الحصول على مجموعة من كافة الخصائص . |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | يحصل على المشهد الذي ينتمي إليه هذا الكائن |
| [Transform](../../aspose.threed/node/transform) { get; } | يحصل على التحويل المحلي . |
| [Visible](../../aspose.threed/node/visible) { get; set; } | يحصل أو يحدد لإظهار العقدة |

## طُرق

| اسم | وصف |
| --- | --- |
| [Accept](../../aspose.threed/node/accept)(NodeVisitor) | يمشي عبر جميع العقد التابعة (بما في ذلك العقدة الحالية) ويتصل بالزائر بالعقدة. |
| [AddChildNode](../../aspose.threed/node/addchildnode)(Node) | أضف عقدة فرعية إلى هذه العقدة |
| [AddEntity](../../aspose.threed/node/addentity)(Entity) | أضف كيانًا إلى العقدة . |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode)() | إنشاء عقدة فرعية |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_1)(Entity) | إنشاء عقدة فرعية جديدة مرفقة بكيان معين |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_2)(string) | إنشاء عقدة فرعية جديدة باسم العقدة المحددة |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_3)(string, Entity) | إنشاء عقدة فرعية جديدة باسم العقدة المحددة |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_4)(string, Entity, Material) | إنشاء عقدة فرعية جديدة باسم العقدة المحددة ، وإرفاق كيان محدد و material |
| [EvaluateGlobalTransform](../../aspose.threed/node/evaluateglobaltransform)(bool) | قم بتقييم التحويل العالمي ، قم بتضمين التحويل الهندسي أم لا. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | البحث عن الخاصية. يمكن أن تكون خاصية ديناميكية (تم إنشاؤها بواسطة CreateDynamicProperty / SetProperty) أو خاصية أصلية (محددة باسمها) |
| [GetBoundingBox](../../aspose.threed/node/getboundingbox)() | احسب المربع المحيط للعقدة |
| [GetChild](../../aspose.threed/node/getchild#getchild)(int) | الحصول على العقدة الفرعية في الفهرس المحدد . |
| [GetChild](../../aspose.threed/node/getchild#getchild_1)(string) | الحصول على العقدة الفرعية بالاسم المحدد |
| [GetEntity&lt;T&gt;](../../aspose.threed/node/getentity)() |  |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | الحصول على قيمة الخاصية المحددة |
| [Merge](../../aspose.threed/node/merge)(Node) | افصل كل شيء تحت العقدة وأرفقها بالعقدة الحالية. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | يزيل خاصية ديناميكية . |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | إزالة الخاصية المحددة المحددة بالاسم |
| [SelectObjects](../../aspose.threed/node/selectobjects)(string) | حدد كائنات متعددة ضمن العقدة الحالية باستخدام صيغة استعلام تشبه XPath. |
| [SelectSingleObject](../../aspose.threed/node/selectsingleobject)(string) | حدد كائنًا واحدًا ضمن العقدة الحالية باستخدام صيغة استعلام تشبه XPath. |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | يحدد قيمة الخاصية المحددة |
| override [ToString](../../aspose.threed/node/tostring)() | يحصل على تمثيل السلسلة لهذه العقدة. |

### أنظر أيضا

* class [SceneObject](../sceneobject)
* مساحة الاسم [Aspose.ThreeD](../../aspose.threed)
* المجسم [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
