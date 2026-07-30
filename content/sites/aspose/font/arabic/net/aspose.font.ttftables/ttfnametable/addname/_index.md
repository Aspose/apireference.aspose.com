---
title: "TtfNameTable.AddName"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "طريقة TtfNameTable. تضيف مدخلاً إلى الجدول. فئة بيانات السلسلة التي ستُضاف محددة بواسطة معامل name"
type: docs
weight: 20
url: /ar/net/aspose.font.ttftables/ttfnametable/addname/
---
## TtfNameTable.AddName method

يضيف مدخلاً إلى الجدول. فئة بيانات السلسلة التي ستُضاف تُحدد بواسطة المعامل *name*.

```csharp
public void AddName(NameId nameId, PlatformId platformId, int platformSpecificId, int languageId, 
    string name)
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| nameId | NameId | معرّف الاسم، فئة السلسلة المنطقية، المحددة بواسطة تعداد [`NameId`](../../ttfnametable.nameid/) |
| platformId | PlatformId | معرّف المنصة |
| platformSpecificId | Int32 | معرّف الترميز الخاص بالمنصة. يرجى استخدام قيمة من أحد هذه التعدادات - [`UnicodePlatformSpecificId`](../../ttfnametable.unicodeplatformspecificid/), [`MacPlatformSpecificId`](../../ttfnametable.macplatformspecificid/), [`MSPlatformSpecificId`](../../ttfnametable.msplatformspecificid/). التعداد الذي يجب استخدامه يُحدّد حسب السياق (*platformId* parameter) |
| languageId | Int32 | معرّف اللغة. يرجى استخدام قيمة من تعداد [`MSLanguageId`](../../ttfnametable.mslanguageid/) أو [`MacLanguageId`](../../ttfnametable.maclanguageid/) حسب السياق، المحدد بواسطة معامل *platformId* |
| name | String | بيانات السلسلة الفعلية |

### انظر أيضاً

* enum [NameId](../../ttfnametable.nameid/)
* enum [PlatformId](../../ttfnametable.platformid/)
* class [TtfNameTable](../)
* namespace [Aspose.Font.TtfTables](../../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../../)


