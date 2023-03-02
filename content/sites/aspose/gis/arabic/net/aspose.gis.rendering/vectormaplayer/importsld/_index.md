---
title: VectorMapLayer.ImportSld
second_title: Aspose.GIS لمرجع .NET API
description: VectorMapLayer طريقة. يستورد النمط من ملف واصف الطبقة الأنماط الموجود في المسار المحدد.
type: docs
weight: 60
url: /ar/net/aspose.gis.rendering/vectormaplayer/importsld/
---
## ImportSld(string, SldImportOptions) {#importsld_1}

يستورد النمط من ملف واصف الطبقة الأنماط الموجود في المسار المحدد.

```csharp
public void ImportSld(string path, SldImportOptions options = null)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| path | String | المسار إلى ملف Styled Layer Descriptor. |
| options | SldImportOptions | خيارات الاستيراد. |

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الحجة`null`. |
| XmlException | حدث خطأ أثناء تحليل XML. |
| FormatException | لم يتم العثور على نمط SLD في XML. |

### ملاحظات

هذه الطريقة تستبدل قيمة[`Symbolizer`](../symbolizer/) الملكية .

### أنظر أيضا

* class [SldImportOptions](../../../aspose.gis.rendering.sld/sldimportoptions/)
* class [VectorMapLayer](../)
* مساحة الاسم [Aspose.Gis.Rendering](../../vectormaplayer/)
* المجسم [Aspose.GIS](../../../)

---

## ImportSld(AbstractPath, SldImportOptions) {#importsld}

يستورد النمط من ملف واصف الطبقة الأنماط الموجود في المسار المحدد.

```csharp
public void ImportSld(AbstractPath path, SldImportOptions options = null)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| path | AbstractPath | المسار إلى ملف Styled Layer Descriptor. |
| options | SldImportOptions | خيارات الاستيراد. |

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الحجة`null`. |
| XmlException | حدث خطأ أثناء تحليل XML. |
| FormatException | لم يتم العثور على نمط SLD في XML. |

### ملاحظات

هذه الطريقة تستبدل قيمة[`Symbolizer`](../symbolizer/) الملكية .

### أنظر أيضا

* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [SldImportOptions](../../../aspose.gis.rendering.sld/sldimportoptions/)
* class [VectorMapLayer](../)
* مساحة الاسم [Aspose.Gis.Rendering](../../vectormaplayer/)
* المجسم [Aspose.GIS](../../../)


