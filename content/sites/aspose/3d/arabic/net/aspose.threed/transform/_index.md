---
title: Transform
second_title: Aspose.3D لمرجع .NET API
description: يحتوي التحويل على معلومات تسمح بالوصول إلى ترجمة / مقياس / تدوير الكائن أو تحويل المصفوفة بأقل تكلفة يتم استخدام هذا بواسطة التحويل المحلي.
type: docs
weight: 2400
url: /ar/net/aspose.threed/transform/
---
## Transform class

يحتوي التحويل على معلومات تسمح بالوصول إلى ترجمة / مقياس / تدوير الكائن أو تحويل المصفوفة بأقل تكلفة يتم استخدام هذا بواسطة التحويل المحلي.

```csharp
public class Transform : A3DObject
```

## الخصائص

| اسم | وصف |
| --- | --- |
| [EulerAngles](../../aspose.threed/transform/eulerangles) { get; set; } | الحصول على أو تعيين الدوران المُمثل في زوايا أويلر ، المُقاسة بالدرجة |
| [GeometricRotation](../../aspose.threed/transform/geometricrotation) { get; set; } | الحصول على أو تعيين دوران أويلر الهندسي (يقاس بالدرجة). لا يؤثر التحويل الهندسي إلا على الكيانات المرفقة ويترك العقد الفرعية غير متأثرة . سيتم دمجه كتحول محلي عندما تقوم بتصدير التحويل الهندسي إلى أنواع الملفات التي لا تدعمه. |
| [GeometricScaling](../../aspose.threed/transform/geometricscaling) { get; set; } | الحصول على المقياس الهندسي أو تعيينه. لا يؤثر التحويل الهندسي إلا على الكيانات المرفقة ويترك العقد الفرعية غير متأثرة . سيتم دمجه كتحول محلي عندما تقوم بتصدير التحويل الهندسي إلى أنواع الملفات التي لا تدعمه. |
| [GeometricTranslation](../../aspose.threed/transform/geometrictranslation) { get; set; } | الحصول على الترجمة الهندسية أو تعيينها. لا يؤثر التحويل الهندسي إلا على الكيانات المرفقة ويترك العقد الفرعية غير متأثرة . سيتم دمجه كتحول محلي عندما تقوم بتصدير التحويل الهندسي إلى أنواع الملفات التي لا تدعمه. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | الحصول على الاسم أو تعيينه . |
| [PostRotation](../../aspose.threed/transform/postrotation) { get; set; } | الحصول على أو تعيين ما بعد الاستدارة الممثلة بالدرجة |
| [PreRotation](../../aspose.threed/transform/prerotation) { get; set; } | الحصول على أو تعيين التدوير المسبق الممثل بالدرجة |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | الحصول على مجموعة من كافة الخصائص . |
| [Rotation](../../aspose.threed/transform/rotation) { get; set; } | الحصول على أو تعيين الاستدارة الممثلة في المربع . |
| [Scale](../../aspose.threed/transform/scale) { get; set; } | الحصول على المقياس أو تعيينه |
| [TransformMatrix](../../aspose.threed/transform/transformmatrix) { get; set; } | الحصول على مصفوفة التحويل أو تعيينها. |
| [Translation](../../aspose.threed/transform/translation) { get; set; } | الحصول على أو تعيين الترجمة |

## طُرق

| اسم | وصف |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | البحث عن الخاصية. يمكن أن تكون خاصية ديناميكية (تم إنشاؤها بواسطة CreateDynamicProperty / SetProperty) أو خاصية أصلية (محددة باسمها) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | الحصول على قيمة الخاصية المحددة |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | يزيل خاصية ديناميكية . |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | إزالة الخاصية المحددة المحددة بالاسم |
| [SetEulerAngles](../../aspose.threed/transform/seteulerangles)(double, double, double) | يضبط زوايا أويلر بدرجات التحويل الحالي. |
| [SetGeometricRotation](../../aspose.threed/transform/setgeometricrotation)(double, double, double) | يضبط دوران أويلر الهندسي (يقاس بالدرجة). لا يؤثر التحويل الهندسي إلا على الكيانات المرفقة ويترك العقد الفرعية غير متأثرة . سيتم دمجه كتحول محلي عندما تقوم بتصدير التحويل الهندسي إلى أنواع الملفات التي لا تدعمه. |
| [SetGeometricScaling](../../aspose.threed/transform/setgeometricscaling)(double, double, double) | يضبط المقياس الهندسي. لا يؤثر التحويل الهندسي إلا على الكيانات المرفقة ويترك العقد الفرعية غير متأثرة . سيتم دمجه كتحول محلي عندما تقوم بتصدير التحويل الهندسي إلى أنواع الملفات التي لا تدعمه. |
| [SetGeometricTranslation](../../aspose.threed/transform/setgeometrictranslation)(double, double, double) | يحدد الترجمة الهندسية. لا يؤثر التحويل الهندسي إلا على الكيانات المرفقة ويترك العقد الفرعية غير متأثرة . سيتم دمجه كتحول محلي عندما تقوم بتصدير التحويل الهندسي إلى أنواع الملفات التي لا تدعمه. |
| [SetPostRotation](../../aspose.threed/transform/setpostrotation)(double, double, double) | يعين التدوير اللاحق الممثل بالدرجة |
| [SetPreRotation](../../aspose.threed/transform/setprerotation)(double, double, double) | يعين التدوير المسبق الممثل بالدرجة |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | يحدد قيمة الخاصية المحددة |
| [SetRotation](../../aspose.threed/transform/setrotation)(double, double, double, double) | يضبط الدوران (كمكونات رباعية) لتحويل التيار. |
| [SetScale](../../aspose.threed/transform/setscale)(double, double, double) | يحدد مقياس التحويل الحالي. |
| [SetTranslation](../../aspose.threed/transform/settranslation)(double, double, double) | يحدد ترجمة التحويل الحالي. |

### أنظر أيضا

* class [A3DObject](../a3dobject)
* مساحة الاسم [Aspose.ThreeD](../../aspose.threed)
* المجسم [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
