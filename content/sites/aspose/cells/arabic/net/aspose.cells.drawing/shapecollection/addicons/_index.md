---
title: AddIcons
second_title: Aspose.Cells لمرجع .NET API
description: يضيف صورة svg .
type: docs
weight: 120
url: /ar/net/aspose.cells.drawing/shapecollection/addicons/
---
## ShapeCollection.AddIcons method

يضيف صورة svg .

```csharp
public Picture AddIcons(int upperLeftRow, int top, int upperLeftColumn, int left, int height, 
    int width, byte[] imageByteData, byte[] compatibleImageData)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| upperLeftRow | Int32 | فهرس الصف العلوي الأيسر. |
| top | Int32 | يمثل الإزاحة الرأسية للشكل من صفه الأيسر ، بوحدة بكسل. |
| upperLeftColumn | Int32 | فهرس العمود الأيسر العلوي. |
| left | Int32 | الإزاحة الأفقية للشكل من عمودها الأيسر ، بوحدة البكسل. |
| height | Int32 | ارتفاع الشكل بوحدة البكسل. |
| width | Int32 | عرض الشكل بوحدة البكسل. |
| imageByteData | Byte[] | بيانات بايت الصورة. |
| compatibleImageData | Byte[] | بيانات الصورة المحولة من svg لكي تكون متوافقة مع Excel 2016 أو الإصدارات الأقل. |

### أمثلة

```csharp

[C#]
// إضافة أيقونة
using (FileStream fs = new FileStream("icon.svg", FileMode.Open))
{
    int len = (int)fs.Length;
    byte[] imageData = new byte[len];
    fs.Read(imageData, 0, len);
    Picture picture = shapes.AddSvg(4, 0, 5, 0, -1, -1, imageData, null);
}
```

### أنظر أيضا

* class [Picture](../../picture)
* class [ShapeCollection](../../shapecollection)
* مساحة الاسم [Aspose.Cells.Drawing](../../shapecollection)
* المجسم [Aspose.Cells](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.dll -->
