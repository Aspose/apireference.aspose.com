---
title: GmlOptions.SchemaLocation
second_title: Aspose.GIS لمرجع .NET API
description: GmlOptions ملكية. قائمة مفصولة بمسافة لأزواج URI. أول URI في كل زوج هو URI لمساحة الاسم  والثاني URI هو مسار إلى مخطط XML لمساحة الاسم . إذا تم التعيين علىnull وGmlDriver سيحاول قراءة schemaLocation من عنصر جذر المستند. الافتراضي هوnull .
type: docs
weight: 50
url: /ar/net/aspose.gis.formats.gml/gmloptions/schemalocation/
---
## GmlOptions.SchemaLocation property

قائمة مفصولة بمسافة لأزواج URI. أول URI في كل زوج هو URI لمساحة الاسم ، والثاني URI هو مسار إلى مخطط XML لمساحة الاسم . إذا تم التعيين على`null` و[`GmlDriver`](../../gmldriver/) سيحاول قراءة schemaLocation من عنصر جذر المستند. الافتراضي هو`null` .

```csharp
public string SchemaLocation { get; set; }
```

### ملاحظات

Aspose.GIS يستخدم مخطط XML لملف GML من أجل إنشائه[`FeatureAttributeCollection`](../../../aspose.gis/featureattributecollection/) بشكل افتراضي ، يتم استخراج موقع المخطط من سمة schemaLocation. إذا لم تكن هناك سمة من هذا القبيل أو كانت تشير إلى موقع غير صالح ، فإن Aspose.GIS سيفشل في قراءة ملف GML. في هذه الحالة - اضبط هذا الخيار ، بحيث يمكن لـ Aspose.GIS تحميل المخطط.

### أمثلة

"http://site.com/namespace http://site.com/schema.xsd"

### أنظر أيضا

* class [GmlOptions](../)
* مساحة الاسم [Aspose.Gis.Formats.Gml](../../gmloptions/)
* المجسم [Aspose.GIS](../../../)


