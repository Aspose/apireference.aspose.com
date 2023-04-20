---
title: IXPathEvaluator.CreateNSResolver
second_title: Aspose.SVG untuk Referensi .NET API
description: IXPathEvaluator metode. Menyesuaikan node DOM apa pun untuk menyelesaikan ruang nama sehingga ekspresi XPath dapat dengan mudah dievaluasi relatif terhadap konteks node tempat ekspresi tersebut muncul di dalam dokumen. Adaptor ini berfungsi seperti metode DOM Level 3lookupNamespaceURI pada node dalam menyelesaikan namespaceURI dari awalan yang diberikan menggunakan informasi terkini yang tersedia dalam hierarki node pada saat lookupNamespaceURI dipanggil juga menyelesaikan dengan benar awalan xml implisit.
type: docs
weight: 20
url: /id/net/aspose.svg.dom.xpath/ixpathevaluator/creatensresolver/
---
## IXPathEvaluator.CreateNSResolver method

Menyesuaikan node DOM apa pun untuk menyelesaikan ruang nama sehingga ekspresi XPath dapat dengan mudah dievaluasi relatif terhadap konteks node tempat ekspresi tersebut muncul di dalam dokumen. Adaptor ini berfungsi seperti metode DOM Level 3`lookupNamespaceURI` pada node dalam menyelesaikan namespaceURI dari awalan yang diberikan menggunakan informasi terkini yang tersedia dalam hierarki node pada saat lookupNamespaceURI dipanggil, juga menyelesaikan dengan benar awalan xml implisit.

```csharp
public IXPathNSResolver CreateNSResolver(Node nodeResolver)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| nodeResolver | Node | Node yang akan digunakan sebagai konteks untuk resolusi namespace. |

### Nilai Pengembalian

[`IXPathNSResolver`](../../ixpathnsresolver/) yang menyelesaikan ruang nama sehubungan dengan definisi dalam cakupan untuk node tertentu.

### Lihat juga

* interface [IXPathNSResolver](../../ixpathnsresolver/)
* class [Node](../../../aspose.svg.dom/node/)
* interface [IXPathEvaluator](../)
* ruang nama [Aspose.Svg.Dom.XPath](../../ixpathevaluator/)
* perakitan [Aspose.SVG](../../../)


