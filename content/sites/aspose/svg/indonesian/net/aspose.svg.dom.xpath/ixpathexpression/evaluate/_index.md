---
title: IXPathExpression.Evaluate
second_title: Aspose.SVG untuk Referensi .NET API
description: IXPathExpression metode. Mengevaluasi ekspresi XPath ini dan mengembalikan hasilnya.
type: docs
weight: 10
url: /id/net/aspose.svg.dom.xpath/ixpathexpression/evaluate/
---
## IXPathExpression.Evaluate method

Mengevaluasi ekspresi XPath ini dan mengembalikan hasilnya.

```csharp
public IXPathResult Evaluate(Node contextNode, XPathResultType type, object result)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| contextNode | Node | Itu`konteks` adalah simpul konteks untuk evaluasi ekspresi XPath ini. Jika[`IXPathEvaluator`](../../ixpathevaluator/) diperoleh dengan pengecoran[`Document`](../../../aspose.svg.dom/document/) maka ini harus dimiliki oleh dokumen yang sama dan harus a[`Document`](../../../aspose.svg.dom/document/) ,[`Element`](../../../aspose.svg.dom/element/) ,[`Attr`](../../../aspose.svg.dom/attr/) , [`Text`](../../../aspose.svg.dom/text/) ,[`CDATASection`](../../../aspose.svg.dom/cdatasection/) ,[`Comment`](../../../aspose.svg.dom/comment/) ,[`ProcessingInstruction`](../../../aspose.svg.dom/processinginstruction/) , atauXPathNamespace simpul. Jika simpul konteks adalah a[`Text`](../../../aspose.svg.dom/text/) atau a[`CDATASection`](../../../aspose.svg.dom/cdatasection/), maka konteksnya diinterpretasikan sebagai seluruh node teks logis seperti yang terlihat oleh XPath, kecuali jika node tersebut kosong dalam hal ini mungkin tidak berfungsi sebagai konteks XPath. |
| type | XPathResultType | Jika spesifik`jenis` ditentukan, maka hasilnya akan dipaksa untuk mengembalikan tipe yang ditentukan dengan mengandalkan konversi XPath dan gagal jika pemaksaan yang diinginkan tidak memungkinkan. Ini harus menjadi salah satu nilai dari[`XPathResultType`](../../xpathresulttype/). |
| result | Object | Itu`hasil` menentukan objek hasil tertentu yang dapat digunakan kembali dan dikembalikan dengan metode ini. Jika ini ditentukan sebagai`batal`atau implementasi tidak menggunakan kembali hasil yang ditentukan, objek hasil baru akan dibuat dan dikembalikan. Untuk hasil XPath 1.0, objek ini akan bertipe [`IXPathResult`](../../ixpathresult/). |

### Nilai Pengembalian

Hasil evaluasi ekspresi XPath. Untuk hasil XPath 1.0, objek ini akan bertipe [`IXPathResult`](../../ixpathresult/).

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | TYPE_ERR: Dibesarkan jika hasilnya tidak dapat dikonversi untuk mengembalikan tipe yang ditentukan. |
| [DOMException](../../../aspose.svg.dom/domexception/) | WRONG_DOCUMENT_ERR: Node berasal dari dokumen yang tidak didukung oleh [`IXPathEvaluator`](../../ixpathevaluator/) yang menciptakan ini[`IXPathExpression`](../). |
| [DOMException](../../../aspose.svg.dom/domexception/) | NOT_SUPPORTED_ERR: Node bukan tipe yang diizinkan sebagai simpul konteks XPath atau tipe permintaan tidak diizinkan oleh ini[`IXPathExpression`](../). |

### Lihat juga

* interface [IXPathResult](../../ixpathresult/)
* class [Node](../../../aspose.svg.dom/node/)
* enum [XPathResultType](../../xpathresulttype/)
* interface [IXPathExpression](../)
* ruang nama [Aspose.Svg.Dom.XPath](../../ixpathexpression/)
* perakitan [Aspose.SVG](../../../)


