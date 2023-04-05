---
title: Class XmpMetadata
second_title: Aspose.Page لمرجع NET API
description: Aspose.Page.EPS.XMP.XmpMetadata فصل. يوفر الوصول إلى دفق بيانات تعريف XMP .
type: docs
weight: 190
url: /ar/net/aspose.page.eps.xmp/xmpmetadata/
---
## XmpMetadata class

يوفر الوصول إلى دفق بيانات تعريف XMP .

```csharp
public sealed class XmpMetadata : IDictionary<string, XmpValue>
```

## الخصائص

| اسم | وصف |
| --- | --- |
| [Count](../../aspose.page.eps.xmp/xmpmetadata/count/) { get; } | الحصول على عدد العناصر في المجموعة. |
| [IsFixedSize](../../aspose.page.eps.xmp/xmpmetadata/isfixedsize/) { get; } | للتحقق مما إذا كان حجم colleciton ثابتًا. |
| [IsReadOnly](../../aspose.page.eps.xmp/xmpmetadata/isreadonly/) { get; } | للتحقق مما إذا كانت المجموعة للقراءة فقط. |
| [IsSynchronized](../../aspose.page.eps.xmp/xmpmetadata/issynchronized/) { get; } | للتحقق مما إذا كانت المجموعة متزامنة. |
| [Item](../../aspose.page.eps.xmp/xmpmetadata/item/) { get; set; } | الحصول على البيانات أو تعيينها من البيانات الوصفية . |
| [Keys](../../aspose.page.eps.xmp/xmpmetadata/keys/) { get; } | الحصول على مجموعة من مفاتيح البيانات الوصفية. |
| [NamespaceManager](../../aspose.page.eps.xmp/xmpmetadata/namespacemanager/) { get; } | يحصل على مدير مساحة الاسم. |
| [SyncRoot](../../aspose.page.eps.xmp/xmpmetadata/syncroot/) { get; } | يحصل على كائن مزامنة المجموعة . |
| [Values](../../aspose.page.eps.xmp/xmpmetadata/values/) { get; } | الحصول على قيم في البيانات الوصفية . |

## طُرق

| اسم | وصف |
| --- | --- |
| [Add](../../aspose.page.eps.xmp/xmpmetadata/add/#add)(KeyValuePair&lt;string, XmpValue&gt;) | إضافة زوج بالمفتاح والقيمة إلى القاموس. |
| [Add](../../aspose.page.eps.xmp/xmpmetadata/add/#add_2)(string, object) | يضيف قيمة إلى البيانات الوصفية . |
| [Add](../../aspose.page.eps.xmp/xmpmetadata/add/#add_1)(string, XmpValue) | يضيف قيمة إلى البيانات الوصفية . |
| [AddArrayItem](../../aspose.page.eps.xmp/xmpmetadata/addarrayitem/#addarrayitem)(string, XmpValue) | إضافة قيمة إلى المصفوفة. ستتم إضافة القيمة في نهاية المصفوفة. |
| [AddArrayItem](../../aspose.page.eps.xmp/xmpmetadata/addarrayitem/#addarrayitem_1)(string, int, XmpValue) | إضافة قيمة إلى مصفوفة بواسطة فهرس محدد. |
| [AddNamedValue](../../aspose.page.eps.xmp/xmpmetadata/addnamedvalue/)(string, string, XmpValue) | يضيف قيمة مسماة إلى بنية . |
| [Clear](../../aspose.page.eps.xmp/xmpmetadata/clear/)() | مسح البيانات الوصفية . |
| [Contains](../../aspose.page.eps.xmp/xmpmetadata/contains/#contains)(KeyValuePair&lt;string, XmpValue&gt;) | الشيكات لا يتم تضمين زوج قيمة مفتاح محدد في القاموس. |
| [Contains](../../aspose.page.eps.xmp/xmpmetadata/contains/#contains_1)(string) | يتم تضمين مفتاح الشيكات في البيانات الوصفية. |
| [ContainsKey](../../aspose.page.eps.xmp/xmpmetadata/containskey/)(string) | يحدد هل يحتوي هذا القاموس على مفتاح محدد. |
| [CopyTo](../../aspose.page.eps.xmp/xmpmetadata/copyto/)(KeyValuePair&lt;string, XmpValue&gt;[], int) | ينسخ عناصر المجموعة في مصفوفة. |
| [GetEnumerator](../../aspose.page.eps.xmp/xmpmetadata/getenumerator/)() | إرجاع عداد القاموس. |
| [GetNamespaceUriByPrefix](../../aspose.page.eps.xmp/xmpmetadata/getnamespaceuribyprefix/)(string) | إرجاع مساحة الاسم URI بالبادئة. |
| [GetPrefixByNamespaceUri](../../aspose.page.eps.xmp/xmpmetadata/getprefixbynamespaceuri/)(string) | إرجاع البادئة بواسطة مساحة الاسم URI. |
| [RegisterNamespaceUri](../../aspose.page.eps.xmp/xmpmetadata/registernamespaceuri/#registernamespaceuri)(string, string) | مساحة اسم التسجيلات URI. |
| [RegisterNamespaceUri](../../aspose.page.eps.xmp/xmpmetadata/registernamespaceuri/#registernamespaceuri_1)(string, string, string) | مساحة اسم التسجيلات URI. |
| [Remove](../../aspose.page.eps.xmp/xmpmetadata/remove/#remove)(KeyValuePair&lt;string, XmpValue&gt;) | يزيل زوج المفتاح / القيمة من المجموعة. |
| [Remove](../../aspose.page.eps.xmp/xmpmetadata/remove/#remove_1)(string) | يزيل الإدخال من البيانات الوصفية. |
| [SetArrayItem](../../aspose.page.eps.xmp/xmpmetadata/setarrayitem/)(string, int, XmpValue) | يحدد القيمة في المصفوفة. سيتم استبدال القيمة السابقة بأخرى جديدة. |
| [SetNamedValue](../../aspose.page.eps.xmp/xmpmetadata/setnamedvalue/)(string, string, XmpValue) | تعيين القيمة المسماة في بنية. سيتم استبدال القيمة المسماة السابقة ، إذا كانت موجودة بالفعل ، بأخرى جديدة. |
| [TryGetValue](../../aspose.page.eps.xmp/xmpmetadata/trygetvalue/)(string, out XmpValue) | يحاول العثور على مفتاح في القاموس ويستعيد القيمة إذا تم العثور عليه. |

### أنظر أيضا

* class [XmpValue](../xmpvalue/)
* مساحة الاسم [Aspose.Page.EPS.XMP](../../aspose.page.eps.xmp/)
* المجسم [Aspose.Page](../../)


