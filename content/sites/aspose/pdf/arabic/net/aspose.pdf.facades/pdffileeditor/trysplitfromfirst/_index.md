---
title: TrySplitFromFirst
second_title: Aspose.PDF لمرجع .NET API
description: تقسيم ملف Pdf من الصفحة الأولى إلى الموقع المحدد  ويحفظ الجزء الأمامي كملف جديد.
type: docs
weight: 490
url: /ar/net/aspose.pdf.facades/pdffileeditor/trysplitfromfirst/
---
## TrySplitFromFirst(string, int, string) {#trysplitfromfirst_2}

تقسيم ملف Pdf من الصفحة الأولى إلى الموقع المحدد ، ويحفظ الجزء الأمامي كملف جديد.

```csharp
public bool TrySplitFromFirst(string inputFile, int location, string outputFile)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| inputFile | String | ملف PDF المصدر. |
| location | Int32 | نقطة الانقسام. |
| outputFile | String | إخراج ملف PDF. |

### قيمة الإرجاع

صحيح للنجاح أو خطأ.

### ملاحظات

تشبه طريقة TrySplitFromFirst طريقة SplitFromFirst ، باستثناء أن طريقة TrySplitFromFirst لا تطرح استثناءً إذا فشلت العملية.

### أمثلة

```csharp
PdfFileEditor pfe = new PdfFileEditor();
bool result = pfe.TrySplitFromFirst("input.pdf", 5, "out.pdf");
```

### أنظر أيضا

* class [PdfFileEditor](../../pdffileeditor)
* مساحة الاسم [Aspose.Pdf.Facades](../../pdffileeditor)
* المجسم [Aspose.PDF](../../../)

---

## TrySplitFromFirst(Stream, int, Stream) {#trysplitfromfirst}

ينقسم من البداية إلى الموقع المحدد ، ويحفظ الجزء الأمامي في تيار الإخراج.

```csharp
public bool TrySplitFromFirst(Stream inputStream, int location, Stream outputStream)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| inputStream | Stream | مصدر ملف Pdf دفق. |
| location | Int32 | نقطة الانقسام. |
| outputStream | Stream | إخراج ملف دفق. |

### قيمة الإرجاع

صحيح للنجاح أو خطأ.

### ملاحظات

لم يتم إغلاق التدفقات بعد هذه العملية . طريقة TrySplitFromFirst تشبه طريقة SplitFromFirst ، باستثناء أن طريقة TrySplitFromFirst لا تطرح استثناءً إذا فشلت العملية .

### أمثلة

```csharp
PdfFileEditor pfe = new PdfFileEditor();
Stream sourceStream = new FileStream("file1.pdf", FileMode.Open, FileAccess.Read);
Stream outStream = new FileStream("out.pdf", FileMode.Create, FileAccess.Write);
pfe.TrySplitFromFirst(sourceStream, 5, outStream);
```

### أنظر أيضا

* class [PdfFileEditor](../../pdffileeditor)
* مساحة الاسم [Aspose.Pdf.Facades](../../pdffileeditor)
* المجسم [Aspose.PDF](../../../)

---

## TrySplitFromFirst(string, int, HttpResponse) {#trysplitfromfirst_3}

يقسم المستند من الصفحة الأولى إلى الموقع ويحفظ النتيجة في كائنات HttpResponse.

```csharp
public bool TrySplitFromFirst(string inputFile, int location, HttpResponse response)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| inputFile | String | اسم الملف المصدر. |
| location | Int32 | نقطة الانقسام. |
| response | HttpResponse | كائنات HttpResponse. |

### قيمة الإرجاع

صحيح إذا اكتملت العملية بنجاح خلاف ذلك ، خطأ.

### ملاحظات

طريقة TrySplitFromFirst مثل طريقة SplitFromFirst ، باستثناء أن طريقة TrySplitFromFirst لا تطرح استثناءً إذا فشلت العملية.

### أنظر أيضا

* class [PdfFileEditor](../../pdffileeditor)
* مساحة الاسم [Aspose.Pdf.Facades](../../pdffileeditor)
* المجسم [Aspose.PDF](../../../)

---

## TrySplitFromFirst(Stream, int, HttpResponse) {#trysplitfromfirst_1}

يقسم المستند من البداية إلى الموقع المحدد ويخزن النتيجة في كائن HttpResponse .

```csharp
public bool TrySplitFromFirst(Stream inputStream, int location, HttpResponse response)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| inputStream | Stream | دفق المستند المصدر. |
| location | Int32 | نقطة الانقسام. |
| response | HttpResponse | كائن HttpResponse حيث سيتم تخزين النتيجة. |

### قيمة الإرجاع

صحيح إذا اكتملت العملية بنجاح خلاف ذلك ، خطأ.

### ملاحظات

طريقة TrySplitFromFirst مثل طريقة SplitFromFirst ، باستثناء أن طريقة TrySplitFromFirst لا تطرح استثناءً إذا فشلت العملية.

### أنظر أيضا

* class [PdfFileEditor](../../pdffileeditor)
* مساحة الاسم [Aspose.Pdf.Facades](../../pdffileeditor)
* المجسم [Aspose.PDF](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.PDF.dll -->
