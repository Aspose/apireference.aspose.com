---
title: 设置签名提供者 ID
linktitle: 设置签名提供者 ID
second_title: Aspose.Words for .NET API 参考
description: 了解如何使用 Aspose.Words for .NET 在 Word 文档中设置签名提供程序 ID。
type: docs
weight: 10
url: /zh/net/programming-with-digital-signatures/set-signature-provider-id/
---

在本教程中，我们将引导您完成将“设置签名提供程序 ID”功能与 Aspose.Words for .NET 一起使用的步骤。此功能允许您为 Word 文档中的签名行指定签名提供者 ID。请按照以下步骤操作：

## 第 1 步：加载文档并访问签名行

首先上传包含签名行的文档：

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
Document doc = new Document(dataDir + "Signature line.docx");

SignatureLine signatureLine = ((Shape)doc.FirstSection.Body.GetChild(NodeType.Shape, 0, true)).SignatureLine;
```

## 第 2 步：设置签名选项

创建 SignOptions 类的实例并设置签名选项，包括提供商 ID：

```csharp
SignOptions signOptions = new SignOptions
{
ProviderId = signatureLine.ProviderId,
 SignatureLineId = signatureLine.Id
};
```

## 第 3 步：签署文件

要签署文档，您必须使用 DigitalSignatureUtil 类并指定签名证书：

```csharp
CertificateHolder certHolder = CertificateHolder.Create(dataDir + "morzal.pfx", "aw");

DigitalSignatureUtil.Sign(dataDir + "Digitally signed.docx",
	dataDir + "SignDocuments.SetSignatureProviderId.docx", certHolder, signOptions);
```

请务必为文档、证书和签名文档指定正确的路径。

### 使用 Aspose.Words for .NET 设置签名提供程序 ID 的示例源代码

下面是使用 Aspose.Words for .NET 设置签名提供者 ID 的完整源代码：

```csharp

	//文档目录的路径。
	string dataDir = "YOUR DOCUMENT DIRECTORY";
	Document doc = new Document(dataDir + "Signature line.docx");

	SignatureLine signatureLine =
		((Shape) doc.FirstSection.Body.GetChild(NodeType.Shape, 0, true)).SignatureLine;

	SignOptions signOptions = new SignOptions
	{
		ProviderId = signatureLine.ProviderId, SignatureLineId = signatureLine.Id
	};

	CertificateHolder certHolder = CertificateHolder.Create(dataDir + "morzal.pfx", "aw");

	DigitalSignatureUtil.Sign(dataDir + "Digitally signed.docx",
		dataDir + "SignDocuments.SetSignatureProviderId.docx", certHolder, signOptions);

```

使用 Aspose.Words for .NET 在您的 Word 文档中完成 Signature Provider ID。

