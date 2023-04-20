---
title: IXPathEvaluator.Evaluate
second_title: Aspose.SVG untuk Referensi .NET API
description: IXPathEvaluator metode. Mengevaluasi string ekspresi XPath dan mengembalikan hasil dari tipe yang ditentukan jika memungkinkan.
type: docs
weight: 30
url: /id/net/aspose.svg.dom.xpath/ixpathevaluator/evaluate/
---
## IXPathEvaluator.Evaluate method

Mengevaluasi string ekspresi XPath dan mengembalikan hasil dari tipe yang ditentukan jika memungkinkan.

```csharp
public IXPathResult Evaluate(string expression, Node contextNode, IXPathNSResolver resolver, 
    XPathResultType type, object result)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| expression | String | String ekspresi XPath yang akan diuraikan dan dievaluasi. |
| contextNode | Node | Itu`konteks` adalah simpul konteks untuk evaluasi ekspresi XPath ini. Jika[`IXPathEvaluator`](../) diperoleh dengan melemparkan [`Document`](../../../aspose.svg.dom/document/) maka ini harus dimiliki oleh dokumen yang sama dan harus berupa [`Document`](../../../aspose.svg.dom/document/) ,[`Element`](../../../aspose.svg.dom/element/) ,[`Attr`](../../../aspose.svg.dom/attr/) ,[`Text`](../../../aspose.svg.dom/text/) , [`CDATASection`](../../../aspose.svg.dom/cdatasection/) ,[`Comment`](../../../aspose.svg.dom/comment/) ,[`ProcessingInstruction`](../../../aspose.svg.dom/processinginstruction/) , atauXPathNamespace simpul. Jika simpul konteks adalah a[`Text`](../../../aspose.svg.dom/text/) atau [`CDATASection`](../../../aspose.svg.dom/cdatasection/)maka konteksnya diinterpretasikan sebagai seluruh simpul teks logis seperti yang terlihat oleh XPath, kecuali jika simpul tersebut kosong dalam hal ini mungkin tidak berfungsi sebagai konteks XPath. |
| resolver | IXPathNSResolver | Itu`penyelesai` mengizinkan terjemahan semua awalan, termasuk `xml` awalan namespace, dalam ekspresi XPath ke dalam URI namespace yang sesuai. Jika ini ditentukan sebagai`batal` , setiap awalan namespace dalam ekspresi akan menghasilkan [`DOMException`](../../../aspose.svg.dom/domexception/) dilemparkan dengan kode`NAMESPACE_ERR`. |
| type | XPathResultType | Jika spesifik`jenis` ditentukan, maka hasilnya akan dikembalikan sebagai jenis yang sesuai. Untuk hasil XPath 1.0, ini harus menjadi salah satu nilai dari [`XPathResultType`](../../xpathresulttype/) enum. |
| result | Object | Itu`hasil` menentukan objek hasil tertentu yang dapat digunakan kembali dan dikembalikan oleh metode ini. Jika ini ditentukan sebagai`batal`atau implementasi tidak menggunakan kembali hasil yang ditentukan, objek hasil baru akan dibuat dan dikembalikan. Untuk hasil XPath 1.0 , objek ini akan bertipe[`IXPathResult`](../../ixpathresult/). |

### Nilai Pengembalian

Hasil evaluasi ekspresi XPath. Untuk hasil XPath 1.0, objek ini akan bertipe[`IXPathResult`](../../ixpathresult/).

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | INVALID_EXPRESSION_ERR: Dimunculkan jika ekspresi tidak legal menurut aturan dari[`IXPathEvaluator`](../). |
| [DOMException](../../../aspose.svg.dom/domexception/) | TYPE_ERR: Dibesarkan jika hasilnya tidak dapat dikonversi untuk mengembalikan tipe yang ditentukan. |
| [DOMException](../../../aspose.svg.dom/domexception/) | NAMESPACE_ERR: Dibesarkan jika ekspresi berisi prefiks namespace yang tidak dapat diselesaikan oleh yang ditentukan[`IXPathNSResolver`](../../ixpathnsresolver/). |
| [DOMException](../../../aspose.svg.dom/domexception/) | WRONG_DOCUMENT_ERR: Node berasal dari dokumen yang tidak didukung oleh ini[`IXPathEvaluator`](../). |
| [DOMException](../../../aspose.svg.dom/domexception/) | NOT_SUPPORTED_ERR: Node bukan tipe yang diizinkan sebagai node konteks XPath atau tipe permintaan tidak diizinkan oleh ini[`IXPathEvaluator`](../). |

### Lihat juga

* interface [IXPathResult](../../ixpathresult/)
* class [Node](../../../aspose.svg.dom/node/)
* interface [IXPathNSResolver](../../ixpathnsresolver/)
* enum [XPathResultType](../../xpathresulttype/)
* interface [IXPathEvaluator](../)
* ruang nama [Aspose.Svg.Dom.XPath](../../ixpathevaluator/)
* perakitan [Aspose.SVG](../../../)


