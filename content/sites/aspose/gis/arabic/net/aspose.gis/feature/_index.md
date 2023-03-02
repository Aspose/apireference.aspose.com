---
title: Class Feature
second_title: Aspose.GIS لمرجع .NET API
description: Aspose.Gis.Feature فصل. ميزة جغرافية تتكون من سمات هندسية ومعرفة من قبل المستخدم.
type: docs
weight: 130
url: /ar/net/aspose.gis/feature/
---
## Feature class

ميزة جغرافية تتكون من سمات هندسية ومعرفة من قبل المستخدم.

```csharp
public class Feature
```

## الخصائص

| اسم | وصف |
| --- | --- |
| [Geometry](../../aspose.gis/feature/geometry/) { get; set; } | الحصول على هندسة الميزة أو تعيينها . لا يمكن ذلك`null` ، يستخدم[`Null`](../../aspose.gis.geometries/geometry/null/) للإشارة إلى الهندسة المفقودة. |

## طُرق

| اسم | وصف |
| --- | --- |
| [CopyValues](../../aspose.gis/feature/copyvalues/)(Feature) | ينسخ قيم السمات من ميزة أخرى . |
| [GetValue](../../aspose.gis/feature/getvalue/#getvalue)(string) | الحصول على قيمة سمة . |
| [GetValue&lt;T&gt;](../../aspose.gis/feature/getvalue/#getvalue_1)(string) | الحصول على قيمة سمة . |
| [GetValueOrDefault](../../aspose.gis/feature/getvalueordefault/#getvalueordefault)(string, object) | يحصل على قيمة سمة ، أو[`DefaultValue`](../featureattribute/defaultvalue/) إذا كانت القيمة غير محددة أو`باطل` . |
| [GetValueOrDefault&lt;T&gt;](../../aspose.gis/feature/getvalueordefault/#getvalueordefault_1)(string) | يحصل على قيمة سمة ، أو[`DefaultValue`](../featureattribute/defaultvalue/) إذا كانت القيمة غير محددة أو`باطل` . |
| [GetValueOrDefault&lt;T&gt;](../../aspose.gis/feature/getvalueordefault/#getvalueordefault_2)(string, object) | يحصل على قيمة سمة ، أو[`DefaultValue`](../featureattribute/defaultvalue/) إذا كانت القيمة غير محددة أو`باطل` . |
| [GetValues](../../aspose.gis/feature/getvalues/)(object[], object) | إرجاع قيم كافة السمات في مصفوفة. |
| [GetValuesDump](../../aspose.gis/feature/getvaluesdump/)(object) | إرجاع قيم كافة السمات في مصفوفة. ضع في اعتبارك استخدام[`GetValues`](./getvalues/) طريقة لتجنب تخصيص الذاكرة الإضافية. |
| [GetValuesList&lt;T&gt;](../../aspose.gis/feature/getvalueslist/)(string, string) | الحصول على قيم تسلسل السمات كقائمة. |
| [IsValueNull](../../aspose.gis/feature/isvaluenull/)(string) | تحديد ما إذا تم تعيين السمة المحددة بشكل صريح على`باطل` القيمة . |
| [IsValueSet](../../aspose.gis/feature/isvalueset/)(string) | للتحقق مما إذا تم تعيين قيمة السمة في هذه الميزة. |
| [SetValue&lt;T&gt;](../../aspose.gis/feature/setvalue/)(string, T) | يعين قيمة جديدة للسمة . |
| [SetValueNull](../../aspose.gis/feature/setvaluenull/)(string) | لتعيين قيمة السمة إلى`باطل` . |
| [SetValues](../../aspose.gis/feature/setvalues/)(object[]) | تعيين قيم جديدة لجميع السمات. ضع في اعتبارك أيضًا استخدام[`CopyValues`](./copyvalues/) طريقة لتبسيط قيم الإعداد في مكالمة واحدة. |
| [UnsetValue](../../aspose.gis/feature/unsetvalue/)(string) | يزيل قيمة السمة من هذه الميزة . |

### أنظر أيضا

* مساحة الاسم [Aspose.Gis](../../aspose.gis/)
* المجسم [Aspose.GIS](../../)


