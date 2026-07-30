---
title: "TtfNameTable.UpdateName"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "طريقة TtfNameTable. تُحدّث الاسم في السجلات التي تتعلق بتوليفة المنصة المحددة من platformId و platformSpecificId وفئة nameId واللغة languageId"
type: docs
weight: 90
url: /ar/net/aspose.font.ttftables/ttfnametable/updatename/
---
## TtfNameTable.UpdateName method

يُحدّث الاسم في السجل (السجلات) المتعلقة بالمنصة المحددة (مزيج من platformId و platformSpecificId)، الفئة (nameId) واللغة (languageId).

```csharp
public void UpdateName(PlatformId platformId, ushort platformSpecificId, NameId nameId, 
    ushort languageId, string newName)
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| platformId | PlatformId | معرّف المنصة |
| platformSpecificId | UInt16 | معرّف الترميز الخاص بالمنصة |
| nameId | NameId | معرّف الاسم، فئة السلسلة المنطقية، المحددة بواسطة تعداد [`NameId`](../../ttfnametable.nameid/) |
| languageId | UInt16 | معرّف اللغة |
| newName | String | اسم جديد أو بيانات سلسلة جديدة |

### انظر أيضاً

* enum [PlatformId](../../ttfnametable.platformid/)
* enum [NameId](../../ttfnametable.nameid/)
* class [TtfNameTable](../)
* namespace [Aspose.Font.TtfTables](../../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../../)


