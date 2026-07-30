---
title: "فئة FileSystemStreamSource"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "فئة Aspose.Font.Sources.FileSystemStreamSource. تمثل مصدر تدفق يعتمد على نظام الملفات"
type: docs
weight: 720
url: /ar/net/aspose.font.sources/filesystemstreamsource/
---
## FileSystemStreamSource class

يمثل مصدر تدفق يعتمد على نظام الملفات.

```csharp
public class FileSystemStreamSource : StreamSource
```

## المنشئات

| الاسم | الوصف |
| --- | --- |
| [FileSystemStreamSource](filesystemstreamsource/)(string) | ينشئ كائنًا جديدًا من `FileSystemStreamSource`. |

## الخصائص

| الاسم | الوصف |
| --- | --- |
| [FileName](../../aspose.font.sources/filesystemstreamsource/filename/) { get; set; } | يحصل أو يضبط اسم الملف. |
| [Offset](../../aspose.font.sources/streamsource/offset/) { get; set; } | يحصل أو يضبط الإزاحة داخل المصدر. |

## الطرق

| الاسم | الوصف |
| --- | --- |
| override [Clone](../../aspose.font.sources/filesystemstreamsource/clone/)() | ينسخ كائن FileSystemStreamSource. |
| override [GetFontStream](../../aspose.font.sources/filesystemstreamsource/getfontstream/)() | يرجع تدفق ملف الخط. لا تنس إغلاق التدفق بعد الاستخدام. |
| virtual [MustCloseAfterUse](../../aspose.font.sources/streamsource/mustcloseafteruse/)() | قد يمنع الورثون إغلاق التدفق. يرجع true إذا كان مصدر التدفق يريد إغلاق التدفق بعد الاستخدام. وإلا يرجع false. |

### انظر أيضاً

* class [StreamSource](../streamsource/)
* namespace [Aspose.Font.Sources](../../aspose.font.sources/)
* assembly [Aspose.Font](../../)


