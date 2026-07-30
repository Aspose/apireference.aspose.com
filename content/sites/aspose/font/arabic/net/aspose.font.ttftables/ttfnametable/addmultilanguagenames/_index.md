---
title: "TtfNameTable.AddMultiLanguageNames"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "طريقة TtfNameTable. تستخرج جميع السلاسل المتعددة اللغات من كائن mlNames الممرر وتُنشئ هيكل NameRecord المقابل لكل سلسلة مستخرجة باستخدام المعلمات الممررة platformId و platformSpecificId و nameId. يتم استخراج قيمة الحقل languageID من كائن mlNames. يُضاف السجل الجديد الذي تم إنشاؤه للتو إلى الجدول. إذا تم العثور على سجل يتطابق مع السجل الذي تم إنشاؤه حديثًا حسب الحقول platformID و platformSpecificID و nameID و langugeId، فلن يُضاف السجل الجديد وسيتم تحديث بيانات السلسلة فقط للسجل الموجود"
type: docs
weight: 10
url: /ar/net/aspose.font.ttftables/ttfnametable/addmultilanguagenames/
---
## TtfNameTable.AddMultiLanguageNames method

يستخرج جميع السلاسل متعددة اللغات من كائن *mlNames* المُمرَّر ويُنشئ بنية NameRecord المقابلة لكل سلسلة مستخرجة باستخدام المعلمات المُمرَّرة *platformId* و *platformSpecificId* و *nameId*. تُستخرج قيمة الحقل languageID من كائن *mlNames*. يُضاف السجل الجديد الذي تم إنشاؤه للتو إلى الجدول. إذا تم العثور على سجل يتطابق مع السجل الذي تم إنشاؤه للتو بحسب الحقول platformID و platformSpecificID و nameID و languageId، فلن يُضاف السجل الجديد وسيتم تحديث بيانات السلسلة فقط للسجل الموجود.

```csharp
public void AddMultiLanguageNames(MultiLanguageString mlNames, PlatformId platformId, 
    ushort platformSpecificId, NameId nameId)
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| mlNames | MultiLanguageString | سلسلة متعددة اللغات |
| platformId | PlatformId | معرّف المنصة |
| platformSpecificId | UInt16 | معرّف الترميز الخاص بالمنصة |
| nameId | NameId | معرّف الاسم، فئة السلسلة المنطقية، المحددة بواسطة تعداد [`NameId`](../../ttfnametable.nameid/) |

### انظر أيضاً

* class [MultiLanguageString](../../../aspose.font/multilanguagestring/)
* enum [PlatformId](../../ttfnametable.platformid/)
* enum [NameId](../../ttfnametable.nameid/)
* class [TtfNameTable](../)
* namespace [Aspose.Font.TtfTables](../../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../../)


