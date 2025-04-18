---
title: ToPdf
second_title: Справочник по API Aspose.Slides для .NET
description: ПреобразуетPresentationaspose.slides/presentationв PDF.
type: docs
weight: 20
url: /ru/net/aspose.slides.lowcode/convert/topdf/
---
## ToPdf(string, string) {#topdf_2}

Преобразует[`Presentation`](../../../aspose.slides/presentation)в PDF.

```csharp
public static void ToPdf(string presPath, string outPath)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| presPath | String | Путь входного представления |
| outPath | String | Выходной путь |

### Примеры

```csharp
Convert.ToPdf("pres.pptx", "pres.pdf");
```

### Смотрите также

* class [Convert](../../convert)
* пространство имен [Aspose.Slides.LowCode](../../convert)
* сборка [Aspose.Slides](../../../)

---

## ToPdf(string, string, IPdfOptions) {#topdf_3}

Преобразует[`Presentation`](../../../aspose.slides/presentation)в PDF.

```csharp
public static void ToPdf(string presPath, string outPath, IPdfOptions options)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| presPath | String | Путь входного представления |
| outPath | String | Выходной путь |
| options | IPdfOptions | Параметры вывода PDF |

### Примеры

```csharp
Convert.ToPdf("pres.pptx", "pres.pdf", new PdfOptions{ Compliance = PdfCompliance.PdfUa });
```

### Смотрите также

* interface [IPdfOptions](../../../aspose.slides.export/ipdfoptions)
* class [Convert](../../convert)
* пространство имен [Aspose.Slides.LowCode](../../convert)
* сборка [Aspose.Slides](../../../)

---

## ToPdf(Presentation, string) {#topdf}

Преобразует[`Presentation`](../../../aspose.slides/presentation)в PDF.

```csharp
public static void ToPdf(Presentation pres, string outPath)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| pres | Presentation | Входное представление |
| outPath | String | Выходной путь |

### Примеры

```csharp
using (Presentation pres = new Presentation("input.pptx"))    
{
    Convert.ToPdf(pres, "output.pdf");
} 
```

### Смотрите также

* class [Presentation](../../../aspose.slides/presentation)
* class [Convert](../../convert)
* пространство имен [Aspose.Slides.LowCode](../../convert)
* сборка [Aspose.Slides](../../../)

---

## ToPdf(Presentation, string, IPdfOptions) {#topdf_1}

Преобразует[`Presentation`](../../../aspose.slides/presentation)в PDF.

```csharp
public static void ToPdf(Presentation pres, string outPath, IPdfOptions options)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| pres | Presentation | Входное представление |
| outPath | String | Выходной путь |
| options | IPdfOptions | Параметры вывода PDF |

### Примеры

```csharp
using (Presentation pres = new Presentation("input.pptx"))    
{
    Convert.ToPdf(pres, "output.pdf", new PdfOptions{ Compliance = PdfCompliance.PdfUa });
} 
```

### Смотрите также

* class [Presentation](../../../aspose.slides/presentation)
* interface [IPdfOptions](../../../aspose.slides.export/ipdfoptions)
* class [Convert](../../convert)
* пространство имен [Aspose.Slides.LowCode](../../convert)
* сборка [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
