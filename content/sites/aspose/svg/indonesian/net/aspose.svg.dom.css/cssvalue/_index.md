---
title: Class CSSValue
second_title: Aspose.SVG untuk Referensi .NET API
description: Aspose.Svg.Dom.Css.CSSValue kelas. Merupakan nilai sederhana atau kompleks. Objek CSSValue hanya terjadi dalam konteks properti CSS.
type: docs
weight: 490
url: /id/net/aspose.svg.dom.css/cssvalue/
---
## CSSValue class

Merupakan nilai sederhana atau kompleks. Objek CSSValue hanya terjadi dalam konteks properti CSS.

```csharp
public abstract class CSSValue : DOMObject
```

## Properti

| Nama | Keterangan |
| --- | --- |
| abstract [CSSText](../../aspose.svg.dom.css/cssvalue/csstext/) { get; set; } | Representasi string dari nilai saat ini. |
| [CSSValueType](../../aspose.svg.dom.css/cssvalue/cssvaluetype/) { get; } | Kode yang menentukan jenis nilai. |

## Metode

| Nama | Keterangan |
| --- | --- |
| override [Equals](../../aspose.svg.dom.css/cssvalue/equals/)(object) | Menentukan apakah yang ditentukanObject sama dengan instance ini. |
| override [GetHashCode](../../aspose.svg.dom.css/cssvalue/gethashcode/)() | Mengembalikan kode hash untuk instance ini. |
| override [GetPlatformType](../../aspose.svg.dom.css/cssvalue/getplatformtype/)() | Metode ini digunakan untuk mengambil objek ECMAScriptType . |
| override [ToString](../../aspose.svg.dom.css/cssvalue/tostring/)() | Mengembalikan aString yang mewakili instance ini. |
| [operator ==](../../aspose.svg.dom.css/cssvalue/op_equality/) | Menerapkan operator ==. |
| [operator !=](../../aspose.svg.dom.css/cssvalue/op_inequality/) | Menerapkan operator !=. |

## Bidang

| Nama | Keterangan |
| --- | --- |
| const [CSS_CUSTOM](../../aspose.svg.dom.css/cssvalue/css_custom/) | Nilainya adalah nilai khusus. |
| const [CSS_INHERIT](../../aspose.svg.dom.css/cssvalue/css_inherit/) | Nilai diwariskan dan cssText berisi "mewarisi". |
| const [CSS_PRIMITIVE_VALUE](../../aspose.svg.dom.css/cssvalue/css_primitive_value/) | Nilai adalah nilai primitif dan turunan dari antarmuka CSSPrimitiveValue dapat diperoleh dengan menggunakan metode pengecoran khusus pengikatan pada turunan antarmuka CSSValue ini. |
| const [CSS_VALUE_LIST](../../aspose.svg.dom.css/cssvalue/css_value_list/) | Nilainya adalah daftar CSSValue dan instance antarmuka CSSValueList dapat diperoleh dengan menggunakan metode pengecoran khusus pengikatan pada instance antarmuka CSSValue ini. |

### Lihat juga

* class [DOMObject](../../aspose.svg.dom/domobject/)
* ruang nama [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* perakitan [Aspose.SVG](../../)


