---
title: CustomDocumentPropertyCollection
second_title: Aspose.Cells لمرجع .NET API
description: مجموعة من خصائص المستند المخصصة.
type: docs
weight: 4830
url: /ar/net/aspose.cells.properties/customdocumentpropertycollection/
---
## CustomDocumentPropertyCollection class

مجموعة من خصائص المستند المخصصة.

```csharp
public class CustomDocumentPropertyCollection : DocumentPropertyCollection
```

## الخصائص

| اسم | وصف |
| --- | --- |
| [Count](../../aspose.cells.properties/documentpropertycollection/count) { get; } | الحصول على عدد العناصر في المجموعة. |
| [Item](../../aspose.cells.properties/documentpropertycollection/item) { get; } | إرجاع أ[`DocumentProperty`](../documentproperty)كائن بالفهرس . |
| virtual [Item](../../aspose.cells.properties/documentpropertycollection/item) { get; } | إرجاع أ[`DocumentProperty`](../documentproperty) الكائن باسم الخاصية . |

## طُرق

| اسم | وصف |
| --- | --- |
| [Add](../../aspose.cells.properties/customdocumentpropertycollection/add#add)(string, bool) | إنشاء خاصية مستند مخصصة جديدة لملف **نوع الملكية. منطقي** نوع البيانات . |
| [Add](../../aspose.cells.properties/customdocumentpropertycollection/add#add_3)(string, DateTime) | إنشاء خاصية مستند مخصصة جديدة لملف **PropertyType.DateTime** نوع البيانات . |
| [Add](../../aspose.cells.properties/customdocumentpropertycollection/add#add_1)(string, double) | إنشاء خاصية مستند مخصصة جديدة لملف **نوع الملكية** نوع البيانات . |
| [Add](../../aspose.cells.properties/customdocumentpropertycollection/add#add_2)(string, int) | إنشاء خاصية مستند مخصصة جديدة لملف **نوع الملكية** نوع البيانات . |
| [Add](../../aspose.cells.properties/customdocumentpropertycollection/add#add_4)(string, string) | إنشاء خاصية مستند مخصصة جديدة لملف **PropertyType.String** نوع البيانات . |
| [AddLinkToContent](../../aspose.cells.properties/customdocumentpropertycollection/addlinktocontent)(string, string) | إنشاء خاصية مستند مخصصة جديدة ترتبط بالمحتوى. |
| [Clear](../../aspose.cells.properties/documentpropertycollection/clear)() | يزيل كل الخصائص من المجموعة. |
| [Contains](../../aspose.cells.properties/documentpropertycollection/contains)(string) | إرجاع صحيح في حالة وجود خاصية بالاسم المحدد في المجموعة. |
| [GetEnumerator](../../aspose.cells.properties/documentpropertycollection/getenumerator)() |  |
| [IndexOf](../../aspose.cells.properties/documentpropertycollection/indexof)(string) | الحصول على فهرس الخاصية بالاسم . |
| [Remove](../../aspose.cells.properties/documentpropertycollection/remove)(string) | يزيل خاصية بالاسم المحدد من المجموعة. |
| [RemoveAt](../../aspose.cells.properties/documentpropertycollection/removeat)(int) | يزيل خاصية في الفهرس المحدد . |
| [UpdateLinkedPropertyValue](../../aspose.cells.properties/customdocumentpropertycollection/updatelinkedpropertyvalue)() | تحديث قيمة خاصية المستند المخصصة التي ترتبط بالمحتوى. |
| [UpdateLinkedRange](../../aspose.cells.properties/customdocumentpropertycollection/updatelinkedrange)() | تحديث قيمة خاصية المستند المخصصة إلى النطاق المرتبط . |

### ملاحظات

كل[`DocumentProperty`](../documentproperty) يمثل الكائن خاصية مخصصة لمستند حاوية.

### أمثلة

```csharp

[C#]

// إنشاء كائن مصنف
Workbook workbook = new Workbook("book1.xls");

// استرداد قائمة بجميع خصائص المستند المخصصة لملف Excel
CustomDocumentPropertyCollection customProperties = workbook.Worksheets.CustomDocumentProperties;

[VB.NET]

'إنشاء كائن مصنف
Dim workbook As New Workbook("book1.xls")

'استرجع قائمة بجميع خصائص المستند المخصصة لملف Excel
Dim customProperties As CustomDocumentPropertyCollection = workbook.Worksheets.CustomDocumentProperties

```

### أنظر أيضا

* class [DocumentPropertyCollection](../documentpropertycollection)
* مساحة الاسم [Aspose.Cells.Properties](../../aspose.cells.properties)
* المجسم [Aspose.Cells](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.dll -->
