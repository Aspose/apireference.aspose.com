---
title: "License.SetLicense"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "طريقة License. تقوم بترخيص المكوّن."
type: docs
weight: 20
url: /ar/net/aspose.font/license/setlicense/
---
## SetLicense(string) {#setlicense_1}

يرخص المكوّن.

```csharp
public void SetLicense(string licenseName)
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| licenseName | String | يمكن أن يكون اسم ملف كامل أو مختصر أو اسم مورد مدمج. استخدم سلسلة فارغة للتبديل إلى وضع التقييم. |

## ملاحظات

يحاول العثور على الترخيص في المواقع التالية:

1. مسار صريح.

2. المجلد الذي يحتوي على تجميع مكوّن Aspose.

3. المجلد الذي يحتوي على تجميع استدعاء العميل.

4. المجلد الذي يحتوي على تجميع الدخول (بدء التشغيل).

5. مورد مدمج في تجميع استدعاء العميل.

**Note:**On the .NET Compact Framework, tries to find the license only in these locations:

1. مسار صريح.

2. مورد مدمج في تجميع استدعاء العميل.

2. المجلد الذي يحتوي على ملف JAR لمكوّن Aspose.

3. المجلد الذي يحتوي على ملف JAR لاستدعاء العميل.

### انظر أيضاً

* class [License](../)
* namespace [Aspose.Font](../../../aspose.font/)
* assembly [Aspose.Font](../../../)

---

## SetLicense(Stream) {#setlicense}

يرخص المكوّن.

```csharp
public void SetLicense(Stream stream)
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| دفق | دفق | دفق يحتوي على الترخيص. |

## ملاحظات

استخدم هذه الطريقة لتحميل الترخيص من دفق.

### انظر أيضاً

* class [License](../)
* namespace [Aspose.Font](../../../aspose.font/)
* assembly [Aspose.Font](../../../)


